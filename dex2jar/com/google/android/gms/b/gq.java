package com.google.android.gms.b;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.a.c;
import com.google.android.gms.a.c.a;
import com.google.android.gms.common.m;

public final class gq
  extends c<gs>
{
  private static final gq a = new gq();
  
  private gq()
  {
    super("com.google.android.gms.ads.adshield.AdShieldCreatorImpl");
  }
  
  public static gr a(String paramString, Context paramContext)
  {
    Object localObject;
    if (m.b().a(paramContext) == 0)
    {
      gr localgr = a.b(paramString, paramContext);
      localObject = localgr;
      if (localgr != null) {}
    }
    else
    {
      localObject = new gp(paramString, paramContext);
    }
    return (gr)localObject;
  }
  
  private gr b(String paramString, Context paramContext)
  {
    a locala = b.a(paramContext);
    try
    {
      paramString = gr.a.a(((gs)a(paramContext)).b(paramString, locala));
      return paramString;
    }
    catch (RemoteException paramString)
    {
      return null;
    }
    catch (c.a paramString)
    {
      for (;;) {}
    }
  }
}


/* Location:              com/google/android/gms/b/gq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */