package com.google.android.gms.b;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

final class dj$2
  implements Runnable
{
  dj$2(dj paramdj, AtomicReference paramAtomicReference, String paramString1, String paramString2, String paramString3, boolean paramBoolean) {}
  
  public final void run()
  {
    AtomicReference localAtomicReference1 = a;
    for (;;)
    {
      try
      {
        localObject1 = f;
        localObject1 = b;
        if (localObject1 == null)
        {
          localObject1 = f;
          localObject1 = ((dj)localObject1).u();
          localObject1 = a;
          localObject4 = "Failed to get user properties";
          localObject5 = b;
          localObject5 = cu.a((String)localObject5);
          localObject6 = c;
          str = d;
          ((cu.a)localObject1).a((String)localObject4, localObject5, localObject6, str);
          localObject1 = a;
          localObject4 = Collections.emptyList();
          ((AtomicReference)localObject1).set(localObject4);
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject1;
        boolean bool1;
        boolean bool2;
        Object localObject7;
        Object localObject8;
        localObject4 = f;
        localObject4 = ((dj)localObject4).u();
        localObject4 = a;
        Object localObject5 = "Failed to get user properties";
        Object localObject6 = b;
        localObject6 = cu.a((String)localObject6);
        String str = c;
        ((cu.a)localObject4).a((String)localObject5, localObject6, str, localRemoteException);
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
    bool1 = TextUtils.isEmpty((CharSequence)localObject4);
    if (bool1)
    {
      localObject4 = a;
      localObject5 = c;
      localObject6 = d;
      bool2 = e;
      localObject7 = f;
      localObject7 = ((dj)localObject7).i();
      localObject8 = f;
      localObject8 = ((dj)localObject8).u();
      localObject8 = ((cu)localObject8).x();
      localObject7 = ((cr)localObject7).a((String)localObject8);
      localObject1 = ((cq)localObject1).a((String)localObject5, (String)localObject6, bool2, (ca)localObject7);
      ((AtomicReference)localObject4).set(localObject1);
    }
    for (;;)
    {
      localObject1 = f;
      dj.c((dj)localObject1);
      localObject1 = a;
      localObject1.notify();
      break;
      localObject4 = a;
      localObject5 = b;
      localObject6 = c;
      str = d;
      boolean bool3 = e;
      List localList = ((cq)localObject2).a((String)localObject5, (String)localObject6, str, bool3);
      ((AtomicReference)localObject4).set(localList);
    }
  }
}


/* Location:              com/google/android/gms/b/dj$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */