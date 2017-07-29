package com.google.android.gms.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.c;

@qi
public final class ub
{
  int a = 0;
  final Object b = new Object();
  private HandlerThread c = null;
  private Handler d = null;
  
  public final Looper a()
  {
    for (;;)
    {
      synchronized (b)
      {
        if (a == 0)
        {
          if (c == null)
          {
            tp.a("Starting the looper thread.");
            c = new HandlerThread("LooperProvider");
            c.start();
            d = new Handler(c.getLooper());
            tp.a("Looper thread started.");
            a += 1;
            Looper localLooper = c.getLooper();
            return localLooper;
          }
          tp.a("Resuming the looper thread");
          b.notifyAll();
        }
      }
      c.a(c, "Invalid state: mHandlerThread should already been initialized.");
    }
  }
  
  public final void b()
  {
    for (;;)
    {
      synchronized (b)
      {
        if (a > 0)
        {
          bool = true;
          c.b(bool, "Invalid state: release() called more times than expected.");
          int i = a - 1;
          a = i;
          if (i == 0) {
            d.post(new Runnable()
            {
              public final void run()
              {
                synchronized (b)
                {
                  tp.a("Suspending the looper thread");
                  for (;;)
                  {
                    int i = a;
                    if (i == 0) {
                      try
                      {
                        b.wait();
                        tp.a("Looper thread resumed");
                      }
                      catch (InterruptedException localInterruptedException)
                      {
                        tp.a("Looper thread interrupted.");
                      }
                    }
                  }
                }
              }
            });
          }
          return;
        }
      }
      boolean bool = false;
    }
  }
}


/* Location:              com/google/android/gms/b/ub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */