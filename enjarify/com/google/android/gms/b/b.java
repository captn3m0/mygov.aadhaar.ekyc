package com.google.android.gms.b;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
  private final b.a a = null;
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
    BasicHttpEntity localBasicHttpEntity = new org/apache/http/entity/BasicHttpEntity;
    localBasicHttpEntity.<init>();
    try
    {
      localObject = paramHttpURLConnection.getInputStream();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Object localObject;
        long l;
        InputStream localInputStream = paramHttpURLConnection.getErrorStream();
      }
    }
    localBasicHttpEntity.setContent((InputStream)localObject);
    l = paramHttpURLConnection.getContentLength();
    localBasicHttpEntity.setContentLength(l);
    localObject = paramHttpURLConnection.getContentEncoding();
    localBasicHttpEntity.setContentEncoding((String)localObject);
    localObject = paramHttpURLConnection.getContentType();
    localBasicHttpEntity.setContentType((String)localObject);
    return localBasicHttpEntity;
  }
  
  private static void a(HttpURLConnection paramHttpURLConnection, pc parampc)
  {
    byte[] arrayOfByte = parampc.c();
    if (arrayOfByte != null)
    {
      boolean bool = true;
      paramHttpURLConnection.setDoOutput(bool);
      Object localObject = pc.b();
      paramHttpURLConnection.addRequestProperty("Content-Type", (String)localObject);
      DataOutputStream localDataOutputStream = new java/io/DataOutputStream;
      localObject = paramHttpURLConnection.getOutputStream();
      localDataOutputStream.<init>((OutputStream)localObject);
      localDataOutputStream.write(arrayOfByte);
      localDataOutputStream.close();
    }
  }
  
  public final HttpResponse a(pc parampc, Map paramMap)
  {
    int i = 1;
    Object localObject1 = b;
    Object localObject2 = new java/util/HashMap;
    ((HashMap)localObject2).<init>();
    Object localObject3 = parampc.a();
    ((HashMap)localObject2).putAll((Map)localObject3);
    ((HashMap)localObject2).putAll(paramMap);
    localObject3 = a;
    if (localObject3 != null)
    {
      localObject3 = a.a();
      if (localObject3 == null)
      {
        localObject3 = new java/io/IOException;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>("URL blocked by rewriter: ");
        localObject1 = (String)localObject1;
        ((IOException)localObject3).<init>((String)localObject1);
        throw ((Throwable)localObject3);
      }
    }
    else
    {
      localObject3 = localObject1;
    }
    localObject1 = new java/net/URL;
    ((URL)localObject1).<init>((String)localObject3);
    localObject3 = (HttpURLConnection)((URL)localObject1).openConnection();
    boolean bool1 = HttpURLConnection.getFollowRedirects();
    ((HttpURLConnection)localObject3).setInstanceFollowRedirects(bool1);
    int j = parampc.d();
    ((HttpURLConnection)localObject3).setConnectTimeout(j);
    ((HttpURLConnection)localObject3).setReadTimeout(j);
    ((HttpURLConnection)localObject3).setUseCaches(false);
    ((HttpURLConnection)localObject3).setDoInput(i);
    Object localObject4 = "https";
    localObject1 = ((URL)localObject1).getProtocol();
    boolean bool2 = ((String)localObject4).equals(localObject1);
    if (bool2)
    {
      localObject1 = b;
      if (localObject1 != null)
      {
        localObject1 = localObject3;
        localObject1 = (HttpsURLConnection)localObject3;
        localObject4 = b;
        ((HttpsURLConnection)localObject1).setSSLSocketFactory((SSLSocketFactory)localObject4);
      }
    }
    localObject1 = ((HashMap)localObject2).keySet();
    Object localObject5 = ((Set)localObject1).iterator();
    for (;;)
    {
      bool2 = ((Iterator)localObject5).hasNext();
      if (!bool2) {
        break;
      }
      localObject1 = ((Iterator)localObject5).next();
      localObject4 = localObject1;
      localObject4 = (String)localObject1;
      localObject1 = (String)((HashMap)localObject2).get(localObject4);
      ((HttpURLConnection)localObject3).addRequestProperty((String)localObject4, (String)localObject1);
    }
    int k = a;
    switch (k)
    {
    default: 
      localObject3 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject3).<init>("Unknown method type.");
      throw ((Throwable)localObject3);
    case 0: 
      localObject1 = "GET";
      ((HttpURLConnection)localObject3).setRequestMethod((String)localObject1);
    }
    for (;;)
    {
      localObject1 = new org/apache/http/ProtocolVersion;
      localObject4 = "HTTP";
      ((ProtocolVersion)localObject1).<init>((String)localObject4, i, i);
      j = ((HttpURLConnection)localObject3).getResponseCode();
      m = -1;
      if (j != m) {
        break;
      }
      localObject3 = new java/io/IOException;
      ((IOException)localObject3).<init>("Could not retrieve response code from HttpUrlConnection.");
      throw ((Throwable)localObject3);
      localObject1 = "DELETE";
      ((HttpURLConnection)localObject3).setRequestMethod((String)localObject1);
      continue;
      localObject1 = "POST";
      ((HttpURLConnection)localObject3).setRequestMethod((String)localObject1);
      a((HttpURLConnection)localObject3, parampc);
      continue;
      localObject1 = "PUT";
      ((HttpURLConnection)localObject3).setRequestMethod((String)localObject1);
      a((HttpURLConnection)localObject3, parampc);
      continue;
      localObject1 = "HEAD";
      ((HttpURLConnection)localObject3).setRequestMethod((String)localObject1);
      continue;
      localObject1 = "OPTIONS";
      ((HttpURLConnection)localObject3).setRequestMethod((String)localObject1);
      continue;
      localObject1 = "TRACE";
      ((HttpURLConnection)localObject3).setRequestMethod((String)localObject1);
      continue;
      localObject1 = "PATCH";
      ((HttpURLConnection)localObject3).setRequestMethod((String)localObject1);
      a((HttpURLConnection)localObject3, parampc);
    }
    localObject4 = new org/apache/http/message/BasicStatusLine;
    int m = ((HttpURLConnection)localObject3).getResponseCode();
    localObject5 = ((HttpURLConnection)localObject3).getResponseMessage();
    ((BasicStatusLine)localObject4).<init>((ProtocolVersion)localObject1, m, (String)localObject5);
    localObject2 = new org/apache/http/message/BasicHttpResponse;
    ((BasicHttpResponse)localObject2).<init>((StatusLine)localObject4);
    k = a;
    j = ((StatusLine)localObject4).getStatusCode();
    int n = 4;
    if (k != n)
    {
      k = 100;
      if (k <= j)
      {
        k = 200;
        if (j < k) {}
      }
      else
      {
        k = 204;
        if (j != k)
        {
          k = 304;
          if (j != k) {
            k = i;
          }
        }
      }
    }
    for (;;)
    {
      if (k != 0)
      {
        localObject1 = a((HttpURLConnection)localObject3);
        ((BasicHttpResponse)localObject2).setEntity((HttpEntity)localObject1);
      }
      localObject3 = ((HttpURLConnection)localObject3).getHeaderFields().entrySet();
      localObject4 = ((Set)localObject3).iterator();
      for (;;)
      {
        boolean bool3 = ((Iterator)localObject4).hasNext();
        if (!bool3) {
          break;
        }
        localObject3 = ((Iterator)localObject4).next();
        localObject1 = localObject3;
        localObject1 = (Map.Entry)localObject3;
        localObject3 = ((Map.Entry)localObject1).getKey();
        if (localObject3 != null)
        {
          BasicHeader localBasicHeader = new org/apache/http/message/BasicHeader;
          localObject3 = (String)((Map.Entry)localObject1).getKey();
          localObject1 = (String)((List)((Map.Entry)localObject1).getValue()).get(0);
          localBasicHeader.<init>((String)localObject3, (String)localObject1);
          ((BasicHttpResponse)localObject2).addHeader(localBasicHeader);
        }
      }
      k = 0;
      localObject1 = null;
    }
    return (HttpResponse)localObject2;
  }
}


/* Location:              com/google/android/gms/b/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */