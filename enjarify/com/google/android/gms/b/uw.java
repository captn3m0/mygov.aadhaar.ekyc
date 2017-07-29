package com.google.android.gms.b;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class uw
  implements uv
{
  private final Object a;
  protected int b;
  protected final BlockingQueue c;
  protected Object d;
  
  public uw()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
    b = 0;
    localObject = new java/util/concurrent/LinkedBlockingQueue;
    ((LinkedBlockingQueue)localObject).<init>();
    c = ((BlockingQueue)localObject);
  }
  
  public void a()
  {
    synchronized (a)
    {
      i = b;
      if (i != 0)
      {
        UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
        localUnsupportedOperationException.<init>();
        throw localUnsupportedOperationException;
      }
    }
    int i = -1;
    b = i;
    Object localObject3 = c;
    Iterator localIterator = ((BlockingQueue)localObject3).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject3 = localIterator.next();
      localObject3 = (uw.a)localObject3;
      localObject3 = b;
      ((uv.a)localObject3).a();
    }
    localObject3 = c;
    ((BlockingQueue)localObject3).clear();
  }
  
  public void a(uv.c paramc, uv.a parama)
  {
    for (;;)
    {
      synchronized (a)
      {
        i = b;
        int j = 1;
        if (i == j)
        {
          Object localObject2 = d;
          paramc.a(localObject2);
          return;
        }
        i = b;
        j = -1;
        if (i == j) {
          parama.a();
        }
      }
      int i = b;
      if (i == 0)
      {
        BlockingQueue localBlockingQueue = c;
        uw.a locala = new com/google/android/gms/b/uw$a;
        locala.<init>(paramc, parama);
        localBlockingQueue.add(locala);
      }
    }
  }
  
  public void a(Object paramObject)
  {
    synchronized (a)
    {
      i = b;
      if (i != 0)
      {
        UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
        localUnsupportedOperationException.<init>();
        throw localUnsupportedOperationException;
      }
    }
    d = paramObject;
    int i = 1;
    b = i;
    Object localObject3 = c;
    Iterator localIterator = ((BlockingQueue)localObject3).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject3 = localIterator.next();
      localObject3 = (uw.a)localObject3;
      localObject3 = a;
      ((uv.c)localObject3).a(paramObject);
    }
    localObject3 = c;
    ((BlockingQueue)localObject3).clear();
  }
  
  public int b()
  {
    return b;
  }
}


/* Location:              com/google/android/gms/b/uw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */