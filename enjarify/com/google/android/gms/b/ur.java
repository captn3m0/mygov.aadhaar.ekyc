package com.google.android.gms.b;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class ur
{
  public static us a(List paramList)
  {
    up localup = new com/google/android/gms/b/up;
    localup.<init>();
    int i = paramList.size();
    AtomicInteger localAtomicInteger = new java/util/concurrent/atomic/AtomicInteger;
    boolean bool = false;
    us localus = null;
    localAtomicInteger.<init>(0);
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localus = (us)localIterator.next();
      ur.2 local2 = new com/google/android/gms/b/ur$2;
      local2.<init>(localAtomicInteger, i, localup, paramList);
      localus.a(local2);
    }
    return localup;
  }
  
  public static Object a(Future paramFuture, Object paramObject, int paramInt, TimeUnit paramTimeUnit)
  {
    long l = paramInt;
    try
    {
      paramObject = paramFuture.get(l, paramTimeUnit);
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        Thread localThread = Thread.currentThread();
        localThread.interrupt();
      }
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return paramObject;
  }
}


/* Location:              com/google/android/gms/b/ur.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */