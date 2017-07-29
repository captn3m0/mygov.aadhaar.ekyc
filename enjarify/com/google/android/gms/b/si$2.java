package com.google.android.gms.b;

import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;

final class si$2
  implements Runnable
{
  si$2(si paramsi, od paramod, ih paramih, sm paramsm) {}
  
  public final void run()
  {
    Object localObject4;
    try
    {
      localObject1 = a;
      Object localObject2 = d;
      localObject2 = a;
      localObject2 = b.a(localObject2);
      localObject4 = b;
      i = 0;
      sm localsm = c;
      Object localObject5 = d;
      localObject5 = c;
      ((od)localObject1).a((a)localObject2, (ih)localObject4, null, localsm, (String)localObject5);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      localObject4 = "Fail to initialize adapter ";
      localObject1 = String.valueOf(d.b);
      int i = ((String)localObject1).length();
      if (i == 0) {
        break label113;
      }
    }
    Object localObject1 = ((String)localObject4).concat((String)localObject1);
    for (;;)
    {
      tp.c((String)localObject1, localRemoteException);
      localObject1 = d;
      Object localObject3 = null;
      ((si)localObject1).a(0);
      break;
      label113:
      localObject1 = new java/lang/String;
      ((String)localObject1).<init>((String)localObject4);
    }
  }
}


/* Location:              com/google/android/gms/b/si$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */