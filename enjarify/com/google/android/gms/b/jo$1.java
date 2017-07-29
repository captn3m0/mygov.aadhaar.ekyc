package com.google.android.gms.b;

import android.os.RemoteException;

final class jo$1
  implements Runnable
{
  jo$1(jo paramjo) {}
  
  public final void run()
  {
    Object localObject = jo.a(a);
    if (localObject != null) {}
    try
    {
      localObject = a;
      localObject = jo.a((jo)localObject);
      int i = 1;
      ((it)localObject).a(i);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not notify onAdFailedToLoad event.";
        ul.c(str, localRemoteException);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/jo$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */