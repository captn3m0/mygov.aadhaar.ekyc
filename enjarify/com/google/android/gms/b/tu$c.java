package com.google.android.gms.b;

import android.net.http.SslError;
import android.webkit.WebChromeClient;

public class tu$c
  extends tu.b
{
  public final String a(SslError paramSslError)
  {
    return paramSslError.getUrl();
  }
  
  public final WebChromeClient c(vc paramvc)
  {
    vm localvm = new com/google/android/gms/b/vm;
    localvm.<init>(paramvc);
    return localvm;
  }
}


/* Location:              com/google/android/gms/b/tu$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */