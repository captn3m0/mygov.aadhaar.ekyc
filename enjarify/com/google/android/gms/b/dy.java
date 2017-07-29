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
  private static final Object c;
  private static final Object d;
  private final SecureRandom a = null;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    c = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    d = localObject;
  }
  
  private static Cipher a()
  {
    synchronized (d)
    {
      Object localObject2 = b;
      if (localObject2 == null)
      {
        localObject2 = "AES/CBC/PKCS5Padding";
        localObject2 = Cipher.getInstance((String)localObject2);
        b = (Cipher)localObject2;
      }
      localObject2 = b;
      return (Cipher)localObject2;
    }
  }
  
  public static byte[] a(String paramString)
  {
    int i = 0;
    dy.a locala = null;
    int j = 16;
    int k = 0;
    Object localObject = null;
    try
    {
      localObject = bh.a(paramString, false);
      m = localObject.length;
      n = 32;
      if (m != n)
      {
        locala = new com/google/android/gms/b/dy$a;
        locala.<init>();
        throw locala;
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      localObject = new com/google/android/gms/b/dy$a;
      ((dy.a)localObject).<init>(localIllegalArgumentException);
      throw ((Throwable)localObject);
    }
    int m = 4;
    int n = 16;
    localObject = ByteBuffer.wrap((byte[])localObject, m, n);
    m = 16;
    byte[] arrayOfByte = new byte[m];
    ((ByteBuffer)localObject).get(arrayOfByte);
    while (i < j)
    {
      k = (byte)(arrayOfByte[i] ^ 0x44);
      arrayOfByte[i] = k;
      i += 1;
    }
    return arrayOfByte;
  }
  
  public static byte[] a(byte[] paramArrayOfByte, String paramString)
  {
    int i = 16;
    int j = paramArrayOfByte.length;
    if (j != i)
    {
      localObject1 = new com/google/android/gms/b/dy$a;
      ((dy.a)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    j = 0;
    Object localObject1 = null;
    try
    {
      localObject1 = bh.a(paramString, false);
      k = localObject1.length;
      if (k <= i)
      {
        localObject1 = new com/google/android/gms/b/dy$a;
        ((dy.a)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      localObject3 = new com/google/android/gms/b/dy$a;
      ((dy.a)localObject3).<init>(localNoSuchAlgorithmException);
      throw ((Throwable)localObject3);
      int k = localNoSuchAlgorithmException.length;
      localObject3 = ByteBuffer.allocate(k);
      ((ByteBuffer)localObject3).put(localNoSuchAlgorithmException);
      ((ByteBuffer)localObject3).flip();
      i = 16;
      byte[] arrayOfByte2 = new byte[i];
      j = localNoSuchAlgorithmException.length + -16;
      byte[] arrayOfByte1 = new byte[j];
      ((ByteBuffer)localObject3).get(arrayOfByte2);
      ((ByteBuffer)localObject3).get(arrayOfByte1);
      localObject3 = new javax/crypto/spec/SecretKeySpec;
      ??? = "AES";
      ((SecretKeySpec)localObject3).<init>(paramArrayOfByte, (String)???);
      synchronized (c)
      {
        Cipher localCipher = a();
        int m = 2;
        IvParameterSpec localIvParameterSpec = new javax/crypto/spec/IvParameterSpec;
        localIvParameterSpec.<init>(arrayOfByte2);
        localCipher.init(m, (Key)localObject3, localIvParameterSpec);
        localObject3 = a();
        arrayOfByte1 = ((Cipher)localObject3).doFinal(arrayOfByte1);
        return arrayOfByte1;
      }
    }
    catch (InvalidKeyException localInvalidKeyException)
    {
      localObject3 = new com/google/android/gms/b/dy$a;
      ((dy.a)localObject3).<init>(localInvalidKeyException);
      throw ((Throwable)localObject3);
    }
    catch (IllegalBlockSizeException localIllegalBlockSizeException)
    {
      localObject3 = new com/google/android/gms/b/dy$a;
      ((dy.a)localObject3).<init>(localIllegalBlockSizeException);
      throw ((Throwable)localObject3);
    }
    catch (NoSuchPaddingException localNoSuchPaddingException)
    {
      localObject3 = new com/google/android/gms/b/dy$a;
      ((dy.a)localObject3).<init>(localNoSuchPaddingException);
      throw ((Throwable)localObject3);
    }
    catch (BadPaddingException localBadPaddingException)
    {
      localObject3 = new com/google/android/gms/b/dy$a;
      ((dy.a)localObject3).<init>(localBadPaddingException);
      throw ((Throwable)localObject3);
    }
    catch (InvalidAlgorithmParameterException localInvalidAlgorithmParameterException)
    {
      localObject3 = new com/google/android/gms/b/dy$a;
      ((dy.a)localObject3).<init>(localInvalidAlgorithmParameterException);
      throw ((Throwable)localObject3);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      Object localObject3 = new com/google/android/gms/b/dy$a;
      ((dy.a)localObject3).<init>(localIllegalArgumentException);
      throw ((Throwable)localObject3);
    }
  }
  
  /* Error */
  public final String a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    // Byte code:
    //   0: aload_1
    //   1: arraylength
    //   2: istore_3
    //   3: bipush 16
    //   5: istore 4
    //   7: iload_3
    //   8: iload 4
    //   10: if_icmpeq +16 -> 26
    //   13: new 40	com/google/android/gms/b/dy$a
    //   16: astore 5
    //   18: aload 5
    //   20: invokespecial 41	com/google/android/gms/b/dy$a:<init>	()V
    //   23: aload 5
    //   25: athrow
    //   26: new 70	javax/crypto/spec/SecretKeySpec
    //   29: astore 5
    //   31: ldc 72
    //   33: astore 6
    //   35: aload 5
    //   37: aload_1
    //   38: aload 6
    //   40: invokespecial 75	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   43: getstatic 19	com/google/android/gms/b/dy:c	Ljava/lang/Object;
    //   46: astore 6
    //   48: aload 6
    //   50: monitorenter
    //   51: invokestatic 78	com/google/android/gms/b/dy:a	()Ljavax/crypto/Cipher;
    //   54: astore 7
    //   56: iconst_1
    //   57: istore 8
    //   59: aload_0
    //   60: getfield 23	com/google/android/gms/b/dy:a	Ljava/security/SecureRandom;
    //   63: astore 9
    //   65: aload 7
    //   67: iload 8
    //   69: aload 5
    //   71: aload 9
    //   73: invokevirtual 108	javax/crypto/Cipher:init	(ILjava/security/Key;Ljava/security/SecureRandom;)V
    //   76: invokestatic 78	com/google/android/gms/b/dy:a	()Ljavax/crypto/Cipher;
    //   79: astore 5
    //   81: aload 5
    //   83: aload_2
    //   84: invokevirtual 92	javax/crypto/Cipher:doFinal	([B)[B
    //   87: astore 5
    //   89: invokestatic 78	com/google/android/gms/b/dy:a	()Ljavax/crypto/Cipher;
    //   92: astore 7
    //   94: aload 7
    //   96: invokevirtual 112	javax/crypto/Cipher:getIV	()[B
    //   99: astore 7
    //   101: aload 6
    //   103: monitorexit
    //   104: aload 5
    //   106: arraylength
    //   107: istore 4
    //   109: aload 7
    //   111: arraylength
    //   112: istore 8
    //   114: iload 4
    //   116: iload 8
    //   118: iadd
    //   119: istore 4
    //   121: iload 4
    //   123: invokestatic 61	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   126: astore 10
    //   128: aload 10
    //   130: aload 7
    //   132: invokevirtual 64	java/nio/ByteBuffer:put	([B)Ljava/nio/ByteBuffer;
    //   135: astore 7
    //   137: aload 7
    //   139: aload 5
    //   141: invokevirtual 64	java/nio/ByteBuffer:put	([B)Ljava/nio/ByteBuffer;
    //   144: pop
    //   145: aload 10
    //   147: invokevirtual 68	java/nio/ByteBuffer:flip	()Ljava/nio/Buffer;
    //   150: pop
    //   151: iload 4
    //   153: newarray <illegal type>
    //   155: astore 5
    //   157: aload 10
    //   159: aload 5
    //   161: invokevirtual 55	java/nio/ByteBuffer:get	([B)Ljava/nio/ByteBuffer;
    //   164: pop
    //   165: iconst_0
    //   166: istore 4
    //   168: aconst_null
    //   169: astore 6
    //   171: aload 5
    //   173: iconst_0
    //   174: invokestatic 115	com/google/android/gms/b/bh:a	([BZ)Ljava/lang/String;
    //   177: areturn
    //   178: astore 5
    //   180: aload 6
    //   182: monitorexit
    //   183: aload 5
    //   185: athrow
    //   186: astore 5
    //   188: new 40	com/google/android/gms/b/dy$a
    //   191: astore 6
    //   193: aload 6
    //   195: aload 5
    //   197: invokespecial 44	com/google/android/gms/b/dy$a:<init>	(Ljava/lang/Throwable;)V
    //   200: aload 6
    //   202: athrow
    //   203: astore 5
    //   205: new 40	com/google/android/gms/b/dy$a
    //   208: astore 6
    //   210: aload 6
    //   212: aload 5
    //   214: invokespecial 44	com/google/android/gms/b/dy$a:<init>	(Ljava/lang/Throwable;)V
    //   217: aload 6
    //   219: athrow
    //   220: astore 5
    //   222: new 40	com/google/android/gms/b/dy$a
    //   225: astore 6
    //   227: aload 6
    //   229: aload 5
    //   231: invokespecial 44	com/google/android/gms/b/dy$a:<init>	(Ljava/lang/Throwable;)V
    //   234: aload 6
    //   236: athrow
    //   237: astore 5
    //   239: new 40	com/google/android/gms/b/dy$a
    //   242: astore 6
    //   244: aload 6
    //   246: aload 5
    //   248: invokespecial 44	com/google/android/gms/b/dy$a:<init>	(Ljava/lang/Throwable;)V
    //   251: aload 6
    //   253: athrow
    //   254: astore 5
    //   256: new 40	com/google/android/gms/b/dy$a
    //   259: astore 6
    //   261: aload 6
    //   263: aload 5
    //   265: invokespecial 44	com/google/android/gms/b/dy$a:<init>	(Ljava/lang/Throwable;)V
    //   268: aload 6
    //   270: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	271	0	this	dy
    //   0	271	1	paramArrayOfByte1	byte[]
    //   0	271	2	paramArrayOfByte2	byte[]
    //   2	9	3	i	int
    //   5	162	4	j	int
    //   16	156	5	localObject1	Object
    //   178	6	5	localObject2	Object
    //   186	10	5	localNoSuchAlgorithmException	NoSuchAlgorithmException
    //   203	10	5	localInvalidKeyException	InvalidKeyException
    //   220	10	5	localIllegalBlockSizeException	IllegalBlockSizeException
    //   237	10	5	localNoSuchPaddingException	NoSuchPaddingException
    //   254	10	5	localBadPaddingException	BadPaddingException
    //   54	84	7	localObject4	Object
    //   57	62	8	k	int
    //   63	9	9	localSecureRandom	SecureRandom
    //   126	32	10	localByteBuffer	ByteBuffer
    // Exception table:
    //   from	to	target	type
    //   51	54	178	finally
    //   59	63	178	finally
    //   71	76	178	finally
    //   76	79	178	finally
    //   83	87	178	finally
    //   89	92	178	finally
    //   94	99	178	finally
    //   101	104	178	finally
    //   180	183	178	finally
    //   26	29	186	java/security/NoSuchAlgorithmException
    //   38	43	186	java/security/NoSuchAlgorithmException
    //   43	46	186	java/security/NoSuchAlgorithmException
    //   48	51	186	java/security/NoSuchAlgorithmException
    //   104	107	186	java/security/NoSuchAlgorithmException
    //   109	112	186	java/security/NoSuchAlgorithmException
    //   121	126	186	java/security/NoSuchAlgorithmException
    //   130	135	186	java/security/NoSuchAlgorithmException
    //   139	145	186	java/security/NoSuchAlgorithmException
    //   145	151	186	java/security/NoSuchAlgorithmException
    //   151	155	186	java/security/NoSuchAlgorithmException
    //   159	165	186	java/security/NoSuchAlgorithmException
    //   173	177	186	java/security/NoSuchAlgorithmException
    //   183	186	186	java/security/NoSuchAlgorithmException
    //   26	29	203	java/security/InvalidKeyException
    //   38	43	203	java/security/InvalidKeyException
    //   43	46	203	java/security/InvalidKeyException
    //   48	51	203	java/security/InvalidKeyException
    //   104	107	203	java/security/InvalidKeyException
    //   109	112	203	java/security/InvalidKeyException
    //   121	126	203	java/security/InvalidKeyException
    //   130	135	203	java/security/InvalidKeyException
    //   139	145	203	java/security/InvalidKeyException
    //   145	151	203	java/security/InvalidKeyException
    //   151	155	203	java/security/InvalidKeyException
    //   159	165	203	java/security/InvalidKeyException
    //   173	177	203	java/security/InvalidKeyException
    //   183	186	203	java/security/InvalidKeyException
    //   26	29	220	javax/crypto/IllegalBlockSizeException
    //   38	43	220	javax/crypto/IllegalBlockSizeException
    //   43	46	220	javax/crypto/IllegalBlockSizeException
    //   48	51	220	javax/crypto/IllegalBlockSizeException
    //   104	107	220	javax/crypto/IllegalBlockSizeException
    //   109	112	220	javax/crypto/IllegalBlockSizeException
    //   121	126	220	javax/crypto/IllegalBlockSizeException
    //   130	135	220	javax/crypto/IllegalBlockSizeException
    //   139	145	220	javax/crypto/IllegalBlockSizeException
    //   145	151	220	javax/crypto/IllegalBlockSizeException
    //   151	155	220	javax/crypto/IllegalBlockSizeException
    //   159	165	220	javax/crypto/IllegalBlockSizeException
    //   173	177	220	javax/crypto/IllegalBlockSizeException
    //   183	186	220	javax/crypto/IllegalBlockSizeException
    //   26	29	237	javax/crypto/NoSuchPaddingException
    //   38	43	237	javax/crypto/NoSuchPaddingException
    //   43	46	237	javax/crypto/NoSuchPaddingException
    //   48	51	237	javax/crypto/NoSuchPaddingException
    //   104	107	237	javax/crypto/NoSuchPaddingException
    //   109	112	237	javax/crypto/NoSuchPaddingException
    //   121	126	237	javax/crypto/NoSuchPaddingException
    //   130	135	237	javax/crypto/NoSuchPaddingException
    //   139	145	237	javax/crypto/NoSuchPaddingException
    //   145	151	237	javax/crypto/NoSuchPaddingException
    //   151	155	237	javax/crypto/NoSuchPaddingException
    //   159	165	237	javax/crypto/NoSuchPaddingException
    //   173	177	237	javax/crypto/NoSuchPaddingException
    //   183	186	237	javax/crypto/NoSuchPaddingException
    //   26	29	254	javax/crypto/BadPaddingException
    //   38	43	254	javax/crypto/BadPaddingException
    //   43	46	254	javax/crypto/BadPaddingException
    //   48	51	254	javax/crypto/BadPaddingException
    //   104	107	254	javax/crypto/BadPaddingException
    //   109	112	254	javax/crypto/BadPaddingException
    //   121	126	254	javax/crypto/BadPaddingException
    //   130	135	254	javax/crypto/BadPaddingException
    //   139	145	254	javax/crypto/BadPaddingException
    //   145	151	254	javax/crypto/BadPaddingException
    //   151	155	254	javax/crypto/BadPaddingException
    //   159	165	254	javax/crypto/BadPaddingException
    //   173	177	254	javax/crypto/BadPaddingException
    //   183	186	254	javax/crypto/BadPaddingException
  }
}


/* Location:              com/google/android/gms/b/dy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */