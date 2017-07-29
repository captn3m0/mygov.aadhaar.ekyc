package org.a;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import org.a.b.c;
import org.a.d.g;
import org.a.d.h;
import org.a.e.a;
import org.a.e.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
  extends l
{
  private static boolean h = Boolean.valueOf(System.getProperty("keyczar.strict_dsa_verification", "false")).booleanValue();
  final String a;
  final String b;
  final String c;
  final String d;
  private DSAPublicKey i = null;
  private final byte[] j = new byte[4];
  
  private e(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    super(paramInt);
    a = paramString1;
    b = paramString2;
    c = paramString3;
    d = paramString4;
  }
  
  static e a(String paramString)
  {
    try
    {
      paramString = a(new JSONObject(paramString));
      paramString.e();
      return paramString;
    }
    catch (JSONException paramString)
    {
      throw new RuntimeException(paramString);
    }
  }
  
  static e a(JSONObject paramJSONObject)
  {
    return new e(paramJSONObject.getInt("size"), paramJSONObject.getString("y"), paramJSONObject.getString("p"), paramJSONObject.getString("q"), paramJSONObject.getString("g"));
  }
  
  public final byte[] a()
  {
    return j;
  }
  
  final JSONObject b()
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("size", e).put("y", a).put("p", b).put("q", c).put("g", d);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      throw new RuntimeException(localJSONException);
    }
  }
  
  protected final g c()
  {
    g localg = (g)g.poll();
    if (localg != null) {
      return localg;
    }
    return new a();
  }
  
  public final Iterable<byte[]> d()
  {
    return super.d();
  }
  
  final void e()
  {
    Object localObject = new BigInteger(a.a(a));
    BigInteger localBigInteger1 = new BigInteger(a.a(b));
    BigInteger localBigInteger2 = new BigInteger(a.a(c));
    BigInteger localBigInteger3 = new BigInteger(a.a(d));
    try
    {
      i = ((DSAPublicKey)KeyFactory.getInstance("DSA").generatePublic(new DSAPublicKeySpec((BigInteger)localObject, localBigInteger1, localBigInteger2, localBigInteger3)));
      localObject = i.getParams();
      System.arraycopy(b.a(new byte[][] { b.a(((DSAParams)localObject).getP().toByteArray()), b.a(((DSAParams)localObject).getQ().toByteArray()), b.a(((DSAParams)localObject).getG().toByteArray()), b.a(i.getY().toByteArray()) }), 0, j, 0, j.length);
      return;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      throw new c(localGeneralSecurityException);
    }
  }
  
  private final class a
    implements h
  {
    private Signature b;
    
    public a()
    {
      try
      {
        b = Signature.getInstance("SHA1withDSA");
        return;
      }
      catch (GeneralSecurityException this$1)
      {
        throw new c(e.this);
      }
    }
  }
}


/* Location:              org/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */