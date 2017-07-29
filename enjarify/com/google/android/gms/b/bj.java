package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;
import java.io.UnsupportedEncodingException;
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
  static CountDownLatch b;
  private static MessageDigest c = null;
  private static final Object d;
  private static final Object e;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    d = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    e = localObject;
    localObject = new java/util/concurrent/CountDownLatch;
    ((CountDownLatch)localObject).<init>(1);
    b = (CountDownLatch)localObject;
  }
  
  static String a(bf.a parama, String paramString, boolean paramBoolean)
  {
    boolean bool1 = true;
    byte[] arrayOfByte1 = gb.a(parama);
    Object localObject;
    if (paramBoolean) {
      localObject = a(arrayOfByte1, paramString, bool1);
    }
    for (;;)
    {
      return bh.a((byte[])localObject, bool1);
      localObject = b(arrayOfByte1);
      if (localObject != null)
      {
        i = ((Vector)localObject).size();
        if (i != 0) {}
      }
      else
      {
        localObject = a(gb.a(c()), paramString, bool1);
        continue;
      }
      bf.f localf = new com/google/android/gms/b/bf$f;
      localf.<init>();
      byte[][] arrayOfByte2 = new byte[((Vector)localObject).size()][];
      a = arrayOfByte2;
      Iterator localIterator = ((Vector)localObject).iterator();
      int i = 0;
      arrayOfByte2 = null;
      for (;;)
      {
        boolean bool2 = localIterator.hasNext();
        if (!bool2) {
          break;
        }
        localObject = (byte[])localIterator.next();
        byte[] arrayOfByte3 = a((byte[])localObject, paramString, false);
        byte[][] arrayOfByte4 = a;
        int j = i + 1;
        arrayOfByte4[i] = arrayOfByte3;
        i = j;
      }
      localObject = a(arrayOfByte1);
      b = ((byte[])localObject);
      localObject = gb.a(localf);
    }
  }
  
  static String a(String paramString1, String paramString2)
  {
    Object localObject = ke.bJ;
    kd localkd = w.q();
    ((Boolean)localkd.a((jz)localObject)).booleanValue();
    localObject = b(paramString1, paramString2);
    boolean bool;
    if (localObject != null) {
      bool = true;
    }
    int i;
    for (localObject = bh.a((byte[])localObject, bool);; localObject = Integer.toString(i))
    {
      return (String)localObject;
      i = 7;
    }
  }
  
  static void a()
  {
    synchronized (e)
    {
      boolean bool = a;
      if (!bool)
      {
        bool = true;
        a = bool;
        Thread localThread = new java/lang/Thread;
        bj.a locala = new com/google/android/gms/b/bj$a;
        locala.<init>((byte)0);
        localThread.<init>(locala);
        localThread.start();
      }
      return;
    }
  }
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    synchronized (d)
    {
      Object localObject2 = b();
      if (localObject2 == null)
      {
        localObject2 = new java/security/NoSuchAlgorithmException;
        String str = "Cannot compute hash";
        ((NoSuchAlgorithmException)localObject2).<init>(str);
        throw ((Throwable)localObject2);
      }
    }
    ((MessageDigest)localObject3).reset();
    ((MessageDigest)localObject3).update(paramArrayOfByte);
    Object localObject4 = c;
    localObject4 = ((MessageDigest)localObject4).digest();
    return (byte[])localObject4;
  }
  
  private static byte[] a(byte[] paramArrayOfByte, String paramString, boolean paramBoolean)
  {
    int i = 256;
    int j = 32;
    int k;
    int m;
    Object localObject1;
    Object localObject2;
    byte b1;
    if (paramBoolean)
    {
      k = 239;
      m = paramArrayOfByte.length;
      if (m > k)
      {
        localObject1 = c();
        paramArrayOfByte = gb.a((gb)localObject1);
      }
      m = paramArrayOfByte.length;
      if (m >= k) {
        break label265;
      }
      m = paramArrayOfByte.length;
      m = k - m;
      localObject1 = new byte[m];
      localObject2 = new java/security/SecureRandom;
      ((SecureRandom)localObject2).<init>();
      ((SecureRandom)localObject2).nextBytes((byte[])localObject1);
      k += 1;
      localObject3 = ByteBuffer.allocate(k);
      b1 = (byte)paramArrayOfByte.length;
    }
    for (Object localObject3 = ((ByteBuffer)localObject3).put(b1).put(paramArrayOfByte).put((byte[])localObject1).array();; localObject3 = ((ByteBuffer)localObject3).put(m).put(paramArrayOfByte).array())
    {
      if (paramBoolean)
      {
        localObject1 = a((byte[])localObject3);
        localObject2 = ByteBuffer.allocate(i);
        localObject1 = ((ByteBuffer)localObject2).put((byte[])localObject1);
        localObject3 = ((ByteBuffer)localObject1).put((byte[])localObject3).array();
      }
      localObject1 = new byte[i];
      localObject2 = new com/google/android/gms/b/bk;
      ((bk)localObject2).<init>();
      ((bk)localObject2).a((byte[])localObject3, (byte[])localObject1);
      if (paramString != null)
      {
        k = paramString.length();
        if (k > 0)
        {
          k = paramString.length();
          if (k > j)
          {
            k = 0;
            localObject3 = null;
            paramString = paramString.substring(0, j);
          }
          localObject3 = paramString.getBytes("UTF-8");
          localObject2 = new com/google/android/gms/b/fr;
          ((fr)localObject2).<init>((byte[])localObject3);
          ((fr)localObject2).a((byte[])localObject1);
        }
      }
      return (byte[])localObject1;
      k = 255;
      break;
      label265:
      k += 1;
      localObject3 = ByteBuffer.allocate(k);
      m = (byte)paramArrayOfByte.length;
    }
  }
  
  private static MessageDigest b()
  {
    MessageDigest localMessageDigest1 = null;
    a();
    boolean bool = false;
    MessageDigest localMessageDigest2 = null;
    try
    {
      CountDownLatch localCountDownLatch = b;
      long l = 2;
      TimeUnit localTimeUnit = TimeUnit.SECONDS;
      bool = localCountDownLatch.await(l, localTimeUnit);
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
    if (!bool) {}
    for (;;)
    {
      return localMessageDigest1;
      localMessageDigest2 = c;
      if (localMessageDigest2 != null) {
        localMessageDigest1 = c;
      }
    }
  }
  
  private static Vector b(byte[] paramArrayOfByte)
  {
    Object localObject = null;
    int i;
    if (paramArrayOfByte != null)
    {
      i = paramArrayOfByte.length;
      if (i > 0) {
        break label15;
      }
    }
    for (;;)
    {
      return (Vector)localObject;
      label15:
      i = paramArrayOfByte.length + 255 + -1;
      int j = i / 255;
      Vector localVector = new java/util/Vector;
      localVector.<init>();
      int k = 0;
      byte[] arrayOfByte = null;
      int m = 0;
      int n;
      if (m < j) {
        n = m * 255;
      }
      try
      {
        k = paramArrayOfByte.length - n;
        int i1 = 255;
        if (k > i1) {}
        for (k = n + 255;; k = paramArrayOfByte.length)
        {
          arrayOfByte = Arrays.copyOfRange(paramArrayOfByte, n, k);
          localVector.add(arrayOfByte);
          k = m + 1;
          m = k;
          break;
        }
        localObject = localVector;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException) {}
    }
  }
  
  private static byte[] b(String paramString1, String paramString2)
  {
    int i = 3;
    bf.c localc = new com/google/android/gms/b/bf$c;
    localc.<init>();
    for (;;)
    {
      try
      {
        j = paramString1.length();
        if (j >= i) {
          continue;
        }
        localObject1 = "ISO-8859-1";
        localObject1 = paramString1.getBytes((String)localObject1);
        a = ((byte[])localObject1);
        j = paramString2.length();
        if (j >= i) {
          continue;
        }
        localObject1 = "ISO-8859-1";
        localObject1 = paramString2.getBytes((String)localObject1);
        b = ((byte[])localObject1);
        localObject1 = gb.a(localc);
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        int j;
        Object localObject1;
        boolean bool = false;
        Object localObject2 = null;
        continue;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        continue;
      }
      return (byte[])localObject1;
      j = 1;
      localObject1 = bh.a(paramString1, j);
      continue;
      bool = true;
      localObject1 = bh.a(paramString2, bool);
    }
  }
  
  private static bf.a c()
  {
    bf.a locala = new com/google/android/gms/b/bf$a;
    locala.<init>();
    Long localLong = Long.valueOf(4096L);
    t = localLong;
    return locala;
  }
}


/* Location:              com/google/android/gms/b/bj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */