package com.google.android.gms.b;

import android.os.Looper;
import com.google.android.gms.common.internal.c;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class db
  extends df
{
  private static final AtomicLong k;
  db.d a;
  private ExecutorService b;
  private db.d c;
  private final PriorityBlockingQueue d;
  private final BlockingQueue e;
  private final Thread.UncaughtExceptionHandler f;
  private final Thread.UncaughtExceptionHandler g;
  private final Object h;
  private final Semaphore i;
  private volatile boolean j;
  
  static
  {
    AtomicLong localAtomicLong = new java/util/concurrent/atomic/AtomicLong;
    localAtomicLong.<init>(Long.MIN_VALUE);
    k = localAtomicLong;
  }
  
  db(dc paramdc)
  {
    super(paramdc);
    Object localObject = new java/lang/Object;
    localObject.<init>();
    h = localObject;
    localObject = new java/util/concurrent/Semaphore;
    ((Semaphore)localObject).<init>(2);
    i = ((Semaphore)localObject);
    localObject = new java/util/concurrent/PriorityBlockingQueue;
    ((PriorityBlockingQueue)localObject).<init>();
    d = ((PriorityBlockingQueue)localObject);
    localObject = new java/util/concurrent/LinkedBlockingQueue;
    ((LinkedBlockingQueue)localObject).<init>();
    e = ((BlockingQueue)localObject);
    localObject = new com/google/android/gms/b/db$b;
    ((db.b)localObject).<init>(this, "Thread death: Uncaught exception on worker thread");
    f = ((Thread.UncaughtExceptionHandler)localObject);
    localObject = new com/google/android/gms/b/db$b;
    ((db.b)localObject).<init>(this, "Thread death: Uncaught exception on network thread");
    g = ((Thread.UncaughtExceptionHandler)localObject);
  }
  
  private void a(db.c paramc)
  {
    synchronized (h)
    {
      Object localObject2 = d;
      ((PriorityBlockingQueue)localObject2).add(paramc);
      localObject2 = a;
      if (localObject2 == null)
      {
        localObject2 = new com/google/android/gms/b/db$d;
        Object localObject4 = "Measurement Worker";
        PriorityBlockingQueue localPriorityBlockingQueue = d;
        ((db.d)localObject2).<init>(this, (String)localObject4, localPriorityBlockingQueue);
        a = ((db.d)localObject2);
        localObject2 = a;
        localObject4 = f;
        ((db.d)localObject2).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)localObject4);
        localObject2 = a;
        ((db.d)localObject2).start();
        return;
      }
      localObject2 = a;
      ((db.d)localObject2).a();
    }
  }
  
  public static boolean x()
  {
    Looper localLooper1 = Looper.myLooper();
    Looper localLooper2 = Looper.getMainLooper();
    boolean bool;
    if (localLooper1 == localLooper2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localLooper1 = null;
    }
  }
  
  public final Future a(Callable paramCallable)
  {
    J();
    c.a(paramCallable);
    db.c localc = new com/google/android/gms/b/db$c;
    boolean bool = false;
    localc.<init>(this, paramCallable, false, "Task exception on worker thread");
    Object localObject1 = Thread.currentThread();
    Object localObject2 = a;
    if (localObject1 == localObject2)
    {
      localObject1 = d;
      bool = ((PriorityBlockingQueue)localObject1).isEmpty();
      if (!bool)
      {
        localObject1 = uc;
        localObject2 = "Callable skipped the worker queue.";
        ((cu.a)localObject1).a((String)localObject2);
      }
      localc.run();
    }
    for (;;)
    {
      return localc;
      a(localc);
    }
  }
  
  protected final void a() {}
  
  public final void a(Runnable paramRunnable)
  {
    J();
    c.a(paramRunnable);
    db.c localc = new com/google/android/gms/b/db$c;
    localc.<init>(this, paramRunnable, "Task exception on worker thread");
    a(localc);
  }
  
  public final Future b(Callable paramCallable)
  {
    J();
    c.a(paramCallable);
    db.c localc = new com/google/android/gms/b/db$c;
    boolean bool = true;
    localc.<init>(this, paramCallable, bool, "Task exception on worker thread");
    Thread localThread = Thread.currentThread();
    db.d locald = a;
    if (localThread == locald) {
      localc.run();
    }
    for (;;)
    {
      return localc;
      a(localc);
    }
  }
  
  public final void b(Runnable paramRunnable)
  {
    J();
    c.a(paramRunnable);
    Object localObject1 = new com/google/android/gms/b/db$c;
    ((db.c)localObject1).<init>(this, paramRunnable, "Task exception on network thread");
    synchronized (h)
    {
      Object localObject4 = e;
      ((BlockingQueue)localObject4).add(localObject1);
      localObject1 = c;
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/gms/b/db$d;
        localObject4 = "Measurement Network";
        BlockingQueue localBlockingQueue = e;
        ((db.d)localObject1).<init>(this, (String)localObject4, localBlockingQueue);
        c = ((db.d)localObject1);
        localObject1 = c;
        localObject4 = g;
        ((db.d)localObject1).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)localObject4);
        localObject1 = c;
        ((db.d)localObject1).start();
        return;
      }
      localObject1 = c;
      ((db.d)localObject1).a();
    }
  }
  
  public final void d()
  {
    Object localObject = Thread.currentThread();
    db.d locald = c;
    if (localObject != locald)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Call expected from network thread");
      throw ((Throwable)localObject);
    }
  }
  
  public final void e()
  {
    Object localObject = Thread.currentThread();
    db.d locald = a;
    if (localObject != locald)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Call expected from worker thread");
      throw ((Throwable)localObject);
    }
  }
  
  final ExecutorService y()
  {
    synchronized (h)
    {
      ExecutorService localExecutorService = b;
      if (localExecutorService == null)
      {
        ThreadPoolExecutor localThreadPoolExecutor = new java/util/concurrent/ThreadPoolExecutor;
        int m = 1;
        long l = 30;
        TimeUnit localTimeUnit = TimeUnit.SECONDS;
        ArrayBlockingQueue localArrayBlockingQueue = new java/util/concurrent/ArrayBlockingQueue;
        int n = 100;
        localArrayBlockingQueue.<init>(n);
        localThreadPoolExecutor.<init>(0, m, l, localTimeUnit, localArrayBlockingQueue);
        b = localThreadPoolExecutor;
      }
      localExecutorService = b;
      return localExecutorService;
    }
  }
}


/* Location:              com/google/android/gms/b/db.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */