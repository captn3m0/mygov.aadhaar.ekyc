package com.a.a;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

final class t$a
{
  public static final boolean a = t.b;
  private final List b;
  private boolean c;
  
  t$a()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    b = localArrayList;
    c = false;
  }
  
  /* Error */
  public final void a(String paramString)
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: iconst_1
    //   5: istore 4
    //   7: aload_0
    //   8: iload 4
    //   10: putfield 26	com/a/a/t$a:c	Z
    //   13: aload_0
    //   14: getfield 24	com/a/a/t$a:b	Ljava/util/List;
    //   17: astore 5
    //   19: aload 5
    //   21: invokeinterface 33 1 0
    //   26: istore 4
    //   28: iload 4
    //   30: ifne +20 -> 50
    //   33: lload_2
    //   34: lstore 6
    //   36: lload 6
    //   38: lload_2
    //   39: lcmp
    //   40: istore 4
    //   42: iload 4
    //   44: ifgt +100 -> 144
    //   47: aload_0
    //   48: monitorexit
    //   49: return
    //   50: aload_0
    //   51: getfield 24	com/a/a/t$a:b	Ljava/util/List;
    //   54: astore 5
    //   56: iconst_0
    //   57: istore 8
    //   59: aconst_null
    //   60: astore 9
    //   62: aload 5
    //   64: iconst_0
    //   65: invokeinterface 37 2 0
    //   70: astore 5
    //   72: aload 5
    //   74: checkcast 39	com/a/a/t$a$a
    //   77: astore 5
    //   79: aload 5
    //   81: getfield 42	com/a/a/t$a$a:c	J
    //   84: lstore 6
    //   86: aload_0
    //   87: getfield 24	com/a/a/t$a:b	Ljava/util/List;
    //   90: astore 5
    //   92: aload_0
    //   93: getfield 24	com/a/a/t$a:b	Ljava/util/List;
    //   96: astore 9
    //   98: aload 9
    //   100: invokeinterface 33 1 0
    //   105: iconst_m1
    //   106: iadd
    //   107: istore 8
    //   109: aload 5
    //   111: iload 8
    //   113: invokeinterface 37 2 0
    //   118: astore 5
    //   120: aload 5
    //   122: checkcast 39	com/a/a/t$a$a
    //   125: astore 5
    //   127: aload 5
    //   129: getfield 42	com/a/a/t$a$a:c	J
    //   132: lload 6
    //   134: lsub
    //   135: lstore 10
    //   137: lload 10
    //   139: lstore 6
    //   141: goto -105 -> 36
    //   144: aload_0
    //   145: getfield 24	com/a/a/t$a:b	Ljava/util/List;
    //   148: astore 5
    //   150: iconst_0
    //   151: istore 8
    //   153: aconst_null
    //   154: astore 9
    //   156: aload 5
    //   158: iconst_0
    //   159: invokeinterface 37 2 0
    //   164: astore 5
    //   166: aload 5
    //   168: checkcast 39	com/a/a/t$a$a
    //   171: astore 5
    //   173: aload 5
    //   175: getfield 42	com/a/a/t$a$a:c	J
    //   178: lstore 10
    //   180: ldc 44
    //   182: astore 12
    //   184: iconst_2
    //   185: istore 13
    //   187: iload 13
    //   189: anewarray 4	java/lang/Object
    //   192: astore 14
    //   194: aconst_null
    //   195: astore 15
    //   197: lload 6
    //   199: invokestatic 51	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   202: astore 16
    //   204: aload 14
    //   206: iconst_0
    //   207: aload 16
    //   209: aastore
    //   210: iconst_1
    //   211: istore 17
    //   213: aload 14
    //   215: iload 17
    //   217: aload_1
    //   218: aastore
    //   219: aload 12
    //   221: aload 14
    //   223: invokestatic 54	com/a/a/t:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   226: aload_0
    //   227: getfield 24	com/a/a/t$a:b	Ljava/util/List;
    //   230: astore 16
    //   232: aload 16
    //   234: invokeinterface 58 1 0
    //   239: astore 15
    //   241: lload 10
    //   243: lstore 6
    //   245: aload 15
    //   247: invokeinterface 64 1 0
    //   252: istore 4
    //   254: iload 4
    //   256: ifeq -209 -> 47
    //   259: aload 15
    //   261: invokeinterface 68 1 0
    //   266: astore 5
    //   268: aload 5
    //   270: checkcast 39	com/a/a/t$a$a
    //   273: astore 5
    //   275: aload 5
    //   277: getfield 42	com/a/a/t$a$a:c	J
    //   280: lstore_2
    //   281: ldc 70
    //   283: astore 9
    //   285: iconst_3
    //   286: istore 18
    //   288: iload 18
    //   290: anewarray 4	java/lang/Object
    //   293: astore 19
    //   295: lload_2
    //   296: lload 6
    //   298: lsub
    //   299: lstore 6
    //   301: lload 6
    //   303: invokestatic 51	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   306: astore 16
    //   308: aload 19
    //   310: iconst_0
    //   311: aload 16
    //   313: aastore
    //   314: iconst_1
    //   315: istore 17
    //   317: aload 5
    //   319: getfield 73	com/a/a/t$a$a:b	J
    //   322: lstore 20
    //   324: lload 20
    //   326: invokestatic 51	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   329: astore 22
    //   331: aload 19
    //   333: iload 17
    //   335: aload 22
    //   337: aastore
    //   338: iconst_2
    //   339: istore 17
    //   341: aload 5
    //   343: getfield 76	com/a/a/t$a$a:a	Ljava/lang/String;
    //   346: astore 5
    //   348: aload 19
    //   350: iload 17
    //   352: aload 5
    //   354: aastore
    //   355: aload 9
    //   357: aload 19
    //   359: invokestatic 54	com/a/a/t:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   362: lload_2
    //   363: lstore 6
    //   365: goto -120 -> 245
    //   368: astore 5
    //   370: aload_0
    //   371: monitorexit
    //   372: aload 5
    //   374: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	375	0	this	a
    //   0	375	1	paramString	String
    //   1	362	2	l1	long
    //   5	24	4	i	int
    //   40	215	4	bool	boolean
    //   17	336	5	localObject1	Object
    //   368	5	5	localObject2	Object
    //   34	330	6	l2	long
    //   57	95	8	j	int
    //   60	296	9	localObject3	Object
    //   135	107	10	l3	long
    //   182	38	12	str	String
    //   185	3	13	k	int
    //   192	30	14	arrayOfObject1	Object[]
    //   195	65	15	localIterator	java.util.Iterator
    //   202	110	16	localObject4	Object
    //   211	140	17	m	int
    //   286	3	18	n	int
    //   293	65	19	arrayOfObject2	Object[]
    //   322	3	20	l4	long
    //   329	7	22	localLong	Long
    // Exception table:
    //   from	to	target	type
    //   8	13	368	finally
    //   13	17	368	finally
    //   19	26	368	finally
    //   50	54	368	finally
    //   64	70	368	finally
    //   72	77	368	finally
    //   79	84	368	finally
    //   86	90	368	finally
    //   92	96	368	finally
    //   98	105	368	finally
    //   111	118	368	finally
    //   120	125	368	finally
    //   127	132	368	finally
    //   144	148	368	finally
    //   158	164	368	finally
    //   166	171	368	finally
    //   173	178	368	finally
    //   187	192	368	finally
    //   197	202	368	finally
    //   207	210	368	finally
    //   217	219	368	finally
    //   221	226	368	finally
    //   226	230	368	finally
    //   232	239	368	finally
    //   245	252	368	finally
    //   259	266	368	finally
    //   268	273	368	finally
    //   275	280	368	finally
    //   288	293	368	finally
    //   301	306	368	finally
    //   311	314	368	finally
    //   317	322	368	finally
    //   324	329	368	finally
    //   335	338	368	finally
    //   341	346	368	finally
    //   352	355	368	finally
    //   357	362	368	finally
  }
  
  public final void a(String paramString, long paramLong)
  {
    try
    {
      boolean bool = c;
      if (bool)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        str = "Marker added to finished log";
        localIllegalStateException.<init>(str);
        throw localIllegalStateException;
      }
    }
    finally {}
    List localList = b;
    t.a.a locala = new com/a/a/t$a$a;
    long l = SystemClock.elapsedRealtime();
    String str = paramString;
    locala.<init>(paramString, paramLong, l);
    localList.add(locala);
  }
  
  protected final void finalize()
  {
    boolean bool = c;
    if (!bool)
    {
      a("Request on the loose");
      String str = "Marker log finalized without finish() - uncaught exit point for request";
      Object[] arrayOfObject = new Object[0];
      t.c(str, arrayOfObject);
    }
  }
}


/* Location:              com/a/a/t$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */