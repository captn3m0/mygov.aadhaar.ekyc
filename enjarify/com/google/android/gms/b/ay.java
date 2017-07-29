package com.google.android.gms.b;

import com.google.android.gms.common.internal.c;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class ay
  implements ThreadFactory
{
  private final String a;
  private final int b;
  private final AtomicInteger c;
  private final ThreadFactory d;
  
  public ay(String paramString)
  {
    this(paramString, (byte)0);
  }
  
  private ay(String paramString, byte paramByte)
  {
    Object localObject = new java/util/concurrent/atomic/AtomicInteger;
    ((AtomicInteger)localObject).<init>();
    c = ((AtomicInteger)localObject);
    localObject = Executors.defaultThreadFactory();
    d = ((ThreadFactory)localObject);
    localObject = (String)c.a(paramString, "Name must not be null");
    a = ((String)localObject);
    b = 0;
  }
  
  public final Thread newThread(Runnable paramRunnable)
  {
    Object localObject1 = d;
    Object localObject2 = new com/google/android/gms/b/az;
    int i = b;
    ((az)localObject2).<init>(paramRunnable, i);
    localObject1 = ((ThreadFactory)localObject1).newThread((Runnable)localObject2);
    localObject2 = a;
    i = c.getAndIncrement();
    int j = String.valueOf(localObject2).length() + 13;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(j);
    localObject2 = (String)localObject2 + "[" + i + "]";
    ((Thread)localObject1).setName((String)localObject2);
    return (Thread)localObject1;
  }
}


/* Location:              com/google/android/gms/b/ay.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */