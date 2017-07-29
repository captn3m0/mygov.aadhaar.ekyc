package com.google.android.gms.b;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class gh
{
  protected static final String a = gh.class.getSimpleName();
  private final eu b;
  private final String c;
  private final String d;
  private final int e = 2;
  private volatile Method f = null;
  private List<Class> g;
  private CountDownLatch h = new CountDownLatch(1);
  
  public gh(eu parameu, String paramString1, String paramString2, List<Class> paramList)
  {
    b = parameu;
    c = paramString1;
    d = paramString2;
    g = new ArrayList(paramList);
    b.c.submit(new Runnable()
    {
      public final void run()
      {
        gh.a(gh.this);
      }
    });
  }
  
  private String a(byte[] paramArrayOfByte, String paramString)
  {
    dy localdy = b.e;
    return new String(dy.a(paramArrayOfByte, paramString), "UTF-8");
  }
  
  public final Method a()
  {
    Method localMethod = null;
    if (f != null) {
      localMethod = f;
    }
    for (;;)
    {
      return localMethod;
      try
      {
        if (h.await(2L, TimeUnit.SECONDS))
        {
          localMethod = f;
          return localMethod;
        }
      }
      catch (InterruptedException localInterruptedException) {}
    }
    return null;
  }
}


/* Location:              com/google/android/gms/b/gh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */