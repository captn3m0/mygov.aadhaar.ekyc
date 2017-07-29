package com.google.android.gms.b;

import android.content.Context;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class me
  implements md
{
  private final Context a;
  private final un b;
  
  public me(Context paramContext, un paramun)
  {
    a = paramContext;
    b = paramun;
  }
  
  private static me.b a(JSONObject paramJSONObject)
  {
    Object localObject1 = null;
    String str1 = paramJSONObject.optString("http_request_id");
    String str2 = paramJSONObject.optString("url");
    Object localObject2 = "post_body";
    String str3 = paramJSONObject.optString((String)localObject2, null);
    try
    {
      localObject2 = new java/net/URL;
      ((URL)localObject2).<init>(str2);
    }
    catch (MalformedURLException localMalformedURLException)
    {
      ArrayList localArrayList;
      URL localURL;
      for (;;)
      {
        int i;
        str2 = "Error constructing http request.";
        tp.b(str2, localMalformedURLException);
        localURL = null;
      }
      localObject1 = new com/google/android/gms/b/me$b;
      ((me.b)localObject1).<init>(str1, localURL, localArrayList, str3);
    }
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localObject1 = paramJSONObject.optJSONArray("headers");
    if (localObject1 == null)
    {
      localObject1 = new org/json/JSONArray;
      ((JSONArray)localObject1).<init>();
    }
    i = 0;
    str2 = null;
    for (;;)
    {
      int j = ((JSONArray)localObject1).length();
      if (i >= j) {
        break;
      }
      Object localObject3 = ((JSONArray)localObject1).optJSONObject(i);
      if (localObject3 != null)
      {
        String str4 = ((JSONObject)localObject3).optString("key");
        localObject3 = ((JSONObject)localObject3).optString("value");
        me.a locala = new com/google/android/gms/b/me$a;
        locala.<init>(str4, (String)localObject3);
        localArrayList.add(locala);
      }
      i += 1;
    }
    return (me.b)localObject1;
  }
  
  /* Error */
  private me.c a(me.b paramb)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aload_1
    //   5: getfield 88	com/google/android/gms/b/me$b:b	Ljava/net/URL;
    //   8: astore 4
    //   10: aload 4
    //   12: invokevirtual 92	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   15: astore 4
    //   17: aload 4
    //   19: checkcast 94	java/net/HttpURLConnection
    //   22: astore 4
    //   24: invokestatic 100	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   27: astore_3
    //   28: aload_0
    //   29: getfield 16	com/google/android/gms/b/me:a	Landroid/content/Context;
    //   32: astore 5
    //   34: aload_0
    //   35: getfield 18	com/google/android/gms/b/me:b	Lcom/google/android/gms/b/un;
    //   38: astore 6
    //   40: aload 6
    //   42: getfield 105	com/google/android/gms/b/un:a	Ljava/lang/String;
    //   45: astore 6
    //   47: aload_3
    //   48: aload 5
    //   50: aload 6
    //   52: aload 4
    //   54: invokevirtual 110	com/google/android/gms/b/tt:a	(Landroid/content/Context;Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   57: aload_1
    //   58: getfield 114	com/google/android/gms/b/me$b:c	Ljava/util/ArrayList;
    //   61: astore_3
    //   62: aload_3
    //   63: invokevirtual 118	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   66: astore 5
    //   68: aload 5
    //   70: invokeinterface 124 1 0
    //   75: istore_2
    //   76: iload_2
    //   77: ifeq +83 -> 160
    //   80: aload 5
    //   82: invokeinterface 128 1 0
    //   87: astore_3
    //   88: aload_3
    //   89: checkcast 64	com/google/android/gms/b/me$a
    //   92: astore_3
    //   93: aload_3
    //   94: getfield 129	com/google/android/gms/b/me$a:a	Ljava/lang/String;
    //   97: astore 6
    //   99: aload_3
    //   100: getfield 131	com/google/android/gms/b/me$a:b	Ljava/lang/String;
    //   103: astore_3
    //   104: aload 4
    //   106: aload 6
    //   108: aload_3
    //   109: invokevirtual 134	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   112: goto -44 -> 68
    //   115: astore_3
    //   116: aload 4
    //   118: astore 5
    //   120: new 136	com/google/android/gms/b/me$c
    //   123: astore 4
    //   125: iconst_0
    //   126: istore 7
    //   128: aconst_null
    //   129: astore 6
    //   131: aconst_null
    //   132: astore 8
    //   134: aload_3
    //   135: invokevirtual 142	java/lang/Exception:toString	()Ljava/lang/String;
    //   138: astore_3
    //   139: aload 4
    //   141: iconst_0
    //   142: aconst_null
    //   143: aload_3
    //   144: invokespecial 145	com/google/android/gms/b/me$c:<init>	(ZLcom/google/android/gms/b/me$d;Ljava/lang/String;)V
    //   147: aload 5
    //   149: ifnull +8 -> 157
    //   152: aload 5
    //   154: invokevirtual 148	java/net/HttpURLConnection:disconnect	()V
    //   157: aload 4
    //   159: areturn
    //   160: aload_1
    //   161: getfield 151	com/google/android/gms/b/me$b:d	Ljava/lang/String;
    //   164: astore_3
    //   165: aload_3
    //   166: invokestatic 157	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   169: istore_2
    //   170: iload_2
    //   171: ifne +62 -> 233
    //   174: iconst_1
    //   175: istore_2
    //   176: aload 4
    //   178: iload_2
    //   179: invokevirtual 162	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   182: aload_1
    //   183: getfield 151	com/google/android/gms/b/me$b:d	Ljava/lang/String;
    //   186: astore_3
    //   187: aload_3
    //   188: invokevirtual 168	java/lang/String:getBytes	()[B
    //   191: astore_3
    //   192: aload_3
    //   193: arraylength
    //   194: istore 9
    //   196: aload 4
    //   198: iload 9
    //   200: invokevirtual 172	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   203: new 174	java/io/BufferedOutputStream
    //   206: astore 5
    //   208: aload 4
    //   210: invokevirtual 178	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   213: astore 6
    //   215: aload 5
    //   217: aload 6
    //   219: invokespecial 181	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   222: aload 5
    //   224: aload_3
    //   225: invokevirtual 185	java/io/BufferedOutputStream:write	([B)V
    //   228: aload 5
    //   230: invokevirtual 188	java/io/BufferedOutputStream:close	()V
    //   233: new 40	java/util/ArrayList
    //   236: astore 8
    //   238: aload 8
    //   240: invokespecial 41	java/util/ArrayList:<init>	()V
    //   243: aload 4
    //   245: invokevirtual 192	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   248: astore_3
    //   249: aload_3
    //   250: ifnull +163 -> 413
    //   253: aload 4
    //   255: invokevirtual 192	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   258: astore_3
    //   259: aload_3
    //   260: invokeinterface 198 1 0
    //   265: astore_3
    //   266: aload_3
    //   267: invokeinterface 201 1 0
    //   272: astore 10
    //   274: aload 10
    //   276: invokeinterface 124 1 0
    //   281: istore_2
    //   282: iload_2
    //   283: ifeq +130 -> 413
    //   286: aload 10
    //   288: invokeinterface 128 1 0
    //   293: astore_3
    //   294: aload_3
    //   295: checkcast 203	java/util/Map$Entry
    //   298: astore_3
    //   299: aload_3
    //   300: invokeinterface 206 1 0
    //   305: astore 5
    //   307: aload 5
    //   309: checkcast 208	java/util/List
    //   312: astore 5
    //   314: aload 5
    //   316: invokeinterface 209 1 0
    //   321: astore 11
    //   323: aload 11
    //   325: invokeinterface 124 1 0
    //   330: istore 9
    //   332: iload 9
    //   334: ifeq -60 -> 274
    //   337: aload 11
    //   339: invokeinterface 128 1 0
    //   344: astore 5
    //   346: aload 5
    //   348: checkcast 164	java/lang/String
    //   351: astore 5
    //   353: new 64	com/google/android/gms/b/me$a
    //   356: astore 12
    //   358: aload_3
    //   359: invokeinterface 212 1 0
    //   364: astore 6
    //   366: aload 6
    //   368: checkcast 164	java/lang/String
    //   371: astore 6
    //   373: aload 12
    //   375: aload 6
    //   377: aload 5
    //   379: invokespecial 67	com/google/android/gms/b/me$a:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   382: aload 8
    //   384: aload 12
    //   386: invokevirtual 71	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   389: pop
    //   390: goto -67 -> 323
    //   393: astore 13
    //   395: aload 4
    //   397: astore_3
    //   398: aload 13
    //   400: astore 4
    //   402: aload_3
    //   403: ifnull +7 -> 410
    //   406: aload_3
    //   407: invokevirtual 148	java/net/HttpURLConnection:disconnect	()V
    //   410: aload 4
    //   412: athrow
    //   413: new 214	com/google/android/gms/b/me$d
    //   416: astore 5
    //   418: aload_1
    //   419: getfield 215	com/google/android/gms/b/me$b:a	Ljava/lang/String;
    //   422: astore_3
    //   423: aload 4
    //   425: invokevirtual 218	java/net/HttpURLConnection:getResponseCode	()I
    //   428: istore 7
    //   430: invokestatic 100	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   433: pop
    //   434: new 220	java/io/InputStreamReader
    //   437: astore 10
    //   439: aload 4
    //   441: invokevirtual 224	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   444: astore 11
    //   446: aload 10
    //   448: aload 11
    //   450: invokespecial 227	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   453: aload 10
    //   455: invokestatic 230	com/google/android/gms/b/tt:a	(Ljava/io/InputStreamReader;)Ljava/lang/String;
    //   458: astore 10
    //   460: aload 5
    //   462: aload_3
    //   463: iload 7
    //   465: aload 8
    //   467: aload 10
    //   469: invokespecial 233	com/google/android/gms/b/me$d:<init>	(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;)V
    //   472: new 136	com/google/android/gms/b/me$c
    //   475: astore_3
    //   476: iconst_1
    //   477: istore 7
    //   479: aconst_null
    //   480: astore 8
    //   482: aload_3
    //   483: iload 7
    //   485: aload 5
    //   487: aconst_null
    //   488: invokespecial 145	com/google/android/gms/b/me$c:<init>	(ZLcom/google/android/gms/b/me$d;Ljava/lang/String;)V
    //   491: aload 4
    //   493: ifnull +8 -> 501
    //   496: aload 4
    //   498: invokevirtual 148	java/net/HttpURLConnection:disconnect	()V
    //   501: aload_3
    //   502: astore 4
    //   504: goto -347 -> 157
    //   507: astore 4
    //   509: goto -107 -> 402
    //   512: astore 4
    //   514: aload 5
    //   516: astore_3
    //   517: goto -115 -> 402
    //   520: astore 4
    //   522: iconst_0
    //   523: istore 9
    //   525: aconst_null
    //   526: astore 5
    //   528: aload 4
    //   530: astore_3
    //   531: goto -411 -> 120
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	534	0	this	me
    //   0	534	1	paramb	me.b
    //   1	282	2	bool1	boolean
    //   3	106	3	localObject1	Object
    //   115	20	3	localException1	Exception
    //   138	393	3	localObject2	Object
    //   8	495	4	localObject3	Object
    //   507	1	4	localObject4	Object
    //   512	1	4	localObject5	Object
    //   520	9	4	localException2	Exception
    //   32	495	5	localObject6	Object
    //   38	338	6	localObject7	Object
    //   126	358	7	i	int
    //   132	349	8	localArrayList	ArrayList
    //   194	5	9	j	int
    //   330	194	9	bool2	boolean
    //   272	196	10	localObject8	Object
    //   321	128	11	localObject9	Object
    //   356	29	12	locala	me.a
    //   393	6	13	localObject10	Object
    // Exception table:
    //   from	to	target	type
    //   24	27	115	java/lang/Exception
    //   28	32	115	java/lang/Exception
    //   34	38	115	java/lang/Exception
    //   40	45	115	java/lang/Exception
    //   52	57	115	java/lang/Exception
    //   57	61	115	java/lang/Exception
    //   62	66	115	java/lang/Exception
    //   68	75	115	java/lang/Exception
    //   80	87	115	java/lang/Exception
    //   88	92	115	java/lang/Exception
    //   93	97	115	java/lang/Exception
    //   99	103	115	java/lang/Exception
    //   108	112	115	java/lang/Exception
    //   160	164	115	java/lang/Exception
    //   165	169	115	java/lang/Exception
    //   178	182	115	java/lang/Exception
    //   182	186	115	java/lang/Exception
    //   187	191	115	java/lang/Exception
    //   192	194	115	java/lang/Exception
    //   198	203	115	java/lang/Exception
    //   203	206	115	java/lang/Exception
    //   208	213	115	java/lang/Exception
    //   217	222	115	java/lang/Exception
    //   224	228	115	java/lang/Exception
    //   228	233	115	java/lang/Exception
    //   233	236	115	java/lang/Exception
    //   238	243	115	java/lang/Exception
    //   243	248	115	java/lang/Exception
    //   253	258	115	java/lang/Exception
    //   259	265	115	java/lang/Exception
    //   266	272	115	java/lang/Exception
    //   274	281	115	java/lang/Exception
    //   286	293	115	java/lang/Exception
    //   294	298	115	java/lang/Exception
    //   299	305	115	java/lang/Exception
    //   307	312	115	java/lang/Exception
    //   314	321	115	java/lang/Exception
    //   323	330	115	java/lang/Exception
    //   337	344	115	java/lang/Exception
    //   346	351	115	java/lang/Exception
    //   353	356	115	java/lang/Exception
    //   358	364	115	java/lang/Exception
    //   366	371	115	java/lang/Exception
    //   377	382	115	java/lang/Exception
    //   384	390	115	java/lang/Exception
    //   413	416	115	java/lang/Exception
    //   418	422	115	java/lang/Exception
    //   423	428	115	java/lang/Exception
    //   430	434	115	java/lang/Exception
    //   434	437	115	java/lang/Exception
    //   439	444	115	java/lang/Exception
    //   448	453	115	java/lang/Exception
    //   453	458	115	java/lang/Exception
    //   467	472	115	java/lang/Exception
    //   472	475	115	java/lang/Exception
    //   487	491	115	java/lang/Exception
    //   24	27	393	finally
    //   28	32	393	finally
    //   34	38	393	finally
    //   40	45	393	finally
    //   52	57	393	finally
    //   57	61	393	finally
    //   62	66	393	finally
    //   68	75	393	finally
    //   80	87	393	finally
    //   88	92	393	finally
    //   93	97	393	finally
    //   99	103	393	finally
    //   108	112	393	finally
    //   160	164	393	finally
    //   165	169	393	finally
    //   178	182	393	finally
    //   182	186	393	finally
    //   187	191	393	finally
    //   192	194	393	finally
    //   198	203	393	finally
    //   203	206	393	finally
    //   208	213	393	finally
    //   217	222	393	finally
    //   224	228	393	finally
    //   228	233	393	finally
    //   233	236	393	finally
    //   238	243	393	finally
    //   243	248	393	finally
    //   253	258	393	finally
    //   259	265	393	finally
    //   266	272	393	finally
    //   274	281	393	finally
    //   286	293	393	finally
    //   294	298	393	finally
    //   299	305	393	finally
    //   307	312	393	finally
    //   314	321	393	finally
    //   323	330	393	finally
    //   337	344	393	finally
    //   346	351	393	finally
    //   353	356	393	finally
    //   358	364	393	finally
    //   366	371	393	finally
    //   377	382	393	finally
    //   384	390	393	finally
    //   413	416	393	finally
    //   418	422	393	finally
    //   423	428	393	finally
    //   430	434	393	finally
    //   434	437	393	finally
    //   439	444	393	finally
    //   448	453	393	finally
    //   453	458	393	finally
    //   467	472	393	finally
    //   472	475	393	finally
    //   487	491	393	finally
    //   4	8	507	finally
    //   10	15	507	finally
    //   17	22	507	finally
    //   120	123	512	finally
    //   134	138	512	finally
    //   143	147	512	finally
    //   4	8	520	java/lang/Exception
    //   10	15	520	java/lang/Exception
    //   17	22	520	java/lang/Exception
  }
  
  private static JSONObject a(me.d paramd)
  {
    JSONObject localJSONObject1 = new org/json/JSONObject;
    localJSONObject1.<init>();
    Object localObject1 = "http_request_id";
    Object localObject2;
    try
    {
      localObject2 = a;
      localJSONObject1.put((String)localObject1, localObject2);
      localObject1 = d;
      if (localObject1 != null)
      {
        localObject1 = "body";
        localObject2 = d;
        localJSONObject1.put((String)localObject1, localObject2);
      }
      localObject2 = new org/json/JSONArray;
      ((JSONArray)localObject2).<init>();
      localObject1 = c;
      Iterator localIterator = ((Iterable)localObject1).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (me.a)localObject1;
        JSONObject localJSONObject2 = new org/json/JSONObject;
        localJSONObject2.<init>();
        String str2 = "key";
        String str3 = a;
        localJSONObject2 = localJSONObject2.put(str2, str3);
        str2 = "value";
        localObject1 = b;
        localObject1 = localJSONObject2.put(str2, localObject1);
        ((JSONArray)localObject2).put(localObject1);
      }
      return localJSONObject1;
    }
    catch (JSONException localJSONException)
    {
      localObject2 = "Error constructing JSON for http response.";
      tp.b((String)localObject2, localJSONException);
    }
    for (;;)
    {
      String str1 = "headers";
      localJSONObject1.put(str1, localObject2);
      str1 = "response_code";
      int i = b;
      localJSONObject1.put(str1, i);
    }
  }
  
  public final JSONObject a(String paramString)
  {
    for (;;)
    {
      Object localObject3;
      String str2;
      boolean bool;
      JSONObject localJSONObject2;
      JSONObject localJSONObject3;
      String str3;
      try
      {
        localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>(paramString);
        localJSONObject1 = new org/json/JSONObject;
        localJSONObject1.<init>();
        localObject3 = "";
        str2 = "http_request_id";
      }
      catch (JSONException localJSONException2)
      {
        JSONObject localJSONObject1;
        Object localObject2 = "The request is not a valid JSON.";
        tp.c((String)localObject2);
        try
        {
          localObject2 = new org/json/JSONObject;
          ((JSONObject)localObject2).<init>();
          localObject1 = "success";
          localObject3 = null;
          localObject2 = ((JSONObject)localObject2).put((String)localObject1, false);
        }
        catch (JSONException localJSONException3)
        {
          localJSONObject2 = new org/json/JSONObject;
          localJSONObject2.<init>();
        }
        continue;
        str2 = "response";
        localJSONObject3 = new org/json/JSONObject;
        localJSONObject3.<init>();
        str3 = "http_request_id";
        localJSONObject3 = localJSONObject3.put(str3, localObject3);
        localJSONObject2.put(str2, localJSONObject3);
        str2 = "success";
        localJSONObject3 = null;
        localJSONObject2.put(str2, false);
        str2 = "reason";
        Object localObject1 = c;
        localJSONObject2.put(str2, localObject1);
        continue;
      }
      try
      {
        localObject3 = ((JSONObject)localObject1).optString(str2);
        localObject1 = a((JSONObject)localObject1);
        localObject1 = a((me.b)localObject1);
        bool = b;
        if (!bool) {
          continue;
        }
        localObject1 = a;
        localObject1 = a((me.d)localObject1);
        str2 = "response";
        localJSONObject1.put(str2, localObject1);
        localObject1 = "success";
        bool = true;
        localJSONObject1.put((String)localObject1, bool);
      }
      catch (Exception localException)
      {
        str2 = "response";
        try
        {
          localJSONObject3 = new org/json/JSONObject;
          localJSONObject3.<init>();
          str3 = "http_request_id";
          localObject3 = localJSONObject3.put(str3, localObject3);
          localJSONObject2.put(str2, localObject3);
          localObject3 = "success";
          bool = false;
          str2 = null;
          localJSONObject2.put((String)localObject3, false);
          localObject3 = "reason";
          String str1 = localException.toString();
          localJSONObject2.put((String)localObject3, str1);
        }
        catch (JSONException localJSONException1) {}
      }
    }
    return localJSONObject1;
  }
  
  public final void a(vc paramvc, Map paramMap)
  {
    me.1 local1 = new com/google/android/gms/b/me$1;
    local1.<init>(this, paramMap, paramvc);
    ts.a(local1);
  }
}


/* Location:              com/google/android/gms/b/me.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */