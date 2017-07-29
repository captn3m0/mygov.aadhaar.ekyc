package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.a.a;
import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.m;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.c;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class ne
  extends ix.a
{
  private final String a;
  private final mw b;
  private m c;
  private final my d;
  private pl e;
  private String f;
  
  public ne(Context paramContext, String paramString, oc paramoc, un paramun, e parame)
  {
    this(paramString, localmw);
  }
  
  /* Error */
  private ne(String paramString, mw parammw)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: aload_0
    //   6: invokespecial 27	com/google/android/gms/b/ix$a:<init>	()V
    //   9: aload_0
    //   10: aload_1
    //   11: putfield 29	com/google/android/gms/b/ne:a	Ljava/lang/String;
    //   14: aload_0
    //   15: aload_2
    //   16: putfield 31	com/google/android/gms/b/ne:b	Lcom/google/android/gms/b/mw;
    //   19: new 33	com/google/android/gms/b/my
    //   22: astore 5
    //   24: aload 5
    //   26: invokespecial 34	com/google/android/gms/b/my:<init>	()V
    //   29: aload_0
    //   30: aload 5
    //   32: putfield 36	com/google/android/gms/b/ne:d	Lcom/google/android/gms/b/my;
    //   35: invokestatic 42	com/google/android/gms/ads/internal/w:t	()Lcom/google/android/gms/b/mz;
    //   38: astore 6
    //   40: aload 6
    //   42: getfield 46	com/google/android/gms/b/mz:c	Lcom/google/android/gms/b/mw;
    //   45: astore 5
    //   47: aload 5
    //   49: ifnonnull +541 -> 590
    //   52: new 17	com/google/android/gms/b/mw
    //   55: astore 5
    //   57: aload_2
    //   58: getfield 49	com/google/android/gms/b/mw:a	Landroid/content/Context;
    //   61: invokevirtual 55	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   64: astore 7
    //   66: aload_2
    //   67: getfield 58	com/google/android/gms/b/mw:b	Lcom/google/android/gms/b/oc;
    //   70: astore 8
    //   72: aload_2
    //   73: getfield 61	com/google/android/gms/b/mw:c	Lcom/google/android/gms/b/un;
    //   76: astore 9
    //   78: aload_2
    //   79: getfield 64	com/google/android/gms/b/mw:d	Lcom/google/android/gms/ads/internal/e;
    //   82: astore 10
    //   84: aload 5
    //   86: aload 7
    //   88: aload 8
    //   90: aload 9
    //   92: aload 10
    //   94: invokespecial 21	com/google/android/gms/b/mw:<init>	(Landroid/content/Context;Lcom/google/android/gms/b/oc;Lcom/google/android/gms/b/un;Lcom/google/android/gms/ads/internal/e;)V
    //   97: aload 6
    //   99: aload 5
    //   101: putfield 46	com/google/android/gms/b/mz:c	Lcom/google/android/gms/b/mw;
    //   104: aload 6
    //   106: getfield 46	com/google/android/gms/b/mz:c	Lcom/google/android/gms/b/mw;
    //   109: astore 5
    //   111: aload 5
    //   113: ifnull +477 -> 590
    //   116: aload 6
    //   118: getfield 46	com/google/android/gms/b/mz:c	Lcom/google/android/gms/b/mw;
    //   121: getfield 49	com/google/android/gms/b/mw:a	Landroid/content/Context;
    //   124: invokevirtual 55	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   127: astore 5
    //   129: ldc 66
    //   131: astore 7
    //   133: aload 5
    //   135: aload 7
    //   137: iconst_0
    //   138: invokevirtual 70	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   141: astore 8
    //   143: aload 6
    //   145: getfield 73	com/google/android/gms/b/mz:b	Ljava/util/LinkedList;
    //   148: astore 5
    //   150: aload 5
    //   152: invokevirtual 79	java/util/LinkedList:size	()I
    //   155: istore 11
    //   157: iload 11
    //   159: ifle +105 -> 264
    //   162: aload 6
    //   164: getfield 73	com/google/android/gms/b/mz:b	Ljava/util/LinkedList;
    //   167: invokevirtual 83	java/util/LinkedList:remove	()Ljava/lang/Object;
    //   170: checkcast 85	com/google/android/gms/b/nb
    //   173: astore 5
    //   175: aload 6
    //   177: getfield 88	com/google/android/gms/b/mz:a	Ljava/util/Map;
    //   180: aload 5
    //   182: invokeinterface 94 2 0
    //   187: checkcast 96	com/google/android/gms/b/nc
    //   190: astore 7
    //   192: ldc 98
    //   194: astore 9
    //   196: aload 9
    //   198: aload 5
    //   200: invokestatic 101	com/google/android/gms/b/mz:a	(Ljava/lang/String;Lcom/google/android/gms/b/nb;)V
    //   203: aload 7
    //   205: getfield 103	com/google/android/gms/b/nc:a	Ljava/util/LinkedList;
    //   208: astore 9
    //   210: aload 9
    //   212: invokevirtual 79	java/util/LinkedList:size	()I
    //   215: istore 12
    //   217: iload 12
    //   219: ifle +25 -> 244
    //   222: iconst_0
    //   223: istore 12
    //   225: aload 7
    //   227: aconst_null
    //   228: invokevirtual 106	com/google/android/gms/b/nc:a	(Lcom/google/android/gms/b/ih;)Lcom/google/android/gms/b/nc$a;
    //   231: getfield 110	com/google/android/gms/b/nc$a:a	Lcom/google/android/gms/ads/internal/m;
    //   234: astore 9
    //   236: aload 9
    //   238: invokevirtual 115	com/google/android/gms/ads/internal/m:O	()V
    //   241: goto -38 -> 203
    //   244: aload 6
    //   246: getfield 88	com/google/android/gms/b/mz:a	Ljava/util/Map;
    //   249: astore 7
    //   251: aload 7
    //   253: aload 5
    //   255: invokeinterface 117 2 0
    //   260: pop
    //   261: goto -118 -> 143
    //   264: new 119	java/util/HashMap
    //   267: astore 9
    //   269: aload 9
    //   271: invokespecial 120	java/util/HashMap:<init>	()V
    //   274: aload 8
    //   276: invokeinterface 126 1 0
    //   281: astore 5
    //   283: aload 5
    //   285: invokeinterface 130 1 0
    //   290: astore 5
    //   292: aload 5
    //   294: invokeinterface 136 1 0
    //   299: astore 10
    //   301: aload 10
    //   303: invokeinterface 142 1 0
    //   308: istore 11
    //   310: iload 11
    //   312: ifeq +279 -> 591
    //   315: aload 10
    //   317: invokeinterface 145 1 0
    //   322: astore 5
    //   324: aload 5
    //   326: checkcast 147	java/util/Map$Entry
    //   329: astore 5
    //   331: aload 5
    //   333: invokeinterface 150 1 0
    //   338: astore 7
    //   340: aload 7
    //   342: checkcast 152	java/lang/String
    //   345: astore 7
    //   347: ldc -102
    //   349: astore 13
    //   351: aload 7
    //   353: aload 13
    //   355: invokevirtual 158	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   358: istore 14
    //   360: iload 14
    //   362: ifne -61 -> 301
    //   365: aload 5
    //   367: invokeinterface 161 1 0
    //   372: astore 5
    //   374: aload 5
    //   376: checkcast 152	java/lang/String
    //   379: astore 5
    //   381: aload 5
    //   383: invokestatic 166	com/google/android/gms/b/nf:a	(Ljava/lang/String;)Lcom/google/android/gms/b/nf;
    //   386: astore 5
    //   388: new 85	com/google/android/gms/b/nb
    //   391: astore 7
    //   393: aload 5
    //   395: getfield 169	com/google/android/gms/b/nf:a	Lcom/google/android/gms/b/ih;
    //   398: astore 13
    //   400: aload 5
    //   402: getfield 171	com/google/android/gms/b/nf:b	Ljava/lang/String;
    //   405: astore 15
    //   407: aload 5
    //   409: getfield 174	com/google/android/gms/b/nf:c	I
    //   412: istore 16
    //   414: aload 7
    //   416: aload 13
    //   418: aload 15
    //   420: iload 16
    //   422: invokespecial 177	com/google/android/gms/b/nb:<init>	(Lcom/google/android/gms/b/ih;Ljava/lang/String;I)V
    //   425: aload 6
    //   427: getfield 88	com/google/android/gms/b/mz:a	Ljava/util/Map;
    //   430: astore 13
    //   432: aload 13
    //   434: aload 7
    //   436: invokeinterface 180 2 0
    //   441: istore 17
    //   443: iload 17
    //   445: ifne -144 -> 301
    //   448: new 96	com/google/android/gms/b/nc
    //   451: astore 13
    //   453: aload 5
    //   455: getfield 169	com/google/android/gms/b/nf:a	Lcom/google/android/gms/b/ih;
    //   458: astore 15
    //   460: aload 5
    //   462: getfield 171	com/google/android/gms/b/nf:b	Ljava/lang/String;
    //   465: astore 18
    //   467: aload 5
    //   469: getfield 174	com/google/android/gms/b/nf:c	I
    //   472: istore 11
    //   474: aload 13
    //   476: aload 15
    //   478: aload 18
    //   480: iload 11
    //   482: invokespecial 181	com/google/android/gms/b/nc:<init>	(Lcom/google/android/gms/b/ih;Ljava/lang/String;I)V
    //   485: aload 6
    //   487: getfield 88	com/google/android/gms/b/mz:a	Ljava/util/Map;
    //   490: astore 5
    //   492: aload 5
    //   494: aload 7
    //   496: aload 13
    //   498: invokeinterface 185 3 0
    //   503: pop
    //   504: aload 7
    //   506: invokevirtual 189	com/google/android/gms/b/nb:toString	()Ljava/lang/String;
    //   509: astore 5
    //   511: aload 9
    //   513: aload 5
    //   515: aload 7
    //   517: invokeinterface 185 3 0
    //   522: pop
    //   523: ldc -65
    //   525: astore 5
    //   527: aload 5
    //   529: aload 7
    //   531: invokestatic 101	com/google/android/gms/b/mz:a	(Ljava/lang/String;Lcom/google/android/gms/b/nb;)V
    //   534: goto -233 -> 301
    //   537: astore 5
    //   539: invokestatic 195	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   542: astore 7
    //   544: ldc -59
    //   546: astore 4
    //   548: aload 7
    //   550: aload 5
    //   552: aload 4
    //   554: invokevirtual 202	com/google/android/gms/b/tj:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   557: ldc -52
    //   559: astore 7
    //   561: aload 7
    //   563: aload 5
    //   565: invokestatic 209	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   568: aload 6
    //   570: getfield 88	com/google/android/gms/b/mz:a	Ljava/util/Map;
    //   573: invokeinterface 212 1 0
    //   578: aload 6
    //   580: getfield 73	com/google/android/gms/b/mz:b	Ljava/util/LinkedList;
    //   583: astore 5
    //   585: aload 5
    //   587: invokevirtual 213	java/util/LinkedList:clear	()V
    //   590: return
    //   591: ldc -102
    //   593: astore 5
    //   595: ldc -41
    //   597: astore 7
    //   599: aload 8
    //   601: aload 5
    //   603: aload 7
    //   605: invokeinterface 219 3 0
    //   610: astore 5
    //   612: aload 5
    //   614: invokestatic 222	com/google/android/gms/b/mz:a	(Ljava/lang/String;)[Ljava/lang/String;
    //   617: astore 8
    //   619: aload 8
    //   621: arraylength
    //   622: istore 19
    //   624: iconst_0
    //   625: istore 14
    //   627: aconst_null
    //   628: astore 7
    //   630: iload 14
    //   632: iload 19
    //   634: if_icmpge -44 -> 590
    //   637: aload 8
    //   639: iload 14
    //   641: aaload
    //   642: astore 5
    //   644: aload 9
    //   646: aload 5
    //   648: invokeinterface 94 2 0
    //   653: astore 5
    //   655: aload 5
    //   657: checkcast 85	com/google/android/gms/b/nb
    //   660: astore 5
    //   662: aload 6
    //   664: getfield 88	com/google/android/gms/b/mz:a	Ljava/util/Map;
    //   667: astore 4
    //   669: aload 4
    //   671: aload 5
    //   673: invokeinterface 180 2 0
    //   678: istore_3
    //   679: iload_3
    //   680: ifeq +18 -> 698
    //   683: aload 6
    //   685: getfield 73	com/google/android/gms/b/mz:b	Ljava/util/LinkedList;
    //   688: astore 4
    //   690: aload 4
    //   692: aload 5
    //   694: invokevirtual 225	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   697: pop
    //   698: iload 14
    //   700: iconst_1
    //   701: iadd
    //   702: istore 11
    //   704: iload 11
    //   706: istore 14
    //   708: goto -78 -> 630
    //   711: astore 5
    //   713: goto -174 -> 539
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	716	0	this	ne
    //   0	716	1	paramString	String
    //   0	716	2	parammw	mw
    //   1	679	3	bool1	boolean
    //   3	688	4	localObject1	Object
    //   22	506	5	localObject2	Object
    //   537	27	5	localRuntimeException	RuntimeException
    //   583	110	5	localObject3	Object
    //   711	1	5	localIOException	java.io.IOException
    //   38	646	6	localmz	mz
    //   64	565	7	localObject4	Object
    //   70	568	8	localObject5	Object
    //   76	569	9	localObject6	Object
    //   82	234	10	localObject7	Object
    //   155	3	11	i	int
    //   308	3	11	bool2	boolean
    //   472	233	11	j	int
    //   215	9	12	k	int
    //   349	148	13	localObject8	Object
    //   358	349	14	m	int
    //   405	72	15	localObject9	Object
    //   412	9	16	n	int
    //   441	3	17	bool3	boolean
    //   465	14	18	str	String
    //   622	13	19	i1	int
    // Exception table:
    //   from	to	target	type
    //   264	267	537	java/lang/RuntimeException
    //   269	274	537	java/lang/RuntimeException
    //   274	281	537	java/lang/RuntimeException
    //   283	290	537	java/lang/RuntimeException
    //   292	299	537	java/lang/RuntimeException
    //   301	308	537	java/lang/RuntimeException
    //   315	322	537	java/lang/RuntimeException
    //   324	329	537	java/lang/RuntimeException
    //   331	338	537	java/lang/RuntimeException
    //   340	345	537	java/lang/RuntimeException
    //   353	358	537	java/lang/RuntimeException
    //   365	372	537	java/lang/RuntimeException
    //   374	379	537	java/lang/RuntimeException
    //   381	386	537	java/lang/RuntimeException
    //   388	391	537	java/lang/RuntimeException
    //   393	398	537	java/lang/RuntimeException
    //   400	405	537	java/lang/RuntimeException
    //   407	412	537	java/lang/RuntimeException
    //   420	425	537	java/lang/RuntimeException
    //   425	430	537	java/lang/RuntimeException
    //   434	441	537	java/lang/RuntimeException
    //   448	451	537	java/lang/RuntimeException
    //   453	458	537	java/lang/RuntimeException
    //   460	465	537	java/lang/RuntimeException
    //   467	472	537	java/lang/RuntimeException
    //   480	485	537	java/lang/RuntimeException
    //   485	490	537	java/lang/RuntimeException
    //   496	504	537	java/lang/RuntimeException
    //   504	509	537	java/lang/RuntimeException
    //   515	523	537	java/lang/RuntimeException
    //   529	534	537	java/lang/RuntimeException
    //   603	610	537	java/lang/RuntimeException
    //   612	617	537	java/lang/RuntimeException
    //   619	622	537	java/lang/RuntimeException
    //   639	642	537	java/lang/RuntimeException
    //   646	653	537	java/lang/RuntimeException
    //   655	660	537	java/lang/RuntimeException
    //   662	667	537	java/lang/RuntimeException
    //   671	678	537	java/lang/RuntimeException
    //   683	688	537	java/lang/RuntimeException
    //   692	698	537	java/lang/RuntimeException
    //   264	267	711	java/io/IOException
    //   269	274	711	java/io/IOException
    //   274	281	711	java/io/IOException
    //   283	290	711	java/io/IOException
    //   292	299	711	java/io/IOException
    //   301	308	711	java/io/IOException
    //   315	322	711	java/io/IOException
    //   324	329	711	java/io/IOException
    //   331	338	711	java/io/IOException
    //   340	345	711	java/io/IOException
    //   353	358	711	java/io/IOException
    //   365	372	711	java/io/IOException
    //   374	379	711	java/io/IOException
    //   381	386	711	java/io/IOException
    //   388	391	711	java/io/IOException
    //   393	398	711	java/io/IOException
    //   400	405	711	java/io/IOException
    //   407	412	711	java/io/IOException
    //   420	425	711	java/io/IOException
    //   425	430	711	java/io/IOException
    //   434	441	711	java/io/IOException
    //   448	451	711	java/io/IOException
    //   453	458	711	java/io/IOException
    //   460	465	711	java/io/IOException
    //   467	472	711	java/io/IOException
    //   480	485	711	java/io/IOException
    //   485	490	711	java/io/IOException
    //   496	504	711	java/io/IOException
    //   504	509	711	java/io/IOException
    //   515	523	711	java/io/IOException
    //   529	534	711	java/io/IOException
    //   603	610	711	java/io/IOException
    //   612	617	711	java/io/IOException
    //   619	622	711	java/io/IOException
    //   639	642	711	java/io/IOException
    //   646	653	711	java/io/IOException
    //   655	660	711	java/io/IOException
    //   662	667	711	java/io/IOException
    //   671	678	711	java/io/IOException
    //   683	688	711	java/io/IOException
    //   692	698	711	java/io/IOException
  }
  
  private void a()
  {
    Object localObject1 = c;
    if (localObject1 != null) {}
    for (;;)
    {
      return;
      Object localObject2 = b;
      String str = a;
      localObject1 = new com/google/android/gms/ads/internal/m;
      Object localObject3 = a;
      il localil = new com/google/android/gms/b/il;
      localil.<init>();
      oc localoc = b;
      un localun = c;
      localObject2 = d;
      ((m)localObject1).<init>((Context)localObject3, localil, str, localoc, localun, (e)localObject2);
      c = ((m)localObject1);
      localObject1 = d;
      localObject3 = c;
      ((my)localObject1).a((m)localObject3);
      b();
    }
  }
  
  private void b()
  {
    Object localObject = c;
    if (localObject != null)
    {
      localObject = e;
      if (localObject != null)
      {
        localObject = c;
        pl localpl = e;
        String str = f;
        ((m)localObject).a(localpl, str);
      }
    }
  }
  
  public final String F()
  {
    Object localObject = c;
    if (localObject != null) {}
    for (localObject = c.F();; localObject = null) {
      return (String)localObject;
    }
  }
  
  public final void G()
  {
    Object localObject = c;
    if (localObject != null)
    {
      localObject = c;
      ((m)localObject).G();
    }
    for (;;)
    {
      return;
      localObject = "Interstitial ad must be loaded before showInterstitial().";
      tp.e((String)localObject);
    }
  }
  
  public final void a(il paramil)
  {
    m localm = c;
    if (localm != null)
    {
      localm = c;
      localm.a(paramil);
    }
  }
  
  public final void a(is paramis)
  {
    d.e = paramis;
    Object localObject = c;
    if (localObject != null)
    {
      localObject = d;
      m localm = c;
      ((my)localObject).a(localm);
    }
  }
  
  public final void a(it paramit)
  {
    d.a = paramit;
    Object localObject = c;
    if (localObject != null)
    {
      localObject = d;
      m localm = c;
      ((my)localObject).a(localm);
    }
  }
  
  public final void a(iz paramiz)
  {
    d.b = paramiz;
    Object localObject = c;
    if (localObject != null)
    {
      localObject = d;
      m localm = c;
      ((my)localObject).a(localm);
    }
  }
  
  public final void a(jb paramjb)
  {
    a();
    m localm = c;
    if (localm != null)
    {
      localm = c;
      localm.a(paramjb);
    }
  }
  
  public final void a(jh paramjh)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Unused method");
    throw localIllegalStateException;
  }
  
  public final void a(jt paramjt)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("getVideoController not implemented for interstitials");
    throw localIllegalStateException;
  }
  
  public final void a(kq paramkq)
  {
    d.d = paramkq;
    Object localObject = c;
    if (localObject != null)
    {
      localObject = d;
      m localm = c;
      ((my)localObject).a(localm);
    }
  }
  
  public final void a(ph paramph)
  {
    d.c = paramph;
    Object localObject = c;
    if (localObject != null)
    {
      localObject = d;
      m localm = c;
      ((my)localObject).a(localm);
    }
  }
  
  public final void a(pl parampl, String paramString)
  {
    e = parampl;
    f = paramString;
    b();
  }
  
  public final void a(sb paramsb)
  {
    d.f = paramsb;
    Object localObject = c;
    if (localObject != null)
    {
      localObject = d;
      m localm = c;
      ((my)localObject).a(localm);
    }
  }
  
  public final void a(String paramString) {}
  
  public final void a(boolean paramBoolean)
  {
    a();
    m localm = c;
    if (localm != null)
    {
      localm = c;
      localm.a(paramBoolean);
    }
  }
  
  public final boolean a(ih paramih)
  {
    StringBuilder localStringBuilder = null;
    int i = 1;
    Object localObject1 = mz.a(paramih);
    Object localObject2 = "gw";
    boolean bool1 = ((Set)localObject1).contains(localObject2);
    if (!bool1) {
      a();
    }
    localObject1 = mz.a(paramih);
    localObject2 = "_skipMediation";
    bool1 = ((Set)localObject1).contains(localObject2);
    if (bool1) {
      a();
    }
    localObject1 = j;
    if (localObject1 != null) {
      a();
    }
    localObject1 = c;
    if (localObject1 != null)
    {
      localObject1 = c;
      bool1 = ((m)localObject1).a(paramih);
      return bool1;
    }
    Object localObject3 = w.t();
    localObject1 = mz.a(paramih);
    localObject2 = "_ad";
    bool1 = ((Set)localObject1).contains(localObject2);
    Object localObject5;
    nb localnb;
    if (bool1)
    {
      localObject1 = a;
      localObject2 = c;
      if (localObject2 != null)
      {
        localObject2 = c.a.getApplicationContext();
        localObject4 = new com/google/android/gms/b/rn$a;
        ((rn.a)localObject4).<init>((Context)localObject2);
        localObject2 = ((rn.a)localObject4).a();
        int k = m;
        localObject4 = mz.b(paramih);
        localObject5 = mz.c((String)localObject1);
        localnb = new com/google/android/gms/b/nb;
        localnb.<init>((ih)localObject4, (String)localObject5, k);
        localObject1 = (nc)a.get(localnb);
        if (localObject1 == null)
        {
          mz.a("Interstitial pool created at %s.", localnb);
          localObject1 = new com/google/android/gms/b/nc;
          ((nc)localObject1).<init>((ih)localObject4, (String)localObject5, k);
          localObject2 = a;
          ((Map)localObject2).put(localnb, localObject1);
        }
        localObject2 = c;
        localObject4 = new com/google/android/gms/b/nc$a;
        ((nc.a)localObject4).<init>((nc)localObject1, (mw)localObject2, paramih);
        localObject2 = a;
        ((LinkedList)localObject2).add(localObject4);
        e = i;
        localObject1 = "Inline entry added to the queue at %s.";
        mz.a((String)localObject1, localnb);
      }
    }
    localObject1 = a;
    boolean bool3 = mz.b((String)localObject1);
    int m;
    if (!bool3)
    {
      localObject2 = c.a.getApplicationContext();
      localObject4 = new com/google/android/gms/b/rn$a;
      ((rn.a)localObject4).<init>((Context)localObject2);
      localObject2 = ((rn.a)localObject4).a();
      m = m;
      localObject5 = mz.b(paramih);
      localObject4 = mz.c((String)localObject1);
      localnb = new com/google/android/gms/b/nb;
      localnb.<init>((ih)localObject5, (String)localObject4, m);
      localObject1 = (nc)a.get(localnb);
      if (localObject1 != null) {
        break label1106;
      }
      mz.a("Interstitial pool created at %s.", localnb);
      localObject1 = new com/google/android/gms/b/nc;
      ((nc)localObject1).<init>((ih)localObject5, (String)localObject4, m);
      localObject2 = a;
      ((Map)localObject2).put(localnb, localObject1);
    }
    label878:
    label939:
    label1046:
    label1055:
    label1079:
    label1106:
    for (Object localObject4 = localObject1;; localObject4 = localObject1)
    {
      b.remove(localnb);
      localObject1 = b;
      ((LinkedList)localObject1).add(localnb);
      e = i;
      int j;
      for (;;)
      {
        m = b.size();
        localObject1 = ke.ba;
        Object localObject6 = w.q();
        localObject1 = (Integer)((kd)localObject6).a((jz)localObject1);
        j = ((Integer)localObject1).intValue();
        if (m <= j) {
          break;
        }
        localObject1 = (nb)b.remove();
        localObject2 = (nc)a.get(localObject1);
        localObject6 = "Evicting interstitial queue for %s.";
        mz.a((String)localObject6, (nb)localObject1);
        for (;;)
        {
          localObject6 = a;
          i = ((LinkedList)localObject6).size();
          if (i <= 0) {
            break;
          }
          localObject6 = ((nc)localObject2).a(null);
          boolean bool5 = e;
          if (bool5)
          {
            nd localnd = nd.a();
            int n = c + 1;
            c = n;
          }
          localObject6 = a;
          ((m)localObject6).O();
        }
        localObject2 = a;
        ((Map)localObject2).remove(localObject1);
      }
      for (;;)
      {
        localObject1 = a;
        j = ((LinkedList)localObject1).size();
        if (j <= 0) {
          break label1046;
        }
        localObject2 = ((nc)localObject4).a((ih)localObject5);
        bool2 = e;
        if (!bool2) {
          break;
        }
        long l1 = w.k().a();
        long l2 = d;
        l1 -= l2;
        localObject1 = ke.bc;
        localObject3 = w.q();
        localObject1 = (Integer)((kd)localObject3).a((jz)localObject1);
        long l3 = ((Integer)localObject1).intValue();
        l2 = 1000L * l3;
        bool2 = l1 < l2;
        if (!bool2) {
          break;
        }
        mz.a("Expired interstitial at %s.", localnb);
        localObject1 = nd.a();
        m = b + 1;
        b = m;
      }
      localObject1 = b;
      int i1;
      if (localObject1 != null)
      {
        localObject1 = " (inline) ";
        i1 = String.valueOf(localObject1).length() + 34;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(i1);
        localObject1 = localStringBuilder.append("Pooled interstitial").append((String)localObject1);
        localObject4 = "returned at %s.";
        mz.a((String)localObject4, localnb);
        localObject1 = localObject2;
        if (localObject1 == null) {
          break label1079;
        }
        boolean bool4 = e;
        if (bool4) {
          break label1055;
        }
        ((nc.a)localObject1).a();
        localObject2 = nd.a();
        ((nd)localObject2).b();
      }
      for (;;)
      {
        localObject2 = a;
        c = ((m)localObject2);
        localObject2 = c;
        localObject4 = d;
        ((mx)localObject2).a((my)localObject4);
        localObject2 = d;
        localObject4 = c;
        ((my)localObject2).a((m)localObject4);
        b();
        bool2 = f;
        break;
        localObject1 = " ";
        break label878;
        bool2 = false;
        localObject1 = null;
        break label939;
        localObject2 = nd.a();
        i1 = d + 1;
        d = i1;
      }
      a();
      nd.a().b();
      localObject1 = c;
      boolean bool2 = ((m)localObject1).a(paramih);
      break;
    }
  }
  
  public final void h()
  {
    m localm = c;
    if (localm != null)
    {
      localm = c;
      localm.h();
    }
  }
  
  public final a i()
  {
    Object localObject = c;
    if (localObject != null) {}
    for (localObject = c.i();; localObject = null) {
      return (a)localObject;
    }
  }
  
  public final il j()
  {
    Object localObject = c;
    if (localObject != null) {}
    for (localObject = c.j();; localObject = null) {
      return (il)localObject;
    }
  }
  
  public final boolean k()
  {
    m localm = c;
    boolean bool;
    if (localm != null)
    {
      localm = c;
      bool = localm.k();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localm = null;
    }
  }
  
  public final void l()
  {
    Object localObject = c;
    if (localObject != null)
    {
      localObject = c;
      ((m)localObject).l();
    }
    for (;;)
    {
      return;
      localObject = "Interstitial ad must be loaded before pingManualTrackingUrl().";
      tp.e((String)localObject);
    }
  }
  
  public final void m()
  {
    m localm = c;
    if (localm != null)
    {
      localm = c;
      localm.m();
    }
  }
  
  public final void n()
  {
    m localm = c;
    if (localm != null)
    {
      localm = c;
      localm.n();
    }
  }
  
  public final void o()
  {
    m localm = c;
    if (localm != null)
    {
      localm = c;
      localm.o();
    }
  }
  
  public final boolean p()
  {
    m localm = c;
    boolean bool;
    if (localm != null)
    {
      localm = c;
      bool = localm.p();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localm = null;
    }
  }
  
  public final jf q()
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("getVideoController not implemented for interstitials");
    throw localIllegalStateException;
  }
}


/* Location:              com/google/android/gms/b/ne.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */