package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.b.kx;
import com.google.android.gms.b.ln;
import com.google.android.gms.b.lr;
import com.google.android.gms.b.tp;

final class s$3
  implements Runnable
{
  s$3(s params, kx paramkx) {}
  
  public final void run()
  {
    try
    {
      Object localObject1 = b;
      localObject1 = f;
      localObject1 = t;
      if (localObject1 != null)
      {
        localObject1 = b;
        localObject1 = f;
        localObject1 = t;
        localObject2 = a;
        ((lr)localObject1).a((ln)localObject2);
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Could not call OnContentAdLoadedListener.onContentAdLoaded().";
        tp.c((String)localObject2, localRemoteException);
      }
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/s$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */