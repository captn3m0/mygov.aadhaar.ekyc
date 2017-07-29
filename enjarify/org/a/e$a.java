package org.a;

import java.security.GeneralSecurityException;
import java.security.Signature;
import org.a.b.c;
import org.a.d.h;

final class e$a
  implements h
{
  private Signature b;
  
  public e$a(e parame)
  {
    Object localObject = "SHA1withDSA";
    try
    {
      localObject = Signature.getInstance((String)localObject);
      b = ((Signature)localObject);
      return;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      c localc = new org/a/b/c;
      localc.<init>(localGeneralSecurityException);
      throw localc;
    }
  }
}


/* Location:              org/a/e$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */