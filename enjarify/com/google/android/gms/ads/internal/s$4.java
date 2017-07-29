package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.support.v4.g.k;
import com.google.android.gms.b.ky;
import com.google.android.gms.b.lp;
import com.google.android.gms.b.lt;
import com.google.android.gms.b.tg;
import com.google.android.gms.b.tp;

final class s$4
  implements Runnable
{
  s$4(s params, String paramString, tg paramtg) {}
  
  public final void run()
  {
    try
    {
      Object localObject1 = c;
      localObject1 = f;
      localObject1 = v;
      localObject2 = a;
      localObject1 = ((k)localObject1).get(localObject2);
      localObject1 = (lt)localObject1;
      localObject2 = b;
      localObject2 = E;
      localObject2 = (ky)localObject2;
      ((lt)localObject1).a((lp)localObject2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().";
        tp.c((String)localObject2, localRemoteException);
      }
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/s$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */