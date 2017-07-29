package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.b.pl;
import com.google.android.gms.b.to;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import com.google.android.gms.common.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class c
  extends to
  implements ServiceConnection
{
  private final Object a;
  private boolean b;
  private Context c;
  private pl d;
  private b e;
  private h f;
  private List g;
  private k h;
  
  public c(Context paramContext, pl parampl, k paramk)
  {
    this(paramContext, parampl, paramk, localb, localh);
  }
  
  private c(Context paramContext, pl parampl, k paramk, b paramb, h paramh)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
    b = false;
    g = null;
    c = paramContext;
    d = parampl;
    h = paramk;
    e = paramb;
    f = paramh;
    localObject = f.b();
    g = ((List)localObject);
  }
  
  private void a(long paramLong)
  {
    boolean bool;
    do
    {
      bool = b(paramLong);
      if (!bool)
      {
        String str = "Timeout waiting for pending transaction to be processed.";
        tp.a(str);
      }
      bool = b;
    } while (!bool);
  }
  
  private boolean b(long paramLong)
  {
    long l1 = SystemClock.elapsedRealtime() - paramLong;
    long l2 = 60000L - l1;
    l1 = 0L;
    boolean bool1 = l2 < l1;
    boolean bool2;
    if (!bool1)
    {
      bool2 = false;
      Object localObject1 = null;
    }
    for (;;)
    {
      return bool2;
      try
      {
        Object localObject2 = a;
        localObject2.wait(l2);
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          String str = "waitWithTimeout_lock interrupted";
          tp.e(str);
        }
      }
      bool2 = true;
    }
  }
  
  public final void a()
  {
    synchronized (a)
    {
      Object localObject2 = new android/content/Intent;
      Object localObject4 = "com.android.vending.billing.InAppBillingService.BIND";
      ((Intent)localObject2).<init>((String)localObject4);
      localObject4 = "com.android.vending";
      ((Intent)localObject2).setPackage((String)localObject4);
      a.a();
      localObject4 = c;
      int i = 1;
      a.b((Context)localObject4, (Intent)localObject2, this, i);
      long l = SystemClock.elapsedRealtime();
      a(l);
      a.a();
      localObject2 = c;
      a.a((Context)localObject2, this);
      localObject2 = e;
      localObject4 = null;
      a = null;
      return;
    }
  }
  
  public final void c_()
  {
    synchronized (a)
    {
      a.a();
      Object localObject2 = c;
      a.a((Context)localObject2, this);
      localObject2 = e;
      a = null;
      return;
    }
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    HashMap localHashMap;
    Object localObject5;
    Object localObject6;
    synchronized (a)
    {
      Object localObject2 = e;
      ((b)localObject2).a(paramIBinder);
      localObject2 = g;
      bool1 = ((List)localObject2).isEmpty();
      if (bool1) {
        break label579;
      }
      localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      localObject2 = g;
      localObject5 = ((List)localObject2).iterator();
      bool1 = ((Iterator)localObject5).hasNext();
      if (bool1)
      {
        localObject2 = ((Iterator)localObject5).next();
        localObject2 = (f)localObject2;
        localObject6 = c;
        localHashMap.put(localObject6, localObject2);
      }
    }
    boolean bool1 = false;
    String str1;
    for (Object localObject4 = null;; localObject4 = str1)
    {
      localObject5 = e;
      localObject6 = c;
      localObject6 = ((Context)localObject6).getPackageName();
      localObject4 = ((b)localObject5).b((String)localObject6, (String)localObject4);
      if (localObject4 != null)
      {
        w.s();
        int k = i.a((Bundle)localObject4);
        if (k == 0)
        {
          localObject5 = "INAPP_PURCHASE_ITEM_LIST";
          ArrayList localArrayList1 = ((Bundle)localObject4).getStringArrayList((String)localObject5);
          localObject5 = "INAPP_PURCHASE_DATA_LIST";
          ArrayList localArrayList2 = ((Bundle)localObject4).getStringArrayList((String)localObject5);
          localObject5 = "INAPP_DATA_SIGNATURE_LIST";
          ArrayList localArrayList3 = ((Bundle)localObject4).getStringArrayList((String)localObject5);
          localObject5 = "INAPP_CONTINUATION_TOKEN";
          str1 = ((Bundle)localObject4).getString((String)localObject5);
          bool1 = false;
          localObject4 = null;
          int j;
          for (int m = 0;; m = j)
          {
            int i = localArrayList1.size();
            if (m >= i) {
              break;
            }
            localObject4 = localArrayList1.get(m);
            boolean bool2 = localHashMap.containsKey(localObject4);
            if (bool2)
            {
              localObject4 = localArrayList1.get(m);
              localObject4 = (String)localObject4;
              localObject5 = localArrayList2.get(m);
              localObject5 = (String)localObject5;
              localObject6 = localArrayList3.get(m);
              localObject6 = (String)localObject6;
              Object localObject7 = localHashMap.get(localObject4);
              localObject7 = (f)localObject7;
              w.s();
              Object localObject8 = i.a((String)localObject5);
              String str2 = b;
              boolean bool4 = str2.equals(localObject8);
              if (bool4)
              {
                localObject8 = new android/content/Intent;
                ((Intent)localObject8).<init>();
                w.s();
                str2 = "RESPONSE_CODE";
                ((Intent)localObject8).putExtra(str2, 0);
                w.s();
                str2 = "INAPP_PURCHASE_DATA";
                ((Intent)localObject8).putExtra(str2, (String)localObject5);
                w.s();
                localObject5 = "INAPP_DATA_SIGNATURE";
                ((Intent)localObject8).putExtra((String)localObject5, (String)localObject6);
                localObject5 = tt.a;
                localObject6 = new com/google/android/gms/ads/internal/purchase/c$1;
                ((c.1)localObject6).<init>(this, (f)localObject7, (Intent)localObject8);
                ((Handler)localObject5).post((Runnable)localObject6);
                localHashMap.remove(localObject4);
              }
            }
            j = m + 1;
          }
          if (str1 != null)
          {
            bool3 = localHashMap.isEmpty();
            if (!bool3) {
              continue;
            }
          }
        }
      }
      localObject4 = localHashMap.keySet();
      localObject5 = ((Set)localObject4).iterator();
      for (;;)
      {
        bool3 = ((Iterator)localObject5).hasNext();
        if (!bool3) {
          break;
        }
        localObject4 = ((Iterator)localObject5).next();
        localObject4 = (String)localObject4;
        localObject6 = f;
        localObject4 = localHashMap.get(localObject4);
        localObject4 = (f)localObject4;
        ((h)localObject6).a((f)localObject4);
      }
      label579:
      boolean bool3 = true;
      b = bool3;
      localObject4 = a;
      localObject4.notify();
      return;
    }
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    tp.d("In-app billing service disconnected.");
    e.a = null;
  }
}


/* Location:              com/google/android/gms/ads/internal/purchase/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */