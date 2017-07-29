package com.google.android.gms.a;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.o;

public abstract class c
{
  private final String a;
  private Object b;
  
  protected c(String paramString)
  {
    a = paramString;
  }
  
  protected final Object a(Context paramContext)
  {
    Object localObject1 = b;
    if (localObject1 == null)
    {
      com.google.android.gms.common.internal.c.a(paramContext);
      localObject1 = o.f(paramContext);
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/gms/a/c$a;
        ((c.a)localObject1).<init>("Could not get remote context.");
        throw ((Throwable)localObject1);
      }
      localObject1 = ((Context)localObject1).getClassLoader();
    }
    try
    {
      localObject2 = a;
      localObject1 = ((ClassLoader)localObject1).loadClass((String)localObject2);
      localObject1 = ((Class)localObject1).newInstance();
      localObject1 = (IBinder)localObject1;
      localObject1 = a((IBinder)localObject1);
      b = localObject1;
      return b;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      localObject2 = new com/google/android/gms/a/c$a;
      ((c.a)localObject2).<init>("Could not load creator class.", localClassNotFoundException);
      throw ((Throwable)localObject2);
    }
    catch (InstantiationException localInstantiationException)
    {
      localObject2 = new com/google/android/gms/a/c$a;
      ((c.a)localObject2).<init>("Could not instantiate creator.", localInstantiationException);
      throw ((Throwable)localObject2);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Object localObject2 = new com/google/android/gms/a/c$a;
      ((c.a)localObject2).<init>("Could not access creator.", localIllegalAccessException);
      throw ((Throwable)localObject2);
    }
  }
  
  public abstract Object a(IBinder paramIBinder);
}


/* Location:              com/google/android/gms/a/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */