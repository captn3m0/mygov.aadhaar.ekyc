package com.a.a;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class m
{
  final Map<String, Queue<l<?>>> a = new HashMap();
  final Set<l<?>> b = new HashSet();
  final PriorityBlockingQueue<l<?>> c = new PriorityBlockingQueue();
  List<Object> d = new ArrayList();
  private AtomicInteger e = new AtomicInteger();
  private final PriorityBlockingQueue<l<?>> f = new PriorityBlockingQueue();
  private final b g;
  private final f h;
  private final o i;
  private g[] j;
  private c k;
  
  private m(b paramb, f paramf)
  {
    this(paramb, paramf, new e(new Handler(Looper.getMainLooper())));
  }
  
  public m(b paramb, f paramf, byte paramByte)
  {
    this(paramb, paramf);
  }
  
  private m(b paramb, f paramf, o paramo)
  {
    g = paramb;
    h = paramf;
    j = new g[4];
    i = paramo;
  }
  
  public final <T> l<T> a(l<T> paraml)
  {
    f = this;
    synchronized (b)
    {
      b.add(paraml);
      e = Integer.valueOf(e.incrementAndGet());
      paraml.a("add-to-queue");
      if (!g)
      {
        f.add(paraml);
        return paraml;
      }
    }
    for (;;)
    {
      String str;
      synchronized (a)
      {
        str = b;
        if (a.containsKey(str))
        {
          Queue localQueue = (Queue)a.get(str);
          ??? = localQueue;
          if (localQueue == null) {
            ??? = new LinkedList();
          }
          ((Queue)???).add(paraml);
          a.put(str, ???);
          if (t.b) {
            t.a("Request for cacheKey=%s is in flight, putting on hold.", new Object[] { str });
          }
          return paraml;
        }
      }
      a.put(str, null);
      c.add(paraml);
    }
  }
  
  public final void a()
  {
    int n = 0;
    Object localObject;
    if (k != null)
    {
      localObject = k;
      a = true;
      ((c)localObject).interrupt();
    }
    int m = 0;
    while (m < j.length)
    {
      if (j[m] != null)
      {
        localObject = j[m];
        a = true;
        ((g)localObject).interrupt();
      }
      m += 1;
    }
    k = new c(c, f, g, i);
    k.start();
    m = n;
    while (m < j.length)
    {
      localObject = new g(f, h, g, i);
      j[m] = localObject;
      ((g)localObject).start();
      m += 1;
    }
  }
}


/* Location:              com/a/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */