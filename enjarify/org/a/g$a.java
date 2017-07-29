package org.a;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;
import org.a.b.c;
import org.a.d.f;
import org.a.d.h;

final class g$a
  implements f, h
{
  private final Mac b;
  
  public g$a(g paramg)
  {
    Object localObject = "HMACSHA1";
    try
    {
      localObject = Mac.getInstance((String)localObject);
      b = ((Mac)localObject);
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
    return 20;
  }
  
  public final void a_(ByteBuffer paramByteBuffer)
  {
    byte[] arrayOfByte = b.doFinal();
    paramByteBuffer.put(arrayOfByte);
  }
  
  public final void b()
  {
    try
    {
      Mac localMac = b;
      localObject = a;
      localObject = a;
      localMac.init((Key)localObject);
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
    b.update(paramByteBuffer);
  }
}


/* Location:              org/a/g$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */