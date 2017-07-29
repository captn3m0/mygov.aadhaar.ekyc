package org.a;

import org.a.a.c;
import org.json.JSONObject;

public final class i
{
  c a;
  int b;
  private boolean c = false;
  
  public i(int paramInt, c paramc, boolean paramBoolean)
  {
    c localc = c.b;
    a = localc;
    b = 0;
    b = paramInt;
    a = paramc;
    c = paramBoolean;
  }
  
  /* Error */
  final JSONObject a()
  {
    // Byte code:
    //   0: new 26	org/json/JSONObject
    //   3: astore_1
    //   4: aload_1
    //   5: invokespecial 27	org/json/JSONObject:<init>	()V
    //   8: ldc 29
    //   10: astore_2
    //   11: aload_0
    //   12: getfield 24	org/a/i:b	I
    //   15: istore_3
    //   16: aload_1
    //   17: aload_2
    //   18: iload_3
    //   19: invokevirtual 33	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   22: astore_2
    //   23: ldc 35
    //   25: astore 4
    //   27: aload_0
    //   28: getfield 22	org/a/i:a	Lorg/a/a/c;
    //   31: astore_1
    //   32: aload_1
    //   33: ifnull +36 -> 69
    //   36: aload_0
    //   37: getfield 22	org/a/i:a	Lorg/a/a/c;
    //   40: astore_1
    //   41: aload_1
    //   42: invokevirtual 39	org/a/a/c:name	()Ljava/lang/String;
    //   45: astore_1
    //   46: aload_2
    //   47: aload 4
    //   49: aload_1
    //   50: invokevirtual 42	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   53: astore_1
    //   54: ldc 44
    //   56: astore_2
    //   57: aload_0
    //   58: getfield 16	org/a/i:c	Z
    //   61: istore_3
    //   62: aload_1
    //   63: aload_2
    //   64: iload_3
    //   65: invokevirtual 47	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   68: areturn
    //   69: aconst_null
    //   70: astore_1
    //   71: goto -25 -> 46
    //   74: astore_1
    //   75: new 49	java/lang/RuntimeException
    //   78: astore_2
    //   79: aload_2
    //   80: aload_1
    //   81: invokespecial 52	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   84: aload_2
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	i
    //   3	68	1	localObject1	Object
    //   74	7	1	localJSONException	org.json.JSONException
    //   10	75	2	localObject2	Object
    //   15	4	3	i	int
    //   61	4	3	bool	boolean
    //   25	23	4	str	String
    // Exception table:
    //   from	to	target	type
    //   0	3	74	org/json/JSONException
    //   4	8	74	org/json/JSONException
    //   11	15	74	org/json/JSONException
    //   18	22	74	org/json/JSONException
    //   27	31	74	org/json/JSONException
    //   36	40	74	org/json/JSONException
    //   41	45	74	org/json/JSONException
    //   49	53	74	org/json/JSONException
    //   57	61	74	org/json/JSONException
    //   64	68	74	org/json/JSONException
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof i;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      paramObject = (i)paramObject;
      int i = b;
      int j = b;
      if (i == j) {
        bool1 = true;
      }
    }
  }
  
  public final int hashCode()
  {
    return b;
  }
  
  public final String toString()
  {
    return a().toString();
  }
}


/* Location:              org/a/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */