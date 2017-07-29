package com.google.android.gms.b;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class am
{
  private static final ExecutorService a;
  
  static
  {
    ThreadPoolExecutor localThreadPoolExecutor = new java/util/concurrent/ThreadPoolExecutor;
    TimeUnit localTimeUnit = TimeUnit.SECONDS;
    LinkedBlockingQueue localLinkedBlockingQueue = new java/util/concurrent/LinkedBlockingQueue;
    localLinkedBlockingQueue.<init>();
    ay localay = new com/google/android/gms/b/ay;
    localay.<init>("GAC_Transform");
    localThreadPoolExecutor.<init>(0, 4, 60, localTimeUnit, localLinkedBlockingQueue, localay);
    a = localThreadPoolExecutor;
  }
  
  public static ExecutorService a()
  {
    return a;
  }
}


/* Location:              com/google/android/gms/b/am.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */