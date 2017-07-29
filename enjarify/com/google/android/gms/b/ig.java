package com.google.android.gms.b;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.a.c;
import com.google.android.gms.a.c.a;

public final class ig
  extends c
{
  public ig()
  {
    super("com.google.android.gms.ads.AdManagerCreatorImpl");
  }
  
  public final ix a(Context paramContext, il paramil, String paramString, oc paramoc, int paramInt)
  {
    try
    {
      localObject1 = b.a(paramContext);
      localObject2 = a(paramContext);
      localObject2 = (iy)localObject2;
      int i = 10260000;
      localObject2 = ((iy)localObject2).a((a)localObject1, paramil, paramString, paramoc, i, paramInt);
      localObject2 = ix.a.a((IBinder)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2;
        Object localObject1 = "Could not create remote AdManager.";
        ul.a((String)localObject1, localRemoteException);
        Object localObject3 = null;
      }
    }
    catch (c.a locala)
    {
      for (;;) {}
    }
    return (ix)localObject2;
  }
}


/* Location:              com/google/android/gms/b/ig.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */