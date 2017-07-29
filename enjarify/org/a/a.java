package org.a;

import java.util.ArrayList;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.a.e.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  extends k
{
  private static final c a = c.a;
  private static final org.a.a.a b = org.a.a.a.a;
  private SecretKey c;
  private final String d;
  private final g h;
  private final org.a.a.a i;
  private final byte[] j;
  
  private a(int paramInt, String paramString, g paramg, org.a.a.a parama)
  {
    super(paramInt);
    byte[] arrayOfByte = new byte[4];
    j = arrayOfByte;
    d = paramString;
    h = paramg;
    i = parama;
  }
  
  static a a(String paramString)
  {
    try
    {
      Object localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>(paramString);
      localObject2 = new org/a/a;
      Object localObject3 = "size";
      int k = ((JSONObject)localObject1).getInt((String)localObject3);
      Object localObject4 = "aesKeyString";
      localObject4 = ((JSONObject)localObject1).getString((String)localObject4);
      Object localObject5 = "hmacKey";
      localObject5 = ((JSONObject)localObject1).getJSONObject((String)localObject5);
      localObject5 = g.a((JSONObject)localObject5);
      Object localObject6 = org.a.a.a.class;
      String str = "mode";
      localObject1 = ((JSONObject)localObject1).getString(str);
      localObject1 = b.a((Class)localObject6, (String)localObject1);
      localObject1 = (org.a.a.a)localObject1;
      ((a)localObject2).<init>(k, (String)localObject4, (g)localObject5, (org.a.a.a)localObject1);
      localObject1 = h;
      ((g)localObject1).e();
      localObject1 = d;
      localObject1 = org.a.e.a.a((String)localObject1);
      localObject3 = new javax/crypto/spec/SecretKeySpec;
      localObject4 = "AES";
      ((SecretKeySpec)localObject3).<init>((byte[])localObject1, (String)localObject4);
      c = ((SecretKey)localObject3);
      k = 3;
      localObject3 = new byte[k][];
      int m = 0;
      localObject4 = null;
      int n = localObject1.length;
      localObject5 = b.a(n);
      localObject3[0] = localObject5;
      m = 1;
      localObject3[m] = localObject1;
      m = 2;
      localObject5 = h;
      localObject5 = ((g)localObject5).f();
      localObject3[m] = localObject5;
      localObject3 = b.b((byte[][])localObject3);
      m = localObject1.length;
      n = 16;
      int i2;
      if (m != n)
      {
        m = 3;
        localObject4 = new byte[m][];
        n = 0;
        localObject5 = null;
        i1 = 16;
        localObject6 = b.a(i1);
        localObject4[0] = localObject6;
        n = 1;
        localObject4[n] = localObject1;
        n = 2;
        localObject6 = h;
        localObject6 = ((g)localObject6).f();
        localObject4[n] = localObject6;
        localObject4 = b.b((byte[][])localObject4);
        n = 4;
        localObject5 = new byte[n];
        i1 = 0;
        localObject6 = null;
        i2 = 0;
        str = null;
        int i3 = 4;
        System.arraycopy(localObject4, 0, localObject5, 0, i3);
        localObject4 = f;
        ((ArrayList)localObject4).add(localObject5);
      }
      m = 0;
      localObject4 = null;
      m = localObject1[0];
      if (m == 0)
      {
        localObject1 = b.a((byte[])localObject1);
        m = 3;
        localObject4 = new byte[m][];
        n = 0;
        localObject5 = null;
        i1 = localObject1.length;
        localObject6 = b.a(i1);
        localObject4[0] = localObject6;
        n = 1;
        localObject4[n] = localObject1;
        i4 = 2;
        localObject5 = h;
        localObject5 = ((g)localObject5).f();
        localObject4[i4] = localObject5;
        localObject1 = b.b((byte[][])localObject4);
        m = 4;
        localObject4 = new byte[m];
        n = 0;
        localObject5 = null;
        i1 = 0;
        localObject6 = null;
        i2 = 4;
        System.arraycopy(localObject1, 0, localObject4, 0, i2);
        localObject1 = f;
        ((ArrayList)localObject1).add(localObject4);
      }
      int i4 = 0;
      localObject1 = null;
      localObject4 = j;
      n = 0;
      localObject5 = null;
      localObject6 = j;
      int i1 = localObject6.length;
      System.arraycopy(localObject3, 0, localObject4, 0, i1);
      return (a)localObject2;
    }
    catch (JSONException localJSONException)
    {
      Object localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localJSONException);
      throw ((Throwable)localObject2);
    }
  }
  
  protected final byte[] a()
  {
    return j;
  }
  
  /* Error */
  final JSONObject b()
  {
    // Byte code:
    //   0: new 43	org/json/JSONObject
    //   3: astore_1
    //   4: aload_1
    //   5: invokespecial 139	org/json/JSONObject:<init>	()V
    //   8: ldc 48
    //   10: astore_2
    //   11: aload_0
    //   12: getfield 142	org/a/a:e	I
    //   15: istore_3
    //   16: aload_1
    //   17: aload_2
    //   18: iload_3
    //   19: invokevirtual 146	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   22: astore_1
    //   23: ldc 54
    //   25: astore_2
    //   26: aload_0
    //   27: getfield 37	org/a/a:d	Ljava/lang/String;
    //   30: astore 4
    //   32: aload_1
    //   33: aload_2
    //   34: aload 4
    //   36: invokevirtual 149	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   39: astore_2
    //   40: ldc 60
    //   42: astore 4
    //   44: aload_0
    //   45: getfield 39	org/a/a:h	Lorg/a/g;
    //   48: astore_1
    //   49: aload_1
    //   50: ifnull +45 -> 95
    //   53: aload_0
    //   54: getfield 39	org/a/a:h	Lorg/a/g;
    //   57: astore_1
    //   58: aload_1
    //   59: invokevirtual 152	org/a/g:b	()Lorg/json/JSONObject;
    //   62: astore_1
    //   63: aload_2
    //   64: aload 4
    //   66: aload_1
    //   67: invokevirtual 149	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   70: astore_1
    //   71: ldc 71
    //   73: astore_2
    //   74: aload_0
    //   75: getfield 41	org/a/a:i	Lorg/a/a/a;
    //   78: astore 4
    //   80: aload 4
    //   82: invokevirtual 156	org/a/a/a:name	()Ljava/lang/String;
    //   85: astore 4
    //   87: aload_1
    //   88: aload_2
    //   89: aload 4
    //   91: invokevirtual 149	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   94: areturn
    //   95: aconst_null
    //   96: astore_1
    //   97: goto -34 -> 63
    //   100: astore_1
    //   101: new 132	java/lang/RuntimeException
    //   104: astore_2
    //   105: aload_2
    //   106: aload_1
    //   107: invokespecial 135	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   110: aload_2
    //   111: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	this	a
    //   3	94	1	localObject1	Object
    //   100	7	1	localJSONException	JSONException
    //   10	101	2	localObject2	Object
    //   15	4	3	k	int
    //   30	60	4	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   0	3	100	org/json/JSONException
    //   4	8	100	org/json/JSONException
    //   11	15	100	org/json/JSONException
    //   18	22	100	org/json/JSONException
    //   26	30	100	org/json/JSONException
    //   34	39	100	org/json/JSONException
    //   44	48	100	org/json/JSONException
    //   53	57	100	org/json/JSONException
    //   58	62	100	org/json/JSONException
    //   66	70	100	org/json/JSONException
    //   74	78	100	org/json/JSONException
    //   80	85	100	org/json/JSONException
    //   89	94	100	org/json/JSONException
  }
  
  protected final org.a.d.g c()
  {
    Object localObject = (org.a.d.g)g.poll();
    if (localObject != null) {}
    for (;;)
    {
      return (org.a.d.g)localObject;
      localObject = new org/a/a$a;
      ((a.a)localObject).<init>(this);
    }
  }
}


/* Location:              org/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */