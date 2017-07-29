package com.google.android.gms.b;

import android.os.RemoteException;

final class mx$7
  implements Runnable
{
  mx$7(mx.a parama, my parammy) {}
  
  public final void run()
  {
    try
    {
      mx.a locala = a;
      localObject = b;
      locala.a((my)localObject);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject = "Could not propagate interstitial ad event.";
        tp.c((String)localObject, localRemoteException);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/mx$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */