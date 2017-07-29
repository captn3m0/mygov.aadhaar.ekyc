package org.a;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.a.e.a;
import org.a.e.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class g
  extends k
{
  SecretKey a;
  private final String b;
  private final byte[] c;
  
  private g(int paramInt, String paramString)
  {
    super(paramInt);
    byte[] arrayOfByte = new byte[4];
    c = arrayOfByte;
    b = paramString;
  }
  
  static g a(String paramString)
  {
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      localObject = a((JSONObject)localObject);
      ((g)localObject).e();
      return (g)localObject;
    }
    catch (JSONException localJSONException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localJSONException);
      throw localRuntimeException;
    }
  }
  
  static g a(JSONObject paramJSONObject)
  {
    g localg = new org/a/g;
    int i = paramJSONObject.getInt("size");
    String str = paramJSONObject.getString("hmacKeyString");
    localg.<init>(i, str);
    return localg;
  }
  
  protected final byte[] a()
  {
    return c;
  }
  
  final JSONObject b()
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localObject = "size";
      int i = e;
      localJSONObject = localJSONObject.put((String)localObject, i);
      localObject = "hmacKeyString";
      String str = b;
      return localJSONObject.put((String)localObject, str);
    }
    catch (JSONException localJSONException)
    {
      Object localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>(localJSONException);
      throw ((Throwable)localObject);
    }
  }
  
  protected final org.a.d.g c()
  {
    Object localObject = (org.a.d.g)g.poll();
    if (localObject != null) {}
    for (;;)
    {
      return (org.a.d.g)localObject;
      localObject = new org/a/g$a;
      ((g.a)localObject).<init>(this);
    }
  }
  
  final void e()
  {
    byte[] arrayOfByte = a.a(b);
    Object localObject = new javax/crypto/spec/SecretKeySpec;
    ((SecretKeySpec)localObject).<init>(arrayOfByte, "HMACSHA1");
    a = ((SecretKey)localObject);
    localObject = new byte[1][];
    localObject[0] = arrayOfByte;
    arrayOfByte = b.b((byte[][])localObject);
    localObject = c;
    int i = c.length;
    System.arraycopy(arrayOfByte, 0, localObject, 0, i);
  }
  
  final byte[] f()
  {
    return a.getEncoded();
  }
}


/* Location:              org/a/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */