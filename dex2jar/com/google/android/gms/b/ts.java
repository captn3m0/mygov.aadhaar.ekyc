package com.google.android.gms.b;

import android.os.Process;
import com.google.android.gms.ads.internal.w;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@qi
public final class ts
{
  private static final ThreadPoolExecutor a = new ThreadPoolExecutor(10, 10, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), a("Default"));
  private static final ThreadPoolExecutor b = new ThreadPoolExecutor(5, 5, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), a("Loader"));
  
  static
  {
    a.allowCoreThreadTimeOut(true);
    b.allowCoreThreadTimeOut(true);
  }
  
  public static us<Void> a(int paramInt, Runnable paramRunnable)
  {
    if (paramInt == 1) {
      a(b, new Callable() {});
    }
    a(a, new Callable() {});
  }
  
  public static us<Void> a(Runnable paramRunnable)
  {
    return a(0, paramRunnable);
  }
  
  public static <T> us<T> a(Callable<T> paramCallable)
  {
    return a(a, paramCallable);
  }
  
  public static <T> us<T> a(ExecutorService paramExecutorService, final Callable<T> paramCallable)
  {
    up localup = new up();
    try
    {
      localup.b(new Runnable()
      {
        public final void run()
        {
          try
          {
            Process.setThreadPriority(10);
            b(paramCallable.call());
            return;
          }
          catch (Exception localException)
          {
            w.i().a(localException, "AdThreadPool.submit");
            a(localException);
          }
        }
      }
      {
        public final void run()
        {
          if (isCancelled()) {
            b.cancel(true);
          }
        }
      });
      return localup;
    }
    catch (RejectedExecutionException paramExecutorService)
    {
      tp.c("Thread execution is rejected.", paramExecutorService);
      localup.cancel(true);
    }
    return localup;
  }
  
  private static ThreadFactory a(String paramString)
  {
    new ThreadFactory()
    {
      private final AtomicInteger b = new AtomicInteger(1);
      
      public final Thread newThread(Runnable paramAnonymousRunnable)
      {
        String str = ts.this;
        int i = b.getAndIncrement();
        return new Thread(paramAnonymousRunnable, String.valueOf(str).length() + 23 + "AdWorker(" + str + ") #" + i);
      }
    };
  }
}


/* Location:              com/google/android/gms/b/ts.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */