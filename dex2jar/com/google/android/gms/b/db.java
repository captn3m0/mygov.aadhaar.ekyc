package com.google.android.gms.b;

import android.os.Looper;
import com.google.android.gms.common.internal.c;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class db
  extends df
{
  private static final AtomicLong k = new AtomicLong(Long.MIN_VALUE);
  d a;
  private ExecutorService b;
  private d c;
  private final PriorityBlockingQueue<FutureTask<?>> d = new PriorityBlockingQueue();
  private final BlockingQueue<FutureTask<?>> e = new LinkedBlockingQueue();
  private final Thread.UncaughtExceptionHandler f = new b("Thread death: Uncaught exception on worker thread");
  private final Thread.UncaughtExceptionHandler g = new b("Thread death: Uncaught exception on network thread");
  private final Object h = new Object();
  private final Semaphore i = new Semaphore(2);
  private volatile boolean j;
  
  db(dc paramdc)
  {
    super(paramdc);
  }
  
  private void a(c<?> paramc)
  {
    synchronized (h)
    {
      d.add(paramc);
      if (a == null)
      {
        a = new d("Measurement Worker", d);
        a.setUncaughtExceptionHandler(f);
        a.start();
        return;
      }
      a.a();
    }
  }
  
  public static boolean x()
  {
    return Looper.myLooper() == Looper.getMainLooper();
  }
  
  public final <V> Future<V> a(Callable<V> paramCallable)
  {
    J();
    c.a(paramCallable);
    paramCallable = new c(paramCallable, false, "Task exception on worker thread");
    if (Thread.currentThread() == a)
    {
      if (!d.isEmpty()) {
        uc.a("Callable skipped the worker queue.");
      }
      paramCallable.run();
      return paramCallable;
    }
    a(paramCallable);
    return paramCallable;
  }
  
  protected final void a() {}
  
  public final void a(Runnable paramRunnable)
  {
    J();
    c.a(paramRunnable);
    a(new c(paramRunnable, "Task exception on worker thread"));
  }
  
  public final <V> Future<V> b(Callable<V> paramCallable)
  {
    J();
    c.a(paramCallable);
    paramCallable = new c(paramCallable, true, "Task exception on worker thread");
    if (Thread.currentThread() == a)
    {
      paramCallable.run();
      return paramCallable;
    }
    a(paramCallable);
    return paramCallable;
  }
  
  public final void b(Runnable arg1)
  {
    J();
    c.a(???);
    c localc = new c(???, "Task exception on network thread");
    synchronized (h)
    {
      e.add(localc);
      if (c == null)
      {
        c = new d("Measurement Network", e);
        c.setUncaughtExceptionHandler(g);
        c.start();
        return;
      }
      c.a();
    }
  }
  
  public final void d()
  {
    if (Thread.currentThread() != c) {
      throw new IllegalStateException("Call expected from network thread");
    }
  }
  
  public final void e()
  {
    if (Thread.currentThread() != a) {
      throw new IllegalStateException("Call expected from worker thread");
    }
  }
  
  final ExecutorService y()
  {
    synchronized (h)
    {
      if (b == null) {
        b = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
      }
      ExecutorService localExecutorService = b;
      return localExecutorService;
    }
  }
  
  static final class a
    extends RuntimeException
  {}
  
  private final class b
    implements Thread.UncaughtExceptionHandler
  {
    private final String b;
    
    public b(String paramString)
    {
      c.a(paramString);
      b = paramString;
    }
    
    public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
    {
      try
      {
        u().a.a(b, paramThrowable);
        return;
      }
      finally
      {
        paramThread = finally;
        throw paramThread;
      }
    }
  }
  
  private final class c<V>
    extends FutureTask<V>
    implements Comparable<c>
  {
    private final long b;
    private final boolean c;
    private final String d;
    
    c(Runnable paramRunnable, String paramString)
    {
      super(null);
      c.a(paramString);
      b = db.z().getAndIncrement();
      d = paramString;
      c = false;
      if (b == Long.MAX_VALUE) {
        u().a.a("Tasks index overflow");
      }
    }
    
    c(boolean paramBoolean, String paramString)
    {
      super();
      Object localObject;
      c.a(localObject);
      b = db.z().getAndIncrement();
      d = ((String)localObject);
      c = paramString;
      if (b == Long.MAX_VALUE) {
        u().a.a("Tasks index overflow");
      }
    }
    
    protected final void setException(Throwable paramThrowable)
    {
      u().a.a(d, paramThrowable);
      if ((paramThrowable instanceof db.a)) {
        Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), paramThrowable);
      }
      super.setException(paramThrowable);
    }
  }
  
  private final class d
    extends Thread
  {
    private final Object b;
    private final BlockingQueue<FutureTask<?>> c;
    
    public d(BlockingQueue<FutureTask<?>> paramBlockingQueue)
    {
      c.a(paramBlockingQueue);
      Object localObject;
      c.a(localObject);
      b = new Object();
      c = ((BlockingQueue)localObject);
      setName(paramBlockingQueue);
    }
    
    private void a(InterruptedException paramInterruptedException)
    {
      u().c.a(String.valueOf(getName()).concat(" was interrupted"), paramInterruptedException);
    }
    
    public final void a()
    {
      synchronized (b)
      {
        b.notifyAll();
        return;
      }
    }
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: iconst_0
      //   1: istore_1
      //   2: iload_1
      //   3: ifne +27 -> 30
      //   6: aload_0
      //   7: getfield 18	com/google/android/gms/b/db$d:a	Lcom/google/android/gms/b/db;
      //   10: invokestatic 80	com/google/android/gms/b/db:a	(Lcom/google/android/gms/b/db;)Ljava/util/concurrent/Semaphore;
      //   13: invokevirtual 85	java/util/concurrent/Semaphore:acquire	()V
      //   16: iconst_1
      //   17: istore_1
      //   18: goto -16 -> 2
      //   21: astore_3
      //   22: aload_0
      //   23: aload_3
      //   24: invokespecial 87	com/google/android/gms/b/db$d:a	(Ljava/lang/InterruptedException;)V
      //   27: goto -25 -> 2
      //   30: aload_0
      //   31: getfield 33	com/google/android/gms/b/db$d:c	Ljava/util/concurrent/BlockingQueue;
      //   34: invokeinterface 93 1 0
      //   39: checkcast 95	java/util/concurrent/FutureTask
      //   42: astore_3
      //   43: aload_3
      //   44: ifnull +66 -> 110
      //   47: aload_3
      //   48: invokevirtual 97	java/util/concurrent/FutureTask:run	()V
      //   51: goto -21 -> 30
      //   54: astore 4
      //   56: aload_0
      //   57: getfield 18	com/google/android/gms/b/db$d:a	Lcom/google/android/gms/b/db;
      //   60: invokestatic 100	com/google/android/gms/b/db:c	(Lcom/google/android/gms/b/db;)Ljava/lang/Object;
      //   63: astore_3
      //   64: aload_3
      //   65: monitorenter
      //   66: aload_0
      //   67: getfield 18	com/google/android/gms/b/db$d:a	Lcom/google/android/gms/b/db;
      //   70: invokestatic 80	com/google/android/gms/b/db:a	(Lcom/google/android/gms/b/db;)Ljava/util/concurrent/Semaphore;
      //   73: invokevirtual 103	java/util/concurrent/Semaphore:release	()V
      //   76: aload_0
      //   77: getfield 18	com/google/android/gms/b/db$d:a	Lcom/google/android/gms/b/db;
      //   80: invokestatic 100	com/google/android/gms/b/db:c	(Lcom/google/android/gms/b/db;)Ljava/lang/Object;
      //   83: invokevirtual 74	java/lang/Object:notifyAll	()V
      //   86: aload_0
      //   87: aload_0
      //   88: getfield 18	com/google/android/gms/b/db$d:a	Lcom/google/android/gms/b/db;
      //   91: invokestatic 106	com/google/android/gms/b/db:d	(Lcom/google/android/gms/b/db;)Lcom/google/android/gms/b/db$d;
      //   94: if_acmpne +212 -> 306
      //   97: aload_0
      //   98: getfield 18	com/google/android/gms/b/db$d:a	Lcom/google/android/gms/b/db;
      //   101: invokestatic 109	com/google/android/gms/b/db:e	(Lcom/google/android/gms/b/db;)Lcom/google/android/gms/b/db$d;
      //   104: pop
      //   105: aload_3
      //   106: monitorexit
      //   107: aload 4
      //   109: athrow
      //   110: aload_0
      //   111: getfield 31	com/google/android/gms/b/db$d:b	Ljava/lang/Object;
      //   114: astore_3
      //   115: aload_3
      //   116: monitorenter
      //   117: aload_0
      //   118: getfield 33	com/google/android/gms/b/db$d:c	Ljava/util/concurrent/BlockingQueue;
      //   121: invokeinterface 112 1 0
      //   126: ifnonnull +25 -> 151
      //   129: aload_0
      //   130: getfield 18	com/google/android/gms/b/db$d:a	Lcom/google/android/gms/b/db;
      //   133: invokestatic 115	com/google/android/gms/b/db:b	(Lcom/google/android/gms/b/db;)Z
      //   136: istore_2
      //   137: iload_2
      //   138: ifne +13 -> 151
      //   141: aload_0
      //   142: getfield 31	com/google/android/gms/b/db$d:b	Ljava/lang/Object;
      //   145: ldc2_w 116
      //   148: invokevirtual 121	java/lang/Object:wait	(J)V
      //   151: aload_3
      //   152: monitorexit
      //   153: aload_0
      //   154: getfield 18	com/google/android/gms/b/db$d:a	Lcom/google/android/gms/b/db;
      //   157: invokestatic 100	com/google/android/gms/b/db:c	(Lcom/google/android/gms/b/db;)Ljava/lang/Object;
      //   160: astore_3
      //   161: aload_3
      //   162: monitorenter
      //   163: aload_0
      //   164: getfield 33	com/google/android/gms/b/db$d:c	Ljava/util/concurrent/BlockingQueue;
      //   167: invokeinterface 112 1 0
      //   172: ifnonnull +122 -> 294
      //   175: aload_3
      //   176: monitorexit
      //   177: aload_0
      //   178: getfield 18	com/google/android/gms/b/db$d:a	Lcom/google/android/gms/b/db;
      //   181: invokestatic 100	com/google/android/gms/b/db:c	(Lcom/google/android/gms/b/db;)Ljava/lang/Object;
      //   184: astore_3
      //   185: aload_3
      //   186: monitorenter
      //   187: aload_0
      //   188: getfield 18	com/google/android/gms/b/db$d:a	Lcom/google/android/gms/b/db;
      //   191: invokestatic 80	com/google/android/gms/b/db:a	(Lcom/google/android/gms/b/db;)Ljava/util/concurrent/Semaphore;
      //   194: invokevirtual 103	java/util/concurrent/Semaphore:release	()V
      //   197: aload_0
      //   198: getfield 18	com/google/android/gms/b/db$d:a	Lcom/google/android/gms/b/db;
      //   201: invokestatic 100	com/google/android/gms/b/db:c	(Lcom/google/android/gms/b/db;)Ljava/lang/Object;
      //   204: invokevirtual 74	java/lang/Object:notifyAll	()V
      //   207: aload_0
      //   208: aload_0
      //   209: getfield 18	com/google/android/gms/b/db$d:a	Lcom/google/android/gms/b/db;
      //   212: invokestatic 106	com/google/android/gms/b/db:d	(Lcom/google/android/gms/b/db;)Lcom/google/android/gms/b/db$d;
      //   215: if_acmpne +32 -> 247
      //   218: aload_0
      //   219: getfield 18	com/google/android/gms/b/db$d:a	Lcom/google/android/gms/b/db;
      //   222: invokestatic 109	com/google/android/gms/b/db:e	(Lcom/google/android/gms/b/db;)Lcom/google/android/gms/b/db$d;
      //   225: pop
      //   226: aload_3
      //   227: monitorexit
      //   228: return
      //   229: astore 4
      //   231: aload_0
      //   232: aload 4
      //   234: invokespecial 87	com/google/android/gms/b/db$d:a	(Ljava/lang/InterruptedException;)V
      //   237: goto -86 -> 151
      //   240: astore 4
      //   242: aload_3
      //   243: monitorexit
      //   244: aload 4
      //   246: athrow
      //   247: aload_0
      //   248: aload_0
      //   249: getfield 18	com/google/android/gms/b/db$d:a	Lcom/google/android/gms/b/db;
      //   252: invokestatic 124	com/google/android/gms/b/db:f	(Lcom/google/android/gms/b/db;)Lcom/google/android/gms/b/db$d;
      //   255: if_acmpne +21 -> 276
      //   258: aload_0
      //   259: getfield 18	com/google/android/gms/b/db$d:a	Lcom/google/android/gms/b/db;
      //   262: invokestatic 127	com/google/android/gms/b/db:g	(Lcom/google/android/gms/b/db;)Lcom/google/android/gms/b/db$d;
      //   265: pop
      //   266: goto -40 -> 226
      //   269: astore 4
      //   271: aload_3
      //   272: monitorexit
      //   273: aload 4
      //   275: athrow
      //   276: aload_0
      //   277: getfield 18	com/google/android/gms/b/db$d:a	Lcom/google/android/gms/b/db;
      //   280: invokevirtual 45	com/google/android/gms/b/db:u	()Lcom/google/android/gms/b/cu;
      //   283: getfield 129	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
      //   286: ldc -125
      //   288: invokevirtual 133	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
      //   291: goto -65 -> 226
      //   294: aload_3
      //   295: monitorexit
      //   296: goto -266 -> 30
      //   299: astore 4
      //   301: aload_3
      //   302: monitorexit
      //   303: aload 4
      //   305: athrow
      //   306: aload_0
      //   307: aload_0
      //   308: getfield 18	com/google/android/gms/b/db$d:a	Lcom/google/android/gms/b/db;
      //   311: invokestatic 124	com/google/android/gms/b/db:f	(Lcom/google/android/gms/b/db;)Lcom/google/android/gms/b/db$d;
      //   314: if_acmpne +21 -> 335
      //   317: aload_0
      //   318: getfield 18	com/google/android/gms/b/db$d:a	Lcom/google/android/gms/b/db;
      //   321: invokestatic 127	com/google/android/gms/b/db:g	(Lcom/google/android/gms/b/db;)Lcom/google/android/gms/b/db$d;
      //   324: pop
      //   325: goto -220 -> 105
      //   328: astore 4
      //   330: aload_3
      //   331: monitorexit
      //   332: aload 4
      //   334: athrow
      //   335: aload_0
      //   336: getfield 18	com/google/android/gms/b/db$d:a	Lcom/google/android/gms/b/db;
      //   339: invokevirtual 45	com/google/android/gms/b/db:u	()Lcom/google/android/gms/b/cu;
      //   342: getfield 129	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
      //   345: ldc -125
      //   347: invokevirtual 133	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
      //   350: goto -245 -> 105
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	353	0	this	d
      //   1	17	1	i	int
      //   136	2	2	bool	boolean
      //   21	3	3	localInterruptedException1	InterruptedException
      //   54	54	4	localObject2	Object
      //   229	4	4	localInterruptedException2	InterruptedException
      //   240	5	4	localObject3	Object
      //   269	5	4	localObject4	Object
      //   299	5	4	localObject5	Object
      //   328	5	4	localObject6	Object
      // Exception table:
      //   from	to	target	type
      //   6	16	21	java/lang/InterruptedException
      //   30	43	54	finally
      //   47	51	54	finally
      //   110	117	54	finally
      //   153	163	54	finally
      //   244	247	54	finally
      //   303	306	54	finally
      //   141	151	229	java/lang/InterruptedException
      //   117	137	240	finally
      //   141	151	240	finally
      //   151	153	240	finally
      //   231	237	240	finally
      //   242	244	240	finally
      //   187	226	269	finally
      //   226	228	269	finally
      //   247	266	269	finally
      //   271	273	269	finally
      //   276	291	269	finally
      //   163	177	299	finally
      //   294	296	299	finally
      //   301	303	299	finally
      //   66	105	328	finally
      //   105	107	328	finally
      //   306	325	328	finally
      //   330	332	328	finally
      //   335	350	328	finally
    }
  }
}


/* Location:              com/google/android/gms/b/db.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */