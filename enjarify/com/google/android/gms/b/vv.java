package com.google.android.gms.b;

import android.os.SystemClock;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class vv
  implements dz
{
  private final Map a;
  private long b;
  private final File c;
  private final int d;
  
  private vv(File paramFile)
  {
    LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
    localLinkedHashMap.<init>(16, 0.75F, true);
    a = localLinkedHashMap;
    b = 0L;
    c = paramFile;
    d = 5242880;
  }
  
  public vv(File paramFile, byte paramByte)
  {
    this(paramFile);
  }
  
  static int a(InputStream paramInputStream)
  {
    int i = e(paramInputStream) << 0 | 0x0;
    int j = e(paramInputStream) << 8;
    i |= j;
    j = e(paramInputStream) << 16;
    i |= j;
    j = e(paramInputStream) << 24;
    return i | j;
  }
  
  static void a(OutputStream paramOutputStream, int paramInt)
  {
    int i = paramInt >> 0 & 0xFF;
    paramOutputStream.write(i);
    i = paramInt >> 8 & 0xFF;
    paramOutputStream.write(i);
    i = paramInt >> 16 & 0xFF;
    paramOutputStream.write(i);
    i = paramInt >> 24 & 0xFF;
    paramOutputStream.write(i);
  }
  
  static void a(OutputStream paramOutputStream, long paramLong)
  {
    int i = (byte)(int)(paramLong >>> 0);
    paramOutputStream.write(i);
    i = (byte)(int)(paramLong >>> 8);
    paramOutputStream.write(i);
    i = (byte)(int)(paramLong >>> 16);
    paramOutputStream.write(i);
    i = (byte)(int)(paramLong >>> 24);
    paramOutputStream.write(i);
    i = (byte)(int)(paramLong >>> 32);
    paramOutputStream.write(i);
    i = (byte)(int)(paramLong >>> 40);
    paramOutputStream.write(i);
    i = (byte)(int)(paramLong >>> 48);
    paramOutputStream.write(i);
    i = (byte)(int)(paramLong >>> 56);
    paramOutputStream.write(i);
  }
  
  static void a(OutputStream paramOutputStream, String paramString)
  {
    byte[] arrayOfByte = paramString.getBytes("UTF-8");
    long l = arrayOfByte.length;
    a(paramOutputStream, l);
    int i = arrayOfByte.length;
    paramOutputStream.write(arrayOfByte, 0, i);
  }
  
  private void a(String paramString, vv.a parama)
  {
    Object localObject = a;
    boolean bool = ((Map)localObject).containsKey(paramString);
    long l1;
    long l2;
    if (!bool)
    {
      l1 = b;
      l2 = a;
      l1 += l2;
    }
    for (b = l1;; b = l1)
    {
      a.put(paramString, parama);
      return;
      localObject = (vv.a)a.get(paramString);
      l2 = b;
      long l3 = a;
      l1 = a;
      l1 = l3 - l1 + l2;
    }
  }
  
  private static byte[] a(InputStream paramInputStream, int paramInt)
  {
    Object localObject = new byte[paramInt];
    int i = 0;
    String str = null;
    while (i < paramInt)
    {
      int j = paramInt - i;
      j = paramInputStream.read((byte[])localObject, i, j);
      int k = -1;
      if (j == k) {
        break;
      }
      i += j;
    }
    if (i != paramInt)
    {
      localObject = new java/io/IOException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("Expected ");
      str = paramInt + " bytes, read " + i + " bytes";
      ((IOException)localObject).<init>(str);
      throw ((Throwable)localObject);
    }
    return (byte[])localObject;
  }
  
  static long b(InputStream paramInputStream)
  {
    long l1 = 255L;
    long l2 = (e(paramInputStream) & l1) << 0;
    long l3 = 0L | l2;
    l2 = (e(paramInputStream) & l1) << 8;
    l3 |= l2;
    l2 = (e(paramInputStream) & l1) << 16;
    l3 |= l2;
    l2 = (e(paramInputStream) & l1) << 24;
    l3 |= l2;
    l2 = (e(paramInputStream) & l1) << 32;
    l3 |= l2;
    l2 = (e(paramInputStream) & l1) << 40;
    l3 |= l2;
    l2 = (e(paramInputStream) & l1) << 48;
    l3 |= l2;
    l2 = (e(paramInputStream) & l1) << 56;
    return l3 | l2;
  }
  
  private void b(String paramString)
  {
    try
    {
      Object localObject1 = d(paramString);
      boolean bool = ((File)localObject1).delete();
      localObject1 = a;
      localObject1 = ((Map)localObject1).get(paramString);
      localObject1 = (vv.a)localObject1;
      if (localObject1 != null)
      {
        long l1 = b;
        long l2 = a;
        l1 -= l2;
        b = l1;
        localObject1 = a;
        ((Map)localObject1).remove(paramString);
      }
      if (!bool)
      {
        localObject1 = "Could not delete cache entry for key=%s, filename=%s";
        int i = 2;
        Object[] arrayOfObject = new Object[i];
        int j = 0;
        arrayOfObject[0] = paramString;
        j = 1;
        String str = c(paramString);
        arrayOfObject[j] = str;
        vs.b((String)localObject1, arrayOfObject);
      }
      return;
    }
    finally {}
  }
  
  static String c(InputStream paramInputStream)
  {
    int i = (int)b(paramInputStream);
    byte[] arrayOfByte = a(paramInputStream, i);
    String str = new java/lang/String;
    str.<init>(arrayOfByte, "UTF-8");
    return str;
  }
  
  private static String c(String paramString)
  {
    int i = paramString.length() / 2;
    Object localObject = String.valueOf(paramString.substring(0, i).hashCode());
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localObject = localStringBuilder.append((String)localObject);
    String str = String.valueOf(paramString.substring(i).hashCode());
    return str;
  }
  
  private File d(String paramString)
  {
    File localFile1 = new java/io/File;
    File localFile2 = c;
    String str = c(paramString);
    localFile1.<init>(localFile2, str);
    return localFile1;
  }
  
  static Map d(InputStream paramInputStream)
  {
    int i = a(paramInputStream);
    Object localObject;
    if (i == 0) {
      localObject = Collections.emptyMap();
    }
    for (;;)
    {
      int j = 0;
      while (j < i)
      {
        String str1 = c(paramInputStream).intern();
        String str2 = c(paramInputStream).intern();
        ((Map)localObject).put(str1, str2);
        j += 1;
      }
      localObject = new java/util/HashMap;
      ((HashMap)localObject).<init>(i);
    }
    return (Map)localObject;
  }
  
  private static int e(InputStream paramInputStream)
  {
    int i = paramInputStream.read();
    int j = -1;
    if (i == j)
    {
      EOFException localEOFException = new java/io/EOFException;
      localEOFException.<init>();
      throw localEOFException;
    }
    return i;
  }
  
  /* Error */
  public final dz.a a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 29	com/google/android/gms/b/vv:a	Ljava/util/Map;
    //   6: astore_2
    //   7: aload_2
    //   8: aload_1
    //   9: invokeinterface 88 2 0
    //   14: astore_2
    //   15: aload_2
    //   16: checkcast 78	com/google/android/gms/b/vv$a
    //   19: astore_2
    //   20: aload_2
    //   21: ifnonnull +9 -> 30
    //   24: aconst_null
    //   25: astore_2
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_2
    //   29: areturn
    //   30: aload_0
    //   31: aload_1
    //   32: invokespecial 126	com/google/android/gms/b/vv:d	(Ljava/lang/String;)Ljava/io/File;
    //   35: astore_3
    //   36: new 201	com/google/android/gms/b/vv$b
    //   39: astore 4
    //   41: new 203	java/io/BufferedInputStream
    //   44: astore 5
    //   46: new 205	java/io/FileInputStream
    //   49: astore 6
    //   51: aload 6
    //   53: aload_3
    //   54: invokespecial 206	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   57: aload 5
    //   59: aload 6
    //   61: invokespecial 209	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   64: iconst_0
    //   65: istore 7
    //   67: aconst_null
    //   68: astore 6
    //   70: aload 4
    //   72: aload 5
    //   74: iconst_0
    //   75: invokespecial 212	com/google/android/gms/b/vv$b:<init>	(Ljava/io/InputStream;B)V
    //   78: aload 4
    //   80: invokestatic 215	com/google/android/gms/b/vv$a:a	(Ljava/io/InputStream;)Lcom/google/android/gms/b/vv$a;
    //   83: pop
    //   84: aload_3
    //   85: invokevirtual 218	java/io/File:length	()J
    //   88: lstore 8
    //   90: aload 4
    //   92: invokestatic 221	com/google/android/gms/b/vv$b:a	(Lcom/google/android/gms/b/vv$b;)I
    //   95: i2l
    //   96: lstore 10
    //   98: lload 8
    //   100: lload 10
    //   102: lsub
    //   103: lstore 8
    //   105: lload 8
    //   107: l2i
    //   108: istore 12
    //   110: aload 4
    //   112: iload 12
    //   114: invokestatic 152	com/google/android/gms/b/vv:a	(Ljava/io/InputStream;I)[B
    //   117: astore 6
    //   119: new 223	com/google/android/gms/b/dz$a
    //   122: astore 5
    //   124: aload 5
    //   126: invokespecial 224	com/google/android/gms/b/dz$a:<init>	()V
    //   129: aload 5
    //   131: aload 6
    //   133: putfield 227	com/google/android/gms/b/dz$a:a	[B
    //   136: aload_2
    //   137: getfield 230	com/google/android/gms/b/vv$a:c	Ljava/lang/String;
    //   140: astore 6
    //   142: aload 5
    //   144: aload 6
    //   146: putfield 232	com/google/android/gms/b/dz$a:b	Ljava/lang/String;
    //   149: aload_2
    //   150: getfield 234	com/google/android/gms/b/vv$a:d	J
    //   153: lstore 8
    //   155: aload 5
    //   157: lload 8
    //   159: putfield 236	com/google/android/gms/b/dz$a:c	J
    //   162: aload_2
    //   163: getfield 238	com/google/android/gms/b/vv$a:e	J
    //   166: lstore 8
    //   168: aload 5
    //   170: lload 8
    //   172: putfield 239	com/google/android/gms/b/dz$a:d	J
    //   175: aload_2
    //   176: getfield 242	com/google/android/gms/b/vv$a:f	J
    //   179: lstore 8
    //   181: aload 5
    //   183: lload 8
    //   185: putfield 243	com/google/android/gms/b/dz$a:e	J
    //   188: aload_2
    //   189: getfield 246	com/google/android/gms/b/vv$a:g	J
    //   192: lstore 8
    //   194: aload 5
    //   196: lload 8
    //   198: putfield 247	com/google/android/gms/b/dz$a:f	J
    //   201: aload_2
    //   202: getfield 250	com/google/android/gms/b/vv$a:h	Ljava/util/Map;
    //   205: astore_2
    //   206: aload 5
    //   208: aload_2
    //   209: putfield 252	com/google/android/gms/b/dz$a:g	Ljava/util/Map;
    //   212: aload 4
    //   214: invokevirtual 255	com/google/android/gms/b/vv$b:close	()V
    //   217: aload 5
    //   219: astore_2
    //   220: goto -194 -> 26
    //   223: astore_2
    //   224: aconst_null
    //   225: astore_2
    //   226: goto -200 -> 26
    //   229: astore_2
    //   230: iconst_0
    //   231: istore 12
    //   233: aconst_null
    //   234: astore 5
    //   236: ldc_w 257
    //   239: astore 4
    //   241: iconst_2
    //   242: istore 7
    //   244: iload 7
    //   246: anewarray 4	java/lang/Object
    //   249: astore 6
    //   251: aload_3
    //   252: invokevirtual 260	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   255: astore_3
    //   256: aload 6
    //   258: iconst_0
    //   259: aload_3
    //   260: aastore
    //   261: iconst_1
    //   262: istore 13
    //   264: aload_2
    //   265: invokevirtual 261	java/io/IOException:toString	()Ljava/lang/String;
    //   268: astore_2
    //   269: aload 6
    //   271: iload 13
    //   273: aload_2
    //   274: aastore
    //   275: aload 4
    //   277: aload 6
    //   279: invokestatic 146	com/google/android/gms/b/vs:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   282: aload_0
    //   283: aload_1
    //   284: invokespecial 263	com/google/android/gms/b/vv:b	(Ljava/lang/String;)V
    //   287: aload 5
    //   289: ifnull +8 -> 297
    //   292: aload 5
    //   294: invokevirtual 255	com/google/android/gms/b/vv$b:close	()V
    //   297: aconst_null
    //   298: astore_2
    //   299: goto -273 -> 26
    //   302: astore_2
    //   303: aconst_null
    //   304: astore_2
    //   305: goto -279 -> 26
    //   308: astore_2
    //   309: aconst_null
    //   310: astore 4
    //   312: aload 4
    //   314: ifnull +8 -> 322
    //   317: aload 4
    //   319: invokevirtual 255	com/google/android/gms/b/vv$b:close	()V
    //   322: aload_2
    //   323: athrow
    //   324: astore_2
    //   325: aload_0
    //   326: monitorexit
    //   327: aload_2
    //   328: athrow
    //   329: astore_2
    //   330: aconst_null
    //   331: astore_2
    //   332: goto -306 -> 26
    //   335: astore_2
    //   336: goto -24 -> 312
    //   339: astore_2
    //   340: aload 5
    //   342: astore 4
    //   344: goto -32 -> 312
    //   347: astore_2
    //   348: aload 4
    //   350: astore 5
    //   352: goto -116 -> 236
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	355	0	this	vv
    //   0	355	1	paramString	String
    //   6	214	2	localObject1	Object
    //   223	1	2	localIOException1	IOException
    //   225	1	2	localObject2	Object
    //   229	36	2	localIOException2	IOException
    //   268	31	2	str	String
    //   302	1	2	localIOException3	IOException
    //   304	1	2	localObject3	Object
    //   308	15	2	localObject4	Object
    //   324	4	2	localObject5	Object
    //   329	1	2	localIOException4	IOException
    //   331	1	2	localObject6	Object
    //   335	1	2	localObject7	Object
    //   339	1	2	localObject8	Object
    //   347	1	2	localIOException5	IOException
    //   35	225	3	localObject9	Object
    //   39	310	4	localObject10	Object
    //   44	307	5	localObject11	Object
    //   49	229	6	localObject12	Object
    //   65	180	7	i	int
    //   88	109	8	l1	long
    //   96	5	10	l2	long
    //   108	124	12	j	int
    //   262	10	13	k	int
    // Exception table:
    //   from	to	target	type
    //   212	217	223	java/io/IOException
    //   36	39	229	java/io/IOException
    //   41	44	229	java/io/IOException
    //   46	49	229	java/io/IOException
    //   53	57	229	java/io/IOException
    //   59	64	229	java/io/IOException
    //   74	78	229	java/io/IOException
    //   292	297	302	java/io/IOException
    //   36	39	308	finally
    //   41	44	308	finally
    //   46	49	308	finally
    //   53	57	308	finally
    //   59	64	308	finally
    //   74	78	308	finally
    //   2	6	324	finally
    //   8	14	324	finally
    //   15	19	324	finally
    //   31	35	324	finally
    //   212	217	324	finally
    //   292	297	324	finally
    //   317	322	324	finally
    //   322	324	324	finally
    //   317	322	329	java/io/IOException
    //   78	84	335	finally
    //   84	88	335	finally
    //   90	95	335	finally
    //   112	117	335	finally
    //   119	122	335	finally
    //   124	129	335	finally
    //   131	136	335	finally
    //   136	140	335	finally
    //   144	149	335	finally
    //   149	153	335	finally
    //   157	162	335	finally
    //   162	166	335	finally
    //   170	175	335	finally
    //   175	179	335	finally
    //   183	188	335	finally
    //   188	192	335	finally
    //   196	201	335	finally
    //   201	205	335	finally
    //   208	212	335	finally
    //   244	249	339	finally
    //   251	255	339	finally
    //   259	261	339	finally
    //   264	268	339	finally
    //   273	275	339	finally
    //   277	282	339	finally
    //   283	287	339	finally
    //   78	84	347	java/io/IOException
    //   84	88	347	java/io/IOException
    //   90	95	347	java/io/IOException
    //   112	117	347	java/io/IOException
    //   119	122	347	java/io/IOException
    //   124	129	347	java/io/IOException
    //   131	136	347	java/io/IOException
    //   136	140	347	java/io/IOException
    //   144	149	347	java/io/IOException
    //   149	153	347	java/io/IOException
    //   157	162	347	java/io/IOException
    //   162	166	347	java/io/IOException
    //   170	175	347	java/io/IOException
    //   175	179	347	java/io/IOException
    //   183	188	347	java/io/IOException
    //   188	192	347	java/io/IOException
    //   196	201	347	java/io/IOException
    //   201	205	347	java/io/IOException
    //   208	212	347	java/io/IOException
  }
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield 33	com/google/android/gms/b/vv:c	Ljava/io/File;
    //   10: astore_3
    //   11: aload_3
    //   12: invokevirtual 266	java/io/File:exists	()Z
    //   15: istore 4
    //   17: iload 4
    //   19: ifne +59 -> 78
    //   22: aload_0
    //   23: getfield 33	com/google/android/gms/b/vv:c	Ljava/io/File;
    //   26: astore_2
    //   27: aload_2
    //   28: invokevirtual 269	java/io/File:mkdirs	()Z
    //   31: istore_1
    //   32: iload_1
    //   33: ifne +42 -> 75
    //   36: ldc_w 271
    //   39: astore_2
    //   40: iconst_1
    //   41: istore 4
    //   43: iload 4
    //   45: anewarray 4	java/lang/Object
    //   48: astore_3
    //   49: iconst_0
    //   50: istore 5
    //   52: aload_0
    //   53: getfield 33	com/google/android/gms/b/vv:c	Ljava/io/File;
    //   56: astore 6
    //   58: aload 6
    //   60: invokevirtual 260	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   63: astore 6
    //   65: aload_3
    //   66: iconst_0
    //   67: aload 6
    //   69: aastore
    //   70: aload_2
    //   71: aload_3
    //   72: invokestatic 273	com/google/android/gms/b/vs:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   75: aload_0
    //   76: monitorexit
    //   77: return
    //   78: aload_0
    //   79: getfield 33	com/google/android/gms/b/vv:c	Ljava/io/File;
    //   82: astore_3
    //   83: aload_3
    //   84: invokevirtual 277	java/io/File:listFiles	()[Ljava/io/File;
    //   87: astore 6
    //   89: aload 6
    //   91: ifnull -16 -> 75
    //   94: aload 6
    //   96: arraylength
    //   97: istore 7
    //   99: iconst_0
    //   100: istore 5
    //   102: iload 5
    //   104: iload 7
    //   106: if_icmpge -31 -> 75
    //   109: aload 6
    //   111: iload 5
    //   113: aaload
    //   114: astore 8
    //   116: iconst_0
    //   117: istore 4
    //   119: aconst_null
    //   120: astore_3
    //   121: new 203	java/io/BufferedInputStream
    //   124: astore_2
    //   125: new 205	java/io/FileInputStream
    //   128: astore 9
    //   130: aload 9
    //   132: aload 8
    //   134: invokespecial 206	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   137: aload_2
    //   138: aload 9
    //   140: invokespecial 209	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   143: aload_2
    //   144: invokestatic 215	com/google/android/gms/b/vv$a:a	(Ljava/io/InputStream;)Lcom/google/android/gms/b/vv$a;
    //   147: astore_3
    //   148: aload 8
    //   150: invokevirtual 218	java/io/File:length	()J
    //   153: lstore 10
    //   155: aload_3
    //   156: lload 10
    //   158: putfield 80	com/google/android/gms/b/vv$a:a	J
    //   161: aload_3
    //   162: getfield 278	com/google/android/gms/b/vv$a:b	Ljava/lang/String;
    //   165: astore 9
    //   167: aload_0
    //   168: aload 9
    //   170: aload_3
    //   171: invokespecial 281	com/google/android/gms/b/vv:a	(Ljava/lang/String;Lcom/google/android/gms/b/vv$a;)V
    //   174: aload_2
    //   175: invokevirtual 282	java/io/BufferedInputStream:close	()V
    //   178: iload 5
    //   180: iconst_1
    //   181: iadd
    //   182: istore_1
    //   183: iload_1
    //   184: istore 5
    //   186: goto -84 -> 102
    //   189: astore_2
    //   190: iconst_0
    //   191: istore_1
    //   192: aconst_null
    //   193: astore_2
    //   194: aload 8
    //   196: ifnull +9 -> 205
    //   199: aload 8
    //   201: invokevirtual 132	java/io/File:delete	()Z
    //   204: pop
    //   205: aload_2
    //   206: ifnull -28 -> 178
    //   209: aload_2
    //   210: invokevirtual 282	java/io/BufferedInputStream:close	()V
    //   213: goto -35 -> 178
    //   216: astore_2
    //   217: goto -39 -> 178
    //   220: astore_2
    //   221: aload_3
    //   222: ifnull +7 -> 229
    //   225: aload_3
    //   226: invokevirtual 282	java/io/BufferedInputStream:close	()V
    //   229: aload_2
    //   230: athrow
    //   231: astore_2
    //   232: aload_0
    //   233: monitorexit
    //   234: aload_2
    //   235: athrow
    //   236: astore_2
    //   237: goto -59 -> 178
    //   240: astore_3
    //   241: goto -12 -> 229
    //   244: astore 12
    //   246: aload_2
    //   247: astore_3
    //   248: aload 12
    //   250: astore_2
    //   251: goto -30 -> 221
    //   254: astore_3
    //   255: goto -61 -> 194
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	258	0	this	vv
    //   1	32	1	bool1	boolean
    //   182	10	1	i	int
    //   3	172	2	localObject1	Object
    //   189	1	2	localIOException1	IOException
    //   193	17	2	localObject2	Object
    //   216	1	2	localIOException2	IOException
    //   220	10	2	localObject3	Object
    //   231	4	2	localObject4	Object
    //   236	11	2	localIOException3	IOException
    //   250	1	2	localObject5	Object
    //   10	216	3	localObject6	Object
    //   240	1	3	localIOException4	IOException
    //   247	1	3	localIOException5	IOException
    //   254	1	3	localIOException6	IOException
    //   15	103	4	bool2	boolean
    //   50	135	5	j	int
    //   56	54	6	localObject7	Object
    //   97	10	7	k	int
    //   114	86	8	localFile	File
    //   128	41	9	localObject8	Object
    //   153	4	10	l	long
    //   244	5	12	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   121	124	189	java/io/IOException
    //   125	128	189	java/io/IOException
    //   132	137	189	java/io/IOException
    //   138	143	189	java/io/IOException
    //   209	213	216	java/io/IOException
    //   121	124	220	finally
    //   125	128	220	finally
    //   132	137	220	finally
    //   138	143	220	finally
    //   6	10	231	finally
    //   11	15	231	finally
    //   22	26	231	finally
    //   27	31	231	finally
    //   43	48	231	finally
    //   52	56	231	finally
    //   58	63	231	finally
    //   67	70	231	finally
    //   71	75	231	finally
    //   78	82	231	finally
    //   83	87	231	finally
    //   94	97	231	finally
    //   111	114	231	finally
    //   174	178	231	finally
    //   209	213	231	finally
    //   225	229	231	finally
    //   229	231	231	finally
    //   174	178	236	java/io/IOException
    //   225	229	240	java/io/IOException
    //   143	147	244	finally
    //   148	153	244	finally
    //   156	161	244	finally
    //   161	165	244	finally
    //   170	174	244	finally
    //   199	205	244	finally
    //   143	147	254	java/io/IOException
    //   148	153	254	java/io/IOException
    //   156	161	254	java/io/IOException
    //   161	165	254	java/io/IOException
    //   170	174	254	java/io/IOException
  }
  
  public final void a(String paramString, dz.a parama)
  {
    int i = 0;
    float f1 = 0.0F;
    Object localObject1 = null;
    for (;;)
    {
      Object localObject4;
      Object localObject6;
      String str1;
      try
      {
        Object localObject2 = a;
        int j = localObject2.length;
        long l1 = b;
        long l2 = j;
        l1 += l2;
        l2 = d;
        boolean bool1 = l1 < l2;
        boolean bool2;
        if (!bool1)
        {
          bool1 = vs.b;
          if (bool1)
          {
            localObject2 = "Pruning old cache entries.";
            bool2 = false;
            localObject4 = null;
            localObject4 = new Object[0];
            vs.a((String)localObject2, (Object[])localObject4);
          }
          l1 = b;
          l2 = SystemClock.elapsedRealtime();
          localObject2 = a;
          localObject2 = ((Map)localObject2).entrySet();
          localObject4 = ((Set)localObject2).iterator();
          bool1 = ((Iterator)localObject4).hasNext();
          if (!bool1) {
            break label684;
          }
          localObject2 = ((Iterator)localObject4).next();
          localObject2 = (Map.Entry)localObject2;
          localObject2 = ((Map.Entry)localObject2).getValue();
          localObject2 = (vv.a)localObject2;
          localObject5 = b;
          localObject5 = d((String)localObject5);
          boolean bool3 = ((File)localObject5).delete();
          if (!bool3) {
            continue;
          }
          long l3 = b;
          long l4 = a;
          l3 -= l4;
          b = l3;
          ((Iterator)localObject4).remove();
          k = i + 1;
          l3 = b;
          l4 = j;
          l3 += l4;
          f1 = (float)l3;
          int m = d;
          float f2 = m;
          n = 1063675494;
          f3 = 0.9F;
          f2 *= f3;
          i = f1 < f2;
          if (i >= 0) {
            break label678;
          }
          i = vs.b;
          if (i != 0)
          {
            localObject1 = "pruned %d files, %d bytes, %d ms";
            j = 3;
            localObject6 = new Object[j];
            bool2 = false;
            localObject4 = null;
            localObject2 = Integer.valueOf(k);
            localObject6[0] = localObject2;
            k = 1;
            l3 = b;
            l1 = l3 - l1;
            localObject4 = Long.valueOf(l1);
            localObject6[k] = localObject4;
            k = 2;
            l1 = SystemClock.elapsedRealtime() - l2;
            localObject4 = Long.valueOf(l1);
            localObject6[k] = localObject4;
            vs.a((String)localObject1, (Object[])localObject6);
          }
        }
        localObject2 = d(paramString);
        try
        {
          localObject1 = new java/io/BufferedOutputStream;
          localObject6 = new java/io/FileOutputStream;
          ((FileOutputStream)localObject6).<init>((File)localObject2);
          ((BufferedOutputStream)localObject1).<init>((OutputStream)localObject6);
          localObject6 = new com/google/android/gms/b/vv$a;
          ((vv.a)localObject6).<init>(paramString, parama);
          bool2 = ((vv.a)localObject6).a((OutputStream)localObject1);
          if (bool2) {
            break label650;
          }
          ((BufferedOutputStream)localObject1).close();
          localObject1 = "Failed to write header for %s";
          j = 1;
          localObject6 = new Object[j];
          bool2 = false;
          localObject4 = null;
          String str2 = ((File)localObject2).getAbsolutePath();
          localObject6[0] = str2;
          vs.b((String)localObject1, (Object[])localObject6);
          localObject1 = new java/io/IOException;
          ((IOException)localObject1).<init>();
          throw ((Throwable)localObject1);
        }
        catch (IOException localIOException)
        {
          i = ((File)localObject2).delete();
          if (i == 0)
          {
            str1 = "Could not clean up file %s";
            j = 1;
            localObject6 = new Object[j];
            bool2 = false;
            localObject4 = null;
            localObject2 = ((File)localObject2).getAbsolutePath();
            localObject6[0] = localObject2;
            vs.b(str1, (Object[])localObject6);
          }
        }
        return;
        Object localObject5 = "Could not delete cache entry for key=%s, filename=%s";
        int n = 2;
        float f3 = 2.8E-45F;
        Object[] arrayOfObject = new Object[n];
        int i1 = 0;
        String str3 = b;
        arrayOfObject[0] = str3;
        i1 = 1;
        localObject2 = b;
        localObject2 = c((String)localObject2);
        arrayOfObject[i1] = localObject2;
        vs.b((String)localObject5, arrayOfObject);
        continue;
        localObject4 = a;
      }
      finally {}
      label650:
      str1.write((byte[])localObject4);
      str1.close();
      a(paramString, (vv.a)localObject6);
      continue;
      label678:
      i = k;
      continue;
      label684:
      int k = i;
    }
  }
}


/* Location:              com/google/android/gms/b/vv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */