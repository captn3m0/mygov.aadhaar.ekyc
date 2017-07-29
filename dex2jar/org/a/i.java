package org.a;

import org.a.a.c;
import org.json.JSONObject;

public final class i
{
  c a = c.b;
  int b = 0;
  private boolean c = false;
  
  public i(int paramInt, c paramc, boolean paramBoolean)
  {
    b = paramInt;
    a = paramc;
    c = paramBoolean;
  }
  
  /* Error */
  final JSONObject a()
  {
    // Byte code:
    //   0: new 31	org/json/JSONObject
    //   3: dup
    //   4: invokespecial 32	org/json/JSONObject:<init>	()V
    //   7: ldc 34
    //   9: aload_0
    //   10: getfield 25	org/a/i:b	I
    //   13: invokevirtual 38	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   16: astore_2
    //   17: aload_0
    //   18: getfield 23	org/a/i:a	Lorg/a/a/c;
    //   21: ifnull +30 -> 51
    //   24: aload_0
    //   25: getfield 23	org/a/i:a	Lorg/a/a/c;
    //   28: invokevirtual 42	org/a/a/c:name	()Ljava/lang/String;
    //   31: astore_1
    //   32: aload_2
    //   33: ldc 44
    //   35: aload_1
    //   36: invokevirtual 47	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   39: ldc 49
    //   41: aload_0
    //   42: getfield 17	org/a/i:c	Z
    //   45: invokevirtual 52	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   48: astore_1
    //   49: aload_1
    //   50: areturn
    //   51: aconst_null
    //   52: astore_1
    //   53: goto -21 -> 32
    //   56: astore_1
    //   57: new 54	java/lang/RuntimeException
    //   60: dup
    //   61: aload_1
    //   62: invokespecial 57	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   65: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	i
    //   31	22	1	localObject	Object
    //   56	6	1	localJSONException	org.json.JSONException
    //   16	17	2	localJSONObject	JSONObject
    // Exception table:
    //   from	to	target	type
    //   0	32	56	org/json/JSONException
    //   32	49	56	org/json/JSONException
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof i)) {}
    do
    {
      return false;
      paramObject = (i)paramObject;
    } while (b != b);
    return true;
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */