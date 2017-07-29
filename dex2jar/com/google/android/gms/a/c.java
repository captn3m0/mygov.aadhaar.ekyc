package com.google.android.gms.a;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.o;

public abstract class c<T>
{
  private final String a;
  private T b;
  
  protected c(String paramString)
  {
    a = paramString;
  }
  
  protected final T a(Context paramContext)
  {
    if (b == null)
    {
      com.google.android.gms.common.internal.c.a(paramContext);
      paramContext = o.f(paramContext);
      if (paramContext == null) {
        throw new a("Could not get remote context.");
      }
      paramContext = paramContext.getClassLoader();
    }
    try
    {
      b = a((IBinder)paramContext.loadClass(a).newInstance());
      return (T)b;
    }
    catch (ClassNotFoundException paramContext)
    {
      throw new a("Could not load creator class.", paramContext);
    }
    catch (InstantiationException paramContext)
    {
      throw new a("Could not instantiate creator.", paramContext);
    }
    catch (IllegalAccessException paramContext)
    {
      throw new a("Could not access creator.", paramContext);
    }
  }
  
  public abstract T a(IBinder paramIBinder);
  
  public static final class a
    extends Exception
  {
    public a(String paramString)
    {
      super();
    }
    
    public a(String paramString, Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
}


/* Location:              com/google/android/gms/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */