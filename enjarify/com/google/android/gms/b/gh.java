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
  private List g;
  private CountDownLatch h;
  
  public gh(eu parameu, String paramString1, String paramString2, List paramList)
  {
    Object localObject = new java/util/concurrent/CountDownLatch;
    ((CountDownLatch)localObject).<init>(1);
    h = ((CountDownLatch)localObject);
    b = parameu;
    c = paramString1;
    d = paramString2;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>(paramList);
    g = ((List)localObject);
    localObject = b.c;
    gh.1 local1 = new com/google/android/gms/b/gh$1;
    local1.<init>(this);
    ((ExecutorService)localObject).submit(local1);
  }
  
  private String a(byte[] paramArrayOfByte, String paramString)
  {
    Object localObject = b.e;
    localObject = dy.a(paramArrayOfByte, paramString);
    String str = new java/lang/String;
    str.<init>((byte[])localObject, "UTF-8");
    return str;
  }
  
  public final Method a()
  {
    Method localMethod = null;
    Object localObject = f;
    if (localObject != null) {
      localMethod = f;
    }
    for (;;)
    {
      return localMethod;
      try
      {
        localObject = h;
        long l = 2;
        TimeUnit localTimeUnit = TimeUnit.SECONDS;
        boolean bool = ((CountDownLatch)localObject).await(l, localTimeUnit);
        if (bool) {
          localMethod = f;
        }
      }
      catch (InterruptedException localInterruptedException) {}
    }
  }
}


/* Location:              com/google/android/gms/b/gh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */