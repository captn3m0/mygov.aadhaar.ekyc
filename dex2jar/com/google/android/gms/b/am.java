package com.google.android.gms.b;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class am
{
  private static final ExecutorService a = new ThreadPoolExecutor(0, 4, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ay("GAC_Transform"));
  
  public static ExecutorService a()
  {
    return a;
  }
}


/* Location:              com/google/android/gms/b/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */