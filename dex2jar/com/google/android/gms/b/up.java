package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@qi
public class up<T>
  implements us<T>
{
  private final Object a = new Object();
  private T b;
  private Throwable c;
  private boolean d;
  private boolean e;
  private final ut f = new ut();
  
  private boolean a()
  {
    return (c != null) || (d);
  }
  
  public final void a(Runnable paramRunnable)
  {
    f.a(paramRunnable);
  }
  
  public final void a(Throwable paramThrowable)
  {
    synchronized (a)
    {
      if (e) {
        return;
      }
      if (a())
      {
        w.i().a(new IllegalStateException("Provided CallbackFuture with multiple values."), "CallbackFuture.provideException");
        return;
      }
    }
    c = paramThrowable;
    a.notifyAll();
    f.a();
  }
  
  public final void b(T paramT)
  {
    synchronized (a)
    {
      if (e) {
        return;
      }
      if (a())
      {
        w.i().a(new IllegalStateException("Provided CallbackFuture with multiple values."), "CallbackFuture.provideValue");
        return;
      }
    }
    d = true;
    b = paramT;
    a.notifyAll();
    f.a();
  }
  
  public final void b(Runnable paramRunnable)
  {
    f.b(paramRunnable);
  }
  
  public boolean cancel(boolean paramBoolean)
  {
    if (!paramBoolean) {
      return false;
    }
    synchronized (a)
    {
      if (a()) {
        return false;
      }
    }
    e = true;
    d = true;
    a.notifyAll();
    f.a();
    return true;
  }
  
  public T get()
  {
    synchronized (a)
    {
      boolean bool = a();
      if (bool) {}
    }
    if (e) {
      throw new CancellationException("CallbackFuture was cancelled.");
    }
    Object localObject3 = b;
    return (T)localObject3;
  }
  
  public T get(long paramLong, TimeUnit paramTimeUnit)
  {
    synchronized (a)
    {
      boolean bool = a();
      if (bool) {}
    }
    if (!d) {
      throw new TimeoutException("CallbackFuture timed out.");
    }
    if (e) {
      throw new CancellationException("CallbackFuture was cancelled.");
    }
    paramTimeUnit = b;
    return paramTimeUnit;
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */