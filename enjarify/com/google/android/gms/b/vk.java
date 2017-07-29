package com.google.android.gms.b;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.os.Message;
import android.view.View;
import android.view.WindowManager.BadTokenException;
import android.webkit.ConsoleMessage;
import android.webkit.ConsoleMessage.MessageLevel;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.g;
import com.google.android.gms.ads.internal.w;

public class vk
  extends WebChromeClient
{
  private final vc a;
  
  public vk(vc paramvc)
  {
    a = paramvc;
  }
  
  private static Context a(WebView paramWebView)
  {
    boolean bool = paramWebView instanceof vc;
    Object localObject;
    if (!bool) {
      localObject = paramWebView.getContext();
    }
    for (;;)
    {
      return (Context)localObject;
      paramWebView = (vc)paramWebView;
      localObject = paramWebView.f();
      if (localObject == null) {
        localObject = paramWebView.getContext();
      }
    }
  }
  
  private static boolean a(Context paramContext, String paramString1, String paramString2, String paramString3, JsResult paramJsResult, JsPromptResult paramJsPromptResult, boolean paramBoolean)
  {
    boolean bool = true;
    for (;;)
    {
      try
      {
        localObject1 = new android/app/AlertDialog$Builder;
        ((AlertDialog.Builder)localObject1).<init>(paramContext);
        ((AlertDialog.Builder)localObject1).setTitle(paramString1);
        if (!paramBoolean) {
          continue;
        }
        localObject2 = new android/widget/LinearLayout;
        ((LinearLayout)localObject2).<init>(paramContext);
        int i = 1;
        ((LinearLayout)localObject2).setOrientation(i);
        localObject3 = new android/widget/TextView;
        ((TextView)localObject3).<init>(paramContext);
        ((TextView)localObject3).setText(paramString2);
        EditText localEditText = new android/widget/EditText;
        localEditText.<init>(paramContext);
        localEditText.setText(paramString3);
        ((LinearLayout)localObject2).addView((View)localObject3);
        ((LinearLayout)localObject2).addView(localEditText);
        localObject1 = ((AlertDialog.Builder)localObject1).setView((View)localObject2);
        j = 17039370;
        localObject3 = new com/google/android/gms/b/vk$6;
        ((vk.6)localObject3).<init>(paramJsPromptResult, localEditText);
        localObject1 = ((AlertDialog.Builder)localObject1).setPositiveButton(j, (DialogInterface.OnClickListener)localObject3);
        j = 17039360;
        localObject3 = new com/google/android/gms/b/vk$5;
        ((vk.5)localObject3).<init>(paramJsPromptResult);
        localObject1 = ((AlertDialog.Builder)localObject1).setNegativeButton(j, (DialogInterface.OnClickListener)localObject3);
        localObject2 = new com/google/android/gms/b/vk$4;
        ((vk.4)localObject2).<init>(paramJsPromptResult);
        localObject1 = ((AlertDialog.Builder)localObject1).setOnCancelListener((DialogInterface.OnCancelListener)localObject2);
        localObject1 = ((AlertDialog.Builder)localObject1).create();
        ((AlertDialog)localObject1).show();
      }
      catch (WindowManager.BadTokenException localBadTokenException)
      {
        Object localObject1;
        Object localObject3;
        int j;
        Object localObject2 = "Fail to display Dialog.";
        tp.c((String)localObject2, localBadTokenException);
        continue;
      }
      return bool;
      localObject1 = ((AlertDialog.Builder)localObject1).setMessage(paramString2);
      j = 17039370;
      localObject3 = new com/google/android/gms/b/vk$3;
      ((vk.3)localObject3).<init>(paramJsResult);
      localObject1 = ((AlertDialog.Builder)localObject1).setPositiveButton(j, (DialogInterface.OnClickListener)localObject3);
      j = 17039360;
      localObject3 = new com/google/android/gms/b/vk$2;
      ((vk.2)localObject3).<init>(paramJsResult);
      localObject1 = ((AlertDialog.Builder)localObject1).setNegativeButton(j, (DialogInterface.OnClickListener)localObject3);
      localObject2 = new com/google/android/gms/b/vk$1;
      ((vk.1)localObject2).<init>(paramJsResult);
      localObject1 = ((AlertDialog.Builder)localObject1).setOnCancelListener((DialogInterface.OnCancelListener)localObject2);
      localObject1 = ((AlertDialog.Builder)localObject1).create();
      ((AlertDialog)localObject1).show();
    }
  }
  
  protected final void a(View paramView, int paramInt, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    boolean bool = true;
    int i = -1;
    Object localObject1 = a.i();
    if (localObject1 == null)
    {
      localObject1 = "Could not get ad overlay when showing custom view.";
      tp.e((String)localObject1);
      paramCustomViewCallback.onCustomViewHidden();
    }
    for (;;)
    {
      return;
      Object localObject2 = new android/widget/FrameLayout;
      Object localObject3 = b;
      ((FrameLayout)localObject2).<init>((Context)localObject3);
      h = ((FrameLayout)localObject2);
      localObject2 = h;
      int j = -16777216;
      ((FrameLayout)localObject2).setBackgroundColor(j);
      h.addView(paramView, i, i);
      localObject2 = b;
      localObject3 = h;
      ((Activity)localObject2).setContentView((View)localObject3);
      s = bool;
      i = paramCustomViewCallback;
      g = bool;
      ((g)localObject1).a(paramInt);
    }
  }
  
  public final void onCloseWindow(WebView paramWebView)
  {
    boolean bool = paramWebView instanceof vc;
    Object localObject;
    if (!bool)
    {
      localObject = "Tried to close a WebView that wasn't an AdWebView.";
      tp.e((String)localObject);
    }
    for (;;)
    {
      return;
      paramWebView = (vc)paramWebView;
      localObject = paramWebView.i();
      if (localObject == null)
      {
        localObject = "Tried to close an AdWebView not associated with an overlay.";
        tp.e((String)localObject);
      }
      else
      {
        ((g)localObject).a();
      }
    }
  }
  
  public final boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    Object localObject1 = String.valueOf(paramConsoleMessage.message());
    Object localObject2 = String.valueOf(paramConsoleMessage.sourceId());
    int i = paramConsoleMessage.lineNumber();
    int j = String.valueOf(localObject1).length() + 19;
    int k = String.valueOf(localObject2).length();
    j += k;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(j);
    localObject1 = localStringBuilder.append("JS: ").append((String)localObject1);
    String str = " (";
    localObject1 = str + (String)localObject2 + ":" + i + ")";
    localObject2 = "Application Cache";
    boolean bool1 = ((String)localObject1).contains((CharSequence)localObject2);
    boolean bool2;
    if (bool1)
    {
      bool2 = super.onConsoleMessage(paramConsoleMessage);
      return bool2;
    }
    localObject2 = vk.7.a;
    ConsoleMessage.MessageLevel localMessageLevel = paramConsoleMessage.messageLevel();
    i = localMessageLevel.ordinal();
    int m = localObject2[i];
    switch (m)
    {
    default: 
      tp.d((String)localObject1);
    }
    for (;;)
    {
      bool2 = super.onConsoleMessage(paramConsoleMessage);
      break;
      tp.c((String)localObject1);
      continue;
      tp.e((String)localObject1);
      continue;
      tp.d((String)localObject1);
      continue;
      tp.b((String)localObject1);
    }
  }
  
  public final boolean onCreateWindow(WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, Message paramMessage)
  {
    WebView.WebViewTransport localWebViewTransport = (WebView.WebViewTransport)obj;
    WebView localWebView = new android/webkit/WebView;
    Object localObject = paramWebView.getContext();
    localWebView.<init>((Context)localObject);
    localObject = a.l();
    localWebView.setWebViewClient((WebViewClient)localObject);
    localWebViewTransport.setWebView(localWebView);
    paramMessage.sendToTarget();
    return true;
  }
  
  public final void onExceededDatabaseQuota(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    long l1 = 5242880L - paramLong3;
    long l2 = 0L;
    boolean bool1 = l1 < l2;
    if (!bool1)
    {
      paramQuotaUpdater.updateQuota(paramLong1);
      return;
    }
    l2 = 0L;
    bool1 = paramLong1 < l2;
    boolean bool2;
    if (!bool1)
    {
      bool2 = paramLong2 < l1;
      if (!bool2)
      {
        l1 = 1048576L;
        bool2 = paramLong2 < l1;
        if (bool2) {}
      }
      for (;;)
      {
        paramQuotaUpdater.updateQuota(paramLong2);
        break;
        paramLong2 = 0L;
      }
    }
    l2 = 0L;
    bool1 = paramLong2 < l2;
    if (!bool1)
    {
      l1 = Math.min(131072L, l1) + paramLong1;
      l2 = 1048576L;
      paramLong1 = Math.min(l1, l2);
    }
    for (;;)
    {
      paramLong2 = paramLong1;
      break;
      l2 = 1048576L - paramLong1;
      l1 = Math.min(l2, l1);
      bool2 = paramLong2 < l1;
      if (!bool2) {
        paramLong1 += paramLong2;
      }
    }
  }
  
  public final void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
  {
    boolean bool1 = true;
    Context localContext;
    boolean bool2;
    if (paramCallback != null)
    {
      w.e();
      localContext = a.getContext();
      String str1 = a.getContext().getPackageName();
      String str2 = "android.permission.ACCESS_FINE_LOCATION";
      bool2 = tt.a(localContext, str1, str2);
      if (!bool2)
      {
        w.e();
        localContext = a.getContext();
        str1 = a.getContext().getPackageName();
        str2 = "android.permission.ACCESS_COARSE_LOCATION";
        bool2 = tt.a(localContext, str1, str2);
        if (!bool2) {
          break label120;
        }
      }
      bool2 = bool1;
    }
    for (;;)
    {
      paramCallback.invoke(paramString, bool2, bool1);
      return;
      label120:
      bool2 = false;
      localContext = null;
    }
  }
  
  public final void onHideCustomView()
  {
    Object localObject = a.i();
    if (localObject == null)
    {
      localObject = "Could not get ad overlay when hiding custom view.";
      tp.e((String)localObject);
    }
    for (;;)
    {
      return;
      ((g)localObject).b();
    }
  }
  
  public final boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return a(a(paramWebView), paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public final boolean onJsBeforeUnload(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return a(a(paramWebView), paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public final boolean onJsConfirm(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return a(a(paramWebView), paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public final boolean onJsPrompt(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    return a(a(paramWebView), paramString1, paramString2, paramString3, null, paramJsPromptResult, true);
  }
  
  public final void onReachedMaxAppCacheSize(long paramLong1, long paramLong2, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    long l1 = 5242880L - paramLong2;
    long l2 = 131072L + paramLong1;
    boolean bool = l1 < l2;
    if (bool)
    {
      l1 = 0L;
      paramQuotaUpdater.updateQuota(l1);
    }
    for (;;)
    {
      return;
      paramQuotaUpdater.updateQuota(l2);
    }
  }
  
  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    a(paramView, -1, paramCustomViewCallback);
  }
}


/* Location:              com/google/android/gms/b/vk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */