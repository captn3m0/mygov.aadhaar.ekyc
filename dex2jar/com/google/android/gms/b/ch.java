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
    c = new Runnable()
    {
      public final void run()
      {
        if (Looper.myLooper() == Looper.getMainLooper()) {
          ch.a(ch.this).f().a(this);
        }
        boolean bool;
        do
        {
          return;
          bool = b();
          ch.b(ch.this);
        } while ((!bool) || (!ch.c(ch.this)));
        a();
      }
    };
  }
  
  private Handler d()
  {
    if (b != null) {
      return b;
    }
    try
    {
      if (b == null) {
        b = new Handler(a.a.getMainLooper());
      }
      Handler localHandler = b;
      return localHandler;
    }
    finally {}
  }
  
  public abstract void a();
  
  public final void a(long paramLong)
  {
    c();
    if (paramLong >= 0L)
    {
      d = a.i.a();
      if (!d().postDelayed(c, paramLong)) {
        a.e().a.a("Failed to schedule delayed post. time", Long.valueOf(paramLong));
      }
    }
  }
  
  public final boolean b()
  {
    return d != 0L;
  }
  
  public final void c()
  {
    d = 0L;
    d().removeCallbacks(c);
  }
}


/* Location:              com/google/android/gms/b/ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */