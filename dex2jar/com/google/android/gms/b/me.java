package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@qi
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
  
  private static b a(JSONObject paramJSONObject)
  {
    String str1 = paramJSONObject.optString("http_request_id");
    Object localObject1 = paramJSONObject.optString("url");
    String str2 = paramJSONObject.optString("post_body", null);
    try
    {
      localObject1 = new URL((String)localObject1);
      localArrayList = new ArrayList();
      Object localObject2 = paramJSONObject.optJSONArray("headers");
      paramJSONObject = (JSONObject)localObject2;
      if (localObject2 == null) {
        paramJSONObject = new JSONArray();
      }
      int i = 0;
      while (i < paramJSONObject.length())
      {
        localObject2 = paramJSONObject.optJSONObject(i);
        if (localObject2 != null) {
          localArrayList.add(new a(((JSONObject)localObject2).optString("key"), ((JSONObject)localObject2).optString("value")));
        }
        i += 1;
      }
    }
    catch (MalformedURLException localMalformedURLException)
    {
      ArrayList localArrayList;
      URL localURL;
      for (;;)
      {
        tp.b("Error constructing http request.", localMalformedURLException);
        localURL = null;
      }
      return new b(str1, localURL, localArrayList, str2);
    }
  }
  
  /* Error */
  private c a(b paramb)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_1
    //   4: getfield 105	com/google/android/gms/b/me$b:b	Ljava/net/URL;
    //   7: invokevirtual 109	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   10: checkcast 111	java/net/HttpURLConnection
    //   13: astore_3
    //   14: invokestatic 117	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   17: aload_0
    //   18: getfield 32	com/google/android/gms/b/me:a	Landroid/content/Context;
    //   21: aload_0
    //   22: getfield 34	com/google/android/gms/b/me:b	Lcom/google/android/gms/b/un;
    //   25: getfield 122	com/google/android/gms/b/un:a	Ljava/lang/String;
    //   28: aload_3
    //   29: invokevirtual 127	com/google/android/gms/b/tt:a	(Landroid/content/Context;Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   32: aload_1
    //   33: getfield 130	com/google/android/gms/b/me$b:c	Ljava/util/ArrayList;
    //   36: invokevirtual 134	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   39: astore 4
    //   41: aload 4
    //   43: invokeinterface 140 1 0
    //   48: ifeq +63 -> 111
    //   51: aload 4
    //   53: invokeinterface 144 1 0
    //   58: checkcast 12	com/google/android/gms/b/me$a
    //   61: astore 5
    //   63: aload_3
    //   64: aload 5
    //   66: getfield 145	com/google/android/gms/b/me$a:a	Ljava/lang/String;
    //   69: aload 5
    //   71: getfield 147	com/google/android/gms/b/me$a:b	Ljava/lang/String;
    //   74: invokevirtual 150	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   77: goto -36 -> 41
    //   80: astore 4
    //   82: aload_3
    //   83: astore_1
    //   84: aload 4
    //   86: astore_3
    //   87: new 18	com/google/android/gms/b/me$c
    //   90: dup
    //   91: iconst_0
    //   92: aconst_null
    //   93: aload_3
    //   94: invokevirtual 154	java/lang/Exception:toString	()Ljava/lang/String;
    //   97: invokespecial 157	com/google/android/gms/b/me$c:<init>	(ZLcom/google/android/gms/b/me$d;Ljava/lang/String;)V
    //   100: astore_3
    //   101: aload_1
    //   102: ifnull +7 -> 109
    //   105: aload_1
    //   106: invokevirtual 160	java/net/HttpURLConnection:disconnect	()V
    //   109: aload_3
    //   110: areturn
    //   111: aload_1
    //   112: getfield 162	com/google/android/gms/b/me$b:d	Ljava/lang/String;
    //   115: invokestatic 168	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   118: ifne +49 -> 167
    //   121: aload_3
    //   122: iconst_1
    //   123: invokevirtual 172	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   126: aload_1
    //   127: getfield 162	com/google/android/gms/b/me$b:d	Ljava/lang/String;
    //   130: invokevirtual 178	java/lang/String:getBytes	()[B
    //   133: astore 4
    //   135: aload_3
    //   136: aload 4
    //   138: arraylength
    //   139: invokevirtual 182	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   142: new 184	java/io/BufferedOutputStream
    //   145: dup
    //   146: aload_3
    //   147: invokevirtual 188	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   150: invokespecial 191	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   153: astore 5
    //   155: aload 5
    //   157: aload 4
    //   159: invokevirtual 195	java/io/BufferedOutputStream:write	([B)V
    //   162: aload 5
    //   164: invokevirtual 198	java/io/BufferedOutputStream:close	()V
    //   167: new 60	java/util/ArrayList
    //   170: dup
    //   171: invokespecial 61	java/util/ArrayList:<init>	()V
    //   174: astore 4
    //   176: aload_3
    //   177: invokevirtual 202	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   180: ifnull +119 -> 299
    //   183: aload_3
    //   184: invokevirtual 202	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   187: invokeinterface 208 1 0
    //   192: invokeinterface 211 1 0
    //   197: astore 5
    //   199: aload 5
    //   201: invokeinterface 140 1 0
    //   206: ifeq +93 -> 299
    //   209: aload 5
    //   211: invokeinterface 144 1 0
    //   216: checkcast 213	java/util/Map$Entry
    //   219: astore 6
    //   221: aload 6
    //   223: invokeinterface 216 1 0
    //   228: checkcast 218	java/util/List
    //   231: invokeinterface 219 1 0
    //   236: astore 7
    //   238: aload 7
    //   240: invokeinterface 140 1 0
    //   245: ifeq -46 -> 199
    //   248: aload 7
    //   250: invokeinterface 144 1 0
    //   255: checkcast 174	java/lang/String
    //   258: astore 8
    //   260: aload 4
    //   262: new 12	com/google/android/gms/b/me$a
    //   265: dup
    //   266: aload 6
    //   268: invokeinterface 222 1 0
    //   273: checkcast 174	java/lang/String
    //   276: aload 8
    //   278: invokespecial 85	com/google/android/gms/b/me$a:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   281: invokevirtual 89	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   284: pop
    //   285: goto -47 -> 238
    //   288: astore_1
    //   289: aload_3
    //   290: ifnull +7 -> 297
    //   293: aload_3
    //   294: invokevirtual 160	java/net/HttpURLConnection:disconnect	()V
    //   297: aload_1
    //   298: athrow
    //   299: aload_1
    //   300: getfield 223	com/google/android/gms/b/me$b:a	Ljava/lang/String;
    //   303: astore_1
    //   304: aload_3
    //   305: invokevirtual 226	java/net/HttpURLConnection:getResponseCode	()I
    //   308: istore_2
    //   309: invokestatic 117	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   312: pop
    //   313: new 18	com/google/android/gms/b/me$c
    //   316: dup
    //   317: iconst_1
    //   318: new 21	com/google/android/gms/b/me$d
    //   321: dup
    //   322: aload_1
    //   323: iload_2
    //   324: aload 4
    //   326: new 228	java/io/InputStreamReader
    //   329: dup
    //   330: aload_3
    //   331: invokevirtual 232	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   334: invokespecial 235	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   337: invokestatic 238	com/google/android/gms/b/tt:a	(Ljava/io/InputStreamReader;)Ljava/lang/String;
    //   340: invokespecial 241	com/google/android/gms/b/me$d:<init>	(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;)V
    //   343: aconst_null
    //   344: invokespecial 157	com/google/android/gms/b/me$c:<init>	(ZLcom/google/android/gms/b/me$d;Ljava/lang/String;)V
    //   347: astore_1
    //   348: aload_3
    //   349: ifnull +7 -> 356
    //   352: aload_3
    //   353: invokevirtual 160	java/net/HttpURLConnection:disconnect	()V
    //   356: aload_1
    //   357: areturn
    //   358: astore_1
    //   359: aload 4
    //   361: astore_3
    //   362: goto -73 -> 289
    //   365: astore 4
    //   367: aload_1
    //   368: astore_3
    //   369: aload 4
    //   371: astore_1
    //   372: goto -83 -> 289
    //   375: astore_3
    //   376: aconst_null
    //   377: astore_1
    //   378: goto -291 -> 87
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	381	0	this	me
    //   0	381	1	paramb	b
    //   308	16	2	i	int
    //   13	356	3	localObject1	Object
    //   375	1	3	localException1	Exception
    //   1	51	4	localIterator1	Iterator
    //   80	5	4	localException2	Exception
    //   133	227	4	localObject2	Object
    //   365	5	4	localObject3	Object
    //   61	149	5	localObject4	Object
    //   219	48	6	localEntry	java.util.Map.Entry
    //   236	13	7	localIterator2	Iterator
    //   258	19	8	str	String
    // Exception table:
    //   from	to	target	type
    //   14	41	80	java/lang/Exception
    //   41	77	80	java/lang/Exception
    //   111	167	80	java/lang/Exception
    //   167	199	80	java/lang/Exception
    //   199	238	80	java/lang/Exception
    //   238	285	80	java/lang/Exception
    //   299	348	80	java/lang/Exception
    //   14	41	288	finally
    //   41	77	288	finally
    //   111	167	288	finally
    //   167	199	288	finally
    //   199	238	288	finally
    //   238	285	288	finally
    //   299	348	288	finally
    //   3	14	358	finally
    //   87	101	365	finally
    //   3	14	375	java/lang/Exception
  }
  
  private static JSONObject a(d paramd)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("http_request_id", a);
      if (d != null) {
        localJSONObject.put("body", d);
      }
      JSONArray localJSONArray = new JSONArray();
      Iterator localIterator = c.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        localJSONArray.put(new JSONObject().put("key", a).put("value", b));
      }
      localJSONObject.put("headers", localJSONArray);
    }
    catch (JSONException paramd)
    {
      tp.b("Error constructing JSON for http response.", paramd);
      return localJSONObject;
    }
    localJSONObject.put("response_code", b);
    return localJSONObject;
  }
  
  /* Error */
  public final JSONObject a(String paramString)
  {
    // Byte code:
    //   0: new 42	org/json/JSONObject
    //   3: dup
    //   4: aload_1
    //   5: invokespecial 274	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   8: astore 4
    //   10: new 42	org/json/JSONObject
    //   13: dup
    //   14: invokespecial 245	org/json/JSONObject:<init>	()V
    //   17: astore_3
    //   18: ldc_w 276
    //   21: astore_1
    //   22: aload 4
    //   24: ldc 40
    //   26: invokevirtual 46	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   29: astore_2
    //   30: aload_2
    //   31: astore_1
    //   32: aload_0
    //   33: aload 4
    //   35: invokestatic 278	com/google/android/gms/b/me:a	(Lorg/json/JSONObject;)Lcom/google/android/gms/b/me$b;
    //   38: invokespecial 280	com/google/android/gms/b/me:a	(Lcom/google/android/gms/b/me$b;)Lcom/google/android/gms/b/me$c;
    //   41: astore 4
    //   43: aload_2
    //   44: astore_1
    //   45: aload 4
    //   47: getfield 283	com/google/android/gms/b/me$c:b	Z
    //   50: ifeq +67 -> 117
    //   53: aload_2
    //   54: astore_1
    //   55: aload_3
    //   56: ldc_w 285
    //   59: aload 4
    //   61: getfield 288	com/google/android/gms/b/me$c:a	Lcom/google/android/gms/b/me$d;
    //   64: invokestatic 290	com/google/android/gms/b/me:a	(Lcom/google/android/gms/b/me$d;)Lorg/json/JSONObject;
    //   67: invokevirtual 250	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   70: pop
    //   71: aload_2
    //   72: astore_1
    //   73: aload_3
    //   74: ldc_w 292
    //   77: iconst_1
    //   78: invokevirtual 295	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   81: pop
    //   82: aload_3
    //   83: areturn
    //   84: astore_1
    //   85: ldc_w 297
    //   88: invokestatic 299	com/google/android/gms/b/tp:c	(Ljava/lang/String;)V
    //   91: new 42	org/json/JSONObject
    //   94: dup
    //   95: invokespecial 245	org/json/JSONObject:<init>	()V
    //   98: ldc_w 292
    //   101: iconst_0
    //   102: invokevirtual 295	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   105: astore_1
    //   106: aload_1
    //   107: areturn
    //   108: astore_1
    //   109: new 42	org/json/JSONObject
    //   112: dup
    //   113: invokespecial 245	org/json/JSONObject:<init>	()V
    //   116: areturn
    //   117: aload_2
    //   118: astore_1
    //   119: aload_3
    //   120: ldc_w 285
    //   123: new 42	org/json/JSONObject
    //   126: dup
    //   127: invokespecial 245	org/json/JSONObject:<init>	()V
    //   130: ldc 40
    //   132: aload_2
    //   133: invokevirtual 250	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   136: invokevirtual 250	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   139: pop
    //   140: aload_2
    //   141: astore_1
    //   142: aload_3
    //   143: ldc_w 292
    //   146: iconst_0
    //   147: invokevirtual 295	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   150: pop
    //   151: aload_2
    //   152: astore_1
    //   153: aload_3
    //   154: ldc_w 301
    //   157: aload 4
    //   159: getfield 303	com/google/android/gms/b/me$c:c	Ljava/lang/String;
    //   162: invokevirtual 250	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   165: pop
    //   166: aload_3
    //   167: areturn
    //   168: astore_2
    //   169: aload_3
    //   170: ldc_w 285
    //   173: new 42	org/json/JSONObject
    //   176: dup
    //   177: invokespecial 245	org/json/JSONObject:<init>	()V
    //   180: ldc 40
    //   182: aload_1
    //   183: invokevirtual 250	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   186: invokevirtual 250	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   189: pop
    //   190: aload_3
    //   191: ldc_w 292
    //   194: iconst_0
    //   195: invokevirtual 295	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   198: pop
    //   199: aload_3
    //   200: ldc_w 301
    //   203: aload_2
    //   204: invokevirtual 154	java/lang/Exception:toString	()Ljava/lang/String;
    //   207: invokevirtual 250	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   210: pop
    //   211: aload_3
    //   212: areturn
    //   213: astore_1
    //   214: aload_3
    //   215: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	216	0	this	me
    //   0	216	1	paramString	String
    //   29	123	2	str	String
    //   168	36	2	localException	Exception
    //   17	198	3	localJSONObject	JSONObject
    //   8	150	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	10	84	org/json/JSONException
    //   91	106	108	org/json/JSONException
    //   22	30	168	java/lang/Exception
    //   32	43	168	java/lang/Exception
    //   45	53	168	java/lang/Exception
    //   55	71	168	java/lang/Exception
    //   73	82	168	java/lang/Exception
    //   119	140	168	java/lang/Exception
    //   142	151	168	java/lang/Exception
    //   153	166	168	java/lang/Exception
    //   169	211	213	org/json/JSONException
  }
  
  public final void a(final vc paramvc, final Map<String, String> paramMap)
  {
    ts.a(new Runnable()
    {
      public final void run()
      {
        tp.b("Received Http request.");
        final Object localObject = (String)paramMap.get("http_request");
        localObject = a((String)localObject);
        if (localObject == null)
        {
          tp.c("Response should not be null.");
          return;
        }
        tt.a.post(new Runnable()
        {
          public final void run()
          {
            b.b("fetchHttpRequestCompleted", localObject);
            tp.b("Dispatched http response.");
          }
        });
      }
    });
  }
  
  @qi
  static final class a
  {
    final String a;
    final String b;
    
    public a(String paramString1, String paramString2)
    {
      a = paramString1;
      b = paramString2;
    }
  }
  
  @qi
  static final class b
  {
    final String a;
    final URL b;
    final ArrayList<me.a> c;
    final String d;
    
    public b(String paramString1, URL paramURL, ArrayList<me.a> paramArrayList, String paramString2)
    {
      a = paramString1;
      b = paramURL;
      c = paramArrayList;
      d = paramString2;
    }
  }
  
  @qi
  final class c
  {
    final me.d a;
    final boolean b;
    final String c;
    
    public c(me.d paramd, String paramString)
    {
      b = this$1;
      a = paramd;
      c = paramString;
    }
  }
  
  @qi
  static final class d
  {
    final String a;
    final int b;
    final List<me.a> c;
    final String d;
    
    public d(String paramString1, int paramInt, List<me.a> paramList, String paramString2)
    {
      a = paramString1;
      b = paramInt;
      c = paramList;
      d = paramString2;
    }
  }
}


/* Location:              com/google/android/gms/b/me.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */