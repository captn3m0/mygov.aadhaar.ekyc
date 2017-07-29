package com.google.android.gms.b;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.a;

final class dj$11
  implements Runnable
{
  dj$11(dj paramdj, boolean paramBoolean, cd paramcd1, cd paramcd2) {}
  
  public final void run()
  {
    Object localObject1 = e;
    Object localObject2 = b;
    if (localObject2 == null)
    {
      localObject1 = e.u().a;
      localObject2 = "Discarding data. Failed to send conditional user property to service";
      ((cu.a)localObject1).a((String)localObject2);
      return;
    }
    boolean bool = a;
    Object localObject3;
    if (bool)
    {
      localObject3 = e;
      bool = b;
      if (bool)
      {
        bool = false;
        localObject1 = null;
        label62:
        ((dj)localObject3).a((cq)localObject2, (a)localObject1);
      }
    }
    for (;;)
    {
      localObject1 = e;
      dj.c((dj)localObject1);
      break;
      localObject1 = c;
      break label62;
      try
      {
        localObject1 = d;
        localObject1 = b;
        bool = TextUtils.isEmpty((CharSequence)localObject1);
        if (!bool) {
          break label193;
        }
        localObject1 = c;
        localObject3 = e;
        localObject3 = ((dj)localObject3).i();
        Object localObject4 = e;
        localObject4 = ((dj)localObject4).u();
        localObject4 = ((cu)localObject4).x();
        localObject3 = ((cr)localObject3).a((String)localObject4);
        ((cq)localObject2).a((cd)localObject1, (ca)localObject3);
      }
      catch (RemoteException localRemoteException)
      {
        localObject2 = e.u().a;
        localObject3 = "Failed to send conditional user property to the service";
        ((cu.a)localObject2).a((String)localObject3, localRemoteException);
      }
      continue;
      label193:
      cd localcd = c;
      ((cq)localObject2).a(localcd);
    }
  }
}


/* Location:              com/google/android/gms/b/dj$11.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */