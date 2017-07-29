package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.b.pk.a;
import com.google.android.gms.b.tp;
import com.google.android.gms.common.a.a;

public final class g
  extends pk.a
  implements ServiceConnection
{
  b a;
  private boolean b = false;
  private Context c;
  private int d;
  private Intent e;
  private f f;
  private String g;
  
  public g(Context paramContext, String paramString, boolean paramBoolean, int paramInt, Intent paramIntent, f paramf)
  {
    g = paramString;
    d = paramInt;
    e = paramIntent;
    b = paramBoolean;
    c = paramContext;
    f = paramf;
  }
  
  public final boolean a()
  {
    return b;
  }
  
  public final String b()
  {
    return g;
  }
  
  public final Intent c()
  {
    return e;
  }
  
  public final int d()
  {
    return d;
  }
  
  public final void e()
  {
    w.s();
    Object localObject = e;
    int i = i.a((Intent)localObject);
    int j = d;
    int k = -1;
    if ((j != k) || (i != 0)) {}
    for (;;)
    {
      return;
      localObject = new com/google/android/gms/ads/internal/purchase/b;
      Context localContext = c;
      ((b)localObject).<init>(localContext);
      a = ((b)localObject);
      localObject = new android/content/Intent;
      ((Intent)localObject).<init>("com.android.vending.billing.InAppBillingService.BIND");
      ((Intent)localObject).setPackage("com.android.vending");
      a.a();
      localContext = c;
      k = 1;
      a.b(localContext, (Intent)localObject, this, k);
    }
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    tp.d("In-app billing service connected.");
    a.a(paramIBinder);
    w.s();
    Object localObject1 = i.b(e);
    w.s();
    localObject1 = i.b((String)localObject1);
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      Object localObject2 = a;
      String str = c.getPackageName();
      int i = ((b)localObject2).a(str, (String)localObject1);
      if (i == 0)
      {
        localObject1 = h.a(c);
        localObject2 = f;
        ((h)localObject1).a((f)localObject2);
      }
      a.a();
      a.a(c, this);
      localObject1 = a;
      localObject2 = null;
      a = null;
    }
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    tp.d("In-app billing service disconnected.");
    a.a = null;
  }
}


/* Location:              com/google/android/gms/ads/internal/purchase/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */