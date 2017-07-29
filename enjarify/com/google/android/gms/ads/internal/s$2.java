package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.b.kw;
import com.google.android.gms.b.ll;
import com.google.android.gms.b.lq;
import com.google.android.gms.b.tp;

final class s$2
  implements Runnable
{
  s$2(s params, kw paramkw) {}
  
  public final void run()
  {
    try
    {
      Object localObject1 = b;
      localObject1 = f;
      localObject1 = s;
      if (localObject1 != null)
      {
        localObject1 = b;
        localObject1 = f;
        localObject1 = s;
        localObject2 = a;
        ((lq)localObject1).a((ll)localObject2);
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().";
        tp.c((String)localObject2, localRemoteException);
      }
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/s$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */