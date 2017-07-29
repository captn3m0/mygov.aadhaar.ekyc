package com.google.android.gms.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.c;

public final class ub
{
  int a = 0;
  final Object b;
  private HandlerThread c = null;
  private Handler d = null;
  
  public ub()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    b = localObject;
  }
  
  public final Looper a()
  {
    for (;;)
    {
      synchronized (b)
      {
        int i = a;
        if (i == 0)
        {
          Object localObject2 = c;
          if (localObject2 == null)
          {
            localObject2 = "Starting the looper thread.";
            tp.a((String)localObject2);
            localObject2 = new android/os/HandlerThread;
            localObject4 = "LooperProvider";
            ((HandlerThread)localObject2).<init>((String)localObject4);
            c = ((HandlerThread)localObject2);
            localObject2 = c;
            ((HandlerThread)localObject2).start();
            localObject2 = new android/os/Handler;
            localObject4 = c;
            localObject4 = ((HandlerThread)localObject4).getLooper();
            ((Handler)localObject2).<init>((Looper)localObject4);
            d = ((Handler)localObject2);
            localObject2 = "Looper thread started.";
            tp.a((String)localObject2);
            i = a + 1;
            a = i;
            localObject2 = c;
            localObject2 = ((HandlerThread)localObject2).getLooper();
            return (Looper)localObject2;
          }
          localObject2 = "Resuming the looper thread";
          tp.a((String)localObject2);
          localObject2 = b;
          localObject2.notifyAll();
        }
      }
      HandlerThread localHandlerThread = c;
      Object localObject4 = "Invalid state: mHandlerThread should already been initialized.";
      c.a(localHandlerThread, localObject4);
    }
  }
  
  public final void b()
  {
    synchronized (b)
    {
      int i = a;
      if (i > 0)
      {
        i = 1;
        Object localObject2 = "Invalid state: release() called more times than expected.";
        c.b(i, localObject2);
        j = a + -1;
        a = j;
        if (j == 0)
        {
          localHandler = d;
          localObject2 = new com/google/android/gms/b/ub$1;
          ((ub.1)localObject2).<init>(this);
          localHandler.post((Runnable)localObject2);
        }
        return;
      }
      int j = 0;
      Handler localHandler = null;
    }
  }
}


/* Location:              com/google/android/gms/b/ub.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */