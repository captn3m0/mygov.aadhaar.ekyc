package com.google.android.gms.b;

import android.os.Handler;
import android.os.RemoteException;
import com.google.ads.a.a;
import com.google.ads.mediation.e;
import com.google.ads.mediation.g;
import com.google.ads.mediation.h;
import com.google.ads.mediation.i;

@qi
public final class op<NETWORK_EXTRAS extends i, SERVER_PARAMETERS extends h>
  implements e, g
{
  final oe a;
  
  public op(oe paramoe)
  {
    a = paramoe;
  }
  
  public final void a(final a.a parama)
  {
    String str = String.valueOf(parama);
    ul.b(String.valueOf(str).length() + 47 + "Adapter called onFailedToReceiveAd with error. " + str);
    ip.a();
    if (!uk.b())
    {
      ul.e("onFailedToReceiveAd must be called on the main UI thread.");
      uk.a.post(new Runnable()
      {
        public final void run()
        {
          try
          {
            a.a(oq.a(parama));
            return;
          }
          catch (RemoteException localRemoteException)
          {
            ul.c("Could not call onAdFailedToLoad.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      a.a(oq.a(parama));
      return;
    }
    catch (RemoteException parama)
    {
      ul.c("Could not call onAdFailedToLoad.", parama);
    }
  }
  
  public final void b(final a.a parama)
  {
    String str = String.valueOf(parama);
    ul.b(String.valueOf(str).length() + 47 + "Adapter called onFailedToReceiveAd with error " + str + ".");
    ip.a();
    if (!uk.b())
    {
      ul.e("onFailedToReceiveAd must be called on the main UI thread.");
      uk.a.post(new Runnable()
      {
        public final void run()
        {
          try
          {
            a.a(oq.a(parama));
            return;
          }
          catch (RemoteException localRemoteException)
          {
            ul.c("Could not call onAdFailedToLoad.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      a.a(oq.a(parama));
      return;
    }
    catch (RemoteException parama)
    {
      ul.c("Could not call onAdFailedToLoad.", parama);
    }
  }
}


/* Location:              com/google/android/gms/b/op.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */