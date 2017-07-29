package com.google.android.gms.b;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.a.c;
import com.google.android.gms.a.c.a;

public final class if
  extends c
{
  public if()
  {
    super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
  }
  
  public final iv a(Context paramContext, String paramString, oc paramoc)
  {
    try
    {
      localObject1 = b.a(paramContext);
      localObject2 = a(paramContext);
      localObject2 = (iw)localObject2;
      int i = 10260000;
      localObject2 = ((iw)localObject2).a((a)localObject1, paramString, paramoc, i);
      localObject2 = iv.a.a((IBinder)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2;
        localObject1 = "Could not create remote builder for AdLoader.";
        ul.c((String)localObject1, localRemoteException);
        Object localObject3 = null;
      }
    }
    catch (c.a locala)
    {
      for (;;)
      {
        Object localObject1 = "Could not create remote builder for AdLoader.";
        ul.c((String)localObject1, locala);
      }
    }
    return (iv)localObject2;
  }
}


/* Location:              com/google/android/gms/b/if.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */