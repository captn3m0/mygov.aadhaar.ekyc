package com.google.android.gms.b;

import com.google.android.gms.common.util.c;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

final class dh$3
  implements Callable
{
  dh$3(dh paramdh) {}
  
  private String a()
  {
    Object localObject1 = a.v().C();
    if (localObject1 != null) {}
    for (;;)
    {
      return (String)localObject1;
      localObject1 = a.h();
      long l1 = 120000L;
      localObject1 = ((dh)localObject1).c(l1);
      if (localObject1 == null)
      {
        localObject1 = new java/util/concurrent/TimeoutException;
        ((TimeoutException)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
      cy localcy = a.v();
      synchronized (j)
      {
        h = ((String)localObject1);
        c localc = localcy.m();
        long l2 = localc.b();
        i = l2;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/dh$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */