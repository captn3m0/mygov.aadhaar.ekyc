package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.o.f;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.p.a;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.common.internal.z.a;
import com.google.android.gms.common.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

public final class r
  implements u
{
  final v a;
  final Lock b;
  final Context c;
  final m d;
  ec e;
  boolean f;
  boolean g;
  z h;
  boolean i;
  boolean j;
  final p k;
  private com.google.android.gms.common.a l;
  private int m;
  private int n = 0;
  private int o;
  private final Bundle p = new Bundle();
  private final Set<a.d> q = new HashSet();
  private boolean r;
  private final Map<com.google.android.gms.common.api.a<?>, Boolean> s;
  private final a.b<? extends ec, ed> t;
  private ArrayList<Future<?>> u = new ArrayList();
  
  public r(v paramv, p paramp, Map<com.google.android.gms.common.api.a<?>, Boolean> paramMap, m paramm, a.b<? extends ec, ed> paramb, Lock paramLock, Context paramContext)
  {
    a = paramv;
    k = paramp;
    s = paramMap;
    d = paramm;
    t = paramb;
    b = paramLock;
    c = paramContext;
  }
  
  private void a(boolean paramBoolean)
  {
    if (e != null)
    {
      if ((e.b()) && (paramBoolean)) {
        e.h();
      }
      e.a();
      h = null;
    }
  }
  
  private static String c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "UNKNOWN";
    case 0: 
      return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }
    return "STEP_GETTING_REMOTE_SERVICE";
  }
  
  /* Error */
  private void g()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 90	com/google/android/gms/b/r:a	Lcom/google/android/gms/b/v;
    //   4: astore_1
    //   5: aload_1
    //   6: getfield 130	com/google/android/gms/b/v:a	Ljava/util/concurrent/locks/Lock;
    //   9: invokeinterface 135 1 0
    //   14: aload_1
    //   15: getfield 138	com/google/android/gms/b/v:m	Lcom/google/android/gms/b/t;
    //   18: invokevirtual 142	com/google/android/gms/b/t:e	()Z
    //   21: pop
    //   22: aload_1
    //   23: new 144	com/google/android/gms/b/q
    //   26: dup
    //   27: aload_1
    //   28: invokespecial 147	com/google/android/gms/b/q:<init>	(Lcom/google/android/gms/b/v;)V
    //   31: putfield 150	com/google/android/gms/b/v:k	Lcom/google/android/gms/b/u;
    //   34: aload_1
    //   35: getfield 150	com/google/android/gms/b/v:k	Lcom/google/android/gms/b/u;
    //   38: invokeinterface 151 1 0
    //   43: aload_1
    //   44: getfield 154	com/google/android/gms/b/v:b	Ljava/util/concurrent/locks/Condition;
    //   47: invokeinterface 159 1 0
    //   52: aload_1
    //   53: getfield 130	com/google/android/gms/b/v:a	Ljava/util/concurrent/locks/Lock;
    //   56: invokeinterface 162 1 0
    //   61: invokestatic 167	com/google/android/gms/b/w:a	()Ljava/util/concurrent/ExecutorService;
    //   64: new 8	com/google/android/gms/b/r$1
    //   67: dup
    //   68: aload_0
    //   69: invokespecial 170	com/google/android/gms/b/r$1:<init>	(Lcom/google/android/gms/b/r;)V
    //   72: invokeinterface 176 2 0
    //   77: aload_0
    //   78: getfield 108	com/google/android/gms/b/r:e	Lcom/google/android/gms/b/ec;
    //   81: ifnull +32 -> 113
    //   84: aload_0
    //   85: getfield 178	com/google/android/gms/b/r:i	Z
    //   88: ifeq +20 -> 108
    //   91: aload_0
    //   92: getfield 108	com/google/android/gms/b/r:e	Lcom/google/android/gms/b/ec;
    //   95: aload_0
    //   96: getfield 119	com/google/android/gms/b/r:h	Lcom/google/android/gms/common/internal/z;
    //   99: aload_0
    //   100: getfield 180	com/google/android/gms/b/r:j	Z
    //   103: invokeinterface 183 3 0
    //   108: aload_0
    //   109: iconst_0
    //   110: invokespecial 185	com/google/android/gms/b/r:a	(Z)V
    //   113: aload_0
    //   114: getfield 90	com/google/android/gms/b/r:a	Lcom/google/android/gms/b/v;
    //   117: getfield 187	com/google/android/gms/b/v:g	Ljava/util/Map;
    //   120: invokeinterface 193 1 0
    //   125: invokeinterface 199 1 0
    //   130: astore_1
    //   131: aload_1
    //   132: invokeinterface 204 1 0
    //   137: ifeq +49 -> 186
    //   140: aload_1
    //   141: invokeinterface 208 1 0
    //   146: checkcast 210	com/google/android/gms/common/api/a$d
    //   149: astore_2
    //   150: aload_0
    //   151: getfield 90	com/google/android/gms/b/r:a	Lcom/google/android/gms/b/v;
    //   154: getfield 212	com/google/android/gms/b/v:f	Ljava/util/Map;
    //   157: aload_2
    //   158: invokeinterface 216 2 0
    //   163: checkcast 218	com/google/android/gms/common/api/a$f
    //   166: invokeinterface 219 1 0
    //   171: goto -40 -> 131
    //   174: astore_2
    //   175: aload_1
    //   176: getfield 130	com/google/android/gms/b/v:a	Ljava/util/concurrent/locks/Lock;
    //   179: invokeinterface 162 1 0
    //   184: aload_2
    //   185: athrow
    //   186: aload_0
    //   187: getfield 78	com/google/android/gms/b/r:p	Landroid/os/Bundle;
    //   190: invokevirtual 222	android/os/Bundle:isEmpty	()Z
    //   193: ifeq +19 -> 212
    //   196: aconst_null
    //   197: astore_1
    //   198: aload_0
    //   199: getfield 90	com/google/android/gms/b/r:a	Lcom/google/android/gms/b/v;
    //   202: getfield 225	com/google/android/gms/b/v:n	Lcom/google/android/gms/b/ac$a;
    //   205: aload_1
    //   206: invokeinterface 230 2 0
    //   211: return
    //   212: aload_0
    //   213: getfield 78	com/google/android/gms/b/r:p	Landroid/os/Bundle;
    //   216: astore_1
    //   217: goto -19 -> 198
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	220	0	this	r
    //   4	213	1	localObject1	Object
    //   149	9	2	locald	a.d
    //   174	11	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   14	52	174	finally
  }
  
  private void h()
  {
    Iterator localIterator = u.iterator();
    while (localIterator.hasNext()) {
      ((Future)localIterator.next()).cancel(true);
    }
    u.clear();
  }
  
  public final <A extends a.c, T extends f.a<? extends g, A>> T a(T paramT)
  {
    throw new IllegalStateException("GoogleApiClient is not connected yet.");
  }
  
  public final void a()
  {
    a.g.clear();
    f = false;
    l = null;
    n = 0;
    r = true;
    g = false;
    i = false;
    HashMap localHashMap = new HashMap();
    Object localObject = s.keySet().iterator();
    if (((Iterator)localObject).hasNext())
    {
      com.google.android.gms.common.api.a locala = (com.google.android.gms.common.api.a)((Iterator)localObject).next();
      a.f localf = (a.f)a.f.get(locala.b());
      boolean bool = ((Boolean)s.get(locala)).booleanValue();
      if (localf.d())
      {
        f = true;
        if (!bool) {
          break label182;
        }
        q.add(locala.b());
      }
      for (;;)
      {
        localHashMap.put(localf, new a(this, locala, bool));
        break;
        label182:
        r = false;
      }
    }
    if (f)
    {
      k.h = Integer.valueOf(System.identityHashCode(a.m));
      localObject = new e((byte)0);
      e = ((ec)t.a(c, a.m.b, k, k.g, (c.b)localObject, (c.c)localObject));
    }
    o = a.f.size();
    u.add(w.a().submit(new b(localHashMap)));
  }
  
  public final void a(int paramInt)
  {
    b(new com.google.android.gms.common.a(8, null));
  }
  
  public final void a(Bundle paramBundle)
  {
    if (!b(1)) {}
    do
    {
      return;
      if (paramBundle != null) {
        p.putAll(paramBundle);
      }
    } while (!d());
    g();
  }
  
  public final void a(com.google.android.gms.common.a parama, com.google.android.gms.common.api.a<?> parama1, boolean paramBoolean)
  {
    if (!b(1)) {}
    do
    {
      return;
      b(parama, parama1, paramBoolean);
    } while (!d());
    g();
  }
  
  final boolean a(com.google.android.gms.common.a parama)
  {
    return (r) && (!parama.a());
  }
  
  final void b(com.google.android.gms.common.a parama)
  {
    h();
    if (!parama.a()) {}
    for (boolean bool = true;; bool = false)
    {
      a(bool);
      a.a(parama);
      a.n.a(parama);
      return;
    }
  }
  
  final void b(com.google.android.gms.common.a parama, com.google.android.gms.common.api.a<?> parama1, boolean paramBoolean)
  {
    int i2 = 1;
    if (paramBoolean)
    {
      if (parama.a())
      {
        i1 = 1;
        if (i1 == 0) {
          break label109;
        }
      }
    }
    else
    {
      i1 = i2;
      if (l != null) {
        if (Integer.MAX_VALUE >= m) {
          break label109;
        }
      }
    }
    label109:
    for (int i1 = i2;; i1 = 0)
    {
      if (i1 != 0)
      {
        l = parama;
        m = Integer.MAX_VALUE;
      }
      a.g.put(parama1.b(), parama);
      return;
      if (d.b(c) != null)
      {
        i1 = 1;
        break;
      }
      i1 = 0;
      break;
    }
  }
  
  public final boolean b()
  {
    h();
    a(true);
    a.a(null);
    return true;
  }
  
  final boolean b(int paramInt)
  {
    if (n != paramInt)
    {
      Log.w("GoogleApiClientConnecting", a.m.g());
      String str1 = String.valueOf(this);
      Log.w("GoogleApiClientConnecting", String.valueOf(str1).length() + 23 + "Unexpected callback in " + str1);
      int i1 = o;
      Log.w("GoogleApiClientConnecting", 33 + "mRemainingConnections=" + i1);
      str1 = String.valueOf(c(n));
      String str2 = String.valueOf(c(paramInt));
      Log.wtf("GoogleApiClientConnecting", String.valueOf(str1).length() + 70 + String.valueOf(str2).length() + "GoogleApiClient connecting is in step " + str1 + " but received callback for step " + str2, new Exception());
      b(new com.google.android.gms.common.a(8, null));
      return false;
    }
    return true;
  }
  
  public final void c() {}
  
  final boolean d()
  {
    o -= 1;
    if (o > 0) {
      return false;
    }
    if (o < 0)
    {
      Log.w("GoogleApiClientConnecting", a.m.g());
      Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
      b(new com.google.android.gms.common.a(8, null));
      return false;
    }
    if (l != null)
    {
      a.l = m;
      b(l);
      return false;
    }
    return true;
  }
  
  final void e()
  {
    if (o != 0) {}
    ArrayList localArrayList;
    do
    {
      do
      {
        return;
      } while ((f) && (!g));
      localArrayList = new ArrayList();
      n = 1;
      o = a.f.size();
      Iterator localIterator = a.f.keySet().iterator();
      while (localIterator.hasNext())
      {
        a.d locald = (a.d)localIterator.next();
        if (a.g.containsKey(locald))
        {
          if (d()) {
            g();
          }
        }
        else {
          localArrayList.add((a.f)a.f.get(locald));
        }
      }
    } while (localArrayList.isEmpty());
    u.add(w.a().submit(new c(localArrayList)));
  }
  
  final void f()
  {
    f = false;
    a.m.f = Collections.emptySet();
    Iterator localIterator = q.iterator();
    while (localIterator.hasNext())
    {
      a.d locald = (a.d)localIterator.next();
      if (!a.g.containsKey(locald)) {
        a.g.put(locald, new com.google.android.gms.common.a(17, null));
      }
    }
  }
  
  private static final class a
    implements o.f
  {
    final boolean a;
    private final WeakReference<r> b;
    private final com.google.android.gms.common.api.a<?> c;
    
    public a(r paramr, com.google.android.gms.common.api.a<?> parama, boolean paramBoolean)
    {
      b = new WeakReference(paramr);
      c = parama;
      a = paramBoolean;
    }
    
    public final void a(com.google.android.gms.common.a parama)
    {
      boolean bool = false;
      r localr = (r)b.get();
      if (localr == null) {
        return;
      }
      if (Looper.myLooper() == a.m.b) {
        bool = true;
      }
      c.a(bool, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
      b.lock();
      try
      {
        bool = localr.b(0);
        if (!bool) {
          return;
        }
        if (!parama.b()) {
          localr.b(parama, c, a);
        }
        if (localr.d()) {
          localr.e();
        }
        return;
      }
      finally
      {
        b.unlock();
      }
    }
  }
  
  private final class b
    extends r.f
  {
    private final Map<a.f, r.a> c;
    
    public b()
    {
      super((byte)0);
      Map localMap;
      c = localMap;
    }
    
    public final void a()
    {
      final Object localObject = c.keySet().iterator();
      int i = 0;
      a.f localf;
      if (((Iterator)localObject).hasNext())
      {
        localf = (a.f)((Iterator)localObject).next();
        i = 1;
        if (c.get(localf)).a) {}
      }
      for (;;)
      {
        if (i != 0)
        {
          i = d.a(c);
          if (i == 0) {
            break label122;
          }
          localObject = new com.google.android.gms.common.a(i, null);
          a.a(new v.a(r.this)
          {
            public final void a()
            {
              b(localObject);
            }
          });
        }
        for (;;)
        {
          return;
          i = 0;
          break;
          label122:
          if (f) {
            e.i();
          }
          localObject = c.keySet().iterator();
          while (((Iterator)localObject).hasNext())
          {
            localf = (a.f)((Iterator)localObject).next();
            final o.f localf1 = (o.f)c.get(localf);
            if (i != 0) {
              a.a(new v.a(r.this)
              {
                public final void a()
                {
                  localf1.a(new com.google.android.gms.common.a(16, null));
                }
              });
            } else {
              localf.a(localf1);
            }
          }
        }
        i = 1;
        break;
      }
    }
  }
  
  private final class c
    extends r.f
  {
    private final ArrayList<a.f> c;
    
    public c()
    {
      super((byte)0);
      ArrayList localArrayList;
      c = localArrayList;
    }
    
    public final void a()
    {
      t localt = a.m;
      r localr = r.this;
      Object localObject;
      if (k == null) {
        localObject = Collections.emptySet();
      }
      for (;;)
      {
        f = ((Set)localObject);
        localObject = c.iterator();
        while (((Iterator)localObject).hasNext()) {
          ((a.f)((Iterator)localObject).next()).a(h, a.m.f);
        }
        localObject = new HashSet(k.b);
        Map localMap = k.d;
        Iterator localIterator = localMap.keySet().iterator();
        while (localIterator.hasNext())
        {
          com.google.android.gms.common.api.a locala = (com.google.android.gms.common.api.a)localIterator.next();
          if (!a.g.containsKey(locala.b())) {
            ((Set)localObject).addAll(geta);
          }
        }
      }
    }
  }
  
  private static final class d
    extends eg
  {
    private final WeakReference<r> a;
    
    d(r paramr)
    {
      a = new WeakReference(paramr);
    }
    
    public final void a(final eq parameq)
    {
      final r localr = (r)a.get();
      if (localr == null) {
        return;
      }
      a.a(new v.a(localr)
      {
        public final void a()
        {
          r localr = localr;
          Object localObject1 = parameq;
          Object localObject2;
          if (localr.b(0))
          {
            localObject2 = b;
            if (!((com.google.android.gms.common.a)localObject2).b()) {
              break label137;
            }
            localObject2 = c;
            localObject1 = c;
            if (!((com.google.android.gms.common.a)localObject1).b())
            {
              localObject2 = String.valueOf(localObject1);
              Log.wtf("GoogleApiClientConnecting", String.valueOf(localObject2).length() + 48 + "Sign-in succeeded with resolve account failure: " + (String)localObject2, new Exception());
              localr.b((com.google.android.gms.common.a)localObject1);
            }
          }
          else
          {
            return;
          }
          g = true;
          h = z.a.a(b);
          i = d;
          j = e;
          localr.e();
          return;
          label137:
          if (localr.a((com.google.android.gms.common.a)localObject2))
          {
            localr.f();
            localr.e();
            return;
          }
          localr.b((com.google.android.gms.common.a)localObject2);
        }
      });
    }
  }
  
  private final class e
    implements c.b, c.c
  {
    private e() {}
    
    public final void a(int paramInt) {}
    
    public final void a(Bundle paramBundle)
    {
      e.a(new r.d(r.this));
    }
    
    /* Error */
    public final void a(com.google.android.gms.common.a parama)
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 17	com/google/android/gms/b/r$e:a	Lcom/google/android/gms/b/r;
      //   4: getfield 42	com/google/android/gms/b/r:b	Ljava/util/concurrent/locks/Lock;
      //   7: invokeinterface 47 1 0
      //   12: aload_0
      //   13: getfield 17	com/google/android/gms/b/r$e:a	Lcom/google/android/gms/b/r;
      //   16: aload_1
      //   17: invokevirtual 50	com/google/android/gms/b/r:a	(Lcom/google/android/gms/common/a;)Z
      //   20: ifeq +30 -> 50
      //   23: aload_0
      //   24: getfield 17	com/google/android/gms/b/r$e:a	Lcom/google/android/gms/b/r;
      //   27: invokevirtual 53	com/google/android/gms/b/r:f	()V
      //   30: aload_0
      //   31: getfield 17	com/google/android/gms/b/r$e:a	Lcom/google/android/gms/b/r;
      //   34: invokevirtual 55	com/google/android/gms/b/r:e	()V
      //   37: aload_0
      //   38: getfield 17	com/google/android/gms/b/r$e:a	Lcom/google/android/gms/b/r;
      //   41: getfield 42	com/google/android/gms/b/r:b	Ljava/util/concurrent/locks/Lock;
      //   44: invokeinterface 58 1 0
      //   49: return
      //   50: aload_0
      //   51: getfield 17	com/google/android/gms/b/r$e:a	Lcom/google/android/gms/b/r;
      //   54: aload_1
      //   55: invokevirtual 60	com/google/android/gms/b/r:b	(Lcom/google/android/gms/common/a;)V
      //   58: goto -21 -> 37
      //   61: astore_1
      //   62: aload_0
      //   63: getfield 17	com/google/android/gms/b/r$e:a	Lcom/google/android/gms/b/r;
      //   66: getfield 42	com/google/android/gms/b/r:b	Ljava/util/concurrent/locks/Lock;
      //   69: invokeinterface 58 1 0
      //   74: aload_1
      //   75: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	76	0	this	e
      //   0	76	1	parama	com.google.android.gms.common.a
      // Exception table:
      //   from	to	target	type
      //   12	37	61	finally
      //   50	58	61	finally
    }
  }
  
  private abstract class f
    implements Runnable
  {
    private f() {}
    
    protected abstract void a();
    
    public void run()
    {
      b.lock();
      try
      {
        boolean bool = Thread.interrupted();
        if (bool) {
          return;
        }
        a();
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        v localv = a;
        Message localMessage = e.obtainMessage(2, localRuntimeException);
        e.sendMessage(localMessage);
        return;
      }
      finally
      {
        b.unlock();
      }
    }
  }
}


/* Location:              com/google/android/gms/b/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */