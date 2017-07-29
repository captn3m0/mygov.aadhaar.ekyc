package com.google.android.gms.b;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.b.b.a;

public final class li
  extends b.a
{
  private final lh a;
  private final Drawable b;
  private final Uri c;
  private final double d;
  
  public li(lh paramlh)
  {
    a = paramlh;
    try
    {
      localObject1 = a;
      localObject1 = ((lh)localObject1).a();
      if (localObject1 == null) {
        break label97;
      }
      localObject1 = b.a((a)localObject1);
      localObject1 = (Drawable)localObject1;
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        Object localObject1;
        localObject3 = "Failed to get drawable.";
        ul.b((String)localObject3, localRemoteException1);
        localObject2 = null;
      }
    }
    b = ((Drawable)localObject1);
    try
    {
      localObject1 = a;
      localUri = ((lh)localObject1).b();
    }
    catch (RemoteException localRemoteException2)
    {
      for (;;)
      {
        double d1;
        localObject3 = "Failed to get uri.";
        ul.b((String)localObject3, localRemoteException2);
      }
    }
    c = localUri;
    d1 = 1.0D;
    try
    {
      localObject3 = a;
      d1 = ((lh)localObject3).c();
    }
    catch (RemoteException localRemoteException3)
    {
      for (;;)
      {
        Object localObject3;
        Object localObject2;
        String str = "Failed to get scale.";
        ul.b(str, localRemoteException3);
      }
    }
    d = d1;
  }
  
  public final Drawable a()
  {
    return b;
  }
  
  public final Uri b()
  {
    return c;
  }
  
  public final double c()
  {
    return d;
  }
}


/* Location:              com/google/android/gms/b/li.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */