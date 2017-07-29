package com.a.a.a;

import com.a.a.l;
import java.net.URI;
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

public final class d
  implements f
{
  protected final HttpClient a;
  
  public d(HttpClient paramHttpClient)
  {
    a = paramHttpClient;
  }
  
  private static void a(HttpEntityEnclosingRequestBase paramHttpEntityEnclosingRequestBase, l<?> paraml)
  {
    paraml = paraml.e();
    if (paraml != null) {
      paramHttpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(paraml));
    }
  }
  
  private static void a(HttpUriRequest paramHttpUriRequest, Map<String, String> paramMap)
  {
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramHttpUriRequest.setHeader(str, (String)paramMap.get(str));
    }
  }
  
  public final HttpResponse a(l<?> paraml, Map<String, String> paramMap)
  {
    Object localObject;
    switch (a)
    {
    default: 
      throw new IllegalStateException("Unknown request method.");
    case -1: 
      byte[] arrayOfByte = paraml.c();
      if (arrayOfByte != null)
      {
        localObject = new HttpPost(b);
        ((HttpPost)localObject).addHeader("Content-Type", paraml.b());
        ((HttpPost)localObject).setEntity(new ByteArrayEntity(arrayOfByte));
      }
      break;
    }
    for (;;)
    {
      a((HttpUriRequest)localObject, paramMap);
      a((HttpUriRequest)localObject, paraml.a());
      paramMap = ((HttpUriRequest)localObject).getParams();
      int i = paraml.f();
      HttpConnectionParams.setConnectionTimeout(paramMap, 5000);
      HttpConnectionParams.setSoTimeout(paramMap, i);
      return a.execute((HttpUriRequest)localObject);
      localObject = new HttpGet(b);
      continue;
      localObject = new HttpGet(b);
      continue;
      localObject = new HttpDelete(b);
      continue;
      localObject = new HttpPost(b);
      ((HttpPost)localObject).addHeader("Content-Type", paraml.d());
      a((HttpEntityEnclosingRequestBase)localObject, paraml);
      continue;
      localObject = new HttpPut(b);
      ((HttpPut)localObject).addHeader("Content-Type", paraml.d());
      a((HttpEntityEnclosingRequestBase)localObject, paraml);
      continue;
      localObject = new HttpHead(b);
      continue;
      localObject = new HttpOptions(b);
      continue;
      localObject = new HttpTrace(b);
      continue;
      localObject = new a(b);
      ((a)localObject).addHeader("Content-Type", paraml.d());
      a((HttpEntityEnclosingRequestBase)localObject, paraml);
    }
  }
  
  public static final class a
    extends HttpEntityEnclosingRequestBase
  {
    public a() {}
    
    public a(String paramString)
    {
      setURI(URI.create(paramString));
    }
    
    public final String getMethod()
    {
      return "PATCH";
    }
  }
}


/* Location:              com/a/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */