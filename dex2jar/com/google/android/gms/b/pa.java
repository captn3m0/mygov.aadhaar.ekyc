package com.google.android.gms.b;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.a.c;
import com.google.android.gms.a.c.a;

@qi
public final class pa
  extends c<pd>
{
  public pa()
  {
    super("com.google.android.gms.ads.AdOverlayCreatorImpl");
  }
  
  public final pb a(Activity paramActivity)
  {
    try
    {
      a locala = b.a(paramActivity);
      paramActivity = pb.a.a(((pd)a(paramActivity)).a(locala));
      return paramActivity;
    }
    catch (RemoteException paramActivity)
    {
      ul.c("Could not create remote AdOverlay.", paramActivity);
      return null;
    }
    catch (c.a paramActivity)
    {
      ul.c("Could not create remote AdOverlay.", paramActivity);
    }
    return null;
  }
}


/* Location:              com/google/android/gms/b/pa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */