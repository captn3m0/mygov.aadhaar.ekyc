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
  private final AtomicInteger c = new AtomicInteger();
  private final ThreadFactory d = Executors.defaultThreadFactory();
  
  public ay(String paramString)
  {
    this(paramString, (byte)0);
  }
  
  private ay(String paramString, byte paramByte)
  {
    a = ((String)c.a(paramString, "Name must not be null"));
    b = 0;
  }
  
  public final Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = d.newThread(new az(paramRunnable, b));
    String str = a;
    int i = c.getAndIncrement();
    paramRunnable.setName(String.valueOf(str).length() + 13 + str + "[" + i + "]");
    return paramRunnable;
  }
}


/* Location:              com/google/android/gms/b/ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */