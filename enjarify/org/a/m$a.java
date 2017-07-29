package org.a;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import javax.crypto.Cipher;
import org.a.a.d;
import org.a.d.a;
import org.a.d.f;
import org.a.d.h;

final class m$a
  implements a, org.a.d.c, f, h
{
  private Cipher b;
  private org.a.d.c c;
  private Signature d;
  private h e;
  
  public m$a(m paramm)
  {
    Object localObject = "SHA1withRSA";
    try
    {
      localObject = Signature.getInstance((String)localObject);
      d = ((Signature)localObject);
      localObject = a;
      localObject = ((n)localObject).c();
      localObject = (h)localObject;
      e = ((h)localObject);
      localObject = a;
      localObject = ((n)localObject).g();
      localObject = c;
      localObject = Cipher.getInstance((String)localObject);
      b = ((Cipher)localObject);
      localObject = a;
      localObject = ((n)localObject).c();
      localObject = (org.a.d.c)localObject;
      c = ((org.a.d.c)localObject);
      return;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      org.a.b.c localc = new org/a/b/c;
      localc.<init>(localGeneralSecurityException);
      throw localc;
    }
  }
  
  public final int a()
  {
    return a.a.f();
  }
  
  public final int a(int paramInt)
  {
    return a.a.f();
  }
  
  public final int a(ByteBuffer paramByteBuffer)
  {
    return c.a(paramByteBuffer);
  }
  
  public final int a(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2)
  {
    return c.a(paramByteBuffer1, paramByteBuffer2);
  }
  
  public final void a_(ByteBuffer paramByteBuffer)
  {
    try
    {
      Object localObject = d;
      localObject = ((Signature)localObject).sign();
      paramByteBuffer.put((byte[])localObject);
      return;
    }
    catch (SignatureException localSignatureException)
    {
      org.a.b.c localc = new org/a/b/c;
      localc.<init>(localSignatureException);
      throw localc;
    }
  }
  
  public final int b(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2)
  {
    return c.b(paramByteBuffer1, paramByteBuffer2);
  }
  
  public final void b()
  {
    try
    {
      Signature localSignature = d;
      localObject = a;
      localObject = b;
      localSignature.initSign((PrivateKey)localObject);
      return;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      Object localObject = new org/a/b/c;
      ((org.a.b.c)localObject).<init>(localGeneralSecurityException);
      throw ((Throwable)localObject);
    }
  }
  
  public final void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      Signature localSignature = d;
      localSignature.update(paramByteBuffer);
      return;
    }
    catch (SignatureException localSignatureException)
    {
      org.a.b.c localc = new org/a/b/c;
      localc.<init>(localSignatureException);
      throw localc;
    }
  }
  
  public final f j_()
  {
    return c.j_();
  }
}


/* Location:              org/a/m$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */