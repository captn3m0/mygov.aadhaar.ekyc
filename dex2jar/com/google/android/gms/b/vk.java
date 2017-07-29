package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.os.Message;
import android.view.View;
import android.view.WindowManager.BadTokenException;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.g;
import com.google.android.gms.ads.internal.w;

@qi
@TargetApi(11)
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
    if (!(paramWebView instanceof vc)) {
      paramWebView = paramWebView.getContext();
    }
    vc localvc;
    Activity localActivity;
    do
    {
      return paramWebView;
      localvc = (vc)paramWebView;
      localActivity = localvc.f();
      paramWebView = localActivity;
    } while (localActivity != null);
    return localvc.getContext();
  }
  
  private static boolean a(final Context paramContext, String paramString1, String paramString2, String paramString3, JsResult paramJsResult, JsPromptResult paramJsPromptResult, boolean paramBoolean)
  {
    try
    {
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramContext);
      localBuilder.setTitle(paramString1);
      if (paramBoolean)
      {
        paramString1 = new LinearLayout(paramContext);
        paramString1.setOrientation(1);
        paramJsResult = new TextView(paramContext);
        paramJsResult.setText(paramString2);
        paramContext = new EditText(paramContext);
        paramContext.setText(paramString3);
        paramString1.addView(paramJsResult);
        paramString1.addView(paramContext);
        localBuilder.setView(paramString1).setPositiveButton(17039370, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            confirm(paramContext.getText().toString());
          }
        }).setNegativeButton(17039360, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            cancel();
          }
        }).setOnCancelListener(new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            cancel();
          }
        }).create().show();
        return true;
      }
      localBuilder.setMessage(paramString2).setPositiveButton(17039370, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          confirm();
        }
      }).setNegativeButton(17039360, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          cancel();
        }
      }).setOnCancelListener(new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          cancel();
        }
      }).create().show();
      return true;
    }
    catch (WindowManager.BadTokenException paramContext)
    {
      tp.c("Fail to display Dialog.", paramContext);
    }
    return true;
  }
  
  protected final void a(View paramView, int paramInt, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    g localg = a.i();
    if (localg == null)
    {
      tp.e("Could not get ad overlay when showing custom view.");
      paramCustomViewCallback.onCustomViewHidden();
      return;
    }
    h = new FrameLayout(b);
    h.setBackgroundColor(-16777216);
    h.addView(paramView, -1, -1);
    b.setContentView(h);
    s = true;
    i = paramCustomViewCallback;
    g = true;
    localg.a(paramInt);
  }
  
  public final void onCloseWindow(WebView paramWebView)
  {
    if (!(paramWebView instanceof vc))
    {
      tp.e("Tried to close a WebView that wasn't an AdWebView.");
      return;
    }
    paramWebView = ((vc)paramWebView).i();
    if (paramWebView == null)
    {
      tp.e("Tried to close an AdWebView not associated with an overlay.");
      return;
    }
    paramWebView.a();
  }
  
  public final boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    String str1 = String.valueOf(paramConsoleMessage.message());
    String str2 = String.valueOf(paramConsoleMessage.sourceId());
    int i = paramConsoleMessage.lineNumber();
    str1 = String.valueOf(str1).length() + 19 + String.valueOf(str2).length() + "JS: " + str1 + " (" + str2 + ":" + i + ")";
    if (str1.contains("Application Cache")) {
      return super.onConsoleMessage(paramConsoleMessage);
    }
    switch (7.a[paramConsoleMessage.messageLevel().ordinal()])
    {
    default: 
      tp.d(str1);
    }
    for (;;)
    {
      return super.onConsoleMessage(paramConsoleMessage);
      tp.c(str1);
      continue;
      tp.e(str1);
      continue;
      tp.d(str1);
      continue;
      tp.b(str1);
    }
  }
  
  public final boolean onCreateWindow(WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, Message paramMessage)
  {
    WebView.WebViewTransport localWebViewTransport = (WebView.WebViewTransport)obj;
    paramWebView = new WebView(paramWebView.getContext());
    paramWebView.setWebViewClient(a.l());
    localWebViewTransport.setWebView(paramWebView);
    paramMessage.sendToTarget();
    return true;
  }
  
  public final void onExceededDatabaseQuota(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    long l = 5242880L - paramLong3;
    if (l <= 0L)
    {
      paramQuotaUpdater.updateQuota(paramLong1);
      return;
    }
    if (paramLong1 == 0L)
    {
      if ((paramLong2 <= l) && (paramLong2 <= 1048576L)) {}
      for (;;)
      {
        paramQuotaUpdater.updateQuota(paramLong2);
        return;
        paramLong2 = 0L;
      }
    }
    if (paramLong2 == 0L) {
      paramLong3 = Math.min(Math.min(131072L, l) + paramLong1, 1048576L);
    }
    for (;;)
    {
      paramLong2 = paramLong3;
      break;
      paramLong3 = paramLong1;
      if (paramLong2 <= Math.min(1048576L - paramLong1, l)) {
        paramLong3 = paramLong1 + paramLong2;
      }
    }
  }
  
  public final void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
  {
    if (paramCallback != null)
    {
      w.e();
      if (!tt.a(a.getContext(), a.getContext().getPackageName(), "android.permission.ACCESS_FINE_LOCATION"))
      {
        w.e();
        if (!tt.a(a.getContext(), a.getContext().getPackageName(), "android.permission.ACCESS_COARSE_LOCATION")) {
          break label84;
        }
      }
    }
    label84:
    for (boolean bool = true;; bool = false)
    {
      paramCallback.invoke(paramString, bool, true);
      return;
    }
  }
  
  public final void onHideCustomView()
  {
    g localg = a.i();
    if (localg == null)
    {
      tp.e("Could not get ad overlay when hiding custom view.");
      return;
    }
    localg.b();
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
    paramLong1 = 131072L + paramLong1;
    if (5242880L - paramLong2 < paramLong1)
    {
      paramQuotaUpdater.updateQuota(0L);
      return;
    }
    paramQuotaUpdater.updateQuota(paramLong1);
  }
  
  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    a(paramView, -1, paramCustomViewCallback);
  }
}


/* Location:              com/google/android/gms/b/vk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */