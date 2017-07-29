package com.google.android.gms.b;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class w
{
  private static final ExecutorService a = Executors.newFixedThreadPool(2, new ay("GAC_Executor"));
  
  public static ExecutorService a()
  {
    return a;
  }
}


/* Location:              com/google/android/gms/b/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */