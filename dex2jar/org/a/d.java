package org.a;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAPrivateKeySpec;
import org.a.b.c;
import org.a.d.f;
import org.a.d.g;
import org.a.d.h;
import org.a.e.a;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  extends k
{
  final e a;
  DSAPrivateKey b;
  private final String c;
  
  private d(int paramInt, e parame, String paramString)
  {
    super(paramInt);
    a = parame;
    c = paramString;
  }
  
  static d a(String paramString)
  {
    try
    {
      paramString = new JSONObject(paramString);
      paramString = new d(paramString.getInt("size"), e.a(paramString.getJSONObject("publicKey")), paramString.getString("x")).e();
      return paramString;
    }
    catch (JSONException paramString)
    {
      throw new RuntimeException(paramString);
    }
  }
  
  private d e()
  {
    a.e();
    BigInteger localBigInteger1 = new BigInteger(a.a(c));
    BigInteger localBigInteger2 = new BigInteger(a.a(a.b));
    BigInteger localBigInteger3 = new BigInteger(a.a(a.c));
    BigInteger localBigInteger4 = new BigInteger(a.a(a.d));
    try
    {
      b = ((DSAPrivateKey)KeyFactory.getInstance("DSA").generatePrivate(new DSAPrivateKeySpec(localBigInteger1, localBigInteger2, localBigInteger3, localBigInteger4)));
      return this;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      throw new c(localGeneralSecurityException);
    }
  }
  
  protected final byte[] a()
  {
    return a.a();
  }
  
  /* Error */
  final JSONObject b()
  {
    // Byte code:
    //   0: new 27	org/json/JSONObject
    //   3: dup
    //   4: invokespecial 117	org/json/JSONObject:<init>	()V
    //   7: ldc 32
    //   9: aload_0
    //   10: getfield 120	org/a/d:e	I
    //   13: invokevirtual 124	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   16: astore_2
    //   17: aload_0
    //   18: getfield 19	org/a/d:a	Lorg/a/e;
    //   21: ifnull +30 -> 51
    //   24: aload_0
    //   25: getfield 19	org/a/d:a	Lorg/a/e;
    //   28: invokevirtual 126	org/a/e:b	()Lorg/json/JSONObject;
    //   31: astore_1
    //   32: aload_2
    //   33: ldc 38
    //   35: aload_1
    //   36: invokevirtual 129	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   39: ldc 49
    //   41: aload_0
    //   42: getfield 21	org/a/d:c	Ljava/lang/String;
    //   45: invokevirtual 129	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   48: astore_1
    //   49: aload_1
    //   50: areturn
    //   51: aconst_null
    //   52: astore_1
    //   53: goto -21 -> 32
    //   56: astore_1
    //   57: new 61	java/lang/RuntimeException
    //   60: dup
    //   61: aload_1
    //   62: invokespecial 64	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   65: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	d
    //   31	22	1	localJSONObject1	JSONObject
    //   56	6	1	localJSONException	JSONException
    //   16	17	2	localJSONObject2	JSONObject
    // Exception table:
    //   from	to	target	type
    //   0	32	56	org/json/JSONException
    //   32	49	56	org/json/JSONException
  }
  
  protected final g c()
  {
    g localg = (g)g.poll();
    if (localg != null) {
      return localg;
    }
    return new a();
  }
  
  protected final Iterable<byte[]> d()
  {
    return a.d();
  }
  
  private final class a
    implements f, h
  {
    private Signature b;
    private h c;
    
    public a()
    {
      try
      {
        b = Signature.getInstance("SHA1withDSA");
        c = ((h)a.c());
        return;
      }
      catch (GeneralSecurityException this$1)
      {
        throw new c(d.this);
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
        paramByteBuffer.put(b.sign());
        return;
      }
      catch (SignatureException paramByteBuffer)
      {
        throw new c(paramByteBuffer);
      }
    }
    
    public final void b()
    {
      try
      {
        b.initSign(b);
        return;
      }
      catch (GeneralSecurityException localGeneralSecurityException)
      {
        throw new c(localGeneralSecurityException);
      }
    }
    
    public final void b(ByteBuffer paramByteBuffer)
    {
      try
      {
        b.update(paramByteBuffer);
        return;
      }
      catch (SignatureException paramByteBuffer)
      {
        throw new c(paramByteBuffer);
      }
    }
  }
}


/* Location:              org/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */