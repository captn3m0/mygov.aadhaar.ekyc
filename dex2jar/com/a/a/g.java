package com.a.a;

import java.util.concurrent.BlockingQueue;

public final class g
  extends Thread
{
  volatile boolean a = false;
  private final BlockingQueue<l<?>> b;
  private final f c;
  private final b d;
  private final o e;
  
  public g(BlockingQueue<l<?>> paramBlockingQueue, f paramf, b paramb, o paramo)
  {
    b = paramBlockingQueue;
    c = paramf;
    d = paramb;
    e = paramo;
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: bipush 10
    //   2: invokestatic 46	android/os/Process:setThreadPriority	(I)V
    //   5: invokestatic 52	android/os/SystemClock:elapsedRealtime	()J
    //   8: lstore_1
    //   9: aload_0
    //   10: getfield 24	com/a/a/g:b	Ljava/util/concurrent/BlockingQueue;
    //   13: invokeinterface 58 1 0
    //   18: checkcast 60	com/a/a/l
    //   21: astore_3
    //   22: aload_3
    //   23: ldc 62
    //   25: invokevirtual 65	com/a/a/l:a	(Ljava/lang/String;)V
    //   28: aload_3
    //   29: getfield 68	com/a/a/l:h	Z
    //   32: ifeq +55 -> 87
    //   35: aload_3
    //   36: ldc 70
    //   38: invokevirtual 72	com/a/a/l:b	(Ljava/lang/String;)V
    //   41: goto -36 -> 5
    //   44: astore 4
    //   46: aload 4
    //   48: invokestatic 52	android/os/SystemClock:elapsedRealtime	()J
    //   51: lload_1
    //   52: lsub
    //   53: putfield 75	com/a/a/s:b	J
    //   56: aload 4
    //   58: invokestatic 78	com/a/a/l:a	(Lcom/a/a/s;)Lcom/a/a/s;
    //   61: astore 4
    //   63: aload_0
    //   64: getfield 30	com/a/a/g:e	Lcom/a/a/o;
    //   67: aload_3
    //   68: aload 4
    //   70: invokeinterface 83 3 0
    //   75: goto -70 -> 5
    //   78: astore_3
    //   79: aload_0
    //   80: getfield 22	com/a/a/g:a	Z
    //   83: ifeq -78 -> 5
    //   86: return
    //   87: getstatic 89	android/os/Build$VERSION:SDK_INT	I
    //   90: bipush 14
    //   92: if_icmplt +10 -> 102
    //   95: aload_3
    //   96: getfield 91	com/a/a/l:c	I
    //   99: invokestatic 96	android/net/TrafficStats:setThreadStatsTag	(I)V
    //   102: aload_0
    //   103: getfield 26	com/a/a/g:c	Lcom/a/a/f;
    //   106: aload_3
    //   107: invokeinterface 101 2 0
    //   112: astore 4
    //   114: aload_3
    //   115: ldc 103
    //   117: invokevirtual 65	com/a/a/l:a	(Ljava/lang/String;)V
    //   120: aload 4
    //   122: getfield 107	com/a/a/i:d	Z
    //   125: ifeq +76 -> 201
    //   128: aload_3
    //   129: getfield 110	com/a/a/l:i	Z
    //   132: ifeq +69 -> 201
    //   135: aload_3
    //   136: ldc 112
    //   138: invokevirtual 72	com/a/a/l:b	(Ljava/lang/String;)V
    //   141: goto -136 -> 5
    //   144: astore 4
    //   146: aload 4
    //   148: ldc 114
    //   150: iconst_1
    //   151: anewarray 116	java/lang/Object
    //   154: dup
    //   155: iconst_0
    //   156: aload 4
    //   158: invokevirtual 120	java/lang/Exception:toString	()Ljava/lang/String;
    //   161: aastore
    //   162: invokestatic 125	com/a/a/t:a	(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   165: new 38	com/a/a/s
    //   168: dup
    //   169: aload 4
    //   171: invokespecial 128	com/a/a/s:<init>	(Ljava/lang/Throwable;)V
    //   174: astore 4
    //   176: aload 4
    //   178: invokestatic 52	android/os/SystemClock:elapsedRealtime	()J
    //   181: lload_1
    //   182: lsub
    //   183: putfield 75	com/a/a/s:b	J
    //   186: aload_0
    //   187: getfield 30	com/a/a/g:e	Lcom/a/a/o;
    //   190: aload_3
    //   191: aload 4
    //   193: invokeinterface 83 3 0
    //   198: goto -193 -> 5
    //   201: aload_3
    //   202: aload 4
    //   204: invokevirtual 131	com/a/a/l:a	(Lcom/a/a/i;)Lcom/a/a/n;
    //   207: astore 4
    //   209: aload_3
    //   210: ldc -123
    //   212: invokevirtual 65	com/a/a/l:a	(Ljava/lang/String;)V
    //   215: aload_3
    //   216: getfield 136	com/a/a/l:g	Z
    //   219: ifeq +35 -> 254
    //   222: aload 4
    //   224: getfield 141	com/a/a/n:b	Lcom/a/a/b$a;
    //   227: ifnull +27 -> 254
    //   230: aload_0
    //   231: getfield 28	com/a/a/g:d	Lcom/a/a/b;
    //   234: aload_3
    //   235: getfield 144	com/a/a/l:b	Ljava/lang/String;
    //   238: aload 4
    //   240: getfield 141	com/a/a/n:b	Lcom/a/a/b$a;
    //   243: invokeinterface 149 3 0
    //   248: aload_3
    //   249: ldc -105
    //   251: invokevirtual 65	com/a/a/l:a	(Ljava/lang/String;)V
    //   254: aload_3
    //   255: iconst_1
    //   256: putfield 110	com/a/a/l:i	Z
    //   259: aload_0
    //   260: getfield 30	com/a/a/g:e	Lcom/a/a/o;
    //   263: aload_3
    //   264: aload 4
    //   266: invokeinterface 154 3 0
    //   271: goto -266 -> 5
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	274	0	this	g
    //   8	174	1	l	long
    //   21	47	3	locall	l
    //   78	186	3	localInterruptedException	InterruptedException
    //   44	13	4	locals	s
    //   61	60	4	localObject1	Object
    //   144	26	4	localException	Exception
    //   174	91	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   22	41	44	com/a/a/s
    //   87	102	44	com/a/a/s
    //   102	141	44	com/a/a/s
    //   201	254	44	com/a/a/s
    //   254	271	44	com/a/a/s
    //   9	22	78	java/lang/InterruptedException
    //   22	41	144	java/lang/Exception
    //   87	102	144	java/lang/Exception
    //   102	141	144	java/lang/Exception
    //   201	254	144	java/lang/Exception
    //   254	271	144	java/lang/Exception
  }
}


/* Location:              com/a/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */