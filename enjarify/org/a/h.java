package org.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.a.d.d;
import org.a.d.d.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class h
{
  String a = "";
  org.a.a.b b;
  d c;
  List d;
  boolean e;
  protected Map f;
  
  private h(String paramString, org.a.a.b paramb, d paramd, List paramList, boolean paramBoolean)
  {
    Object localObject = org.a.a.b.e;
    b = ((org.a.a.b)localObject);
    localObject = c.i;
    c = ((d)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    d = ((List)localObject);
    e = false;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    f = ((Map)localObject);
    a = paramString;
    b = paramb;
    c = paramd;
    d = paramList;
    e = paramBoolean;
  }
  
  private static List a(JSONArray paramJSONArray)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = paramJSONArray.length();
    int j = 0;
    org.a.a.c localc = null;
    for (int k = 0; k < i; k = j)
    {
      JSONObject localJSONObject = paramJSONArray.getJSONObject(k);
      i locali = new org/a/i;
      int m = localJSONObject.getInt("versionNumber");
      String str = localJSONObject.optString("status");
      localc = (org.a.a.c)org.a.e.b.a(org.a.a.c.class, str);
      str = "exportable";
      boolean bool = localJSONObject.getBoolean(str);
      locali.<init>(m, localc, bool);
      localArrayList.add(locali);
      j = k + 1;
    }
    return localArrayList;
  }
  
  public static h a(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      h localh = new org/a/h;
      Object localObject1 = "name";
      localObject1 = localJSONObject.getString((String)localObject1);
      Object localObject2 = org.a.a.b.class;
      Object localObject3 = "purpose";
      localObject3 = localJSONObject.optString((String)localObject3);
      localObject2 = org.a.e.b.a((Class)localObject2, (String)localObject3);
      localObject2 = (org.a.a.b)localObject2;
      localObject3 = new org/a/d/d$b;
      ((d.b)localObject3).<init>();
      localObject3 = "type";
      localObject3 = localJSONObject.getString((String)localObject3);
      localObject3 = d.b.a((String)localObject3);
      Object localObject4 = "versions";
      localObject4 = localJSONObject.getJSONArray((String)localObject4);
      localObject4 = a((JSONArray)localObject4);
      String str = "encrypted";
      boolean bool1 = localJSONObject.getBoolean(str);
      localh.<init>((String)localObject1, (org.a.a.b)localObject2, (d)localObject3, (List)localObject4, bool1);
      localObject1 = d;
      localObject2 = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject2).hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = ((Iterator)localObject2).next();
        localObject1 = (i)localObject1;
        localObject3 = f;
        int i = b;
        localObject4 = Integer.valueOf(i);
        ((Map)localObject3).put(localObject4, localObject1);
      }
      return localJSONException;
    }
    catch (JSONException localJSONException)
    {
      localObject1 = new java/lang/RuntimeException;
      ((RuntimeException)localObject1).<init>(localJSONException);
      throw ((Throwable)localObject1);
    }
  }
  
  private JSONArray a()
  {
    JSONArray localJSONArray = new org/json/JSONArray;
    localJSONArray.<init>();
    int i = d.size();
    int j = 0;
    JSONObject localJSONObject = null;
    for (int k = 0; k < i; k = j)
    {
      localJSONObject = ((i)d.get(k)).a();
      localJSONArray.put(localJSONObject);
      j = k + 1;
    }
    return localJSONArray;
  }
  
  /* Error */
  public final String toString()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 66	org/json/JSONObject
    //   5: astore_2
    //   6: aload_2
    //   7: invokespecial 181	org/json/JSONObject:<init>	()V
    //   10: ldc 103
    //   12: astore_3
    //   13: aload_0
    //   14: getfield 24	org/a/h:a	Ljava/lang/String;
    //   17: astore 4
    //   19: aload_2
    //   20: aload_3
    //   21: aload 4
    //   23: invokevirtual 184	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   26: astore_3
    //   27: ldc 108
    //   29: astore 4
    //   31: aload_0
    //   32: getfield 30	org/a/h:b	Lorg/a/a/b;
    //   35: astore_2
    //   36: aload_2
    //   37: ifnull +91 -> 128
    //   40: aload_0
    //   41: getfield 30	org/a/h:b	Lorg/a/a/b;
    //   44: astore_2
    //   45: aload_2
    //   46: invokevirtual 187	org/a/a/b:name	()Ljava/lang/String;
    //   49: astore_2
    //   50: aload_3
    //   51: aload 4
    //   53: aload_2
    //   54: invokevirtual 184	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   57: astore_2
    //   58: ldc 113
    //   60: astore_3
    //   61: aload_0
    //   62: getfield 38	org/a/h:c	Lorg/a/d/d;
    //   65: astore 4
    //   67: aload 4
    //   69: ifnull +15 -> 84
    //   72: aload_0
    //   73: getfield 38	org/a/h:c	Lorg/a/d/d;
    //   76: astore_1
    //   77: aload_1
    //   78: invokeinterface 191 1 0
    //   83: astore_1
    //   84: aload_2
    //   85: aload_3
    //   86: aload_1
    //   87: invokevirtual 184	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   90: astore_1
    //   91: ldc 118
    //   93: astore_2
    //   94: aload_0
    //   95: invokespecial 194	org/a/h:a	()Lorg/json/JSONArray;
    //   98: astore_3
    //   99: aload_1
    //   100: aload_2
    //   101: aload_3
    //   102: invokevirtual 184	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   105: astore_1
    //   106: ldc 127
    //   108: astore_2
    //   109: aload_0
    //   110: getfield 45	org/a/h:e	Z
    //   113: istore 5
    //   115: aload_1
    //   116: aload_2
    //   117: iload 5
    //   119: invokevirtual 197	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   122: astore_1
    //   123: aload_1
    //   124: invokevirtual 200	org/json/JSONObject:toString	()Ljava/lang/String;
    //   127: areturn
    //   128: aconst_null
    //   129: astore_2
    //   130: goto -80 -> 50
    //   133: astore_1
    //   134: new 161	java/lang/RuntimeException
    //   137: astore_2
    //   138: aload_2
    //   139: aload_1
    //   140: invokespecial 164	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   143: aload_2
    //   144: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	this	h
    //   1	123	1	localObject1	Object
    //   133	7	1	localJSONException	JSONException
    //   5	139	2	localObject2	Object
    //   12	90	3	localObject3	Object
    //   17	51	4	localObject4	Object
    //   113	5	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	5	133	org/json/JSONException
    //   6	10	133	org/json/JSONException
    //   13	17	133	org/json/JSONException
    //   21	26	133	org/json/JSONException
    //   31	35	133	org/json/JSONException
    //   40	44	133	org/json/JSONException
    //   45	49	133	org/json/JSONException
    //   53	57	133	org/json/JSONException
    //   61	65	133	org/json/JSONException
    //   72	76	133	org/json/JSONException
    //   77	83	133	org/json/JSONException
    //   86	90	133	org/json/JSONException
    //   94	98	133	org/json/JSONException
    //   101	105	133	org/json/JSONException
    //   109	113	133	org/json/JSONException
    //   117	122	133	org/json/JSONException
    //   123	127	133	org/json/JSONException
  }
}


/* Location:              org/a/h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */