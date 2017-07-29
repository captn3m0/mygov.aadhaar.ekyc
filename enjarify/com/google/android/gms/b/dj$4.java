package com.google.android.gms.b;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

final class dj$4
  implements Runnable
{
  dj$4(dj paramdj, AtomicReference paramAtomicReference, boolean paramBoolean) {}
  
  public final void run()
  {
    localAtomicReference1 = a;
    for (;;)
    {
      try
      {
        localObject1 = c;
        localObject1 = b;
        if (localObject1 == null)
        {
          localObject1 = c;
          localObject1 = ((dj)localObject1).u();
          localObject1 = a;
          localObject4 = "Failed to get user properties";
          ((cu.a)localObject1).a((String)localObject4);
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject1;
        boolean bool;
        localObject4 = c;
        localObject4 = ((dj)localObject4).u();
        localObject4 = a;
        Object localObject5 = "Failed to get user properties";
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
      localObject5 = c;
      localObject5 = ((dj)localObject5).i();
      bool = false;
      localObject5 = ((cr)localObject5).a(null);
      bool = b;
      localObject1 = ((cq)localObject1).a((ca)localObject5, bool);
      ((AtomicReference)localObject4).set(localObject1);
      localObject1 = c;
      dj.c((dj)localObject1);
      localObject1 = a;
      localObject1.notify();
    }
  }
}


/* Location:              com/google/android/gms/b/dj$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */