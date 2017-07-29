package com.google.android.gms.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

@qi
public class io
{
  private ja a;
  private final Object b = new Object();
  private final ig c;
  private final if d;
  private final jm e;
  private final lu f;
  private final sd g;
  private final pn h;
  private final pa i;
  
  public io(ig paramig, if paramif, jm paramjm, lu paramlu, sd paramsd, pn parampn, pa parampa)
  {
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
    try
    {
      Object localObject = io.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
      if (!(localObject instanceof IBinder))
      {
        ul.e("ClientApi class is not an instance of IBinder");
        return null;
      }
      localObject = ja.a.asInterface((IBinder)localObject);
      return (ja)localObject;
    }
    catch (Exception localException)
    {
      ul.c("Failed to instantiate ClientApi class.", localException);
    }
    return null;
  }
  
  public static <T> T a(Context paramContext, boolean paramBoolean, a<T> parama)
  {
    boolean bool = paramBoolean;
    if (!paramBoolean)
    {
      ip.a();
      bool = paramBoolean;
      if (!uk.c(paramContext))
      {
        ul.b("Google Play Services is not available");
        bool = true;
      }
    }
    Object localObject;
    if (bool)
    {
      localObject = parama.b();
      paramContext = (Context)localObject;
      if (localObject == null) {
        paramContext = parama.c();
      }
    }
    do
    {
      return paramContext;
      localObject = parama.c();
      paramContext = (Context)localObject;
    } while (localObject != null);
    return (T)parama.b();
  }
  
  public static boolean a(Activity paramActivity, String paramString)
  {
    paramActivity = paramActivity.getIntent();
    if (!paramActivity.hasExtra(paramString))
    {
      ul.c("useClientJar flag not found in activity intent extras.");
      return false;
    }
    return paramActivity.getBooleanExtra(paramString, false);
  }
  
  private ja b()
  {
    synchronized (b)
    {
      if (a == null) {
        a = a();
      }
      ja localja = a;
      return localja;
    }
  }
  
  abstract class a<T>
  {
    a() {}
    
    protected abstract T a();
    
    protected abstract T a(ja paramja);
    
    protected final T b()
    {
      Object localObject = io.a(io.this);
      if (localObject == null)
      {
        ul.e("ClientApi class cannot be loaded.");
        return null;
      }
      try
      {
        localObject = a((ja)localObject);
        return (T)localObject;
      }
      catch (RemoteException localRemoteException)
      {
        ul.c("Cannot invoke local loader using ClientApi class", localRemoteException);
      }
      return null;
    }
    
    protected final T c()
    {
      try
      {
        Object localObject = a();
        return (T)localObject;
      }
      catch (RemoteException localRemoteException)
      {
        ul.c("Cannot invoke remote loader", localRemoteException);
      }
      return null;
    }
  }
}


/* Location:              com/google/android/gms/b/io.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */