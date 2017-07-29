package com.google.android.gms.b;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.d.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.aa;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public abstract class h
  extends d
{
  static final ThreadLocal c;
  private final CountDownLatch a;
  private com.google.android.gms.common.api.h b;
  final Object d;
  protected final h.a e;
  protected final WeakReference f;
  final ArrayList g;
  private final AtomicReference h;
  private g i;
  private Status j;
  private h.b k;
  private volatile boolean l;
  private boolean m;
  private boolean n;
  private aa o;
  private volatile as p;
  private boolean q;
  
  static
  {
    h.1 local1 = new com/google/android/gms/b/h$1;
    local1.<init>();
    c = local1;
  }
  
  h()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    d = localObject;
    localObject = new java/util/concurrent/CountDownLatch;
    ((CountDownLatch)localObject).<init>(1);
    a = ((CountDownLatch)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    g = ((ArrayList)localObject);
    localObject = new java/util/concurrent/atomic/AtomicReference;
    ((AtomicReference)localObject).<init>();
    h = ((AtomicReference)localObject);
    q = false;
    localObject = new com/google/android/gms/b/h$a;
    Looper localLooper = Looper.getMainLooper();
    ((h.a)localObject).<init>(localLooper);
    e = ((h.a)localObject);
    localObject = new java/lang/ref/WeakReference;
    ((WeakReference)localObject).<init>(null);
    f = ((WeakReference)localObject);
  }
  
  protected h(Looper paramLooper)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    d = localObject;
    localObject = new java/util/concurrent/CountDownLatch;
    ((CountDownLatch)localObject).<init>(1);
    a = ((CountDownLatch)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    g = ((ArrayList)localObject);
    localObject = new java/util/concurrent/atomic/AtomicReference;
    ((AtomicReference)localObject).<init>();
    h = ((AtomicReference)localObject);
    q = false;
    localObject = new com/google/android/gms/b/h$a;
    ((h.a)localObject).<init>(paramLooper);
    e = ((h.a)localObject);
    localObject = new java/lang/ref/WeakReference;
    ((WeakReference)localObject).<init>(null);
    f = ((WeakReference)localObject);
  }
  
  protected h(com.google.android.gms.common.api.c paramc)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    d = localObject;
    localObject = new java/util/concurrent/CountDownLatch;
    int i1 = 1;
    ((CountDownLatch)localObject).<init>(i1);
    a = ((CountDownLatch)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    g = ((ArrayList)localObject);
    localObject = new java/util/concurrent/atomic/AtomicReference;
    ((AtomicReference)localObject).<init>();
    h = ((AtomicReference)localObject);
    localObject = null;
    q = false;
    if (paramc != null) {}
    for (localObject = paramc.a();; localObject = Looper.getMainLooper())
    {
      h.a locala = new com/google/android/gms/b/h$a;
      locala.<init>((Looper)localObject);
      e = locala;
      localObject = new java/lang/ref/WeakReference;
      ((WeakReference)localObject).<init>(paramc);
      f = ((WeakReference)localObject);
      return;
    }
  }
  
  public static void b(g paramg)
  {
    boolean bool = paramg instanceof f;
    if (bool) {}
  }
  
  private void c(g paramg)
  {
    int i1 = 0;
    Object localObject1 = null;
    i = paramg;
    o = null;
    a.countDown();
    Object localObject2 = i.a();
    j = ((Status)localObject2);
    boolean bool = m;
    if (bool) {
      b = null;
    }
    for (;;)
    {
      localObject2 = g;
      localObject1 = ((ArrayList)localObject2).iterator();
      for (;;)
      {
        bool = ((Iterator)localObject1).hasNext();
        if (!bool) {
          break;
        }
        localObject2 = (d.a)((Iterator)localObject1).next();
        ((d.a)localObject2).a();
      }
      localObject2 = b;
      if (localObject2 == null)
      {
        localObject2 = i;
        bool = localObject2 instanceof f;
        if (bool)
        {
          localObject2 = new com/google/android/gms/b/h$b;
          i1 = 0;
          localObject1 = null;
          ((h.b)localObject2).<init>(this, (byte)0);
          k = ((h.b)localObject2);
        }
      }
      else
      {
        localObject2 = e;
        i1 = 2;
        ((h.a)localObject2).removeMessages(i1);
        localObject2 = e;
        localObject1 = b;
        g localg = f();
        ((h.a)localObject2).a((com.google.android.gms.common.api.h)localObject1, localg);
      }
    }
    g.clear();
  }
  
  private boolean e()
  {
    synchronized (d)
    {
      boolean bool = m;
      return bool;
    }
  }
  
  private g f()
  {
    boolean bool1 = true;
    synchronized (d)
    {
      boolean bool2 = l;
      if (!bool2)
      {
        Object localObject2 = "Result has already been consumed.";
        com.google.android.gms.common.internal.c.a(bool1, localObject2);
        bool1 = a();
        localObject2 = "Result is not ready.";
        com.google.android.gms.common.internal.c.a(bool1, localObject2);
        localObject2 = i;
        bool1 = false;
        locala = null;
        i = null;
        bool1 = false;
        locala = null;
        b = null;
        bool1 = true;
        l = bool1;
        locala = (at.a)h.getAndSet(null);
        if (locala != null) {
          locala.a(this);
        }
        return (g)localObject2;
      }
      bool1 = false;
      at.a locala = null;
    }
  }
  
  public final void a(at.a parama)
  {
    h.set(parama);
  }
  
  public final void a(g paramg)
  {
    boolean bool1 = true;
    String str1 = null;
    for (;;)
    {
      synchronized (d)
      {
        bool2 = n;
        if (!bool2)
        {
          bool2 = m;
          if (!bool2)
          {
            bool2 = a();
            if (bool2) {}
            bool2 = a();
            if (bool2) {
              break label113;
            }
            bool2 = bool1;
            String str2 = "Results have already been set";
            com.google.android.gms.common.internal.c.a(bool2, str2);
            bool2 = l;
            if (bool2) {
              break label119;
            }
            str1 = "Result has already been consumed";
            com.google.android.gms.common.internal.c.a(bool1, str1);
            c(paramg);
            return;
          }
        }
      }
      label113:
      boolean bool2 = false;
      continue;
      label119:
      bool1 = false;
      Object localObject3 = null;
    }
  }
  
  public final void a(com.google.android.gms.common.api.h paramh)
  {
    boolean bool1 = true;
    Object localObject1 = null;
    Object localObject2 = d;
    if (paramh == null)
    {
      bool1 = false;
      Object localObject3 = null;
    }
    try
    {
      b = null;
      return;
    }
    finally {}
    boolean bool2 = l;
    label45:
    as localas;
    if (!bool2)
    {
      bool2 = bool1;
      String str = "Result has already been consumed.";
      com.google.android.gms.common.internal.c.a(bool2, str);
      localas = p;
      if (localas != null) {
        break label107;
      }
    }
    label107:
    h.a locala;
    for (;;)
    {
      localObject1 = "Cannot set callbacks if then() has been called.";
      com.google.android.gms.common.internal.c.a(bool1, localObject1);
      bool1 = e();
      if (!bool1) {
        break label115;
      }
      break;
      bool2 = false;
      localas = null;
      break label45;
      bool1 = false;
      locala = null;
    }
    label115:
    bool1 = a();
    if (bool1)
    {
      locala = e;
      localObject1 = f();
      locala.a(paramh, (g)localObject1);
    }
    for (;;)
    {
      break;
      b = paramh;
    }
  }
  
  public final boolean a()
  {
    CountDownLatch localCountDownLatch = a;
    long l1 = localCountDownLatch.getCount();
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localCountDownLatch = null;
    }
  }
  
  public final void b()
  {
    synchronized (d)
    {
      boolean bool = m;
      if (!bool)
      {
        bool = l;
        if (!bool) {}
      }
      else
      {
        return;
      }
      bool = true;
      m = bool;
      Object localObject2 = Status.e;
      localObject2 = c((Status)localObject2);
      c((g)localObject2);
    }
  }
  
  public final void b(Status paramStatus)
  {
    synchronized (d)
    {
      boolean bool = a();
      if (!bool)
      {
        g localg = c(paramStatus);
        a(localg);
        bool = true;
        n = bool;
      }
      return;
    }
  }
  
  protected abstract g c(Status paramStatus);
  
  public final boolean c()
  {
    synchronized (d)
    {
      Object localObject2 = f;
      localObject2 = ((WeakReference)localObject2).get();
      localObject2 = (com.google.android.gms.common.api.c)localObject2;
      if (localObject2 != null)
      {
        bool = q;
        if (bool) {}
      }
      else
      {
        b();
      }
      boolean bool = e();
      return bool;
    }
  }
  
  public final void d()
  {
    boolean bool = q;
    Boolean localBoolean;
    if (!bool)
    {
      localBoolean = (Boolean)c.get();
      bool = localBoolean.booleanValue();
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      q = bool;
      return;
      bool = false;
      localBoolean = null;
    }
  }
}


/* Location:              com/google/android/gms/b/h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */