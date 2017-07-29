package com.google.android.gms.b;

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

public final class vw
  implements vy
{
  protected final HttpClient a;
  
  public vw(HttpClient paramHttpClient)
  {
    a = paramHttpClient;
  }
  
  private static void a(HttpEntityEnclosingRequestBase paramHttpEntityEnclosingRequestBase, pc<?> parampc)
  {
    parampc = parampc.c();
    if (parampc != null) {
      paramHttpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(parampc));
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
  
  public final HttpResponse a(pc<?> parampc, Map<String, String> paramMap)
  {
    Object localObject;
    switch (a)
    {
    default: 
      throw new IllegalStateException("Unknown request method.");
    case -1: 
      localObject = new HttpGet(b);
    }
    for (;;)
    {
      a((HttpUriRequest)localObject, paramMap);
      a((HttpUriRequest)localObject, parampc.a());
      paramMap = ((HttpUriRequest)localObject).getParams();
      int i = parampc.d();
      HttpConnectionParams.setConnectionTimeout(paramMap, 5000);
      HttpConnectionParams.setSoTimeout(paramMap, i);
      return a.execute((HttpUriRequest)localObject);
      localObject = new HttpGet(b);
      continue;
      localObject = new HttpDelete(b);
      continue;
      localObject = new HttpPost(b);
      ((HttpPost)localObject).addHeader("Content-Type", pc.b());
      a((HttpEntityEnclosingRequestBase)localObject, parampc);
      continue;
      localObject = new HttpPut(b);
      ((HttpPut)localObject).addHeader("Content-Type", pc.b());
      a((HttpEntityEnclosingRequestBase)localObject, parampc);
      continue;
      localObject = new HttpHead(b);
      continue;
      localObject = new HttpOptions(b);
      continue;
      localObject = new HttpTrace(b);
      continue;
      localObject = new a(b);
      ((a)localObject).addHeader("Content-Type", pc.b());
      a((HttpEntityEnclosingRequestBase)localObject, parampc);
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


/* Location:              com/google/android/gms/b/vw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */