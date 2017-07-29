package com.google.android.gms.b;

public class vn
  extends vd
{
  public vn(vc paramvc, boolean paramBoolean)
  {
    super(paramvc, paramBoolean);
  }
  
  /* Error */
  protected final android.webkit.WebResourceResponse a(android.webkit.WebView paramWebView, String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: instanceof 10
    //   4: istore_3
    //   5: iload_3
    //   6: ifne +16 -> 22
    //   9: ldc 12
    //   11: invokestatic 18	com/google/android/gms/b/tp:e	(Ljava/lang/String;)V
    //   14: iconst_0
    //   15: istore_3
    //   16: aconst_null
    //   17: astore 4
    //   19: aload 4
    //   21: areturn
    //   22: aload_1
    //   23: astore 4
    //   25: aload_1
    //   26: checkcast 10	com/google/android/gms/b/vc
    //   29: astore 4
    //   31: new 20	java/io/File
    //   34: astore 5
    //   36: aload 5
    //   38: aload_2
    //   39: invokespecial 22	java/io/File:<init>	(Ljava/lang/String;)V
    //   42: aload 5
    //   44: invokevirtual 26	java/io/File:getName	()Ljava/lang/String;
    //   47: astore 5
    //   49: ldc 28
    //   51: astore 6
    //   53: aload 6
    //   55: aload 5
    //   57: invokevirtual 34	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   60: istore 7
    //   62: iload 7
    //   64: ifne +17 -> 81
    //   67: aload_0
    //   68: aload_1
    //   69: checkcast 36	android/webkit/WebView
    //   72: aload_2
    //   73: invokespecial 40	com/google/android/gms/b/vd:shouldInterceptRequest	(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    //   76: astore 4
    //   78: goto -59 -> 19
    //   81: aload 4
    //   83: invokeinterface 44 1 0
    //   88: astore 5
    //   90: aload 5
    //   92: ifnull +68 -> 160
    //   95: aload 4
    //   97: invokeinterface 44 1 0
    //   102: astore 5
    //   104: aload 5
    //   106: getfield 48	com/google/android/gms/b/vd:b	Ljava/lang/Object;
    //   109: astore 6
    //   111: aload 6
    //   113: monitorenter
    //   114: iconst_0
    //   115: istore 8
    //   117: aconst_null
    //   118: astore 9
    //   120: aload 5
    //   122: iconst_0
    //   123: putfield 52	com/google/android/gms/b/vd:f	Z
    //   126: iconst_1
    //   127: istore 8
    //   129: aload 5
    //   131: iload 8
    //   133: putfield 56	com/google/android/gms/b/vd:g	Z
    //   136: invokestatic 61	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   139: pop
    //   140: new 63	com/google/android/gms/b/vd$2
    //   143: astore 9
    //   145: aload 9
    //   147: aload 5
    //   149: invokespecial 66	com/google/android/gms/b/vd$2:<init>	(Lcom/google/android/gms/b/vd;)V
    //   152: aload 9
    //   154: invokestatic 72	com/google/android/gms/b/tt:a	(Ljava/lang/Runnable;)V
    //   157: aload 6
    //   159: monitorexit
    //   160: aload 4
    //   162: invokeinterface 76 1 0
    //   167: astore 5
    //   169: aload 5
    //   171: getfield 81	com/google/android/gms/b/il:d	Z
    //   174: istore 7
    //   176: iload 7
    //   178: ifeq +184 -> 362
    //   181: getstatic 87	com/google/android/gms/b/ke:S	Lcom/google/android/gms/b/jz;
    //   184: astore 5
    //   186: invokestatic 91	com/google/android/gms/ads/internal/w:q	()Lcom/google/android/gms/b/kd;
    //   189: astore 6
    //   191: aload 6
    //   193: aload 5
    //   195: invokevirtual 96	com/google/android/gms/b/kd:a	(Lcom/google/android/gms/b/jz;)Ljava/lang/Object;
    //   198: checkcast 30	java/lang/String
    //   201: astore 5
    //   203: aload 4
    //   205: invokeinterface 100 1 0
    //   210: astore 6
    //   212: aload 4
    //   214: invokeinterface 104 1 0
    //   219: astore 4
    //   221: aload 4
    //   223: getfield 109	com/google/android/gms/b/un:a	Ljava/lang/String;
    //   226: astore 4
    //   228: new 111	java/util/HashMap
    //   231: astore 9
    //   233: aload 9
    //   235: invokespecial 114	java/util/HashMap:<init>	()V
    //   238: ldc 116
    //   240: astore 10
    //   242: invokestatic 61	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   245: astore 11
    //   247: aload 11
    //   249: aload 6
    //   251: aload 4
    //   253: invokevirtual 119	com/google/android/gms/b/tt:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   256: astore 4
    //   258: aload 9
    //   260: aload 10
    //   262: aload 4
    //   264: invokeinterface 125 3 0
    //   269: pop
    //   270: ldc 127
    //   272: astore 4
    //   274: ldc -127
    //   276: astore 10
    //   278: aload 9
    //   280: aload 4
    //   282: aload 10
    //   284: invokeinterface 125 3 0
    //   289: pop
    //   290: new 131	com/google/android/gms/b/ua
    //   293: astore 4
    //   295: aload 4
    //   297: aload 6
    //   299: invokespecial 134	com/google/android/gms/b/ua:<init>	(Landroid/content/Context;)V
    //   302: aload 5
    //   304: aload 9
    //   306: invokestatic 137	com/google/android/gms/b/ua:a	(Ljava/lang/String;Ljava/util/Map;)Lcom/google/android/gms/b/us;
    //   309: astore 4
    //   311: bipush 60
    //   313: i2l
    //   314: lstore 12
    //   316: getstatic 145	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   319: astore 5
    //   321: aload 4
    //   323: lload 12
    //   325: aload 5
    //   327: invokeinterface 151 4 0
    //   332: astore 4
    //   334: aload 4
    //   336: checkcast 30	java/lang/String
    //   339: astore 4
    //   341: aload 4
    //   343: ifnonnull +83 -> 426
    //   346: iconst_0
    //   347: istore_3
    //   348: aconst_null
    //   349: astore 4
    //   351: goto -332 -> 19
    //   354: astore 4
    //   356: aload 6
    //   358: monitorexit
    //   359: aload 4
    //   361: athrow
    //   362: aload 4
    //   364: invokeinterface 155 1 0
    //   369: istore 7
    //   371: iload 7
    //   373: ifeq +28 -> 401
    //   376: getstatic 158	com/google/android/gms/b/ke:R	Lcom/google/android/gms/b/jz;
    //   379: astore 5
    //   381: invokestatic 91	com/google/android/gms/ads/internal/w:q	()Lcom/google/android/gms/b/kd;
    //   384: astore 6
    //   386: aload 6
    //   388: aload 5
    //   390: invokevirtual 96	com/google/android/gms/b/kd:a	(Lcom/google/android/gms/b/jz;)Ljava/lang/Object;
    //   393: checkcast 30	java/lang/String
    //   396: astore 5
    //   398: goto -195 -> 203
    //   401: getstatic 161	com/google/android/gms/b/ke:Q	Lcom/google/android/gms/b/jz;
    //   404: astore 5
    //   406: invokestatic 91	com/google/android/gms/ads/internal/w:q	()Lcom/google/android/gms/b/kd;
    //   409: astore 6
    //   411: aload 6
    //   413: aload 5
    //   415: invokevirtual 96	com/google/android/gms/b/kd:a	(Lcom/google/android/gms/b/jz;)Ljava/lang/Object;
    //   418: checkcast 30	java/lang/String
    //   421: astore 5
    //   423: goto -220 -> 203
    //   426: new 163	android/webkit/WebResourceResponse
    //   429: astore 5
    //   431: ldc -91
    //   433: astore 6
    //   435: ldc -89
    //   437: astore 9
    //   439: new 169	java/io/ByteArrayInputStream
    //   442: astore 10
    //   444: ldc -89
    //   446: astore 11
    //   448: aload 4
    //   450: aload 11
    //   452: invokevirtual 173	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   455: astore 4
    //   457: aload 10
    //   459: aload 4
    //   461: invokespecial 176	java/io/ByteArrayInputStream:<init>	([B)V
    //   464: aload 5
    //   466: aload 6
    //   468: aload 9
    //   470: aload 10
    //   472: invokespecial 179	android/webkit/WebResourceResponse:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
    //   475: aload 5
    //   477: astore 4
    //   479: goto -460 -> 19
    //   482: astore 4
    //   484: ldc -75
    //   486: astore 5
    //   488: aload 4
    //   490: invokevirtual 186	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   493: invokestatic 190	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   496: astore 4
    //   498: aload 4
    //   500: invokevirtual 194	java/lang/String:length	()I
    //   503: istore 14
    //   505: iload 14
    //   507: ifeq +25 -> 532
    //   510: aload 5
    //   512: aload 4
    //   514: invokevirtual 198	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   517: astore 4
    //   519: aload 4
    //   521: invokestatic 18	com/google/android/gms/b/tp:e	(Ljava/lang/String;)V
    //   524: iconst_0
    //   525: istore_3
    //   526: aconst_null
    //   527: astore 4
    //   529: goto -510 -> 19
    //   532: new 30	java/lang/String
    //   535: astore 4
    //   537: aload 4
    //   539: aload 5
    //   541: invokespecial 199	java/lang/String:<init>	(Ljava/lang/String;)V
    //   544: goto -25 -> 519
    //   547: astore 4
    //   549: goto -65 -> 484
    //   552: astore 4
    //   554: goto -70 -> 484
    //   557: astore 4
    //   559: goto -75 -> 484
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	562	0	this	vn
    //   0	562	1	paramWebView	android.webkit.WebView
    //   0	562	2	paramString	String
    //   4	522	3	bool1	boolean
    //   17	333	4	localObject1	Object
    //   354	95	4	localObject2	Object
    //   455	23	4	localObject3	Object
    //   482	7	4	localInterruptedException	InterruptedException
    //   496	42	4	str	String
    //   547	1	4	localExecutionException	java.util.concurrent.ExecutionException
    //   552	1	4	localIOException	java.io.IOException
    //   557	1	4	localTimeoutException	java.util.concurrent.TimeoutException
    //   34	506	5	localObject4	Object
    //   51	416	6	localObject5	Object
    //   60	312	7	bool2	boolean
    //   115	17	8	bool3	boolean
    //   118	351	9	localObject6	Object
    //   240	231	10	localObject7	Object
    //   245	206	11	localObject8	Object
    //   314	10	12	l	long
    //   503	3	14	i	int
    // Exception table:
    //   from	to	target	type
    //   122	126	354	finally
    //   131	136	354	finally
    //   136	140	354	finally
    //   140	143	354	finally
    //   147	152	354	finally
    //   152	157	354	finally
    //   157	160	354	finally
    //   356	359	354	finally
    //   203	210	482	java/lang/InterruptedException
    //   212	219	482	java/lang/InterruptedException
    //   221	226	482	java/lang/InterruptedException
    //   228	231	482	java/lang/InterruptedException
    //   233	238	482	java/lang/InterruptedException
    //   242	245	482	java/lang/InterruptedException
    //   251	256	482	java/lang/InterruptedException
    //   262	270	482	java/lang/InterruptedException
    //   282	290	482	java/lang/InterruptedException
    //   290	293	482	java/lang/InterruptedException
    //   297	302	482	java/lang/InterruptedException
    //   304	309	482	java/lang/InterruptedException
    //   316	319	482	java/lang/InterruptedException
    //   325	332	482	java/lang/InterruptedException
    //   334	339	482	java/lang/InterruptedException
    //   426	429	482	java/lang/InterruptedException
    //   439	442	482	java/lang/InterruptedException
    //   450	455	482	java/lang/InterruptedException
    //   459	464	482	java/lang/InterruptedException
    //   470	475	482	java/lang/InterruptedException
    //   203	210	547	java/util/concurrent/ExecutionException
    //   212	219	547	java/util/concurrent/ExecutionException
    //   221	226	547	java/util/concurrent/ExecutionException
    //   228	231	547	java/util/concurrent/ExecutionException
    //   233	238	547	java/util/concurrent/ExecutionException
    //   242	245	547	java/util/concurrent/ExecutionException
    //   251	256	547	java/util/concurrent/ExecutionException
    //   262	270	547	java/util/concurrent/ExecutionException
    //   282	290	547	java/util/concurrent/ExecutionException
    //   290	293	547	java/util/concurrent/ExecutionException
    //   297	302	547	java/util/concurrent/ExecutionException
    //   304	309	547	java/util/concurrent/ExecutionException
    //   316	319	547	java/util/concurrent/ExecutionException
    //   325	332	547	java/util/concurrent/ExecutionException
    //   334	339	547	java/util/concurrent/ExecutionException
    //   426	429	547	java/util/concurrent/ExecutionException
    //   439	442	547	java/util/concurrent/ExecutionException
    //   450	455	547	java/util/concurrent/ExecutionException
    //   459	464	547	java/util/concurrent/ExecutionException
    //   470	475	547	java/util/concurrent/ExecutionException
    //   203	210	552	java/io/IOException
    //   212	219	552	java/io/IOException
    //   221	226	552	java/io/IOException
    //   228	231	552	java/io/IOException
    //   233	238	552	java/io/IOException
    //   242	245	552	java/io/IOException
    //   251	256	552	java/io/IOException
    //   262	270	552	java/io/IOException
    //   282	290	552	java/io/IOException
    //   290	293	552	java/io/IOException
    //   297	302	552	java/io/IOException
    //   304	309	552	java/io/IOException
    //   316	319	552	java/io/IOException
    //   325	332	552	java/io/IOException
    //   334	339	552	java/io/IOException
    //   426	429	552	java/io/IOException
    //   439	442	552	java/io/IOException
    //   450	455	552	java/io/IOException
    //   459	464	552	java/io/IOException
    //   470	475	552	java/io/IOException
    //   203	210	557	java/util/concurrent/TimeoutException
    //   212	219	557	java/util/concurrent/TimeoutException
    //   221	226	557	java/util/concurrent/TimeoutException
    //   228	231	557	java/util/concurrent/TimeoutException
    //   233	238	557	java/util/concurrent/TimeoutException
    //   242	245	557	java/util/concurrent/TimeoutException
    //   251	256	557	java/util/concurrent/TimeoutException
    //   262	270	557	java/util/concurrent/TimeoutException
    //   282	290	557	java/util/concurrent/TimeoutException
    //   290	293	557	java/util/concurrent/TimeoutException
    //   297	302	557	java/util/concurrent/TimeoutException
    //   304	309	557	java/util/concurrent/TimeoutException
    //   316	319	557	java/util/concurrent/TimeoutException
    //   325	332	557	java/util/concurrent/TimeoutException
    //   334	339	557	java/util/concurrent/TimeoutException
    //   426	429	557	java/util/concurrent/TimeoutException
    //   439	442	557	java/util/concurrent/TimeoutException
    //   450	455	557	java/util/concurrent/TimeoutException
    //   459	464	557	java/util/concurrent/TimeoutException
    //   470	475	557	java/util/concurrent/TimeoutException
  }
}


/* Location:              com/google/android/gms/b/vn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */