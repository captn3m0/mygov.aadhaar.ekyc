package com.google.android.gms.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

public class io
{
  private ja a;
  private final Object b;
  private final ig c;
  private final if d;
  private final jm e;
  private final lu f;
  private final sd g;
  private final pn h;
  private final pa i;
  
  public io(ig paramig, if paramif, jm paramjm, lu paramlu, sd paramsd, pn parampn, pa parampa)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    b = localObject;
    c = paramig;
    d = paramif;
    e = paramjm;
    f = paramlu;
    g = paramsd;
    h = parampn;
    i = parampa;
  }
  
  private static ja a()
  {
    for (Object localObject1 = io.class;; localObject1 = ja.a.asInterface((IBinder)localObject1))
    {
      try
      {
        localObject1 = ((Class)localObject1).getClassLoader();
        str = "com.google.android.gms.ads.internal.ClientApi";
        localObject1 = ((ClassLoader)localObject1).loadClass(str);
        localObject1 = ((Class)localObject1).newInstance();
        boolean bool = localObject1 instanceof IBinder;
        if (bool) {
          break label42;
        }
        localObject1 = "ClientApi class is not an instance of IBinder";
        ul.e((String)localObject1);
        localObject1 = null;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          label42:
          String str = "Failed to instantiate ClientApi class.";
          ul.c(str, localException);
          Object localObject2 = null;
        }
      }
      return (ja)localObject1;
      localObject1 = (IBinder)localObject1;
    }
  }
  
  public static Object a(Context paramContext, boolean paramBoolean, io.a parama)
  {
    Object localObject;
    if (!paramBoolean)
    {
      ip.a();
      boolean bool = uk.c(paramContext);
      if (!bool)
      {
        localObject = "Google Play Services is not available";
        ul.b((String)localObject);
        paramBoolean = true;
      }
    }
    if (paramBoolean)
    {
      localObject = parama.b();
      if (localObject == null) {
        localObject = parama.c();
      }
    }
    for (;;)
    {
      return localObject;
      localObject = parama.c();
      if (localObject == null) {
        localObject = parama.b();
      }
    }
  }
  
  public static boolean a(Activity paramActivity, String paramString)
  {
    boolean bool1 = false;
    Object localObject = paramActivity.getIntent();
    boolean bool2 = ((Intent)localObject).hasExtra(paramString);
    if (!bool2)
    {
      localObject = "useClientJar flag not found in activity intent extras.";
      ul.c((String)localObject);
    }
    for (;;)
    {
      return bool1;
      bool1 = ((Intent)localObject).getBooleanExtra(paramString, false);
    }
  }
  
  private ja b()
  {
    synchronized (b)
    {
      ja localja = a;
      if (localja == null)
      {
        localja = a();
        a = localja;
      }
      localja = a;
      return localja;
    }
  }
}


/* Location:              com/google/android/gms/b/io.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */