package com.google.android.gms.b;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public final class b
  implements vy
{
  private final a a = null;
  private final SSLSocketFactory b = null;
  
  public b()
  {
    this((byte)0);
  }
  
  private b(byte paramByte)
  {
    this('\000');
  }
  
  private b(char paramChar) {}
  
  private static HttpEntity a(HttpURLConnection paramHttpURLConnection)
  {
    BasicHttpEntity localBasicHttpEntity = new BasicHttpEntity();
    try
    {
      InputStream localInputStream1 = paramHttpURLConnection.getInputStream();
      localBasicHttpEntity.setContent(localInputStream1);
      localBasicHttpEntity.setContentLength(paramHttpURLConnection.getContentLength());
      localBasicHttpEntity.setContentEncoding(paramHttpURLConnection.getContentEncoding());
      localBasicHttpEntity.setContentType(paramHttpURLConnection.getContentType());
      return localBasicHttpEntity;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        InputStream localInputStream2 = paramHttpURLConnection.getErrorStream();
      }
    }
  }
  
  private static void a(HttpURLConnection paramHttpURLConnection, pc<?> parampc)
  {
    parampc = parampc.c();
    if (parampc != null)
    {
      paramHttpURLConnection.setDoOutput(true);
      paramHttpURLConnection.addRequestProperty("Content-Type", pc.b());
      paramHttpURLConnection = new DataOutputStream(paramHttpURLConnection.getOutputStream());
      paramHttpURLConnection.write(parampc);
      paramHttpURLConnection.close();
    }
  }
  
  public final HttpResponse a(pc<?> parampc, Map<String, String> paramMap)
  {
    Object localObject1 = b;
    HashMap localHashMap = new HashMap();
    localHashMap.putAll(parampc.a());
    localHashMap.putAll(paramMap);
    if (a != null)
    {
      localObject2 = a.a();
      paramMap = (Map<String, String>)localObject2;
      if (localObject2 == null) {
        throw new IOException("URL blocked by rewriter: " + (String)localObject1);
      }
    }
    else
    {
      paramMap = (Map<String, String>)localObject1;
    }
    localObject1 = new URL(paramMap);
    paramMap = (HttpURLConnection)((URL)localObject1).openConnection();
    paramMap.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
    int i = parampc.d();
    paramMap.setConnectTimeout(i);
    paramMap.setReadTimeout(i);
    paramMap.setUseCaches(false);
    paramMap.setDoInput(true);
    if (("https".equals(((URL)localObject1).getProtocol())) && (b != null)) {
      ((HttpsURLConnection)paramMap).setSSLSocketFactory(b);
    }
    localObject1 = localHashMap.keySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      paramMap.addRequestProperty((String)localObject2, (String)localHashMap.get(localObject2));
    }
    switch (a)
    {
    default: 
      throw new IllegalStateException("Unknown method type.");
    case 0: 
      paramMap.setRequestMethod("GET");
    }
    for (;;)
    {
      localObject1 = new ProtocolVersion("HTTP", 1, 1);
      if (paramMap.getResponseCode() != -1) {
        break;
      }
      throw new IOException("Could not retrieve response code from HttpUrlConnection.");
      paramMap.setRequestMethod("DELETE");
      continue;
      paramMap.setRequestMethod("POST");
      a(paramMap, parampc);
      continue;
      paramMap.setRequestMethod("PUT");
      a(paramMap, parampc);
      continue;
      paramMap.setRequestMethod("HEAD");
      continue;
      paramMap.setRequestMethod("OPTIONS");
      continue;
      paramMap.setRequestMethod("TRACE");
      continue;
      paramMap.setRequestMethod("PATCH");
      a(paramMap, parampc);
    }
    Object localObject2 = new BasicStatusLine((ProtocolVersion)localObject1, paramMap.getResponseCode(), paramMap.getResponseMessage());
    localObject1 = new BasicHttpResponse((StatusLine)localObject2);
    i = a;
    int j = ((StatusLine)localObject2).getStatusCode();
    if ((i != 4) && ((100 > j) || (j >= 200)) && (j != 204) && (j != 304)) {}
    for (i = 1;; i = 0)
    {
      if (i != 0) {
        ((BasicHttpResponse)localObject1).setEntity(a(paramMap));
      }
      parampc = paramMap.getHeaderFields().entrySet().iterator();
      while (parampc.hasNext())
      {
        paramMap = (Map.Entry)parampc.next();
        if (paramMap.getKey() != null) {
          ((BasicHttpResponse)localObject1).addHeader(new BasicHeader((String)paramMap.getKey(), (String)((List)paramMap.getValue()).get(0)));
        }
      }
    }
    return (HttpResponse)localObject1;
  }
  
  public static abstract interface a
  {
    public abstract String a();
  }
}


/* Location:              com/google/android/gms/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */