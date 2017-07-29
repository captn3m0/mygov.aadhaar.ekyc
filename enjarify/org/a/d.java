package org.a;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAPrivateKeySpec;
import org.a.b.c;
import org.a.d.g;
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
      Object localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>(paramString);
      localObject2 = new org/a/d;
      String str1 = "size";
      int i = ((JSONObject)localObject1).getInt(str1);
      Object localObject3 = "publicKey";
      localObject3 = ((JSONObject)localObject1).getJSONObject((String)localObject3);
      localObject3 = e.a((JSONObject)localObject3);
      String str2 = "x";
      localObject1 = ((JSONObject)localObject1).getString(str2);
      ((d)localObject2).<init>(i, (e)localObject3, (String)localObject1);
      return ((d)localObject2).e();
    }
    catch (JSONException localJSONException)
    {
      Object localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localJSONException);
      throw ((Throwable)localObject2);
    }
  }
  
  private d e()
  {
    a.e();
    Object localObject1 = new java/math/BigInteger;
    Object localObject2 = a.a(c);
    ((BigInteger)localObject1).<init>((byte[])localObject2);
    localObject2 = new java/math/BigInteger;
    Object localObject3 = a.a(a.b);
    ((BigInteger)localObject2).<init>((byte[])localObject3);
    localObject3 = new java/math/BigInteger;
    Object localObject4 = a.a(a.c);
    ((BigInteger)localObject3).<init>((byte[])localObject4);
    localObject4 = new java/math/BigInteger;
    Object localObject5 = a.a(a.d);
    ((BigInteger)localObject4).<init>((byte[])localObject5);
    localObject5 = "DSA";
    try
    {
      localObject5 = KeyFactory.getInstance((String)localObject5);
      DSAPrivateKeySpec localDSAPrivateKeySpec = new java/security/spec/DSAPrivateKeySpec;
      localDSAPrivateKeySpec.<init>((BigInteger)localObject1, (BigInteger)localObject2, (BigInteger)localObject3, (BigInteger)localObject4);
      localObject1 = ((KeyFactory)localObject5).generatePrivate(localDSAPrivateKeySpec);
      localObject1 = (DSAPrivateKey)localObject1;
      b = ((DSAPrivateKey)localObject1);
      return this;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      localObject2 = new org/a/b/c;
      ((c)localObject2).<init>(localGeneralSecurityException);
      throw ((Throwable)localObject2);
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
    //   0: new 20	org/json/JSONObject
    //   3: astore_1
    //   4: aload_1
    //   5: invokespecial 112	org/json/JSONObject:<init>	()V
    //   8: ldc 25
    //   10: astore_2
    //   11: aload_0
    //   12: getfield 115	org/a/d:e	I
    //   15: istore_3
    //   16: aload_1
    //   17: aload_2
    //   18: iload_3
    //   19: invokevirtual 119	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   22: astore_2
    //   23: ldc 31
    //   25: astore 4
    //   27: aload_0
    //   28: getfield 16	org/a/d:a	Lorg/a/e;
    //   31: astore_1
    //   32: aload_1
    //   33: ifnull +38 -> 71
    //   36: aload_0
    //   37: getfield 16	org/a/d:a	Lorg/a/e;
    //   40: astore_1
    //   41: aload_1
    //   42: invokevirtual 122	org/a/e:b	()Lorg/json/JSONObject;
    //   45: astore_1
    //   46: aload_2
    //   47: aload 4
    //   49: aload_1
    //   50: invokevirtual 125	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   53: astore_1
    //   54: ldc 42
    //   56: astore_2
    //   57: aload_0
    //   58: getfield 18	org/a/d:c	Ljava/lang/String;
    //   61: astore 4
    //   63: aload_1
    //   64: aload_2
    //   65: aload 4
    //   67: invokevirtual 125	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   70: areturn
    //   71: aconst_null
    //   72: astore_1
    //   73: goto -27 -> 46
    //   76: astore_1
    //   77: new 55	java/lang/RuntimeException
    //   80: astore_2
    //   81: aload_2
    //   82: aload_1
    //   83: invokespecial 58	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   86: aload_2
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	d
    //   3	70	1	localObject1	Object
    //   76	7	1	localJSONException	JSONException
    //   10	77	2	localObject2	Object
    //   15	4	3	i	int
    //   25	41	4	str	String
    // Exception table:
    //   from	to	target	type
    //   0	3	76	org/json/JSONException
    //   4	8	76	org/json/JSONException
    //   11	15	76	org/json/JSONException
    //   18	22	76	org/json/JSONException
    //   27	31	76	org/json/JSONException
    //   36	40	76	org/json/JSONException
    //   41	45	76	org/json/JSONException
    //   49	53	76	org/json/JSONException
    //   57	61	76	org/json/JSONException
    //   65	70	76	org/json/JSONException
  }
  
  protected final g c()
  {
    Object localObject = (g)g.poll();
    if (localObject != null) {}
    for (;;)
    {
      return (g)localObject;
      localObject = new org/a/d$a;
      ((d.a)localObject).<init>(this);
    }
  }
  
  protected final Iterable d()
  {
    return a.d();
  }
}


/* Location:              org/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */