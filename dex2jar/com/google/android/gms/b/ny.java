package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@qi
public final class ny
  implements nq
{
  final long a;
  final long b;
  final Object c = new Object();
  boolean d = false;
  final Map<us<nw>, nv> e = new HashMap();
  private final qo f;
  private final oc g;
  private final Context h;
  private final ns i;
  private final boolean j;
  private final int k;
  private final boolean l;
  private List<nw> m = new ArrayList();
  
  public ny(Context paramContext, qo paramqo, oc paramoc, ns paramns, boolean paramBoolean1, boolean paramBoolean2, long paramLong1, long paramLong2)
  {
    h = paramContext;
    f = paramqo;
    g = paramoc;
    i = paramns;
    j = paramBoolean1;
    l = paramBoolean2;
    a = paramLong1;
    b = paramLong2;
    k = 2;
  }
  
  private void a(final us<nw> paramus)
  {
    tt.a.post(new Runnable()
    {
      public final void run()
      {
        Iterator localIterator = e.keySet().iterator();
        while (localIterator.hasNext())
        {
          us localus = (us)localIterator.next();
          if (localus != paramus) {
            ((nv)e.get(localus)).a();
          }
        }
      }
    });
  }
  
  private nw b(List<us<nw>> paramList)
  {
    for (;;)
    {
      synchronized (c)
      {
        if (d)
        {
          paramList = new nw(-1);
          return paramList;
        }
        ??? = paramList.iterator();
        if (((Iterator)???).hasNext()) {
          paramList = (us)((Iterator)???).next();
        }
      }
      try
      {
        nw localnw = (nw)paramList.get();
        m.add(localnw);
        if ((localnw == null) || (a != 0)) {
          continue;
        }
        a(paramList);
        return localnw;
      }
      catch (InterruptedException paramList)
      {
        tp.c("Exception while processing an adapter; continuing with other adapters", paramList);
        continue;
        paramList = finally;
        throw paramList;
        a(null);
        return new nw(1);
      }
      catch (ExecutionException paramList)
      {
        for (;;) {}
      }
    }
  }
  
  /* Error */
  private nw c(List<us<nw>> paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 43	com/google/android/gms/b/ny:c	Ljava/lang/Object;
    //   4: astore 8
    //   6: aload 8
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 45	com/google/android/gms/b/ny:d	Z
    //   13: ifeq +17 -> 30
    //   16: new 98	com/google/android/gms/b/nw
    //   19: dup
    //   20: iconst_m1
    //   21: invokespecial 101	com/google/android/gms/b/nw:<init>	(I)V
    //   24: astore_1
    //   25: aload 8
    //   27: monitorexit
    //   28: aload_1
    //   29: areturn
    //   30: aload 8
    //   32: monitorexit
    //   33: iconst_m1
    //   34: istore_2
    //   35: aconst_null
    //   36: astore 8
    //   38: aconst_null
    //   39: astore 9
    //   41: aload_0
    //   42: getfield 63	com/google/android/gms/b/ny:i	Lcom/google/android/gms/b/ns;
    //   45: getfield 146	com/google/android/gms/b/ns:m	J
    //   48: ldc2_w 147
    //   51: lcmp
    //   52: ifeq +170 -> 222
    //   55: aload_0
    //   56: getfield 63	com/google/android/gms/b/ny:i	Lcom/google/android/gms/b/ns;
    //   59: getfield 146	com/google/android/gms/b/ns:m	J
    //   62: lstore 4
    //   64: aload_1
    //   65: invokeinterface 107 1 0
    //   70: astore 11
    //   72: aload 11
    //   74: invokeinterface 113 1 0
    //   79: ifeq +222 -> 301
    //   82: aload 11
    //   84: invokeinterface 117 1 0
    //   89: checkcast 119	com/google/android/gms/b/us
    //   92: astore 10
    //   94: invokestatic 153	com/google/android/gms/ads/internal/w:k	()Lcom/google/android/gms/common/util/c;
    //   97: invokeinterface 158 1 0
    //   102: lstore 6
    //   104: lload 4
    //   106: lconst_0
    //   107: lcmp
    //   108: ifne +122 -> 230
    //   111: aload 10
    //   113: invokeinterface 161 1 0
    //   118: ifeq +112 -> 230
    //   121: aload 10
    //   123: invokeinterface 122 1 0
    //   128: checkcast 98	com/google/android/gms/b/nw
    //   131: astore_1
    //   132: aload_0
    //   133: getfield 55	com/google/android/gms/b/ny:m	Ljava/util/List;
    //   136: aload_1
    //   137: invokeinterface 126 2 0
    //   142: pop
    //   143: aload_1
    //   144: ifnull +189 -> 333
    //   147: aload_1
    //   148: getfield 128	com/google/android/gms/b/nw:a	I
    //   151: ifne +182 -> 333
    //   154: aload_1
    //   155: getfield 164	com/google/android/gms/b/nw:f	Lcom/google/android/gms/b/of;
    //   158: astore 12
    //   160: aload 12
    //   162: ifnull +171 -> 333
    //   165: aload 12
    //   167: invokeinterface 169 1 0
    //   172: iload_2
    //   173: if_icmple +160 -> 333
    //   176: aload 12
    //   178: invokeinterface 169 1 0
    //   183: istore_3
    //   184: iload_3
    //   185: istore_2
    //   186: aload 10
    //   188: astore 8
    //   190: lload 4
    //   192: invokestatic 153	com/google/android/gms/ads/internal/w:k	()Lcom/google/android/gms/common/util/c;
    //   195: invokeinterface 158 1 0
    //   200: lload 6
    //   202: lsub
    //   203: lsub
    //   204: lconst_0
    //   205: invokestatic 175	java/lang/Math:max	(JJ)J
    //   208: lstore 4
    //   210: aload_1
    //   211: astore 9
    //   213: goto -141 -> 72
    //   216: astore_1
    //   217: aload 8
    //   219: monitorexit
    //   220: aload_1
    //   221: athrow
    //   222: ldc2_w 176
    //   225: lstore 4
    //   227: goto -163 -> 64
    //   230: aload 10
    //   232: lload 4
    //   234: getstatic 183	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   237: invokeinterface 186 4 0
    //   242: checkcast 98	com/google/android/gms/b/nw
    //   245: astore_1
    //   246: goto -114 -> 132
    //   249: astore_1
    //   250: ldc -124
    //   252: aload_1
    //   253: invokestatic 137	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   256: lload 4
    //   258: invokestatic 153	com/google/android/gms/ads/internal/w:k	()Lcom/google/android/gms/common/util/c;
    //   261: invokeinterface 158 1 0
    //   266: lload 6
    //   268: lsub
    //   269: lsub
    //   270: lconst_0
    //   271: invokestatic 175	java/lang/Math:max	(JJ)J
    //   274: lstore 4
    //   276: goto -204 -> 72
    //   279: astore_1
    //   280: lload 4
    //   282: invokestatic 153	com/google/android/gms/ads/internal/w:k	()Lcom/google/android/gms/common/util/c;
    //   285: invokeinterface 158 1 0
    //   290: lload 6
    //   292: lsub
    //   293: lsub
    //   294: lconst_0
    //   295: invokestatic 175	java/lang/Math:max	(JJ)J
    //   298: pop2
    //   299: aload_1
    //   300: athrow
    //   301: aload_0
    //   302: aload 8
    //   304: invokespecial 130	com/google/android/gms/b/ny:a	(Lcom/google/android/gms/b/us;)V
    //   307: aload 9
    //   309: ifnonnull +30 -> 339
    //   312: new 98	com/google/android/gms/b/nw
    //   315: dup
    //   316: iconst_1
    //   317: invokespecial 101	com/google/android/gms/b/nw:<init>	(I)V
    //   320: areturn
    //   321: astore_1
    //   322: goto -72 -> 250
    //   325: astore_1
    //   326: goto -76 -> 250
    //   329: astore_1
    //   330: goto -80 -> 250
    //   333: aload 9
    //   335: astore_1
    //   336: goto -146 -> 190
    //   339: aload 9
    //   341: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	342	0	this	ny
    //   0	342	1	paramList	List<us<nw>>
    //   34	152	2	n	int
    //   183	2	3	i1	int
    //   62	219	4	l1	long
    //   102	189	6	l2	long
    //   4	299	8	localObject	Object
    //   39	301	9	localList	List<us<nw>>
    //   92	139	10	localus	us
    //   70	13	11	localIterator	Iterator
    //   158	19	12	localof	of
    // Exception table:
    //   from	to	target	type
    //   9	28	216	finally
    //   30	33	216	finally
    //   217	220	216	finally
    //   111	132	249	android/os/RemoteException
    //   132	143	249	android/os/RemoteException
    //   147	160	249	android/os/RemoteException
    //   165	184	249	android/os/RemoteException
    //   230	246	249	android/os/RemoteException
    //   111	132	279	finally
    //   132	143	279	finally
    //   147	160	279	finally
    //   165	184	279	finally
    //   230	246	279	finally
    //   250	256	279	finally
    //   111	132	321	java/lang/InterruptedException
    //   132	143	321	java/lang/InterruptedException
    //   147	160	321	java/lang/InterruptedException
    //   165	184	321	java/lang/InterruptedException
    //   230	246	321	java/lang/InterruptedException
    //   111	132	325	java/util/concurrent/ExecutionException
    //   132	143	325	java/util/concurrent/ExecutionException
    //   147	160	325	java/util/concurrent/ExecutionException
    //   165	184	325	java/util/concurrent/ExecutionException
    //   230	246	325	java/util/concurrent/ExecutionException
    //   111	132	329	java/util/concurrent/TimeoutException
    //   132	143	329	java/util/concurrent/TimeoutException
    //   147	160	329	java/util/concurrent/TimeoutException
    //   165	184	329	java/util/concurrent/TimeoutException
    //   230	246	329	java/util/concurrent/TimeoutException
  }
  
  public final nw a(List<nr> paramList)
  {
    tp.b("Starting mediation.");
    ExecutorService localExecutorService = Executors.newCachedThreadPool();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    if (localIterator.hasNext())
    {
      nr localnr = (nr)localIterator.next();
      paramList = String.valueOf(b);
      if (paramList.length() != 0) {}
      for (paramList = "Trying mediation network: ".concat(paramList);; paramList = new String("Trying mediation network: "))
      {
        tp.d(paramList);
        paramList = c.iterator();
        while (paramList.hasNext())
        {
          final Object localObject = (String)paramList.next();
          localObject = new nv(h, (String)localObject, g, i, localnr, f.c, f.d, f.k, j, l, f.y, f.n);
          us localus = ts.a(localExecutorService, new Callable()
          {
            private nw a()
            {
              synchronized (c)
              {
                if (d) {
                  return null;
                }
                return localObject.a(a, b);
              }
            }
          });
          e.put(localus, localObject);
          localArrayList.add(localus);
        }
        break;
      }
    }
    switch (k)
    {
    default: 
      return b(localArrayList);
    }
    return c(localArrayList);
  }
  
  public final void a()
  {
    synchronized (c)
    {
      d = true;
      Iterator localIterator = e.values().iterator();
      if (localIterator.hasNext()) {
        ((nv)localIterator.next()).a();
      }
    }
  }
  
  public final List<nw> b()
  {
    return m;
  }
}


/* Location:              com/google/android/gms/b/ny.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */