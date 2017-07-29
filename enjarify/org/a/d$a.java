package org.a;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import org.a.b.c;
import org.a.d.f;
import org.a.d.h;

final class d$a
  implements f, h
{
  private Signature b;
  private h c;
  
  public d$a(d paramd)
  {
    Object localObject = "SHA1withDSA";
    try
    {
      localObject = Signature.getInstance((String)localObject);
      b = ((Signature)localObject);
      localObject = a;
      localObject = ((e)localObject).c();
      localObject = (h)localObject;
      c = ((h)localObject);
      return;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      c localc = new org/a/b/c;
      localc.<init>(localGeneralSecurityException);
      throw localc;
    }
  }
  
  public final int a()
  {
    return 48;
  }
  
  public final void a_(ByteBuffer paramByteBuffer)
  {
    try
    {
      Object localObject = b;
      localObject = ((Signature)localObject).sign();
      paramByteBuffer.put((byte[])localObject);
      return;
    }
    catch (SignatureException localSignatureException)
    {
      c localc = new org/a/b/c;
      localc.<init>(localSignatureException);
      throw localc;
    }
  }
  
  public final void b()
  {
    try
    {
      Signature localSignature = b;
      localObject = a;
      localObject = b;
      localSignature.initSign((PrivateKey)localObject);
      return;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      Object localObject = new org/a/b/c;
      ((c)localObject).<init>(localGeneralSecurityException);
      throw ((Throwable)localObject);
    }
  }
  
  public final void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      Signature localSignature = b;
      localSignature.update(paramByteBuffer);
      return;
    }
    catch (SignatureException localSignatureException)
    {
      c localc = new org/a/b/c;
      localc.<init>(localSignatureException);
      throw localc;
    }
  }
}


/* Location:              org/a/d$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */