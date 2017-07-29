package com.google.android.gms.b;

import android.app.Activity;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.IBinder;
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
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class tu
{
  public static boolean a(vc paramvc)
  {
    if (paramvc == null) {}
    for (boolean bool = false;; bool = true)
    {
      return bool;
      paramvc.onPause();
    }
  }
  
  public static boolean b(vc paramvc)
  {
    if (paramvc == null) {}
    for (boolean bool = false;; bool = true)
    {
      return bool;
      paramvc.onResume();
    }
  }
  
  public int a()
  {
    return 0;
  }
  
  public Drawable a(Context paramContext, Bitmap paramBitmap, boolean paramBoolean, float paramFloat)
  {
    BitmapDrawable localBitmapDrawable = new android/graphics/drawable/BitmapDrawable;
    Resources localResources = paramContext.getResources();
    localBitmapDrawable.<init>(localResources, paramBitmap);
    return localBitmapDrawable;
  }
  
  public vd a(vc paramvc, boolean paramBoolean)
  {
    vd localvd = new com/google/android/gms/b/vd;
    localvd.<init>(paramvc, paramBoolean);
    return localvd;
  }
  
  public String a(Context paramContext)
  {
    return "";
  }
  
  public String a(SslError paramSslError)
  {
    return "";
  }
  
  public Set a(Uri paramUri)
  {
    int i = -1;
    int j = paramUri.isOpaque();
    Object localObject;
    if (j != 0) {
      localObject = Collections.emptySet();
    }
    for (;;)
    {
      return (Set)localObject;
      String str = paramUri.getEncodedQuery();
      if (str == null)
      {
        localObject = Collections.emptySet();
      }
      else
      {
        LinkedHashSet localLinkedHashSet = new java/util/LinkedHashSet;
        localLinkedHashSet.<init>();
        j = 0;
        localObject = null;
        int m;
        int k;
        do
        {
          m = str.indexOf('&', j);
          if (m == i) {
            m = str.length();
          }
          int n = str.indexOf('=', j);
          if ((n > m) || (n == i)) {
            n = m;
          }
          localObject = Uri.decode(str.substring(j, n));
          localLinkedHashSet.add(localObject);
          k = m + 1;
          m = str.length();
        } while (k < m);
        localObject = Collections.unmodifiableSet(localLinkedHashSet);
      }
    }
  }
  
  public void a(Activity paramActivity, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    Object localObject1 = paramActivity.getWindow();
    if (localObject1 != null)
    {
      Object localObject2 = ((Window)localObject1).getDecorView();
      if (localObject2 != null)
      {
        localObject2 = ((Window)localObject1).getDecorView().getViewTreeObserver();
        if (localObject2 != null)
        {
          localObject1 = ((Window)localObject1).getDecorView().getViewTreeObserver();
          a((ViewTreeObserver)localObject1, paramOnGlobalLayoutListener);
        }
      }
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
    IBinder localIBinder = paramView.getWindowToken();
    int i;
    if (localIBinder == null)
    {
      i = paramView.getWindowVisibility();
      int k = 8;
      if (i == k) {}
    }
    else
    {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localIBinder = null;
    }
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
      localCookieManager = CookieManager.getInstance();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        CookieManager localCookieManager;
        tp.b("Failed to obtain CookieManager.", localException);
        tj localtj = w.i();
        String str = "ApiLevelUtil.getCookieManager";
        localtj.a(localException, str);
        Object localObject = null;
      }
    }
    return localCookieManager;
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
    int i = -2;
    ViewGroup.LayoutParams localLayoutParams = new android/view/ViewGroup$LayoutParams;
    localLayoutParams.<init>(i, i);
    return localLayoutParams;
  }
}


/* Location:              com/google/android/gms/b/tu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */