package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@qi
@TargetApi(11)
public final class vl
  extends vn
{
  public vl(vc paramvc, boolean paramBoolean)
  {
    super(paramvc, paramBoolean);
  }
  
  public final WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    return a(paramWebView, paramString);
  }
}


/* Location:              com/google/android/gms/b/vl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */