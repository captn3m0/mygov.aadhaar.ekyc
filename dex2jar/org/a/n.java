package org.a;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.KeySpec;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import org.a.a.d;
import org.a.d.g;
import org.a.d.h;
import org.a.e.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class n
  extends l
{
  RSAPublicKey a;
  final String b;
  final String c;
  final d d;
  private final byte[] h = new byte[4];
  
  private n(int paramInt, String paramString1, String paramString2, d paramd)
  {
    super(paramInt);
    b = paramString1;
    c = paramString2;
    d = paramd;
  }
  
  static n a(String paramString)
  {
    try
    {
      paramString = a(new JSONObject(paramString));
      return paramString;
    }
    catch (JSONException paramString)
    {
      throw new RuntimeException(paramString);
    }
  }
  
  static n a(JSONObject paramJSONObject)
  {
    paramJSONObject = new n(paramJSONObject.getInt("size"), paramJSONObject.getString("modulus"), paramJSONObject.getString("publicExponent"), (d)b.a(d.class, paramJSONObject.optString("padding")));
    if (c.f != c.f) {
      throw new org.a.b.f(c.f);
    }
    return paramJSONObject.e();
  }
  
  public final byte[] a()
  {
    return h;
  }
  
  /* Error */
  final JSONObject b()
  {
    // Byte code:
    //   0: new 36	org/json/JSONObject
    //   3: dup
    //   4: invokespecial 95	org/json/JSONObject:<init>	()V
    //   7: ldc 49
    //   9: aload_0
    //   10: getfield 98	org/a/n:e	I
    //   13: invokevirtual 102	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   16: ldc 55
    //   18: aload_0
    //   19: getfield 26	org/a/n:b	Ljava/lang/String;
    //   22: invokevirtual 105	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   25: ldc 61
    //   27: aload_0
    //   28: getfield 28	org/a/n:c	Ljava/lang/String;
    //   31: invokevirtual 105	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   34: astore_2
    //   35: aload_0
    //   36: getfield 30	org/a/n:d	Lorg/a/a/d;
    //   39: ifnull +21 -> 60
    //   42: aload_0
    //   43: getfield 30	org/a/n:d	Lorg/a/a/d;
    //   46: invokevirtual 109	org/a/a/d:name	()Ljava/lang/String;
    //   49: astore_1
    //   50: aload_2
    //   51: ldc 65
    //   53: aload_1
    //   54: invokevirtual 105	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   57: astore_1
    //   58: aload_1
    //   59: areturn
    //   60: aconst_null
    //   61: astore_1
    //   62: goto -12 -> 50
    //   65: astore_1
    //   66: new 44	java/lang/RuntimeException
    //   69: dup
    //   70: aload_1
    //   71: invokespecial 47	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   74: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	n
    //   49	13	1	localObject	Object
    //   65	6	1	localJSONException	JSONException
    //   34	17	2	localJSONObject	JSONObject
    // Exception table:
    //   from	to	target	type
    //   0	50	65	org/json/JSONException
    //   50	58	65	org/json/JSONException
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
  
  final n e()
  {
    Object localObject1 = b.a(b);
    Object localObject2 = b.a(c);
    try
    {
      localObject1 = new RSAPublicKeySpec((BigInteger)localObject1, (BigInteger)localObject2);
      a = ((RSAPublicKey)KeyFactory.getInstance("RSA").generatePublic((KeySpec)localObject1));
      localObject1 = g();
      localObject2 = a;
      switch (org.a.a.d.1.a[localObject1.ordinal()])
      {
      default: 
        throw new org.a.b.c("Bug! Unknown padding type");
      }
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      throw new org.a.b.c(localGeneralSecurityException);
    }
    for (byte[] arrayOfByte = b.a(new byte[][] { b.a(((RSAPublicKey)localObject2).getModulus().toByteArray()), b.a(((RSAPublicKey)localObject2).getPublicExponent().toByteArray()) });; arrayOfByte = b.a(new byte[][] { ((RSAPublicKey)localObject2).getModulus().toByteArray(), ((RSAPublicKey)localObject2).getPublicExponent().toByteArray() }))
    {
      System.arraycopy(arrayOfByte, 0, h, 0, h.length);
      return this;
    }
  }
  
  final int f()
  {
    return a.getModulus().bitLength() / 8;
  }
  
  public final d g()
  {
    if ((d == null) || (d == d.a)) {
      return d.a;
    }
    return d.b;
  }
  
  private final class a
    implements org.a.d.c, h
  {
    private Cipher b;
    private Signature c;
    
    a()
    {
      try
      {
        c = Signature.getInstance("SHA1withRSA");
        b = Cipher.getInstance(g().c);
        return;
      }
      catch (GeneralSecurityException this$1)
      {
        throw new org.a.b.c(n.this);
      }
    }
    
    public final int a(int paramInt)
    {
      return f();
    }
    
    public final int a(ByteBuffer paramByteBuffer)
    {
      try
      {
        b.init(1, a);
        return 0;
      }
      catch (InvalidKeyException paramByteBuffer)
      {
        throw new org.a.b.c(paramByteBuffer);
      }
    }
    
    public final int a(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2)
    {
      try
      {
        int i = b.update(paramByteBuffer1, paramByteBuffer2);
        return i;
      }
      catch (ShortBufferException paramByteBuffer1)
      {
        throw new org.a.b.c(paramByteBuffer1);
      }
    }
    
    public final int b(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2)
    {
      int i;
      int j;
      try
      {
        i = b.getOutputSize(paramByteBuffer1.limit());
        j = paramByteBuffer2.limit() - paramByteBuffer2.position();
        ByteBuffer localByteBuffer = ByteBuffer.allocate(i);
        b.doFinal(paramByteBuffer1, localByteBuffer);
        if (i == j)
        {
          paramByteBuffer2.put(localByteBuffer.array());
          return j;
        }
        if ((i == j + 1) && (localByteBuffer.array()[(i - 1)] == 0))
        {
          paramByteBuffer2.put(localByteBuffer.array(), 0, j);
          return j;
        }
      }
      catch (GeneralSecurityException paramByteBuffer1)
      {
        throw new org.a.b.c(paramByteBuffer1);
      }
      throw new org.a.b.c("Expected " + j + " bytes from encryption operation but got " + i);
    }
    
    public final org.a.d.f j_()
    {
      new org.a.d.f()
      {
        public final int a()
        {
          return 0;
        }
        
        public final void a_(ByteBuffer paramAnonymousByteBuffer) {}
        
        public final void b() {}
        
        public final void b(ByteBuffer paramAnonymousByteBuffer) {}
      };
    }
  }
}


/* Location:              org/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */