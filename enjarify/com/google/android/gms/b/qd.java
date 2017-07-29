package com.google.android.gms.b;

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

public final class qd
{
  final Map a;
  final Set b;
  final PriorityBlockingQueue c;
  List d;
  private AtomicInteger e;
  private final PriorityBlockingQueue f;
  private final dz g;
  private final ka h;
  private final sf i;
  private lb[] j;
  private gl k;
  
  private qd(dz paramdz, ka paramka)
  {
    this(paramdz, paramka, localje);
  }
  
  public qd(dz paramdz, ka paramka, byte paramByte)
  {
    this(paramdz, paramka);
  }
  
  private qd(dz paramdz, ka paramka, sf paramsf)
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
    g = paramdz;
    h = paramka;
    localObject = new lb[4];
    j = ((lb[])localObject);
    i = paramsf;
  }
  
  public final pc a(pc parampc)
  {
    f = this;
    boolean bool;
    synchronized (b)
    {
      Object localObject2 = b;
      ((Set)localObject2).add(parampc);
      localObject2 = Integer.valueOf(e.incrementAndGet());
      e = ((Integer)localObject2);
      localObject2 = "add-to-queue";
      parampc.a((String)localObject2);
      bool = g;
      if (!bool)
      {
        localObject2 = f;
        ((PriorityBlockingQueue)localObject2).add(parampc);
        return parampc;
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
          ((Queue)localObject4).add(parampc);
          localObject7 = a;
          ((Map)localObject7).put(str, localObject4);
          bool = vs.b;
          if (bool)
          {
            localObject4 = "Request for cacheKey=%s is in flight, putting on hold.";
            m = 1;
            localObject7 = new Object[m];
            localObject7[0] = str;
            vs.a((String)localObject4, (Object[])localObject7);
          }
        }
      }
      Object localObject6 = a;
      int m = 0;
      Object localObject7 = null;
      ((Map)localObject6).put(str, null);
      localObject6 = c;
      ((PriorityBlockingQueue)localObject6).add(parampc);
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
      ((gl)localObject1).interrupt();
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
        ((lb)localObject2).interrupt();
      }
      n += 1;
    }
    localObject1 = new com/google/android/gms/b/gl;
    Object localObject2 = c;
    Object localObject3 = f;
    dz localdz = g;
    sf localsf = i;
    ((gl)localObject1).<init>((BlockingQueue)localObject2, (BlockingQueue)localObject3, localdz, localsf);
    k = ((gl)localObject1);
    localObject1 = k;
    ((gl)localObject1).start();
    for (;;)
    {
      localObject1 = j;
      n = localObject1.length;
      if (m >= n) {
        break;
      }
      localObject1 = new com/google/android/gms/b/lb;
      localObject2 = f;
      localObject3 = h;
      localdz = g;
      localsf = i;
      ((lb)localObject1).<init>((BlockingQueue)localObject2, (ka)localObject3, localdz, localsf);
      localObject2 = j;
      localObject2[m] = localObject1;
      ((lb)localObject1).start();
      m += 1;
    }
  }
}


/* Location:              com/google/android/gms/b/qd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */