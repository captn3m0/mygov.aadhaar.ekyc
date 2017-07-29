package com.google.android.gms.b;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class ts$5
  implements ThreadFactory
{
  private final AtomicInteger b;
  
  ts$5(String paramString)
  {
    AtomicInteger localAtomicInteger = new java/util/concurrent/atomic/AtomicInteger;
    localAtomicInteger.<init>(1);
    b = localAtomicInteger;
  }
  
  public final Thread newThread(Runnable paramRunnable)
  {
    Thread localThread = new java/lang/Thread;
    String str = a;
    int i = b.getAndIncrement();
    int j = String.valueOf(str).length() + 23;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(j);
    str = "AdWorker(" + str + ") #" + i;
    localThread.<init>(paramRunnable, str);
    return localThread;
  }
}


/* Location:              com/google/android/gms/b/ts$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */