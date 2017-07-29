package com.google.android.gms.b;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.m;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

final class k
  implements ac
{
  final v a;
  final v b;
  Bundle c;
  com.google.android.gms.common.a d = null;
  com.google.android.gms.common.a e = null;
  boolean f = false;
  final Lock g;
  private final Context h;
  private final t i;
  private final Looper j;
  private final Map<a.d<?>, v> k;
  private final Set<Object> l = Collections.newSetFromMap(new WeakHashMap());
  private final a.f m;
  private int n = 0;
  
  private k(Context paramContext, t paramt, Lock paramLock, Looper paramLooper, m paramm, Map<a.d<?>, a.f> paramMap1, Map<a.d<?>, a.f> paramMap2, p paramp, a.b<? extends ec, ed> paramb, ArrayList<i> paramArrayList1, ArrayList<i> paramArrayList2, Map<com.google.android.gms.common.api.a<?>, Boolean> paramMap3, Map<com.google.android.gms.common.api.a<?>, Boolean> paramMap4)
  {
    h = paramContext;
    i = paramt;
    g = paramLock;
    j = paramLooper;
    m = null;
    a = new v(paramContext, i, paramLock, paramLooper, paramm, paramMap2, null, paramMap4, null, paramArrayList2, new a((byte)0));
    b = new v(paramContext, i, paramLock, paramLooper, paramm, paramMap1, paramp, paramMap3, paramb, paramArrayList1, new b((byte)0));
    paramContext = new android.support.v4.g.a();
    paramt = paramMap2.keySet().iterator();
    while (paramt.hasNext()) {
      paramContext.put((a.d)paramt.next(), a);
    }
    paramt = paramMap1.keySet().iterator();
    while (paramt.hasNext()) {
      paramContext.put((a.d)paramt.next(), b);
    }
    k = Collections.unmodifiableMap(paramContext);
  }
  
  public static k a(Context paramContext, t paramt, Lock paramLock, Looper paramLooper, m paramm, Map<a.d<?>, a.f> paramMap, p paramp, Map<com.google.android.gms.common.api.a<?>, Boolean> paramMap1, a.b<? extends ec, ed> paramb, ArrayList<i> paramArrayList)
  {
    android.support.v4.g.a locala1 = new android.support.v4.g.a();
    android.support.v4.g.a locala2 = new android.support.v4.g.a();
    paramMap = paramMap.entrySet().iterator();
    Object localObject1;
    while (paramMap.hasNext())
    {
      localObject1 = (Map.Entry)paramMap.next();
      localObject2 = (a.f)((Map.Entry)localObject1).getValue();
      if (((a.f)localObject2).d()) {
        locala1.put((a.d)((Map.Entry)localObject1).getKey(), localObject2);
      } else {
        locala2.put((a.d)((Map.Entry)localObject1).getKey(), localObject2);
      }
    }
    boolean bool;
    if (!locala1.isEmpty())
    {
      bool = true;
      c.a(bool, "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
      paramMap = new android.support.v4.g.a();
      localObject1 = new android.support.v4.g.a();
      localObject2 = paramMap1.keySet().iterator();
    }
    Object localObject3;
    for (;;)
    {
      if (((Iterator)localObject2).hasNext())
      {
        localObject3 = (com.google.android.gms.common.api.a)((Iterator)localObject2).next();
        a.d locald = ((com.google.android.gms.common.api.a)localObject3).b();
        if (locala1.containsKey(locald))
        {
          paramMap.put(localObject3, (Boolean)paramMap1.get(localObject3));
          continue;
          bool = false;
          break;
        }
        if (locala2.containsKey(locald)) {
          ((Map)localObject1).put(localObject3, (Boolean)paramMap1.get(localObject3));
        } else {
          throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
        }
      }
    }
    paramMap1 = new ArrayList();
    Object localObject2 = new ArrayList();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      localObject3 = (i)paramArrayList.next();
      if (paramMap.containsKey(a)) {
        paramMap1.add(localObject3);
      } else if (((Map)localObject1).containsKey(a)) {
        ((ArrayList)localObject2).add(localObject3);
      } else {
        throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
      }
    }
    return new k(paramContext, paramt, paramLock, paramLooper, paramm, locala1, locala2, paramp, paramb, paramMap1, (ArrayList)localObject2, paramMap, (Map)localObject1);
  }
  
  private void a(com.google.android.gms.common.a parama)
  {
    switch (n)
    {
    default: 
      Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
    }
    for (;;)
    {
      n = 0;
      return;
      i.a(parama);
      e();
    }
  }
  
  private static boolean b(com.google.android.gms.common.a parama)
  {
    return (parama != null) && (parama.b());
  }
  
  private void e()
  {
    Iterator localIterator = l.iterator();
    while (localIterator.hasNext()) {
      localIterator.next();
    }
    l.clear();
  }
  
  private boolean f()
  {
    return (e != null) && (e.c == 4);
  }
  
  public final <A extends a.c, T extends f.a<? extends g, A>> T a(T paramT)
  {
    Object localObject = a;
    c.b(k.containsKey(localObject), "GoogleApiClient is not configured to use the API required for this call.");
    if (((v)k.get(localObject)).equals(b))
    {
      if (f())
      {
        if (m == null) {}
        for (localObject = null;; localObject = PendingIntent.getActivity(h, System.identityHashCode(i), m.e(), 134217728))
        {
          paramT.a(new Status(4, null, (PendingIntent)localObject));
          return paramT;
        }
      }
      return b.a(paramT);
    }
    return a.a(paramT);
  }
  
  public final void a()
  {
    n = 2;
    f = false;
    e = null;
    d = null;
    a.a();
    b.a();
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.append(paramString).append("authClient").println(":");
    b.a(String.valueOf(paramString).concat("  "), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.append(paramString).append("anonClient").println(":");
    a.a(String.valueOf(paramString).concat("  "), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public final void b()
  {
    e = null;
    d = null;
    n = 0;
    a.b();
    b.b();
    e();
  }
  
  /* Error */
  public final boolean c()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_0
    //   3: getfield 68	com/google/android/gms/b/k:g	Ljava/util/concurrent/locks/Lock;
    //   6: invokeinterface 322 1 0
    //   11: aload_0
    //   12: getfield 82	com/google/android/gms/b/k:a	Lcom/google/android/gms/b/v;
    //   15: invokevirtual 324	com/google/android/gms/b/v:c	()Z
    //   18: ifeq +47 -> 65
    //   21: iload_3
    //   22: istore_2
    //   23: aload_0
    //   24: getfield 85	com/google/android/gms/b/k:b	Lcom/google/android/gms/b/v;
    //   27: invokevirtual 324	com/google/android/gms/b/v:c	()Z
    //   30: ifne +24 -> 54
    //   33: iload_3
    //   34: istore_2
    //   35: aload_0
    //   36: invokespecial 197	com/google/android/gms/b/k:f	()Z
    //   39: ifne +15 -> 54
    //   42: aload_0
    //   43: getfield 62	com/google/android/gms/b/k:n	I
    //   46: istore_1
    //   47: iload_1
    //   48: iconst_1
    //   49: if_icmpne +16 -> 65
    //   52: iload_3
    //   53: istore_2
    //   54: aload_0
    //   55: getfield 68	com/google/android/gms/b/k:g	Ljava/util/concurrent/locks/Lock;
    //   58: invokeinterface 327 1 0
    //   63: iload_2
    //   64: ireturn
    //   65: iconst_0
    //   66: istore_2
    //   67: goto -13 -> 54
    //   70: astore 4
    //   72: aload_0
    //   73: getfield 68	com/google/android/gms/b/k:g	Ljava/util/concurrent/locks/Lock;
    //   76: invokeinterface 327 1 0
    //   81: aload 4
    //   83: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	this	k
    //   46	4	1	i1	int
    //   22	45	2	bool1	boolean
    //   1	52	3	bool2	boolean
    //   70	12	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   11	21	70	finally
    //   23	33	70	finally
    //   35	47	70	finally
  }
  
  public final void d()
  {
    a.d();
    b.d();
  }
  
  private final class a
    implements ac.a
  {
    private a() {}
    
    public final void a(int paramInt, boolean paramBoolean)
    {
      g.lock();
      try
      {
        if ((f) || (e == null) || (!e.b()))
        {
          f = false;
          k.a(k.this, paramInt, paramBoolean);
          return;
        }
        f = true;
        b.a(paramInt);
        return;
      }
      finally
      {
        g.unlock();
      }
    }
    
    /* Error */
    public final void a(Bundle paramBundle)
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 14	com/google/android/gms/b/k$a:a	Lcom/google/android/gms/b/k;
      //   4: getfield 26	com/google/android/gms/b/k:g	Ljava/util/concurrent/locks/Lock;
      //   7: invokeinterface 31 1 0
      //   12: aload_0
      //   13: getfield 14	com/google/android/gms/b/k$a:a	Lcom/google/android/gms/b/k;
      //   16: astore_2
      //   17: aload_2
      //   18: getfield 64	com/google/android/gms/b/k:c	Landroid/os/Bundle;
      //   21: ifnonnull +38 -> 59
      //   24: aload_2
      //   25: aload_1
      //   26: putfield 64	com/google/android/gms/b/k:c	Landroid/os/Bundle;
      //   29: aload_0
      //   30: getfield 14	com/google/android/gms/b/k$a:a	Lcom/google/android/gms/b/k;
      //   33: getstatic 66	com/google/android/gms/common/a:a	Lcom/google/android/gms/common/a;
      //   36: putfield 69	com/google/android/gms/b/k:d	Lcom/google/android/gms/common/a;
      //   39: aload_0
      //   40: getfield 14	com/google/android/gms/b/k$a:a	Lcom/google/android/gms/b/k;
      //   43: invokestatic 71	com/google/android/gms/b/k:a	(Lcom/google/android/gms/b/k;)V
      //   46: aload_0
      //   47: getfield 14	com/google/android/gms/b/k$a:a	Lcom/google/android/gms/b/k;
      //   50: getfield 26	com/google/android/gms/b/k:g	Ljava/util/concurrent/locks/Lock;
      //   53: invokeinterface 51 1 0
      //   58: return
      //   59: aload_1
      //   60: ifnull -31 -> 29
      //   63: aload_2
      //   64: getfield 64	com/google/android/gms/b/k:c	Landroid/os/Bundle;
      //   67: aload_1
      //   68: invokevirtual 76	android/os/Bundle:putAll	(Landroid/os/Bundle;)V
      //   71: goto -42 -> 29
      //   74: astore_1
      //   75: aload_0
      //   76: getfield 14	com/google/android/gms/b/k$a:a	Lcom/google/android/gms/b/k;
      //   79: getfield 26	com/google/android/gms/b/k:g	Ljava/util/concurrent/locks/Lock;
      //   82: invokeinterface 51 1 0
      //   87: aload_1
      //   88: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	89	0	this	a
      //   0	89	1	paramBundle	Bundle
      //   16	48	2	localk	k
      // Exception table:
      //   from	to	target	type
      //   12	29	74	finally
      //   29	46	74	finally
      //   63	71	74	finally
    }
    
    public final void a(com.google.android.gms.common.a parama)
    {
      g.lock();
      try
      {
        d = parama;
        k.a(k.this);
        return;
      }
      finally
      {
        g.unlock();
      }
    }
  }
  
  private final class b
    implements ac.a
  {
    private b() {}
    
    public final void a(int paramInt, boolean paramBoolean)
    {
      g.lock();
      try
      {
        if (f)
        {
          f = false;
          k.a(k.this, paramInt, paramBoolean);
          return;
        }
        f = true;
        a.a(paramInt);
        return;
      }
      finally
      {
        g.unlock();
      }
    }
    
    public final void a(Bundle paramBundle)
    {
      g.lock();
      try
      {
        e = com.google.android.gms.common.a.a;
        k.a(k.this);
        return;
      }
      finally
      {
        g.unlock();
      }
    }
    
    public final void a(com.google.android.gms.common.a parama)
    {
      g.lock();
      try
      {
        e = parama;
        k.a(k.this);
        return;
      }
      finally
      {
        g.unlock();
      }
    }
  }
}


/* Location:              com/google/android/gms/b/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */