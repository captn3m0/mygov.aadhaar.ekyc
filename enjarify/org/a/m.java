package org.a;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.KeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import org.a.b.c;
import org.a.d.g;
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
      Object localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>(paramString);
      m localm = new org/a/m;
      localObject2 = "size";
      int m = ((JSONObject)localObject1).getInt((String)localObject2);
      Object localObject3 = "publicKey";
      localObject3 = ((JSONObject)localObject1).getJSONObject((String)localObject3);
      localObject3 = n.a((JSONObject)localObject3);
      String str1 = "privateExponent";
      str1 = ((JSONObject)localObject1).getString(str1);
      String str2 = "primeP";
      str2 = ((JSONObject)localObject1).getString(str2);
      String str3 = "primeQ";
      str3 = ((JSONObject)localObject1).getString(str3);
      String str4 = "primeExponentP";
      str4 = ((JSONObject)localObject1).getString(str4);
      String str5 = "primeExponentQ";
      str5 = ((JSONObject)localObject1).getString(str5);
      String str6 = "crtCoefficient";
      localObject1 = ((JSONObject)localObject1).getString(str6);
      localm.<init>(m, (n)localObject3, str1, str2, str3, str4, str5, (String)localObject1);
      return localm.e();
    }
    catch (JSONException localJSONException)
    {
      Object localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localJSONException);
      throw ((Throwable)localObject2);
    }
  }
  
  private m e()
  {
    a.e();
    Object localObject1 = "RSA";
    try
    {
      KeyFactory localKeyFactory = KeyFactory.getInstance((String)localObject1);
      localObject1 = new java/security/spec/RSAPrivateCrtKeySpec;
      localObject2 = a;
      localObject2 = b;
      localObject2 = b.a((String)localObject2);
      Object localObject3 = a;
      localObject3 = c;
      localObject3 = b.a((String)localObject3);
      Object localObject4 = c;
      localObject4 = b.a((String)localObject4);
      Object localObject5 = d;
      localObject5 = b.a((String)localObject5);
      Object localObject6 = h;
      localObject6 = b.a((String)localObject6);
      Object localObject7 = i;
      localObject7 = b.a((String)localObject7);
      Object localObject8 = j;
      localObject8 = b.a((String)localObject8);
      Object localObject9 = k;
      localObject9 = b.a((String)localObject9);
      ((RSAPrivateCrtKeySpec)localObject1).<init>((BigInteger)localObject2, (BigInteger)localObject3, (BigInteger)localObject4, (BigInteger)localObject5, (BigInteger)localObject6, (BigInteger)localObject7, (BigInteger)localObject8, (BigInteger)localObject9);
      localObject1 = localKeyFactory.generatePrivate((KeySpec)localObject1);
      localObject1 = (RSAPrivateCrtKey)localObject1;
      b = ((RSAPrivateCrtKey)localObject1);
      return this;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      Object localObject2 = new org/a/b/c;
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
    //   0: new 37	org/json/JSONObject
    //   3: astore_1
    //   4: aload_1
    //   5: invokespecial 128	org/json/JSONObject:<init>	()V
    //   8: ldc 42
    //   10: astore_2
    //   11: aload_0
    //   12: getfield 131	org/a/m:e	I
    //   15: istore_3
    //   16: aload_1
    //   17: aload_2
    //   18: iload_3
    //   19: invokevirtual 135	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   22: astore_2
    //   23: ldc 48
    //   25: astore 4
    //   27: aload_0
    //   28: getfield 21	org/a/m:a	Lorg/a/n;
    //   31: astore_1
    //   32: aload_1
    //   33: ifnull +123 -> 156
    //   36: aload_0
    //   37: getfield 21	org/a/m:a	Lorg/a/n;
    //   40: astore_1
    //   41: aload_1
    //   42: invokevirtual 138	org/a/n:b	()Lorg/json/JSONObject;
    //   45: astore_1
    //   46: aload_2
    //   47: aload 4
    //   49: aload_1
    //   50: invokevirtual 141	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   53: astore_1
    //   54: ldc 59
    //   56: astore_2
    //   57: aload_0
    //   58: getfield 23	org/a/m:c	Ljava/lang/String;
    //   61: astore 4
    //   63: aload_1
    //   64: aload_2
    //   65: aload 4
    //   67: invokevirtual 141	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   70: astore_1
    //   71: ldc 65
    //   73: astore_2
    //   74: aload_0
    //   75: getfield 25	org/a/m:d	Ljava/lang/String;
    //   78: astore 4
    //   80: aload_1
    //   81: aload_2
    //   82: aload 4
    //   84: invokevirtual 141	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   87: astore_1
    //   88: ldc 67
    //   90: astore_2
    //   91: aload_0
    //   92: getfield 27	org/a/m:h	Ljava/lang/String;
    //   95: astore 4
    //   97: aload_1
    //   98: aload_2
    //   99: aload 4
    //   101: invokevirtual 141	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   104: astore_1
    //   105: ldc 69
    //   107: astore_2
    //   108: aload_0
    //   109: getfield 29	org/a/m:i	Ljava/lang/String;
    //   112: astore 4
    //   114: aload_1
    //   115: aload_2
    //   116: aload 4
    //   118: invokevirtual 141	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   121: astore_1
    //   122: ldc 71
    //   124: astore_2
    //   125: aload_0
    //   126: getfield 31	org/a/m:j	Ljava/lang/String;
    //   129: astore 4
    //   131: aload_1
    //   132: aload_2
    //   133: aload 4
    //   135: invokevirtual 141	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   138: astore_1
    //   139: ldc 73
    //   141: astore_2
    //   142: aload_0
    //   143: getfield 33	org/a/m:k	Ljava/lang/String;
    //   146: astore 4
    //   148: aload_1
    //   149: aload_2
    //   150: aload 4
    //   152: invokevirtual 141	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   155: areturn
    //   156: aconst_null
    //   157: astore_1
    //   158: goto -112 -> 46
    //   161: astore_1
    //   162: new 82	java/lang/RuntimeException
    //   165: astore_2
    //   166: aload_2
    //   167: aload_1
    //   168: invokespecial 85	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   171: aload_2
    //   172: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	173	0	this	m
    //   3	155	1	localObject1	Object
    //   161	7	1	localJSONException	JSONException
    //   10	162	2	localObject2	Object
    //   15	4	3	m	int
    //   25	126	4	str	String
    // Exception table:
    //   from	to	target	type
    //   0	3	161	org/json/JSONException
    //   4	8	161	org/json/JSONException
    //   11	15	161	org/json/JSONException
    //   18	22	161	org/json/JSONException
    //   27	31	161	org/json/JSONException
    //   36	40	161	org/json/JSONException
    //   41	45	161	org/json/JSONException
    //   49	53	161	org/json/JSONException
    //   57	61	161	org/json/JSONException
    //   65	70	161	org/json/JSONException
    //   74	78	161	org/json/JSONException
    //   82	87	161	org/json/JSONException
    //   91	95	161	org/json/JSONException
    //   99	104	161	org/json/JSONException
    //   108	112	161	org/json/JSONException
    //   116	121	161	org/json/JSONException
    //   125	129	161	org/json/JSONException
    //   133	138	161	org/json/JSONException
    //   142	146	161	org/json/JSONException
    //   150	155	161	org/json/JSONException
  }
  
  protected final g c()
  {
    Object localObject = (g)g.poll();
    if (localObject != null) {}
    for (;;)
    {
      return (g)localObject;
      localObject = new org/a/m$a;
      ((m.a)localObject).<init>(this);
    }
  }
  
  protected final Iterable d()
  {
    return a.d();
  }
}


/* Location:              org/a/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */