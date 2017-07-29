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
  protected static final Object i = new Object();
  protected static final Object m = new Object();
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
  private Map<Pair<String, String>, gh> v;
  
  private eu(Context paramContext)
  {
    a = paramContext;
    b = paramContext.getApplicationContext();
    v = new HashMap();
  }
  
  public static eu a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    boolean bool = true;
    paramContext = new eu(paramContext);
    for (;;)
    {
      try
      {
        c = Executors.newCachedThreadPool();
        r = paramBoolean;
        if (paramBoolean) {
          s = c.submit(new Runnable()
          {
            public final void run()
            {
              eu.a(eu.this);
            }
          });
        }
        c.execute(new Runnable()
        {
          public final void run()
          {
            ke.a(a);
          }
        });
        try
        {
          u = m.b();
          if (u.b(a) <= 0) {
            break label324;
          }
          paramBoolean = true;
          l = paramBoolean;
          if (u.a(a) != 0) {
            break label329;
          }
          paramBoolean = bool;
          n = paramBoolean;
          if (a.getApplicationContext() != null)
          {
            localObject1 = new c.a(a);
            Object localObject2 = vz.c;
            com.google.android.gms.common.internal.c.a(localObject2, "Api must not be null");
            d.put(localObject2, null);
            localObject2 = Collections.emptyList();
            c.addAll((Collection)localObject2);
            b.addAll((Collection)localObject2);
            k = ((c.a)localObject1).b();
          }
        }
        catch (Throwable localThrowable)
        {
          Object localObject1;
          continue;
        }
        localObject1 = ke.bP;
        if (((Boolean)w.q().a((jz)localObject1)).booleanValue()) {
          paramContext.f();
        }
        if (ew.b())
        {
          localObject1 = ke.bN;
          if (((Boolean)w.q().a((jz)localObject1)).booleanValue()) {
            throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
          }
        }
        e = new dy();
        try
        {
          f = dy.a(paramString1);
          paramContext.a(paramString2);
          j = new bl(paramContext);
          return paramContext;
        }
        catch (dy.a paramContext)
        {
          throw new ea(paramContext);
        }
        paramBoolean = false;
      }
      catch (ea paramContext)
      {
        return null;
      }
      label324:
      continue;
      label329:
      paramBoolean = false;
    }
  }
  
  private static void a(File paramFile)
  {
    if (!paramFile.exists())
    {
      Log.d(p, String.format("File %s not found. No need for deletion", new Object[] { paramFile.getAbsolutePath() }));
      return;
    }
    paramFile.delete();
  }
  
  /* Error */
  private void a(File paramFile, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aconst_null
    //   4: astore 7
    //   6: new 261	java/io/File
    //   9: dup
    //   10: ldc_w 288
    //   13: iconst_2
    //   14: anewarray 4	java/lang/Object
    //   17: dup
    //   18: iconst_0
    //   19: aload_1
    //   20: aastore
    //   21: dup
    //   22: iconst_1
    //   23: aload_2
    //   24: aastore
    //   25: invokestatic 275	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   28: invokespecial 289	java/io/File:<init>	(Ljava/lang/String;)V
    //   31: astore 9
    //   33: aload 9
    //   35: invokevirtual 264	java/io/File:exists	()Z
    //   38: ifeq +4 -> 42
    //   41: return
    //   42: new 261	java/io/File
    //   45: dup
    //   46: ldc_w 291
    //   49: iconst_2
    //   50: anewarray 4	java/lang/Object
    //   53: dup
    //   54: iconst_0
    //   55: aload_1
    //   56: aastore
    //   57: dup
    //   58: iconst_1
    //   59: aload_2
    //   60: aastore
    //   61: invokestatic 275	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   64: invokespecial 289	java/io/File:<init>	(Ljava/lang/String;)V
    //   67: astore 8
    //   69: aload 8
    //   71: invokevirtual 264	java/io/File:exists	()Z
    //   74: ifeq -33 -> 41
    //   77: aload 8
    //   79: invokevirtual 295	java/io/File:length	()J
    //   82: lstore 4
    //   84: lload 4
    //   86: lconst_0
    //   87: lcmp
    //   88: ifle -47 -> 41
    //   91: lload 4
    //   93: l2i
    //   94: newarray <illegal type>
    //   96: astore 10
    //   98: new 297	java/io/FileInputStream
    //   101: dup
    //   102: aload 8
    //   104: invokespecial 299	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   107: astore_1
    //   108: aload_1
    //   109: aload 10
    //   111: invokevirtual 303	java/io/FileInputStream:read	([B)I
    //   114: istore_3
    //   115: iload_3
    //   116: ifgt +13 -> 129
    //   119: aload_1
    //   120: invokevirtual 306	java/io/FileInputStream:close	()V
    //   123: aload 8
    //   125: invokestatic 308	com/google/android/gms/b/eu:a	(Ljava/io/File;)V
    //   128: return
    //   129: new 310	com/google/android/gms/b/bf$d
    //   132: dup
    //   133: invokespecial 311	com/google/android/gms/b/bf$d:<init>	()V
    //   136: astore 7
    //   138: aload 7
    //   140: getstatic 316	android/os/Build$VERSION:SDK	Ljava/lang/String;
    //   143: invokevirtual 320	java/lang/String:getBytes	()[B
    //   146: putfield 322	com/google/android/gms/b/bf$d:d	[B
    //   149: aload 7
    //   151: aload_2
    //   152: invokevirtual 320	java/lang/String:getBytes	()[B
    //   155: putfield 324	com/google/android/gms/b/bf$d:c	[B
    //   158: aload_0
    //   159: getfield 230	com/google/android/gms/b/eu:e	Lcom/google/android/gms/b/dy;
    //   162: aload_0
    //   163: getfield 235	com/google/android/gms/b/eu:f	[B
    //   166: aload 10
    //   168: invokevirtual 327	com/google/android/gms/b/dy:a	([B[B)Ljava/lang/String;
    //   171: invokevirtual 320	java/lang/String:getBytes	()[B
    //   174: astore_2
    //   175: aload 7
    //   177: aload_2
    //   178: putfield 329	com/google/android/gms/b/bf$d:a	[B
    //   181: aload 7
    //   183: aload_2
    //   184: invokestatic 334	com/google/android/gms/b/bj:a	([B)[B
    //   187: putfield 336	com/google/android/gms/b/bf$d:b	[B
    //   190: aload 9
    //   192: invokevirtual 339	java/io/File:createNewFile	()Z
    //   195: pop
    //   196: new 341	java/io/FileOutputStream
    //   199: dup
    //   200: aload 9
    //   202: invokespecial 342	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   205: astore_2
    //   206: aload 7
    //   208: invokestatic 347	com/google/android/gms/b/gb:a	(Lcom/google/android/gms/b/gb;)[B
    //   211: astore 6
    //   213: aload_2
    //   214: aload 6
    //   216: iconst_0
    //   217: aload 6
    //   219: arraylength
    //   220: invokevirtual 351	java/io/FileOutputStream:write	([BII)V
    //   223: aload_2
    //   224: invokevirtual 352	java/io/FileOutputStream:close	()V
    //   227: aload_1
    //   228: invokevirtual 306	java/io/FileInputStream:close	()V
    //   231: aload_2
    //   232: invokevirtual 352	java/io/FileOutputStream:close	()V
    //   235: aload 8
    //   237: invokestatic 308	com/google/android/gms/b/eu:a	(Ljava/io/File;)V
    //   240: return
    //   241: astore_1
    //   242: aconst_null
    //   243: astore_1
    //   244: aload 7
    //   246: astore_2
    //   247: aload_2
    //   248: ifnull +7 -> 255
    //   251: aload_2
    //   252: invokevirtual 306	java/io/FileInputStream:close	()V
    //   255: aload_1
    //   256: ifnull +7 -> 263
    //   259: aload_1
    //   260: invokevirtual 352	java/io/FileOutputStream:close	()V
    //   263: aload 8
    //   265: invokestatic 308	com/google/android/gms/b/eu:a	(Ljava/io/File;)V
    //   268: return
    //   269: astore_2
    //   270: aconst_null
    //   271: astore_1
    //   272: aload_1
    //   273: ifnull +7 -> 280
    //   276: aload_1
    //   277: invokevirtual 306	java/io/FileInputStream:close	()V
    //   280: aload 6
    //   282: ifnull +8 -> 290
    //   285: aload 6
    //   287: invokevirtual 352	java/io/FileOutputStream:close	()V
    //   290: aload 8
    //   292: invokestatic 308	com/google/android/gms/b/eu:a	(Ljava/io/File;)V
    //   295: aload_2
    //   296: athrow
    //   297: astore_1
    //   298: goto -175 -> 123
    //   301: astore_1
    //   302: goto -71 -> 231
    //   305: astore_1
    //   306: goto -71 -> 235
    //   309: astore_2
    //   310: goto -55 -> 255
    //   313: astore_1
    //   314: goto -51 -> 263
    //   317: astore_1
    //   318: goto -38 -> 280
    //   321: astore_1
    //   322: goto -32 -> 290
    //   325: astore_2
    //   326: goto -54 -> 272
    //   329: astore 7
    //   331: aload_2
    //   332: astore 6
    //   334: aload 7
    //   336: astore_2
    //   337: goto -65 -> 272
    //   340: astore_2
    //   341: aconst_null
    //   342: astore 6
    //   344: aload_1
    //   345: astore_2
    //   346: aload 6
    //   348: astore_1
    //   349: goto -102 -> 247
    //   352: astore 6
    //   354: aload_1
    //   355: astore 6
    //   357: aload_2
    //   358: astore_1
    //   359: aload 6
    //   361: astore_2
    //   362: goto -115 -> 247
    //   365: astore_1
    //   366: aconst_null
    //   367: astore_1
    //   368: aload 7
    //   370: astore_2
    //   371: goto -124 -> 247
    //   374: astore_2
    //   375: aconst_null
    //   376: astore 6
    //   378: aload_1
    //   379: astore_2
    //   380: aload 6
    //   382: astore_1
    //   383: goto -136 -> 247
    //   386: astore 6
    //   388: aload_1
    //   389: astore 6
    //   391: aload_2
    //   392: astore_1
    //   393: aload 6
    //   395: astore_2
    //   396: goto -149 -> 247
    //   399: astore_1
    //   400: aconst_null
    //   401: astore_1
    //   402: aload 7
    //   404: astore_2
    //   405: goto -158 -> 247
    //   408: astore_2
    //   409: aconst_null
    //   410: astore 6
    //   412: aload_1
    //   413: astore_2
    //   414: aload 6
    //   416: astore_1
    //   417: goto -170 -> 247
    //   420: astore 6
    //   422: aload_1
    //   423: astore 6
    //   425: aload_2
    //   426: astore_1
    //   427: aload 6
    //   429: astore_2
    //   430: goto -183 -> 247
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	433	0	this	eu
    //   0	433	1	paramFile	File
    //   0	433	2	paramString	String
    //   114	2	3	i1	int
    //   82	10	4	l1	long
    //   1	346	6	localObject1	Object
    //   352	1	6	localNoSuchAlgorithmException	java.security.NoSuchAlgorithmException
    //   355	26	6	localFile1	File
    //   386	1	6	locala	dy.a
    //   389	26	6	localFile2	File
    //   420	1	6	localIOException	java.io.IOException
    //   423	5	6	localFile3	File
    //   4	241	7	locald	bf.d
    //   329	74	7	localObject2	Object
    //   67	224	8	localFile4	File
    //   31	170	9	localFile5	File
    //   96	71	10	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   98	108	241	java/security/NoSuchAlgorithmException
    //   98	108	269	finally
    //   119	123	297	java/io/IOException
    //   227	231	301	java/io/IOException
    //   231	235	305	java/io/IOException
    //   251	255	309	java/io/IOException
    //   259	263	313	java/io/IOException
    //   276	280	317	java/io/IOException
    //   285	290	321	java/io/IOException
    //   108	115	325	finally
    //   129	206	325	finally
    //   206	227	329	finally
    //   108	115	340	java/security/NoSuchAlgorithmException
    //   129	206	340	java/security/NoSuchAlgorithmException
    //   206	227	352	java/security/NoSuchAlgorithmException
    //   98	108	365	com/google/android/gms/b/dy$a
    //   108	115	374	com/google/android/gms/b/dy$a
    //   129	206	374	com/google/android/gms/b/dy$a
    //   206	227	386	com/google/android/gms/b/dy$a
    //   98	108	399	java/io/IOException
    //   108	115	408	java/io/IOException
    //   129	206	408	java/io/IOException
    //   206	227	420	java/io/IOException
  }
  
  /* Error */
  private boolean a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 91	com/google/android/gms/b/eu:a	Landroid/content/Context;
    //   4: invokevirtual 360	android/content/Context:getCacheDir	()Ljava/io/File;
    //   7: astore_3
    //   8: aload_3
    //   9: astore_2
    //   10: aload_3
    //   11: ifnonnull +39 -> 50
    //   14: aload_0
    //   15: getfield 91	com/google/android/gms/b/eu:a	Landroid/content/Context;
    //   18: ldc_w 362
    //   21: iconst_0
    //   22: invokevirtual 366	android/content/Context:getDir	(Ljava/lang/String;I)Ljava/io/File;
    //   25: astore_3
    //   26: aload_3
    //   27: astore_2
    //   28: aload_3
    //   29: ifnonnull +21 -> 50
    //   32: new 107	com/google/android/gms/b/ea
    //   35: dup
    //   36: invokespecial 367	com/google/android/gms/b/ea:<init>	()V
    //   39: athrow
    //   40: astore_1
    //   41: new 107	com/google/android/gms/b/ea
    //   44: dup
    //   45: aload_1
    //   46: invokespecial 246	com/google/android/gms/b/ea:<init>	(Ljava/lang/Throwable;)V
    //   49: athrow
    //   50: new 261	java/io/File
    //   53: dup
    //   54: ldc_w 369
    //   57: iconst_2
    //   58: anewarray 4	java/lang/Object
    //   61: dup
    //   62: iconst_0
    //   63: aload_2
    //   64: aastore
    //   65: dup
    //   66: iconst_1
    //   67: ldc_w 371
    //   70: aastore
    //   71: invokestatic 275	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   74: invokespecial 289	java/io/File:<init>	(Ljava/lang/String;)V
    //   77: astore_3
    //   78: aload_3
    //   79: invokevirtual 264	java/io/File:exists	()Z
    //   82: ifne +41 -> 123
    //   85: aload_0
    //   86: getfield 235	com/google/android/gms/b/eu:f	[B
    //   89: aload_1
    //   90: invokestatic 374	com/google/android/gms/b/dy:a	([BLjava/lang/String;)[B
    //   93: astore_1
    //   94: aload_3
    //   95: invokevirtual 339	java/io/File:createNewFile	()Z
    //   98: pop
    //   99: new 341	java/io/FileOutputStream
    //   102: dup
    //   103: aload_3
    //   104: invokespecial 342	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   107: astore 4
    //   109: aload 4
    //   111: aload_1
    //   112: iconst_0
    //   113: aload_1
    //   114: arraylength
    //   115: invokevirtual 351	java/io/FileOutputStream:write	([BII)V
    //   118: aload 4
    //   120: invokevirtual 352	java/io/FileOutputStream:close	()V
    //   123: aload_0
    //   124: aload_2
    //   125: ldc_w 371
    //   128: invokespecial 377	com/google/android/gms/b/eu:b	(Ljava/io/File;Ljava/lang/String;)Z
    //   131: pop
    //   132: aload_0
    //   133: new 379	dalvik/system/DexClassLoader
    //   136: dup
    //   137: aload_3
    //   138: invokevirtual 269	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   141: aload_2
    //   142: invokevirtual 269	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   145: aconst_null
    //   146: aload_0
    //   147: getfield 91	com/google/android/gms/b/eu:a	Landroid/content/Context;
    //   150: invokevirtual 383	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   153: invokespecial 386	dalvik/system/DexClassLoader:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   156: putfield 388	com/google/android/gms/b/eu:d	Ldalvik/system/DexClassLoader;
    //   159: aload_3
    //   160: invokestatic 308	com/google/android/gms/b/eu:a	(Ljava/io/File;)V
    //   163: aload_0
    //   164: aload_2
    //   165: ldc_w 371
    //   168: invokespecial 390	com/google/android/gms/b/eu:a	(Ljava/io/File;Ljava/lang/String;)V
    //   171: ldc_w 291
    //   174: iconst_2
    //   175: anewarray 4	java/lang/Object
    //   178: dup
    //   179: iconst_0
    //   180: aload_2
    //   181: aastore
    //   182: dup
    //   183: iconst_1
    //   184: ldc_w 371
    //   187: aastore
    //   188: invokestatic 275	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   191: invokestatic 392	com/google/android/gms/b/eu:b	(Ljava/lang/String;)V
    //   194: iconst_1
    //   195: ireturn
    //   196: astore_1
    //   197: aload_3
    //   198: invokestatic 308	com/google/android/gms/b/eu:a	(Ljava/io/File;)V
    //   201: aload_0
    //   202: aload_2
    //   203: ldc_w 371
    //   206: invokespecial 390	com/google/android/gms/b/eu:a	(Ljava/io/File;Ljava/lang/String;)V
    //   209: ldc_w 291
    //   212: iconst_2
    //   213: anewarray 4	java/lang/Object
    //   216: dup
    //   217: iconst_0
    //   218: aload_2
    //   219: aastore
    //   220: dup
    //   221: iconst_1
    //   222: ldc_w 371
    //   225: aastore
    //   226: invokestatic 275	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   229: invokestatic 392	com/google/android/gms/b/eu:b	(Ljava/lang/String;)V
    //   232: aload_1
    //   233: athrow
    //   234: astore_1
    //   235: new 107	com/google/android/gms/b/ea
    //   238: dup
    //   239: aload_1
    //   240: invokespecial 246	com/google/android/gms/b/ea:<init>	(Ljava/lang/Throwable;)V
    //   243: athrow
    //   244: astore_1
    //   245: new 107	com/google/android/gms/b/ea
    //   248: dup
    //   249: aload_1
    //   250: invokespecial 246	com/google/android/gms/b/ea:<init>	(Ljava/lang/Throwable;)V
    //   253: athrow
    //   254: astore_1
    //   255: new 107	com/google/android/gms/b/ea
    //   258: dup
    //   259: aload_1
    //   260: invokespecial 246	com/google/android/gms/b/ea:<init>	(Ljava/lang/Throwable;)V
    //   263: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	264	0	this	eu
    //   0	264	1	paramString	String
    //   9	210	2	localFile1	File
    //   7	191	3	localFile2	File
    //   107	12	4	localFileOutputStream	java.io.FileOutputStream
    // Exception table:
    //   from	to	target	type
    //   0	8	40	java/io/FileNotFoundException
    //   14	26	40	java/io/FileNotFoundException
    //   32	40	40	java/io/FileNotFoundException
    //   50	123	40	java/io/FileNotFoundException
    //   123	132	40	java/io/FileNotFoundException
    //   159	194	40	java/io/FileNotFoundException
    //   197	234	40	java/io/FileNotFoundException
    //   132	159	196	finally
    //   0	8	234	java/io/IOException
    //   14	26	234	java/io/IOException
    //   32	40	234	java/io/IOException
    //   50	123	234	java/io/IOException
    //   123	132	234	java/io/IOException
    //   159	194	234	java/io/IOException
    //   197	234	234	java/io/IOException
    //   0	8	244	com/google/android/gms/b/dy$a
    //   14	26	244	com/google/android/gms/b/dy$a
    //   32	40	244	com/google/android/gms/b/dy$a
    //   50	123	244	com/google/android/gms/b/dy$a
    //   123	132	244	com/google/android/gms/b/dy$a
    //   159	194	244	com/google/android/gms/b/dy$a
    //   197	234	244	com/google/android/gms/b/dy$a
    //   0	8	254	java/lang/NullPointerException
    //   14	26	254	java/lang/NullPointerException
    //   32	40	254	java/lang/NullPointerException
    //   50	123	254	java/lang/NullPointerException
    //   123	132	254	java/lang/NullPointerException
    //   159	194	254	java/lang/NullPointerException
    //   197	234	254	java/lang/NullPointerException
  }
  
  private static void b(String paramString)
  {
    a(new File(paramString));
  }
  
  /* Error */
  private boolean b(File paramFile, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: new 261	java/io/File
    //   6: dup
    //   7: ldc_w 288
    //   10: iconst_2
    //   11: anewarray 4	java/lang/Object
    //   14: dup
    //   15: iconst_0
    //   16: aload_1
    //   17: aastore
    //   18: dup
    //   19: iconst_1
    //   20: aload_2
    //   21: aastore
    //   22: invokestatic 275	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   25: invokespecial 289	java/io/File:<init>	(Ljava/lang/String;)V
    //   28: astore 6
    //   30: aload 6
    //   32: invokevirtual 264	java/io/File:exists	()Z
    //   35: ifne +5 -> 40
    //   38: iconst_0
    //   39: ireturn
    //   40: new 261	java/io/File
    //   43: dup
    //   44: ldc_w 291
    //   47: iconst_2
    //   48: anewarray 4	java/lang/Object
    //   51: dup
    //   52: iconst_0
    //   53: aload_1
    //   54: aastore
    //   55: dup
    //   56: iconst_1
    //   57: aload_2
    //   58: aastore
    //   59: invokestatic 275	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   62: invokespecial 289	java/io/File:<init>	(Ljava/lang/String;)V
    //   65: astore 7
    //   67: aload 7
    //   69: invokevirtual 264	java/io/File:exists	()Z
    //   72: ifeq +5 -> 77
    //   75: iconst_0
    //   76: ireturn
    //   77: aload 6
    //   79: invokevirtual 295	java/io/File:length	()J
    //   82: lstore_3
    //   83: lload_3
    //   84: lconst_0
    //   85: lcmp
    //   86: ifgt +10 -> 96
    //   89: aload 6
    //   91: invokestatic 308	com/google/android/gms/b/eu:a	(Ljava/io/File;)V
    //   94: iconst_0
    //   95: ireturn
    //   96: lload_3
    //   97: l2i
    //   98: newarray <illegal type>
    //   100: astore 8
    //   102: new 297	java/io/FileInputStream
    //   105: dup
    //   106: aload 6
    //   108: invokespecial 299	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   111: astore_1
    //   112: aload_1
    //   113: aload 8
    //   115: invokevirtual 303	java/io/FileInputStream:read	([B)I
    //   118: ifgt +24 -> 142
    //   121: getstatic 58	com/google/android/gms/b/eu:p	Ljava/lang/String;
    //   124: ldc_w 427
    //   127: invokestatic 280	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   130: pop
    //   131: aload 6
    //   133: invokestatic 308	com/google/android/gms/b/eu:a	(Ljava/io/File;)V
    //   136: aload_1
    //   137: invokevirtual 306	java/io/FileInputStream:close	()V
    //   140: iconst_0
    //   141: ireturn
    //   142: new 310	com/google/android/gms/b/bf$d
    //   145: dup
    //   146: invokespecial 311	com/google/android/gms/b/bf$d:<init>	()V
    //   149: aload 8
    //   151: aload 8
    //   153: arraylength
    //   154: invokestatic 430	com/google/android/gms/b/gb:a	(Lcom/google/android/gms/b/gb;[BI)Lcom/google/android/gms/b/gb;
    //   157: checkcast 310	com/google/android/gms/b/bf$d
    //   160: astore 8
    //   162: aload_2
    //   163: new 271	java/lang/String
    //   166: dup
    //   167: aload 8
    //   169: getfield 324	com/google/android/gms/b/bf$d:c	[B
    //   172: invokespecial 433	java/lang/String:<init>	([B)V
    //   175: invokevirtual 437	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   178: ifeq +39 -> 217
    //   181: aload 8
    //   183: getfield 336	com/google/android/gms/b/bf$d:b	[B
    //   186: aload 8
    //   188: getfield 329	com/google/android/gms/b/bf$d:a	[B
    //   191: invokestatic 334	com/google/android/gms/b/bj:a	([B)[B
    //   194: invokestatic 442	java/util/Arrays:equals	([B[B)Z
    //   197: ifeq +20 -> 217
    //   200: aload 8
    //   202: getfield 322	com/google/android/gms/b/bf$d:d	[B
    //   205: getstatic 316	android/os/Build$VERSION:SDK	Ljava/lang/String;
    //   208: invokevirtual 320	java/lang/String:getBytes	()[B
    //   211: invokestatic 442	java/util/Arrays:equals	([B[B)Z
    //   214: ifne +14 -> 228
    //   217: aload 6
    //   219: invokestatic 308	com/google/android/gms/b/eu:a	(Ljava/io/File;)V
    //   222: aload_1
    //   223: invokevirtual 306	java/io/FileInputStream:close	()V
    //   226: iconst_0
    //   227: ireturn
    //   228: aload_0
    //   229: getfield 235	com/google/android/gms/b/eu:f	[B
    //   232: new 271	java/lang/String
    //   235: dup
    //   236: aload 8
    //   238: getfield 329	com/google/android/gms/b/bf$d:a	[B
    //   241: invokespecial 433	java/lang/String:<init>	([B)V
    //   244: invokestatic 374	com/google/android/gms/b/dy:a	([BLjava/lang/String;)[B
    //   247: astore 6
    //   249: aload 7
    //   251: invokevirtual 339	java/io/File:createNewFile	()Z
    //   254: pop
    //   255: new 341	java/io/FileOutputStream
    //   258: dup
    //   259: aload 7
    //   261: invokespecial 342	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   264: astore_2
    //   265: aload_2
    //   266: aload 6
    //   268: iconst_0
    //   269: aload 6
    //   271: arraylength
    //   272: invokevirtual 351	java/io/FileOutputStream:write	([BII)V
    //   275: aload_1
    //   276: invokevirtual 306	java/io/FileInputStream:close	()V
    //   279: aload_2
    //   280: invokevirtual 352	java/io/FileOutputStream:close	()V
    //   283: iconst_1
    //   284: ireturn
    //   285: astore_1
    //   286: aconst_null
    //   287: astore_2
    //   288: aconst_null
    //   289: astore_1
    //   290: aload_1
    //   291: ifnull +7 -> 298
    //   294: aload_1
    //   295: invokevirtual 306	java/io/FileInputStream:close	()V
    //   298: aload_2
    //   299: ifnull +7 -> 306
    //   302: aload_2
    //   303: invokevirtual 352	java/io/FileOutputStream:close	()V
    //   306: iconst_0
    //   307: ireturn
    //   308: astore_2
    //   309: aconst_null
    //   310: astore_1
    //   311: aload_1
    //   312: ifnull +7 -> 319
    //   315: aload_1
    //   316: invokevirtual 306	java/io/FileInputStream:close	()V
    //   319: aload 5
    //   321: ifnull +8 -> 329
    //   324: aload 5
    //   326: invokevirtual 352	java/io/FileOutputStream:close	()V
    //   329: aload_2
    //   330: athrow
    //   331: astore_1
    //   332: goto -192 -> 140
    //   335: astore_1
    //   336: goto -110 -> 226
    //   339: astore_1
    //   340: goto -61 -> 279
    //   343: astore_1
    //   344: goto -61 -> 283
    //   347: astore_1
    //   348: goto -50 -> 298
    //   351: astore_1
    //   352: goto -46 -> 306
    //   355: astore_1
    //   356: goto -37 -> 319
    //   359: astore_1
    //   360: goto -31 -> 329
    //   363: astore_2
    //   364: goto -53 -> 311
    //   367: astore 6
    //   369: aload_2
    //   370: astore 5
    //   372: aload 6
    //   374: astore_2
    //   375: goto -64 -> 311
    //   378: astore_2
    //   379: aconst_null
    //   380: astore_2
    //   381: goto -91 -> 290
    //   384: astore 5
    //   386: goto -96 -> 290
    //   389: astore_1
    //   390: aconst_null
    //   391: astore_2
    //   392: aconst_null
    //   393: astore_1
    //   394: goto -104 -> 290
    //   397: astore_2
    //   398: aconst_null
    //   399: astore_2
    //   400: goto -110 -> 290
    //   403: astore 5
    //   405: goto -115 -> 290
    //   408: astore_1
    //   409: aconst_null
    //   410: astore_2
    //   411: aconst_null
    //   412: astore_1
    //   413: goto -123 -> 290
    //   416: astore_2
    //   417: aconst_null
    //   418: astore_2
    //   419: goto -129 -> 290
    //   422: astore 5
    //   424: goto -134 -> 290
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	427	0	this	eu
    //   0	427	1	paramFile	File
    //   0	427	2	paramString	String
    //   82	15	3	l1	long
    //   1	370	5	str	String
    //   384	1	5	localNoSuchAlgorithmException	java.security.NoSuchAlgorithmException
    //   403	1	5	locala	dy.a
    //   422	1	5	localIOException	java.io.IOException
    //   28	242	6	localObject1	Object
    //   367	6	6	localObject2	Object
    //   65	195	7	localFile	File
    //   100	137	8	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   77	83	285	java/security/NoSuchAlgorithmException
    //   89	94	285	java/security/NoSuchAlgorithmException
    //   96	112	285	java/security/NoSuchAlgorithmException
    //   77	83	308	finally
    //   89	94	308	finally
    //   96	112	308	finally
    //   136	140	331	java/io/IOException
    //   222	226	335	java/io/IOException
    //   275	279	339	java/io/IOException
    //   279	283	343	java/io/IOException
    //   294	298	347	java/io/IOException
    //   302	306	351	java/io/IOException
    //   315	319	355	java/io/IOException
    //   324	329	359	java/io/IOException
    //   112	136	363	finally
    //   142	217	363	finally
    //   217	222	363	finally
    //   228	265	363	finally
    //   265	275	367	finally
    //   112	136	378	java/security/NoSuchAlgorithmException
    //   142	217	378	java/security/NoSuchAlgorithmException
    //   217	222	378	java/security/NoSuchAlgorithmException
    //   228	265	378	java/security/NoSuchAlgorithmException
    //   265	275	384	java/security/NoSuchAlgorithmException
    //   77	83	389	com/google/android/gms/b/dy$a
    //   89	94	389	com/google/android/gms/b/dy$a
    //   96	112	389	com/google/android/gms/b/dy$a
    //   112	136	397	com/google/android/gms/b/dy$a
    //   142	217	397	com/google/android/gms/b/dy$a
    //   217	222	397	com/google/android/gms/b/dy$a
    //   228	265	397	com/google/android/gms/b/dy$a
    //   265	275	403	com/google/android/gms/b/dy$a
    //   77	83	408	java/io/IOException
    //   89	94	408	java/io/IOException
    //   96	112	408	java/io/IOException
    //   112	136	416	java/io/IOException
    //   142	217	416	java/io/IOException
    //   217	222	416	java/io/IOException
    //   228	265	416	java/io/IOException
    //   265	275	422	java/io/IOException
  }
  
  public final Context a()
  {
    return a;
  }
  
  public final Method a(String paramString1, String paramString2)
  {
    paramString1 = (gh)v.get(new Pair(paramString1, paramString2));
    if (paramString1 == null) {
      return null;
    }
    return paramString1.a();
  }
  
  public final boolean a(String paramString1, String paramString2, List<Class> paramList)
  {
    if (!v.containsKey(new Pair(paramString1, paramString2)))
    {
      v.put(new Pair(paramString1, paramString2), new gh(this, paramString1, paramString2, paramList));
      return true;
    }
    return false;
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
      if (!t)
      {
        h = c.submit(new Runnable()
        {
          public final void run()
          {
            eu.b(eu.this);
            synchronized (eu.i)
            {
              eu.c(eu.this);
              return;
            }
          }
        });
        t = true;
      }
      return;
    }
  }
  
  public final a g()
  {
    if (!r) {
      return null;
    }
    if (q != null) {
      return q;
    }
    if (s != null) {}
    try
    {
      s.get(2000L, TimeUnit.MILLISECONDS);
      s = null;
      return q;
    }
    catch (TimeoutException localTimeoutException)
    {
      for (;;)
      {
        s.cancel(true);
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
  }
  
  public final void h()
  {
    for (;;)
    {
      try
      {
        synchronized (m)
        {
          if (o) {
            return;
          }
          if ((n) && (k != null))
          {
            k.b();
            o = true;
            return;
          }
        }
        o = false;
      }
      catch (Throwable localThrowable)
      {
        return;
      }
    }
  }
  
  public final void i()
  {
    synchronized (m)
    {
      if ((o) && (k != null))
      {
        k.c();
        o = false;
      }
      return;
    }
  }
  
  public final int j()
  {
    int i1 = Integer.MIN_VALUE;
    if (j != null) {
      i1 = bl.a();
    }
    return i1;
  }
}


/* Location:              com/google/android/gms/b/eu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */