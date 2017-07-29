package org.a.e;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.a.b.c;

public final class b
{
  private static final ConcurrentLinkedQueue<MessageDigest> a = new ConcurrentLinkedQueue();
  private static final ConcurrentLinkedQueue<SecureRandom> b = new ConcurrentLinkedQueue();
  
  public static <T extends Enum<T>> T a(Class<T> paramClass, String paramString)
  {
    if ((paramString == null) || (paramString.isEmpty())) {
      return null;
    }
    return Enum.valueOf(paramClass, paramString);
  }
  
  public static BigInteger a(String paramString)
  {
    return new BigInteger(a.a(paramString));
  }
  
  public static byte[] a(int paramInt)
  {
    return new byte[] { (byte)(paramInt >> 24), (byte)(paramInt >> 16), (byte)(paramInt >> 8), (byte)paramInt };
  }
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    int i = 0;
    while ((i < paramArrayOfByte.length) && (paramArrayOfByte[i] == 0)) {
      i += 1;
    }
    if (i == 0) {
      return paramArrayOfByte;
    }
    byte[] arrayOfByte = new byte[paramArrayOfByte.length - i];
    System.arraycopy(paramArrayOfByte, i, arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }
  
  public static byte[] a(byte[]... paramVarArgs)
  {
    Object localObject2 = (MessageDigest)a.poll();
    Object localObject1 = localObject2;
    if (localObject2 == null) {}
    try
    {
      localObject1 = MessageDigest.getInstance("SHA-1");
      int j = paramVarArgs.length;
      int i = 0;
      while (i < j)
      {
        localObject2 = paramVarArgs[i];
        ((MessageDigest)localObject1).update(a(localObject2.length));
        ((MessageDigest)localObject1).update((byte[])localObject2);
        i += 1;
      }
      paramVarArgs = ((MessageDigest)localObject1).digest();
    }
    catch (NoSuchAlgorithmException paramVarArgs)
    {
      throw new c(paramVarArgs);
    }
    a.add(localObject1);
    return paramVarArgs;
  }
  
  public static void b(byte[] paramArrayOfByte)
  {
    SecureRandom localSecureRandom2 = (SecureRandom)b.poll();
    SecureRandom localSecureRandom1 = localSecureRandom2;
    if (localSecureRandom2 == null) {
      localSecureRandom1 = new SecureRandom();
    }
    localSecureRandom1.nextBytes(paramArrayOfByte);
    b.add(localSecureRandom1);
  }
  
  public static byte[] b(byte[]... paramVarArgs)
  {
    MessageDigest localMessageDigest2 = (MessageDigest)a.poll();
    MessageDigest localMessageDigest1 = localMessageDigest2;
    if (localMessageDigest2 == null) {}
    try
    {
      localMessageDigest1 = MessageDigest.getInstance("SHA-1");
      int j = paramVarArgs.length;
      int i = 0;
      while (i < j)
      {
        localMessageDigest1.update(paramVarArgs[i]);
        i += 1;
      }
      paramVarArgs = localMessageDigest1.digest();
    }
    catch (NoSuchAlgorithmException paramVarArgs)
    {
      throw new c(paramVarArgs);
    }
    a.add(localMessageDigest1);
    return paramVarArgs;
  }
  
  public static int c(byte[] paramArrayOfByte)
  {
    return (paramArrayOfByte[0] & 0xFF) << 24 | 0x0 | (paramArrayOfByte[1] & 0xFF) << 16 | (paramArrayOfByte[2] & 0xFF) << 8 | paramArrayOfByte[3] & 0xFF;
  }
}


/* Location:              org/a/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */