package com.google.android.gms.b;

import android.os.RemoteException;

final class dj$9
  implements Runnable
{
  dj$9(dj paramdj) {}
  
  public final void run()
  {
    Object localObject1 = a.b;
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = a.u().a;
      localObject2 = "Failed to send measurementEnabled to service";
      ((cu.a)localObject1).a((String)localObject2);
    }
    for (;;)
    {
      return;
      try
      {
        localObject2 = a;
        localObject2 = ((dj)localObject2).i();
        localObject3 = a;
        localObject3 = ((dj)localObject3).u();
        localObject3 = ((cu)localObject3).x();
        localObject2 = ((cr)localObject2).a((String)localObject3);
        ((cq)localObject1).b((ca)localObject2);
        localObject1 = a;
        dj.c((dj)localObject1);
      }
      catch (RemoteException localRemoteException)
      {
        localObject2 = a.u().a;
        Object localObject3 = "Failed to send measurementEnabled to the service";
        ((cu.a)localObject2).a((String)localObject3, localRemoteException);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/dj$9.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */