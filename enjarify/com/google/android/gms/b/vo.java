package com.google.android.gms.b;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

public final class vo
  extends vn
{
  public vo(vc paramvc, boolean paramBoolean)
  {
    super(paramvc, paramBoolean);
  }
  
  public final WebResourceResponse shouldInterceptRequest(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    if (paramWebResourceRequest != null)
    {
      localObject = paramWebResourceRequest.getUrl();
      if (localObject != null) {
        break label19;
      }
    }
    for (Object localObject = null;; localObject = a(paramWebView, (String)localObject))
    {
      return (WebResourceResponse)localObject;
      label19:
      localObject = paramWebResourceRequest.getUrl().toString();
      paramWebResourceRequest.getRequestHeaders();
    }
  }
}


/* Location:              com/google/android/gms/b/vo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */