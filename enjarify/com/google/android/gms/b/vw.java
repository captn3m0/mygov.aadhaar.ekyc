package com.google.android.gms.b;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
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

public final class vw
  implements vy
{
  protected final HttpClient a;
  
  public vw(HttpClient paramHttpClient)
  {
    a = paramHttpClient;
  }
  
  private static void a(HttpEntityEnclosingRequestBase paramHttpEntityEnclosingRequestBase, pc parampc)
  {
    byte[] arrayOfByte = parampc.c();
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
  
  public final HttpResponse a(pc parampc, Map paramMap)
  {
    int i = a;
    Object localObject1;
    Object localObject2;
    switch (i)
    {
    default: 
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Unknown request method.");
      throw ((Throwable)localObject1);
    case -1: 
      localObject1 = new org/apache/http/client/methods/HttpGet;
      localObject2 = b;
      ((HttpGet)localObject1).<init>((String)localObject2);
    }
    for (;;)
    {
      a((HttpUriRequest)localObject1, paramMap);
      localObject2 = parampc.a();
      a((HttpUriRequest)localObject1, (Map)localObject2);
      localObject2 = ((HttpUriRequest)localObject1).getParams();
      int j = parampc.d();
      HttpConnectionParams.setConnectionTimeout((HttpParams)localObject2, 5000);
      HttpConnectionParams.setSoTimeout((HttpParams)localObject2, j);
      return a.execute((HttpUriRequest)localObject1);
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
      String str = pc.b();
      ((HttpPost)localObject1).addHeader((String)localObject2, str);
      a((HttpEntityEnclosingRequestBase)localObject1, parampc);
      continue;
      localObject1 = new org/apache/http/client/methods/HttpPut;
      localObject2 = b;
      ((HttpPut)localObject1).<init>((String)localObject2);
      localObject2 = "Content-Type";
      str = pc.b();
      ((HttpPut)localObject1).addHeader((String)localObject2, str);
      a((HttpEntityEnclosingRequestBase)localObject1, parampc);
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
      localObject1 = new com/google/android/gms/b/vw$a;
      localObject2 = b;
      ((vw.a)localObject1).<init>((String)localObject2);
      localObject2 = "Content-Type";
      str = pc.b();
      ((vw.a)localObject1).addHeader((String)localObject2, str);
      a((HttpEntityEnclosingRequestBase)localObject1, parampc);
    }
  }
}


/* Location:              com/google/android/gms/b/vw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */