package com.a.a.a;

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

public final class d$a
  extends HttpEntityEnclosingRequestBase
{
  public d$a() {}
  
  public d$a(String paramString)
  {
    URI localURI = URI.create(paramString);
    setURI(localURI);
  }
  
  public final String getMethod()
  {
    return "PATCH";
  }
}


/* Location:              com/a/a/a/d$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */