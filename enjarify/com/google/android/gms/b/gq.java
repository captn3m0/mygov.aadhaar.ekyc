package com.google.android.gms.b;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.a.c;
import com.google.android.gms.a.c.a;
import com.google.android.gms.common.m;

public final class gq
  extends c
{
  private static final gq a;
  
  static
  {
    gq localgq = new com/google/android/gms/b/gq;
    localgq.<init>();
    a = localgq;
  }
  
  private gq()
  {
    super("com.google.android.gms.ads.adshield.AdShieldCreatorImpl");
  }
  
  public static gr a(String paramString, Context paramContext)
  {
    Object localObject = m.b();
    int i = ((m)localObject).a(paramContext);
    if (i == 0)
    {
      localObject = a.b(paramString, paramContext);
      if (localObject != null) {}
    }
    else
    {
      localObject = new com/google/android/gms/b/gp;
      ((gp)localObject).<init>(paramString, paramContext);
    }
    return (gr)localObject;
  }
  
  private gr b(String paramString, Context paramContext)
  {
    a locala = b.a(paramContext);
    try
    {
      localObject1 = a(paramContext);
      localObject1 = (gs)localObject1;
      localObject1 = ((gs)localObject1).b(paramString, locala);
      localObject1 = gr.a.a((IBinder)localObject1);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2 = null;
      }
    }
    catch (c.a locala1)
    {
      for (;;) {}
    }
    return (gr)localObject1;
  }
}


/* Location:              com/google/android/gms/b/gq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */