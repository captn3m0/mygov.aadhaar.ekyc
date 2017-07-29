package com.google.android.gms.b;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

@qi
public final class so
  extends to
  implements sn
{
  final rx a;
  private final tg.a b;
  private final Context c;
  private final ArrayList<Future> d = new ArrayList();
  private final ArrayList<String> e = new ArrayList();
  private final HashMap<String, si> f = new HashMap();
  private final List<sj> g = new ArrayList();
  private final HashSet<String> h = new HashSet();
  private final Object i = new Object();
  private final long j;
  
  public so(Context paramContext, tg.a parama, rx paramrx)
  {
    this(paramContext, parama, paramrx, ((Long)w.q().a(localjz)).longValue());
  }
  
  private so(Context paramContext, tg.a parama, rx paramrx, long paramLong)
  {
    c = paramContext;
    b = parama;
    a = paramrx;
    j = paramLong;
  }
  
  private tg a(int paramInt, String paramString, nr paramnr)
  {
    return new tg(b.a.c, null, b.b.d, paramInt, b.b.f, b.b.j, b.b.l, b.b.k, b.a.i, b.b.h, paramnr, null, paramString, b.c, null, b.b.i, b.d, b.b.g, b.f, b.b.n, b.b.o, b.h, null, b.b.C, b.b.D, b.b.E, b.b.F, b.b.G, d(), b.b.J, b.b.N);
  }
  
  private String d()
  {
    StringBuilder localStringBuilder = new StringBuilder("");
    if (g == null) {
      return localStringBuilder.toString();
    }
    Iterator localIterator = g.iterator();
    while (localIterator.hasNext())
    {
      sj localsj = (sj)localIterator.next();
      if ((localsj != null) && (!TextUtils.isEmpty(b)))
      {
        String str = b;
        int k;
        switch (c)
        {
        default: 
          k = 6;
        }
        for (;;)
        {
          long l = d;
          localStringBuilder.append(String.valueOf(String.valueOf(str).length() + 33 + str + "." + k + "." + l).concat("_"));
          break;
          k = 0;
          continue;
          k = 1;
          continue;
          k = 2;
          continue;
          k = 3;
          continue;
          k = 4;
        }
      }
    }
    return localStringBuilder.substring(0, Math.max(0, localStringBuilder.length() - 1));
  }
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 95	com/google/android/gms/b/so:b	Lcom/google/android/gms/b/tg$a;
    //   4: getfield 139	com/google/android/gms/b/tg$a:c	Lcom/google/android/gms/b/ns;
    //   7: getfield 277	com/google/android/gms/b/ns:a	Ljava/util/List;
    //   10: invokeinterface 201 1 0
    //   15: astore_3
    //   16: aload_3
    //   17: invokeinterface 207 1 0
    //   22: ifeq +281 -> 303
    //   25: aload_3
    //   26: invokeinterface 211 1 0
    //   31: checkcast 279	com/google/android/gms/b/nr
    //   34: astore 4
    //   36: aload 4
    //   38: getfield 280	com/google/android/gms/b/nr:i	Ljava/lang/String;
    //   41: astore 5
    //   43: aload 4
    //   45: getfield 282	com/google/android/gms/b/nr:c	Ljava/util/List;
    //   48: invokeinterface 201 1 0
    //   53: astore 6
    //   55: aload 6
    //   57: invokeinterface 207 1 0
    //   62: ifeq -46 -> 16
    //   65: aload 6
    //   67: invokeinterface 211 1 0
    //   72: checkcast 227	java/lang/String
    //   75: astore_2
    //   76: ldc_w 284
    //   79: aload_2
    //   80: invokevirtual 288	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   83: ifne +13 -> 96
    //   86: ldc_w 290
    //   89: aload_2
    //   90: invokevirtual 288	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   93: ifeq +654 -> 747
    //   96: new 292	org/json/JSONObject
    //   99: dup
    //   100: aload 5
    //   102: invokespecial 293	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   105: ldc_w 295
    //   108: invokevirtual 298	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   111: astore_2
    //   112: aload_0
    //   113: getfield 91	com/google/android/gms/b/so:i	Ljava/lang/Object;
    //   116: astore 7
    //   118: aload 7
    //   120: monitorenter
    //   121: aload_0
    //   122: getfield 97	com/google/android/gms/b/so:a	Lcom/google/android/gms/b/rx;
    //   125: aload_2
    //   126: invokevirtual 303	com/google/android/gms/b/rx:b	(Ljava/lang/String;)Lcom/google/android/gms/b/sp;
    //   129: astore 8
    //   131: aload 8
    //   133: ifnull +19 -> 152
    //   136: aload 8
    //   138: getfield 308	com/google/android/gms/b/sp:b	Lcom/google/android/gms/b/sm;
    //   141: ifnull +11 -> 152
    //   144: aload 8
    //   146: getfield 311	com/google/android/gms/b/sp:a	Lcom/google/android/gms/b/od;
    //   149: ifnonnull +83 -> 232
    //   152: aload_0
    //   153: getfield 81	com/google/android/gms/b/so:g	Ljava/util/List;
    //   156: astore 8
    //   158: new 313	com/google/android/gms/b/sj$a
    //   161: dup
    //   162: invokespecial 314	com/google/android/gms/b/sj$a:<init>	()V
    //   165: astore 9
    //   167: aload 9
    //   169: aload 4
    //   171: getfield 316	com/google/android/gms/b/nr:d	Ljava/lang/String;
    //   174: putfield 317	com/google/android/gms/b/sj$a:b	Ljava/lang/String;
    //   177: aload 9
    //   179: aload_2
    //   180: putfield 319	com/google/android/gms/b/sj$a:a	Ljava/lang/String;
    //   183: aload 9
    //   185: lconst_0
    //   186: putfield 320	com/google/android/gms/b/sj$a:d	J
    //   189: aload 9
    //   191: bipush 7
    //   193: putfield 321	com/google/android/gms/b/sj$a:c	I
    //   196: aload 8
    //   198: aload 9
    //   200: invokevirtual 324	com/google/android/gms/b/sj$a:a	()Lcom/google/android/gms/b/sj;
    //   203: invokeinterface 327 2 0
    //   208: pop
    //   209: aload 7
    //   211: monitorexit
    //   212: goto -157 -> 55
    //   215: astore_2
    //   216: aload 7
    //   218: monitorexit
    //   219: aload_2
    //   220: athrow
    //   221: astore_2
    //   222: ldc_w 329
    //   225: aload_2
    //   226: invokestatic 334	com/google/android/gms/b/tp:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   229: goto -174 -> 55
    //   232: new 336	com/google/android/gms/b/si
    //   235: dup
    //   236: aload_0
    //   237: getfield 93	com/google/android/gms/b/so:c	Landroid/content/Context;
    //   240: aload_2
    //   241: aload 5
    //   243: aload 4
    //   245: aload_0
    //   246: getfield 95	com/google/android/gms/b/so:b	Lcom/google/android/gms/b/tg$a;
    //   249: aload 8
    //   251: aload_0
    //   252: aload_0
    //   253: getfield 99	com/google/android/gms/b/so:j	J
    //   256: invokespecial 339	com/google/android/gms/b/si:<init>	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/nr;Lcom/google/android/gms/b/tg$a;Lcom/google/android/gms/b/sp;Lcom/google/android/gms/b/sn;J)V
    //   259: astore 8
    //   261: aload_0
    //   262: getfield 72	com/google/android/gms/b/so:d	Ljava/util/ArrayList;
    //   265: aload 8
    //   267: invokevirtual 341	com/google/android/gms/b/to:c	()Ljava/lang/Object;
    //   270: checkcast 343	java/util/concurrent/Future
    //   273: invokevirtual 344	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   276: pop
    //   277: aload_0
    //   278: getfield 74	com/google/android/gms/b/so:e	Ljava/util/ArrayList;
    //   281: aload_2
    //   282: invokevirtual 344	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   285: pop
    //   286: aload_0
    //   287: getfield 79	com/google/android/gms/b/so:f	Ljava/util/HashMap;
    //   290: aload_2
    //   291: aload 8
    //   293: invokevirtual 348	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   296: pop
    //   297: aload 7
    //   299: monitorexit
    //   300: goto -245 -> 55
    //   303: iconst_0
    //   304: istore_1
    //   305: iload_1
    //   306: aload_0
    //   307: getfield 72	com/google/android/gms/b/so:d	Ljava/util/ArrayList;
    //   310: invokevirtual 351	java/util/ArrayList:size	()I
    //   313: if_icmpge +243 -> 556
    //   316: aload_0
    //   317: getfield 72	com/google/android/gms/b/so:d	Ljava/util/ArrayList;
    //   320: iload_1
    //   321: invokevirtual 355	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   324: checkcast 343	java/util/concurrent/Future
    //   327: invokeinterface 357 1 0
    //   332: pop
    //   333: aload_0
    //   334: getfield 91	com/google/android/gms/b/so:i	Ljava/lang/Object;
    //   337: astore_2
    //   338: aload_2
    //   339: monitorenter
    //   340: aload_0
    //   341: getfield 74	com/google/android/gms/b/so:e	Ljava/util/ArrayList;
    //   344: iload_1
    //   345: invokevirtual 355	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   348: checkcast 227	java/lang/String
    //   351: astore_3
    //   352: aload_3
    //   353: invokestatic 221	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   356: ifne +33 -> 389
    //   359: aload_0
    //   360: getfield 79	com/google/android/gms/b/so:f	Ljava/util/HashMap;
    //   363: aload_3
    //   364: invokevirtual 360	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   367: checkcast 336	com/google/android/gms/b/si
    //   370: astore_3
    //   371: aload_3
    //   372: ifnull +17 -> 389
    //   375: aload_0
    //   376: getfield 81	com/google/android/gms/b/so:g	Ljava/util/List;
    //   379: aload_3
    //   380: invokevirtual 362	com/google/android/gms/b/si:d	()Lcom/google/android/gms/b/sj;
    //   383: invokeinterface 327 2 0
    //   388: pop
    //   389: aload_2
    //   390: monitorexit
    //   391: aload_0
    //   392: getfield 91	com/google/android/gms/b/so:i	Ljava/lang/Object;
    //   395: astore_3
    //   396: aload_3
    //   397: monitorenter
    //   398: aload_0
    //   399: getfield 86	com/google/android/gms/b/so:h	Ljava/util/HashSet;
    //   402: aload_0
    //   403: getfield 74	com/google/android/gms/b/so:e	Ljava/util/ArrayList;
    //   406: iload_1
    //   407: invokevirtual 355	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   410: invokevirtual 365	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   413: ifeq +324 -> 737
    //   416: aload_0
    //   417: getfield 74	com/google/android/gms/b/so:e	Ljava/util/ArrayList;
    //   420: iload_1
    //   421: invokevirtual 355	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   424: checkcast 227	java/lang/String
    //   427: astore 4
    //   429: aload_0
    //   430: getfield 79	com/google/android/gms/b/so:f	Ljava/util/HashMap;
    //   433: aload 4
    //   435: invokevirtual 360	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   438: ifnull +294 -> 732
    //   441: aload_0
    //   442: getfield 79	com/google/android/gms/b/so:f	Ljava/util/HashMap;
    //   445: aload 4
    //   447: invokevirtual 360	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   450: checkcast 336	com/google/android/gms/b/si
    //   453: getfield 368	com/google/android/gms/b/si:d	Lcom/google/android/gms/b/nr;
    //   456: astore_2
    //   457: aload_0
    //   458: bipush -2
    //   460: aload 4
    //   462: aload_2
    //   463: invokespecial 370	com/google/android/gms/b/so:a	(ILjava/lang/String;Lcom/google/android/gms/b/nr;)Lcom/google/android/gms/b/tg;
    //   466: astore_2
    //   467: getstatic 375	com/google/android/gms/b/uk:a	Landroid/os/Handler;
    //   470: new 8	com/google/android/gms/b/so$1
    //   473: dup
    //   474: aload_0
    //   475: aload_2
    //   476: invokespecial 378	com/google/android/gms/b/so$1:<init>	(Lcom/google/android/gms/b/so;Lcom/google/android/gms/b/tg;)V
    //   479: invokevirtual 384	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   482: pop
    //   483: aload_3
    //   484: monitorexit
    //   485: return
    //   486: astore_3
    //   487: aload_2
    //   488: monitorexit
    //   489: aload_3
    //   490: athrow
    //   491: astore_2
    //   492: invokestatic 390	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   495: invokevirtual 393	java/lang/Thread:interrupt	()V
    //   498: aload_0
    //   499: getfield 91	com/google/android/gms/b/so:i	Ljava/lang/Object;
    //   502: astore_2
    //   503: aload_2
    //   504: monitorenter
    //   505: aload_0
    //   506: getfield 74	com/google/android/gms/b/so:e	Ljava/util/ArrayList;
    //   509: iload_1
    //   510: invokevirtual 355	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   513: checkcast 227	java/lang/String
    //   516: astore_3
    //   517: aload_3
    //   518: invokestatic 221	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   521: ifne +33 -> 554
    //   524: aload_0
    //   525: getfield 79	com/google/android/gms/b/so:f	Ljava/util/HashMap;
    //   528: aload_3
    //   529: invokevirtual 360	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   532: checkcast 336	com/google/android/gms/b/si
    //   535: astore_3
    //   536: aload_3
    //   537: ifnull +17 -> 554
    //   540: aload_0
    //   541: getfield 81	com/google/android/gms/b/so:g	Ljava/util/List;
    //   544: aload_3
    //   545: invokevirtual 362	com/google/android/gms/b/si:d	()Lcom/google/android/gms/b/sj;
    //   548: invokeinterface 327 2 0
    //   553: pop
    //   554: aload_2
    //   555: monitorexit
    //   556: aload_0
    //   557: iconst_3
    //   558: aconst_null
    //   559: aconst_null
    //   560: invokespecial 370	com/google/android/gms/b/so:a	(ILjava/lang/String;Lcom/google/android/gms/b/nr;)Lcom/google/android/gms/b/tg;
    //   563: astore_2
    //   564: getstatic 375	com/google/android/gms/b/uk:a	Landroid/os/Handler;
    //   567: new 10	com/google/android/gms/b/so$2
    //   570: dup
    //   571: aload_0
    //   572: aload_2
    //   573: invokespecial 394	com/google/android/gms/b/so$2:<init>	(Lcom/google/android/gms/b/so;Lcom/google/android/gms/b/tg;)V
    //   576: invokevirtual 384	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   579: pop
    //   580: return
    //   581: astore_3
    //   582: aload_2
    //   583: monitorexit
    //   584: aload_3
    //   585: athrow
    //   586: astore_2
    //   587: ldc_w 396
    //   590: aload_2
    //   591: invokestatic 398	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   594: aload_0
    //   595: getfield 91	com/google/android/gms/b/so:i	Ljava/lang/Object;
    //   598: astore_2
    //   599: aload_2
    //   600: monitorenter
    //   601: aload_0
    //   602: getfield 74	com/google/android/gms/b/so:e	Ljava/util/ArrayList;
    //   605: iload_1
    //   606: invokevirtual 355	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   609: checkcast 227	java/lang/String
    //   612: astore_3
    //   613: aload_3
    //   614: invokestatic 221	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   617: ifne +33 -> 650
    //   620: aload_0
    //   621: getfield 79	com/google/android/gms/b/so:f	Ljava/util/HashMap;
    //   624: aload_3
    //   625: invokevirtual 360	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   628: checkcast 336	com/google/android/gms/b/si
    //   631: astore_3
    //   632: aload_3
    //   633: ifnull +17 -> 650
    //   636: aload_0
    //   637: getfield 81	com/google/android/gms/b/so:g	Ljava/util/List;
    //   640: aload_3
    //   641: invokevirtual 362	com/google/android/gms/b/si:d	()Lcom/google/android/gms/b/sj;
    //   644: invokeinterface 327 2 0
    //   649: pop
    //   650: aload_2
    //   651: monitorexit
    //   652: goto +98 -> 750
    //   655: astore_3
    //   656: aload_2
    //   657: monitorexit
    //   658: aload_3
    //   659: athrow
    //   660: astore_3
    //   661: aload_0
    //   662: getfield 91	com/google/android/gms/b/so:i	Ljava/lang/Object;
    //   665: astore_2
    //   666: aload_2
    //   667: monitorenter
    //   668: aload_0
    //   669: getfield 74	com/google/android/gms/b/so:e	Ljava/util/ArrayList;
    //   672: iload_1
    //   673: invokevirtual 355	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   676: checkcast 227	java/lang/String
    //   679: astore 4
    //   681: aload 4
    //   683: invokestatic 221	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   686: ifne +37 -> 723
    //   689: aload_0
    //   690: getfield 79	com/google/android/gms/b/so:f	Ljava/util/HashMap;
    //   693: aload 4
    //   695: invokevirtual 360	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   698: checkcast 336	com/google/android/gms/b/si
    //   701: astore 4
    //   703: aload 4
    //   705: ifnull +18 -> 723
    //   708: aload_0
    //   709: getfield 81	com/google/android/gms/b/so:g	Ljava/util/List;
    //   712: aload 4
    //   714: invokevirtual 362	com/google/android/gms/b/si:d	()Lcom/google/android/gms/b/sj;
    //   717: invokeinterface 327 2 0
    //   722: pop
    //   723: aload_2
    //   724: monitorexit
    //   725: aload_3
    //   726: athrow
    //   727: astore_3
    //   728: aload_2
    //   729: monitorexit
    //   730: aload_3
    //   731: athrow
    //   732: aconst_null
    //   733: astore_2
    //   734: goto -277 -> 457
    //   737: aload_3
    //   738: monitorexit
    //   739: goto +11 -> 750
    //   742: astore_2
    //   743: aload_3
    //   744: monitorexit
    //   745: aload_2
    //   746: athrow
    //   747: goto -635 -> 112
    //   750: iload_1
    //   751: iconst_1
    //   752: iadd
    //   753: istore_1
    //   754: goto -449 -> 305
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	757	0	this	so
    //   304	450	1	k	int
    //   75	105	2	str1	String
    //   215	5	2	localObject1	Object
    //   221	70	2	localJSONException	org.json.JSONException
    //   491	1	2	localInterruptedException	InterruptedException
    //   586	5	2	localException	Exception
    //   742	4	2	localObject5	Object
    //   486	4	3	localObject7	Object
    //   516	29	3	localObject8	Object
    //   581	4	3	localObject9	Object
    //   612	29	3	localObject10	Object
    //   655	4	3	localObject11	Object
    //   660	66	3	localObject12	Object
    //   727	17	3	localObject13	Object
    //   34	679	4	localObject14	Object
    //   41	201	5	str2	String
    //   53	13	6	localIterator	Iterator
    //   116	182	7	localObject15	Object
    //   129	163	8	localObject16	Object
    //   165	34	9	locala	sj.a
    // Exception table:
    //   from	to	target	type
    //   121	131	215	finally
    //   136	152	215	finally
    //   152	212	215	finally
    //   216	219	215	finally
    //   232	300	215	finally
    //   96	112	221	org/json/JSONException
    //   340	371	486	finally
    //   375	389	486	finally
    //   389	391	486	finally
    //   487	489	486	finally
    //   316	333	491	java/lang/InterruptedException
    //   505	536	581	finally
    //   540	554	581	finally
    //   554	556	581	finally
    //   582	584	581	finally
    //   316	333	586	java/lang/Exception
    //   601	632	655	finally
    //   636	650	655	finally
    //   650	652	655	finally
    //   656	658	655	finally
    //   316	333	660	finally
    //   492	498	660	finally
    //   587	594	660	finally
    //   668	703	727	finally
    //   708	723	727	finally
    //   723	725	727	finally
    //   728	730	727	finally
    //   398	457	742	finally
    //   457	485	742	finally
    //   737	739	742	finally
    //   743	745	742	finally
  }
  
  public final void a(int paramInt) {}
  
  public final void a(String paramString)
  {
    synchronized (i)
    {
      h.add(paramString);
      return;
    }
  }
  
  public final void c_() {}
}


/* Location:              com/google/android/gms/b/so.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */