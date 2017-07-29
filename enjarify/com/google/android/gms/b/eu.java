package com.google.android.gms.b;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.c.a;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.api.c.a;
import com.google.android.gms.common.m;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class eu
{
  protected static final Object i;
  protected static final Object m;
  private static final String p = eu.class.getSimpleName();
  private static m u = null;
  protected Context a;
  protected Context b;
  ExecutorService c;
  DexClassLoader d;
  dy e;
  byte[] f;
  volatile bf.a g = null;
  Future h = null;
  bl j;
  com.google.android.gms.common.api.c k = null;
  protected boolean l = false;
  protected boolean n = false;
  protected boolean o = false;
  private volatile a q = null;
  private volatile boolean r = false;
  private Future s = null;
  private volatile boolean t = false;
  private Map v;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    i = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    m = localObject;
  }
  
  private eu(Context paramContext)
  {
    a = paramContext;
    Object localObject = paramContext.getApplicationContext();
    b = ((Context)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    v = ((Map)localObject);
  }
  
  public static eu a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    int i1 = 1;
    Object localObject1 = null;
    Object localObject2 = new com/google/android/gms/b/eu;
    ((eu)localObject2).<init>(paramContext);
    for (;;)
    {
      Object localObject3;
      int i2;
      try
      {
        localObject3 = Executors.newCachedThreadPool();
        c = ((ExecutorService)localObject3);
        r = paramBoolean;
        if (paramBoolean)
        {
          localObject3 = c;
          localObject4 = new com/google/android/gms/b/eu$1;
          ((eu.1)localObject4).<init>((eu)localObject2);
          localObject3 = ((ExecutorService)localObject3).submit((Runnable)localObject4);
          s = ((Future)localObject3);
        }
        localObject3 = c;
        localObject4 = new com/google/android/gms/b/eu$3;
        ((eu.3)localObject4).<init>((eu)localObject2);
        ((ExecutorService)localObject3).execute((Runnable)localObject4);
      }
      catch (ea localea)
      {
        Object localObject4;
        label177:
        Object localObject5;
        i1 = 0;
        localObject6 = null;
        return (eu)localObject6;
      }
      try
      {
        localObject3 = m.b();
        u = (m)localObject3;
        localObject3 = u;
        localObject4 = a;
        i2 = ((m)localObject3).b((Context)localObject4);
        if (i2 <= 0) {
          break label434;
        }
        i2 = i1;
        l = i2;
        localObject3 = u;
        localObject4 = a;
        i2 = ((m)localObject3).a((Context)localObject4);
        if (i2 != 0) {
          break label443;
        }
        n = i1;
        localObject5 = a;
        localObject5 = ((Context)localObject5).getApplicationContext();
        if (localObject5 != null)
        {
          localObject5 = new com/google/android/gms/common/api/c$a;
          localObject1 = a;
          ((c.a)localObject5).<init>((Context)localObject1);
          localObject1 = vz.c;
          localObject3 = "Api must not be null";
          com.google.android.gms.common.internal.c.a(localObject1, localObject3);
          localObject3 = d;
          localObject4 = null;
          ((Map)localObject3).put(localObject1, null);
          localObject1 = Collections.emptyList();
          localObject3 = c;
          ((Set)localObject3).addAll((Collection)localObject1);
          localObject3 = b;
          ((Set)localObject3).addAll((Collection)localObject1);
          localObject5 = ((c.a)localObject5).b();
          k = ((com.google.android.gms.common.api.c)localObject5);
        }
      }
      finally {}
    }
    localObject5 = ke.bP;
    localObject1 = w.q();
    localObject5 = ((kd)localObject1).a((jz)localObject5);
    localObject5 = (Boolean)localObject5;
    i1 = ((Boolean)localObject5).booleanValue();
    if (i1 != 0) {
      ((eu)localObject2).f();
    }
    i1 = ew.b();
    if (i1 != 0)
    {
      localObject5 = ke.bN;
      localObject1 = w.q();
      localObject5 = ((kd)localObject1).a((jz)localObject5);
      localObject5 = (Boolean)localObject5;
      i1 = ((Boolean)localObject5).booleanValue();
      if (i1 != 0)
      {
        localObject5 = new java/lang/IllegalStateException;
        localObject2 = "Task Context initialization must not be called from the UI thread.";
        ((IllegalStateException)localObject5).<init>((String)localObject2);
        throw ((Throwable)localObject5);
      }
    }
    for (;;)
    {
      label434:
      i2 = 0;
      localObject3 = null;
      break;
      label443:
      i1 = 0;
      Object localObject6 = null;
      break label177;
      localObject6 = new com/google/android/gms/b/dy;
      ((dy)localObject6).<init>();
      e = ((dy)localObject6);
      try
      {
        localObject6 = dy.a(paramString1);
        f = ((byte[])localObject6);
        ((eu)localObject2).a(paramString2);
        localObject6 = new com/google/android/gms/b/bl;
        ((bl)localObject6).<init>((eu)localObject2);
        j = ((bl)localObject6);
        localObject6 = localObject2;
      }
      catch (dy.a locala)
      {
        localObject2 = new com/google/android/gms/b/ea;
        ((ea)localObject2).<init>(locala);
        throw ((Throwable)localObject2);
      }
    }
  }
  
  private static void a(File paramFile)
  {
    boolean bool = paramFile.exists();
    if (!bool)
    {
      String str1 = p;
      int i1 = 1;
      Object[] arrayOfObject = new Object[i1];
      String str2 = paramFile.getAbsolutePath();
      arrayOfObject[0] = str2;
      String str3 = String.format("File %s not found. No need for deletion", arrayOfObject);
      Log.d(str1, str3);
    }
    for (;;)
    {
      return;
      paramFile.delete();
    }
  }
  
  /* Error */
  private void a(File paramFile, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: iconst_2
    //   3: istore 4
    //   5: iconst_1
    //   6: istore 5
    //   8: iconst_0
    //   9: istore 6
    //   11: aconst_null
    //   12: astore 7
    //   14: new 253	java/io/File
    //   17: astore 8
    //   19: iload 4
    //   21: anewarray 4	java/lang/Object
    //   24: astore 9
    //   26: aload 9
    //   28: iconst_0
    //   29: aload_1
    //   30: aastore
    //   31: aload 9
    //   33: iload 5
    //   35: aload_2
    //   36: aastore
    //   37: ldc_w 278
    //   40: aload 9
    //   42: invokestatic 267	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   45: astore 10
    //   47: aload 8
    //   49: aload 10
    //   51: invokespecial 279	java/io/File:<init>	(Ljava/lang/String;)V
    //   54: aload 8
    //   56: invokevirtual 256	java/io/File:exists	()Z
    //   59: istore 11
    //   61: iload 11
    //   63: ifeq +4 -> 67
    //   66: return
    //   67: new 253	java/io/File
    //   70: astore 12
    //   72: iload 4
    //   74: anewarray 4	java/lang/Object
    //   77: astore 9
    //   79: aload 9
    //   81: iconst_0
    //   82: aload_1
    //   83: aastore
    //   84: aload 9
    //   86: iload 5
    //   88: aload_2
    //   89: aastore
    //   90: ldc_w 281
    //   93: aload 9
    //   95: invokestatic 267	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   98: astore 10
    //   100: aload 12
    //   102: aload 10
    //   104: invokespecial 279	java/io/File:<init>	(Ljava/lang/String;)V
    //   107: aload 12
    //   109: invokevirtual 256	java/io/File:exists	()Z
    //   112: istore 11
    //   114: iload 11
    //   116: ifeq -50 -> 66
    //   119: aload 12
    //   121: invokevirtual 285	java/io/File:length	()J
    //   124: lstore 13
    //   126: lconst_0
    //   127: lstore 15
    //   129: lload 13
    //   131: lload 15
    //   133: lcmp
    //   134: istore 11
    //   136: iload 11
    //   138: ifle -72 -> 66
    //   141: lload 13
    //   143: l2i
    //   144: istore 11
    //   146: iload 11
    //   148: newarray <illegal type>
    //   150: astore 10
    //   152: new 287	java/io/FileInputStream
    //   155: astore 9
    //   157: aload 9
    //   159: aload 12
    //   161: invokespecial 290	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   164: aload 9
    //   166: aload 10
    //   168: invokevirtual 294	java/io/FileInputStream:read	([B)I
    //   171: istore 6
    //   173: iload 6
    //   175: ifgt +16 -> 191
    //   178: aload 9
    //   180: invokevirtual 297	java/io/FileInputStream:close	()V
    //   183: aload 12
    //   185: invokestatic 299	com/google/android/gms/b/eu:a	(Ljava/io/File;)V
    //   188: goto -122 -> 66
    //   191: new 301	com/google/android/gms/b/bf$d
    //   194: astore 7
    //   196: aload 7
    //   198: invokespecial 302	com/google/android/gms/b/bf$d:<init>	()V
    //   201: getstatic 307	android/os/Build$VERSION:SDK	Ljava/lang/String;
    //   204: astore 17
    //   206: aload 17
    //   208: invokevirtual 311	java/lang/String:getBytes	()[B
    //   211: astore 17
    //   213: aload 7
    //   215: aload 17
    //   217: putfield 313	com/google/android/gms/b/bf$d:d	[B
    //   220: aload_2
    //   221: invokevirtual 311	java/lang/String:getBytes	()[B
    //   224: astore 17
    //   226: aload 7
    //   228: aload 17
    //   230: putfield 315	com/google/android/gms/b/bf$d:c	[B
    //   233: aload_0
    //   234: getfield 219	com/google/android/gms/b/eu:e	Lcom/google/android/gms/b/dy;
    //   237: astore 17
    //   239: aload_0
    //   240: getfield 224	com/google/android/gms/b/eu:f	[B
    //   243: astore 18
    //   245: aload 17
    //   247: aload 18
    //   249: aload 10
    //   251: invokevirtual 318	com/google/android/gms/b/dy:a	([B[B)Ljava/lang/String;
    //   254: astore 10
    //   256: aload 10
    //   258: invokevirtual 311	java/lang/String:getBytes	()[B
    //   261: astore 10
    //   263: aload 7
    //   265: aload 10
    //   267: putfield 320	com/google/android/gms/b/bf$d:a	[B
    //   270: aload 10
    //   272: invokestatic 325	com/google/android/gms/b/bj:a	([B)[B
    //   275: astore 10
    //   277: aload 7
    //   279: aload 10
    //   281: putfield 327	com/google/android/gms/b/bf$d:b	[B
    //   284: aload 8
    //   286: invokevirtual 330	java/io/File:createNewFile	()Z
    //   289: pop
    //   290: new 332	java/io/FileOutputStream
    //   293: astore 10
    //   295: aload 10
    //   297: aload 8
    //   299: invokespecial 333	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   302: aload 7
    //   304: invokestatic 338	com/google/android/gms/b/gb:a	(Lcom/google/android/gms/b/gb;)[B
    //   307: astore_3
    //   308: aconst_null
    //   309: astore 8
    //   311: aload_3
    //   312: arraylength
    //   313: istore 6
    //   315: aload 10
    //   317: aload_3
    //   318: iconst_0
    //   319: iload 6
    //   321: invokevirtual 342	java/io/FileOutputStream:write	([BII)V
    //   324: aload 10
    //   326: invokevirtual 343	java/io/FileOutputStream:close	()V
    //   329: aload 9
    //   331: invokevirtual 297	java/io/FileInputStream:close	()V
    //   334: aload 10
    //   336: invokevirtual 343	java/io/FileOutputStream:close	()V
    //   339: aload 12
    //   341: invokestatic 299	com/google/android/gms/b/eu:a	(Ljava/io/File;)V
    //   344: goto -278 -> 66
    //   347: astore 10
    //   349: iconst_0
    //   350: istore 11
    //   352: aconst_null
    //   353: astore 10
    //   355: aload_3
    //   356: ifnull +7 -> 363
    //   359: aload_3
    //   360: invokevirtual 297	java/io/FileInputStream:close	()V
    //   363: aload 10
    //   365: ifnull +8 -> 373
    //   368: aload 10
    //   370: invokevirtual 343	java/io/FileOutputStream:close	()V
    //   373: aload 12
    //   375: invokestatic 299	com/google/android/gms/b/eu:a	(Ljava/io/File;)V
    //   378: goto -312 -> 66
    //   381: astore 10
    //   383: aconst_null
    //   384: astore 9
    //   386: aload 9
    //   388: ifnull +8 -> 396
    //   391: aload 9
    //   393: invokevirtual 297	java/io/FileInputStream:close	()V
    //   396: aload_3
    //   397: ifnull +7 -> 404
    //   400: aload_3
    //   401: invokevirtual 343	java/io/FileOutputStream:close	()V
    //   404: aload 12
    //   406: invokestatic 299	com/google/android/gms/b/eu:a	(Ljava/io/File;)V
    //   409: aload 10
    //   411: athrow
    //   412: astore 10
    //   414: goto -231 -> 183
    //   417: astore_3
    //   418: goto -84 -> 334
    //   421: astore 10
    //   423: goto -84 -> 339
    //   426: astore_3
    //   427: goto -64 -> 363
    //   430: astore 10
    //   432: goto -59 -> 373
    //   435: astore 9
    //   437: goto -41 -> 396
    //   440: astore_3
    //   441: goto -37 -> 404
    //   444: astore 10
    //   446: goto -60 -> 386
    //   449: astore 19
    //   451: aload 10
    //   453: astore_3
    //   454: aload 19
    //   456: astore 10
    //   458: goto -72 -> 386
    //   461: astore 10
    //   463: iconst_0
    //   464: istore 11
    //   466: aconst_null
    //   467: astore 10
    //   469: aload 9
    //   471: astore_3
    //   472: goto -117 -> 355
    //   475: astore_3
    //   476: aload 9
    //   478: astore_3
    //   479: goto -124 -> 355
    //   482: astore 10
    //   484: iconst_0
    //   485: istore 11
    //   487: aconst_null
    //   488: astore 10
    //   490: goto -135 -> 355
    //   493: astore 10
    //   495: iconst_0
    //   496: istore 11
    //   498: aconst_null
    //   499: astore 10
    //   501: aload 9
    //   503: astore_3
    //   504: goto -149 -> 355
    //   507: astore_3
    //   508: aload 9
    //   510: astore_3
    //   511: goto -156 -> 355
    //   514: astore 10
    //   516: iconst_0
    //   517: istore 11
    //   519: aconst_null
    //   520: astore 10
    //   522: goto -167 -> 355
    //   525: astore 10
    //   527: iconst_0
    //   528: istore 11
    //   530: aconst_null
    //   531: astore 10
    //   533: aload 9
    //   535: astore_3
    //   536: goto -181 -> 355
    //   539: astore_3
    //   540: aload 9
    //   542: astore_3
    //   543: goto -188 -> 355
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	546	0	this	eu
    //   0	546	1	paramFile	File
    //   0	546	2	paramString	String
    //   1	400	3	arrayOfByte1	byte[]
    //   417	1	3	localIOException1	java.io.IOException
    //   426	1	3	localIOException2	java.io.IOException
    //   440	1	3	localIOException3	java.io.IOException
    //   453	19	3	localObject1	Object
    //   475	1	3	localNoSuchAlgorithmException1	java.security.NoSuchAlgorithmException
    //   478	26	3	localObject2	Object
    //   507	1	3	locala1	dy.a
    //   510	26	3	localObject3	Object
    //   539	1	3	localIOException4	java.io.IOException
    //   542	1	3	localObject4	Object
    //   3	70	4	i1	int
    //   6	81	5	i2	int
    //   9	311	6	i3	int
    //   12	291	7	locald	bf.d
    //   17	293	8	localFile1	File
    //   24	368	9	localObject5	Object
    //   435	106	9	localIOException5	java.io.IOException
    //   45	290	10	localObject6	Object
    //   347	1	10	localNoSuchAlgorithmException2	java.security.NoSuchAlgorithmException
    //   353	16	10	localObject7	Object
    //   381	29	10	localObject8	Object
    //   412	1	10	localIOException6	java.io.IOException
    //   421	1	10	localIOException7	java.io.IOException
    //   430	1	10	localIOException8	java.io.IOException
    //   444	8	10	localObject9	Object
    //   456	1	10	localObject10	Object
    //   461	1	10	localNoSuchAlgorithmException3	java.security.NoSuchAlgorithmException
    //   467	1	10	localObject11	Object
    //   482	1	10	locala2	dy.a
    //   488	1	10	localObject12	Object
    //   493	1	10	locala3	dy.a
    //   499	1	10	localObject13	Object
    //   514	1	10	localIOException9	java.io.IOException
    //   520	1	10	localObject14	Object
    //   525	1	10	localIOException10	java.io.IOException
    //   531	1	10	localObject15	Object
    //   59	78	11	bool	boolean
    //   144	385	11	i4	int
    //   70	335	12	localFile2	File
    //   124	18	13	l1	long
    //   127	5	15	l2	long
    //   204	42	17	localObject16	Object
    //   243	5	18	arrayOfByte2	byte[]
    //   449	6	19	localObject17	Object
    // Exception table:
    //   from	to	target	type
    //   152	155	347	java/security/NoSuchAlgorithmException
    //   159	164	347	java/security/NoSuchAlgorithmException
    //   152	155	381	finally
    //   159	164	381	finally
    //   178	183	412	java/io/IOException
    //   329	334	417	java/io/IOException
    //   334	339	421	java/io/IOException
    //   359	363	426	java/io/IOException
    //   368	373	430	java/io/IOException
    //   391	396	435	java/io/IOException
    //   400	404	440	java/io/IOException
    //   166	171	444	finally
    //   191	194	444	finally
    //   196	201	444	finally
    //   201	204	444	finally
    //   206	211	444	finally
    //   215	220	444	finally
    //   220	224	444	finally
    //   228	233	444	finally
    //   233	237	444	finally
    //   239	243	444	finally
    //   249	254	444	finally
    //   256	261	444	finally
    //   265	270	444	finally
    //   270	275	444	finally
    //   279	284	444	finally
    //   284	290	444	finally
    //   290	293	444	finally
    //   297	302	444	finally
    //   302	307	449	finally
    //   311	313	449	finally
    //   319	324	449	finally
    //   324	329	449	finally
    //   166	171	461	java/security/NoSuchAlgorithmException
    //   191	194	461	java/security/NoSuchAlgorithmException
    //   196	201	461	java/security/NoSuchAlgorithmException
    //   201	204	461	java/security/NoSuchAlgorithmException
    //   206	211	461	java/security/NoSuchAlgorithmException
    //   215	220	461	java/security/NoSuchAlgorithmException
    //   220	224	461	java/security/NoSuchAlgorithmException
    //   228	233	461	java/security/NoSuchAlgorithmException
    //   233	237	461	java/security/NoSuchAlgorithmException
    //   239	243	461	java/security/NoSuchAlgorithmException
    //   249	254	461	java/security/NoSuchAlgorithmException
    //   256	261	461	java/security/NoSuchAlgorithmException
    //   265	270	461	java/security/NoSuchAlgorithmException
    //   270	275	461	java/security/NoSuchAlgorithmException
    //   279	284	461	java/security/NoSuchAlgorithmException
    //   284	290	461	java/security/NoSuchAlgorithmException
    //   290	293	461	java/security/NoSuchAlgorithmException
    //   297	302	461	java/security/NoSuchAlgorithmException
    //   302	307	475	java/security/NoSuchAlgorithmException
    //   311	313	475	java/security/NoSuchAlgorithmException
    //   319	324	475	java/security/NoSuchAlgorithmException
    //   324	329	475	java/security/NoSuchAlgorithmException
    //   152	155	482	com/google/android/gms/b/dy$a
    //   159	164	482	com/google/android/gms/b/dy$a
    //   166	171	493	com/google/android/gms/b/dy$a
    //   191	194	493	com/google/android/gms/b/dy$a
    //   196	201	493	com/google/android/gms/b/dy$a
    //   201	204	493	com/google/android/gms/b/dy$a
    //   206	211	493	com/google/android/gms/b/dy$a
    //   215	220	493	com/google/android/gms/b/dy$a
    //   220	224	493	com/google/android/gms/b/dy$a
    //   228	233	493	com/google/android/gms/b/dy$a
    //   233	237	493	com/google/android/gms/b/dy$a
    //   239	243	493	com/google/android/gms/b/dy$a
    //   249	254	493	com/google/android/gms/b/dy$a
    //   256	261	493	com/google/android/gms/b/dy$a
    //   265	270	493	com/google/android/gms/b/dy$a
    //   270	275	493	com/google/android/gms/b/dy$a
    //   279	284	493	com/google/android/gms/b/dy$a
    //   284	290	493	com/google/android/gms/b/dy$a
    //   290	293	493	com/google/android/gms/b/dy$a
    //   297	302	493	com/google/android/gms/b/dy$a
    //   302	307	507	com/google/android/gms/b/dy$a
    //   311	313	507	com/google/android/gms/b/dy$a
    //   319	324	507	com/google/android/gms/b/dy$a
    //   324	329	507	com/google/android/gms/b/dy$a
    //   152	155	514	java/io/IOException
    //   159	164	514	java/io/IOException
    //   166	171	525	java/io/IOException
    //   191	194	525	java/io/IOException
    //   196	201	525	java/io/IOException
    //   201	204	525	java/io/IOException
    //   206	211	525	java/io/IOException
    //   215	220	525	java/io/IOException
    //   220	224	525	java/io/IOException
    //   228	233	525	java/io/IOException
    //   233	237	525	java/io/IOException
    //   239	243	525	java/io/IOException
    //   249	254	525	java/io/IOException
    //   256	261	525	java/io/IOException
    //   265	270	525	java/io/IOException
    //   270	275	525	java/io/IOException
    //   279	284	525	java/io/IOException
    //   284	290	525	java/io/IOException
    //   290	293	525	java/io/IOException
    //   297	302	525	java/io/IOException
    //   302	307	539	java/io/IOException
    //   311	313	539	java/io/IOException
    //   319	324	539	java/io/IOException
    //   324	329	539	java/io/IOException
  }
  
  /* Error */
  private boolean a(String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: getfield 81	com/google/android/gms/b/eu:a	Landroid/content/Context;
    //   6: astore_3
    //   7: aload_3
    //   8: invokevirtual 349	android/content/Context:getCacheDir	()Ljava/io/File;
    //   11: astore_3
    //   12: aload_3
    //   13: ifnonnull +53 -> 66
    //   16: aload_0
    //   17: getfield 81	com/google/android/gms/b/eu:a	Landroid/content/Context;
    //   20: astore_3
    //   21: ldc_w 351
    //   24: astore 4
    //   26: aconst_null
    //   27: astore 5
    //   29: aload_3
    //   30: aload 4
    //   32: iconst_0
    //   33: invokevirtual 355	android/content/Context:getDir	(Ljava/lang/String;I)Ljava/io/File;
    //   36: astore_3
    //   37: aload_3
    //   38: ifnonnull +28 -> 66
    //   41: new 234	com/google/android/gms/b/ea
    //   44: astore_3
    //   45: aload_3
    //   46: invokespecial 356	com/google/android/gms/b/ea:<init>	()V
    //   49: aload_3
    //   50: athrow
    //   51: astore_3
    //   52: new 234	com/google/android/gms/b/ea
    //   55: astore 4
    //   57: aload 4
    //   59: aload_3
    //   60: invokespecial 237	com/google/android/gms/b/ea:<init>	(Ljava/lang/Throwable;)V
    //   63: aload 4
    //   65: athrow
    //   66: aload_3
    //   67: astore 4
    //   69: ldc_w 358
    //   72: astore 5
    //   74: new 253	java/io/File
    //   77: astore 6
    //   79: ldc_w 360
    //   82: astore_3
    //   83: iconst_2
    //   84: istore 7
    //   86: iload 7
    //   88: anewarray 4	java/lang/Object
    //   91: astore 8
    //   93: iconst_0
    //   94: istore 9
    //   96: aconst_null
    //   97: astore 10
    //   99: aload 8
    //   101: iconst_0
    //   102: aload 4
    //   104: aastore
    //   105: iconst_1
    //   106: istore 9
    //   108: aload 8
    //   110: iload 9
    //   112: aload 5
    //   114: aastore
    //   115: aload_3
    //   116: aload 8
    //   118: invokestatic 267	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   121: astore_3
    //   122: aload 6
    //   124: aload_3
    //   125: invokespecial 279	java/io/File:<init>	(Ljava/lang/String;)V
    //   128: aload 6
    //   130: invokevirtual 256	java/io/File:exists	()Z
    //   133: istore 11
    //   135: iload 11
    //   137: ifne +56 -> 193
    //   140: aload_0
    //   141: getfield 224	com/google/android/gms/b/eu:f	[B
    //   144: astore_3
    //   145: aload_3
    //   146: aload_1
    //   147: invokestatic 363	com/google/android/gms/b/dy:a	([BLjava/lang/String;)[B
    //   150: astore_3
    //   151: aload 6
    //   153: invokevirtual 330	java/io/File:createNewFile	()Z
    //   156: pop
    //   157: new 332	java/io/FileOutputStream
    //   160: astore 8
    //   162: aload 8
    //   164: aload 6
    //   166: invokespecial 333	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   169: iconst_0
    //   170: istore 9
    //   172: aconst_null
    //   173: astore 10
    //   175: aload_3
    //   176: arraylength
    //   177: istore 12
    //   179: aload 8
    //   181: aload_3
    //   182: iconst_0
    //   183: iload 12
    //   185: invokevirtual 342	java/io/FileOutputStream:write	([BII)V
    //   188: aload 8
    //   190: invokevirtual 343	java/io/FileOutputStream:close	()V
    //   193: aload_0
    //   194: aload 4
    //   196: aload 5
    //   198: invokespecial 366	com/google/android/gms/b/eu:b	(Ljava/io/File;Ljava/lang/String;)Z
    //   201: pop
    //   202: new 368	dalvik/system/DexClassLoader
    //   205: astore_3
    //   206: aload 6
    //   208: invokevirtual 261	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   211: astore 8
    //   213: aload 4
    //   215: invokevirtual 261	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   218: astore 10
    //   220: iconst_0
    //   221: istore 12
    //   223: aload_0
    //   224: getfield 81	com/google/android/gms/b/eu:a	Landroid/content/Context;
    //   227: astore 13
    //   229: aload 13
    //   231: invokevirtual 372	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   234: astore 13
    //   236: aload_3
    //   237: aload 8
    //   239: aload 10
    //   241: aconst_null
    //   242: aload 13
    //   244: invokespecial 375	dalvik/system/DexClassLoader:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   247: aload_0
    //   248: aload_3
    //   249: putfield 377	com/google/android/gms/b/eu:d	Ldalvik/system/DexClassLoader;
    //   252: aload 6
    //   254: invokestatic 299	com/google/android/gms/b/eu:a	(Ljava/io/File;)V
    //   257: aload_0
    //   258: aload 4
    //   260: aload 5
    //   262: invokespecial 380	com/google/android/gms/b/eu:a	(Ljava/io/File;Ljava/lang/String;)V
    //   265: ldc_w 281
    //   268: astore_3
    //   269: iconst_2
    //   270: istore 14
    //   272: iload 14
    //   274: anewarray 4	java/lang/Object
    //   277: astore 6
    //   279: iconst_0
    //   280: istore 7
    //   282: aconst_null
    //   283: astore 8
    //   285: aload 6
    //   287: iconst_0
    //   288: aload 4
    //   290: aastore
    //   291: iconst_1
    //   292: istore 15
    //   294: aload 6
    //   296: iload 15
    //   298: aload 5
    //   300: aastore
    //   301: aload_3
    //   302: aload 6
    //   304: invokestatic 267	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   307: astore_3
    //   308: aload_3
    //   309: invokestatic 382	com/google/android/gms/b/eu:b	(Ljava/lang/String;)V
    //   312: iload_2
    //   313: ireturn
    //   314: astore_3
    //   315: aload 6
    //   317: invokestatic 299	com/google/android/gms/b/eu:a	(Ljava/io/File;)V
    //   320: aload_0
    //   321: aload 4
    //   323: aload 5
    //   325: invokespecial 380	com/google/android/gms/b/eu:a	(Ljava/io/File;Ljava/lang/String;)V
    //   328: ldc_w 281
    //   331: astore 6
    //   333: iconst_2
    //   334: istore 7
    //   336: iload 7
    //   338: anewarray 4	java/lang/Object
    //   341: astore 8
    //   343: iconst_0
    //   344: istore 9
    //   346: aconst_null
    //   347: astore 10
    //   349: aload 8
    //   351: iconst_0
    //   352: aload 4
    //   354: aastore
    //   355: iconst_1
    //   356: istore 15
    //   358: aload 8
    //   360: iload 15
    //   362: aload 5
    //   364: aastore
    //   365: aload 6
    //   367: aload 8
    //   369: invokestatic 267	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   372: astore 4
    //   374: aload 4
    //   376: invokestatic 382	com/google/android/gms/b/eu:b	(Ljava/lang/String;)V
    //   379: aload_3
    //   380: athrow
    //   381: astore_3
    //   382: new 234	com/google/android/gms/b/ea
    //   385: astore 4
    //   387: aload 4
    //   389: aload_3
    //   390: invokespecial 237	com/google/android/gms/b/ea:<init>	(Ljava/lang/Throwable;)V
    //   393: aload 4
    //   395: athrow
    //   396: astore_3
    //   397: new 234	com/google/android/gms/b/ea
    //   400: astore 4
    //   402: aload 4
    //   404: aload_3
    //   405: invokespecial 237	com/google/android/gms/b/ea:<init>	(Ljava/lang/Throwable;)V
    //   408: aload 4
    //   410: athrow
    //   411: astore_3
    //   412: new 234	com/google/android/gms/b/ea
    //   415: astore 4
    //   417: aload 4
    //   419: aload_3
    //   420: invokespecial 237	com/google/android/gms/b/ea:<init>	(Ljava/lang/Throwable;)V
    //   423: aload 4
    //   425: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	426	0	this	eu
    //   0	426	1	paramString	String
    //   1	312	2	bool1	boolean
    //   6	44	3	localObject1	Object
    //   51	16	3	localFileNotFoundException	java.io.FileNotFoundException
    //   82	227	3	localObject2	Object
    //   314	66	3	localObject3	Object
    //   381	9	3	localIOException	java.io.IOException
    //   396	9	3	locala	dy.a
    //   411	9	3	localNullPointerException	NullPointerException
    //   24	400	4	localObject4	Object
    //   27	336	5	str1	String
    //   77	289	6	localObject5	Object
    //   84	253	7	i1	int
    //   91	277	8	localObject6	Object
    //   94	251	9	i2	int
    //   97	251	10	str2	String
    //   133	3	11	bool2	boolean
    //   177	45	12	i3	int
    //   227	16	13	localObject7	Object
    //   270	3	14	i4	int
    //   292	69	15	i5	int
    // Exception table:
    //   from	to	target	type
    //   2	6	51	java/io/FileNotFoundException
    //   7	11	51	java/io/FileNotFoundException
    //   16	20	51	java/io/FileNotFoundException
    //   32	36	51	java/io/FileNotFoundException
    //   41	44	51	java/io/FileNotFoundException
    //   45	49	51	java/io/FileNotFoundException
    //   49	51	51	java/io/FileNotFoundException
    //   74	77	51	java/io/FileNotFoundException
    //   86	91	51	java/io/FileNotFoundException
    //   102	105	51	java/io/FileNotFoundException
    //   112	115	51	java/io/FileNotFoundException
    //   116	121	51	java/io/FileNotFoundException
    //   124	128	51	java/io/FileNotFoundException
    //   128	133	51	java/io/FileNotFoundException
    //   140	144	51	java/io/FileNotFoundException
    //   146	150	51	java/io/FileNotFoundException
    //   151	157	51	java/io/FileNotFoundException
    //   157	160	51	java/io/FileNotFoundException
    //   164	169	51	java/io/FileNotFoundException
    //   175	177	51	java/io/FileNotFoundException
    //   183	188	51	java/io/FileNotFoundException
    //   188	193	51	java/io/FileNotFoundException
    //   196	202	51	java/io/FileNotFoundException
    //   252	257	51	java/io/FileNotFoundException
    //   260	265	51	java/io/FileNotFoundException
    //   272	277	51	java/io/FileNotFoundException
    //   288	291	51	java/io/FileNotFoundException
    //   298	301	51	java/io/FileNotFoundException
    //   302	307	51	java/io/FileNotFoundException
    //   308	312	51	java/io/FileNotFoundException
    //   315	320	51	java/io/FileNotFoundException
    //   323	328	51	java/io/FileNotFoundException
    //   336	341	51	java/io/FileNotFoundException
    //   352	355	51	java/io/FileNotFoundException
    //   362	365	51	java/io/FileNotFoundException
    //   367	372	51	java/io/FileNotFoundException
    //   374	379	51	java/io/FileNotFoundException
    //   379	381	51	java/io/FileNotFoundException
    //   202	205	314	finally
    //   206	211	314	finally
    //   213	218	314	finally
    //   223	227	314	finally
    //   229	234	314	finally
    //   242	247	314	finally
    //   248	252	314	finally
    //   2	6	381	java/io/IOException
    //   7	11	381	java/io/IOException
    //   16	20	381	java/io/IOException
    //   32	36	381	java/io/IOException
    //   41	44	381	java/io/IOException
    //   45	49	381	java/io/IOException
    //   49	51	381	java/io/IOException
    //   74	77	381	java/io/IOException
    //   86	91	381	java/io/IOException
    //   102	105	381	java/io/IOException
    //   112	115	381	java/io/IOException
    //   116	121	381	java/io/IOException
    //   124	128	381	java/io/IOException
    //   128	133	381	java/io/IOException
    //   140	144	381	java/io/IOException
    //   146	150	381	java/io/IOException
    //   151	157	381	java/io/IOException
    //   157	160	381	java/io/IOException
    //   164	169	381	java/io/IOException
    //   175	177	381	java/io/IOException
    //   183	188	381	java/io/IOException
    //   188	193	381	java/io/IOException
    //   196	202	381	java/io/IOException
    //   252	257	381	java/io/IOException
    //   260	265	381	java/io/IOException
    //   272	277	381	java/io/IOException
    //   288	291	381	java/io/IOException
    //   298	301	381	java/io/IOException
    //   302	307	381	java/io/IOException
    //   308	312	381	java/io/IOException
    //   315	320	381	java/io/IOException
    //   323	328	381	java/io/IOException
    //   336	341	381	java/io/IOException
    //   352	355	381	java/io/IOException
    //   362	365	381	java/io/IOException
    //   367	372	381	java/io/IOException
    //   374	379	381	java/io/IOException
    //   379	381	381	java/io/IOException
    //   2	6	396	com/google/android/gms/b/dy$a
    //   7	11	396	com/google/android/gms/b/dy$a
    //   16	20	396	com/google/android/gms/b/dy$a
    //   32	36	396	com/google/android/gms/b/dy$a
    //   41	44	396	com/google/android/gms/b/dy$a
    //   45	49	396	com/google/android/gms/b/dy$a
    //   49	51	396	com/google/android/gms/b/dy$a
    //   74	77	396	com/google/android/gms/b/dy$a
    //   86	91	396	com/google/android/gms/b/dy$a
    //   102	105	396	com/google/android/gms/b/dy$a
    //   112	115	396	com/google/android/gms/b/dy$a
    //   116	121	396	com/google/android/gms/b/dy$a
    //   124	128	396	com/google/android/gms/b/dy$a
    //   128	133	396	com/google/android/gms/b/dy$a
    //   140	144	396	com/google/android/gms/b/dy$a
    //   146	150	396	com/google/android/gms/b/dy$a
    //   151	157	396	com/google/android/gms/b/dy$a
    //   157	160	396	com/google/android/gms/b/dy$a
    //   164	169	396	com/google/android/gms/b/dy$a
    //   175	177	396	com/google/android/gms/b/dy$a
    //   183	188	396	com/google/android/gms/b/dy$a
    //   188	193	396	com/google/android/gms/b/dy$a
    //   196	202	396	com/google/android/gms/b/dy$a
    //   252	257	396	com/google/android/gms/b/dy$a
    //   260	265	396	com/google/android/gms/b/dy$a
    //   272	277	396	com/google/android/gms/b/dy$a
    //   288	291	396	com/google/android/gms/b/dy$a
    //   298	301	396	com/google/android/gms/b/dy$a
    //   302	307	396	com/google/android/gms/b/dy$a
    //   308	312	396	com/google/android/gms/b/dy$a
    //   315	320	396	com/google/android/gms/b/dy$a
    //   323	328	396	com/google/android/gms/b/dy$a
    //   336	341	396	com/google/android/gms/b/dy$a
    //   352	355	396	com/google/android/gms/b/dy$a
    //   362	365	396	com/google/android/gms/b/dy$a
    //   367	372	396	com/google/android/gms/b/dy$a
    //   374	379	396	com/google/android/gms/b/dy$a
    //   379	381	396	com/google/android/gms/b/dy$a
    //   2	6	411	java/lang/NullPointerException
    //   7	11	411	java/lang/NullPointerException
    //   16	20	411	java/lang/NullPointerException
    //   32	36	411	java/lang/NullPointerException
    //   41	44	411	java/lang/NullPointerException
    //   45	49	411	java/lang/NullPointerException
    //   49	51	411	java/lang/NullPointerException
    //   74	77	411	java/lang/NullPointerException
    //   86	91	411	java/lang/NullPointerException
    //   102	105	411	java/lang/NullPointerException
    //   112	115	411	java/lang/NullPointerException
    //   116	121	411	java/lang/NullPointerException
    //   124	128	411	java/lang/NullPointerException
    //   128	133	411	java/lang/NullPointerException
    //   140	144	411	java/lang/NullPointerException
    //   146	150	411	java/lang/NullPointerException
    //   151	157	411	java/lang/NullPointerException
    //   157	160	411	java/lang/NullPointerException
    //   164	169	411	java/lang/NullPointerException
    //   175	177	411	java/lang/NullPointerException
    //   183	188	411	java/lang/NullPointerException
    //   188	193	411	java/lang/NullPointerException
    //   196	202	411	java/lang/NullPointerException
    //   252	257	411	java/lang/NullPointerException
    //   260	265	411	java/lang/NullPointerException
    //   272	277	411	java/lang/NullPointerException
    //   288	291	411	java/lang/NullPointerException
    //   298	301	411	java/lang/NullPointerException
    //   302	307	411	java/lang/NullPointerException
    //   308	312	411	java/lang/NullPointerException
    //   315	320	411	java/lang/NullPointerException
    //   323	328	411	java/lang/NullPointerException
    //   336	341	411	java/lang/NullPointerException
    //   352	355	411	java/lang/NullPointerException
    //   362	365	411	java/lang/NullPointerException
    //   367	372	411	java/lang/NullPointerException
    //   374	379	411	java/lang/NullPointerException
    //   379	381	411	java/lang/NullPointerException
  }
  
  private static void b(String paramString)
  {
    File localFile = new java/io/File;
    localFile.<init>(paramString);
    a(localFile);
  }
  
  /* Error */
  private boolean b(File paramFile, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: iconst_2
    //   3: istore 4
    //   5: iconst_1
    //   6: istore 5
    //   8: new 253	java/io/File
    //   11: astore 6
    //   13: iload 4
    //   15: anewarray 4	java/lang/Object
    //   18: astore 7
    //   20: aload 7
    //   22: iconst_0
    //   23: aload_1
    //   24: aastore
    //   25: aload 7
    //   27: iload 5
    //   29: aload_2
    //   30: aastore
    //   31: ldc_w 278
    //   34: aload 7
    //   36: invokestatic 267	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   39: astore 8
    //   41: aload 6
    //   43: aload 8
    //   45: invokespecial 279	java/io/File:<init>	(Ljava/lang/String;)V
    //   48: aload 6
    //   50: invokevirtual 256	java/io/File:exists	()Z
    //   53: istore 9
    //   55: iload 9
    //   57: ifne +12 -> 69
    //   60: iconst_0
    //   61: istore 9
    //   63: aconst_null
    //   64: astore 8
    //   66: iload 9
    //   68: ireturn
    //   69: new 253	java/io/File
    //   72: astore 10
    //   74: iload 4
    //   76: anewarray 4	java/lang/Object
    //   79: astore 7
    //   81: aload 7
    //   83: iconst_0
    //   84: aload_1
    //   85: aastore
    //   86: aload 7
    //   88: iload 5
    //   90: aload_2
    //   91: aastore
    //   92: ldc_w 281
    //   95: aload 7
    //   97: invokestatic 267	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   100: astore 8
    //   102: aload 10
    //   104: aload 8
    //   106: invokespecial 279	java/io/File:<init>	(Ljava/lang/String;)V
    //   109: aload 10
    //   111: invokevirtual 256	java/io/File:exists	()Z
    //   114: istore 9
    //   116: iload 9
    //   118: ifeq +12 -> 130
    //   121: iconst_0
    //   122: istore 9
    //   124: aconst_null
    //   125: astore 8
    //   127: goto -61 -> 66
    //   130: aload 6
    //   132: invokevirtual 285	java/io/File:length	()J
    //   135: lstore 11
    //   137: lconst_0
    //   138: lstore 13
    //   140: lload 11
    //   142: lload 13
    //   144: lcmp
    //   145: istore 9
    //   147: iload 9
    //   149: ifgt +17 -> 166
    //   152: aload 6
    //   154: invokestatic 299	com/google/android/gms/b/eu:a	(Ljava/io/File;)V
    //   157: iconst_0
    //   158: istore 9
    //   160: aconst_null
    //   161: astore 8
    //   163: goto -97 -> 66
    //   166: lload 11
    //   168: l2i
    //   169: istore 9
    //   171: iload 9
    //   173: newarray <illegal type>
    //   175: astore 8
    //   177: new 287	java/io/FileInputStream
    //   180: astore 7
    //   182: aload 7
    //   184: aload 6
    //   186: invokespecial 290	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   189: aload 7
    //   191: aload 8
    //   193: invokevirtual 294	java/io/FileInputStream:read	([B)I
    //   196: istore 4
    //   198: iload 4
    //   200: ifgt +40 -> 240
    //   203: getstatic 49	com/google/android/gms/b/eu:p	Ljava/lang/String;
    //   206: astore 8
    //   208: ldc_w 421
    //   211: astore 15
    //   213: aload 8
    //   215: aload 15
    //   217: invokestatic 272	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   220: pop
    //   221: aload 6
    //   223: invokestatic 299	com/google/android/gms/b/eu:a	(Ljava/io/File;)V
    //   226: aload 7
    //   228: invokevirtual 297	java/io/FileInputStream:close	()V
    //   231: iconst_0
    //   232: istore 9
    //   234: aconst_null
    //   235: astore 8
    //   237: goto -171 -> 66
    //   240: new 301	com/google/android/gms/b/bf$d
    //   243: astore 16
    //   245: aload 16
    //   247: invokespecial 302	com/google/android/gms/b/bf$d:<init>	()V
    //   250: aload 8
    //   252: arraylength
    //   253: istore 17
    //   255: aload 16
    //   257: aload 8
    //   259: iload 17
    //   261: invokestatic 424	com/google/android/gms/b/gb:a	(Lcom/google/android/gms/b/gb;[BI)Lcom/google/android/gms/b/gb;
    //   264: astore 8
    //   266: aload 8
    //   268: checkcast 301	com/google/android/gms/b/bf$d
    //   271: astore 8
    //   273: new 263	java/lang/String
    //   276: astore 16
    //   278: aload 8
    //   280: getfield 315	com/google/android/gms/b/bf$d:c	[B
    //   283: astore 18
    //   285: aload 16
    //   287: aload 18
    //   289: invokespecial 427	java/lang/String:<init>	([B)V
    //   292: aload_2
    //   293: aload 16
    //   295: invokevirtual 431	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   298: istore 4
    //   300: iload 4
    //   302: ifeq +71 -> 373
    //   305: aload 8
    //   307: getfield 327	com/google/android/gms/b/bf$d:b	[B
    //   310: astore 16
    //   312: aload 8
    //   314: getfield 320	com/google/android/gms/b/bf$d:a	[B
    //   317: astore 18
    //   319: aload 18
    //   321: invokestatic 325	com/google/android/gms/b/bj:a	([B)[B
    //   324: astore 18
    //   326: aload 16
    //   328: aload 18
    //   330: invokestatic 436	java/util/Arrays:equals	([B[B)Z
    //   333: istore 4
    //   335: iload 4
    //   337: ifeq +36 -> 373
    //   340: aload 8
    //   342: getfield 313	com/google/android/gms/b/bf$d:d	[B
    //   345: astore 16
    //   347: getstatic 307	android/os/Build$VERSION:SDK	Ljava/lang/String;
    //   350: astore 18
    //   352: aload 18
    //   354: invokevirtual 311	java/lang/String:getBytes	()[B
    //   357: astore 18
    //   359: aload 16
    //   361: aload 18
    //   363: invokestatic 436	java/util/Arrays:equals	([B[B)Z
    //   366: istore 4
    //   368: iload 4
    //   370: ifne +22 -> 392
    //   373: aload 6
    //   375: invokestatic 299	com/google/android/gms/b/eu:a	(Ljava/io/File;)V
    //   378: aload 7
    //   380: invokevirtual 297	java/io/FileInputStream:close	()V
    //   383: iconst_0
    //   384: istore 9
    //   386: aconst_null
    //   387: astore 8
    //   389: goto -323 -> 66
    //   392: aload_0
    //   393: getfield 224	com/google/android/gms/b/eu:f	[B
    //   396: astore 6
    //   398: new 263	java/lang/String
    //   401: astore 16
    //   403: aload 8
    //   405: getfield 320	com/google/android/gms/b/bf$d:a	[B
    //   408: astore 8
    //   410: aload 16
    //   412: aload 8
    //   414: invokespecial 427	java/lang/String:<init>	([B)V
    //   417: aload 6
    //   419: aload 16
    //   421: invokestatic 363	com/google/android/gms/b/dy:a	([BLjava/lang/String;)[B
    //   424: astore 6
    //   426: aload 10
    //   428: invokevirtual 330	java/io/File:createNewFile	()Z
    //   431: pop
    //   432: new 332	java/io/FileOutputStream
    //   435: astore 8
    //   437: aload 8
    //   439: aload 10
    //   441: invokespecial 333	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   444: aconst_null
    //   445: astore_3
    //   446: aload 6
    //   448: arraylength
    //   449: istore 19
    //   451: aload 8
    //   453: aload 6
    //   455: iconst_0
    //   456: iload 19
    //   458: invokevirtual 342	java/io/FileOutputStream:write	([BII)V
    //   461: aload 7
    //   463: invokevirtual 297	java/io/FileInputStream:close	()V
    //   466: aload 8
    //   468: invokevirtual 343	java/io/FileOutputStream:close	()V
    //   471: iload 5
    //   473: istore 9
    //   475: goto -409 -> 66
    //   478: astore 8
    //   480: iconst_0
    //   481: istore 9
    //   483: aconst_null
    //   484: astore 8
    //   486: iconst_0
    //   487: istore 5
    //   489: aconst_null
    //   490: astore 15
    //   492: aload 15
    //   494: ifnull +8 -> 502
    //   497: aload 15
    //   499: invokevirtual 297	java/io/FileInputStream:close	()V
    //   502: aload 8
    //   504: ifnull +8 -> 512
    //   507: aload 8
    //   509: invokevirtual 343	java/io/FileOutputStream:close	()V
    //   512: iconst_0
    //   513: istore 9
    //   515: aconst_null
    //   516: astore 8
    //   518: goto -452 -> 66
    //   521: astore 8
    //   523: aconst_null
    //   524: astore 7
    //   526: aload 7
    //   528: ifnull +8 -> 536
    //   531: aload 7
    //   533: invokevirtual 297	java/io/FileInputStream:close	()V
    //   536: aload_3
    //   537: ifnull +7 -> 544
    //   540: aload_3
    //   541: invokevirtual 343	java/io/FileOutputStream:close	()V
    //   544: aload 8
    //   546: athrow
    //   547: astore 8
    //   549: goto -318 -> 231
    //   552: astore 8
    //   554: goto -171 -> 383
    //   557: pop
    //   558: goto -92 -> 466
    //   561: astore 8
    //   563: goto -92 -> 471
    //   566: astore 15
    //   568: goto -66 -> 502
    //   571: astore 8
    //   573: goto -61 -> 512
    //   576: astore 15
    //   578: goto -42 -> 536
    //   581: astore 15
    //   583: goto -39 -> 544
    //   586: astore 8
    //   588: goto -62 -> 526
    //   591: astore 15
    //   593: aload 8
    //   595: astore_3
    //   596: aload 15
    //   598: astore 8
    //   600: goto -74 -> 526
    //   603: astore 8
    //   605: iconst_0
    //   606: istore 9
    //   608: aconst_null
    //   609: astore 8
    //   611: aload 7
    //   613: astore 15
    //   615: goto -123 -> 492
    //   618: astore 15
    //   620: aload 7
    //   622: astore 15
    //   624: goto -132 -> 492
    //   627: astore 8
    //   629: iconst_0
    //   630: istore 9
    //   632: aconst_null
    //   633: astore 8
    //   635: iconst_0
    //   636: istore 5
    //   638: aconst_null
    //   639: astore 15
    //   641: goto -149 -> 492
    //   644: astore 8
    //   646: iconst_0
    //   647: istore 9
    //   649: aconst_null
    //   650: astore 8
    //   652: aload 7
    //   654: astore 15
    //   656: goto -164 -> 492
    //   659: astore 15
    //   661: aload 7
    //   663: astore 15
    //   665: goto -173 -> 492
    //   668: astore 8
    //   670: iconst_0
    //   671: istore 9
    //   673: aconst_null
    //   674: astore 8
    //   676: iconst_0
    //   677: istore 5
    //   679: aconst_null
    //   680: astore 15
    //   682: goto -190 -> 492
    //   685: astore 8
    //   687: iconst_0
    //   688: istore 9
    //   690: aconst_null
    //   691: astore 8
    //   693: aload 7
    //   695: astore 15
    //   697: goto -205 -> 492
    //   700: astore 15
    //   702: aload 7
    //   704: astore 15
    //   706: goto -214 -> 492
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	709	0	this	eu
    //   0	709	1	paramFile	File
    //   0	709	2	paramString	String
    //   1	595	3	localObject1	Object
    //   3	196	4	i1	int
    //   298	71	4	bool1	boolean
    //   6	672	5	i2	int
    //   11	443	6	localObject2	Object
    //   18	685	7	localObject3	Object
    //   39	428	8	localObject4	Object
    //   478	1	8	localNoSuchAlgorithmException1	java.security.NoSuchAlgorithmException
    //   484	33	8	localObject5	Object
    //   521	24	8	localObject6	Object
    //   547	1	8	localIOException1	java.io.IOException
    //   552	1	8	localIOException2	java.io.IOException
    //   561	1	8	localIOException3	java.io.IOException
    //   571	1	8	localIOException4	java.io.IOException
    //   586	8	8	localObject7	Object
    //   598	1	8	localObject8	Object
    //   603	1	8	localNoSuchAlgorithmException2	java.security.NoSuchAlgorithmException
    //   609	1	8	localObject9	Object
    //   627	1	8	locala1	dy.a
    //   633	1	8	localObject10	Object
    //   644	1	8	locala2	dy.a
    //   650	1	8	localObject11	Object
    //   668	1	8	localIOException5	java.io.IOException
    //   674	1	8	localObject12	Object
    //   685	1	8	localIOException6	java.io.IOException
    //   691	1	8	localObject13	Object
    //   53	106	9	bool2	boolean
    //   169	520	9	i3	int
    //   72	368	10	localFile	File
    //   135	32	11	l1	long
    //   138	5	13	l2	long
    //   211	287	15	str	String
    //   566	1	15	localIOException7	java.io.IOException
    //   576	1	15	localIOException8	java.io.IOException
    //   581	1	15	localIOException9	java.io.IOException
    //   591	6	15	localObject14	Object
    //   613	1	15	localObject15	Object
    //   618	1	15	localNoSuchAlgorithmException3	java.security.NoSuchAlgorithmException
    //   622	33	15	localObject16	Object
    //   659	1	15	locala3	dy.a
    //   663	33	15	localObject17	Object
    //   700	1	15	localIOException10	java.io.IOException
    //   704	1	15	localObject18	Object
    //   243	177	16	localObject19	Object
    //   253	7	17	i4	int
    //   283	79	18	localObject20	Object
    //   449	8	19	i5	int
    //   557	1	50	localIOException11	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   130	135	478	java/security/NoSuchAlgorithmException
    //   152	157	478	java/security/NoSuchAlgorithmException
    //   171	175	478	java/security/NoSuchAlgorithmException
    //   177	180	478	java/security/NoSuchAlgorithmException
    //   184	189	478	java/security/NoSuchAlgorithmException
    //   130	135	521	finally
    //   152	157	521	finally
    //   171	175	521	finally
    //   177	180	521	finally
    //   184	189	521	finally
    //   226	231	547	java/io/IOException
    //   378	383	552	java/io/IOException
    //   461	466	557	java/io/IOException
    //   466	471	561	java/io/IOException
    //   497	502	566	java/io/IOException
    //   507	512	571	java/io/IOException
    //   531	536	576	java/io/IOException
    //   540	544	581	java/io/IOException
    //   191	196	586	finally
    //   203	206	586	finally
    //   215	221	586	finally
    //   221	226	586	finally
    //   240	243	586	finally
    //   245	250	586	finally
    //   250	253	586	finally
    //   259	264	586	finally
    //   266	271	586	finally
    //   273	276	586	finally
    //   278	283	586	finally
    //   287	292	586	finally
    //   293	298	586	finally
    //   305	310	586	finally
    //   312	317	586	finally
    //   319	324	586	finally
    //   328	333	586	finally
    //   340	345	586	finally
    //   347	350	586	finally
    //   352	357	586	finally
    //   361	366	586	finally
    //   373	378	586	finally
    //   392	396	586	finally
    //   398	401	586	finally
    //   403	408	586	finally
    //   412	417	586	finally
    //   419	424	586	finally
    //   426	432	586	finally
    //   432	435	586	finally
    //   439	444	586	finally
    //   446	449	591	finally
    //   456	461	591	finally
    //   191	196	603	java/security/NoSuchAlgorithmException
    //   203	206	603	java/security/NoSuchAlgorithmException
    //   215	221	603	java/security/NoSuchAlgorithmException
    //   221	226	603	java/security/NoSuchAlgorithmException
    //   240	243	603	java/security/NoSuchAlgorithmException
    //   245	250	603	java/security/NoSuchAlgorithmException
    //   250	253	603	java/security/NoSuchAlgorithmException
    //   259	264	603	java/security/NoSuchAlgorithmException
    //   266	271	603	java/security/NoSuchAlgorithmException
    //   273	276	603	java/security/NoSuchAlgorithmException
    //   278	283	603	java/security/NoSuchAlgorithmException
    //   287	292	603	java/security/NoSuchAlgorithmException
    //   293	298	603	java/security/NoSuchAlgorithmException
    //   305	310	603	java/security/NoSuchAlgorithmException
    //   312	317	603	java/security/NoSuchAlgorithmException
    //   319	324	603	java/security/NoSuchAlgorithmException
    //   328	333	603	java/security/NoSuchAlgorithmException
    //   340	345	603	java/security/NoSuchAlgorithmException
    //   347	350	603	java/security/NoSuchAlgorithmException
    //   352	357	603	java/security/NoSuchAlgorithmException
    //   361	366	603	java/security/NoSuchAlgorithmException
    //   373	378	603	java/security/NoSuchAlgorithmException
    //   392	396	603	java/security/NoSuchAlgorithmException
    //   398	401	603	java/security/NoSuchAlgorithmException
    //   403	408	603	java/security/NoSuchAlgorithmException
    //   412	417	603	java/security/NoSuchAlgorithmException
    //   419	424	603	java/security/NoSuchAlgorithmException
    //   426	432	603	java/security/NoSuchAlgorithmException
    //   432	435	603	java/security/NoSuchAlgorithmException
    //   439	444	603	java/security/NoSuchAlgorithmException
    //   446	449	618	java/security/NoSuchAlgorithmException
    //   456	461	618	java/security/NoSuchAlgorithmException
    //   130	135	627	com/google/android/gms/b/dy$a
    //   152	157	627	com/google/android/gms/b/dy$a
    //   171	175	627	com/google/android/gms/b/dy$a
    //   177	180	627	com/google/android/gms/b/dy$a
    //   184	189	627	com/google/android/gms/b/dy$a
    //   191	196	644	com/google/android/gms/b/dy$a
    //   203	206	644	com/google/android/gms/b/dy$a
    //   215	221	644	com/google/android/gms/b/dy$a
    //   221	226	644	com/google/android/gms/b/dy$a
    //   240	243	644	com/google/android/gms/b/dy$a
    //   245	250	644	com/google/android/gms/b/dy$a
    //   250	253	644	com/google/android/gms/b/dy$a
    //   259	264	644	com/google/android/gms/b/dy$a
    //   266	271	644	com/google/android/gms/b/dy$a
    //   273	276	644	com/google/android/gms/b/dy$a
    //   278	283	644	com/google/android/gms/b/dy$a
    //   287	292	644	com/google/android/gms/b/dy$a
    //   293	298	644	com/google/android/gms/b/dy$a
    //   305	310	644	com/google/android/gms/b/dy$a
    //   312	317	644	com/google/android/gms/b/dy$a
    //   319	324	644	com/google/android/gms/b/dy$a
    //   328	333	644	com/google/android/gms/b/dy$a
    //   340	345	644	com/google/android/gms/b/dy$a
    //   347	350	644	com/google/android/gms/b/dy$a
    //   352	357	644	com/google/android/gms/b/dy$a
    //   361	366	644	com/google/android/gms/b/dy$a
    //   373	378	644	com/google/android/gms/b/dy$a
    //   392	396	644	com/google/android/gms/b/dy$a
    //   398	401	644	com/google/android/gms/b/dy$a
    //   403	408	644	com/google/android/gms/b/dy$a
    //   412	417	644	com/google/android/gms/b/dy$a
    //   419	424	644	com/google/android/gms/b/dy$a
    //   426	432	644	com/google/android/gms/b/dy$a
    //   432	435	644	com/google/android/gms/b/dy$a
    //   439	444	644	com/google/android/gms/b/dy$a
    //   446	449	659	com/google/android/gms/b/dy$a
    //   456	461	659	com/google/android/gms/b/dy$a
    //   130	135	668	java/io/IOException
    //   152	157	668	java/io/IOException
    //   171	175	668	java/io/IOException
    //   177	180	668	java/io/IOException
    //   184	189	668	java/io/IOException
    //   191	196	685	java/io/IOException
    //   203	206	685	java/io/IOException
    //   215	221	685	java/io/IOException
    //   221	226	685	java/io/IOException
    //   240	243	685	java/io/IOException
    //   245	250	685	java/io/IOException
    //   250	253	685	java/io/IOException
    //   259	264	685	java/io/IOException
    //   266	271	685	java/io/IOException
    //   273	276	685	java/io/IOException
    //   278	283	685	java/io/IOException
    //   287	292	685	java/io/IOException
    //   293	298	685	java/io/IOException
    //   305	310	685	java/io/IOException
    //   312	317	685	java/io/IOException
    //   319	324	685	java/io/IOException
    //   328	333	685	java/io/IOException
    //   340	345	685	java/io/IOException
    //   347	350	685	java/io/IOException
    //   352	357	685	java/io/IOException
    //   361	366	685	java/io/IOException
    //   373	378	685	java/io/IOException
    //   392	396	685	java/io/IOException
    //   398	401	685	java/io/IOException
    //   403	408	685	java/io/IOException
    //   412	417	685	java/io/IOException
    //   419	424	685	java/io/IOException
    //   426	432	685	java/io/IOException
    //   432	435	685	java/io/IOException
    //   439	444	685	java/io/IOException
    //   446	449	700	java/io/IOException
    //   456	461	700	java/io/IOException
  }
  
  public final Context a()
  {
    return a;
  }
  
  public final Method a(String paramString1, String paramString2)
  {
    Object localObject = v;
    Pair localPair = new android/util/Pair;
    localPair.<init>(paramString1, paramString2);
    localObject = (gh)((Map)localObject).get(localPair);
    if (localObject == null) {}
    for (localObject = null;; localObject = ((gh)localObject).a()) {
      return (Method)localObject;
    }
  }
  
  public final boolean a(String paramString1, String paramString2, List paramList)
  {
    Map localMap = v;
    Pair localPair = new android/util/Pair;
    localPair.<init>(paramString1, paramString2);
    boolean bool = localMap.containsKey(localPair);
    if (!bool)
    {
      localMap = v;
      localPair = new android/util/Pair;
      localPair.<init>(paramString1, paramString2);
      gh localgh = new com/google/android/gms/b/gh;
      localgh.<init>(this, paramString1, paramString2, paramList);
      localMap.put(localPair, localgh);
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localMap = null;
    }
  }
  
  public final Context b()
  {
    return b;
  }
  
  public final boolean c()
  {
    return l;
  }
  
  public final boolean d()
  {
    return o;
  }
  
  public final boolean e()
  {
    return n;
  }
  
  public final void f()
  {
    synchronized (i)
    {
      boolean bool = t;
      if (!bool)
      {
        Object localObject2 = c;
        eu.2 local2 = new com/google/android/gms/b/eu$2;
        local2.<init>(this);
        localObject2 = ((ExecutorService)localObject2).submit(local2);
        h = ((Future)localObject2);
        bool = true;
        t = bool;
      }
      return;
    }
  }
  
  public final a g()
  {
    Object localObject = null;
    bool = r;
    if (!bool) {}
    for (;;)
    {
      return (a)localObject;
      localObject = q;
      if (localObject != null)
      {
        localObject = q;
      }
      else
      {
        localObject = s;
        if (localObject == null) {}
      }
      try
      {
        localObject = s;
        long l1 = 2000L;
        TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
        ((Future)localObject).get(l1, localTimeUnit);
        localObject = null;
        s = null;
      }
      catch (TimeoutException localTimeoutException)
      {
        for (;;)
        {
          Future localFuture = s;
          bool = true;
          localFuture.cancel(bool);
        }
      }
      catch (ExecutionException localExecutionException)
      {
        for (;;) {}
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;) {}
      }
      localObject = q;
    }
  }
  
  /* Error */
  public final void h()
  {
    // Byte code:
    //   0: getstatic 57	com/google/android/gms/b/eu:m	Ljava/lang/Object;
    //   3: astore_1
    //   4: aload_1
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield 79	com/google/android/gms/b/eu:o	Z
    //   10: istore_2
    //   11: iload_2
    //   12: ifeq +6 -> 18
    //   15: aload_1
    //   16: monitorexit
    //   17: return
    //   18: aload_0
    //   19: getfield 77	com/google/android/gms/b/eu:n	Z
    //   22: istore_2
    //   23: iload_2
    //   24: ifeq +42 -> 66
    //   27: aload_0
    //   28: getfield 73	com/google/android/gms/b/eu:k	Lcom/google/android/gms/common/api/c;
    //   31: astore_3
    //   32: aload_3
    //   33: ifnull +33 -> 66
    //   36: aload_0
    //   37: getfield 73	com/google/android/gms/b/eu:k	Lcom/google/android/gms/common/api/c;
    //   40: astore_3
    //   41: aload_3
    //   42: invokevirtual 488	com/google/android/gms/common/api/c:b	()V
    //   45: iconst_1
    //   46: istore_2
    //   47: aload_0
    //   48: iload_2
    //   49: putfield 79	com/google/android/gms/b/eu:o	Z
    //   52: aload_1
    //   53: monitorexit
    //   54: goto -37 -> 17
    //   57: astore_3
    //   58: aload_1
    //   59: monitorexit
    //   60: aload_3
    //   61: athrow
    //   62: astore_3
    //   63: goto -46 -> 17
    //   66: iconst_0
    //   67: istore_2
    //   68: aconst_null
    //   69: astore_3
    //   70: aload_0
    //   71: iconst_0
    //   72: putfield 79	com/google/android/gms/b/eu:o	Z
    //   75: goto -23 -> 52
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	eu
    //   10	58	2	bool	boolean
    //   31	11	3	localc	com.google.android.gms.common.api.c
    //   57	4	3	localObject2	Object
    //   62	1	3	localObject3	Object
    //   69	1	3	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   6	10	57	finally
    //   15	17	57	finally
    //   18	22	57	finally
    //   27	31	57	finally
    //   36	40	57	finally
    //   41	45	57	finally
    //   48	52	57	finally
    //   52	54	57	finally
    //   58	60	57	finally
    //   71	75	57	finally
    //   0	3	62	finally
    //   4	6	62	finally
    //   60	62	62	finally
  }
  
  public final void i()
  {
    synchronized (m)
    {
      boolean bool = o;
      if (bool)
      {
        com.google.android.gms.common.api.c localc = k;
        if (localc != null)
        {
          localc = k;
          localc.c();
          bool = false;
          localc = null;
          o = false;
        }
      }
      return;
    }
  }
  
  public final int j()
  {
    int i1 = -1 << -1;
    bl localbl = j;
    if (localbl != null) {
      i1 = bl.a();
    }
    return i1;
  }
}


/* Location:              com/google/android/gms/b/eu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */