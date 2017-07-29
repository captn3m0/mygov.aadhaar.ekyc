package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.a.c;
import com.google.android.gms.ads.a.d;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.h;
import com.google.android.gms.common.m;
import com.google.android.gms.common.util.i;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.StringTokenizer;

@qi
public final class uk
{
  public static final Handler a = new Handler(Looper.getMainLooper());
  private static final String b = e.class.getName();
  private static final String c = h.class.getName();
  private static final String d = c.class.getName();
  private static final String e = d.class.getName();
  private static final String f = com.google.android.gms.ads.e.b.class.getName();
  private static final String g = com.google.android.gms.ads.b.class.getName();
  
  public static int a(Context paramContext, int paramInt)
  {
    return a(paramContext.getResources().getDisplayMetrics(), paramInt);
  }
  
  public static int a(DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    return (int)TypedValue.applyDimension(1, paramInt, paramDisplayMetrics);
  }
  
  public static String a(Context paramContext)
  {
    paramContext = paramContext.getContentResolver();
    if (paramContext == null) {}
    for (paramContext = null;; paramContext = Settings.Secure.getString(paramContext, "android_id"))
    {
      if ((paramContext == null) || (a())) {
        paramContext = "emulator";
      }
      return a(paramContext);
    }
  }
  
  public static String a(String paramString)
  {
    int i = 0;
    while (i < 2) {
      try
      {
        Object localObject = MessageDigest.getInstance("MD5");
        ((MessageDigest)localObject).update(paramString.getBytes());
        localObject = String.format(Locale.US, "%032X", new Object[] { new BigInteger(1, ((MessageDigest)localObject).digest()) });
        return (String)localObject;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        i += 1;
      }
    }
    return null;
  }
  
  public static String a(StackTraceElement[] paramArrayOfStackTraceElement, String paramString)
  {
    int i = 0;
    Object localObject1;
    Object localObject2;
    if (i + 1 < paramArrayOfStackTraceElement.length)
    {
      localObject1 = paramArrayOfStackTraceElement[i];
      localObject2 = ((StackTraceElement)localObject1).getClassName();
      if ((!"loadAd".equalsIgnoreCase(((StackTraceElement)localObject1).getMethodName())) || ((!b.equalsIgnoreCase((String)localObject2)) && (!c.equalsIgnoreCase((String)localObject2)) && (!d.equalsIgnoreCase((String)localObject2)) && (!e.equalsIgnoreCase((String)localObject2)) && (!f.equalsIgnoreCase((String)localObject2)) && (!g.equalsIgnoreCase((String)localObject2)))) {}
    }
    for (paramArrayOfStackTraceElement = paramArrayOfStackTraceElement[(i + 1)].getClassName();; paramArrayOfStackTraceElement = null)
    {
      if (paramString != null)
      {
        localObject1 = new StringTokenizer(paramString, ".");
        localObject2 = new StringBuilder();
        i = 2;
        if (((StringTokenizer)localObject1).hasMoreElements())
        {
          ((StringBuilder)localObject2).append(((StringTokenizer)localObject1).nextToken());
          for (;;)
          {
            if ((i > 0) && (((StringTokenizer)localObject1).hasMoreElements()))
            {
              ((StringBuilder)localObject2).append(".").append(((StringTokenizer)localObject1).nextToken());
              i -= 1;
              continue;
              i += 1;
              break;
            }
          }
          paramString = ((StringBuilder)localObject2).toString();
        }
        if ((paramArrayOfStackTraceElement != null) && (!paramArrayOfStackTraceElement.contains(paramString))) {
          return paramArrayOfStackTraceElement;
        }
      }
      return null;
    }
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean, a parama)
  {
    if (paramBoolean)
    {
      Context localContext = paramContext.getApplicationContext();
      Object localObject = localContext;
      if (localContext == null) {
        localObject = paramContext;
      }
      paramBundle.putString("os", Build.VERSION.RELEASE);
      paramBundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
      paramBundle.putString("appid", ((Context)localObject).getPackageName());
      localObject = paramString1;
      if (paramString1 == null)
      {
        int i = m.b().b(paramContext);
        localObject = 23 + i + ".10260000";
      }
      paramBundle.putString("js", (String)localObject);
    }
    paramContext = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", paramString2);
    paramString1 = paramBundle.keySet().iterator();
    while (paramString1.hasNext())
    {
      paramString2 = (String)paramString1.next();
      paramContext.appendQueryParameter(paramString2, paramBundle.getString(paramString2));
    }
    parama.a(paramContext.toString());
  }
  
  public static void a(ViewGroup paramViewGroup, il paramil, String paramString1, String paramString2)
  {
    ul.e(paramString2);
    if (paramViewGroup.getChildCount() == 0)
    {
      paramString2 = paramViewGroup.getContext();
      TextView localTextView = new TextView(paramString2);
      localTextView.setGravity(17);
      localTextView.setText(paramString1);
      localTextView.setTextColor(-65536);
      localTextView.setBackgroundColor(-16777216);
      paramString1 = new FrameLayout(paramString2);
      paramString1.setBackgroundColor(-65536);
      int i = a(paramString2, 3);
      paramString1.addView(localTextView, new FrameLayout.LayoutParams(f - i, c - i, 17));
      paramViewGroup.addView(paramString1, f, c);
    }
  }
  
  public static void a(HttpURLConnection paramHttpURLConnection, String paramString)
  {
    paramHttpURLConnection.setConnectTimeout(60000);
    paramHttpURLConnection.setInstanceFollowRedirects(true);
    paramHttpURLConnection.setReadTimeout(60000);
    if (paramString != null) {
      paramHttpURLConnection.setRequestProperty("User-Agent", paramString);
    }
    paramHttpURLConnection.setUseCaches(false);
  }
  
  public static boolean a()
  {
    return Build.DEVICE.startsWith("generic");
  }
  
  public static int b(Context paramContext, int paramInt)
  {
    paramContext = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    paramContext.getMetrics(localDisplayMetrics);
    return b(localDisplayMetrics, paramInt);
  }
  
  public static int b(DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    return Math.round(paramInt / density);
  }
  
  public static String b(Context paramContext)
  {
    paramContext = paramContext.getContentResolver();
    if (paramContext == null) {
      return null;
    }
    return Settings.Secure.getString(paramContext, "android_id");
  }
  
  public static boolean b()
  {
    return Looper.myLooper() == Looper.getMainLooper();
  }
  
  public static boolean c(Context paramContext)
  {
    return m.b().a(paramContext) == 0;
  }
  
  public static boolean d(Context paramContext)
  {
    int i = m.b().a(paramContext);
    return (i == 0) || (i == 2);
  }
  
  public static boolean e(Context paramContext)
  {
    if (getResourcesgetConfigurationorientation != 2) {}
    do
    {
      return false;
      paramContext = paramContext.getResources().getDisplayMetrics();
    } while ((int)(heightPixels / density) >= 600);
    return true;
  }
  
  @TargetApi(17)
  public static boolean f(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    paramContext = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    int j;
    int i;
    if (i.a())
    {
      paramContext.getRealMetrics(localDisplayMetrics);
      j = heightPixels;
      i = widthPixels;
    }
    for (;;)
    {
      paramContext.getMetrics(localDisplayMetrics);
      int k = heightPixels;
      int m = widthPixels;
      if ((k == j) && (m == i))
      {
        return true;
        try
        {
          j = ((Integer)Display.class.getMethod("getRawHeight", new Class[0]).invoke(paramContext, new Object[0])).intValue();
          i = ((Integer)Display.class.getMethod("getRawWidth", new Class[0]).invoke(paramContext, new Object[0])).intValue();
        }
        catch (Exception paramContext)
        {
          return false;
        }
      }
    }
    return false;
  }
  
  public static int g(Context paramContext)
  {
    int i = paramContext.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
    if (i > 0) {
      return paramContext.getResources().getDimensionPixelSize(i);
    }
    return 0;
  }
  
  public static abstract interface a
  {
    public abstract void a(String paramString);
  }
}


/* Location:              com/google/android/gms/b/uk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */