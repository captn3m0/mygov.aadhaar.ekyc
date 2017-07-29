package com.google.android.gms.b;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class w
{
  private static final ExecutorService a;
  
  static
  {
    ay localay = new com/google/android/gms/b/ay;
    localay.<init>("GAC_Executor");
    a = Executors.newFixedThreadPool(2, localay);
  }
  
  public static ExecutorService a()
  {
    return a;
  }
}


/* Location:              com/google/android/gms/b/w.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */