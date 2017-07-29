package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.b.pl;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.to;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import com.google.android.gms.common.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@qi
public final class c
  extends to
  implements ServiceConnection
{
  private final Object a = new Object();
  private boolean b = false;
  private Context c;
  private pl d;
  private b e;
  private h f;
  private List<f> g = null;
  private k h;
  
  public c(Context paramContext, pl parampl, k paramk)
  {
    this(paramContext, parampl, paramk, new b(paramContext), h.a(paramContext.getApplicationContext()));
  }
  
  private c(Context paramContext, pl parampl, k paramk, b paramb, h paramh)
  {
    c = paramContext;
    d = parampl;
    h = paramk;
    e = paramb;
    f = paramh;
    g = f.b();
  }
  
  private void a(long paramLong)
  {
    do
    {
      if (!b(paramLong)) {
        tp.a("Timeout waiting for pending transaction to be processed.");
      }
    } while (!b);
  }
  
  private boolean b(long paramLong)
  {
    paramLong = 60000L - (SystemClock.elapsedRealtime() - paramLong);
    if (paramLong <= 0L) {
      return false;
    }
    try
    {
      a.wait(paramLong);
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        tp.e("waitWithTimeout_lock interrupted");
      }
    }
  }
  
  public final void a()
  {
    synchronized (a)
    {
      Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
      localIntent.setPackage("com.android.vending");
      a.a();
      a.b(c, localIntent, this, 1);
      a(SystemClock.elapsedRealtime());
      a.a();
      a.a(c, this);
      e.a = null;
      return;
    }
  }
  
  public final void c_()
  {
    synchronized (a)
    {
      a.a();
      a.a(c, this);
      e.a = null;
      return;
    }
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    Object localObject2;
    synchronized (a)
    {
      e.a(paramIBinder);
      if (g.isEmpty()) {
        break label383;
      }
      paramIBinder = new HashMap();
      paramComponentName = g.iterator();
      if (paramComponentName.hasNext())
      {
        localObject2 = (f)paramComponentName.next();
        paramIBinder.put(c, localObject2);
      }
    }
    paramComponentName = null;
    paramComponentName = e.b(c.getPackageName(), paramComponentName);
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    int i;
    if (paramComponentName != null)
    {
      w.s();
      if (i.a(paramComponentName) == 0)
      {
        localObject2 = paramComponentName.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        localArrayList1 = paramComponentName.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        localArrayList2 = paramComponentName.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        paramComponentName = paramComponentName.getString("INAPP_CONTINUATION_TOKEN");
        i = 0;
      }
    }
    for (;;)
    {
      if (i < ((ArrayList)localObject2).size())
      {
        if (paramIBinder.containsKey(((ArrayList)localObject2).get(i)))
        {
          String str1 = (String)((ArrayList)localObject2).get(i);
          String str2 = (String)localArrayList1.get(i);
          String str3 = (String)localArrayList2.get(i);
          final f localf = (f)paramIBinder.get(str1);
          w.s();
          final Object localObject3 = i.a(str2);
          if (b.equals(localObject3))
          {
            localObject3 = new Intent();
            w.s();
            ((Intent)localObject3).putExtra("RESPONSE_CODE", 0);
            w.s();
            ((Intent)localObject3).putExtra("INAPP_PURCHASE_DATA", str2);
            w.s();
            ((Intent)localObject3).putExtra("INAPP_DATA_SIGNATURE", str3);
            tt.a.post(new Runnable()
            {
              public final void run()
              {
                try
                {
                  if (c.a(c.this).a(localfb, localObject3))
                  {
                    c.c(c.this).a(new g(c.b(c.this), localfc, true, -1, localObject3, localf));
                    return;
                  }
                  c.c(c.this).a(new g(c.b(c.this), localfc, false, -1, localObject3, localf));
                  return;
                }
                catch (RemoteException localRemoteException)
                {
                  tp.e("Fail to verify and dispatch pending transaction");
                }
              }
            });
            paramIBinder.remove(str1);
          }
        }
      }
      else
      {
        if ((paramComponentName == null) || (paramIBinder.isEmpty()))
        {
          paramComponentName = paramIBinder.keySet().iterator();
          while (paramComponentName.hasNext())
          {
            localObject2 = (String)paramComponentName.next();
            f.a((f)paramIBinder.get(localObject2));
          }
          label383:
          b = true;
          a.notify();
          return;
        }
        break;
      }
      i += 1;
    }
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    tp.d("In-app billing service disconnected.");
    e.a = null;
  }
}


/* Location:              com/google/android/gms/ads/internal/purchase/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */