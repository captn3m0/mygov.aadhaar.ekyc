package org.a;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import org.a.a.d;
import org.a.d.f;
import org.a.d.h;

final class n$a
  implements org.a.d.c, h
{
  private Cipher b;
  private Signature c;
  
  n$a(n paramn)
  {
    Object localObject = "SHA1withRSA";
    try
    {
      localObject = Signature.getInstance((String)localObject);
      c = ((Signature)localObject);
      localObject = paramn.g();
      localObject = c;
      localObject = Cipher.getInstance((String)localObject);
      b = ((Cipher)localObject);
      return;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      org.a.b.c localc = new org/a/b/c;
      localc.<init>(localGeneralSecurityException);
      throw localc;
    }
  }
  
  public final int a(int paramInt)
  {
    return a.f();
  }
  
  public final int a(ByteBuffer paramByteBuffer)
  {
    try
    {
      Cipher localCipher = b;
      int i = 1;
      Object localObject = a;
      localObject = a;
      localCipher.init(i, (Key)localObject);
      return 0;
    }
    catch (InvalidKeyException localInvalidKeyException)
    {
      org.a.b.c localc = new org/a/b/c;
      localc.<init>(localInvalidKeyException);
      throw localc;
    }
  }
  
  public final int a(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2)
  {
    try
    {
      Cipher localCipher = b;
      return localCipher.update(paramByteBuffer1, paramByteBuffer2);
    }
    catch (ShortBufferException localShortBufferException)
    {
      org.a.b.c localc = new org/a/b/c;
      localc.<init>(localShortBufferException);
      throw localc;
    }
  }
  
  public final int b(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2)
  {
    int i;
    int j;
    Object localObject3;
    try
    {
      Object localObject1 = b;
      i = paramByteBuffer1.limit();
      j = ((Cipher)localObject1).getOutputSize(i);
      i = paramByteBuffer2.limit();
      int k = paramByteBuffer2.position();
      i -= k;
      localObject3 = ByteBuffer.allocate(j);
      localObject4 = b;
      ((Cipher)localObject4).doFinal(paramByteBuffer1, (ByteBuffer)localObject3);
      if (j == i)
      {
        localObject1 = ((ByteBuffer)localObject3).array();
        paramByteBuffer2.put((byte[])localObject1);
      }
      for (;;)
      {
        return i;
        int m = i + 1;
        if (j != m) {
          break;
        }
        localObject4 = ((ByteBuffer)localObject3).array();
        int n = j + -1;
        m = localObject4[n];
        if (m != 0) {
          break;
        }
        localObject1 = ((ByteBuffer)localObject3).array();
        k = 0;
        localObject3 = null;
        paramByteBuffer2.put((byte[])localObject1, 0, i);
      }
      localObject3 = new org/a/b/c;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      localObject5 = new org/a/b/c;
      ((org.a.b.c)localObject5).<init>(localGeneralSecurityException);
      throw ((Throwable)localObject5);
    }
    Object localObject4 = new java/lang/StringBuilder;
    String str = "Expected ";
    ((StringBuilder)localObject4).<init>(str);
    Object localObject5 = ((StringBuilder)localObject4).append(i);
    localObject4 = " bytes from encryption operation but got ";
    localObject5 = ((StringBuilder)localObject5).append((String)localObject4);
    Object localObject2 = ((StringBuilder)localObject5).append(j);
    localObject2 = ((StringBuilder)localObject2).toString();
    ((org.a.b.c)localObject3).<init>((String)localObject2);
    throw ((Throwable)localObject3);
  }
  
  public final f j_()
  {
    n.a.1 local1 = new org/a/n$a$1;
    local1.<init>(this);
    return local1;
  }
}


/* Location:              org/a/n$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */