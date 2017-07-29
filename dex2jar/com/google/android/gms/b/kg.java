package com.google.android.gms.b;

import android.content.Context;
import android.os.Environment;
import com.google.android.gms.ads.internal.w;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

@qi
public final class kg
{
  BlockingQueue<km> a;
  ExecutorService b;
  public LinkedHashMap<String, String> c = new LinkedHashMap();
  Map<String, kj> d = new HashMap();
  String e;
  final Context f;
  final String g;
  AtomicBoolean h;
  File i;
  
  public kg(Context paramContext, String paramString1, String paramString2, Map<String, String> paramMap)
  {
    f = paramContext;
    g = paramString1;
    e = paramString2;
    h = new AtomicBoolean(false);
    paramContext = h;
    paramString1 = ke.V;
    paramContext.set(((Boolean)w.q().a(paramString1)).booleanValue());
    if (h.get())
    {
      paramContext = Environment.getExternalStorageDirectory();
      if (paramContext != null) {
        i = new File(paramContext, "sdk_csi_data.txt");
      }
    }
    paramContext = paramMap.entrySet().iterator();
    while (paramContext.hasNext())
    {
      paramString1 = (Map.Entry)paramContext.next();
      c.put((String)paramString1.getKey(), (String)paramString1.getValue());
    }
    a = new ArrayBlockingQueue(30);
    b = Executors.newSingleThreadExecutor();
    b.execute(new Runnable()
    {
      /* Error */
      public final void run()
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 16	com/google/android/gms/b/kg$1:a	Lcom/google/android/gms/b/kg;
        //   4: astore 4
        //   6: aload 4
        //   8: getfield 28	com/google/android/gms/b/kg:a	Ljava/util/concurrent/BlockingQueue;
        //   11: invokeinterface 34 1 0
        //   16: checkcast 36	com/google/android/gms/b/km
        //   19: astore_2
        //   20: aload_2
        //   21: invokevirtual 40	com/google/android/gms/b/km:b	()Ljava/lang/String;
        //   24: astore_1
        //   25: aload_1
        //   26: invokestatic 46	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
        //   29: ifne -23 -> 6
        //   32: aload 4
        //   34: aload 4
        //   36: getfield 50	com/google/android/gms/b/kg:c	Ljava/util/LinkedHashMap;
        //   39: aload_2
        //   40: invokevirtual 53	com/google/android/gms/b/km:c	()Ljava/util/Map;
        //   43: invokevirtual 56	com/google/android/gms/b/kg:a	(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;
        //   46: astore_3
        //   47: aload 4
        //   49: getfield 60	com/google/android/gms/b/kg:e	Ljava/lang/String;
        //   52: invokestatic 66	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
        //   55: invokevirtual 70	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
        //   58: astore_2
        //   59: aload_3
        //   60: invokeinterface 76 1 0
        //   65: invokeinterface 82 1 0
        //   70: astore_3
        //   71: aload_3
        //   72: invokeinterface 88 1 0
        //   77: ifeq +50 -> 127
        //   80: aload_3
        //   81: invokeinterface 91 1 0
        //   86: checkcast 93	java/util/Map$Entry
        //   89: astore 5
        //   91: aload_2
        //   92: aload 5
        //   94: invokeinterface 96 1 0
        //   99: checkcast 98	java/lang/String
        //   102: aload 5
        //   104: invokeinterface 101 1 0
        //   109: checkcast 98	java/lang/String
        //   112: invokevirtual 107	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   115: pop
        //   116: goto -45 -> 71
        //   119: astore_1
        //   120: ldc 109
        //   122: aload_1
        //   123: invokestatic 114	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   126: return
        //   127: new 116	java/lang/StringBuilder
        //   130: dup
        //   131: aload_2
        //   132: invokevirtual 120	android/net/Uri$Builder:build	()Landroid/net/Uri;
        //   135: invokevirtual 123	android/net/Uri:toString	()Ljava/lang/String;
        //   138: invokespecial 126	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
        //   141: astore_2
        //   142: aload_2
        //   143: ldc -128
        //   145: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   148: aload_1
        //   149: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   152: pop
        //   153: aload_2
        //   154: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   157: astore_3
        //   158: aload 4
        //   160: getfield 137	com/google/android/gms/b/kg:h	Ljava/util/concurrent/atomic/AtomicBoolean;
        //   163: invokevirtual 142	java/util/concurrent/atomic/AtomicBoolean:get	()Z
        //   166: ifeq +121 -> 287
        //   169: aload 4
        //   171: getfield 146	com/google/android/gms/b/kg:i	Ljava/io/File;
        //   174: astore_1
        //   175: aload_1
        //   176: ifnull +103 -> 279
        //   179: new 148	java/io/FileOutputStream
        //   182: dup
        //   183: aload_1
        //   184: iconst_1
        //   185: invokespecial 151	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
        //   188: astore_2
        //   189: aload_2
        //   190: astore_1
        //   191: aload_2
        //   192: aload_3
        //   193: invokevirtual 155	java/lang/String:getBytes	()[B
        //   196: invokevirtual 159	java/io/FileOutputStream:write	([B)V
        //   199: aload_2
        //   200: astore_1
        //   201: aload_2
        //   202: bipush 10
        //   204: invokevirtual 162	java/io/FileOutputStream:write	(I)V
        //   207: aload_2
        //   208: invokevirtual 165	java/io/FileOutputStream:close	()V
        //   211: goto -205 -> 6
        //   214: astore_1
        //   215: ldc -89
        //   217: aload_1
        //   218: invokestatic 114	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   221: goto -215 -> 6
        //   224: astore_3
        //   225: aconst_null
        //   226: astore_2
        //   227: aload_2
        //   228: astore_1
        //   229: ldc -87
        //   231: aload_3
        //   232: invokestatic 114	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   235: aload_2
        //   236: ifnull -230 -> 6
        //   239: aload_2
        //   240: invokevirtual 165	java/io/FileOutputStream:close	()V
        //   243: goto -237 -> 6
        //   246: astore_1
        //   247: ldc -89
        //   249: aload_1
        //   250: invokestatic 114	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   253: goto -247 -> 6
        //   256: astore_2
        //   257: aconst_null
        //   258: astore_1
        //   259: aload_1
        //   260: ifnull +7 -> 267
        //   263: aload_1
        //   264: invokevirtual 165	java/io/FileOutputStream:close	()V
        //   267: aload_2
        //   268: athrow
        //   269: astore_1
        //   270: ldc -89
        //   272: aload_1
        //   273: invokestatic 114	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   276: goto -9 -> 267
        //   279: ldc -85
        //   281: invokestatic 173	com/google/android/gms/b/tp:e	(Ljava/lang/String;)V
        //   284: goto -278 -> 6
        //   287: invokestatic 178	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
        //   290: pop
        //   291: aload 4
        //   293: getfield 182	com/google/android/gms/b/kg:f	Landroid/content/Context;
        //   296: aload 4
        //   298: getfield 185	com/google/android/gms/b/kg:g	Ljava/lang/String;
        //   301: aload_3
        //   302: invokestatic 190	com/google/android/gms/b/tt:b	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
        //   305: goto -299 -> 6
        //   308: astore_2
        //   309: goto -50 -> 259
        //   312: astore_3
        //   313: goto -86 -> 227
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	316	0	this	1
        //   24	2	1	str	String
        //   119	30	1	localInterruptedException	InterruptedException
        //   174	27	1	localObject1	Object
        //   214	4	1	localIOException1	java.io.IOException
        //   228	1	1	localObject2	Object
        //   246	4	1	localIOException2	java.io.IOException
        //   258	6	1	localObject3	Object
        //   269	4	1	localIOException3	java.io.IOException
        //   19	221	2	localObject4	Object
        //   256	12	2	localObject5	Object
        //   308	1	2	localObject6	Object
        //   46	147	3	localObject7	Object
        //   224	78	3	localIOException4	java.io.IOException
        //   312	1	3	localIOException5	java.io.IOException
        //   4	293	4	localkg	kg
        //   89	14	5	localEntry	Map.Entry
        // Exception table:
        //   from	to	target	type
        //   6	25	119	java/lang/InterruptedException
        //   207	211	214	java/io/IOException
        //   179	189	224	java/io/IOException
        //   239	243	246	java/io/IOException
        //   179	189	256	finally
        //   263	267	269	java/io/IOException
        //   191	199	308	finally
        //   201	207	308	finally
        //   229	235	308	finally
        //   191	199	312	java/io/IOException
        //   201	207	312	java/io/IOException
      }
    });
    d.put("action", kj.b);
    d.put("ad_format", kj.b);
    d.put("e", kj.c);
  }
  
  public final kj a(String paramString)
  {
    paramString = (kj)d.get(paramString);
    if (paramString != null) {
      return paramString;
    }
    return kj.a;
  }
  
  final Map<String, String> a(Map<String, String> paramMap1, Map<String, String> paramMap2)
  {
    paramMap1 = new LinkedHashMap(paramMap1);
    if (paramMap2 == null) {
      return paramMap1;
    }
    paramMap2 = paramMap2.entrySet().iterator();
    while (paramMap2.hasNext())
    {
      Object localObject = (Map.Entry)paramMap2.next();
      String str1 = (String)((Map.Entry)localObject).getKey();
      localObject = (String)((Map.Entry)localObject).getValue();
      String str2 = (String)paramMap1.get(str1);
      paramMap1.put(str1, a(str1).a(str2, (String)localObject));
    }
    return paramMap1;
  }
  
  public final boolean a(km paramkm)
  {
    return a.offer(paramkm);
  }
}


/* Location:              com/google/android/gms/b/kg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */