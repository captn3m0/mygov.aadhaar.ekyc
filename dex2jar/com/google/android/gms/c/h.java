package com.google.android.gms.c;

import com.google.android.gms.common.internal.c;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

public final class h<TResult>
  extends b<TResult>
{
  private final Object a = new Object();
  private final g<TResult> b = new g();
  private boolean c;
  private TResult d;
  private Exception e;
  
  private void c()
  {
    if (!c) {}
    for (boolean bool = true;; bool = false)
    {
      c.a(bool, "Task is already complete");
      return;
    }
  }
  
  public final b<TResult> a(Executor arg1, a<TResult> parama)
  {
    g localg = b;
    parama = new e(???, parama);
    synchronized (a)
    {
      if (b == null) {
        b = new ArrayDeque();
      }
      b.add(parama);
    }
    synchronized (a)
    {
      if (!c)
      {
        return this;
        parama = finally;
        throw parama;
      }
      b.a(this);
      return this;
    }
  }
  
  public final void a(Exception paramException)
  {
    c.a(paramException, "Exception must not be null");
    synchronized (a)
    {
      c();
      c = true;
      e = paramException;
      b.a(this);
      return;
    }
  }
  
  public final void a(TResult paramTResult)
  {
    synchronized (a)
    {
      c();
      c = true;
      d = paramTResult;
      b.a(this);
      return;
    }
  }
  
  public final boolean a()
  {
    for (;;)
    {
      synchronized (a)
      {
        if ((c) && (e == null))
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
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
    c.a(paramException, "Exception must not be null");
    synchronized (a)
    {
      if (c) {
        return false;
      }
      c = true;
      e = paramException;
      b.a(this);
      return true;
    }
  }
}


/* Location:              com/google/android/gms/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */