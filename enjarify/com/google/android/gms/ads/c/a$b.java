package com.google.android.gms.ads.c;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class a$b
  extends Thread
{
  CountDownLatch a;
  boolean b;
  private WeakReference c;
  private long d;
  
  public a$b(a parama, long paramLong)
  {
    Object localObject = new java/lang/ref/WeakReference;
    ((WeakReference)localObject).<init>(parama);
    c = ((WeakReference)localObject);
    d = paramLong;
    localObject = new java/util/concurrent/CountDownLatch;
    ((CountDownLatch)localObject).<init>(1);
    a = ((CountDownLatch)localObject);
    b = false;
    start();
  }
  
  private void a()
  {
    a locala = (a)c.get();
    if (locala != null)
    {
      locala.b();
      boolean bool = true;
      b = bool;
    }
  }
  
  public final void run()
  {
    try
    {
      CountDownLatch localCountDownLatch = a;
      long l = d;
      TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
      boolean bool = localCountDownLatch.await(l, localTimeUnit);
      if (!bool) {
        a();
      }
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        a();
      }
    }
  }
}


/* Location:              com/google/android/gms/ads/c/a$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */