package com.a.a.a;

import android.os.SystemClock;
import com.a.a.b;
import com.a.a.b.a;
import com.a.a.t;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
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

public final class c
  implements b
{
  private final Map<String, a> a = new LinkedHashMap(16, 0.75F, true);
  private long b = 0L;
  private final File c;
  private final int d;
  
  private c(File paramFile)
  {
    c = paramFile;
    d = 5242880;
  }
  
  public c(File paramFile, byte paramByte)
  {
    this(paramFile);
  }
  
  static int a(InputStream paramInputStream)
  {
    return e(paramInputStream) << 0 | 0x0 | e(paramInputStream) << 8 | e(paramInputStream) << 16 | e(paramInputStream) << 24;
  }
  
  static void a(OutputStream paramOutputStream, int paramInt)
  {
    paramOutputStream.write(paramInt >> 0 & 0xFF);
    paramOutputStream.write(paramInt >> 8 & 0xFF);
    paramOutputStream.write(paramInt >> 16 & 0xFF);
    paramOutputStream.write(paramInt >> 24 & 0xFF);
  }
  
  static void a(OutputStream paramOutputStream, long paramLong)
  {
    paramOutputStream.write((byte)(int)(paramLong >>> 0));
    paramOutputStream.write((byte)(int)(paramLong >>> 8));
    paramOutputStream.write((byte)(int)(paramLong >>> 16));
    paramOutputStream.write((byte)(int)(paramLong >>> 24));
    paramOutputStream.write((byte)(int)(paramLong >>> 32));
    paramOutputStream.write((byte)(int)(paramLong >>> 40));
    paramOutputStream.write((byte)(int)(paramLong >>> 48));
    paramOutputStream.write((byte)(int)(paramLong >>> 56));
  }
  
  static void a(OutputStream paramOutputStream, String paramString)
  {
    paramString = paramString.getBytes("UTF-8");
    a(paramOutputStream, paramString.length);
    paramOutputStream.write(paramString, 0, paramString.length);
  }
  
  private void a(String paramString, a parama)
  {
    if (!a.containsKey(paramString)) {}
    a locala;
    long l;
    for (b += a;; b = (a - a + l))
    {
      a.put(paramString, parama);
      return;
      locala = (a)a.get(paramString);
      l = b;
    }
  }
  
  private static byte[] a(InputStream paramInputStream, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    int i = 0;
    while (i < paramInt)
    {
      int j = paramInputStream.read(arrayOfByte, i, paramInt - i);
      if (j == -1) {
        break;
      }
      i += j;
    }
    if (i != paramInt) {
      throw new IOException(50 + "Expected " + paramInt + " bytes, read " + i + " bytes");
    }
    return arrayOfByte;
  }
  
  static long b(InputStream paramInputStream)
  {
    return 0L | (e(paramInputStream) & 0xFF) << 0 | (e(paramInputStream) & 0xFF) << 8 | (e(paramInputStream) & 0xFF) << 16 | (e(paramInputStream) & 0xFF) << 24 | (e(paramInputStream) & 0xFF) << 32 | (e(paramInputStream) & 0xFF) << 40 | (e(paramInputStream) & 0xFF) << 48 | (e(paramInputStream) & 0xFF) << 56;
  }
  
  private void b(String paramString)
  {
    try
    {
      boolean bool = d(paramString).delete();
      a locala = (a)a.get(paramString);
      if (locala != null)
      {
        b -= a;
        a.remove(paramString);
      }
      if (!bool) {
        t.b("Could not delete cache entry for key=%s, filename=%s", new Object[] { paramString, c(paramString) });
      }
      return;
    }
    finally {}
  }
  
  static String c(InputStream paramInputStream)
  {
    return new String(a(paramInputStream, (int)b(paramInputStream)), "UTF-8");
  }
  
  private static String c(String paramString)
  {
    int i = paramString.length() / 2;
    String str = String.valueOf(String.valueOf(paramString.substring(0, i).hashCode()));
    paramString = String.valueOf(String.valueOf(paramString.substring(i).hashCode()));
    if (paramString.length() != 0) {
      return str.concat(paramString);
    }
    return new String(str);
  }
  
  private File d(String paramString)
  {
    return new File(c, c(paramString));
  }
  
  static Map<String, String> d(InputStream paramInputStream)
  {
    int j = a(paramInputStream);
    if (j == 0) {}
    for (Object localObject = Collections.emptyMap();; localObject = new HashMap(j))
    {
      int i = 0;
      while (i < j)
      {
        ((Map)localObject).put(c(paramInputStream).intern(), c(paramInputStream).intern());
        i += 1;
      }
    }
    return (Map<String, String>)localObject;
  }
  
  private static int e(InputStream paramInputStream)
  {
    int i = paramInputStream.read();
    if (i == -1) {
      throw new EOFException();
    }
    return i;
  }
  
  /* Error */
  public final b.a a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 32	com/a/a/a/c:a	Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface 86 2 0
    //   12: checkcast 8	com/a/a/a/c$a
    //   15: astore 5
    //   17: aload 5
    //   19: ifnonnull +9 -> 28
    //   22: aconst_null
    //   23: astore_1
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_1
    //   27: areturn
    //   28: aload_0
    //   29: aload_1
    //   30: invokespecial 125	com/a/a/a/c:d	(Ljava/lang/String;)Ljava/io/File;
    //   33: astore 4
    //   35: new 11	com/a/a/a/c$b
    //   38: dup
    //   39: new 206	java/io/BufferedInputStream
    //   42: dup
    //   43: new 208	java/io/FileInputStream
    //   46: dup
    //   47: aload 4
    //   49: invokespecial 209	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   52: invokespecial 212	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   55: iconst_0
    //   56: invokespecial 215	com/a/a/a/c$b:<init>	(Ljava/io/InputStream;B)V
    //   59: astore_2
    //   60: aload_2
    //   61: invokestatic 218	com/a/a/a/c$a:a	(Ljava/io/InputStream;)Lcom/a/a/a/c$a;
    //   64: pop
    //   65: aload_2
    //   66: aload 4
    //   68: invokevirtual 221	java/io/File:length	()J
    //   71: aload_2
    //   72: invokestatic 224	com/a/a/a/c$b:a	(Lcom/a/a/a/c$b;)I
    //   75: i2l
    //   76: lsub
    //   77: l2i
    //   78: invokestatic 149	com/a/a/a/c:a	(Ljava/io/InputStream;I)[B
    //   81: astore 6
    //   83: new 226	com/a/a/b$a
    //   86: dup
    //   87: invokespecial 227	com/a/a/b$a:<init>	()V
    //   90: astore_3
    //   91: aload_3
    //   92: aload 6
    //   94: putfield 230	com/a/a/b$a:a	[B
    //   97: aload_3
    //   98: aload 5
    //   100: getfield 233	com/a/a/a/c$a:c	Ljava/lang/String;
    //   103: putfield 235	com/a/a/b$a:b	Ljava/lang/String;
    //   106: aload_3
    //   107: aload 5
    //   109: getfield 237	com/a/a/a/c$a:d	J
    //   112: putfield 239	com/a/a/b$a:c	J
    //   115: aload_3
    //   116: aload 5
    //   118: getfield 241	com/a/a/a/c$a:e	J
    //   121: putfield 242	com/a/a/b$a:d	J
    //   124: aload_3
    //   125: aload 5
    //   127: getfield 245	com/a/a/a/c$a:f	J
    //   130: putfield 246	com/a/a/b$a:e	J
    //   133: aload_3
    //   134: aload 5
    //   136: getfield 249	com/a/a/a/c$a:g	J
    //   139: putfield 250	com/a/a/b$a:f	J
    //   142: aload_3
    //   143: aload 5
    //   145: getfield 253	com/a/a/a/c$a:h	Ljava/util/Map;
    //   148: putfield 255	com/a/a/b$a:g	Ljava/util/Map;
    //   151: aload_2
    //   152: invokevirtual 258	com/a/a/a/c$b:close	()V
    //   155: aload_3
    //   156: astore_1
    //   157: goto -133 -> 24
    //   160: astore_1
    //   161: aconst_null
    //   162: astore_1
    //   163: goto -139 -> 24
    //   166: astore_3
    //   167: aconst_null
    //   168: astore_2
    //   169: ldc_w 260
    //   172: iconst_2
    //   173: anewarray 4	java/lang/Object
    //   176: dup
    //   177: iconst_0
    //   178: aload 4
    //   180: invokevirtual 263	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   183: aastore
    //   184: dup
    //   185: iconst_1
    //   186: aload_3
    //   187: invokevirtual 264	java/io/IOException:toString	()Ljava/lang/String;
    //   190: aastore
    //   191: invokestatic 144	com/a/a/t:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   194: aload_0
    //   195: aload_1
    //   196: invokespecial 266	com/a/a/a/c:b	(Ljava/lang/String;)V
    //   199: aload_2
    //   200: ifnull +7 -> 207
    //   203: aload_2
    //   204: invokevirtual 258	com/a/a/a/c$b:close	()V
    //   207: aconst_null
    //   208: astore_1
    //   209: goto -185 -> 24
    //   212: astore_1
    //   213: aconst_null
    //   214: astore_1
    //   215: goto -191 -> 24
    //   218: astore_1
    //   219: aconst_null
    //   220: astore_2
    //   221: aload_2
    //   222: ifnull +7 -> 229
    //   225: aload_2
    //   226: invokevirtual 258	com/a/a/a/c$b:close	()V
    //   229: aload_1
    //   230: athrow
    //   231: astore_1
    //   232: aload_0
    //   233: monitorexit
    //   234: aload_1
    //   235: athrow
    //   236: astore_1
    //   237: aconst_null
    //   238: astore_1
    //   239: goto -215 -> 24
    //   242: astore_1
    //   243: goto -22 -> 221
    //   246: astore_1
    //   247: goto -26 -> 221
    //   250: astore_3
    //   251: goto -82 -> 169
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	254	0	this	c
    //   0	254	1	paramString	String
    //   59	167	2	localb	b
    //   90	66	3	locala	b.a
    //   166	21	3	localIOException1	IOException
    //   250	1	3	localIOException2	IOException
    //   33	146	4	localFile	File
    //   15	129	5	locala1	a
    //   81	12	6	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   151	155	160	java/io/IOException
    //   35	60	166	java/io/IOException
    //   203	207	212	java/io/IOException
    //   35	60	218	finally
    //   2	17	231	finally
    //   28	35	231	finally
    //   151	155	231	finally
    //   203	207	231	finally
    //   225	229	231	finally
    //   229	231	231	finally
    //   225	229	236	java/io/IOException
    //   60	151	242	finally
    //   169	199	246	finally
    //   60	151	250	java/io/IOException
  }
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 36	com/a/a/a/c:c	Ljava/io/File;
    //   6: invokevirtual 269	java/io/File:exists	()Z
    //   9: ifne +36 -> 45
    //   12: aload_0
    //   13: getfield 36	com/a/a/a/c:c	Ljava/io/File;
    //   16: invokevirtual 272	java/io/File:mkdirs	()Z
    //   19: ifne +23 -> 42
    //   22: ldc_w 274
    //   25: iconst_1
    //   26: anewarray 4	java/lang/Object
    //   29: dup
    //   30: iconst_0
    //   31: aload_0
    //   32: getfield 36	com/a/a/a/c:c	Ljava/io/File;
    //   35: invokevirtual 263	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   38: aastore
    //   39: invokestatic 276	com/a/a/t:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   42: aload_0
    //   43: monitorexit
    //   44: return
    //   45: aload_0
    //   46: getfield 36	com/a/a/a/c:c	Ljava/io/File;
    //   49: invokevirtual 280	java/io/File:listFiles	()[Ljava/io/File;
    //   52: astore 5
    //   54: aload 5
    //   56: ifnull -14 -> 42
    //   59: aload 5
    //   61: arraylength
    //   62: istore_2
    //   63: iconst_0
    //   64: istore_1
    //   65: iload_1
    //   66: iload_2
    //   67: if_icmpge -25 -> 42
    //   70: aload 5
    //   72: iload_1
    //   73: aaload
    //   74: astore 6
    //   76: aconst_null
    //   77: astore_3
    //   78: new 206	java/io/BufferedInputStream
    //   81: dup
    //   82: new 208	java/io/FileInputStream
    //   85: dup
    //   86: aload 6
    //   88: invokespecial 209	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   91: invokespecial 212	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   94: astore 4
    //   96: aload 4
    //   98: astore_3
    //   99: aload 4
    //   101: invokestatic 218	com/a/a/a/c$a:a	(Ljava/io/InputStream;)Lcom/a/a/a/c$a;
    //   104: astore 7
    //   106: aload 4
    //   108: astore_3
    //   109: aload 7
    //   111: aload 6
    //   113: invokevirtual 221	java/io/File:length	()J
    //   116: putfield 78	com/a/a/a/c$a:a	J
    //   119: aload 4
    //   121: astore_3
    //   122: aload_0
    //   123: aload 7
    //   125: getfield 281	com/a/a/a/c$a:b	Ljava/lang/String;
    //   128: aload 7
    //   130: invokespecial 283	com/a/a/a/c:a	(Ljava/lang/String;Lcom/a/a/a/c$a;)V
    //   133: aload 4
    //   135: invokevirtual 284	java/io/BufferedInputStream:close	()V
    //   138: iload_1
    //   139: iconst_1
    //   140: iadd
    //   141: istore_1
    //   142: goto -77 -> 65
    //   145: astore_3
    //   146: aconst_null
    //   147: astore 4
    //   149: aload 6
    //   151: ifnull +12 -> 163
    //   154: aload 4
    //   156: astore_3
    //   157: aload 6
    //   159: invokevirtual 131	java/io/File:delete	()Z
    //   162: pop
    //   163: aload 4
    //   165: ifnull -27 -> 138
    //   168: aload 4
    //   170: invokevirtual 284	java/io/BufferedInputStream:close	()V
    //   173: goto -35 -> 138
    //   176: astore_3
    //   177: goto -39 -> 138
    //   180: astore 5
    //   182: aload_3
    //   183: astore 4
    //   185: aload 5
    //   187: astore_3
    //   188: aload 4
    //   190: ifnull +8 -> 198
    //   193: aload 4
    //   195: invokevirtual 284	java/io/BufferedInputStream:close	()V
    //   198: aload_3
    //   199: athrow
    //   200: astore_3
    //   201: aload_0
    //   202: monitorexit
    //   203: aload_3
    //   204: athrow
    //   205: astore_3
    //   206: goto -68 -> 138
    //   209: astore 4
    //   211: goto -13 -> 198
    //   214: astore 5
    //   216: aload_3
    //   217: astore 4
    //   219: aload 5
    //   221: astore_3
    //   222: goto -34 -> 188
    //   225: astore_3
    //   226: goto -77 -> 149
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	229	0	this	c
    //   64	78	1	i	int
    //   62	6	2	j	int
    //   77	45	3	localObject1	Object
    //   145	1	3	localIOException1	IOException
    //   156	1	3	localObject2	Object
    //   176	7	3	localIOException2	IOException
    //   187	12	3	localObject3	Object
    //   200	4	3	localObject4	Object
    //   205	12	3	localIOException3	IOException
    //   221	1	3	localObject5	Object
    //   225	1	3	localIOException4	IOException
    //   94	100	4	localObject6	Object
    //   209	1	4	localIOException5	IOException
    //   217	1	4	localIOException6	IOException
    //   52	19	5	arrayOfFile	File[]
    //   180	6	5	localObject7	Object
    //   214	6	5	localObject8	Object
    //   74	84	6	localFile	File
    //   104	25	7	locala	a
    // Exception table:
    //   from	to	target	type
    //   78	96	145	java/io/IOException
    //   168	173	176	java/io/IOException
    //   78	96	180	finally
    //   2	42	200	finally
    //   45	54	200	finally
    //   59	63	200	finally
    //   133	138	200	finally
    //   168	173	200	finally
    //   193	198	200	finally
    //   198	200	200	finally
    //   133	138	205	java/io/IOException
    //   193	198	209	java/io/IOException
    //   99	106	214	finally
    //   109	119	214	finally
    //   122	133	214	finally
    //   157	163	214	finally
    //   99	106	225	java/io/IOException
    //   109	119	225	java/io/IOException
    //   122	133	225	java/io/IOException
  }
  
  public final void a(String paramString, b.a parama)
  {
    int i = 0;
    label354:
    label378:
    label381:
    for (;;)
    {
      Object localObject2;
      a locala;
      try
      {
        int j = a.length;
        if (b + j >= d)
        {
          if (t.b) {
            t.a("Pruning old cache entries.", new Object[0]);
          }
          long l1 = b;
          long l2 = SystemClock.elapsedRealtime();
          localObject1 = a.entrySet().iterator();
          if (!((Iterator)localObject1).hasNext()) {
            break label381;
          }
          localObject2 = (a)((Map.Entry)((Iterator)localObject1).next()).getValue();
          if (!d(b).delete()) {
            continue;
          }
          b -= a;
          ((Iterator)localObject1).remove();
          i += 1;
          if ((float)(b + j) >= d * 0.9F) {
            break label378;
          }
          if (t.b) {
            t.a("pruned %d files, %d bytes, %d ms", new Object[] { Integer.valueOf(i), Long.valueOf(b - l1), Long.valueOf(SystemClock.elapsedRealtime() - l2) });
          }
        }
        Object localObject1 = d(paramString);
        try
        {
          localObject2 = new BufferedOutputStream(new FileOutputStream((File)localObject1));
          locala = new a(paramString, parama);
          if (locala.a((OutputStream)localObject2)) {
            break label354;
          }
          ((BufferedOutputStream)localObject2).close();
          t.b("Failed to write header for %s", new Object[] { ((File)localObject1).getAbsolutePath() });
          throw new IOException();
        }
        catch (IOException paramString)
        {
          if (!((File)localObject1).delete()) {
            t.b("Could not clean up file %s", new Object[] { ((File)localObject1).getAbsolutePath() });
          }
        }
        return;
        t.b("Could not delete cache entry for key=%s, filename=%s", new Object[] { b, c(b) });
        continue;
        ((BufferedOutputStream)localObject2).write(a);
      }
      finally {}
      ((BufferedOutputStream)localObject2).close();
      a(paramString, locala);
      continue;
    }
  }
  
  static final class a
  {
    public long a;
    public String b;
    public String c;
    public long d;
    public long e;
    public long f;
    public long g;
    public Map<String, String> h;
    
    private a() {}
    
    public a(String paramString, b.a parama)
    {
      b = paramString;
      a = a.length;
      c = b;
      d = c;
      e = d;
      f = e;
      g = f;
      h = g;
    }
    
    public static a a(InputStream paramInputStream)
    {
      a locala = new a();
      if (c.a(paramInputStream) != 538247942) {
        throw new IOException();
      }
      b = c.c(paramInputStream);
      c = c.c(paramInputStream);
      if (c.equals("")) {
        c = null;
      }
      d = c.b(paramInputStream);
      e = c.b(paramInputStream);
      f = c.b(paramInputStream);
      g = c.b(paramInputStream);
      h = c.d(paramInputStream);
      return locala;
    }
    
    public final boolean a(OutputStream paramOutputStream)
    {
      for (;;)
      {
        try
        {
          c.a(paramOutputStream, 538247942);
          c.a(paramOutputStream, b);
          if (c == null)
          {
            localObject = "";
            c.a(paramOutputStream, (String)localObject);
            c.a(paramOutputStream, d);
            c.a(paramOutputStream, e);
            c.a(paramOutputStream, f);
            c.a(paramOutputStream, g);
            localObject = h;
            if (localObject == null) {
              break;
            }
            c.a(paramOutputStream, ((Map)localObject).size());
            localObject = ((Map)localObject).entrySet().iterator();
            if (!((Iterator)localObject).hasNext()) {
              break label172;
            }
            Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
            c.a(paramOutputStream, (String)localEntry.getKey());
            c.a(paramOutputStream, (String)localEntry.getValue());
            continue;
          }
          Object localObject = c;
        }
        catch (IOException paramOutputStream)
        {
          t.b("%s", new Object[] { paramOutputStream.toString() });
          return false;
        }
      }
      c.a(paramOutputStream, 0);
      label172:
      paramOutputStream.flush();
      return true;
    }
  }
  
  private static final class b
    extends FilterInputStream
  {
    private int a = 0;
    
    private b(InputStream paramInputStream)
    {
      super();
    }
    
    public final int read()
    {
      int i = super.read();
      if (i != -1) {
        a += 1;
      }
      return i;
    }
    
    public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      paramInt1 = super.read(paramArrayOfByte, paramInt1, paramInt2);
      if (paramInt1 != -1) {
        a += paramInt1;
      }
      return paramInt1;
    }
  }
}


/* Location:              com/a/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */