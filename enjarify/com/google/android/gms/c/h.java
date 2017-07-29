package com.google.android.gms.c;

import com.google.android.gms.common.internal.c;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

public final class h
  extends b
{
  private final Object a;
  private final g b;
  private boolean c;
  private Object d;
  private Exception e;
  
  public h()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
    localObject = new com/google/android/gms/c/g;
    ((g)localObject).<init>();
    b = ((g)localObject);
  }
  
  private void c()
  {
    boolean bool = c;
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      c.a(bool, "Task is already complete");
      return;
    }
  }
  
  public final b a(Executor paramExecutor, a parama)
  {
    Object localObject1 = b;
    ??? = new com/google/android/gms/c/e;
    ((e)???).<init>(paramExecutor, parama);
    synchronized (a)
    {
      Object localObject6 = b;
      if (localObject6 == null)
      {
        localObject6 = new java/util/ArrayDeque;
        ((ArrayDeque)localObject6).<init>();
        b = ((Queue)localObject6);
      }
      localObject1 = b;
      ((Queue)localObject1).add(???);
    }
    synchronized (a)
    {
      boolean bool = c;
      if (!bool)
      {
        return this;
        localObject2 = finally;
        throw ((Throwable)localObject2);
      }
      g localg = b;
      localg.a(this);
    }
  }
  
  public final void a(Exception paramException)
  {
    String str = "Exception must not be null";
    c.a(paramException, str);
    synchronized (a)
    {
      c();
      boolean bool = true;
      c = bool;
      e = paramException;
      b.a(this);
      return;
    }
  }
  
  public final void a(Object paramObject)
  {
    synchronized (a)
    {
      c();
      boolean bool = true;
      c = bool;
      d = paramObject;
      b.a(this);
      return;
    }
  }
  
  public final boolean a()
  {
    synchronized (a)
    {
      boolean bool = c;
      if (bool)
      {
        localException = e;
        if (localException == null)
        {
          bool = true;
          return bool;
        }
      }
      bool = false;
      Exception localException = null;
    }
  }
  
  public final Exception b()
  {
    synchronized (a)
    {
      Exception localException = e;
      return localException;
    }
  }
  
  public final boolean b(Exception paramException)
  {
    boolean bool1 = true;
    c.a(paramException, "Exception must not be null");
    synchronized (a)
    {
      boolean bool2 = c;
      if (bool2)
      {
        bool1 = false;
        Object localObject2 = null;
        return bool1;
      }
      bool2 = true;
      c = bool2;
      e = paramException;
      ??? = b;
      ((g)???).a(this);
    }
  }
}


/* Location:              com/google/android/gms/c/h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */