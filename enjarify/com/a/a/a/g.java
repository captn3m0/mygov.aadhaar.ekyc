package com.a.a.a;

import com.a.a.l;
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
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public final class g
  implements f
{
  private final g.a a = null;
  private final SSLSocketFactory b = null;
  
  public g()
  {
    this((byte)0);
  }
  
  private g(byte paramByte)
  {
    this('\000');
  }
  
  private g(char paramChar) {}
  
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
  
  private static void a(HttpURLConnection paramHttpURLConnection, l paraml)
  {
    byte[] arrayOfByte = paraml.e();
    if (arrayOfByte != null)
    {
      boolean bool = true;
      paramHttpURLConnection.setDoOutput(bool);
      Object localObject = paraml.d();
      paramHttpURLConnection.addRequestProperty("Content-Type", (String)localObject);
      DataOutputStream localDataOutputStream = new java/io/DataOutputStream;
      localObject = paramHttpURLConnection.getOutputStream();
      localDataOutputStream.<init>((OutputStream)localObject);
      localDataOutputStream.write(arrayOfByte);
      localDataOutputStream.close();
    }
  }
  
  public final HttpResponse a(l paraml, Map paramMap)
  {
    int i = 1;
    Object localObject1 = b;
    Object localObject2 = new java/util/HashMap;
    ((HashMap)localObject2).<init>();
    Object localObject3 = paraml.a();
    ((HashMap)localObject2).putAll((Map)localObject3);
    ((HashMap)localObject2).putAll(paramMap);
    localObject3 = a;
    Object localObject5;
    if (localObject3 != null)
    {
      localObject3 = a.a();
      if (localObject3 == null)
      {
        localObject4 = new java/io/IOException;
        localObject5 = "URL blocked by rewriter: ";
        localObject3 = String.valueOf(localObject1);
        int j = ((String)localObject3).length();
        if (j != 0) {
          localObject3 = ((String)localObject5).concat((String)localObject3);
        }
        for (;;)
        {
          ((IOException)localObject4).<init>((String)localObject3);
          throw ((Throwable)localObject4);
          localObject3 = new java/lang/String;
          ((String)localObject3).<init>((String)localObject5);
        }
      }
    }
    else
    {
      localObject3 = localObject1;
    }
    localObject1 = new java/net/URL;
    ((URL)localObject1).<init>((String)localObject3);
    localObject3 = (HttpURLConnection)((URL)localObject1).openConnection();
    boolean bool2 = HttpURLConnection.getFollowRedirects();
    ((HttpURLConnection)localObject3).setInstanceFollowRedirects(bool2);
    int m = paraml.f();
    ((HttpURLConnection)localObject3).setConnectTimeout(m);
    ((HttpURLConnection)localObject3).setReadTimeout(m);
    ((HttpURLConnection)localObject3).setUseCaches(false);
    ((HttpURLConnection)localObject3).setDoInput(i);
    Object localObject4 = "https";
    localObject1 = ((URL)localObject1).getProtocol();
    boolean bool1 = ((String)localObject4).equals(localObject1);
    if (bool1)
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
    Object localObject6 = ((Set)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject6).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = ((Iterator)localObject6).next();
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
    case -1: 
      localObject1 = paraml.c();
      if (localObject1 != null)
      {
        ((HttpURLConnection)localObject3).setDoOutput(i);
        ((HttpURLConnection)localObject3).setRequestMethod("POST");
        localObject2 = paraml.b();
        ((HttpURLConnection)localObject3).addRequestProperty("Content-Type", (String)localObject2);
        localObject4 = new java/io/DataOutputStream;
        localObject2 = ((HttpURLConnection)localObject3).getOutputStream();
        ((DataOutputStream)localObject4).<init>((OutputStream)localObject2);
        ((DataOutputStream)localObject4).write((byte[])localObject1);
        ((DataOutputStream)localObject4).close();
      }
      break;
    }
    for (;;)
    {
      localObject1 = new org/apache/http/ProtocolVersion;
      localObject4 = "HTTP";
      ((ProtocolVersion)localObject1).<init>((String)localObject4, i, i);
      m = ((HttpURLConnection)localObject3).getResponseCode();
      n = -1;
      if (m != n) {
        break;
      }
      localObject3 = new java/io/IOException;
      ((IOException)localObject3).<init>("Could not retrieve response code from HttpUrlConnection.");
      throw ((Throwable)localObject3);
      localObject1 = "GET";
      ((HttpURLConnection)localObject3).setRequestMethod((String)localObject1);
      continue;
      localObject1 = "DELETE";
      ((HttpURLConnection)localObject3).setRequestMethod((String)localObject1);
      continue;
      localObject1 = "POST";
      ((HttpURLConnection)localObject3).setRequestMethod((String)localObject1);
      a((HttpURLConnection)localObject3, paraml);
      continue;
      localObject1 = "PUT";
      ((HttpURLConnection)localObject3).setRequestMethod((String)localObject1);
      a((HttpURLConnection)localObject3, paraml);
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
      a((HttpURLConnection)localObject3, paraml);
    }
    localObject4 = new org/apache/http/message/BasicStatusLine;
    int n = ((HttpURLConnection)localObject3).getResponseCode();
    localObject6 = ((HttpURLConnection)localObject3).getResponseMessage();
    ((BasicStatusLine)localObject4).<init>((ProtocolVersion)localObject1, n, (String)localObject6);
    localObject2 = new org/apache/http/message/BasicHttpResponse;
    ((BasicHttpResponse)localObject2).<init>((StatusLine)localObject4);
    k = a;
    m = ((StatusLine)localObject4).getStatusCode();
    int i1 = 4;
    if (k != i1)
    {
      k = 100;
      if (k <= m)
      {
        k = 200;
        if (m < k) {}
      }
      else
      {
        k = 204;
        if (m != k)
        {
          k = 304;
          if (m != k) {
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
          localObject5 = new org/apache/http/message/BasicHeader;
          localObject3 = (String)((Map.Entry)localObject1).getKey();
          localObject1 = (String)((List)((Map.Entry)localObject1).getValue()).get(0);
          ((BasicHeader)localObject5).<init>((String)localObject3, (String)localObject1);
          ((BasicHttpResponse)localObject2).addHeader((Header)localObject5);
        }
      }
      k = 0;
      localObject1 = null;
    }
    return (HttpResponse)localObject2;
  }
}


/* Location:              com/a/a/a/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */