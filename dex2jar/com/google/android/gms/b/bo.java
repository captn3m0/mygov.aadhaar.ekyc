package com.google.android.gms.b;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.a;
import com.google.android.gms.common.internal.o.b;
import com.google.android.gms.common.internal.o.c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class bo
{
  static final class a
    implements o.b, o.c
  {
    protected bp a;
    private final String b;
    private final String c;
    private final LinkedBlockingQueue<bf.a> d;
    private final HandlerThread e;
    
    public a(Context paramContext, String paramString1, String paramString2)
    {
      b = paramString1;
      c = paramString2;
      e = new HandlerThread("GassClient");
      e.start();
      a = new bp(paramContext, e.getLooper(), this, this);
      d = new LinkedBlockingQueue();
      a.f_();
    }
    
    private bu c()
    {
      try
      {
        bu localbu = a.n();
        return localbu;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        return null;
      }
      catch (DeadObjectException localDeadObjectException)
      {
        for (;;) {}
      }
    }
    
    private void d()
    {
      if ((a != null) && ((a.b()) || (a.c()))) {
        a.a();
      }
    }
    
    /* Error */
    public final void a()
    {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial 82	com/google/android/gms/b/bo$a:c	()Lcom/google/android/gms/b/bu;
      //   4: astore_2
      //   5: aload_2
      //   6: ifnull +99 -> 105
      //   9: aload_2
      //   10: new 84	com/google/android/gms/b/bq
      //   13: dup
      //   14: aload_0
      //   15: getfield 27	com/google/android/gms/b/bo$a:b	Ljava/lang/String;
      //   18: aload_0
      //   19: getfield 29	com/google/android/gms/b/bo$a:c	Ljava/lang/String;
      //   22: invokespecial 87	com/google/android/gms/b/bq:<init>	(Ljava/lang/String;Ljava/lang/String;)V
      //   25: invokeinterface 92 2 0
      //   30: astore_2
      //   31: aload_2
      //   32: getfield 97	com/google/android/gms/b/bs:b	Lcom/google/android/gms/b/bf$a;
      //   35: astore_3
      //   36: aload_3
      //   37: ifnull +69 -> 106
      //   40: iconst_1
      //   41: istore_1
      //   42: iload_1
      //   43: ifne +33 -> 76
      //   46: aload_2
      //   47: getfield 100	com/google/android/gms/b/bs:c	[B
      //   50: astore_3
      //   51: aload_2
      //   52: new 102	com/google/android/gms/b/bf$a
      //   55: dup
      //   56: invokespecial 103	com/google/android/gms/b/bf$a:<init>	()V
      //   59: aload_3
      //   60: aload_3
      //   61: arraylength
      //   62: invokestatic 108	com/google/android/gms/b/gb:a	(Lcom/google/android/gms/b/gb;[BI)Lcom/google/android/gms/b/gb;
      //   65: checkcast 102	com/google/android/gms/b/bf$a
      //   68: putfield 97	com/google/android/gms/b/bs:b	Lcom/google/android/gms/b/bf$a;
      //   71: aload_2
      //   72: aconst_null
      //   73: putfield 100	com/google/android/gms/b/bs:c	[B
      //   76: aload_2
      //   77: invokevirtual 109	com/google/android/gms/b/bs:a	()V
      //   80: aload_2
      //   81: getfield 97	com/google/android/gms/b/bs:b	Lcom/google/android/gms/b/bf$a;
      //   84: astore_2
      //   85: aload_0
      //   86: getfield 57	com/google/android/gms/b/bo$a:d	Ljava/util/concurrent/LinkedBlockingQueue;
      //   89: aload_2
      //   90: invokevirtual 113	java/util/concurrent/LinkedBlockingQueue:put	(Ljava/lang/Object;)V
      //   93: aload_0
      //   94: invokespecial 115	com/google/android/gms/b/bo$a:d	()V
      //   97: aload_0
      //   98: getfield 38	com/google/android/gms/b/bo$a:e	Landroid/os/HandlerThread;
      //   101: invokevirtual 118	android/os/HandlerThread:quit	()Z
      //   104: pop
      //   105: return
      //   106: iconst_0
      //   107: istore_1
      //   108: goto -66 -> 42
      //   111: astore_2
      //   112: new 64	java/lang/IllegalStateException
      //   115: dup
      //   116: aload_2
      //   117: invokespecial 121	java/lang/IllegalStateException:<init>	(Ljava/lang/Throwable;)V
      //   120: athrow
      //   121: astore_2
      //   122: aload_0
      //   123: invokespecial 115	com/google/android/gms/b/bo$a:d	()V
      //   126: aload_0
      //   127: getfield 38	com/google/android/gms/b/bo$a:e	Landroid/os/HandlerThread;
      //   130: invokevirtual 118	android/os/HandlerThread:quit	()Z
      //   133: pop
      //   134: return
      //   135: astore_2
      //   136: aload_0
      //   137: invokespecial 115	com/google/android/gms/b/bo$a:d	()V
      //   140: aload_0
      //   141: getfield 38	com/google/android/gms/b/bo$a:e	Landroid/os/HandlerThread;
      //   144: invokevirtual 118	android/os/HandlerThread:quit	()Z
      //   147: pop
      //   148: aload_2
      //   149: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	150	0	this	a
      //   41	67	1	i	int
      //   4	86	2	localObject1	Object
      //   111	6	2	localga	ga
      //   121	1	2	localThrowable	Throwable
      //   135	14	2	localObject2	Object
      //   35	26	3	localObject3	Object
      // Exception table:
      //   from	to	target	type
      //   46	76	111	com/google/android/gms/b/ga
      //   9	36	121	java/lang/Throwable
      //   46	76	121	java/lang/Throwable
      //   76	93	121	java/lang/Throwable
      //   112	121	121	java/lang/Throwable
      //   9	36	135	finally
      //   46	76	135	finally
      //   76	93	135	finally
      //   112	121	135	finally
    }
    
    public final void a(int paramInt)
    {
      try
      {
        d.put(new bf.a());
        return;
      }
      catch (InterruptedException localInterruptedException) {}
    }
    
    public final void a(a parama)
    {
      try
      {
        d.put(new bf.a());
        return;
      }
      catch (InterruptedException parama) {}
    }
    
    public final bf.a b()
    {
      try
      {
        bf.a locala1 = (bf.a)d.poll(5000L, TimeUnit.MILLISECONDS);
        bf.a locala2 = locala1;
        if (locala1 == null) {
          locala2 = new bf.a();
        }
        return locala2;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          Object localObject = null;
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/b/bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */