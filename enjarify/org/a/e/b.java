package org.a.e;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.a.b.c;

public final class b
{
  private static final ConcurrentLinkedQueue a;
  private static final ConcurrentLinkedQueue b;
  
  static
  {
    ConcurrentLinkedQueue localConcurrentLinkedQueue = new java/util/concurrent/ConcurrentLinkedQueue;
    localConcurrentLinkedQueue.<init>();
    a = localConcurrentLinkedQueue;
    localConcurrentLinkedQueue = new java/util/concurrent/ConcurrentLinkedQueue;
    localConcurrentLinkedQueue.<init>();
    b = localConcurrentLinkedQueue;
  }
  
  public static Enum a(Class paramClass, String paramString)
  {
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.isEmpty();
      if (!bool) {}
    }
    else
    {
      bool = false;
    }
    for (Enum localEnum = null;; localEnum = Enum.valueOf(paramClass, paramString)) {
      return localEnum;
    }
  }
  
  public static BigInteger a(String paramString)
  {
    BigInteger localBigInteger = new java/math/BigInteger;
    byte[] arrayOfByte = a.a(paramString);
    localBigInteger.<init>(arrayOfByte);
    return localBigInteger;
  }
  
  public static byte[] a(int paramInt)
  {
    byte[] arrayOfByte = new byte[4];
    int i = (byte)(paramInt >> 24);
    arrayOfByte[0] = i;
    i = (byte)(paramInt >> 16);
    arrayOfByte[1] = i;
    i = (byte)(paramInt >> 8);
    arrayOfByte[2] = i;
    i = (byte)paramInt;
    arrayOfByte[3] = i;
    return arrayOfByte;
  }
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    int i = 0;
    int j;
    for (;;)
    {
      j = paramArrayOfByte.length;
      if (i >= j) {
        break;
      }
      j = paramArrayOfByte[i];
      if (j != 0) {
        break;
      }
      i += 1;
    }
    if (i == 0) {}
    for (;;)
    {
      return paramArrayOfByte;
      j = paramArrayOfByte.length - i;
      byte[] arrayOfByte = new byte[j];
      int k = arrayOfByte.length;
      System.arraycopy(paramArrayOfByte, i, arrayOfByte, 0, k);
      paramArrayOfByte = arrayOfByte;
    }
  }
  
  public static byte[] a(byte[]... paramVarArgs)
  {
    Object localObject1 = (MessageDigest)a.poll();
    if (localObject1 == null) {
      localObject1 = "SHA-1";
    }
    Object localObject2;
    try
    {
      localObject1 = MessageDigest.getInstance((String)localObject1);
      int i = paramVarArgs.length;
      int j = 0;
      localObject2 = null;
      while (j < i)
      {
        byte[] arrayOfByte1 = paramVarArgs[j];
        int k = arrayOfByte1.length;
        byte[] arrayOfByte2 = a(k);
        ((MessageDigest)localObject1).update(arrayOfByte2);
        ((MessageDigest)localObject1).update(arrayOfByte1);
        j += 1;
      }
      localObject2 = localNoSuchAlgorithmException.digest();
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      localObject2 = new org/a/b/c;
      ((c)localObject2).<init>(localNoSuchAlgorithmException);
      throw ((Throwable)localObject2);
    }
    a.add(localNoSuchAlgorithmException);
    return (byte[])localObject2;
  }
  
  public static void b(byte[] paramArrayOfByte)
  {
    SecureRandom localSecureRandom = (SecureRandom)b.poll();
    if (localSecureRandom == null)
    {
      localSecureRandom = new java/security/SecureRandom;
      localSecureRandom.<init>();
    }
    localSecureRandom.nextBytes(paramArrayOfByte);
    b.add(localSecureRandom);
  }
  
  public static byte[] b(byte[]... paramVarArgs)
  {
    Object localObject1 = (MessageDigest)a.poll();
    if (localObject1 == null) {
      localObject1 = "SHA-1";
    }
    Object localObject2;
    try
    {
      localObject1 = MessageDigest.getInstance((String)localObject1);
      int i = paramVarArgs.length;
      int j = 0;
      localObject2 = null;
      while (j < i)
      {
        byte[] arrayOfByte = paramVarArgs[j];
        ((MessageDigest)localObject1).update(arrayOfByte);
        j += 1;
      }
      localObject2 = localNoSuchAlgorithmException.digest();
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      localObject2 = new org/a/b/c;
      ((c)localObject2).<init>(localNoSuchAlgorithmException);
      throw ((Throwable)localObject2);
    }
    a.add(localNoSuchAlgorithmException);
    return (byte[])localObject2;
  }
  
  public static int c(byte[] paramArrayOfByte)
  {
    int i = (paramArrayOfByte[0] & 0xFF) << 24 | 0x0;
    int j = (paramArrayOfByte[1] & 0xFF) << 16;
    i |= j;
    j = (paramArrayOfByte[2] & 0xFF) << 8;
    i |= j;
    j = paramArrayOfByte[3] & 0xFF;
    return i | j;
  }
}


/* Location:              org/a/e/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */