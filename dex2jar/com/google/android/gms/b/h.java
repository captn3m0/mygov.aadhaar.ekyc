package com.google.android.gms.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
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

public abstract class h<R extends g>
  extends d<R>
{
  static final ThreadLocal<Boolean> c = new ThreadLocal() {};
  private final CountDownLatch a = new CountDownLatch(1);
  private com.google.android.gms.common.api.h<? super R> b;
  final Object d = new Object();
  protected final a<R> e;
  protected final WeakReference<com.google.android.gms.common.api.c> f;
  final ArrayList<d.a> g = new ArrayList();
  private final AtomicReference<at.a> h = new AtomicReference();
  private R i;
  private Status j;
  private b k;
  private volatile boolean l;
  private boolean m;
  private boolean n;
  private aa o;
  private volatile as<R> p;
  private boolean q = false;
  
  @Deprecated
  h()
  {
    e = new a(Looper.getMainLooper());
    f = new WeakReference(null);
  }
  
  @Deprecated
  protected h(Looper paramLooper)
  {
    e = new a(paramLooper);
    f = new WeakReference(null);
  }
  
  protected h(com.google.android.gms.common.api.c paramc)
  {
    if (paramc != null) {}
    for (Looper localLooper = paramc.a();; localLooper = Looper.getMainLooper())
    {
      e = new a(localLooper);
      f = new WeakReference(paramc);
      return;
    }
  }
  
  public static void b(g paramg)
  {
    if ((paramg instanceof f)) {}
  }
  
  private void c(R paramR)
  {
    i = paramR;
    o = null;
    a.countDown();
    j = i.a();
    if (m) {
      b = null;
    }
    for (;;)
    {
      paramR = g.iterator();
      while (paramR.hasNext()) {
        ((d.a)paramR.next()).a();
      }
      if (b == null)
      {
        if ((i instanceof f)) {
          k = new b((byte)0);
        }
      }
      else
      {
        e.removeMessages(2);
        e.a(b, f());
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
  
  private R f()
  {
    boolean bool = true;
    synchronized (d)
    {
      if (!l)
      {
        com.google.android.gms.common.internal.c.a(bool, "Result has already been consumed.");
        com.google.android.gms.common.internal.c.a(a(), "Result is not ready.");
        g localg = i;
        i = null;
        b = null;
        l = true;
        ??? = (at.a)h.getAndSet(null);
        if (??? != null) {
          ((at.a)???).a(this);
        }
        return localg;
      }
      bool = false;
    }
  }
  
  public final void a(at.a parama)
  {
    h.set(parama);
  }
  
  public final void a(R paramR)
  {
    boolean bool2 = true;
    for (;;)
    {
      synchronized (d)
      {
        if ((!n) && (!m))
        {
          if ((!a()) || (!a()))
          {
            bool1 = true;
            com.google.android.gms.common.internal.c.a(bool1, "Results have already been set");
            if (l) {
              break label86;
            }
            bool1 = bool2;
            com.google.android.gms.common.internal.c.a(bool1, "Result has already been consumed");
            c(paramR);
          }
        }
        else {
          return;
        }
      }
      boolean bool1 = false;
      continue;
      label86:
      bool1 = false;
    }
  }
  
  public final void a(com.google.android.gms.common.api.h<? super R> paramh)
  {
    boolean bool2 = true;
    Object localObject = d;
    if (paramh == null) {}
    try
    {
      b = null;
      return;
    }
    finally {}
    if (!l)
    {
      bool1 = true;
      com.google.android.gms.common.internal.c.a(bool1, "Result has already been consumed.");
      if (p != null) {
        break label76;
      }
    }
    label76:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      com.google.android.gms.common.internal.c.a(bool1, "Cannot set callbacks if then() has been called.");
      if (!e()) {
        break label81;
      }
      return;
      bool1 = false;
      break;
    }
    label81:
    if (a()) {
      e.a(paramh, f());
    }
    for (;;)
    {
      return;
      b = paramh;
    }
  }
  
  public final boolean a()
  {
    return a.getCount() == 0L;
  }
  
  public final void b()
  {
    synchronized (d)
    {
      if ((m) || (l)) {
        return;
      }
      m = true;
      c(c(Status.e));
      return;
    }
  }
  
  public final void b(Status paramStatus)
  {
    synchronized (d)
    {
      if (!a())
      {
        a(c(paramStatus));
        n = true;
      }
      return;
    }
  }
  
  protected abstract R c(Status paramStatus);
  
  public final boolean c()
  {
    synchronized (d)
    {
      if (((com.google.android.gms.common.api.c)f.get() == null) || (!q)) {
        b();
      }
      boolean bool = e();
      return bool;
    }
  }
  
  public final void d()
  {
    if ((q) || (((Boolean)c.get()).booleanValue())) {}
    for (boolean bool = true;; bool = false)
    {
      q = bool;
      return;
    }
  }
  
  public static final class a<R extends g>
    extends Handler
  {
    public a()
    {
      this(Looper.getMainLooper());
    }
    
    public a(Looper paramLooper)
    {
      super();
    }
    
    public final void a(com.google.android.gms.common.api.h<? super R> paramh, R paramR)
    {
      sendMessage(obtainMessage(1, new Pair(paramh, paramR)));
    }
    
    public final void handleMessage(Message paramMessage)
    {
      switch (what)
      {
      default: 
        int i = what;
        Log.wtf("BasePendingResult", 45 + "Don't know how to handle message: " + i, new Exception());
        return;
      case 1: 
        Object localObject = (Pair)obj;
        paramMessage = (com.google.android.gms.common.api.h)first;
        localObject = (g)second;
        try
        {
          paramMessage.a((g)localObject);
          return;
        }
        catch (RuntimeException paramMessage)
        {
          h.b((g)localObject);
          throw paramMessage;
        }
      }
      ((h)obj).b(Status.d);
    }
  }
  
  private final class b
  {
    private b() {}
    
    protected final void finalize()
    {
      h.b(h.a(h.this));
      super.finalize();
    }
  }
}


/* Location:              com/google/android/gms/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */