package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

abstract class ch
{
  private static volatile Handler b;
  private final dc a;
  private final Runnable c;
  private volatile long d;
  private boolean e;
  
  ch(dc paramdc)
  {
    com.google.android.gms.common.internal.c.a(paramdc);
    a = paramdc;
    e = true;
    ch.1 local1 = new com/google/android/gms/b/ch$1;
    local1.<init>(this);
    c = local1;
  }
  
  private Handler d()
  {
    Handler localHandler = b;
    if (localHandler != null) {
      localHandler = b;
    }
    for (;;)
    {
      return localHandler;
      synchronized (ch.class)
      {
        localHandler = b;
        if (localHandler == null)
        {
          localHandler = new android/os/Handler;
          Object localObject2 = a;
          localObject2 = a;
          localObject2 = ((Context)localObject2).getMainLooper();
          localHandler.<init>((Looper)localObject2);
          b = localHandler;
        }
        localHandler = b;
      }
    }
  }
  
  public abstract void a();
  
  public final void a(long paramLong)
  {
    c();
    long l = 0L;
    boolean bool = paramLong < l;
    if (!bool)
    {
      l = a.i.a();
      d = l;
      Object localObject1 = d();
      Object localObject2 = c;
      bool = ((Handler)localObject1).postDelayed((Runnable)localObject2, paramLong);
      if (!bool)
      {
        localObject1 = a.e().a;
        localObject2 = "Failed to schedule delayed post. time";
        Long localLong = Long.valueOf(paramLong);
        ((cu.a)localObject1).a((String)localObject2, localLong);
      }
    }
  }
  
  public final boolean b()
  {
    long l1 = d;
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final void c()
  {
    d = 0L;
    Handler localHandler = d();
    Runnable localRunnable = c;
    localHandler.removeCallbacks(localRunnable);
  }
}


/* Location:              com/google/android/gms/b/ch.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */