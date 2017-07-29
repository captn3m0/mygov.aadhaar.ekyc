package com.a.a.a;

import com.a.a.l;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public final class d
  implements f
{
  protected final HttpClient a;
  
  public d(HttpClient paramHttpClient)
  {
    a = paramHttpClient;
  }
  
  private static void a(HttpEntityEnclosingRequestBase paramHttpEntityEnclosingRequestBase, l paraml)
  {
    byte[] arrayOfByte = paraml.e();
    if (arrayOfByte != null)
    {
      ByteArrayEntity localByteArrayEntity = new org/apache/http/entity/ByteArrayEntity;
      localByteArrayEntity.<init>(arrayOfByte);
      paramHttpEntityEnclosingRequestBase.setEntity(localByteArrayEntity);
    }
  }
  
  private static void a(HttpUriRequest paramHttpUriRequest, Map paramMap)
  {
    Object localObject = paramMap.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)localIterator.next();
      String str = (String)paramMap.get(localObject);
      paramHttpUriRequest.setHeader((String)localObject, str);
    }
  }
  
  public final HttpResponse a(l paraml, Map paramMap)
  {
    int i = a;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    switch (i)
    {
    default: 
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Unknown request method.");
      throw ((Throwable)localObject1);
    case -1: 
      localObject2 = paraml.c();
      if (localObject2 != null)
      {
        localObject1 = new org/apache/http/client/methods/HttpPost;
        localObject3 = b;
        ((HttpPost)localObject1).<init>((String)localObject3);
        String str = paraml.b();
        ((HttpPost)localObject1).addHeader("Content-Type", str);
        localObject3 = new org/apache/http/entity/ByteArrayEntity;
        ((ByteArrayEntity)localObject3).<init>((byte[])localObject2);
        ((HttpPost)localObject1).setEntity((HttpEntity)localObject3);
      }
      break;
    }
    for (;;)
    {
      a((HttpUriRequest)localObject1, paramMap);
      localObject2 = paraml.a();
      a((HttpUriRequest)localObject1, (Map)localObject2);
      localObject2 = ((HttpUriRequest)localObject1).getParams();
      int j = paraml.f();
      HttpConnectionParams.setConnectionTimeout((HttpParams)localObject2, 5000);
      HttpConnectionParams.setSoTimeout((HttpParams)localObject2, j);
      return a.execute((HttpUriRequest)localObject1);
      localObject1 = new org/apache/http/client/methods/HttpGet;
      localObject2 = b;
      ((HttpGet)localObject1).<init>((String)localObject2);
      continue;
      localObject1 = new org/apache/http/client/methods/HttpGet;
      localObject2 = b;
      ((HttpGet)localObject1).<init>((String)localObject2);
      continue;
      localObject1 = new org/apache/http/client/methods/HttpDelete;
      localObject2 = b;
      ((HttpDelete)localObject1).<init>((String)localObject2);
      continue;
      localObject1 = new org/apache/http/client/methods/HttpPost;
      localObject2 = b;
      ((HttpPost)localObject1).<init>((String)localObject2);
      localObject2 = "Content-Type";
      localObject3 = paraml.d();
      ((HttpPost)localObject1).addHeader((String)localObject2, (String)localObject3);
      a((HttpEntityEnclosingRequestBase)localObject1, paraml);
      continue;
      localObject1 = new org/apache/http/client/methods/HttpPut;
      localObject2 = b;
      ((HttpPut)localObject1).<init>((String)localObject2);
      localObject2 = "Content-Type";
      localObject3 = paraml.d();
      ((HttpPut)localObject1).addHeader((String)localObject2, (String)localObject3);
      a((HttpEntityEnclosingRequestBase)localObject1, paraml);
      continue;
      localObject1 = new org/apache/http/client/methods/HttpHead;
      localObject2 = b;
      ((HttpHead)localObject1).<init>((String)localObject2);
      continue;
      localObject1 = new org/apache/http/client/methods/HttpOptions;
      localObject2 = b;
      ((HttpOptions)localObject1).<init>((String)localObject2);
      continue;
      localObject1 = new org/apache/http/client/methods/HttpTrace;
      localObject2 = b;
      ((HttpTrace)localObject1).<init>((String)localObject2);
      continue;
      localObject1 = new com/a/a/a/d$a;
      localObject2 = b;
      ((d.a)localObject1).<init>((String)localObject2);
      localObject2 = "Content-Type";
      localObject3 = paraml.d();
      ((d.a)localObject1).addHeader((String)localObject2, (String)localObject3);
      a((HttpEntityEnclosingRequestBase)localObject1, paraml);
    }
  }
}


/* Location:              com/a/a/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */