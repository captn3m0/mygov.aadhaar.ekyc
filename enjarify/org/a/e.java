package org.a;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import org.a.b.c;
import org.a.d.g;
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
  private DSAPublicKey i;
  private final byte[] j;
  
  private e(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    super(paramInt);
    byte[] arrayOfByte = new byte[4];
    j = arrayOfByte;
    i = null;
    a = paramString1;
    b = paramString2;
    c = paramString3;
    d = paramString4;
  }
  
  static e a(String paramString)
  {
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      localObject = a((JSONObject)localObject);
      ((e)localObject).e();
      return (e)localObject;
    }
    catch (JSONException localJSONException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localJSONException);
      throw localRuntimeException;
    }
  }
  
  static e a(JSONObject paramJSONObject)
  {
    e locale = new org/a/e;
    int k = paramJSONObject.getInt("size");
    String str1 = paramJSONObject.getString("y");
    String str2 = paramJSONObject.getString("p");
    String str3 = paramJSONObject.getString("q");
    String str4 = paramJSONObject.getString("g");
    locale.<init>(k, str1, str2, str3, str4);
    return locale;
  }
  
  public final byte[] a()
  {
    return j;
  }
  
  final JSONObject b()
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localObject = "size";
      int k = e;
      localJSONObject = localJSONObject.put((String)localObject, k);
      localObject = "y";
      String str = a;
      localJSONObject = localJSONObject.put((String)localObject, str);
      localObject = "p";
      str = b;
      localJSONObject = localJSONObject.put((String)localObject, str);
      localObject = "q";
      str = c;
      localJSONObject = localJSONObject.put((String)localObject, str);
      localObject = "g";
      str = d;
      return localJSONObject.put((String)localObject, str);
    }
    catch (JSONException localJSONException)
    {
      Object localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>(localJSONException);
      throw ((Throwable)localObject);
    }
  }
  
  protected final g c()
  {
    Object localObject = (g)g.poll();
    if (localObject != null) {}
    for (;;)
    {
      return (g)localObject;
      localObject = new org/a/e$a;
      ((e.a)localObject).<init>(this);
    }
  }
  
  public final Iterable d()
  {
    return super.d();
  }
  
  final void e()
  {
    Object localObject1 = new java/math/BigInteger;
    Object localObject2 = a.a(a);
    ((BigInteger)localObject1).<init>((byte[])localObject2);
    localObject2 = new java/math/BigInteger;
    Object localObject3 = a.a(b);
    ((BigInteger)localObject2).<init>((byte[])localObject3);
    localObject3 = new java/math/BigInteger;
    Object localObject4 = a.a(c);
    ((BigInteger)localObject3).<init>((byte[])localObject4);
    localObject4 = new java/math/BigInteger;
    Object localObject5 = a.a(d);
    ((BigInteger)localObject4).<init>((byte[])localObject5);
    localObject5 = "DSA";
    try
    {
      localObject5 = KeyFactory.getInstance((String)localObject5);
      DSAPublicKeySpec localDSAPublicKeySpec = new java/security/spec/DSAPublicKeySpec;
      localDSAPublicKeySpec.<init>((BigInteger)localObject1, (BigInteger)localObject2, (BigInteger)localObject3, (BigInteger)localObject4);
      localObject1 = ((KeyFactory)localObject5).generatePublic(localDSAPublicKeySpec);
      localObject1 = (DSAPublicKey)localObject1;
      i = ((DSAPublicKey)localObject1);
      localObject1 = i.getParams();
      localObject2 = new byte[4][];
      localObject3 = b.a(((DSAParams)localObject1).getP().toByteArray());
      localObject2[0] = localObject3;
      localObject4 = b.a(((DSAParams)localObject1).getQ().toByteArray());
      localObject2[1] = localObject4;
      localObject1 = b.a(((DSAParams)localObject1).getG().toByteArray());
      localObject2[2] = localObject1;
      localObject3 = b.a(i.getY().toByteArray());
      localObject2[3] = localObject3;
      localObject1 = b.a((byte[][])localObject2);
      localObject2 = j;
      int k = j.length;
      System.arraycopy(localObject1, 0, localObject2, 0, k);
      return;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      localObject2 = new org/a/b/c;
      ((c)localObject2).<init>(localGeneralSecurityException);
      throw ((Throwable)localObject2);
    }
  }
}


/* Location:              org/a/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */