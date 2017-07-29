package com.google.android.gms.b;

import java.util.concurrent.BlockingQueue;

public final class lb
  extends Thread
{
  volatile boolean a = false;
  private final BlockingQueue<pc<?>> b;
  private final ka c;
  private final dz d;
  private final sf e;
  
  public lb(BlockingQueue<pc<?>> paramBlockingQueue, ka paramka, dz paramdz, sf paramsf)
  {
    b = paramBlockingQueue;
    c = paramka;
    d = paramdz;
    e = paramsf;
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: bipush 10
    //   2: invokestatic 46	android/os/Process:setThreadPriority	(I)V
    //   5: invokestatic 52	android/os/SystemClock:elapsedRealtime	()J
    //   8: lstore_2
    //   9: aload_0
    //   10: getfield 24	com/google/android/gms/b/lb:b	Ljava/util/concurrent/BlockingQueue;
    //   13: invokeinterface 58 1 0
    //   18: checkcast 60	com/google/android/gms/b/pc
    //   21: astore 4
    //   23: aload 4
    //   25: ldc 62
    //   27: invokevirtual 65	com/google/android/gms/b/pc:a	(Ljava/lang/String;)V
    //   30: getstatic 71	android/os/Build$VERSION:SDK_INT	I
    //   33: istore_1
    //   34: aload 4
    //   36: getfield 73	com/google/android/gms/b/pc:c	I
    //   39: invokestatic 78	android/net/TrafficStats:setThreadStatsTag	(I)V
    //   42: aload_0
    //   43: getfield 26	com/google/android/gms/b/lb:c	Lcom/google/android/gms/b/ka;
    //   46: aload 4
    //   48: invokeinterface 83 2 0
    //   53: astore 5
    //   55: aload 4
    //   57: ldc 85
    //   59: invokevirtual 65	com/google/android/gms/b/pc:a	(Ljava/lang/String;)V
    //   62: aload 5
    //   64: getfield 89	com/google/android/gms/b/na:d	Z
    //   67: ifeq +66 -> 133
    //   70: aload 4
    //   72: getfield 92	com/google/android/gms/b/pc:h	Z
    //   75: ifeq +58 -> 133
    //   78: aload 4
    //   80: ldc 94
    //   82: invokevirtual 96	com/google/android/gms/b/pc:b	(Ljava/lang/String;)V
    //   85: goto -80 -> 5
    //   88: astore 5
    //   90: aload 5
    //   92: invokestatic 52	android/os/SystemClock:elapsedRealtime	()J
    //   95: lload_2
    //   96: lsub
    //   97: putfield 99	com/google/android/gms/b/vr:b	J
    //   100: aload 5
    //   102: invokestatic 102	com/google/android/gms/b/pc:a	(Lcom/google/android/gms/b/vr;)Lcom/google/android/gms/b/vr;
    //   105: astore 5
    //   107: aload_0
    //   108: getfield 30	com/google/android/gms/b/lb:e	Lcom/google/android/gms/b/sf;
    //   111: aload 4
    //   113: aload 5
    //   115: invokeinterface 107 3 0
    //   120: goto -115 -> 5
    //   123: astore 4
    //   125: aload_0
    //   126: getfield 22	com/google/android/gms/b/lb:a	Z
    //   129: ifeq -124 -> 5
    //   132: return
    //   133: aload 4
    //   135: aload 5
    //   137: invokevirtual 110	com/google/android/gms/b/pc:a	(Lcom/google/android/gms/b/na;)Lcom/google/android/gms/b/re;
    //   140: astore 5
    //   142: aload 4
    //   144: ldc 112
    //   146: invokevirtual 65	com/google/android/gms/b/pc:a	(Ljava/lang/String;)V
    //   149: aload 4
    //   151: getfield 115	com/google/android/gms/b/pc:g	Z
    //   154: ifeq +37 -> 191
    //   157: aload 5
    //   159: getfield 120	com/google/android/gms/b/re:b	Lcom/google/android/gms/b/dz$a;
    //   162: ifnull +29 -> 191
    //   165: aload_0
    //   166: getfield 28	com/google/android/gms/b/lb:d	Lcom/google/android/gms/b/dz;
    //   169: aload 4
    //   171: getfield 123	com/google/android/gms/b/pc:b	Ljava/lang/String;
    //   174: aload 5
    //   176: getfield 120	com/google/android/gms/b/re:b	Lcom/google/android/gms/b/dz$a;
    //   179: invokeinterface 128 3 0
    //   184: aload 4
    //   186: ldc -126
    //   188: invokevirtual 65	com/google/android/gms/b/pc:a	(Ljava/lang/String;)V
    //   191: aload 4
    //   193: iconst_1
    //   194: putfield 92	com/google/android/gms/b/pc:h	Z
    //   197: aload_0
    //   198: getfield 30	com/google/android/gms/b/lb:e	Lcom/google/android/gms/b/sf;
    //   201: aload 4
    //   203: aload 5
    //   205: invokeinterface 133 3 0
    //   210: goto -205 -> 5
    //   213: astore 5
    //   215: aload 5
    //   217: ldc -121
    //   219: iconst_1
    //   220: anewarray 137	java/lang/Object
    //   223: dup
    //   224: iconst_0
    //   225: aload 5
    //   227: invokevirtual 141	java/lang/Exception:toString	()Ljava/lang/String;
    //   230: aastore
    //   231: invokestatic 146	com/google/android/gms/b/vs:a	(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   234: new 38	com/google/android/gms/b/vr
    //   237: dup
    //   238: aload 5
    //   240: invokespecial 149	com/google/android/gms/b/vr:<init>	(Ljava/lang/Throwable;)V
    //   243: astore 5
    //   245: aload 5
    //   247: invokestatic 52	android/os/SystemClock:elapsedRealtime	()J
    //   250: lload_2
    //   251: lsub
    //   252: putfield 99	com/google/android/gms/b/vr:b	J
    //   255: aload_0
    //   256: getfield 30	com/google/android/gms/b/lb:e	Lcom/google/android/gms/b/sf;
    //   259: aload 4
    //   261: aload 5
    //   263: invokeinterface 107 3 0
    //   268: goto -263 -> 5
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	271	0	this	lb
    //   33	1	1	i	int
    //   8	243	2	l	long
    //   21	91	4	localpc	pc
    //   123	137	4	localInterruptedException	InterruptedException
    //   53	10	5	localna	na
    //   88	13	5	localvr1	vr
    //   105	99	5	localObject	Object
    //   213	26	5	localException	Exception
    //   243	19	5	localvr2	vr
    // Exception table:
    //   from	to	target	type
    //   23	85	88	com/google/android/gms/b/vr
    //   133	191	88	com/google/android/gms/b/vr
    //   191	210	88	com/google/android/gms/b/vr
    //   9	23	123	java/lang/InterruptedException
    //   23	85	213	java/lang/Exception
    //   133	191	213	java/lang/Exception
    //   191	210	213	java/lang/Exception
  }
}


/* Location:              com/google/android/gms/b/lb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */