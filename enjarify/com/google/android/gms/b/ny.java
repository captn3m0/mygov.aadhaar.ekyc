package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ny
  implements nq
{
  final long a;
  final long b;
  final Object c;
  boolean d;
  final Map e;
  private final qo f;
  private final oc g;
  private final Context h;
  private final ns i;
  private final boolean j;
  private final int k;
  private final boolean l;
  private List m;
  
  public ny(Context paramContext, qo paramqo, oc paramoc, ns paramns, boolean paramBoolean1, boolean paramBoolean2, long paramLong1, long paramLong2)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    c = localObject;
    d = false;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    e = ((Map)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    m = ((List)localObject);
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
  
  private void a(us paramus)
  {
    Handler localHandler = tt.a;
    ny.2 local2 = new com/google/android/gms/b/ny$2;
    local2.<init>(this, paramus);
    localHandler.post(local2);
  }
  
  private nw b(List paramList)
  {
    for (;;)
    {
      boolean bool;
      Object localObject2;
      synchronized (c)
      {
        bool = d;
        if (bool)
        {
          localObject2 = new com/google/android/gms/b/nw;
          int n = -1;
          ((nw)localObject2).<init>(n);
          return (nw)localObject2;
        }
        Iterator localIterator = paramList.iterator();
        bool = localIterator.hasNext();
        if (bool)
        {
          localObject2 = localIterator.next();
          ??? = localObject2;
          ??? = (us)localObject2;
        }
      }
      try
      {
        localObject2 = ((us)???).get();
        localObject2 = (nw)localObject2;
        List localList = m;
        localList.add(localObject2);
        if (localObject2 == null) {
          continue;
        }
        int i1 = a;
        if (i1 != 0) {
          continue;
        }
        a((us)???);
      }
      catch (InterruptedException localInterruptedException)
      {
        ??? = "Exception while processing an adapter; continuing with other adapters";
        tp.c((String)???, localInterruptedException);
        continue;
        localObject3 = finally;
        throw ((Throwable)localObject3);
        bool = false;
        a(null);
        nw localnw = new com/google/android/gms/b/nw;
        int i2 = 1;
        localnw.<init>(i2);
      }
      catch (ExecutionException localExecutionException)
      {
        for (;;) {}
      }
    }
  }
  
  /* Error */
  private nw c(List paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 35	com/google/android/gms/b/ny:c	Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 37	com/google/android/gms/b/ny:d	Z
    //   11: istore_3
    //   12: iload_3
    //   13: ifeq +21 -> 34
    //   16: new 84	com/google/android/gms/b/nw
    //   19: astore 4
    //   21: iconst_m1
    //   22: istore_3
    //   23: aload 4
    //   25: iload_3
    //   26: invokespecial 87	com/google/android/gms/b/nw:<init>	(I)V
    //   29: aload_2
    //   30: monitorexit
    //   31: aload 4
    //   33: areturn
    //   34: aload_2
    //   35: monitorexit
    //   36: iconst_m1
    //   37: istore 5
    //   39: aconst_null
    //   40: astore 6
    //   42: iconst_0
    //   43: istore 7
    //   45: aconst_null
    //   46: astore 4
    //   48: aload_0
    //   49: getfield 55	com/google/android/gms/b/ny:i	Lcom/google/android/gms/b/ns;
    //   52: astore 8
    //   54: aload 8
    //   56: getfield 133	com/google/android/gms/b/ns:m	J
    //   59: lstore 9
    //   61: iconst_m1
    //   62: i2l
    //   63: lstore 11
    //   65: lload 9
    //   67: lload 11
    //   69: lcmp
    //   70: istore_3
    //   71: iload_3
    //   72: ifeq +231 -> 303
    //   75: aload_0
    //   76: getfield 55	com/google/android/gms/b/ny:i	Lcom/google/android/gms/b/ns;
    //   79: astore 8
    //   81: aload 8
    //   83: getfield 133	com/google/android/gms/b/ns:m	J
    //   86: lstore 9
    //   88: aload_1
    //   89: invokeinterface 93 1 0
    //   94: astore 13
    //   96: lload 9
    //   98: lstore 11
    //   100: aload 13
    //   102: invokeinterface 99 1 0
    //   107: istore_3
    //   108: iload_3
    //   109: ifeq +299 -> 408
    //   112: aload 13
    //   114: invokeinterface 103 1 0
    //   119: checkcast 105	com/google/android/gms/b/us
    //   122: astore 8
    //   124: invokestatic 138	com/google/android/gms/ads/internal/w:k	()Lcom/google/android/gms/common/util/c;
    //   127: astore_2
    //   128: aload_2
    //   129: invokeinterface 143 1 0
    //   134: lstore 14
    //   136: lconst_0
    //   137: lstore 16
    //   139: lload 11
    //   141: lload 16
    //   143: lcmp
    //   144: istore 18
    //   146: iload 18
    //   148: ifne +163 -> 311
    //   151: aload 8
    //   153: invokeinterface 146 1 0
    //   158: istore 18
    //   160: iload 18
    //   162: ifeq +149 -> 311
    //   165: aload 8
    //   167: invokeinterface 108 1 0
    //   172: astore_2
    //   173: aload_2
    //   174: checkcast 84	com/google/android/gms/b/nw
    //   177: astore_2
    //   178: aload_0
    //   179: getfield 47	com/google/android/gms/b/ny:m	Ljava/util/List;
    //   182: astore 19
    //   184: aload 19
    //   186: aload_2
    //   187: invokeinterface 112 2 0
    //   192: pop
    //   193: aload_2
    //   194: ifnull +256 -> 450
    //   197: aload_2
    //   198: getfield 114	com/google/android/gms/b/nw:a	I
    //   201: istore 20
    //   203: iload 20
    //   205: ifne +245 -> 450
    //   208: aload_2
    //   209: getfield 149	com/google/android/gms/b/nw:f	Lcom/google/android/gms/b/of;
    //   212: astore 19
    //   214: aload 19
    //   216: ifnull +234 -> 450
    //   219: aload 19
    //   221: invokeinterface 154 1 0
    //   226: istore 21
    //   228: iload 21
    //   230: iload 5
    //   232: if_icmple +218 -> 450
    //   235: aload 19
    //   237: invokeinterface 154 1 0
    //   242: istore 7
    //   244: aload_2
    //   245: astore 22
    //   247: aload 8
    //   249: astore_2
    //   250: aload 22
    //   252: astore 8
    //   254: invokestatic 138	com/google/android/gms/ads/internal/w:k	()Lcom/google/android/gms/common/util/c;
    //   257: invokeinterface 143 1 0
    //   262: lload 14
    //   264: lsub
    //   265: lstore 23
    //   267: lload 11
    //   269: lload 23
    //   271: lsub
    //   272: lconst_0
    //   273: invokestatic 160	java/lang/Math:max	(JJ)J
    //   276: lstore 23
    //   278: lload 23
    //   280: lstore 11
    //   282: aload_2
    //   283: astore 6
    //   285: iload 7
    //   287: istore 5
    //   289: aload 8
    //   291: astore 4
    //   293: goto -193 -> 100
    //   296: astore 8
    //   298: aload_2
    //   299: monitorexit
    //   300: aload 8
    //   302: athrow
    //   303: ldc2_w 161
    //   306: lstore 9
    //   308: goto -220 -> 88
    //   311: getstatic 170	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   314: astore_2
    //   315: aload 8
    //   317: lload 11
    //   319: aload_2
    //   320: invokeinterface 173 4 0
    //   325: astore_2
    //   326: aload_2
    //   327: checkcast 84	com/google/android/gms/b/nw
    //   330: astore_2
    //   331: goto -153 -> 178
    //   334: astore 8
    //   336: ldc 119
    //   338: astore_2
    //   339: aload_2
    //   340: aload 8
    //   342: invokestatic 124	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   345: invokestatic 138	com/google/android/gms/ads/internal/w:k	()Lcom/google/android/gms/common/util/c;
    //   348: astore 8
    //   350: aload 8
    //   352: invokeinterface 143 1 0
    //   357: lload 14
    //   359: lsub
    //   360: lstore 9
    //   362: lload 11
    //   364: lload 9
    //   366: lsub
    //   367: lconst_0
    //   368: invokestatic 160	java/lang/Math:max	(JJ)J
    //   371: lstore 9
    //   373: lload 9
    //   375: lstore 11
    //   377: goto -277 -> 100
    //   380: astore 8
    //   382: invokestatic 138	com/google/android/gms/ads/internal/w:k	()Lcom/google/android/gms/common/util/c;
    //   385: invokeinterface 143 1 0
    //   390: lload 14
    //   392: lsub
    //   393: lstore 25
    //   395: lload 11
    //   397: lload 25
    //   399: lsub
    //   400: lconst_0
    //   401: invokestatic 160	java/lang/Math:max	(JJ)J
    //   404: pop2
    //   405: aload 8
    //   407: athrow
    //   408: aload_0
    //   409: aload 6
    //   411: invokespecial 117	com/google/android/gms/b/ny:a	(Lcom/google/android/gms/b/us;)V
    //   414: aload 4
    //   416: ifnonnull -385 -> 31
    //   419: new 84	com/google/android/gms/b/nw
    //   422: astore 4
    //   424: iconst_1
    //   425: istore_3
    //   426: aload 4
    //   428: iload_3
    //   429: invokespecial 87	com/google/android/gms/b/nw:<init>	(I)V
    //   432: goto -401 -> 31
    //   435: astore 8
    //   437: goto -101 -> 336
    //   440: astore 8
    //   442: goto -106 -> 336
    //   445: astore 8
    //   447: goto -111 -> 336
    //   450: aload 4
    //   452: astore 8
    //   454: aload 6
    //   456: astore_2
    //   457: iload 5
    //   459: istore 7
    //   461: goto -207 -> 254
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	464	0	this	ny
    //   0	464	1	paramList	List
    //   4	453	2	localObject1	Object
    //   11	2	3	bool1	boolean
    //   22	4	3	n	int
    //   70	359	3	i1	int
    //   19	432	4	localObject2	Object
    //   37	421	5	i2	int
    //   40	415	6	localObject3	Object
    //   43	417	7	i3	int
    //   52	238	8	localObject4	Object
    //   296	20	8	localObject5	Object
    //   334	7	8	localRemoteException	android.os.RemoteException
    //   348	3	8	localc	com.google.android.gms.common.util.c
    //   380	26	8	localObject6	Object
    //   435	1	8	localInterruptedException	InterruptedException
    //   440	1	8	localExecutionException	ExecutionException
    //   445	1	8	localTimeoutException	java.util.concurrent.TimeoutException
    //   452	1	8	localObject7	Object
    //   59	315	9	l1	long
    //   63	333	11	l2	long
    //   94	19	13	localIterator	Iterator
    //   134	257	14	l3	long
    //   137	5	16	l4	long
    //   144	17	18	bool2	boolean
    //   182	54	19	localObject8	Object
    //   201	3	20	i4	int
    //   226	7	21	i5	int
    //   245	6	22	localObject9	Object
    //   265	14	23	l5	long
    //   393	5	25	l6	long
    // Exception table:
    //   from	to	target	type
    //   7	11	296	finally
    //   16	19	296	finally
    //   25	29	296	finally
    //   29	31	296	finally
    //   34	36	296	finally
    //   298	300	296	finally
    //   151	158	334	android/os/RemoteException
    //   165	172	334	android/os/RemoteException
    //   173	177	334	android/os/RemoteException
    //   178	182	334	android/os/RemoteException
    //   186	193	334	android/os/RemoteException
    //   197	201	334	android/os/RemoteException
    //   208	212	334	android/os/RemoteException
    //   219	226	334	android/os/RemoteException
    //   235	242	334	android/os/RemoteException
    //   311	314	334	android/os/RemoteException
    //   319	325	334	android/os/RemoteException
    //   326	330	334	android/os/RemoteException
    //   151	158	380	finally
    //   165	172	380	finally
    //   173	177	380	finally
    //   178	182	380	finally
    //   186	193	380	finally
    //   197	201	380	finally
    //   208	212	380	finally
    //   219	226	380	finally
    //   235	242	380	finally
    //   311	314	380	finally
    //   319	325	380	finally
    //   326	330	380	finally
    //   340	345	380	finally
    //   151	158	435	java/lang/InterruptedException
    //   165	172	435	java/lang/InterruptedException
    //   173	177	435	java/lang/InterruptedException
    //   178	182	435	java/lang/InterruptedException
    //   186	193	435	java/lang/InterruptedException
    //   197	201	435	java/lang/InterruptedException
    //   208	212	435	java/lang/InterruptedException
    //   219	226	435	java/lang/InterruptedException
    //   235	242	435	java/lang/InterruptedException
    //   311	314	435	java/lang/InterruptedException
    //   319	325	435	java/lang/InterruptedException
    //   326	330	435	java/lang/InterruptedException
    //   151	158	440	java/util/concurrent/ExecutionException
    //   165	172	440	java/util/concurrent/ExecutionException
    //   173	177	440	java/util/concurrent/ExecutionException
    //   178	182	440	java/util/concurrent/ExecutionException
    //   186	193	440	java/util/concurrent/ExecutionException
    //   197	201	440	java/util/concurrent/ExecutionException
    //   208	212	440	java/util/concurrent/ExecutionException
    //   219	226	440	java/util/concurrent/ExecutionException
    //   235	242	440	java/util/concurrent/ExecutionException
    //   311	314	440	java/util/concurrent/ExecutionException
    //   319	325	440	java/util/concurrent/ExecutionException
    //   326	330	440	java/util/concurrent/ExecutionException
    //   151	158	445	java/util/concurrent/TimeoutException
    //   165	172	445	java/util/concurrent/TimeoutException
    //   173	177	445	java/util/concurrent/TimeoutException
    //   178	182	445	java/util/concurrent/TimeoutException
    //   186	193	445	java/util/concurrent/TimeoutException
    //   197	201	445	java/util/concurrent/TimeoutException
    //   208	212	445	java/util/concurrent/TimeoutException
    //   219	226	445	java/util/concurrent/TimeoutException
    //   235	242	445	java/util/concurrent/TimeoutException
    //   311	314	445	java/util/concurrent/TimeoutException
    //   319	325	445	java/util/concurrent/TimeoutException
    //   326	330	445	java/util/concurrent/TimeoutException
  }
  
  public final nw a(List paramList)
  {
    Object localObject1 = "Starting mediation.";
    tp.b((String)localObject1);
    ExecutorService localExecutorService = Executors.newCachedThreadPool();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Iterator localIterator1 = paramList.iterator();
    boolean bool1 = localIterator1.hasNext();
    if (bool1)
    {
      nr localnr = (nr)localIterator1.next();
      Object localObject2 = "Trying mediation network: ";
      localObject1 = String.valueOf(b);
      int i1 = ((String)localObject1).length();
      if (i1 != 0) {
        localObject1 = ((String)localObject2).concat((String)localObject1);
      }
      for (;;)
      {
        tp.d((String)localObject1);
        localObject1 = c;
        Iterator localIterator2 = ((List)localObject1).iterator();
        for (;;)
        {
          bool1 = localIterator2.hasNext();
          if (!bool1) {
            break;
          }
          Object localObject3 = (String)localIterator2.next();
          localObject1 = new com/google/android/gms/b/nv;
          localObject2 = h;
          oc localoc = g;
          ns localns = i;
          ih localih = f.c;
          il localil = f.d;
          un localun = f.k;
          boolean bool2 = j;
          boolean bool3 = l;
          le localle = f.y;
          List localList = f.n;
          ((nv)localObject1).<init>((Context)localObject2, (String)localObject3, localoc, localns, localnr, localih, localil, localun, bool2, bool3, localle, localList);
          localObject2 = new com/google/android/gms/b/ny$1;
          ((ny.1)localObject2).<init>(this, (nv)localObject1);
          localObject2 = ts.a(localExecutorService, (Callable)localObject2);
          localObject3 = e;
          ((Map)localObject3).put(localObject2, localObject1);
          localArrayList.add(localObject2);
        }
        localObject1 = new java/lang/String;
        ((String)localObject1).<init>((String)localObject2);
      }
    }
    int n = k;
    switch (n)
    {
    }
    for (localObject1 = b(localArrayList);; localObject1 = c(localArrayList)) {
      return (nw)localObject1;
    }
  }
  
  public final void a()
  {
    Object localObject1 = c;
    boolean bool = true;
    try
    {
      d = bool;
      Object localObject2 = e;
      localObject2 = ((Map)localObject2).values();
      Iterator localIterator = ((Collection)localObject2).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject2 = localIterator.next();
        localObject2 = (nv)localObject2;
        ((nv)localObject2).a();
      }
    }
    finally {}
  }
  
  public final List b()
  {
    return m;
  }
}


/* Location:              com/google/android/gms/b/ny.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */