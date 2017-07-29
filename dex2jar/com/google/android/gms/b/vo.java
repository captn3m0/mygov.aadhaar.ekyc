package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@qi
@TargetApi(21)
public final class vo
  extends vn
{
  public vo(vc paramvc, boolean paramBoolean)
  {
    super(paramvc, paramBoolean);
  }
  
  public final WebResourceResponse shouldInterceptRequest(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    if ((paramWebResourceRequest == null) || (paramWebResourceRequest.getUrl() == null)) {
      return null;
    }
    String str = paramWebResourceRequest.getUrl().toString();
    paramWebResourceRequest.getRequestHeaders();
    return a(paramWebView, str);
  }
}


/* Location:              com/google/android/gms/b/vo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */