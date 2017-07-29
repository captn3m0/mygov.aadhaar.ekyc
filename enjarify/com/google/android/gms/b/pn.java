package com.google.android.gms.b;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.a.c;
import com.google.android.gms.a.c.a;

public final class pn
  extends c
{
  public pn()
  {
    super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
  }
  
  public final pi a(Activity paramActivity)
  {
    try
    {
      localObject1 = b.a(paramActivity);
      localObject2 = a(paramActivity);
      localObject2 = (pj)localObject2;
      localObject2 = ((pj)localObject2).a((a)localObject1);
      localObject2 = pi.a.a((IBinder)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2;
        localObject1 = "Could not create remote InAppPurchaseManager.";
        ul.c((String)localObject1, localRemoteException);
        Object localObject3 = null;
      }
    }
    catch (c.a locala)
    {
      for (;;)
      {
        Object localObject1 = "Could not create remote InAppPurchaseManager.";
        ul.c((String)localObject1, locala);
        Object localObject4 = null;
      }
    }
    return (pi)localObject2;
  }
}


/* Location:              com/google/android/gms/b/pn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */