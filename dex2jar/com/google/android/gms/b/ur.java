package com.google.android.gms.b;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@qi
public final class ur
{
  public static <V> us<List<V>> a(final List<us<V>> paramList)
  {
    final up localup = new up();
    final int i = paramList.size();
    AtomicInteger localAtomicInteger = new AtomicInteger(0);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      ((us)localIterator.next()).a(new Runnable()
      {
        /* Error */
        public final void run()
        {
          // Byte code:
          //   0: aload_0
          //   1: getfield 22	com/google/android/gms/b/ur$2:a	Ljava/util/concurrent/atomic/AtomicInteger;
          //   4: invokevirtual 43	java/util/concurrent/atomic/AtomicInteger:incrementAndGet	()I
          //   7: aload_0
          //   8: getfield 24	com/google/android/gms/b/ur$2:b	I
          //   11: if_icmplt +77 -> 88
          //   14: aload_0
          //   15: getfield 26	com/google/android/gms/b/ur$2:c	Lcom/google/android/gms/b/up;
          //   18: astore_1
          //   19: aload_0
          //   20: getfield 28	com/google/android/gms/b/ur$2:d	Ljava/util/List;
          //   23: astore_3
          //   24: new 45	java/util/ArrayList
          //   27: dup
          //   28: invokespecial 46	java/util/ArrayList:<init>	()V
          //   31: astore_2
          //   32: aload_3
          //   33: invokeinterface 52 1 0
          //   38: astore_3
          //   39: aload_3
          //   40: invokeinterface 58 1 0
          //   45: ifeq +44 -> 89
          //   48: aload_3
          //   49: invokeinterface 62 1 0
          //   54: checkcast 64	com/google/android/gms/b/us
          //   57: invokeinterface 67 1 0
          //   62: astore 4
          //   64: aload 4
          //   66: ifnull -27 -> 39
          //   69: aload_2
          //   70: aload 4
          //   72: invokeinterface 71 2 0
          //   77: pop
          //   78: goto -39 -> 39
          //   81: astore_1
          //   82: ldc 73
          //   84: aload_1
          //   85: invokestatic 78	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
          //   88: return
          //   89: aload_1
          //   90: aload_2
          //   91: invokevirtual 83	com/google/android/gms/b/up:b	(Ljava/lang/Object;)V
          //   94: return
          //   95: astore_1
          //   96: goto -14 -> 82
          // Local variable table:
          //   start	length	slot	name	signature
          //   0	99	0	this	2
          //   18	1	1	localup	up
          //   81	9	1	localExecutionException	ExecutionException
          //   95	1	1	localInterruptedException	InterruptedException
          //   31	60	2	localArrayList	java.util.ArrayList
          //   23	26	3	localObject1	Object
          //   62	9	4	localObject2	Object
          // Exception table:
          //   from	to	target	type
          //   14	39	81	java/util/concurrent/ExecutionException
          //   39	64	81	java/util/concurrent/ExecutionException
          //   69	78	81	java/util/concurrent/ExecutionException
          //   89	94	81	java/util/concurrent/ExecutionException
          //   14	39	95	java/lang/InterruptedException
          //   39	64	95	java/lang/InterruptedException
          //   69	78	95	java/lang/InterruptedException
          //   89	94	95	java/lang/InterruptedException
        }
      });
    }
    return localup;
  }
  
  public static <T> T a(Future<T> paramFuture, T paramT, int paramInt, TimeUnit paramTimeUnit)
  {
    long l = paramInt;
    try
    {
      paramFuture = paramFuture.get(l, paramTimeUnit);
      return paramFuture;
    }
    catch (InterruptedException paramFuture)
    {
      Thread.currentThread().interrupt();
      return paramT;
    }
    catch (Exception paramFuture) {}
    return paramT;
  }
  
  public static abstract interface a<D, R>
  {
    public abstract R a(D paramD);
  }
}


/* Location:              com/google/android/gms/b/ur.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */