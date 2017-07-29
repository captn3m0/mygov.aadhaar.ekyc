package com.google.android.gms.b;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@qi
public class uw<T>
  implements uv<T>
{
  private final Object a = new Object();
  protected int b = 0;
  protected final BlockingQueue<a> c = new LinkedBlockingQueue();
  protected T d;
  
  public void a()
  {
    synchronized (a)
    {
      if (b != 0) {
        throw new UnsupportedOperationException();
      }
    }
    b = -1;
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext()) {
      nextb.a();
    }
    c.clear();
  }
  
  public void a(uv.c<T> paramc, uv.a parama)
  {
    for (;;)
    {
      synchronized (a)
      {
        if (b == 1)
        {
          paramc.a(d);
          return;
        }
        if (b == -1) {
          parama.a();
        }
      }
      if (b == 0) {
        c.add(new a(paramc, parama));
      }
    }
  }
  
  public void a(T paramT)
  {
    synchronized (a)
    {
      if (b != 0) {
        throw new UnsupportedOperationException();
      }
    }
    d = paramT;
    b = 1;
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext()) {
      nexta.a(paramT);
    }
    c.clear();
  }
  
  public int b()
  {
    return b;
  }
  
  final class a
  {
    public final uv.a b;
    
    public a()
    {
      uv.a locala;
      b = locala;
    }
  }
}


/* Location:              com/google/android/gms/b/uw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */