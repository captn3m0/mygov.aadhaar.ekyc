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
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class m
{
  final Map a;
  final Set b;
  final PriorityBlockingQueue c;
  List d;
  private AtomicInteger e;
  private final PriorityBlockingQueue f;
  private final b g;
  private final f h;
  private final o i;
  private g[] j;
  private c k;
  
  private m(b paramb, f paramf)
  {
    this(paramb, paramf, locale);
  }
  
  public m(b paramb, f paramf, byte paramByte)
  {
    this(paramb, paramf);
  }
  
  private m(b paramb, f paramf, o paramo)
  {
    Object localObject = new java/util/concurrent/atomic/AtomicInteger;
    ((AtomicInteger)localObject).<init>();
    e = ((AtomicInteger)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    a = ((Map)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    b = ((Set)localObject);
    localObject = new java/util/concurrent/PriorityBlockingQueue;
    ((PriorityBlockingQueue)localObject).<init>();
    c = ((PriorityBlockingQueue)localObject);
    localObject = new java/util/concurrent/PriorityBlockingQueue;
    ((PriorityBlockingQueue)localObject).<init>();
    f = ((PriorityBlockingQueue)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    d = ((List)localObject);
    g = paramb;
    h = paramf;
    localObject = new g[4];
    j = ((g[])localObject);
    i = paramo;
  }
  
  public final l a(l paraml)
  {
    f = this;
    boolean bool;
    synchronized (b)
    {
      Object localObject2 = b;
      ((Set)localObject2).add(paraml);
      localObject2 = Integer.valueOf(e.incrementAndGet());
      e = ((Integer)localObject2);
      localObject2 = "add-to-queue";
      paraml.a((String)localObject2);
      bool = g;
      if (!bool)
      {
        localObject2 = f;
        ((PriorityBlockingQueue)localObject2).add(paraml);
        return paraml;
      }
    }
    for (;;)
    {
      String str;
      synchronized (a)
      {
        str = b;
        Object localObject4 = a;
        bool = ((Map)localObject4).containsKey(str);
        if (bool)
        {
          localObject4 = a;
          localObject4 = ((Map)localObject4).get(str);
          localObject4 = (Queue)localObject4;
          if (localObject4 == null)
          {
            localObject4 = new java/util/LinkedList;
            ((LinkedList)localObject4).<init>();
          }
          ((Queue)localObject4).add(paraml);
          localObject7 = a;
          ((Map)localObject7).put(str, localObject4);
          bool = t.b;
          if (bool)
          {
            localObject4 = "Request for cacheKey=%s is in flight, putting on hold.";
            m = 1;
            localObject7 = new Object[m];
            localObject7[0] = str;
            t.a((String)localObject4, (Object[])localObject7);
          }
        }
      }
      Object localObject6 = a;
      int m = 0;
      Object localObject7 = null;
      ((Map)localObject6).put(str, null);
      localObject6 = c;
      ((PriorityBlockingQueue)localObject6).add(paraml);
    }
  }
  
  public final void a()
  {
    boolean bool = true;
    int m = 0;
    Object localObject1 = k;
    if (localObject1 != null)
    {
      localObject1 = k;
      a = bool;
      ((c)localObject1).interrupt();
    }
    int n = 0;
    localObject1 = null;
    for (;;)
    {
      localObject2 = j;
      int i1 = localObject2.length;
      if (n >= i1) {
        break;
      }
      localObject2 = j[n];
      if (localObject2 != null)
      {
        localObject2 = j[n];
        a = bool;
        ((g)localObject2).interrupt();
      }
      n += 1;
    }
    localObject1 = new com/a/a/c;
    Object localObject2 = c;
    Object localObject3 = f;
    b localb = g;
    o localo = i;
    ((c)localObject1).<init>((BlockingQueue)localObject2, (BlockingQueue)localObject3, localb, localo);
    k = ((c)localObject1);
    localObject1 = k;
    ((c)localObject1).start();
    for (;;)
    {
      localObject1 = j;
      n = localObject1.length;
      if (m >= n) {
        break;
      }
      localObject1 = new com/a/a/g;
      localObject2 = f;
      localObject3 = h;
      localb = g;
      localo = i;
      ((g)localObject1).<init>((BlockingQueue)localObject2, (f)localObject3, localb, localo);
      localObject2 = j;
      localObject2[m] = localObject1;
      ((g)localObject1).start();
      m += 1;
    }
  }
}


/* Location:              com/a/a/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */