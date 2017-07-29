package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class up
  implements us
{
  private final Object a;
  private Object b;
  private Throwable c;
  private boolean d;
  private boolean e;
  private final ut f;
  
  public up()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
    localObject = new com/google/android/gms/b/ut;
    ((ut)localObject).<init>();
    f = ((ut)localObject);
  }
  
  private boolean a()
  {
    Throwable localThrowable = c;
    boolean bool;
    if (localThrowable == null)
    {
      bool = d;
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localThrowable = null;
    }
  }
  
  public final void a(Runnable paramRunnable)
  {
    f.a(paramRunnable);
  }
  
  public final void a(Throwable paramThrowable)
  {
    for (;;)
    {
      synchronized (a)
      {
        boolean bool = e;
        if (bool) {
          return;
        }
        bool = a();
        if (bool)
        {
          tj localtj = w.i();
          IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
          String str = "Provided CallbackFuture with multiple values.";
          localIllegalStateException.<init>(str);
          str = "CallbackFuture.provideException";
          localtj.a(localIllegalStateException, str);
        }
      }
      c = paramThrowable;
      Object localObject3 = a;
      localObject3.notifyAll();
      localObject3 = f;
      ((ut)localObject3).a();
    }
  }
  
  public final void b(Object paramObject)
  {
    for (;;)
    {
      synchronized (a)
      {
        bool = e;
        if (bool) {
          return;
        }
        bool = a();
        if (bool)
        {
          tj localtj = w.i();
          IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
          String str = "Provided CallbackFuture with multiple values.";
          localIllegalStateException.<init>(str);
          str = "CallbackFuture.provideValue";
          localtj.a(localIllegalStateException, str);
        }
      }
      boolean bool = true;
      d = bool;
      b = paramObject;
      Object localObject3 = a;
      localObject3.notifyAll();
      localObject3 = f;
      ((ut)localObject3).a();
    }
  }
  
  public final void b(Runnable paramRunnable)
  {
    f.b(paramRunnable);
  }
  
  public boolean cancel(boolean paramBoolean)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = true;
    if (!paramBoolean) {}
    for (;;)
    {
      return bool1;
      synchronized (a)
      {
        boolean bool3 = a();
        if (!bool3) {}
      }
      bool1 = true;
      e = bool1;
      bool1 = true;
      d = bool1;
      Object localObject3 = a;
      localObject3.notifyAll();
      localObject3 = f;
      ((ut)localObject3).a();
      bool1 = bool2;
    }
  }
  
  public Object get()
  {
    Object localObject2;
    Object localObject5;
    synchronized (a)
    {
      bool = a();
      if (bool) {}
    }
    boolean bool = e;
    if (bool)
    {
      localObject4 = new java/util/concurrent/CancellationException;
      localObject5 = "CallbackFuture was cancelled.";
      ((CancellationException)localObject4).<init>((String)localObject5);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = b;
    return localObject4;
  }
  
  public Object get(long paramLong, TimeUnit paramTimeUnit)
  {
    long l1;
    long l2;
    Object localObject2;
    Object localObject5;
    synchronized (a)
    {
      bool = a();
      if (bool) {}
    }
    boolean bool = d;
    if (!bool)
    {
      localObject4 = new java/util/concurrent/TimeoutException;
      localObject5 = "CallbackFuture timed out.";
      ((TimeoutException)localObject4).<init>((String)localObject5);
      throw ((Throwable)localObject4);
    }
    bool = e;
    if (bool)
    {
      localObject4 = new java/util/concurrent/CancellationException;
      localObject5 = "CallbackFuture was cancelled.";
      ((CancellationException)localObject4).<init>((String)localObject5);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = b;
    return localObject4;
  }
  
  public boolean isCancelled()
  {
    synchronized (a)
    {
      boolean bool = e;
      return bool;
    }
  }
  
  public boolean isDone()
  {
    synchronized (a)
    {
      boolean bool = a();
      return bool;
    }
  }
}


/* Location:              com/google/android/gms/b/up.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */