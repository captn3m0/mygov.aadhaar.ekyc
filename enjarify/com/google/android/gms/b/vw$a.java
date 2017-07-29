package com.google.android.gms.b;

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

public final class vw$a
  extends HttpEntityEnclosingRequestBase
{
  public vw$a() {}
  
  public vw$a(String paramString)
  {
    URI localURI = URI.create(paramString);
    setURI(localURI);
  }
  
  public final String getMethod()
  {
    return "PATCH";
  }
}


/* Location:              com/google/android/gms/b/vw$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */