package org.a;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import org.a.b.e;
import org.a.d.f;
import org.a.e.b;

final class a$a
  implements org.a.d.a, org.a.d.c
{
  boolean a = false;
  private final Cipher c;
  private final Cipher d;
  private final f e;
  
  public a$a(a parama)
  {
    Object localObject1 = new javax/crypto/spec/IvParameterSpec;
    int i = 16;
    Object localObject2 = new byte[i];
    ((IvParameterSpec)localObject1).<init>((byte[])localObject2);
    try
    {
      localObject2 = a.a(parama);
      localObject2 = e;
      localObject2 = Cipher.getInstance((String)localObject2);
      c = ((Cipher)localObject2);
      localObject2 = c;
      int j = 1;
      SecretKey localSecretKey = a.b(parama);
      ((Cipher)localObject2).init(j, localSecretKey, (AlgorithmParameterSpec)localObject1);
      localObject2 = a.a(parama);
      localObject2 = e;
      localObject2 = Cipher.getInstance((String)localObject2);
      d = ((Cipher)localObject2);
      localObject2 = d;
      j = 2;
      localSecretKey = a.b(parama);
      ((Cipher)localObject2).init(j, localSecretKey, (AlgorithmParameterSpec)localObject1);
      localObject1 = a.c(parama);
      localObject1 = ((g)localObject1).c();
      localObject1 = (f)localObject1;
      e = ((f)localObject1);
      return;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      localObject2 = new org/a/b/c;
      ((org.a.b.c)localObject2).<init>(localGeneralSecurityException);
      throw ((Throwable)localObject2);
    }
  }
  
  public final int a(int paramInt)
  {
    org.a.a.a locala1 = a.a(b);
    org.a.a.a locala2 = org.a.a.a.a;
    int i;
    if (locala1 == locala2) {
      i = (paramInt / 16 + 2) * 16;
    }
    for (;;)
    {
      return i;
      locala2 = org.a.a.a.c;
      if (locala1 == locala2)
      {
        i = 16;
      }
      else
      {
        locala2 = org.a.a.a.b;
        if (locala1 == locala2)
        {
          i = paramInt + 8;
        }
        else
        {
          locala2 = org.a.a.a.d;
          if (locala1 == locala2)
          {
            i = (paramInt / 16 + 1) * 16;
          }
          else
          {
            i = 0;
            locala1 = null;
          }
        }
      }
    }
  }
  
  public final int a(ByteBuffer paramByteBuffer)
  {
    int i = 16;
    Object localObject1 = new byte[i];
    b.b((byte[])localObject1);
    try
    {
      localObject2 = c;
      localObject1 = ByteBuffer.wrap((byte[])localObject1);
      return ((Cipher)localObject2).update((ByteBuffer)localObject1, paramByteBuffer);
    }
    catch (ShortBufferException localShortBufferException)
    {
      Object localObject2 = new org/a/b/e;
      ((e)localObject2).<init>(localShortBufferException);
      throw ((Throwable)localObject2);
    }
  }
  
  public final int a(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2)
  {
    try
    {
      Cipher localCipher = c;
      return localCipher.update(paramByteBuffer1, paramByteBuffer2);
    }
    catch (ShortBufferException localShortBufferException)
    {
      e locale = new org/a/b/e;
      locale.<init>(localShortBufferException);
      throw locale;
    }
  }
  
  public final int b(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2)
  {
    try
    {
      Cipher localCipher = c;
      return localCipher.doFinal(paramByteBuffer1, paramByteBuffer2);
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      org.a.b.c localc = new org/a/b/c;
      localc.<init>(localGeneralSecurityException);
      throw localc;
    }
  }
  
  public final f j_()
  {
    return e;
  }
}


/* Location:              org/a/a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */