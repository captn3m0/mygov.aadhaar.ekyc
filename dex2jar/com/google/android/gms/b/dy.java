package com.google.android.gms.b;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class dy
{
  private static Cipher b = null;
  private static final Object c = new Object();
  private static final Object d = new Object();
  private final SecureRandom a = null;
  
  private static Cipher a()
  {
    synchronized (d)
    {
      if (b == null) {
        b = Cipher.getInstance("AES/CBC/PKCS5Padding");
      }
      Cipher localCipher = b;
      return localCipher;
    }
  }
  
  public static byte[] a(String paramString)
  {
    int i = 0;
    try
    {
      paramString = bh.a(paramString, false);
      if (paramString.length != 32) {
        throw new a();
      }
    }
    catch (IllegalArgumentException paramString)
    {
      throw new a();
    }
    paramString = ByteBuffer.wrap(paramString, 4, 16);
    byte[] arrayOfByte = new byte[16];
    paramString.get(arrayOfByte);
    while (i < 16)
    {
      arrayOfByte[i] = ((byte)(arrayOfByte[i] ^ 0x44));
      i += 1;
    }
    return arrayOfByte;
  }
  
  public static byte[] a(byte[] arg0, String paramString)
  {
    if (???.length != 16) {
      throw new a();
    }
    try
    {
      arrayOfByte = bh.a(paramString, false);
      if (arrayOfByte.length <= 16) {
        throw new a();
      }
    }
    catch (NoSuchAlgorithmException ???)
    {
      throw new a();
      Object localObject = ByteBuffer.allocate(arrayOfByte.length);
      ((ByteBuffer)localObject).put(arrayOfByte);
      ((ByteBuffer)localObject).flip();
      paramString = new byte[16];
      byte[] arrayOfByte = new byte[arrayOfByte.length - 16];
      ((ByteBuffer)localObject).get(paramString);
      ((ByteBuffer)localObject).get(arrayOfByte);
      localObject = new SecretKeySpec(???, "AES");
      synchronized (c)
      {
        a().init(2, (Key)localObject, new IvParameterSpec(paramString));
        paramString = a().doFinal(arrayOfByte);
        return paramString;
      }
    }
    catch (InvalidKeyException ???)
    {
      throw new a();
    }
    catch (IllegalBlockSizeException ???)
    {
      throw new a();
    }
    catch (NoSuchPaddingException ???)
    {
      throw new a();
    }
    catch (BadPaddingException ???)
    {
      throw new a();
    }
    catch (InvalidAlgorithmParameterException ???)
    {
      throw new a();
    }
    catch (IllegalArgumentException ???)
    {
      throw new a();
    }
  }
  
  /* Error */
  public final String a(byte[] arg1, byte[] paramArrayOfByte2)
  {
    // Byte code:
    //   0: aload_1
    //   1: arraylength
    //   2: bipush 16
    //   4: if_icmpeq +11 -> 15
    //   7: new 6	com/google/android/gms/b/dy$a
    //   10: dup
    //   11: invokespecial 45	com/google/android/gms/b/dy$a:<init>	()V
    //   14: athrow
    //   15: new 84	javax/crypto/spec/SecretKeySpec
    //   18: dup
    //   19: aload_1
    //   20: ldc 86
    //   22: invokespecial 89	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   25: astore 4
    //   27: getstatic 22	com/google/android/gms/b/dy:c	Ljava/lang/Object;
    //   30: astore_1
    //   31: aload_1
    //   32: monitorenter
    //   33: invokestatic 91	com/google/android/gms/b/dy:a	()Ljavax/crypto/Cipher;
    //   36: iconst_1
    //   37: aload 4
    //   39: aload_0
    //   40: getfield 27	com/google/android/gms/b/dy:a	Ljava/security/SecureRandom;
    //   43: invokevirtual 108	javax/crypto/Cipher:init	(ILjava/security/Key;Ljava/security/SecureRandom;)V
    //   46: invokestatic 91	com/google/android/gms/b/dy:a	()Ljavax/crypto/Cipher;
    //   49: aload_2
    //   50: invokevirtual 104	javax/crypto/Cipher:doFinal	([B)[B
    //   53: astore_2
    //   54: invokestatic 91	com/google/android/gms/b/dy:a	()Ljavax/crypto/Cipher;
    //   57: invokevirtual 112	javax/crypto/Cipher:getIV	()[B
    //   60: astore 4
    //   62: aload_1
    //   63: monitorexit
    //   64: aload_2
    //   65: arraylength
    //   66: aload 4
    //   68: arraylength
    //   69: iadd
    //   70: istore_3
    //   71: iload_3
    //   72: invokestatic 75	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   75: astore_1
    //   76: aload_1
    //   77: aload 4
    //   79: invokevirtual 78	java/nio/ByteBuffer:put	([B)Ljava/nio/ByteBuffer;
    //   82: aload_2
    //   83: invokevirtual 78	java/nio/ByteBuffer:put	([B)Ljava/nio/ByteBuffer;
    //   86: pop
    //   87: aload_1
    //   88: invokevirtual 82	java/nio/ByteBuffer:flip	()Ljava/nio/Buffer;
    //   91: pop
    //   92: iload_3
    //   93: newarray <illegal type>
    //   95: astore_2
    //   96: aload_1
    //   97: aload_2
    //   98: invokevirtual 58	java/nio/ByteBuffer:get	([B)Ljava/nio/ByteBuffer;
    //   101: pop
    //   102: aload_2
    //   103: iconst_0
    //   104: invokestatic 115	com/google/android/gms/b/bh:a	([BZ)Ljava/lang/String;
    //   107: astore_1
    //   108: aload_1
    //   109: areturn
    //   110: astore_2
    //   111: aload_1
    //   112: monitorexit
    //   113: aload_2
    //   114: athrow
    //   115: astore_1
    //   116: new 6	com/google/android/gms/b/dy$a
    //   119: dup
    //   120: aload_1
    //   121: invokespecial 48	com/google/android/gms/b/dy$a:<init>	(Ljava/lang/Throwable;)V
    //   124: athrow
    //   125: astore_1
    //   126: new 6	com/google/android/gms/b/dy$a
    //   129: dup
    //   130: aload_1
    //   131: invokespecial 48	com/google/android/gms/b/dy$a:<init>	(Ljava/lang/Throwable;)V
    //   134: athrow
    //   135: astore_1
    //   136: new 6	com/google/android/gms/b/dy$a
    //   139: dup
    //   140: aload_1
    //   141: invokespecial 48	com/google/android/gms/b/dy$a:<init>	(Ljava/lang/Throwable;)V
    //   144: athrow
    //   145: astore_1
    //   146: new 6	com/google/android/gms/b/dy$a
    //   149: dup
    //   150: aload_1
    //   151: invokespecial 48	com/google/android/gms/b/dy$a:<init>	(Ljava/lang/Throwable;)V
    //   154: athrow
    //   155: astore_1
    //   156: new 6	com/google/android/gms/b/dy$a
    //   159: dup
    //   160: aload_1
    //   161: invokespecial 48	com/google/android/gms/b/dy$a:<init>	(Ljava/lang/Throwable;)V
    //   164: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	165	0	this	dy
    //   0	165	2	paramArrayOfByte2	byte[]
    //   70	23	3	i	int
    //   25	53	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   33	64	110	finally
    //   111	113	110	finally
    //   15	33	115	java/security/NoSuchAlgorithmException
    //   64	108	115	java/security/NoSuchAlgorithmException
    //   113	115	115	java/security/NoSuchAlgorithmException
    //   15	33	125	java/security/InvalidKeyException
    //   64	108	125	java/security/InvalidKeyException
    //   113	115	125	java/security/InvalidKeyException
    //   15	33	135	javax/crypto/IllegalBlockSizeException
    //   64	108	135	javax/crypto/IllegalBlockSizeException
    //   113	115	135	javax/crypto/IllegalBlockSizeException
    //   15	33	145	javax/crypto/NoSuchPaddingException
    //   64	108	145	javax/crypto/NoSuchPaddingException
    //   113	115	145	javax/crypto/NoSuchPaddingException
    //   15	33	155	javax/crypto/BadPaddingException
    //   64	108	155	javax/crypto/BadPaddingException
    //   113	115	155	javax/crypto/BadPaddingException
  }
  
  public final class a
    extends Exception
  {
    public a() {}
    
    public a()
    {
      super();
    }
  }
}


/* Location:              com/google/android/gms/b/dy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */