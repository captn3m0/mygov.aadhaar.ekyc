package com.google.android.gms.b;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.a.c;
import com.google.android.gms.a.c.a;

public final class pa
  extends c
{
  public pa()
  {
    super("com.google.android.gms.ads.AdOverlayCreatorImpl");
  }
  
  public final pb a(Activity paramActivity)
  {
    try
    {
      localObject1 = b.a(paramActivity);
      localObject2 = a(paramActivity);
      localObject2 = (pd)localObject2;
      localObject2 = ((pd)localObject2).a((a)localObject1);
      localObject2 = pb.a.a((IBinder)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2;
        localObject1 = "Could not create remote AdOverlay.";
        ul.c((String)localObject1, localRemoteException);
        Object localObject3 = null;
      }
    }
    catch (c.a locala)
    {
      for (;;)
      {
        Object localObject1 = "Could not create remote AdOverlay.";
        ul.c((String)localObject1, locala);
        Object localObject4 = null;
      }
    }
    return (pb)localObject2;
  }
}


/* Location:              com/google/android/gms/b/pa.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */