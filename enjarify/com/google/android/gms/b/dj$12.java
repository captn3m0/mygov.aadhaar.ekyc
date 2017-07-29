package com.google.android.gms.b;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

final class dj$12
  implements Runnable
{
  dj$12(dj paramdj, AtomicReference paramAtomicReference, String paramString1, String paramString2, String paramString3) {}
  
  public final void run()
  {
    AtomicReference localAtomicReference1 = a;
    for (;;)
    {
      try
      {
        localObject1 = e;
        localObject1 = b;
        if (localObject1 == null)
        {
          localObject1 = e;
          localObject1 = ((dj)localObject1).u();
          localObject1 = a;
          localObject4 = "Failed to get conditional properties";
          localObject5 = b;
          localObject5 = cu.a((String)localObject5);
          localObject6 = c;
          localObject7 = d;
          ((cu.a)localObject1).a((String)localObject4, localObject5, localObject6, localObject7);
          localObject1 = a;
          localObject4 = Collections.emptyList();
          ((AtomicReference)localObject1).set(localObject4);
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject1;
        boolean bool;
        Object localObject8;
        localObject4 = e;
        localObject4 = ((dj)localObject4).u();
        localObject4 = a;
        Object localObject5 = "Failed to get conditional properties";
        Object localObject6 = b;
        localObject6 = cu.a((String)localObject6);
        Object localObject7 = c;
        ((cu.a)localObject4).a((String)localObject5, localObject6, localObject7, localRemoteException);
        AtomicReference localAtomicReference2 = a;
        localObject4 = Collections.emptyList();
        localAtomicReference2.set(localObject4);
        localAtomicReference2 = a;
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
    }
    localObject4 = b;
    bool = TextUtils.isEmpty((CharSequence)localObject4);
    if (bool)
    {
      localObject4 = a;
      localObject5 = c;
      localObject6 = d;
      localObject7 = e;
      localObject7 = ((dj)localObject7).i();
      localObject8 = e;
      localObject8 = ((dj)localObject8).u();
      localObject8 = ((cu)localObject8).x();
      localObject7 = ((cr)localObject7).a((String)localObject8);
      localObject1 = ((cq)localObject1).a((String)localObject5, (String)localObject6, (ca)localObject7);
      ((AtomicReference)localObject4).set(localObject1);
    }
    for (;;)
    {
      localObject1 = e;
      dj.c((dj)localObject1);
      localObject1 = a;
      localObject1.notify();
      break;
      localObject4 = a;
      localObject5 = b;
      localObject6 = c;
      localObject7 = d;
      List localList = ((cq)localObject2).a((String)localObject5, (String)localObject6, (String)localObject7);
      ((AtomicReference)localObject4).set(localList);
    }
  }
}


/* Location:              com/google/android/gms/b/dj$12.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */