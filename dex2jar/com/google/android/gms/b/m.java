package com.google.android.gms.b;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.c.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.p;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class m
  implements ac
{
  final Map<a.d<?>, l<?>> a = new HashMap();
  final Map<a.d<?>, l<?>> b = new HashMap();
  final t c;
  final Lock d;
  final Condition e;
  final boolean f;
  boolean g;
  Map<wn<?>, com.google.android.gms.common.a> h;
  Map<wn<?>, com.google.android.gms.common.a> i;
  com.google.android.gms.common.a j;
  private final Map<com.google.android.gms.common.api.a<?>, Boolean> k;
  private final x l;
  private final Looper m;
  private final com.google.android.gms.common.m n;
  private final p o;
  private final boolean p;
  private final Queue<f.a<?, ?>> q = new LinkedList();
  private b r;
  
  public m(Context paramContext, Lock paramLock, Looper paramLooper, com.google.android.gms.common.m paramm, Map<a.d<?>, a.f> paramMap, p paramp, Map<com.google.android.gms.common.api.a<?>, Boolean> paramMap1, a.b<? extends ec, ed> paramb, ArrayList<i> paramArrayList, t paramt, boolean paramBoolean)
  {
    d = paramLock;
    m = paramLooper;
    e = paramLock.newCondition();
    n = paramm;
    c = paramt;
    k = paramMap1;
    o = paramp;
    p = paramBoolean;
    paramLock = new HashMap();
    paramm = paramMap1.keySet().iterator();
    while (paramm.hasNext())
    {
      paramMap1 = (com.google.android.gms.common.api.a)paramm.next();
      paramLock.put(paramMap1.b(), paramMap1);
    }
    paramm = new HashMap();
    paramMap1 = paramArrayList.iterator();
    while (paramMap1.hasNext())
    {
      paramArrayList = (i)paramMap1.next();
      paramm.put(a, paramArrayList);
    }
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      paramMap1 = (Map.Entry)paramMap.next();
      paramt = (com.google.android.gms.common.api.a)paramLock.get(paramMap1.getKey());
      paramArrayList = (a.f)paramMap1.getValue();
      ((Boolean)k.get(paramt)).booleanValue();
      paramt = new l(paramContext, paramt, paramLooper, paramArrayList, (i)paramm.get(paramt), paramp, paramb);
      a.put((a.d)paramMap1.getKey(), paramt);
      if (paramArrayList.d()) {
        b.put((a.d)paramMap1.getKey(), paramt);
      }
    }
    f = false;
    l = x.a();
  }
  
  private com.google.android.gms.common.a a(a.d<?> paramd)
  {
    d.lock();
    try
    {
      paramd = (l)a.get(paramd);
      if ((h != null) && (paramd != null))
      {
        paramd = (com.google.android.gms.common.a)h.get(b);
        return paramd;
      }
      return null;
    }
    finally
    {
      d.unlock();
    }
  }
  
  public final <A extends a.c, T extends f.a<? extends g, A>> T a(T paramT)
  {
    a.d locald = a;
    if (p)
    {
      Object localObject1 = a;
      Object localObject2 = a((a.d)localObject1);
      if ((localObject2 != null) && (c == 4))
      {
        localObject2 = l;
        localObject1 = a.get(localObject1)).b;
        i1 = System.identityHashCode(c);
        if ((x.a)f.get(localObject1) == null)
        {
          localObject1 = null;
          paramT.a(new Status(4, null, (PendingIntent)localObject1));
        }
      }
      for (int i1 = 1;; i1 = 0)
      {
        if (i1 == 0) {
          break label182;
        }
        return paramT;
        localObject1 = (x.a)f.get(localObject1);
        if (f == null) {}
        for (localObject1 = null;; localObject1 = f.g)
        {
          if (localObject1 != null) {
            break label155;
          }
          localObject1 = null;
          break;
        }
        label155:
        localObject1 = PendingIntent.getActivity(c, i1, ((ec)localObject1).e(), 134217728);
        break;
      }
    }
    label182:
    c.k.a(paramT);
    return ((l)a.get(locald)).a(paramT);
  }
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 63	com/google/android/gms/b/m:d	Ljava/util/concurrent/locks/Lock;
    //   4: invokeinterface 200 1 0
    //   9: aload_0
    //   10: getfield 309	com/google/android/gms/b/m:g	Z
    //   13: istore_1
    //   14: iload_1
    //   15: ifeq +13 -> 28
    //   18: aload_0
    //   19: getfield 63	com/google/android/gms/b/m:d	Ljava/util/concurrent/locks/Lock;
    //   22: invokeinterface 203 1 0
    //   27: return
    //   28: aload_0
    //   29: iconst_1
    //   30: putfield 309	com/google/android/gms/b/m:g	Z
    //   33: aload_0
    //   34: aconst_null
    //   35: putfield 181	com/google/android/gms/b/m:h	Ljava/util/Map;
    //   38: aload_0
    //   39: aconst_null
    //   40: putfield 311	com/google/android/gms/b/m:i	Ljava/util/Map;
    //   43: aload_0
    //   44: aconst_null
    //   45: putfield 313	com/google/android/gms/b/m:r	Lcom/google/android/gms/b/m$b;
    //   48: aload_0
    //   49: aconst_null
    //   50: putfield 315	com/google/android/gms/b/m:j	Lcom/google/android/gms/common/a;
    //   53: aload_0
    //   54: getfield 162	com/google/android/gms/b/m:l	Lcom/google/android/gms/b/x;
    //   57: invokevirtual 317	com/google/android/gms/b/x:b	()V
    //   60: aload_0
    //   61: getfield 162	com/google/android/gms/b/m:l	Lcom/google/android/gms/b/x;
    //   64: astore_2
    //   65: aload_0
    //   66: getfield 54	com/google/android/gms/b/m:a	Ljava/util/Map;
    //   69: invokeinterface 170 1 0
    //   74: astore 4
    //   76: new 319	com/google/android/gms/b/d
    //   79: dup
    //   80: aload 4
    //   82: invokespecial 322	com/google/android/gms/b/d:<init>	(Ljava/lang/Iterable;)V
    //   85: astore_3
    //   86: aload 4
    //   88: invokeinterface 325 1 0
    //   93: astore 4
    //   95: aload 4
    //   97: invokeinterface 101 1 0
    //   102: ifeq +107 -> 209
    //   105: aload 4
    //   107: invokeinterface 105 1 0
    //   112: checkcast 175	com/google/android/gms/common/api/n
    //   115: astore 5
    //   117: aload_2
    //   118: getfield 264	com/google/android/gms/b/x:f	Ljava/util/Map;
    //   121: aload 5
    //   123: getfield 179	com/google/android/gms/common/api/n:b	Lcom/google/android/gms/b/wn;
    //   126: invokeinterface 134 2 0
    //   131: checkcast 266	com/google/android/gms/b/x$a
    //   134: astore 5
    //   136: aload 5
    //   138: ifnull +11 -> 149
    //   141: aload 5
    //   143: invokevirtual 327	com/google/android/gms/b/x$a:i	()Z
    //   146: ifne -51 -> 95
    //   149: aload_2
    //   150: getfield 330	com/google/android/gms/b/x:i	Landroid/os/Handler;
    //   153: aload_2
    //   154: getfield 330	com/google/android/gms/b/x:i	Landroid/os/Handler;
    //   157: iconst_2
    //   158: aload_3
    //   159: invokevirtual 336	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   162: invokevirtual 340	android/os/Handler:sendMessage	(Landroid/os/Message;)Z
    //   165: pop
    //   166: aload_3
    //   167: getfield 343	com/google/android/gms/b/d:b	Lcom/google/android/gms/c/c;
    //   170: getfield 348	com/google/android/gms/c/c:a	Lcom/google/android/gms/c/h;
    //   173: astore_2
    //   174: aload_2
    //   175: new 350	com/google/android/gms/b/ax
    //   178: dup
    //   179: aload_0
    //   180: getfield 65	com/google/android/gms/b/m:m	Landroid/os/Looper;
    //   183: invokespecial 353	com/google/android/gms/b/ax:<init>	(Landroid/os/Looper;)V
    //   186: new 8	com/google/android/gms/b/m$a
    //   189: dup
    //   190: aload_0
    //   191: iconst_0
    //   192: invokespecial 356	com/google/android/gms/b/m$a:<init>	(Lcom/google/android/gms/b/m;B)V
    //   195: invokevirtual 361	com/google/android/gms/c/b:a	(Ljava/util/concurrent/Executor;Lcom/google/android/gms/c/a;)Lcom/google/android/gms/c/b;
    //   198: pop
    //   199: aload_0
    //   200: getfield 63	com/google/android/gms/b/m:d	Ljava/util/concurrent/locks/Lock;
    //   203: invokeinterface 203 1 0
    //   208: return
    //   209: aload_3
    //   210: getfield 343	com/google/android/gms/b/d:b	Lcom/google/android/gms/c/c;
    //   213: invokevirtual 363	com/google/android/gms/c/c:a	()V
    //   216: aload_3
    //   217: getfield 343	com/google/android/gms/b/d:b	Lcom/google/android/gms/c/c;
    //   220: getfield 348	com/google/android/gms/c/c:a	Lcom/google/android/gms/c/h;
    //   223: astore_2
    //   224: goto -50 -> 174
    //   227: astore_2
    //   228: aload_0
    //   229: getfield 63	com/google/android/gms/b/m:d	Ljava/util/concurrent/locks/Lock;
    //   232: invokeinterface 203 1 0
    //   237: aload_2
    //   238: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	239	0	this	m
    //   13	2	1	bool	boolean
    //   64	160	2	localObject1	Object
    //   227	11	2	localObject2	Object
    //   85	132	3	locald	d
    //   74	32	4	localObject3	Object
    //   115	27	5	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   9	14	227	finally
    //   28	95	227	finally
    //   95	136	227	finally
    //   141	149	227	finally
    //   149	174	227	finally
    //   174	199	227	finally
    //   209	224	227	finally
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {}
  
  public final void b()
  {
    d.lock();
    try
    {
      g = false;
      h = null;
      i = null;
      if (r != null) {
        r = null;
      }
      j = null;
      while (!q.isEmpty())
      {
        f.a locala = (f.a)q.remove();
        locala.a(null);
        locala.b();
      }
      e.signalAll();
    }
    finally
    {
      d.unlock();
    }
    d.unlock();
  }
  
  /* Error */
  public final boolean c()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 63	com/google/android/gms/b/m:d	Ljava/util/concurrent/locks/Lock;
    //   4: invokeinterface 200 1 0
    //   9: aload_0
    //   10: getfield 181	com/google/android/gms/b/m:h	Ljava/util/Map;
    //   13: ifnull +25 -> 38
    //   16: aload_0
    //   17: getfield 315	com/google/android/gms/b/m:j	Lcom/google/android/gms/common/a;
    //   20: astore_2
    //   21: aload_2
    //   22: ifnonnull +16 -> 38
    //   25: iconst_1
    //   26: istore_1
    //   27: aload_0
    //   28: getfield 63	com/google/android/gms/b/m:d	Ljava/util/concurrent/locks/Lock;
    //   31: invokeinterface 203 1 0
    //   36: iload_1
    //   37: ireturn
    //   38: iconst_0
    //   39: istore_1
    //   40: goto -13 -> 27
    //   43: astore_2
    //   44: aload_0
    //   45: getfield 63	com/google/android/gms/b/m:d	Ljava/util/concurrent/locks/Lock;
    //   48: invokeinterface 203 1 0
    //   53: aload_2
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	this	m
    //   26	14	1	bool	boolean
    //   20	2	2	locala	com.google.android.gms.common.a
    //   43	11	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	21	43	finally
  }
  
  public final void d() {}
  
  private final class a
    implements com.google.android.gms.c.a<Void>
  {
    private a() {}
    
    public final void a(b<Void> paramb)
    {
      d.lock();
      Object localObject;
      try
      {
        boolean bool = g;
        if (!bool) {
          return;
        }
        if (paramb.a())
        {
          h = new android.support.v4.g.a(a.size());
          paramb = a.values().iterator();
          while (paramb.hasNext())
          {
            localObject = (l)paramb.next();
            h.put(b, com.google.android.gms.common.a.a);
          }
        }
        if (!(paramb.b() instanceof com.google.android.gms.common.api.m)) {
          break label430;
        }
      }
      finally
      {
        d.unlock();
      }
      paramb = (com.google.android.gms.common.api.m)paramb.b();
      if (f)
      {
        h = new android.support.v4.g.a(a.size());
        localObject = a.values().iterator();
        while (((Iterator)localObject).hasNext())
        {
          l locall = (l)((Iterator)localObject).next();
          wn localwn = b;
          com.google.android.gms.common.a locala = paramb.a(locall);
          if (m.a(m.this, locall, locala)) {
            h.put(localwn, new com.google.android.gms.common.a(16));
          } else {
            h.put(localwn, locala);
          }
        }
      }
      h = a;
      j = m.a(m.this);
      if (i != null)
      {
        h.putAll(i);
        j = m.a(m.this);
      }
      if (j == null)
      {
        m.b(m.this);
        m.c(m.this);
      }
      for (;;)
      {
        e.signalAll();
        d.unlock();
        return;
        label430:
        Log.e("ConnectionlessGAC", "Unexpected availability exception", paramb.b());
        h = Collections.emptyMap();
        j = new com.google.android.gms.common.a(8);
        break;
        g = false;
        c.a(j);
      }
    }
  }
  
  private final class b
    implements com.google.android.gms.c.a<Void>
  {
    public final void a(b<Void> paramb)
    {
      a.d.lock();
      Object localObject;
      try
      {
        boolean bool = a.g;
        if (!bool) {
          return;
        }
        if (paramb.a())
        {
          a.i = new android.support.v4.g.a(a.b.size());
          paramb = a.b.values().iterator();
          while (paramb.hasNext())
          {
            localObject = (l)paramb.next();
            a.i.put(b, com.google.android.gms.common.a.a);
          }
        }
        if (!(paramb.b() instanceof com.google.android.gms.common.api.m)) {
          break label402;
        }
      }
      finally
      {
        a.d.unlock();
      }
      paramb = (com.google.android.gms.common.api.m)paramb.b();
      if (a.f)
      {
        a.i = new android.support.v4.g.a(a.b.size());
        localObject = a.b.values().iterator();
        while (((Iterator)localObject).hasNext())
        {
          l locall = (l)((Iterator)localObject).next();
          wn localwn = b;
          com.google.android.gms.common.a locala = paramb.a(locall);
          if (m.a(a, locall, locala)) {
            a.i.put(localwn, new com.google.android.gms.common.a(16));
          } else {
            a.i.put(localwn, locala);
          }
        }
      }
      for (a.i = a;; a.i = Collections.emptyMap())
      {
        if (a.c())
        {
          a.h.putAll(a.i);
          if (m.a(a) == null)
          {
            m.b(a);
            m.c(a);
            a.e.signalAll();
          }
        }
        a.d.unlock();
        return;
        label402:
        Log.e("ConnectionlessGAC", "Unexpected availability exception", paramb.b());
      }
    }
  }
}


/* Location:              com/google/android/gms/b/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */