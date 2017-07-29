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
  org.a.a.b b = org.a.a.b.e;
  d c = c.i;
  List<i> d = new ArrayList();
  boolean e = false;
  protected Map<Integer, i> f = new HashMap();
  
  private h(String paramString, org.a.a.b paramb, d paramd, List<i> paramList, boolean paramBoolean)
  {
    a = paramString;
    b = paramb;
    c = paramd;
    d = paramList;
    e = paramBoolean;
  }
  
  private static List<i> a(JSONArray paramJSONArray)
  {
    ArrayList localArrayList = new ArrayList();
    int j = paramJSONArray.length();
    int i = 0;
    while (i < j)
    {
      JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
      localArrayList.add(new i(localJSONObject.getInt("versionNumber"), (org.a.a.c)org.a.e.b.a(org.a.a.c.class, localJSONObject.optString("status")), localJSONObject.getBoolean("exportable")));
      i += 1;
    }
    return localArrayList;
  }
  
  public static h a(String paramString)
  {
    try
    {
      paramString = new JSONObject(paramString);
      Object localObject1 = paramString.getString("name");
      Object localObject2 = (org.a.a.b)org.a.e.b.a(org.a.a.b.class, paramString.optString("purpose"));
      new d.b();
      paramString = new h((String)localObject1, (org.a.a.b)localObject2, d.b.a(paramString.getString("type")), a(paramString.getJSONArray("versions")), paramString.getBoolean("encrypted"));
      localObject1 = d.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (i)((Iterator)localObject1).next();
        f.put(Integer.valueOf(b), localObject2);
      }
      return paramString;
    }
    catch (JSONException paramString)
    {
      throw new RuntimeException(paramString);
    }
  }
  
  private JSONArray a()
  {
    JSONArray localJSONArray = new JSONArray();
    int j = d.size();
    int i = 0;
    while (i < j)
    {
      localJSONArray.put(((i)d.get(i)).a());
      i += 1;
    }
    return localJSONArray;
  }
  
  /* Error */
  public final String toString()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 73	org/json/JSONObject
    //   5: dup
    //   6: invokespecial 191	org/json/JSONObject:<init>	()V
    //   9: ldc 114
    //   11: aload_0
    //   12: getfield 27	org/a/h:a	Ljava/lang/String;
    //   15: invokevirtual 194	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   18: astore_3
    //   19: aload_0
    //   20: getfield 33	org/a/h:b	Lorg/a/a/b;
    //   23: ifnull +69 -> 92
    //   26: aload_0
    //   27: getfield 33	org/a/h:b	Lorg/a/a/b;
    //   30: invokevirtual 196	org/a/a/b:name	()Ljava/lang/String;
    //   33: astore_1
    //   34: aload_3
    //   35: ldc 119
    //   37: aload_1
    //   38: invokevirtual 194	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   41: astore_3
    //   42: aload_2
    //   43: astore_1
    //   44: aload_0
    //   45: getfield 41	org/a/h:c	Lorg/a/d/d;
    //   48: ifnull +13 -> 61
    //   51: aload_0
    //   52: getfield 41	org/a/h:c	Lorg/a/d/d;
    //   55: invokeinterface 200 1 0
    //   60: astore_1
    //   61: aload_3
    //   62: ldc 124
    //   64: aload_1
    //   65: invokevirtual 194	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   68: ldc -127
    //   70: aload_0
    //   71: invokespecial 202	org/a/h:a	()Lorg/json/JSONArray;
    //   74: invokevirtual 194	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   77: ldc -119
    //   79: aload_0
    //   80: getfield 48	org/a/h:e	Z
    //   83: invokevirtual 205	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   86: invokevirtual 207	org/json/JSONObject:toString	()Ljava/lang/String;
    //   89: astore_1
    //   90: aload_1
    //   91: areturn
    //   92: aconst_null
    //   93: astore_1
    //   94: goto -60 -> 34
    //   97: astore_1
    //   98: new 170	java/lang/RuntimeException
    //   101: dup
    //   102: aload_1
    //   103: invokespecial 173	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   106: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	this	h
    //   33	61	1	localObject1	Object
    //   97	6	1	localJSONException	JSONException
    //   1	42	2	localObject2	Object
    //   18	44	3	localJSONObject	JSONObject
    // Exception table:
    //   from	to	target	type
    //   2	34	97	org/json/JSONException
    //   34	42	97	org/json/JSONException
    //   44	61	97	org/json/JSONException
    //   61	90	97	org/json/JSONException
  }
}


/* Location:              org/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */