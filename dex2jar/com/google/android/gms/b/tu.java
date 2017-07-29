package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.o;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;

@qi
@TargetApi(8)
public class tu
{
  public static boolean a(vc paramvc)
  {
    if (paramvc == null) {
      return false;
    }
    paramvc.onPause();
    return true;
  }
  
  public static boolean b(vc paramvc)
  {
    if (paramvc == null) {
      return false;
    }
    paramvc.onResume();
    return true;
  }
  
  public int a()
  {
    return 0;
  }
  
  public Drawable a(Context paramContext, Bitmap paramBitmap, boolean paramBoolean, float paramFloat)
  {
    return new BitmapDrawable(paramContext.getResources(), paramBitmap);
  }
  
  public vd a(vc paramvc, boolean paramBoolean)
  {
    return new vd(paramvc, paramBoolean);
  }
  
  public String a(Context paramContext)
  {
    return "";
  }
  
  public String a(SslError paramSslError)
  {
    return "";
  }
  
  public Set<String> a(Uri paramUri)
  {
    if (paramUri.isOpaque()) {
      return Collections.emptySet();
    }
    paramUri = paramUri.getEncodedQuery();
    if (paramUri == null) {
      return Collections.emptySet();
    }
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    int j = 0;
    int i;
    do
    {
      int k = paramUri.indexOf('&', j);
      i = k;
      if (k == -1) {
        i = paramUri.length();
      }
      int m = paramUri.indexOf('=', j);
      if (m <= i)
      {
        k = m;
        if (m != -1) {}
      }
      else
      {
        k = i;
      }
      localLinkedHashSet.add(Uri.decode(paramUri.substring(j, k)));
      i += 1;
      j = i;
    } while (i < paramUri.length());
    return Collections.unmodifiableSet(localLinkedHashSet);
  }
  
  public void a(Activity paramActivity, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    paramActivity = paramActivity.getWindow();
    if ((paramActivity != null) && (paramActivity.getDecorView() != null) && (paramActivity.getDecorView().getViewTreeObserver() != null)) {
      a(paramActivity.getDecorView().getViewTreeObserver(), paramOnGlobalLayoutListener);
    }
  }
  
  public void a(View paramView, Drawable paramDrawable)
  {
    paramView.setBackgroundDrawable(paramDrawable);
  }
  
  public void a(ViewTreeObserver paramViewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    paramViewTreeObserver.removeGlobalOnLayoutListener(paramOnGlobalLayoutListener);
  }
  
  public boolean a(DownloadManager.Request paramRequest)
  {
    return false;
  }
  
  public boolean a(Context paramContext, WebSettings paramWebSettings)
  {
    return false;
  }
  
  public boolean a(View paramView)
  {
    return (paramView.getWindowToken() != null) || (paramView.getWindowVisibility() != 8);
  }
  
  public boolean a(Window paramWindow)
  {
    return false;
  }
  
  public int b()
  {
    return 1;
  }
  
  public void b(Context paramContext)
  {
    w.i().s();
  }
  
  public boolean b(View paramView)
  {
    return false;
  }
  
  public int c()
  {
    return 5;
  }
  
  public CookieManager c(Context paramContext)
  {
    try
    {
      CookieSyncManager.createInstance(paramContext);
      paramContext = CookieManager.getInstance();
      return paramContext;
    }
    catch (Exception paramContext)
    {
      tp.b("Failed to obtain CookieManager.", paramContext);
      w.i().a(paramContext, "ApiLevelUtil.getCookieManager");
    }
    return null;
  }
  
  public WebChromeClient c(vc paramvc)
  {
    return null;
  }
  
  public boolean c(View paramView)
  {
    return false;
  }
  
  public ViewGroup.LayoutParams d()
  {
    return new ViewGroup.LayoutParams(-2, -2);
  }
  
  @TargetApi(9)
  public static class a
    extends tu
  {
    public a()
    {
      super();
    }
    
    public final int a()
    {
      return 6;
    }
    
    public boolean a(DownloadManager.Request paramRequest)
    {
      paramRequest.setShowRunningNotification(true);
      return true;
    }
    
    public final int b()
    {
      return 7;
    }
  }
  
  @TargetApi(11)
  public static class b
    extends tu.a
  {
    public vd a(vc paramvc, boolean paramBoolean)
    {
      return new vl(paramvc, paramBoolean);
    }
    
    public final Set<String> a(Uri paramUri)
    {
      return paramUri.getQueryParameterNames();
    }
    
    public final boolean a(DownloadManager.Request paramRequest)
    {
      paramRequest.allowScanningByMediaScanner();
      paramRequest.setNotificationVisibility(1);
      return true;
    }
    
    public boolean a(Context paramContext, final WebSettings paramWebSettings)
    {
      super.a(paramContext, paramWebSettings);
      ((Boolean)uh.a(new Callable() {})).booleanValue();
    }
    
    public final boolean a(Window paramWindow)
    {
      paramWindow.setFlags(16777216, 16777216);
      return true;
    }
    
    public final boolean b(View paramView)
    {
      paramView.setLayerType(0, null);
      return true;
    }
    
    public WebChromeClient c(vc paramvc)
    {
      return new vk(paramvc);
    }
    
    public final boolean c(View paramView)
    {
      paramView.setLayerType(1, null);
      return true;
    }
  }
  
  @TargetApi(14)
  public static class c
    extends tu.b
  {
    public final String a(SslError paramSslError)
    {
      return paramSslError.getUrl();
    }
    
    public final WebChromeClient c(vc paramvc)
    {
      return new vm(paramvc);
    }
  }
  
  @TargetApi(17)
  public static class d
    extends tu.f
  {
    public final Drawable a(Context paramContext, Bitmap paramBitmap, boolean paramBoolean, float paramFloat)
    {
      if ((!paramBoolean) || (paramFloat <= 0.0F) || (paramFloat > 25.0F)) {
        return new BitmapDrawable(paramContext.getResources(), paramBitmap);
      }
      try
      {
        Object localObject3 = Bitmap.createScaledBitmap(paramBitmap, paramBitmap.getWidth(), paramBitmap.getHeight(), false);
        Object localObject1 = Bitmap.createBitmap((Bitmap)localObject3);
        Object localObject2 = RenderScript.create(paramContext);
        ScriptIntrinsicBlur localScriptIntrinsicBlur = ScriptIntrinsicBlur.create((RenderScript)localObject2, Element.U8_4((RenderScript)localObject2));
        localObject3 = Allocation.createFromBitmap((RenderScript)localObject2, (Bitmap)localObject3);
        localObject2 = Allocation.createFromBitmap((RenderScript)localObject2, (Bitmap)localObject1);
        localScriptIntrinsicBlur.setRadius(paramFloat);
        localScriptIntrinsicBlur.setInput((Allocation)localObject3);
        localScriptIntrinsicBlur.forEach((Allocation)localObject2);
        ((Allocation)localObject2).copyTo((Bitmap)localObject1);
        localObject1 = new BitmapDrawable(paramContext.getResources(), (Bitmap)localObject1);
        return (Drawable)localObject1;
      }
      catch (RuntimeException localRuntimeException) {}
      return new BitmapDrawable(paramContext.getResources(), paramBitmap);
    }
    
    public final String a(Context paramContext)
    {
      ui localui = ui.a();
      if (TextUtils.isEmpty(a)) {
        a = ((String)uh.a(new ui.1(o.f(paramContext), paramContext)));
      }
      return a;
    }
    
    public final boolean a(Context paramContext, WebSettings paramWebSettings)
    {
      super.a(paramContext, paramWebSettings);
      paramWebSettings.setMediaPlaybackRequiresUserGesture(false);
      return true;
    }
    
    public final void b(Context paramContext)
    {
      ui localui = ui.a();
      tp.a("Updating user agent.");
      String str1 = WebSettings.getDefaultUserAgent(paramContext);
      if (!str1.equals(a))
      {
        if (o.f(paramContext) == null)
        {
          String str2 = WebSettings.getDefaultUserAgent(paramContext);
          paramContext.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", str2).apply();
        }
        a = str1;
      }
      tp.a("User agent is updated.");
      w.i().s();
    }
  }
  
  @TargetApi(18)
  public static class e
    extends tu.d
  {
    public boolean a(View paramView)
    {
      return (super.a(paramView)) || (paramView.getWindowId() != null);
    }
    
    public final int c()
    {
      return 14;
    }
  }
  
  @TargetApi(16)
  public static class f
    extends tu.c
  {
    public final void a(Activity paramActivity, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
    {
      paramActivity = paramActivity.getWindow();
      if ((paramActivity != null) && (paramActivity.getDecorView() != null) && (paramActivity.getDecorView().getViewTreeObserver() != null)) {
        paramActivity.getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(paramOnGlobalLayoutListener);
      }
    }
    
    public final void a(View paramView, Drawable paramDrawable)
    {
      paramView.setBackground(paramDrawable);
    }
    
    public final void a(ViewTreeObserver paramViewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
    {
      paramViewTreeObserver.removeOnGlobalLayoutListener(paramOnGlobalLayoutListener);
    }
    
    public boolean a(Context paramContext, WebSettings paramWebSettings)
    {
      super.a(paramContext, paramWebSettings);
      paramWebSettings.setAllowFileAccessFromFileURLs(false);
      paramWebSettings.setAllowUniversalAccessFromFileURLs(false);
      return true;
    }
  }
  
  @TargetApi(19)
  public static class g
    extends tu.e
  {
    public final boolean a(View paramView)
    {
      return paramView.isAttachedToWindow();
    }
    
    public final ViewGroup.LayoutParams d()
    {
      return new ViewGroup.LayoutParams(-1, -1);
    }
  }
  
  @TargetApi(21)
  public static final class h
    extends tu.g
  {
    public final vd a(vc paramvc, boolean paramBoolean)
    {
      return new vo(paramvc, paramBoolean);
    }
    
    public final CookieManager c(Context paramContext)
    {
      try
      {
        paramContext = CookieManager.getInstance();
        return paramContext;
      }
      catch (Exception paramContext)
      {
        tp.b("Failed to obtain CookieManager.", paramContext);
        w.i().a(paramContext, "ApiLevelUtil.getCookieManager");
      }
      return null;
    }
  }
}


/* Location:              com/google/android/gms/b/tu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */