package com.a.a;

import java.util.concurrent.BlockingQueue;

public final class g
  extends Thread
{
  volatile boolean a = false;
  private final BlockingQueue b;
  private final f c;
  private final b d;
  private final o e;
  
  public g(BlockingQueue paramBlockingQueue, f paramf, b paramb, o paramo)
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
    //   0: iconst_1
    //   1: istore_1
    //   2: bipush 10
    //   4: istore_2
    //   5: iload_2
    //   6: invokestatic 36	android/os/Process:setThreadPriority	(I)V
    //   9: invokestatic 42	android/os/SystemClock:elapsedRealtime	()J
    //   12: lstore_3
    //   13: aload_0
    //   14: getfield 22	com/a/a/g:b	Ljava/util/concurrent/BlockingQueue;
    //   17: astore 5
    //   19: aload 5
    //   21: invokeinterface 48 1 0
    //   26: astore 5
    //   28: aload 5
    //   30: checkcast 50	com/a/a/l
    //   33: astore 5
    //   35: ldc 52
    //   37: astore 6
    //   39: aload 5
    //   41: aload 6
    //   43: invokevirtual 55	com/a/a/l:a	(Ljava/lang/String;)V
    //   46: aload 5
    //   48: getfield 58	com/a/a/l:h	Z
    //   51: istore 7
    //   53: iload 7
    //   55: ifeq +74 -> 129
    //   58: ldc 60
    //   60: astore 6
    //   62: aload 5
    //   64: aload 6
    //   66: invokevirtual 62	com/a/a/l:b	(Ljava/lang/String;)V
    //   69: goto -60 -> 9
    //   72: astore 6
    //   74: invokestatic 42	android/os/SystemClock:elapsedRealtime	()J
    //   77: lstore 8
    //   79: lload 8
    //   81: lload_3
    //   82: lsub
    //   83: lstore_3
    //   84: aload 6
    //   86: lload_3
    //   87: putfield 67	com/a/a/s:b	J
    //   90: aload 6
    //   92: invokestatic 70	com/a/a/l:a	(Lcom/a/a/s;)Lcom/a/a/s;
    //   95: astore 6
    //   97: aload_0
    //   98: getfield 28	com/a/a/g:e	Lcom/a/a/o;
    //   101: astore 10
    //   103: aload 10
    //   105: aload 5
    //   107: aload 6
    //   109: invokeinterface 75 3 0
    //   114: goto -105 -> 9
    //   117: astore 5
    //   119: aload_0
    //   120: getfield 20	com/a/a/g:a	Z
    //   123: istore_2
    //   124: iload_2
    //   125: ifeq -116 -> 9
    //   128: return
    //   129: getstatic 81	android/os/Build$VERSION:SDK_INT	I
    //   132: istore 7
    //   134: bipush 14
    //   136: istore 11
    //   138: iload 7
    //   140: iload 11
    //   142: if_icmplt +15 -> 157
    //   145: aload 5
    //   147: getfield 84	com/a/a/l:c	I
    //   150: istore 7
    //   152: iload 7
    //   154: invokestatic 89	android/net/TrafficStats:setThreadStatsTag	(I)V
    //   157: aload_0
    //   158: getfield 24	com/a/a/g:c	Lcom/a/a/f;
    //   161: astore 6
    //   163: aload 6
    //   165: aload 5
    //   167: invokeinterface 94 2 0
    //   172: astore 6
    //   174: ldc 96
    //   176: astore 12
    //   178: aload 5
    //   180: aload 12
    //   182: invokevirtual 55	com/a/a/l:a	(Ljava/lang/String;)V
    //   185: aload 6
    //   187: getfield 100	com/a/a/i:d	Z
    //   190: istore 11
    //   192: iload 11
    //   194: ifeq +110 -> 304
    //   197: aload 5
    //   199: getfield 103	com/a/a/l:i	Z
    //   202: istore 11
    //   204: iload 11
    //   206: ifeq +98 -> 304
    //   209: ldc 105
    //   211: astore 6
    //   213: aload 5
    //   215: aload 6
    //   217: invokevirtual 62	com/a/a/l:b	(Ljava/lang/String;)V
    //   220: goto -211 -> 9
    //   223: astore 6
    //   225: iload_1
    //   226: anewarray 109	java/lang/Object
    //   229: astore 13
    //   231: aconst_null
    //   232: astore 14
    //   234: aload 6
    //   236: invokevirtual 115	java/lang/Exception:toString	()Ljava/lang/String;
    //   239: astore 15
    //   241: aload 13
    //   243: iconst_0
    //   244: aload 15
    //   246: aastore
    //   247: aload 6
    //   249: ldc 107
    //   251: aload 13
    //   253: invokestatic 120	com/a/a/t:a	(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   256: new 64	com/a/a/s
    //   259: astore 12
    //   261: aload 12
    //   263: aload 6
    //   265: invokespecial 123	com/a/a/s:<init>	(Ljava/lang/Throwable;)V
    //   268: invokestatic 42	android/os/SystemClock:elapsedRealtime	()J
    //   271: lstore 16
    //   273: lload 16
    //   275: lload_3
    //   276: lsub
    //   277: lstore_3
    //   278: aload 12
    //   280: lload_3
    //   281: putfield 67	com/a/a/s:b	J
    //   284: aload_0
    //   285: getfield 28	com/a/a/g:e	Lcom/a/a/o;
    //   288: astore 6
    //   290: aload 6
    //   292: aload 5
    //   294: aload 12
    //   296: invokeinterface 75 3 0
    //   301: goto -292 -> 9
    //   304: aload 5
    //   306: aload 6
    //   308: invokevirtual 126	com/a/a/l:a	(Lcom/a/a/i;)Lcom/a/a/n;
    //   311: astore 6
    //   313: ldc -128
    //   315: astore 12
    //   317: aload 5
    //   319: aload 12
    //   321: invokevirtual 55	com/a/a/l:a	(Ljava/lang/String;)V
    //   324: aload 5
    //   326: getfield 131	com/a/a/l:g	Z
    //   329: istore 11
    //   331: iload 11
    //   333: ifeq +57 -> 390
    //   336: aload 6
    //   338: getfield 136	com/a/a/n:b	Lcom/a/a/b$a;
    //   341: astore 12
    //   343: aload 12
    //   345: ifnull +45 -> 390
    //   348: aload_0
    //   349: getfield 26	com/a/a/g:d	Lcom/a/a/b;
    //   352: astore 12
    //   354: aload 5
    //   356: getfield 139	com/a/a/l:b	Ljava/lang/String;
    //   359: astore 13
    //   361: aload 6
    //   363: getfield 136	com/a/a/n:b	Lcom/a/a/b$a;
    //   366: astore 14
    //   368: aload 12
    //   370: aload 13
    //   372: aload 14
    //   374: invokeinterface 144 3 0
    //   379: ldc -110
    //   381: astore 12
    //   383: aload 5
    //   385: aload 12
    //   387: invokevirtual 55	com/a/a/l:a	(Ljava/lang/String;)V
    //   390: iconst_1
    //   391: istore 11
    //   393: aload 5
    //   395: iload 11
    //   397: putfield 103	com/a/a/l:i	Z
    //   400: aload_0
    //   401: getfield 28	com/a/a/g:e	Lcom/a/a/o;
    //   404: astore 12
    //   406: aload 12
    //   408: aload 5
    //   410: aload 6
    //   412: invokeinterface 149 3 0
    //   417: goto -408 -> 9
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	420	0	this	g
    //   1	225	1	i	int
    //   4	2	2	j	int
    //   123	2	2	bool1	boolean
    //   12	269	3	l1	long
    //   17	89	5	localObject1	Object
    //   117	292	5	localInterruptedException	InterruptedException
    //   37	28	6	str1	String
    //   72	19	6	locals	s
    //   95	121	6	localObject2	Object
    //   223	41	6	localException	Exception
    //   288	123	6	localObject3	Object
    //   51	3	7	bool2	boolean
    //   132	21	7	k	int
    //   77	3	8	l2	long
    //   101	3	10	localo	o
    //   136	7	11	m	int
    //   190	206	11	bool3	boolean
    //   176	231	12	localObject4	Object
    //   229	142	13	localObject5	Object
    //   232	141	14	locala	b.a
    //   239	6	15	str2	String
    //   271	3	16	l3	long
    // Exception table:
    //   from	to	target	type
    //   41	46	72	com/a/a/s
    //   46	51	72	com/a/a/s
    //   64	69	72	com/a/a/s
    //   129	132	72	com/a/a/s
    //   145	150	72	com/a/a/s
    //   152	157	72	com/a/a/s
    //   157	161	72	com/a/a/s
    //   165	172	72	com/a/a/s
    //   180	185	72	com/a/a/s
    //   185	190	72	com/a/a/s
    //   197	202	72	com/a/a/s
    //   215	220	72	com/a/a/s
    //   306	311	72	com/a/a/s
    //   319	324	72	com/a/a/s
    //   324	329	72	com/a/a/s
    //   336	341	72	com/a/a/s
    //   348	352	72	com/a/a/s
    //   354	359	72	com/a/a/s
    //   361	366	72	com/a/a/s
    //   372	379	72	com/a/a/s
    //   385	390	72	com/a/a/s
    //   395	400	72	com/a/a/s
    //   400	404	72	com/a/a/s
    //   410	417	72	com/a/a/s
    //   13	17	117	java/lang/InterruptedException
    //   19	26	117	java/lang/InterruptedException
    //   28	33	117	java/lang/InterruptedException
    //   41	46	223	java/lang/Exception
    //   46	51	223	java/lang/Exception
    //   64	69	223	java/lang/Exception
    //   129	132	223	java/lang/Exception
    //   145	150	223	java/lang/Exception
    //   152	157	223	java/lang/Exception
    //   157	161	223	java/lang/Exception
    //   165	172	223	java/lang/Exception
    //   180	185	223	java/lang/Exception
    //   185	190	223	java/lang/Exception
    //   197	202	223	java/lang/Exception
    //   215	220	223	java/lang/Exception
    //   306	311	223	java/lang/Exception
    //   319	324	223	java/lang/Exception
    //   324	329	223	java/lang/Exception
    //   336	341	223	java/lang/Exception
    //   348	352	223	java/lang/Exception
    //   354	359	223	java/lang/Exception
    //   361	366	223	java/lang/Exception
    //   372	379	223	java/lang/Exception
    //   385	390	223	java/lang/Exception
    //   395	400	223	java/lang/Exception
    //   400	404	223	java/lang/Exception
    //   410	417	223	java/lang/Exception
  }
}


/* Location:              com/a/a/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */