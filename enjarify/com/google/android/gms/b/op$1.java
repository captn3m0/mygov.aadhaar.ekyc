package com.google.android.gms.b;

import android.os.RemoteException;
import com.google.ads.a.a;

final class op$1
  implements Runnable
{
  op$1(op paramop, a.a parama) {}
  
  public final void run()
  {
    try
    {
      Object localObject1 = b;
      localObject1 = a;
      localObject2 = a;
      int i = oq.a((a.a)localObject2);
      ((oe)localObject1).a(i);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Could not call onAdFailedToLoad.";
        ul.c((String)localObject2, localRemoteException);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/op$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */