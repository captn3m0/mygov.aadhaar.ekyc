package com.google.android.gms.b;

import android.os.RemoteException;

final class jn$a$1
  implements Runnable
{
  jn$a$1(jn.a parama) {}
  
  public final void run()
  {
    Object localObject = jn.a(a.a);
    if (localObject != null) {}
    try
    {
      localObject = a;
      localObject = a;
      localObject = jn.a((jn)localObject);
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


/* Location:              com/google/android/gms/b/jn$a$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */