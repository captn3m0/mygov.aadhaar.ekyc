package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.b.pk.a;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.tp;
import com.google.android.gms.common.a.a;

@qi
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
    int i = i.a(e);
    if ((d != -1) || (i != 0)) {
      return;
    }
    a = new b(c);
    Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
    localIntent.setPackage("com.android.vending");
    a.a();
    a.b(c, localIntent, this, 1);
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    tp.d("In-app billing service connected.");
    a.a(paramIBinder);
    w.s();
    paramComponentName = i.b(e);
    w.s();
    paramComponentName = i.b(paramComponentName);
    if (paramComponentName == null) {
      return;
    }
    if (a.a(c.getPackageName(), paramComponentName) == 0) {
      h.a(c).a(f);
    }
    a.a();
    a.a(c, this);
    a.a = null;
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    tp.d("In-app billing service disconnected.");
    a.a = null;
  }
}


/* Location:              com/google/android/gms/ads/internal/purchase/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */