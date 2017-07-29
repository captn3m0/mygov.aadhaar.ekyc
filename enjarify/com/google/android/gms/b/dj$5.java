package com.google.android.gms.b;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

final class dj$5
  implements Runnable
{
  dj$5(dj paramdj, AtomicReference paramAtomicReference) {}
  
  public final void run()
  {
    localAtomicReference1 = a;
    for (;;)
    {
      try
      {
        localObject1 = b;
        localObject1 = b;
        if (localObject1 == null)
        {
          localObject1 = b;
          localObject1 = ((dj)localObject1).u();
          localObject1 = a;
          localObject4 = "Failed to get app instance id";
          ((cu.a)localObject1).a((String)localObject4);
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject1;
        localObject4 = b;
        localObject4 = ((dj)localObject4).u();
        localObject4 = a;
        Object localObject5 = "Failed to get app instance id";
        ((cu.a)localObject4).a((String)localObject5, localRemoteException);
        AtomicReference localAtomicReference2 = a;
        localAtomicReference2.notify();
        continue;
      }
      finally
      {
        Object localObject4 = a;
        localObject4.notify();
      }
      try
      {
        localObject1 = a;
        localObject1.notify();
        return;
      }
      finally {}
      localObject4 = a;
      localObject5 = b;
      localObject5 = ((dj)localObject5).i();
      localObject5 = ((cr)localObject5).a(null);
      localObject1 = ((cq)localObject1).c((ca)localObject5);
      ((AtomicReference)localObject4).set(localObject1);
      localObject1 = b;
      dj.c((dj)localObject1);
      localObject1 = a;
      localObject1.notify();
    }
  }
}


/* Location:              com/google/android/gms/b/dj$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */