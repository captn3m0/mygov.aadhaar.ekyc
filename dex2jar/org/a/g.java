package org.a;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.a.b.c;
import org.a.d.f;
import org.a.d.h;
import org.a.e.a;
import org.a.e.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class g
  extends k
{
  SecretKey a;
  private final String b;
  private final byte[] c = new byte[4];
  
  private g(int paramInt, String paramString)
  {
    super(paramInt);
    b = paramString;
  }
  
  static g a(String paramString)
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
  
  static g a(JSONObject paramJSONObject)
  {
    return new g(paramJSONObject.getInt("size"), paramJSONObject.getString("hmacKeyString"));
  }
  
  protected final byte[] a()
  {
    return c;
  }
  
  final JSONObject b()
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("size", e).put("hmacKeyString", b);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      throw new RuntimeException(localJSONException);
    }
  }
  
  protected final org.a.d.g c()
  {
    org.a.d.g localg = (org.a.d.g)g.poll();
    if (localg != null) {
      return localg;
    }
    return new a();
  }
  
  final void e()
  {
    byte[] arrayOfByte = a.a(b);
    a = new SecretKeySpec(arrayOfByte, "HMACSHA1");
    System.arraycopy(b.b(new byte[][] { arrayOfByte }), 0, c, 0, c.length);
  }
  
  final byte[] f()
  {
    return a.getEncoded();
  }
  
  private final class a
    implements f, h
  {
    private final Mac b;
    
    public a()
    {
      try
      {
        b = Mac.getInstance("HMACSHA1");
        return;
      }
      catch (GeneralSecurityException this$1)
      {
        throw new c(g.this);
      }
    }
    
    public final int a()
    {
      return 20;
    }
    
    public final void a_(ByteBuffer paramByteBuffer)
    {
      paramByteBuffer.put(b.doFinal());
    }
    
    public final void b()
    {
      try
      {
        b.init(a);
        return;
      }
      catch (GeneralSecurityException localGeneralSecurityException)
      {
        throw new c(localGeneralSecurityException);
      }
    }
    
    public final void b(ByteBuffer paramByteBuffer)
    {
      b.update(paramByteBuffer);
    }
  }
}


/* Location:              org/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */