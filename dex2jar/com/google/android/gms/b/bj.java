package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class bj
{
  static boolean a = false;
  static CountDownLatch b = new CountDownLatch(1);
  private static MessageDigest c = null;
  private static final Object d = new Object();
  private static final Object e = new Object();
  
  static String a(bf.a parama, String paramString, boolean paramBoolean)
  {
    parama = gb.a(parama);
    if (paramBoolean) {
      parama = a(parama, paramString, true);
    }
    for (;;)
    {
      return bh.a(parama, true);
      Object localObject = b(parama);
      if ((localObject == null) || (((Vector)localObject).size() == 0))
      {
        parama = a(gb.a(c()), paramString, true);
      }
      else
      {
        bf.f localf = new bf.f();
        a = new byte[((Vector)localObject).size()][];
        localObject = ((Vector)localObject).iterator();
        int i = 0;
        while (((Iterator)localObject).hasNext())
        {
          byte[] arrayOfByte = a((byte[])((Iterator)localObject).next(), paramString, false);
          a[i] = arrayOfByte;
          i += 1;
        }
        b = a(parama);
        parama = gb.a(localf);
      }
    }
  }
  
  static String a(String paramString1, String paramString2)
  {
    jz localjz = ke.bJ;
    ((Boolean)w.q().a(localjz)).booleanValue();
    paramString1 = b(paramString1, paramString2);
    if (paramString1 != null) {
      return bh.a(paramString1, true);
    }
    return Integer.toString(7);
  }
  
  static void a()
  {
    synchronized (e)
    {
      if (!a)
      {
        a = true;
        new Thread(new a((byte)0)).start();
      }
      return;
    }
  }
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    MessageDigest localMessageDigest;
    synchronized (d)
    {
      localMessageDigest = b();
      if (localMessageDigest == null) {
        throw new NoSuchAlgorithmException("Cannot compute hash");
      }
    }
    localMessageDigest.reset();
    localMessageDigest.update(paramArrayOfByte);
    paramArrayOfByte = c.digest();
    return paramArrayOfByte;
  }
  
  private static byte[] a(byte[] paramArrayOfByte, String paramString, boolean paramBoolean)
  {
    int i;
    byte[] arrayOfByte1;
    if (paramBoolean)
    {
      i = 239;
      arrayOfByte1 = paramArrayOfByte;
      if (paramArrayOfByte.length > i) {
        arrayOfByte1 = gb.a(c());
      }
      if (arrayOfByte1.length >= i) {
        break label189;
      }
      paramArrayOfByte = new byte[i - arrayOfByte1.length];
      new SecureRandom().nextBytes(paramArrayOfByte);
    }
    label189:
    for (paramArrayOfByte = ByteBuffer.allocate(i + 1).put((byte)arrayOfByte1.length).put(arrayOfByte1).put(paramArrayOfByte).array();; paramArrayOfByte = ByteBuffer.allocate(i + 1).put((byte)arrayOfByte1.length).put(arrayOfByte1).array())
    {
      arrayOfByte1 = paramArrayOfByte;
      if (paramBoolean)
      {
        arrayOfByte1 = a(paramArrayOfByte);
        arrayOfByte1 = ByteBuffer.allocate(256).put(arrayOfByte1).put(paramArrayOfByte).array();
      }
      byte[] arrayOfByte2 = new byte['Ā'];
      new bk().a(arrayOfByte1, arrayOfByte2);
      if ((paramString != null) && (paramString.length() > 0))
      {
        paramArrayOfByte = paramString;
        if (paramString.length() > 32) {
          paramArrayOfByte = paramString.substring(0, 32);
        }
        new fr(paramArrayOfByte.getBytes("UTF-8")).a(arrayOfByte2);
      }
      return arrayOfByte2;
      i = 255;
      break;
    }
  }
  
  private static MessageDigest b()
  {
    a();
    int i = 0;
    try
    {
      boolean bool = b.await(2L, TimeUnit.SECONDS);
      i = bool;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
    if (i == 0) {}
    while (c == null) {
      return null;
    }
    return c;
  }
  
  private static Vector<byte[]> b(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0)) {
      return null;
    }
    int k = (paramArrayOfByte.length + 255 - 1) / 255;
    Vector localVector = new Vector();
    int i = 0;
    for (;;)
    {
      int m;
      if (i < k) {
        m = i * 255;
      }
      try
      {
        if (paramArrayOfByte.length - m > 255) {}
        for (int j = m + 255;; j = paramArrayOfByte.length)
        {
          localVector.add(Arrays.copyOfRange(paramArrayOfByte, m, j));
          i += 1;
          break;
        }
        return localVector;
      }
      catch (IndexOutOfBoundsException paramArrayOfByte) {}
    }
    return null;
  }
  
  /* Error */
  private static byte[] b(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: new 240	com/google/android/gms/b/bf$c
    //   3: dup
    //   4: invokespecial 241	com/google/android/gms/b/bf$c:<init>	()V
    //   7: astore_2
    //   8: aload_0
    //   9: invokevirtual 189	java/lang/String:length	()I
    //   12: iconst_3
    //   13: if_icmpge +40 -> 53
    //   16: aload_0
    //   17: ldc -13
    //   19: invokevirtual 201	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   22: astore_0
    //   23: aload_2
    //   24: aload_0
    //   25: putfield 245	com/google/android/gms/b/bf$c:a	[B
    //   28: aload_1
    //   29: invokevirtual 189	java/lang/String:length	()I
    //   32: iconst_3
    //   33: if_icmpge +29 -> 62
    //   36: aload_1
    //   37: ldc -13
    //   39: invokevirtual 201	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   42: astore_0
    //   43: aload_2
    //   44: aload_0
    //   45: putfield 246	com/google/android/gms/b/bf$c:b	[B
    //   48: aload_2
    //   49: invokestatic 42	com/google/android/gms/b/gb:a	(Lcom/google/android/gms/b/gb;)[B
    //   52: areturn
    //   53: aload_0
    //   54: iconst_1
    //   55: invokestatic 249	com/google/android/gms/b/bh:a	(Ljava/lang/String;Z)[B
    //   58: astore_0
    //   59: goto -36 -> 23
    //   62: aload_1
    //   63: iconst_1
    //   64: invokestatic 249	com/google/android/gms/b/bh:a	(Ljava/lang/String;Z)[B
    //   67: astore_0
    //   68: goto -25 -> 43
    //   71: astore_0
    //   72: aconst_null
    //   73: areturn
    //   74: astore_0
    //   75: goto -3 -> 72
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	paramString1	String
    //   0	78	1	paramString2	String
    //   7	42	2	localc	bf.c
    // Exception table:
    //   from	to	target	type
    //   8	23	71	java/security/NoSuchAlgorithmException
    //   23	43	71	java/security/NoSuchAlgorithmException
    //   43	53	71	java/security/NoSuchAlgorithmException
    //   53	59	71	java/security/NoSuchAlgorithmException
    //   62	68	71	java/security/NoSuchAlgorithmException
    //   8	23	74	java/io/UnsupportedEncodingException
    //   23	43	74	java/io/UnsupportedEncodingException
    //   43	53	74	java/io/UnsupportedEncodingException
    //   53	59	74	java/io/UnsupportedEncodingException
    //   62	68	74	java/io/UnsupportedEncodingException
  }
  
  private static bf.a c()
  {
    bf.a locala = new bf.a();
    t = Long.valueOf(4096L);
    return locala;
  }
  
  private static final class a
    implements Runnable
  {
    public final void run()
    {
      try
      {
        bj.a(MessageDigest.getInstance("MD5"));
        bj.b.countDown();
        return;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        localNoSuchAlgorithmException = localNoSuchAlgorithmException;
        bj.b.countDown();
        return;
      }
      finally
      {
        localObject = finally;
        bj.b.countDown();
        throw ((Throwable)localObject);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */