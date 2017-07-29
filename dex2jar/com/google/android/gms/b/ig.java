package com.google.android.gms.b;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.a.c;
import com.google.android.gms.a.c.a;

@qi
public final class ig
  extends c<iy>
{
  public ig()
  {
    super("com.google.android.gms.ads.AdManagerCreatorImpl");
  }
  
  public final ix a(Context paramContext, il paramil, String paramString, oc paramoc, int paramInt)
  {
    try
    {
      a locala = b.a(paramContext);
      paramContext = ix.a.a(((iy)a(paramContext)).a(locala, paramil, paramString, paramoc, 10260000, paramInt));
      return paramContext;
    }
    catch (RemoteException paramContext)
    {
      ul.a("Could not create remote AdManager.", paramContext);
      return null;
    }
    catch (c.a paramContext)
    {
      for (;;) {}
    }
  }
}


/* Location:              com/google/android/gms/b/ig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */