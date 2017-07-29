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
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class qd
{
  final Map<String, Queue<pc<?>>> a = new HashMap();
  final Set<pc<?>> b = new HashSet();
  final PriorityBlockingQueue<pc<?>> c = new PriorityBlockingQueue();
  List<Object> d = new ArrayList();
  private AtomicInteger e = new AtomicInteger();
  private final PriorityBlockingQueue<pc<?>> f = new PriorityBlockingQueue();
  private final dz g;
  private final ka h;
  private final sf i;
  private lb[] j;
  private gl k;
  
  private qd(dz paramdz, ka paramka)
  {
    this(paramdz, paramka, new je(new Handler(Looper.getMainLooper())));
  }
  
  public qd(dz paramdz, ka paramka, byte paramByte)
  {
    this(paramdz, paramka);
  }
  
  private qd(dz paramdz, ka paramka, sf paramsf)
  {
    g = paramdz;
    h = paramka;
    j = new lb[4];
    i = paramsf;
  }
  
  public final <T> pc<T> a(pc<T> parampc)
  {
    f = this;
    synchronized (b)
    {
      b.add(parampc);
      e = Integer.valueOf(e.incrementAndGet());
      parampc.a("add-to-queue");
      if (!g)
      {
        f.add(parampc);
        return parampc;
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
          ((Queue)???).add(parampc);
          a.put(str, ???);
          if (vs.b) {
            vs.a("Request for cacheKey=%s is in flight, putting on hold.", new Object[] { str });
          }
          return parampc;
        }
      }
      a.put(str, null);
      c.add(parampc);
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
      ((gl)localObject).interrupt();
    }
    int m = 0;
    while (m < j.length)
    {
      if (j[m] != null)
      {
        localObject = j[m];
        a = true;
        ((lb)localObject).interrupt();
      }
      m += 1;
    }
    k = new gl(c, f, g, i);
    k.start();
    m = n;
    while (m < j.length)
    {
      localObject = new lb(f, h, g, i);
      j[m] = localObject;
      ((lb)localObject).start();
      m += 1;
    }
  }
}


/* Location:              com/google/android/gms/b/qd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */