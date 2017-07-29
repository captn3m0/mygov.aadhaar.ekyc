package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.common.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Condition;
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
  private final Bundle p;
  private final Set q;
  private boolean r;
  private final Map s;
  private final a.b t;
  private ArrayList u;
  
  public r(v paramv, p paramp, Map paramMap, m paramm, a.b paramb, Lock paramLock, Context paramContext)
  {
    Object localObject = new android/os/Bundle;
    ((Bundle)localObject).<init>();
    p = ((Bundle)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    q = ((Set)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    u = ((ArrayList)localObject);
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
    ec localec = e;
    if (localec != null)
    {
      localec = e;
      boolean bool = localec.b();
      if ((bool) && (paramBoolean))
      {
        localec = e;
        localec.h();
      }
      e.a();
      bool = false;
      localec = null;
      h = null;
    }
  }
  
  private static String c(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default: 
      str = "UNKNOWN";
    }
    for (;;)
    {
      return str;
      str = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
      continue;
      str = "STEP_GETTING_REMOTE_SERVICE";
    }
  }
  
  private void g()
  {
    Object localObject1 = a;
    Object localObject2 = a;
    ((Lock)localObject2).lock();
    try
    {
      localObject2 = m;
      ((t)localObject2).e();
      localObject2 = new com/google/android/gms/b/q;
      ((q)localObject2).<init>((v)localObject1);
      k = ((u)localObject2);
      localObject2 = k;
      ((u)localObject2).a();
      localObject2 = b;
      ((Condition)localObject2).signalAll();
      a.unlock();
      localObject2 = w.a();
      localObject1 = new com/google/android/gms/b/r$1;
      ((r.1)localObject1).<init>(this);
      ((ExecutorService)localObject2).execute((Runnable)localObject1);
      localObject2 = e;
      if (localObject2 != null)
      {
        bool1 = i;
        if (bool1)
        {
          localObject2 = e;
          localObject1 = h;
          boolean bool2 = j;
          ((ec)localObject2).a((z)localObject1, bool2);
        }
        bool1 = false;
        localObject2 = null;
        a(false);
      }
      localObject2 = a.g.keySet();
      localObject1 = ((Set)localObject2).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject1).hasNext();
        if (!bool1) {
          break;
        }
        localObject2 = (a.d)((Iterator)localObject1).next();
        Map localMap = a.f;
        localObject2 = (a.f)localMap.get(localObject2);
        ((a.f)localObject2).a();
      }
      localBundle = p;
    }
    finally
    {
      a.unlock();
    }
    boolean bool1 = localBundle.isEmpty();
    if (bool1) {
      bool1 = false;
    }
    for (Bundle localBundle = null;; localBundle = p)
    {
      a.n.a(localBundle);
      return;
    }
  }
  
  private void h()
  {
    Object localObject = u;
    Iterator localIterator = ((ArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (Future)localIterator.next();
      boolean bool2 = true;
      ((Future)localObject).cancel(bool2);
    }
    u.clear();
  }
  
  public final f.a a(f.a parama)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("GoogleApiClient is not connected yet.");
    throw localIllegalStateException;
  }
  
  public final void a()
  {
    boolean bool1 = true;
    a.g.clear();
    f = false;
    boolean bool2 = false;
    l = null;
    n = 0;
    r = bool1;
    g = false;
    i = false;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject1 = s.keySet();
    Object localObject2 = ((Set)localObject1).iterator();
    bool2 = ((Iterator)localObject2).hasNext();
    Object localObject5;
    Object localObject6;
    if (bool2)
    {
      localObject1 = (com.google.android.gms.common.api.a)((Iterator)localObject2).next();
      localObject3 = a.f;
      localObject4 = ((com.google.android.gms.common.api.a)localObject1).b();
      localObject3 = (a.f)((Map)localObject3).get(localObject4);
      localObject4 = (Boolean)s.get(localObject1);
      boolean bool3 = ((Boolean)localObject4).booleanValue();
      boolean bool4 = ((a.f)localObject3).d();
      if (bool4)
      {
        f = bool1;
        if (!bool3) {
          break label227;
        }
        localObject5 = q;
        localObject6 = ((com.google.android.gms.common.api.a)localObject1).b();
        ((Set)localObject5).add(localObject6);
      }
      for (;;)
      {
        localObject5 = new com/google/android/gms/b/r$a;
        ((r.a)localObject5).<init>(this, (com.google.android.gms.common.api.a)localObject1, bool3);
        localHashMap.put(localObject3, localObject5);
        break;
        label227:
        r = false;
      }
    }
    bool2 = f;
    if (bool2)
    {
      localObject1 = k;
      int i2 = System.identityHashCode(a.m);
      localObject3 = Integer.valueOf(i2);
      h = ((Integer)localObject3);
      localObject6 = new com/google/android/gms/b/r$e;
      ((r.e)localObject6).<init>(this, (byte)0);
      localObject1 = t;
      localObject3 = c;
      localObject4 = a.m.b;
      localObject2 = k;
      localObject5 = k.g;
      localObject1 = (ec)((a.b)localObject1).a((Context)localObject3, (Looper)localObject4, (p)localObject2, localObject5, (c.b)localObject6, (c.c)localObject6);
      e = ((ec)localObject1);
    }
    int i1 = a.f.size();
    o = i1;
    localObject1 = u;
    Object localObject3 = w.a();
    Object localObject4 = new com/google/android/gms/b/r$b;
    ((r.b)localObject4).<init>(this, localHashMap);
    localObject3 = ((ExecutorService)localObject3).submit((Runnable)localObject4);
    ((ArrayList)localObject1).add(localObject3);
  }
  
  public final void a(int paramInt)
  {
    com.google.android.gms.common.a locala = new com/google/android/gms/common/a;
    locala.<init>(8, null);
    b(locala);
  }
  
  public final void a(Bundle paramBundle)
  {
    boolean bool = b(1);
    if (!bool) {}
    for (;;)
    {
      return;
      if (paramBundle != null)
      {
        Bundle localBundle = p;
        localBundle.putAll(paramBundle);
      }
      bool = d();
      if (bool) {
        g();
      }
    }
  }
  
  public final void a(com.google.android.gms.common.a parama, com.google.android.gms.common.api.a parama1, boolean paramBoolean)
  {
    boolean bool = b(1);
    if (!bool) {}
    for (;;)
    {
      return;
      b(parama, parama1, paramBoolean);
      bool = d();
      if (bool) {
        g();
      }
    }
  }
  
  final boolean a(com.google.android.gms.common.a parama)
  {
    boolean bool = r;
    if (bool)
    {
      bool = parama.a();
      if (bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  final void b(com.google.android.gms.common.a parama)
  {
    h();
    boolean bool = parama.a();
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      a(bool);
      a.a(parama);
      a.n.a(parama);
      return;
    }
  }
  
  final void b(com.google.android.gms.common.a parama, com.google.android.gms.common.api.a parama1, boolean paramBoolean)
  {
    int i1 = -1 >>> 1;
    a.d locald = null;
    int i2 = 1;
    Object localObject;
    int i3;
    if (paramBoolean)
    {
      boolean bool = parama.a();
      if (bool)
      {
        bool = i2;
        if (!bool) {
          break label144;
        }
      }
    }
    else
    {
      localObject = l;
      if (localObject != null)
      {
        i3 = m;
        if (i1 >= i3) {
          break label144;
        }
      }
    }
    for (;;)
    {
      if (i2 != 0)
      {
        l = parama;
        m = i1;
      }
      Map localMap = a.g;
      locald = parama1.b();
      localMap.put(locald, parama);
      return;
      localObject = d;
      int i4 = c;
      localObject = ((m)localObject).b(i4);
      if (localObject != null)
      {
        i3 = i2;
        break;
      }
      i3 = 0;
      localObject = null;
      break;
      label144:
      i2 = 0;
      localMap = null;
    }
  }
  
  public final boolean b()
  {
    boolean bool = true;
    h();
    a(bool);
    a.a(null);
    return bool;
  }
  
  final boolean b(int paramInt)
  {
    int i1 = n;
    if (i1 != paramInt)
    {
      Object localObject1 = a.m.g();
      Log.w("GoogleApiClientConnecting", (String)localObject1);
      localObject1 = String.valueOf(this);
      int i2 = String.valueOf(localObject1).length() + 23;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>(i2);
      localObject1 = "Unexpected callback in " + (String)localObject1;
      Log.w("GoogleApiClientConnecting", (String)localObject1);
      int i3 = o;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>(33);
      localObject1 = "mRemainingConnections=" + i3;
      Log.w("GoogleApiClientConnecting", (String)localObject1);
      localObject1 = String.valueOf(c(n));
      Object localObject3 = String.valueOf(c(paramInt));
      int i4 = String.valueOf(localObject1).length() + 70;
      int i5 = String.valueOf(localObject3).length();
      i4 += i5;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(i4);
      localObject1 = localStringBuilder.append("GoogleApiClient connecting is in step ").append((String)localObject1);
      localObject2 = " but received callback for step ";
      localObject1 = (String)localObject2 + (String)localObject3;
      localObject3 = new java/lang/Exception;
      ((Exception)localObject3).<init>();
      Log.wtf("GoogleApiClientConnecting", (String)localObject1, (Throwable)localObject3);
      com.google.android.gms.common.a locala = new com/google/android/gms/common/a;
      i3 = 8;
      i2 = 0;
      localObject3 = null;
      locala.<init>(i3, null);
      b(locala);
      i1 = 0;
      locala = null;
    }
    for (;;)
    {
      return i1;
      i1 = 1;
    }
  }
  
  public final void c() {}
  
  final boolean d()
  {
    boolean bool = false;
    int i1 = o + -1;
    o = i1;
    i1 = o;
    if (i1 > 0) {}
    for (;;)
    {
      return bool;
      i1 = o;
      Object localObject;
      int i2;
      if (i1 < 0)
      {
        String str = a.m.g();
        Log.w("GoogleApiClientConnecting", str);
        str = "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.";
        Exception localException = new java/lang/Exception;
        localException.<init>();
        Log.wtf("GoogleApiClientConnecting", str, localException);
        localObject = new com/google/android/gms/common/a;
        i2 = 8;
        localException = null;
        ((com.google.android.gms.common.a)localObject).<init>(i2, null);
        b((com.google.android.gms.common.a)localObject);
      }
      else
      {
        localObject = l;
        if (localObject != null)
        {
          localObject = a;
          i2 = m;
          l = i2;
          localObject = l;
          b((com.google.android.gms.common.a)localObject);
        }
        else
        {
          bool = true;
        }
      }
    }
  }
  
  final void e()
  {
    int i1 = o;
    if (i1 != 0) {}
    for (;;)
    {
      return;
      boolean bool1 = f;
      if (bool1)
      {
        bool1 = g;
        if (!bool1) {}
      }
      else
      {
        Object localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        n = 1;
        int i2 = a.f.size();
        o = i2;
        Object localObject2 = a.f.keySet();
        Object localObject3 = ((Set)localObject2).iterator();
        Object localObject4;
        for (;;)
        {
          bool2 = ((Iterator)localObject3).hasNext();
          if (!bool2) {
            break;
          }
          localObject2 = (a.d)((Iterator)localObject3).next();
          localObject4 = a.g;
          boolean bool3 = ((Map)localObject4).containsKey(localObject2);
          if (bool3)
          {
            bool2 = d();
            if (bool2) {
              g();
            }
          }
          else
          {
            localObject4 = a.f;
            localObject2 = (a.f)((Map)localObject4).get(localObject2);
            ((ArrayList)localObject1).add(localObject2);
          }
        }
        boolean bool2 = ((ArrayList)localObject1).isEmpty();
        if (!bool2)
        {
          localObject2 = u;
          localObject3 = w.a();
          localObject4 = new com/google/android/gms/b/r$c;
          ((r.c)localObject4).<init>(this, (ArrayList)localObject1);
          localObject1 = ((ExecutorService)localObject3).submit((Runnable)localObject4);
          ((ArrayList)localObject2).add(localObject1);
        }
      }
    }
  }
  
  final void f()
  {
    boolean bool1 = false;
    f = false;
    Object localObject1 = a.m;
    Object localObject2 = Collections.emptySet();
    f = ((Set)localObject2);
    localObject1 = q;
    localObject2 = ((Set)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (a.d)((Iterator)localObject2).next();
      Map localMap = a.g;
      boolean bool2 = localMap.containsKey(localObject1);
      if (!bool2)
      {
        localMap = a.g;
        com.google.android.gms.common.a locala = new com/google/android/gms/common/a;
        int i1 = 17;
        locala.<init>(i1, null);
        localMap.put(localObject1, locala);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */