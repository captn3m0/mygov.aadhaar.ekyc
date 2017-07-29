package org.a;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.KeySpec;
import java.security.spec.RSAPublicKeySpec;
import org.a.a.d.1;
import org.a.b.f;
import org.a.d.g;
import org.a.e.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class n
  extends l
{
  RSAPublicKey a;
  final String b;
  final String c;
  final org.a.a.d d;
  private final byte[] h;
  
  private n(int paramInt, String paramString1, String paramString2, org.a.a.d paramd)
  {
    super(paramInt);
    byte[] arrayOfByte = new byte[4];
    h = arrayOfByte;
    b = paramString1;
    c = paramString2;
    d = paramd;
  }
  
  static n a(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      return a(localJSONObject);
    }
    catch (JSONException localJSONException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localJSONException);
      throw localRuntimeException;
    }
  }
  
  static n a(JSONObject paramJSONObject)
  {
    Object localObject1 = new org/a/n;
    int i = paramJSONObject.getInt("size");
    String str1 = paramJSONObject.getString("modulus");
    String str2 = paramJSONObject.getString("publicExponent");
    String str3 = paramJSONObject.optString("padding");
    Object localObject2 = (org.a.a.d)b.a(org.a.a.d.class, str3);
    ((n)localObject1).<init>(i, str1, str2, (org.a.a.d)localObject2);
    localObject2 = c.f;
    c localc = c.f;
    if (localObject2 != localc)
    {
      localObject2 = new org/a/b/f;
      localObject1 = c.f;
      ((f)localObject2).<init>((org.a.d.d)localObject1);
      throw ((Throwable)localObject2);
    }
    return ((n)localObject1).e();
  }
  
  public final byte[] a()
  {
    return h;
  }
  
  /* Error */
  final JSONObject b()
  {
    // Byte code:
    //   0: new 28	org/json/JSONObject
    //   3: astore_1
    //   4: aload_1
    //   5: invokespecial 88	org/json/JSONObject:<init>	()V
    //   8: ldc 43
    //   10: astore_2
    //   11: aload_0
    //   12: getfield 91	org/a/n:e	I
    //   15: istore_3
    //   16: aload_1
    //   17: aload_2
    //   18: iload_3
    //   19: invokevirtual 95	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   22: astore_1
    //   23: ldc 49
    //   25: astore_2
    //   26: aload_0
    //   27: getfield 22	org/a/n:b	Ljava/lang/String;
    //   30: astore 4
    //   32: aload_1
    //   33: aload_2
    //   34: aload 4
    //   36: invokevirtual 98	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   39: astore_1
    //   40: ldc 55
    //   42: astore_2
    //   43: aload_0
    //   44: getfield 24	org/a/n:c	Ljava/lang/String;
    //   47: astore 4
    //   49: aload_1
    //   50: aload_2
    //   51: aload 4
    //   53: invokevirtual 98	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   56: astore_2
    //   57: ldc 59
    //   59: astore 4
    //   61: aload_0
    //   62: getfield 26	org/a/n:d	Lorg/a/a/d;
    //   65: astore_1
    //   66: aload_1
    //   67: ifnull +21 -> 88
    //   70: aload_0
    //   71: getfield 26	org/a/n:d	Lorg/a/a/d;
    //   74: astore_1
    //   75: aload_1
    //   76: invokevirtual 102	org/a/a/d:name	()Ljava/lang/String;
    //   79: astore_1
    //   80: aload_2
    //   81: aload 4
    //   83: aload_1
    //   84: invokevirtual 98	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   87: areturn
    //   88: aconst_null
    //   89: astore_1
    //   90: goto -10 -> 80
    //   93: astore_1
    //   94: new 36	java/lang/RuntimeException
    //   97: astore_2
    //   98: aload_2
    //   99: aload_1
    //   100: invokespecial 39	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   103: aload_2
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	n
    //   3	87	1	localObject1	Object
    //   93	7	1	localJSONException	JSONException
    //   10	94	2	localObject2	Object
    //   15	4	3	i	int
    //   30	52	4	str	String
    // Exception table:
    //   from	to	target	type
    //   0	3	93	org/json/JSONException
    //   4	8	93	org/json/JSONException
    //   11	15	93	org/json/JSONException
    //   18	22	93	org/json/JSONException
    //   26	30	93	org/json/JSONException
    //   34	39	93	org/json/JSONException
    //   43	47	93	org/json/JSONException
    //   51	56	93	org/json/JSONException
    //   61	65	93	org/json/JSONException
    //   70	74	93	org/json/JSONException
    //   75	79	93	org/json/JSONException
    //   83	87	93	org/json/JSONException
  }
  
  protected final g c()
  {
    Object localObject = (g)g.poll();
    if (localObject != null) {}
    for (;;)
    {
      return (g)localObject;
      localObject = new org/a/n$a;
      ((n.a)localObject).<init>(this);
    }
  }
  
  public final Iterable d()
  {
    return super.d();
  }
  
  final n e()
  {
    int i = 2;
    int j = 1;
    Object localObject1 = b.a(b);
    Object localObject3 = b.a(c);
    try
    {
      localObject4 = new java/security/spec/RSAPublicKeySpec;
      ((RSAPublicKeySpec)localObject4).<init>((BigInteger)localObject1, (BigInteger)localObject3);
      localObject1 = "RSA";
      localObject1 = KeyFactory.getInstance((String)localObject1);
      localObject1 = ((KeyFactory)localObject1).generatePublic((KeySpec)localObject4);
      localObject1 = (RSAPublicKey)localObject1;
      a = ((RSAPublicKey)localObject1);
      localObject1 = g();
      localObject3 = a;
      localObject4 = d.1.a;
      int k = ((org.a.a.d)localObject1).ordinal();
      k = localObject4[k];
      switch (k)
      {
      default: 
        localObject1 = new org/a/b/c;
        ((org.a.b.c)localObject1).<init>("Bug! Unknown padding type");
        throw ((Throwable)localObject1);
      }
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      localObject3 = new org/a/b/c;
      ((org.a.b.c)localObject3).<init>(localGeneralSecurityException);
      throw ((Throwable)localObject3);
    }
    Object localObject2 = new byte[i][];
    Object localObject4 = b.a(((RSAPublicKey)localObject3).getModulus().toByteArray());
    localObject2[0] = localObject4;
    localObject3 = b.a(((RSAPublicKey)localObject3).getPublicExponent().toByteArray());
    localObject2[j] = localObject3;
    for (localObject2 = b.a((byte[][])localObject2);; localObject2 = b.a((byte[][])localObject2))
    {
      localObject3 = h;
      int m = h.length;
      System.arraycopy(localObject2, 0, localObject3, 0, m);
      return this;
      localObject2 = new byte[i][];
      localObject4 = ((RSAPublicKey)localObject3).getModulus().toByteArray();
      localObject2[0] = localObject4;
      localObject3 = ((RSAPublicKey)localObject3).getPublicExponent().toByteArray();
      localObject2[j] = localObject3;
    }
  }
  
  final int f()
  {
    return a.getModulus().bitLength() / 8;
  }
  
  public final org.a.a.d g()
  {
    org.a.a.d locald1 = d;
    if (locald1 != null)
    {
      locald1 = d;
      org.a.a.d locald2 = org.a.a.d.a;
      if (locald1 != locald2) {
        break label29;
      }
    }
    label29:
    for (locald1 = org.a.a.d.a;; locald1 = org.a.a.d.b) {
      return locald1;
    }
  }
}


/* Location:              org/a/n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */