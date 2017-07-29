package com.google.android.gms.b;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class ts
{
  private static final ThreadPoolExecutor a;
  private static final ThreadPoolExecutor b;
  
  static
  {
    long l = 1L;
    int i = 10;
    int j = 5;
    boolean bool = true;
    ThreadPoolExecutor localThreadPoolExecutor = new java/util/concurrent/ThreadPoolExecutor;
    TimeUnit localTimeUnit = TimeUnit.MINUTES;
    LinkedBlockingQueue localLinkedBlockingQueue = new java/util/concurrent/LinkedBlockingQueue;
    localLinkedBlockingQueue.<init>();
    ThreadFactory localThreadFactory = a("Default");
    localThreadPoolExecutor.<init>(i, i, l, localTimeUnit, localLinkedBlockingQueue, localThreadFactory);
    a = localThreadPoolExecutor;
    localThreadPoolExecutor = new java/util/concurrent/ThreadPoolExecutor;
    localTimeUnit = TimeUnit.MINUTES;
    localLinkedBlockingQueue = new java/util/concurrent/LinkedBlockingQueue;
    localLinkedBlockingQueue.<init>();
    localThreadFactory = a("Loader");
    i = j;
    localThreadPoolExecutor.<init>(j, j, l, localTimeUnit, localLinkedBlockingQueue, localThreadFactory);
    b = localThreadPoolExecutor;
    a.allowCoreThreadTimeOut(bool);
    b.allowCoreThreadTimeOut(bool);
  }
  
  public static us a(int paramInt, Runnable paramRunnable)
  {
    int i = 1;
    Object localObject2;
    if (paramInt == i)
    {
      localObject1 = b;
      localObject2 = new com/google/android/gms/b/ts$1;
      ((ts.1)localObject2).<init>(paramRunnable);
    }
    for (Object localObject1 = a((ExecutorService)localObject1, (Callable)localObject2);; localObject1 = a((ExecutorService)localObject1, (Callable)localObject2))
    {
      return (us)localObject1;
      localObject1 = a;
      localObject2 = new com/google/android/gms/b/ts$2;
      ((ts.2)localObject2).<init>(paramRunnable);
    }
  }
  
  public static us a(Runnable paramRunnable)
  {
    return a(0, paramRunnable);
  }
  
  public static us a(Callable paramCallable)
  {
    return a(a, paramCallable);
  }
  
  public static us a(ExecutorService paramExecutorService, Callable paramCallable)
  {
    localup = new com/google/android/gms/b/up;
    localup.<init>();
    try
    {
      Object localObject1 = new com/google/android/gms/b/ts$3;
      ((ts.3)localObject1).<init>(localup, paramCallable);
      localObject1 = paramExecutorService.submit((Runnable)localObject1);
      localObject2 = new com/google/android/gms/b/ts$4;
      ((ts.4)localObject2).<init>(localup, (Future)localObject1);
      localup.b((Runnable)localObject2);
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      for (;;)
      {
        Object localObject2 = "Thread execution is rejected.";
        tp.c((String)localObject2, localRejectedExecutionException);
        boolean bool = true;
        localup.cancel(bool);
      }
    }
    return localup;
  }
  
  private static ThreadFactory a(String paramString)
  {
    ts.5 local5 = new com/google/android/gms/b/ts$5;
    local5.<init>(paramString);
    return local5;
  }
}


/* Location:              com/google/android/gms/b/ts.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */