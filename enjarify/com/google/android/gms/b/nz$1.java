package com.google.android.gms.b;

import android.os.RemoteException;

final class nz$1
  implements Runnable
{
  nz$1(nw paramnw) {}
  
  public final void run()
  {
    try
    {
      Object localObject = a;
      localObject = c;
      ((od)localObject).c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not destroy mediation adapter.";
        tp.c(str, localRemoteException);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/nz$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */