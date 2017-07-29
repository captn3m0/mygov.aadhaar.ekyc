package com.google.android.gms.b;

import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

final class hi$2
  implements Runnable
{
  ValueCallback a;
  
  hi$2(hi paramhi, hf paramhf, WebView paramWebView, boolean paramBoolean)
  {
    hi.2.1 local1 = new com/google/android/gms/b/hi$2$1;
    local1.<init>(this);
    a = local1;
  }
  
  public final void run()
  {
    Object localObject1 = c.getSettings();
    boolean bool = ((WebSettings)localObject1).getJavaScriptEnabled();
    if (bool) {}
    try
    {
      localObject1 = c;
      str = "(function() { return  {text:document.body.innerText}})();";
      ValueCallback localValueCallback2 = a;
      ((WebView)localObject1).evaluateJavascript(str, localValueCallback2);
      return;
    }
    finally
    {
      for (;;)
      {
        ValueCallback localValueCallback1 = a;
        String str = "";
        localValueCallback1.onReceiveValue(str);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/hi$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */