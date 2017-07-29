package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.b.tj;
import com.google.android.gms.common.a.a;

final class i$1$1
  implements ServiceConnection
{
  i$1$1(i.1 param1) {}
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    boolean bool = false;
    Object localObject1 = null;
    b localb = new com/google/android/gms/ads/internal/purchase/b;
    ??? = a.a.getApplicationContext();
    localb.<init>((Context)???, false);
    localb.a(paramIBinder);
    ??? = a.a.getPackageName();
    int i = localb.c((String)???, "inapp");
    tj localtj = w.i();
    if (i == 0) {
      bool = true;
    }
    synchronized (a)
    {
      g = bool;
      a.a();
      a.a(a.a, this);
      a = null;
      return;
    }
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName) {}
}


/* Location:              com/google/android/gms/ads/internal/purchase/i$1$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */