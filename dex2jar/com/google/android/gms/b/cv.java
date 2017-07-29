package com.google.android.gms.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.c;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public final class cv
  extends df
{
  public cv(dc paramdc)
  {
    super(paramdc);
  }
  
  static byte[] a(HttpURLConnection paramHttpURLConnection)
  {
    byte[] arrayOfByte = null;
    Object localObject = arrayOfByte;
    ByteArrayOutputStream localByteArrayOutputStream;
    try
    {
      localByteArrayOutputStream = new ByteArrayOutputStream();
      localObject = arrayOfByte;
      paramHttpURLConnection = paramHttpURLConnection.getInputStream();
      localObject = paramHttpURLConnection;
      arrayOfByte = new byte['Ѐ'];
      for (;;)
      {
        localObject = paramHttpURLConnection;
        int i = paramHttpURLConnection.read(arrayOfByte);
        if (i <= 0) {
          break;
        }
        localObject = paramHttpURLConnection;
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
      localObject = paramHttpURLConnection;
    }
    finally
    {
      if (localObject != null) {
        ((InputStream)localObject).close();
      }
    }
    arrayOfByte = localByteArrayOutputStream.toByteArray();
    if (paramHttpURLConnection != null) {
      paramHttpURLConnection.close();
    }
    return arrayOfByte;
  }
  
  protected final void a() {}
  
  public final void a(String paramString, URL paramURL, Map<String, String> paramMap, a parama)
  {
    super.e();
    J();
    c.a(paramURL);
    c.a(parama);
    super.t().b(new c(paramString, paramURL, null, paramMap, parama));
  }
  
  public final void a(String paramString, URL paramURL, byte[] paramArrayOfByte, a parama)
  {
    super.e();
    J();
    c.a(paramURL);
    c.a(paramArrayOfByte);
    c.a(parama);
    super.t().b(new c(paramString, paramURL, paramArrayOfByte, null, parama));
  }
  
  public final boolean x()
  {
    J();
    Object localObject1 = (ConnectivityManager)super.n().getSystemService("connectivity");
    try
    {
      localObject1 = ((ConnectivityManager)localObject1).getActiveNetworkInfo();
      if ((localObject1 != null) && (((NetworkInfo)localObject1).isConnected())) {
        return true;
      }
    }
    catch (SecurityException localSecurityException)
    {
      for (;;)
      {
        Object localObject2 = null;
      }
    }
    return false;
  }
  
  static abstract interface a
  {
    public abstract void a(String paramString, int paramInt, Throwable paramThrowable, byte[] paramArrayOfByte, Map<String, List<String>> paramMap);
  }
  
  private static final class b
    implements Runnable
  {
    private final cv.a a;
    private final int b;
    private final Throwable c;
    private final byte[] d;
    private final String e;
    private final Map<String, List<String>> f;
    
    private b(String paramString, cv.a parama, int paramInt, Throwable paramThrowable, byte[] paramArrayOfByte, Map<String, List<String>> paramMap)
    {
      c.a(parama);
      a = parama;
      b = paramInt;
      c = paramThrowable;
      d = paramArrayOfByte;
      e = paramString;
      f = paramMap;
    }
    
    public final void run()
    {
      a.a(e, b, c, d, f);
    }
  }
  
  private final class c
    implements Runnable
  {
    private final URL b;
    private final byte[] c;
    private final cv.a d;
    private final String e;
    private final Map<String, String> f;
    
    public c(URL paramURL, byte[] paramArrayOfByte, Map<String, String> paramMap, cv.a parama)
    {
      c.a(paramURL);
      c.a(paramArrayOfByte);
      Object localObject;
      c.a(localObject);
      b = paramArrayOfByte;
      c = paramMap;
      d = ((cv.a)localObject);
      e = paramURL;
      f = parama;
    }
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 25	com/google/android/gms/b/cv$c:a	Lcom/google/android/gms/b/cv;
      //   4: invokevirtual 54	com/google/android/gms/b/cv:d	()V
      //   7: aconst_null
      //   8: astore 6
      //   10: aconst_null
      //   11: astore 7
      //   13: iconst_0
      //   14: istore_3
      //   15: iconst_0
      //   16: istore 4
      //   18: iconst_0
      //   19: istore_2
      //   20: iconst_0
      //   21: istore_1
      //   22: aconst_null
      //   23: astore 10
      //   25: aconst_null
      //   26: astore 9
      //   28: aconst_null
      //   29: astore 11
      //   31: aconst_null
      //   32: astore 8
      //   34: aload_0
      //   35: getfield 38	com/google/android/gms/b/cv$c:b	Ljava/net/URL;
      //   38: invokevirtual 60	java/net/URL:openConnection	()Ljava/net/URLConnection;
      //   41: astore 5
      //   43: aload 5
      //   45: instanceof 62
      //   48: ifne +73 -> 121
      //   51: new 52	java/io/IOException
      //   54: dup
      //   55: ldc 64
      //   57: invokespecial 67	java/io/IOException:<init>	(Ljava/lang/String;)V
      //   60: athrow
      //   61: astore 7
      //   63: aconst_null
      //   64: astore 5
      //   66: iload_1
      //   67: istore_2
      //   68: aload 5
      //   70: ifnull +8 -> 78
      //   73: aload 5
      //   75: invokevirtual 72	java/io/OutputStream:close	()V
      //   78: aload 6
      //   80: ifnull +8 -> 88
      //   83: aload 6
      //   85: invokevirtual 75	java/net/HttpURLConnection:disconnect	()V
      //   88: aload_0
      //   89: getfield 25	com/google/android/gms/b/cv$c:a	Lcom/google/android/gms/b/cv;
      //   92: invokevirtual 79	com/google/android/gms/b/cv:t	()Lcom/google/android/gms/b/db;
      //   95: new 81	com/google/android/gms/b/cv$b
      //   98: dup
      //   99: aload_0
      //   100: getfield 44	com/google/android/gms/b/cv$c:e	Ljava/lang/String;
      //   103: aload_0
      //   104: getfield 42	com/google/android/gms/b/cv$c:d	Lcom/google/android/gms/b/cv$a;
      //   107: iload_2
      //   108: aload 7
      //   110: aconst_null
      //   111: aload 8
      //   113: iconst_0
      //   114: invokespecial 84	com/google/android/gms/b/cv$b:<init>	(Ljava/lang/String;Lcom/google/android/gms/b/cv$a;ILjava/lang/Throwable;[BLjava/util/Map;B)V
      //   117: invokevirtual 89	com/google/android/gms/b/db:a	(Ljava/lang/Runnable;)V
      //   120: return
      //   121: aload 5
      //   123: checkcast 62	java/net/HttpURLConnection
      //   126: astore 5
      //   128: aload 5
      //   130: iconst_0
      //   131: invokevirtual 93	java/net/HttpURLConnection:setDefaultUseCaches	(Z)V
      //   134: invokestatic 99	com/google/android/gms/b/cf:Q	()J
      //   137: pop2
      //   138: aload 5
      //   140: ldc 100
      //   142: invokevirtual 104	java/net/HttpURLConnection:setConnectTimeout	(I)V
      //   145: invokestatic 107	com/google/android/gms/b/cf:R	()J
      //   148: pop2
      //   149: aload 5
      //   151: ldc 108
      //   153: invokevirtual 111	java/net/HttpURLConnection:setReadTimeout	(I)V
      //   156: aload 5
      //   158: iconst_0
      //   159: invokevirtual 114	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
      //   162: aload 5
      //   164: iconst_1
      //   165: invokevirtual 117	java/net/HttpURLConnection:setDoInput	(Z)V
      //   168: aload_0
      //   169: getfield 46	com/google/android/gms/b/cv$c:f	Ljava/util/Map;
      //   172: ifnull +69 -> 241
      //   175: aload_0
      //   176: getfield 46	com/google/android/gms/b/cv$c:f	Ljava/util/Map;
      //   179: invokeinterface 123 1 0
      //   184: invokeinterface 129 1 0
      //   189: astore 6
      //   191: aload 6
      //   193: invokeinterface 135 1 0
      //   198: ifeq +43 -> 241
      //   201: aload 6
      //   203: invokeinterface 139 1 0
      //   208: checkcast 141	java/util/Map$Entry
      //   211: astore 12
      //   213: aload 5
      //   215: aload 12
      //   217: invokeinterface 144 1 0
      //   222: checkcast 146	java/lang/String
      //   225: aload 12
      //   227: invokeinterface 149 1 0
      //   232: checkcast 146	java/lang/String
      //   235: invokevirtual 153	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   238: goto -47 -> 191
      //   241: aload_0
      //   242: getfield 40	com/google/android/gms/b/cv$c:c	[B
      //   245: ifnull +401 -> 646
      //   248: aload_0
      //   249: getfield 25	com/google/android/gms/b/cv$c:a	Lcom/google/android/gms/b/cv;
      //   252: invokevirtual 157	com/google/android/gms/b/cv:q	()Lcom/google/android/gms/b/dr;
      //   255: aload_0
      //   256: getfield 40	com/google/android/gms/b/cv$c:c	[B
      //   259: invokevirtual 162	com/google/android/gms/b/dr:a	([B)[B
      //   262: astore 12
      //   264: aload_0
      //   265: getfield 25	com/google/android/gms/b/cv$c:a	Lcom/google/android/gms/b/cv;
      //   268: invokevirtual 166	com/google/android/gms/b/cv:u	()Lcom/google/android/gms/b/cu;
      //   271: getfield 172	com/google/android/gms/b/cu:g	Lcom/google/android/gms/b/cu$a;
      //   274: ldc -82
      //   276: aload 12
      //   278: arraylength
      //   279: invokestatic 180	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   282: invokevirtual 185	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
      //   285: aload 5
      //   287: iconst_1
      //   288: invokevirtual 188	java/net/HttpURLConnection:setDoOutput	(Z)V
      //   291: aload 5
      //   293: ldc -66
      //   295: ldc -64
      //   297: invokevirtual 153	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   300: aload 5
      //   302: aload 12
      //   304: arraylength
      //   305: invokevirtual 195	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
      //   308: aload 5
      //   310: invokevirtual 198	java/net/HttpURLConnection:connect	()V
      //   313: aload 5
      //   315: invokevirtual 202	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
      //   318: astore 6
      //   320: aload 6
      //   322: aload 12
      //   324: invokevirtual 206	java/io/OutputStream:write	([B)V
      //   327: aload 6
      //   329: invokevirtual 72	java/io/OutputStream:close	()V
      //   332: iload 4
      //   334: istore_1
      //   335: aload 9
      //   337: astore 6
      //   339: aload 11
      //   341: astore 8
      //   343: aload 5
      //   345: invokevirtual 210	java/net/HttpURLConnection:getResponseCode	()I
      //   348: istore_3
      //   349: iload_3
      //   350: istore_1
      //   351: aload 9
      //   353: astore 6
      //   355: iload_3
      //   356: istore_2
      //   357: aload 11
      //   359: astore 8
      //   361: aload 5
      //   363: invokevirtual 214	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
      //   366: astore 7
      //   368: iload_3
      //   369: istore_1
      //   370: aload 7
      //   372: astore 6
      //   374: iload_3
      //   375: istore_2
      //   376: aload 7
      //   378: astore 8
      //   380: aload 5
      //   382: invokestatic 217	com/google/android/gms/b/cv:a	(Ljava/net/HttpURLConnection;)[B
      //   385: astore 9
      //   387: aload 5
      //   389: ifnull +8 -> 397
      //   392: aload 5
      //   394: invokevirtual 75	java/net/HttpURLConnection:disconnect	()V
      //   397: aload_0
      //   398: getfield 25	com/google/android/gms/b/cv$c:a	Lcom/google/android/gms/b/cv;
      //   401: invokevirtual 79	com/google/android/gms/b/cv:t	()Lcom/google/android/gms/b/db;
      //   404: new 81	com/google/android/gms/b/cv$b
      //   407: dup
      //   408: aload_0
      //   409: getfield 44	com/google/android/gms/b/cv$c:e	Ljava/lang/String;
      //   412: aload_0
      //   413: getfield 42	com/google/android/gms/b/cv$c:d	Lcom/google/android/gms/b/cv$a;
      //   416: iload_3
      //   417: aconst_null
      //   418: aload 9
      //   420: aload 7
      //   422: iconst_0
      //   423: invokespecial 84	com/google/android/gms/b/cv$b:<init>	(Ljava/lang/String;Lcom/google/android/gms/b/cv$a;ILjava/lang/Throwable;[BLjava/util/Map;B)V
      //   426: invokevirtual 89	com/google/android/gms/b/db:a	(Ljava/lang/Runnable;)V
      //   429: return
      //   430: astore 5
      //   432: aload_0
      //   433: getfield 25	com/google/android/gms/b/cv$c:a	Lcom/google/android/gms/b/cv;
      //   436: invokevirtual 166	com/google/android/gms/b/cv:u	()Lcom/google/android/gms/b/cu;
      //   439: getfield 219	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
      //   442: ldc -35
      //   444: aload_0
      //   445: getfield 44	com/google/android/gms/b/cv$c:e	Ljava/lang/String;
      //   448: invokestatic 224	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
      //   451: aload 5
      //   453: invokevirtual 227	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
      //   456: goto -378 -> 78
      //   459: astore 5
      //   461: aconst_null
      //   462: astore 8
      //   464: aload 10
      //   466: astore 6
      //   468: iload_3
      //   469: istore_1
      //   470: aload 7
      //   472: ifnull +8 -> 480
      //   475: aload 7
      //   477: invokevirtual 72	java/io/OutputStream:close	()V
      //   480: aload 8
      //   482: ifnull +8 -> 490
      //   485: aload 8
      //   487: invokevirtual 75	java/net/HttpURLConnection:disconnect	()V
      //   490: aload_0
      //   491: getfield 25	com/google/android/gms/b/cv$c:a	Lcom/google/android/gms/b/cv;
      //   494: invokevirtual 79	com/google/android/gms/b/cv:t	()Lcom/google/android/gms/b/db;
      //   497: new 81	com/google/android/gms/b/cv$b
      //   500: dup
      //   501: aload_0
      //   502: getfield 44	com/google/android/gms/b/cv$c:e	Ljava/lang/String;
      //   505: aload_0
      //   506: getfield 42	com/google/android/gms/b/cv$c:d	Lcom/google/android/gms/b/cv$a;
      //   509: iload_1
      //   510: aconst_null
      //   511: aconst_null
      //   512: aload 6
      //   514: iconst_0
      //   515: invokespecial 84	com/google/android/gms/b/cv$b:<init>	(Ljava/lang/String;Lcom/google/android/gms/b/cv$a;ILjava/lang/Throwable;[BLjava/util/Map;B)V
      //   518: invokevirtual 89	com/google/android/gms/b/db:a	(Ljava/lang/Runnable;)V
      //   521: aload 5
      //   523: athrow
      //   524: astore 7
      //   526: aload_0
      //   527: getfield 25	com/google/android/gms/b/cv$c:a	Lcom/google/android/gms/b/cv;
      //   530: invokevirtual 166	com/google/android/gms/b/cv:u	()Lcom/google/android/gms/b/cu;
      //   533: getfield 219	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
      //   536: ldc -35
      //   538: aload_0
      //   539: getfield 44	com/google/android/gms/b/cv$c:e	Ljava/lang/String;
      //   542: invokestatic 224	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
      //   545: aload 7
      //   547: invokevirtual 227	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
      //   550: goto -70 -> 480
      //   553: astore 9
      //   555: aload 5
      //   557: astore 8
      //   559: iload_3
      //   560: istore_1
      //   561: aload 10
      //   563: astore 6
      //   565: aload 9
      //   567: astore 5
      //   569: goto -99 -> 470
      //   572: astore 9
      //   574: aload 5
      //   576: astore 8
      //   578: iload_3
      //   579: istore_1
      //   580: aload 6
      //   582: astore 7
      //   584: aload 10
      //   586: astore 6
      //   588: aload 9
      //   590: astore 5
      //   592: goto -122 -> 470
      //   595: astore 9
      //   597: aconst_null
      //   598: astore 7
      //   600: aload 5
      //   602: astore 8
      //   604: aload 9
      //   606: astore 5
      //   608: goto -138 -> 470
      //   611: astore 9
      //   613: aload 5
      //   615: astore 7
      //   617: aload 6
      //   619: astore 5
      //   621: aload 7
      //   623: astore 6
      //   625: iload_1
      //   626: istore_2
      //   627: aload 9
      //   629: astore 7
      //   631: goto -563 -> 68
      //   634: astore 7
      //   636: aload 5
      //   638: astore 6
      //   640: aconst_null
      //   641: astore 5
      //   643: goto -575 -> 68
      //   646: goto -314 -> 332
      //   649: astore 7
      //   651: aload 5
      //   653: astore 6
      //   655: aconst_null
      //   656: astore 5
      //   658: iload_1
      //   659: istore_2
      //   660: goto -592 -> 68
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	663	0	this	c
      //   21	638	1	i	int
      //   19	641	2	j	int
      //   14	565	3	k	int
      //   16	317	4	m	int
      //   41	352	5	localObject1	Object
      //   430	22	5	localIOException1	java.io.IOException
      //   459	97	5	localObject2	Object
      //   567	90	5	localObject3	Object
      //   8	646	6	localObject4	Object
      //   11	1	7	localObject5	Object
      //   61	48	7	localIOException2	java.io.IOException
      //   366	110	7	localMap	Map
      //   524	22	7	localIOException3	java.io.IOException
      //   582	48	7	localObject6	Object
      //   634	1	7	localIOException4	java.io.IOException
      //   649	1	7	localIOException5	java.io.IOException
      //   32	571	8	localObject7	Object
      //   26	393	9	arrayOfByte	byte[]
      //   553	13	9	localObject8	Object
      //   572	17	9	localObject9	Object
      //   595	10	9	localObject10	Object
      //   611	17	9	localIOException6	java.io.IOException
      //   23	562	10	localObject11	Object
      //   29	329	11	localObject12	Object
      //   211	112	12	localObject13	Object
      // Exception table:
      //   from	to	target	type
      //   34	61	61	java/io/IOException
      //   121	168	61	java/io/IOException
      //   73	78	430	java/io/IOException
      //   34	61	459	finally
      //   121	168	459	finally
      //   475	480	524	java/io/IOException
      //   168	191	553	finally
      //   191	238	553	finally
      //   241	320	553	finally
      //   320	332	572	finally
      //   343	349	595	finally
      //   361	368	595	finally
      //   380	387	595	finally
      //   320	332	611	java/io/IOException
      //   343	349	634	java/io/IOException
      //   361	368	634	java/io/IOException
      //   380	387	634	java/io/IOException
      //   168	191	649	java/io/IOException
      //   191	238	649	java/io/IOException
      //   241	320	649	java/io/IOException
    }
  }
}


/* Location:              com/google/android/gms/b/cv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */