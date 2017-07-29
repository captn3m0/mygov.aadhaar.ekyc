package com.google.android.gms.b;

import android.content.ContentResolver;
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

public final class uk
{
  public static final Handler a;
  private static final String b = e.class.getName();
  private static final String c = h.class.getName();
  private static final String d = c.class.getName();
  private static final String e = d.class.getName();
  private static final String f = com.google.android.gms.ads.e.b.class.getName();
  private static final String g = com.google.android.gms.ads.b.class.getName();
  
  static
  {
    Handler localHandler = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    localHandler.<init>(localLooper);
    a = localHandler;
  }
  
  public static int a(Context paramContext, int paramInt)
  {
    return a(paramContext.getResources().getDisplayMetrics(), paramInt);
  }
  
  public static int a(DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    float f1 = paramInt;
    return (int)TypedValue.applyDimension(1, f1, paramDisplayMetrics);
  }
  
  public static String a(Context paramContext)
  {
    Object localObject = paramContext.getContentResolver();
    if (localObject == null) {}
    String str;
    for (localObject = null;; localObject = Settings.Secure.getString((ContentResolver)localObject, str))
    {
      if (localObject != null)
      {
        boolean bool = a();
        if (!bool) {}
      }
      else
      {
        localObject = "emulator";
      }
      return a((String)localObject);
      str = "android_id";
    }
  }
  
  public static String a(String paramString)
  {
    int i = 0;
    String str1 = null;
    int j = 2;
    Object localObject1;
    if (i < j) {
      localObject1 = "MD5";
    }
    for (;;)
    {
      try
      {
        localObject1 = MessageDigest.getInstance((String)localObject1);
        Object localObject2 = paramString.getBytes();
        ((MessageDigest)localObject1).update((byte[])localObject2);
        localObject2 = Locale.US;
        String str2 = "%032X";
        int k = 1;
        Object[] arrayOfObject = new Object[k];
        BigInteger localBigInteger = new java/math/BigInteger;
        int m = 1;
        localObject1 = ((MessageDigest)localObject1).digest();
        localBigInteger.<init>(m, (byte[])localObject1);
        arrayOfObject[0] = localBigInteger;
        str1 = String.format((Locale)localObject2, str2, arrayOfObject);
        return str1;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        i += 1;
      }
      break;
      i = 0;
      str1 = null;
    }
  }
  
  public static String a(StackTraceElement[] paramArrayOfStackTraceElement, String paramString)
  {
    int i = 0;
    String str1 = null;
    int j = i + 1;
    int m = paramArrayOfStackTraceElement.length;
    Object localObject1;
    String str2;
    Object localObject2;
    if (j < m)
    {
      localObject1 = paramArrayOfStackTraceElement[i];
      str2 = ((StackTraceElement)localObject1).getClassName();
      localObject1 = ((StackTraceElement)localObject1).getMethodName();
      localObject2 = "loadAd";
      boolean bool1 = ((String)localObject2).equalsIgnoreCase((String)localObject1);
      if (bool1)
      {
        localObject1 = b;
        bool1 = ((String)localObject1).equalsIgnoreCase(str2);
        if (!bool1)
        {
          localObject1 = c;
          bool1 = ((String)localObject1).equalsIgnoreCase(str2);
          if (!bool1)
          {
            localObject1 = d;
            bool1 = ((String)localObject1).equalsIgnoreCase(str2);
            if (!bool1)
            {
              localObject1 = e;
              bool1 = ((String)localObject1).equalsIgnoreCase(str2);
              if (!bool1)
              {
                localObject1 = f;
                bool1 = ((String)localObject1).equalsIgnoreCase(str2);
                if (!bool1)
                {
                  localObject1 = g;
                  bool1 = ((String)localObject1).equalsIgnoreCase(str2);
                  if (!bool1) {
                    break label297;
                  }
                }
              }
            }
          }
        }
        i += 1;
      }
    }
    for (str1 = paramArrayOfStackTraceElement[i].getClassName();; str1 = null)
    {
      if (paramString != null)
      {
        localObject1 = ".";
        localObject2 = new java/util/StringTokenizer;
        ((StringTokenizer)localObject2).<init>(paramString, (String)localObject1);
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        int k = 2;
        boolean bool3 = ((StringTokenizer)localObject2).hasMoreElements();
        boolean bool2;
        if (bool3)
        {
          str2 = ((StringTokenizer)localObject2).nextToken();
          localStringBuilder.append(str2);
          for (;;)
          {
            int n = k + -1;
            if (k <= 0) {
              break;
            }
            bool2 = ((StringTokenizer)localObject2).hasMoreElements();
            if (!bool2) {
              break;
            }
            localObject1 = localStringBuilder.append(".");
            String str3 = ((StringTokenizer)localObject2).nextToken();
            ((StringBuilder)localObject1).append(str3);
            bool2 = n;
          }
          label297:
          i += 1;
          break;
          paramString = localStringBuilder.toString();
        }
        if (str1 != null)
        {
          bool2 = str1.contains(paramString);
          if (bool2) {}
        }
      }
      for (;;)
      {
        return str1;
        i = 0;
        str1 = null;
      }
      i = 0;
    }
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean, uk.a parama)
  {
    if (paramBoolean)
    {
      localObject1 = paramContext.getApplicationContext();
      if (localObject1 == null) {
        localObject1 = paramContext;
      }
      localObject2 = Build.VERSION.RELEASE;
      paramBundle.putString("os", (String)localObject2);
      int i = Build.VERSION.SDK_INT;
      localObject2 = String.valueOf(i);
      paramBundle.putString("api", (String)localObject2);
      localObject3 = "appid";
      localObject1 = ((Context)localObject1).getPackageName();
      paramBundle.putString((String)localObject3, (String)localObject1);
      if (paramString1 == null)
      {
        int j = m.b().b(paramContext);
        int k = 23;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>(k);
        localObject1 = ((StringBuilder)localObject2).append(j);
        localObject3 = ".10260000";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        paramString1 = ((StringBuilder)localObject1).toString();
      }
      localObject1 = "js";
      paramBundle.putString((String)localObject1, paramString1);
    }
    Object localObject1 = new android/net/Uri$Builder;
    ((Uri.Builder)localObject1).<init>();
    Object localObject3 = ((Uri.Builder)localObject1).scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", paramString2);
    localObject1 = paramBundle.keySet();
    Object localObject2 = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (String)((Iterator)localObject2).next();
      String str = paramBundle.getString((String)localObject1);
      ((Uri.Builder)localObject3).appendQueryParameter((String)localObject1, str);
    }
    localObject1 = ((Uri.Builder)localObject3).toString();
    parama.a((String)localObject1);
  }
  
  public static void a(ViewGroup paramViewGroup, il paramil, String paramString1, String paramString2)
  {
    int i = 17;
    int j = -65536;
    ul.e(paramString2);
    int k = paramViewGroup.getChildCount();
    if (k == 0)
    {
      Context localContext = paramViewGroup.getContext();
      TextView localTextView = new android/widget/TextView;
      localTextView.<init>(localContext);
      localTextView.setGravity(i);
      localTextView.setText(paramString1);
      localTextView.setTextColor(j);
      int m = -16777216;
      localTextView.setBackgroundColor(m);
      FrameLayout localFrameLayout = new android/widget/FrameLayout;
      localFrameLayout.<init>(localContext);
      localFrameLayout.setBackgroundColor(j);
      j = 3;
      k = a(localContext, j);
      FrameLayout.LayoutParams localLayoutParams = new android/widget/FrameLayout$LayoutParams;
      int n = f - k;
      int i1 = c;
      k = i1 - k;
      localLayoutParams.<init>(n, k, i);
      localFrameLayout.addView(localTextView, localLayoutParams);
      k = f;
      int i2 = c;
      paramViewGroup.addView(localFrameLayout, k, i2);
    }
  }
  
  public static void a(HttpURLConnection paramHttpURLConnection, String paramString)
  {
    int i = 60000;
    paramHttpURLConnection.setConnectTimeout(i);
    boolean bool = true;
    paramHttpURLConnection.setInstanceFollowRedirects(bool);
    paramHttpURLConnection.setReadTimeout(i);
    if (paramString != null)
    {
      String str = "User-Agent";
      paramHttpURLConnection.setRequestProperty(str, paramString);
    }
    paramHttpURLConnection.setUseCaches(false);
  }
  
  public static boolean a()
  {
    return Build.DEVICE.startsWith("generic");
  }
  
  public static int b(Context paramContext, int paramInt)
  {
    Display localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    DisplayMetrics localDisplayMetrics = new android/util/DisplayMetrics;
    localDisplayMetrics.<init>();
    localDisplay.getMetrics(localDisplayMetrics);
    return b(localDisplayMetrics, paramInt);
  }
  
  public static int b(DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    float f1 = paramInt;
    float f2 = density;
    return Math.round(f1 / f2);
  }
  
  public static String b(Context paramContext)
  {
    Object localObject = paramContext.getContentResolver();
    if (localObject == null) {}
    String str;
    for (localObject = null;; localObject = Settings.Secure.getString((ContentResolver)localObject, str))
    {
      return (String)localObject;
      str = "android_id";
    }
  }
  
  public static boolean b()
  {
    Looper localLooper1 = Looper.myLooper();
    Looper localLooper2 = Looper.getMainLooper();
    boolean bool;
    if (localLooper1 == localLooper2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localLooper1 = null;
    }
  }
  
  public static boolean c(Context paramContext)
  {
    m localm = m.b();
    int i = localm.a(paramContext);
    if (i == 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localm = null;
    }
  }
  
  public static boolean d(Context paramContext)
  {
    m localm = m.b();
    int i = localm.a(paramContext);
    if (i != 0)
    {
      int k = 2;
      if (i != k) {}
    }
    else
    {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localm = null;
    }
  }
  
  public static boolean e(Context paramContext)
  {
    boolean bool = false;
    Object localObject = paramContext.getResources().getConfiguration();
    int i = orientation;
    int j = 2;
    float f1 = 2.8E-45F;
    if (i != j) {}
    for (;;)
    {
      return bool;
      localObject = paramContext.getResources().getDisplayMetrics();
      f1 = heightPixels;
      float f2 = density;
      f2 = f1 / f2;
      i = (int)f2;
      j = 600;
      f1 = 8.41E-43F;
      if (i < j) {
        bool = true;
      }
    }
  }
  
  public static boolean f(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    Object localObject1 = (WindowManager)paramContext.getSystemService("window");
    Display localDisplay = ((WindowManager)localObject1).getDefaultDisplay();
    boolean bool = i.a();
    int k;
    int i;
    if (bool)
    {
      localDisplay.getRealMetrics(localDisplayMetrics);
      k = heightPixels;
      i = widthPixels;
      localDisplay.getMetrics(localDisplayMetrics);
      int m = heightPixels;
      int n = widthPixels;
      if ((m != k) || (n != i)) {
        break label215;
      }
      i = 1;
    }
    for (;;)
    {
      return i;
      localObject1 = Display.class;
      Object localObject3 = "getRawHeight";
      Object localObject4 = null;
      try
      {
        localObject4 = new Class[0];
        localObject1 = ((Class)localObject1).getMethod((String)localObject3, (Class[])localObject4);
        k = 0;
        localObject3 = null;
        localObject3 = new Object[0];
        localObject1 = ((Method)localObject1).invoke(localDisplay, (Object[])localObject3);
        localObject1 = (Integer)localObject1;
        k = ((Integer)localObject1).intValue();
        localObject1 = Display.class;
        localObject4 = "getRawWidth";
        Class[] arrayOfClass = null;
        arrayOfClass = new Class[0];
        localObject1 = ((Class)localObject1).getMethod((String)localObject4, arrayOfClass);
        localObject4 = null;
        localObject4 = new Object[0];
        localObject1 = ((Method)localObject1).invoke(localDisplay, (Object[])localObject4);
        localObject1 = (Integer)localObject1;
        j = ((Integer)localObject1).intValue();
      }
      catch (Exception localException)
      {
        j = 0;
        localObject2 = null;
      }
      continue;
      label215:
      int j = 0;
      Object localObject2 = null;
    }
  }
  
  public static int g(Context paramContext)
  {
    Resources localResources = paramContext.getResources();
    Object localObject = "navigation_bar_width";
    String str1 = "dimen";
    String str2 = "android";
    int i = localResources.getIdentifier((String)localObject, str1, str2);
    if (i > 0)
    {
      localObject = paramContext.getResources();
      i = ((Resources)localObject).getDimensionPixelSize(i);
    }
    for (;;)
    {
      return i;
      i = 0;
      localResources = null;
    }
  }
}


/* Location:              com/google/android/gms/b/uk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */