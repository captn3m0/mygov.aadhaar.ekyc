package com.google.android.gms.b;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.w;

final class rh$5
  implements Runnable
{
  rh$5(rh paramrh, qo paramqo, qy paramqy) {}
  
  public final void run()
  {
    localObject1 = null;
    try
    {
      localObject2 = c;
      localObject4 = a;
      localObject2 = ((rh)localObject2).a((qo)localObject4);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        try
        {
          Object localObject2;
          localObject1 = b;
          ((qy)localObject1).a((qr)localObject2);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          Object localObject4;
          String str;
          Object localObject3;
          localObject1 = "Fail to forward ad response.";
          tp.c((String)localObject1, localRemoteException);
          continue;
        }
        localException = localException;
        localObject4 = w.i();
        str = "AdRequestServiceImpl.loadAdAsync";
        ((tj)localObject4).a(localException, str);
        localObject4 = "Could not fetch ad response due to an Exception.";
        tp.c((String)localObject4, localException);
        localObject3 = null;
      }
    }
    if (localObject2 == null)
    {
      localObject2 = new com/google/android/gms/b/qr;
      localObject1 = null;
      ((qr)localObject2).<init>(0);
    }
  }
}


/* Location:              com/google/android/gms/b/rh$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */