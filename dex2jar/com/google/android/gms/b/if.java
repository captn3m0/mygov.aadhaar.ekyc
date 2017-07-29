package com.google.android.gms.b;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.a.c;
import com.google.android.gms.a.c.a;

@qi
public final class if
  extends c<iw>
{
  public if()
  {
    super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
  }
  
  public final iv a(Context paramContext, String paramString, oc paramoc)
  {
    try
    {
      a locala = b.a(paramContext);
      paramContext = iv.a.a(((iw)a(paramContext)).a(locala, paramString, paramoc, 10260000));
      return paramContext;
    }
    catch (RemoteException paramContext)
    {
      ul.c("Could not create remote builder for AdLoader.", paramContext);
      return null;
    }
    catch (c.a paramContext)
    {
      for (;;)
      {
        ul.c("Could not create remote builder for AdLoader.", paramContext);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/if.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */