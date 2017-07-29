package com.google.android.gms.b;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class ut
{
  private final Object a;
  private final List b;
  private final List c;
  private boolean d;
  
  public ut()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    b = ((List)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    c = ((List)localObject);
    d = false;
  }
  
  private static void c(Runnable paramRunnable)
  {
    uk.a.post(paramRunnable);
  }
  
  public final void a()
  {
    for (;;)
    {
      synchronized (a)
      {
        bool = d;
        if (bool) {
          return;
        }
        Object localObject2 = b;
        localIterator = ((List)localObject2).iterator();
        bool = localIterator.hasNext();
        if (bool)
        {
          localObject2 = localIterator.next();
          localObject2 = (Runnable)localObject2;
          ts.a((Runnable)localObject2);
        }
      }
      Object localObject4 = c;
      Iterator localIterator = ((List)localObject4).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject4 = localIterator.next();
        localObject4 = (Runnable)localObject4;
        c((Runnable)localObject4);
      }
      localObject4 = b;
      ((List)localObject4).clear();
      localObject4 = c;
      ((List)localObject4).clear();
      boolean bool = true;
      d = bool;
    }
  }
  
  public final void a(Runnable paramRunnable)
  {
    synchronized (a)
    {
      boolean bool = d;
      if (bool)
      {
        ts.a(paramRunnable);
        return;
      }
      List localList = b;
      localList.add(paramRunnable);
    }
  }
  
  public final void b(Runnable paramRunnable)
  {
    synchronized (a)
    {
      boolean bool = d;
      if (bool)
      {
        c(paramRunnable);
        return;
      }
      List localList = c;
      localList.add(paramRunnable);
    }
  }
}


/* Location:              com/google/android/gms/b/ut.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */