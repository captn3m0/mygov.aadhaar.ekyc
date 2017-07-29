package org.a;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import javax.crypto.Cipher;
import org.a.a.d;
import org.a.d.a;
import org.a.d.f;
import org.a.d.g;
import org.a.d.h;
import org.a.e.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class m
  extends k
{
  final n a;
  RSAPrivateCrtKey b;
  private final String c;
  private final String d;
  private final String h;
  private final String i;
  private final String j;
  private final String k;
  
  private m(int paramInt, n paramn, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    super(paramInt);
    a = paramn;
    c = paramString1;
    d = paramString2;
    h = paramString3;
    i = paramString4;
    j = paramString5;
    k = paramString6;
    b = null;
  }
  
  static m a(String paramString)
  {
    try
    {
      paramString = new JSONObject(paramString);
      paramString = new m(paramString.getInt("size"), n.a(paramString.getJSONObject("publicKey")), paramString.getString("privateExponent"), paramString.getString("primeP"), paramString.getString("primeQ"), paramString.getString("primeExponentP"), paramString.getString("primeExponentQ"), paramString.getString("crtCoefficient")).e();
      return paramString;
    }
    catch (JSONException paramString)
    {
      throw new RuntimeException(paramString);
    }
  }
  
  private m e()
  {
    a.e();
    try
    {
      b = ((RSAPrivateCrtKey)KeyFactory.getInstance("RSA").generatePrivate(new RSAPrivateCrtKeySpec(b.a(a.b), b.a(a.c), b.a(c), b.a(d), b.a(h), b.a(i), b.a(j), b.a(k))));
      return this;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      throw new org.a.b.c(localGeneralSecurityException);
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
    //   0: new 44	org/json/JSONObject
    //   3: dup
    //   4: invokespecial 133	org/json/JSONObject:<init>	()V
    //   7: ldc 49
    //   9: aload_0
    //   10: getfield 136	org/a/m:e	I
    //   13: invokevirtual 140	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   16: astore_2
    //   17: aload_0
    //   18: getfield 24	org/a/m:a	Lorg/a/n;
    //   21: ifnull +75 -> 96
    //   24: aload_0
    //   25: getfield 24	org/a/m:a	Lorg/a/n;
    //   28: invokevirtual 142	org/a/n:b	()Lorg/json/JSONObject;
    //   31: astore_1
    //   32: aload_2
    //   33: ldc 55
    //   35: aload_1
    //   36: invokevirtual 145	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   39: ldc 66
    //   41: aload_0
    //   42: getfield 26	org/a/m:c	Ljava/lang/String;
    //   45: invokevirtual 145	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   48: ldc 72
    //   50: aload_0
    //   51: getfield 28	org/a/m:d	Ljava/lang/String;
    //   54: invokevirtual 145	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   57: ldc 74
    //   59: aload_0
    //   60: getfield 30	org/a/m:h	Ljava/lang/String;
    //   63: invokevirtual 145	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   66: ldc 76
    //   68: aload_0
    //   69: getfield 32	org/a/m:i	Ljava/lang/String;
    //   72: invokevirtual 145	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   75: ldc 78
    //   77: aload_0
    //   78: getfield 34	org/a/m:j	Ljava/lang/String;
    //   81: invokevirtual 145	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   84: ldc 80
    //   86: aload_0
    //   87: getfield 36	org/a/m:k	Ljava/lang/String;
    //   90: invokevirtual 145	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   93: astore_1
    //   94: aload_1
    //   95: areturn
    //   96: aconst_null
    //   97: astore_1
    //   98: goto -66 -> 32
    //   101: astore_1
    //   102: new 88	java/lang/RuntimeException
    //   105: dup
    //   106: aload_1
    //   107: invokespecial 91	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   110: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	111	0	this	m
    //   31	67	1	localJSONObject1	JSONObject
    //   101	6	1	localJSONException	JSONException
    //   16	17	2	localJSONObject2	JSONObject
    // Exception table:
    //   from	to	target	type
    //   0	32	101	org/json/JSONException
    //   32	94	101	org/json/JSONException
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
    implements a, org.a.d.c, f, h
  {
    private Cipher b;
    private org.a.d.c c;
    private Signature d;
    private h e;
    
    public a()
    {
      try
      {
        d = Signature.getInstance("SHA1withRSA");
        e = ((h)a.c());
        b = Cipher.getInstance(a.g().c);
        c = ((org.a.d.c)a.c());
        return;
      }
      catch (GeneralSecurityException this$1)
      {
        throw new org.a.b.c(m.this);
      }
    }
    
    public final int a()
    {
      return a.f();
    }
    
    public final int a(int paramInt)
    {
      return a.f();
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
        paramByteBuffer.put(d.sign());
        return;
      }
      catch (SignatureException paramByteBuffer)
      {
        throw new org.a.b.c(paramByteBuffer);
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
        d.initSign(b);
        return;
      }
      catch (GeneralSecurityException localGeneralSecurityException)
      {
        throw new org.a.b.c(localGeneralSecurityException);
      }
    }
    
    public final void b(ByteBuffer paramByteBuffer)
    {
      try
      {
        d.update(paramByteBuffer);
        return;
      }
      catch (SignatureException paramByteBuffer)
      {
        throw new org.a.b.c(paramByteBuffer);
      }
    }
    
    public final f j_()
    {
      return c.j_();
    }
  }
}


/* Location:              org/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */