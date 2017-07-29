package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.v.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

public final class t
  extends com.google.android.gms.common.api.c
  implements ac.a
{
  ac a = null;
  final Looper b;
  final Queue<f.a<?, ?>> c = new LinkedList();
  z d;
  final Map<a.d<?>, a.f> e;
  Set<Scope> f = new HashSet();
  final p g;
  final Map<com.google.android.gms.common.api.a<?>, Boolean> h;
  final a.b<? extends ec, ed> i;
  Set<as> j = null;
  final at k;
  private final Lock l;
  private boolean m;
  private final com.google.android.gms.common.internal.v n;
  private final int o;
  private final Context p;
  private volatile boolean q;
  private long r = 120000L;
  private long s = 5000L;
  private final a t;
  private final com.google.android.gms.common.c u;
  private final ai v = new ai();
  private final ArrayList<i> w;
  private Integer x = null;
  private final v.a y = new v.a()
  {
    public final boolean b()
    {
      t localt = t.this;
      return (a != null) && (a.c());
    }
  };
  
  public t(Context arg1, Lock paramLock, Looper paramLooper, p paramp, com.google.android.gms.common.c paramc, a.b<? extends ec, ed> paramb, Map<com.google.android.gms.common.api.a<?>, Boolean> paramMap, List<c.b> paramList, List<c.c> paramList1, Map<a.d<?>, a.f> paramMap1, int paramInt1, int paramInt2, ArrayList<i> paramArrayList)
  {
    p = ???;
    l = paramLock;
    m = false;
    n = new com.google.android.gms.common.internal.v(paramLooper, y);
    b = paramLooper;
    t = new a(paramLooper);
    u = paramc;
    o = paramInt1;
    if (o >= 0) {
      x = Integer.valueOf(paramInt2);
    }
    h = paramMap;
    e = paramMap1;
    w = paramArrayList;
    k = new at(e);
    paramLock = paramList.iterator();
    while (paramLock.hasNext())
    {
      paramLooper = (c.b)paramLock.next();
      paramc = n;
      com.google.android.gms.common.internal.c.a(paramLooper);
      synchronized (i)
      {
        if (b.contains(paramLooper))
        {
          paramMap = String.valueOf(paramLooper);
          Log.w("GmsClientEvents", String.valueOf(paramMap).length() + 62 + "registerConnectionCallbacks(): listener " + paramMap + " is already registered");
          if (a.b()) {
            h.sendMessage(h.obtainMessage(1, paramLooper));
          }
        }
        else
        {
          b.add(paramLooper);
        }
      }
    }
    ??? = paramList1.iterator();
    while (???.hasNext())
    {
      paramLock = (c.c)???.next();
      n.a(paramLock);
    }
    g = paramp;
    i = paramb;
  }
  
  public static int a(Iterable<a.f> paramIterable)
  {
    paramIterable = paramIterable.iterator();
    int i1 = 0;
    if (paramIterable.hasNext())
    {
      if (!((a.f)paramIterable.next()).d()) {
        break label48;
      }
      i1 = 1;
    }
    label48:
    for (;;)
    {
      break;
      if (i1 != 0) {
        return 1;
      }
      return 3;
    }
  }
  
  private void a(int paramInt)
  {
    if (x == null) {
      x = Integer.valueOf(paramInt);
    }
    while (a != null)
    {
      return;
      if (x.intValue() != paramInt)
      {
        localObject = String.valueOf(b(paramInt));
        String str = String.valueOf(b(x.intValue()));
        throw new IllegalStateException(String.valueOf(localObject).length() + 51 + String.valueOf(str).length() + "Cannot use sign-in mode: " + (String)localObject + ". Mode was already set to " + str);
      }
    }
    Object localObject = e.values().iterator();
    paramInt = 0;
    if (((Iterator)localObject).hasNext())
    {
      if (!((a.f)((Iterator)localObject).next()).d()) {
        break label420;
      }
      paramInt = 1;
    }
    label420:
    for (;;)
    {
      break;
      switch (x.intValue())
      {
      }
      while (m)
      {
        a = new m(p, l, b, u, e, g, h, i, w, this, false);
        return;
        if (paramInt == 0)
        {
          throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
          if (paramInt != 0)
          {
            if (m)
            {
              a = new m(p, l, b, u, e, g, h, i, w, this, true);
              return;
            }
            a = k.a(p, this, l, b, u, e, g, h, i, w);
            return;
          }
        }
      }
      a = new v(p, this, l, b, u, e, g, h, i, w, this);
      return;
    }
  }
  
  private static String b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "UNKNOWN";
    case 3: 
      return "SIGN_IN_MODE_NONE";
    case 1: 
      return "SIGN_IN_MODE_REQUIRED";
    }
    return "SIGN_IN_MODE_OPTIONAL";
  }
  
  private void h()
  {
    n.e = true;
    a.a();
  }
  
  public final Looper a()
  {
    return b;
  }
  
  public final <A extends a.c, T extends f.a<? extends g, A>> T a(T paramT)
  {
    boolean bool;
    if (a != null)
    {
      bool = true;
      com.google.android.gms.common.internal.c.b(bool, "This task can not be executed (it's probably a Batch or malformed)");
      bool = e.containsKey(a);
      if (b == null) {
        break label129;
      }
    }
    label129:
    for (Object localObject = b.a;; localObject = "the API")
    {
      com.google.android.gms.common.internal.c.b(bool, String.valueOf(localObject).length() + 65 + "GoogleApiClient is not configured to use " + (String)localObject + " required for this call.");
      l.lock();
      try
      {
        if (a != null) {
          break label136;
        }
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
      }
      finally
      {
        l.unlock();
      }
      bool = false;
      break;
    }
    label136:
    if (q)
    {
      c.add(paramT);
      while (!c.isEmpty())
      {
        localObject = (f.a)c.remove();
        k.a((h)localObject);
        ((f.a)localObject).a(Status.c);
      }
      l.unlock();
      return paramT;
    }
    paramT = a.a(paramT);
    l.unlock();
    return paramT;
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    if ((paramInt == 1) && (!paramBoolean) && (!q))
    {
      q = true;
      if (d == null) {
        d = com.google.android.gms.common.c.a(p.getApplicationContext(), new b(this));
      }
      t.sendMessageDelayed(t.obtainMessage(1), r);
      t.sendMessageDelayed(t.obtainMessage(2), s);
    }
    ??? = (h[])k.c.toArray(at.b);
    int i2 = ???.length;
    int i1 = 0;
    while (i1 < i2)
    {
      ???[i1].b(at.a);
      i1 += 1;
    }
    com.google.android.gms.common.internal.v localv = n;
    if (Looper.myLooper() == h.getLooper()) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      com.google.android.gms.common.internal.c.a(paramBoolean, "onUnintentionalDisconnection must only be called on the Handler thread");
      h.removeMessages(1);
      synchronized (i)
      {
        g = true;
        Object localObject3 = new ArrayList(b);
        i1 = f.get();
        localObject3 = ((ArrayList)localObject3).iterator();
        c.b localb;
        do
        {
          if (!((Iterator)localObject3).hasNext()) {
            break;
          }
          localb = (c.b)((Iterator)localObject3).next();
          if ((!e) || (f.get() != i1)) {
            break;
          }
        } while (!b.contains(localb));
        localb.a(paramInt);
      }
    }
    c.clear();
    g = false;
    n.a();
    if (paramInt == 2) {
      h();
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    boolean bool2 = true;
    while (!c.isEmpty()) {
      a((f.a)c.remove());
    }
    com.google.android.gms.common.internal.v localv = n;
    boolean bool1;
    if (Looper.myLooper() == h.getLooper())
    {
      bool1 = true;
      com.google.android.gms.common.internal.c.a(bool1, "onConnectionSuccess must only be called on the Handler thread");
    }
    for (;;)
    {
      synchronized (i)
      {
        if (g) {
          break label241;
        }
        bool1 = true;
        com.google.android.gms.common.internal.c.a(bool1);
        h.removeMessages(1);
        g = true;
        if (c.size() != 0) {
          break label246;
        }
        bool1 = bool2;
        com.google.android.gms.common.internal.c.a(bool1);
        Object localObject2 = new ArrayList(b);
        int i1 = f.get();
        localObject2 = ((ArrayList)localObject2).iterator();
        if (!((Iterator)localObject2).hasNext()) {
          break label251;
        }
        c.b localb = (c.b)((Iterator)localObject2).next();
        if ((!e) || (!a.b()) || (f.get() != i1)) {
          break label251;
        }
        if (c.contains(localb)) {
          continue;
        }
        localb.a(paramBundle);
      }
      bool1 = false;
      break;
      label241:
      bool1 = false;
      continue;
      label246:
      bool1 = false;
    }
    label251:
    c.clear();
    g = false;
  }
  
  public final void a(as paramas)
  {
    l.lock();
    try
    {
      if (j == null) {
        j = new HashSet();
      }
      j.add(paramas);
      return;
    }
    finally
    {
      l.unlock();
    }
  }
  
  public final void a(com.google.android.gms.common.a parama)
  {
    if (!u.b(p, c)) {
      e();
    }
    com.google.android.gms.common.internal.v localv;
    boolean bool;
    if (!q)
    {
      localv = n;
      if (Looper.myLooper() != h.getLooper()) {
        break label161;
      }
      bool = true;
      com.google.android.gms.common.internal.c.a(bool, "onConnectionFailure must only be called on the Handler thread");
      h.removeMessages(1);
    }
    for (;;)
    {
      synchronized (i)
      {
        Object localObject2 = new ArrayList(d);
        int i1 = f.get();
        localObject2 = ((ArrayList)localObject2).iterator();
        if (((Iterator)localObject2).hasNext())
        {
          c.c localc = (c.c)((Iterator)localObject2).next();
          if ((!e) || (f.get() != i1))
          {
            n.a();
            return;
            label161:
            bool = false;
            break;
          }
          if (!d.contains(localc)) {
            continue;
          }
          localc.a(parama);
        }
      }
    }
  }
  
  public final void a(c.c paramc)
  {
    n.a(paramc);
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.append(paramString).append("mContext=").println(p);
    paramPrintWriter.append(paramString).append("mResuming=").print(q);
    paramPrintWriter.append(" mWorkQueue.size()=").print(c.size());
    at localat = k;
    paramPrintWriter.append(" mUnconsumedApiCalls.size()=").println(c.size());
    if (a != null) {
      a.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public final void b()
  {
    boolean bool2 = false;
    l.lock();
    do
    {
      for (;;)
      {
        try
        {
          if (o >= 0) {
            if (x != null)
            {
              bool1 = true;
              com.google.android.gms.common.internal.c.a(bool1, "Sign-in mode should have been set explicitly by auto-manage.");
              i1 = x.intValue();
              l.lock();
              if ((i1 != 3) && (i1 != 1))
              {
                bool1 = bool2;
                if (i1 != 2) {}
              }
              else
              {
                bool1 = true;
              }
            }
          }
        }
        finally
        {
          boolean bool1;
          int i1;
          l.unlock();
        }
        try
        {
          com.google.android.gms.common.internal.c.b(bool1, 33 + "Illegal sign-in mode: " + i1);
          a(i1);
          h();
          l.unlock();
          l.unlock();
          return;
        }
        finally
        {
          l.unlock();
        }
        bool1 = false;
        continue;
        if (x != null) {
          break;
        }
        x = Integer.valueOf(a(e.values()));
      }
    } while (x.intValue() != 2);
    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
  }
  
  public final void b(as paramas)
  {
    l.lock();
    for (;;)
    {
      try
      {
        if (j == null)
        {
          Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
          return;
        }
        if (!j.remove(paramas))
        {
          Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
          continue;
        }
        if (f()) {
          continue;
        }
      }
      finally
      {
        l.unlock();
      }
      a.d();
    }
  }
  
  public final void b(c.c paramc)
  {
    com.google.android.gms.common.internal.v localv = n;
    com.google.android.gms.common.internal.c.a(paramc);
    synchronized (i)
    {
      if (!d.remove(paramc))
      {
        paramc = String.valueOf(paramc);
        Log.w("GmsClientEvents", String.valueOf(paramc).length() + 57 + "unregisterConnectionFailedListener(): listener " + paramc + " not found");
      }
      return;
    }
  }
  
  public final void c()
  {
    l.lock();
    Object localObject3;
    try
    {
      k.a();
      if (a != null) {
        a.b();
      }
      ai localai = v;
      localObject3 = a.iterator();
      while (((Iterator)localObject3).hasNext()) {
        nexta = null;
      }
      a.clear();
    }
    finally
    {
      l.unlock();
    }
    Object localObject2 = c.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (f.a)((Iterator)localObject2).next();
      ((f.a)localObject3).a(null);
      ((f.a)localObject3).b();
    }
    c.clear();
    localObject2 = a;
    if (localObject2 == null)
    {
      l.unlock();
      return;
    }
    e();
    n.a();
    l.unlock();
  }
  
  final boolean e()
  {
    if (!q) {
      return false;
    }
    q = false;
    t.removeMessages(2);
    t.removeMessages(1);
    if (d != null)
    {
      d.a();
      d = null;
    }
    return true;
  }
  
  final boolean f()
  {
    boolean bool1 = false;
    l.lock();
    try
    {
      Set localSet = j;
      if (localSet == null) {
        return false;
      }
      boolean bool2 = j.isEmpty();
      if (!bool2) {
        bool1 = true;
      }
      return bool1;
    }
    finally
    {
      l.unlock();
    }
  }
  
  final String g()
  {
    StringWriter localStringWriter = new StringWriter();
    a("", null, new PrintWriter(localStringWriter), null);
    return localStringWriter.toString();
  }
  
  final class a
    extends Handler
  {
    a(Looper paramLooper)
    {
      super();
    }
    
    public final void handleMessage(Message paramMessage)
    {
      switch (what)
      {
      default: 
        int i = what;
        Log.w("GoogleApiClientImpl", 31 + "Unknown message id: " + i);
        return;
      case 1: 
        t.b(t.this);
        return;
      }
      t.a(t.this);
    }
  }
  
  static final class b
    extends z.a
  {
    private WeakReference<t> a;
    
    b(t paramt)
    {
      a = new WeakReference(paramt);
    }
    
    public final void a()
    {
      t localt = (t)a.get();
      if (localt == null) {
        return;
      }
      t.a(localt);
    }
  }
}


/* Location:              com/google/android/gms/b/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */