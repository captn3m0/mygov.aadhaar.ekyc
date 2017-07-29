package com.google.android.gms.b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlertDialog.Builder;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.media.AudioManager;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.h;
import com.google.android.gms.common.util.i;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class tt
{
  public static final Handler a;
  public boolean b;
  private final Object c;
  private boolean d;
  private String e;
  private nj f;
  
  static
  {
    tq localtq = new com/google/android/gms/b/tq;
    Looper localLooper = Looper.getMainLooper();
    localtq.<init>(localLooper);
    a = localtq;
  }
  
  public tt()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    c = localObject;
    d = true;
    b = false;
  }
  
  public static Bitmap a(View paramView)
  {
    paramView.setDrawingCacheEnabled(true);
    Bitmap localBitmap = Bitmap.createBitmap(paramView.getDrawingCache());
    paramView.setDrawingCacheEnabled(false);
    return localBitmap;
  }
  
  public static Uri a(String paramString1, String paramString2, String paramString3)
  {
    int i = -1;
    Object localObject = "&adurl";
    int j = paramString1.indexOf((String)localObject);
    if (j == i)
    {
      localObject = "?adurl";
      j = paramString1.indexOf((String)localObject);
    }
    StringBuilder localStringBuilder;
    if (j != i)
    {
      localStringBuilder = new java/lang/StringBuilder;
      int k = j + 1;
      String str = paramString1.substring(0, k);
      localStringBuilder.<init>(str);
      localStringBuilder = localStringBuilder.append(paramString2).append("=").append(paramString3);
      str = "&";
      localStringBuilder = localStringBuilder.append(str);
      j += 1;
      localObject = paramString1.substring(j);
    }
    for (localObject = Uri.parse((String)localObject);; localObject = Uri.parse(paramString1).buildUpon().appendQueryParameter(paramString2, paramString3).build()) {
      return (Uri)localObject;
    }
  }
  
  public static Bundle a(hi paramhi)
  {
    Object localObject1 = null;
    if (paramhi == null) {}
    Object localObject2;
    Object localObject4;
    do
    {
      do
      {
        return (Bundle)localObject1;
        localObject2 = ke.ac;
        localObject4 = w.q();
        localObject2 = (Boolean)((kd)localObject4).a((jz)localObject2);
        i = ((Boolean)localObject2).booleanValue();
        if (i != 0) {
          break;
        }
        localObject2 = ke.ae;
        localObject4 = w.q();
        localObject2 = (Boolean)((kd)localObject4).a((jz)localObject2);
        i = ((Boolean)localObject2).booleanValue();
      } while (i == 0);
      localObject2 = w.i();
      i = ((tj)localObject2).a();
      if (i == 0) {
        break;
      }
      localObject2 = w.i();
      i = ((tj)localObject2).b();
    } while (i != 0);
    int i = a;
    if (i != 0)
    {
      localObject4 = b;
      i = 0;
      localObject2 = null;
    }
    for (;;)
    {
      try
      {
        a = false;
        localObject2 = b;
        localObject2.notifyAll();
        localObject2 = "ContentFetchThread: wakeup";
        tp.b((String)localObject2);
        localObject2 = c;
        localObject5 = ((hg)localObject2).a();
        if (localObject5 != null)
        {
          localObject4 = f;
          localObject2 = g;
          localObject5 = h;
          if (localObject4 != null)
          {
            localObject6 = w.i();
            ((tj)localObject6).a((String)localObject4);
          }
          if (localObject5 == null) {
            break label422;
          }
          w.i().b((String)localObject5);
          localObject6 = localObject5;
          localObject5 = localObject4;
          localObject4 = localObject2;
          Bundle localBundle = new android/os/Bundle;
          i = 1;
          localBundle.<init>(i);
          if (localObject6 != null)
          {
            localObject2 = ke.ae;
            kd localkd = w.q();
            localObject2 = (Boolean)localkd.a((jz)localObject2);
            bool = ((Boolean)localObject2).booleanValue();
            if (bool)
            {
              localObject2 = w.i();
              bool = ((tj)localObject2).b();
              if (!bool)
              {
                localObject2 = "v_fp_vertical";
                localBundle.putString((String)localObject2, (String)localObject6);
              }
            }
          }
          if (localObject5 != null)
          {
            localObject2 = ke.ac;
            localObject6 = w.q();
            localObject2 = (Boolean)((kd)localObject6).a((jz)localObject2);
            bool = ((Boolean)localObject2).booleanValue();
            if (bool)
            {
              localObject2 = w.i();
              bool = ((tj)localObject2).a();
              if (!bool)
              {
                localObject2 = "fingerprint";
                localBundle.putString((String)localObject2, (String)localObject5);
                bool = ((String)localObject5).equals(localObject4);
                if (!bool)
                {
                  localObject2 = "v_fp";
                  localBundle.putString((String)localObject2, (String)localObject4);
                }
              }
            }
          }
          boolean bool = localBundle.isEmpty();
          if (bool) {
            break;
          }
          localObject1 = localBundle;
          break;
        }
      }
      finally {}
      String str = w.i().i();
      localObject4 = w.i().j();
      Object localObject5 = str;
      Object localObject6 = localObject4;
      localObject4 = null;
      continue;
      label422:
      localObject6 = localObject5;
      localObject5 = localObject4;
      localObject4 = str;
    }
  }
  
  public static DisplayMetrics a(WindowManager paramWindowManager)
  {
    DisplayMetrics localDisplayMetrics = new android/util/DisplayMetrics;
    localDisplayMetrics.<init>();
    paramWindowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics;
  }
  
  public static PopupWindow a(View paramView, int paramInt1, int paramInt2)
  {
    PopupWindow localPopupWindow = new android/widget/PopupWindow;
    localPopupWindow.<init>(paramView, paramInt1, paramInt2, false);
    return localPopupWindow;
  }
  
  public static String a()
  {
    return UUID.randomUUID().toString();
  }
  
  public static String a(Context paramContext, View paramView, il paramil)
  {
    Object localObject1 = ke.at;
    Object localObject3 = w.q();
    localObject1 = (Boolean)((kd)localObject3).a((jz)localObject1);
    boolean bool1 = ((Boolean)localObject1).booleanValue();
    if (!bool1)
    {
      bool1 = false;
      localObject1 = null;
    }
    for (;;)
    {
      return (String)localObject1;
      try
      {
        JSONObject localJSONObject1 = new org/json/JSONObject;
        localJSONObject1.<init>();
        localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>();
        localObject3 = "width";
        int k = e;
        ((JSONObject)localObject1).put((String)localObject3, k);
        localObject3 = "height";
        k = b;
        ((JSONObject)localObject1).put((String)localObject3, k);
        localObject3 = "size";
        localJSONObject1.put((String)localObject3, localObject1);
        localObject1 = "activity";
        localObject3 = k(paramContext);
        localJSONObject1.put((String)localObject1, localObject3);
        bool1 = d;
        if (!bool1)
        {
          JSONArray localJSONArray = new org/json/JSONArray;
          localJSONArray.<init>();
          while (paramView != null)
          {
            localObject3 = paramView.getParent();
            if (localObject3 != null)
            {
              int i = -1;
              boolean bool3 = localObject3 instanceof ViewGroup;
              if (bool3)
              {
                Object localObject4 = localObject3;
                localObject4 = (ViewGroup)localObject3;
                localObject1 = localObject4;
                i = ((ViewGroup)localObject4).indexOfChild(paramView);
              }
              JSONObject localJSONObject2 = new org/json/JSONObject;
              localJSONObject2.<init>();
              String str = "type";
              Object localObject5 = localObject3.getClass();
              localObject5 = ((Class)localObject5).getName();
              localJSONObject2.put(str, localObject5);
              str = "index_of_child";
              localJSONObject2.put(str, i);
              localJSONArray.put(localJSONObject2);
            }
            if (localObject3 != null)
            {
              boolean bool2 = localObject3 instanceof View;
              if (bool2)
              {
                localObject3 = (View)localObject3;
                paramView = (View)localObject3;
                continue;
              }
            }
            paramView = null;
          }
          j = localJSONArray.length();
          if (j > 0)
          {
            localObject1 = "parents";
            localJSONObject1.put((String)localObject1, localJSONArray);
          }
        }
        localObject1 = localJSONObject1.toString();
      }
      catch (JSONException localJSONException)
      {
        localObject3 = "Fail to get view hierarchy json";
        tp.c((String)localObject3, localJSONException);
        int j = 0;
        Object localObject2 = null;
      }
    }
  }
  
  private static String a(Context paramContext, dw paramdw, String paramString, View paramView)
  {
    int i = 0;
    if (paramdw == null) {}
    for (;;)
    {
      return paramString;
      try
      {
        Uri localUri = Uri.parse(paramString);
        int j = paramdw.b(localUri);
        String[] arrayOfString;
        int m;
        if (j != 0)
        {
          arrayOfString = dw.d;
          m = arrayOfString.length;
          j = 0;
        }
        for (;;)
        {
          if (j < m)
          {
            String str1 = arrayOfString[j];
            String str2 = localUri.getPath();
            boolean bool = str2.endsWith(str1);
            if (bool) {
              i = 1;
            }
          }
          else
          {
            if (i != 0) {
              localUri = paramdw.a(localUri, paramContext, paramView);
            }
            paramString = localUri.toString();
            break;
          }
          int k;
          j += 1;
        }
      }
      catch (Exception localException) {}
    }
  }
  
  public static String a(vc paramvc, String paramString)
  {
    Context localContext = paramvc.getContext();
    dw localdw = paramvc.n();
    View localView = paramvc.b();
    return a(localContext, localdw, paramString, localView);
  }
  
  public static String a(InputStreamReader paramInputStreamReader)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(8192);
    int i = 2048;
    char[] arrayOfChar = new char[i];
    for (;;)
    {
      int j = paramInputStreamReader.read(arrayOfChar);
      int k = -1;
      if (j == k) {
        break;
      }
      k = 0;
      localStringBuilder.append(arrayOfChar, 0, j);
    }
    return localStringBuilder.toString();
  }
  
  public static String a(String paramString)
  {
    return Uri.parse(paramString).buildUpon().query(null).build().toString();
  }
  
  public static String a(String paramString, Map paramMap)
  {
    int i = 1;
    Object localObject1 = paramMap.keySet();
    Object localObject2 = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (String)((Iterator)localObject2).next();
      Object localObject3 = new Object[i];
      localObject3[0] = localObject1;
      localObject4 = String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", (Object[])localObject3);
      localObject3 = "$1%s$2";
      Object[] arrayOfObject = new Object[i];
      localObject1 = Uri.encode((String)paramMap.get(localObject1));
      arrayOfObject[0] = localObject1;
      localObject1 = String.format((String)localObject3, arrayOfObject);
      paramString = paramString.replaceAll((String)localObject4, (String)localObject1);
    }
    localObject2 = new Object[i];
    localObject2[0] = "[^@]+";
    localObject1 = String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", (Object[])localObject2);
    Object localObject4 = new Object[i];
    localObject4[0] = "";
    localObject2 = String.format("$1%s$2", (Object[])localObject4);
    return paramString.replaceAll((String)localObject1, (String)localObject2).replaceAll("@@", "@");
  }
  
  public static Map a(Uri paramUri)
  {
    boolean bool;
    if (paramUri == null) {
      bool = false;
    }
    HashMap localHashMap;
    for (Object localObject = null;; localObject = localHashMap)
    {
      return (Map)localObject;
      localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      localObject = w.g().a(paramUri);
      Iterator localIterator = ((Set)localObject).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (String)localIterator.next();
        String str = paramUri.getQueryParameter((String)localObject);
        localHashMap.put(localObject, str);
      }
    }
  }
  
  private JSONArray a(Collection paramCollection)
  {
    JSONArray localJSONArray = new org/json/JSONArray;
    localJSONArray.<init>();
    Iterator localIterator = paramCollection.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = localIterator.next();
      a(localJSONArray, localObject);
    }
    return localJSONArray;
  }
  
  private JSONObject a(Bundle paramBundle)
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    Object localObject1 = paramBundle.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (String)localIterator.next();
      Object localObject2 = paramBundle.get((String)localObject1);
      a(localJSONObject, (String)localObject1, localObject2);
    }
    return localJSONObject;
  }
  
  public static void a(Activity paramActivity, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
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
          ((ViewTreeObserver)localObject1).addOnGlobalLayoutListener(paramOnGlobalLayoutListener);
        }
      }
    }
  }
  
  public static void a(Activity paramActivity, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
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
          ((ViewTreeObserver)localObject1).addOnScrollChangedListener(paramOnScrollChangedListener);
        }
      }
    }
  }
  
  /* Error */
  public static void a(Context paramContext, Intent paramIntent)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 478	android/content/Context:startActivity	(Landroid/content/Intent;)V
    //   5: return
    //   6: pop
    //   7: ldc_w 479
    //   10: istore_2
    //   11: aload_1
    //   12: iload_2
    //   13: invokevirtual 486	android/content/Intent:addFlags	(I)Landroid/content/Intent;
    //   16: pop
    //   17: aload_0
    //   18: aload_1
    //   19: invokevirtual 478	android/content/Context:startActivity	(Landroid/content/Intent;)V
    //   22: goto -17 -> 5
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	25	0	paramContext	Context
    //   0	25	1	paramIntent	Intent
    //   10	3	2	i	int
    // Exception table:
    //   from	to	target	type
    //   1	5	6	finally
  }
  
  public static void a(Context paramContext, Uri paramUri)
  {
    try
    {
      localObject1 = new android/os/Bundle;
      ((Bundle)localObject1).<init>();
      Object localObject2 = ke.dd;
      Object localObject3 = w.q();
      localObject2 = ((kd)localObject3).a((jz)localObject2);
      localObject2 = (Boolean)localObject2;
      boolean bool = ((Boolean)localObject2).booleanValue();
      if (bool)
      {
        bool = i.b();
        if (bool)
        {
          localObject2 = "android.support.customtabs.extra.SESSION";
          localObject3 = null;
          ((Bundle)localObject1).putBinder((String)localObject2, null);
        }
      }
      localObject2 = "com.android.browser.application_id";
      localObject3 = paramContext.getPackageName();
      ((Bundle)localObject1).putString((String)localObject2, (String)localObject3);
      localObject2 = new android/content/Intent;
      localObject3 = "android.intent.action.VIEW";
      ((Intent)localObject2).<init>((String)localObject3, paramUri);
      localObject2 = ((Intent)localObject2).putExtras((Bundle)localObject1);
      paramContext.startActivity((Intent)localObject2);
      localObject2 = paramUri.toString();
      localObject2 = String.valueOf(localObject2);
      localObject1 = String.valueOf(localObject2);
      int i = ((String)localObject1).length() + 26;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>(i);
      localObject1 = "Opening ";
      localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
      localObject2 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = " in a new browser.";
      localObject2 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = ((StringBuilder)localObject2).toString();
      tp.b((String)localObject2);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      for (;;)
      {
        Object localObject1 = "No browser is found.";
        tp.b((String)localObject1, localActivityNotFoundException);
      }
    }
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      w.e();
      str = c();
      paramBundle.putString("device", str);
      localObject1 = "eids";
      localObject2 = ke.a();
      str = TextUtils.join(",", (Iterable)localObject2);
      paramBundle.putString((String)localObject1, str);
    }
    ip.a();
    tt.3 local3 = new com/google/android/gms/b/tt$3;
    local3.<init>(paramContext, paramString1);
    Object localObject1 = paramContext;
    String str = paramString1;
    Object localObject2 = paramString2;
    uk.a(paramContext, paramString1, paramString2, paramBundle, paramBoolean, local3);
  }
  
  public static void a(Context paramContext, String paramString, List paramList)
  {
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      String str = (String)localIterator.next();
      ud localud = new com/google/android/gms/b/ud;
      localud.<init>(paramContext, paramString, str);
      localud.c();
    }
  }
  
  public static void a(Context paramContext, List paramList)
  {
    boolean bool = paramContext instanceof Activity;
    if (!bool) {}
    for (;;)
    {
      return;
      Object localObject = paramContext;
      localObject = gi.a((Activity)paramContext);
      bool = TextUtils.isEmpty((CharSequence)localObject);
      if (!bool) {
        if (paramList == null)
        {
          localObject = "Cannot ping urls: empty list.";
          tp.a((String)localObject);
        }
        else
        {
          bool = ks.a((Context)paramContext);
          if (!bool)
          {
            localObject = "Cannot ping url because custom tabs is not supported";
            tp.a((String)localObject);
          }
          else
          {
            localObject = new com/google/android/gms/b/ks;
            ((ks)localObject).<init>();
            tt.1 local1 = new com/google/android/gms/b/tt$1;
            local1.<init>(paramList, (ks)localObject, (Context)paramContext);
            c = local1;
            paramContext = (Activity)paramContext;
            ((ks)localObject).b(paramContext);
          }
        }
      }
    }
  }
  
  public static void a(Runnable paramRunnable)
  {
    Object localObject = Looper.getMainLooper().getThread();
    Thread localThread = Thread.currentThread();
    if (localObject == localThread) {
      paramRunnable.run();
    }
    for (;;)
    {
      return;
      localObject = a;
      ((Handler)localObject).post(paramRunnable);
    }
  }
  
  public static void a(List paramList, String paramString)
  {
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      String str = (String)localIterator.next();
      ud localud = new com/google/android/gms/b/ud;
      localud.<init>(str, paramString);
      localud.c();
    }
  }
  
  private void a(JSONArray paramJSONArray, Object paramObject)
  {
    int i = paramObject instanceof Bundle;
    Object localObject1;
    if (i != 0)
    {
      paramObject = (Bundle)paramObject;
      localObject1 = a((Bundle)paramObject);
      paramJSONArray.put(localObject1);
    }
    for (;;)
    {
      return;
      i = paramObject instanceof Map;
      if (i != 0)
      {
        paramObject = (Map)paramObject;
        localObject1 = a((Map)paramObject);
        paramJSONArray.put(localObject1);
      }
      else
      {
        i = paramObject instanceof Collection;
        if (i != 0)
        {
          paramObject = (Collection)paramObject;
          localObject1 = a((Collection)paramObject);
          paramJSONArray.put(localObject1);
        }
        else
        {
          i = paramObject instanceof Object[];
          if (i != 0)
          {
            paramObject = (Object[])paramObject;
            JSONArray localJSONArray = new org/json/JSONArray;
            localJSONArray.<init>();
            int k = paramObject.length;
            i = 0;
            localObject1 = null;
            while (i < k)
            {
              Object localObject2 = paramObject[i];
              a(localJSONArray, localObject2);
              int j;
              i += 1;
            }
            paramJSONArray.put(localJSONArray);
          }
          else
          {
            paramJSONArray.put(paramObject);
          }
        }
      }
    }
  }
  
  private void a(JSONObject paramJSONObject, String paramString, Object paramObject)
  {
    boolean bool = paramObject instanceof Bundle;
    Object localObject;
    if (bool)
    {
      paramObject = (Bundle)paramObject;
      localObject = a((Bundle)paramObject);
      paramJSONObject.put(paramString, localObject);
    }
    for (;;)
    {
      return;
      bool = paramObject instanceof Map;
      if (bool)
      {
        paramObject = (Map)paramObject;
        localObject = a((Map)paramObject);
        paramJSONObject.put(paramString, localObject);
      }
      else
      {
        bool = paramObject instanceof Collection;
        if (bool)
        {
          if (paramString != null) {}
          for (;;)
          {
            paramObject = (Collection)paramObject;
            localObject = a((Collection)paramObject);
            paramJSONObject.put(paramString, localObject);
            break;
            paramString = "null";
          }
        }
        bool = paramObject instanceof Object[];
        if (bool)
        {
          paramObject = (Object[])paramObject;
          localObject = Arrays.asList((Object[])paramObject);
          localObject = a((Collection)localObject);
          paramJSONObject.put(paramString, localObject);
        }
        else
        {
          paramJSONObject.put(paramString, paramObject);
        }
      }
    }
  }
  
  private static boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = Math.abs(paramInt1 - paramInt2);
    if (i <= paramInt3) {}
    for (i = 1;; i = 0) {
      return i;
    }
  }
  
  public static boolean a(Activity paramActivity, Configuration paramConfiguration)
  {
    boolean bool1 = false;
    ip.a();
    int i = screenHeightDp;
    int j = uk.a(paramActivity, i);
    i = screenWidthDp;
    int k = uk.a(paramActivity, i);
    Object localObject1 = a((WindowManager)paramActivity.getApplicationContext().getSystemService("window"));
    int m = heightPixels;
    int n = widthPixels;
    localObject1 = paramActivity.getResources();
    Object localObject2 = "status_bar_height";
    String str = "dimen";
    Object localObject3 = "android";
    i = ((Resources)localObject1).getIdentifier((String)localObject2, str, (String)localObject3);
    int i1;
    if (i > 0)
    {
      localObject2 = paramActivity.getResources();
      i = ((Resources)localObject2).getDimensionPixelSize(i);
      i1 = i;
    }
    for (;;)
    {
      float f1 = getResourcesgetDisplayMetricsdensity;
      double d1 = f1;
      double d2 = 0.5D;
      d1 += d2;
      long l = Math.round(d1);
      int i2 = (int)l;
      localObject1 = ke.dm;
      localObject3 = w.q();
      localObject1 = (Integer)((kd)localObject3).a((jz)localObject1);
      i = ((Integer)localObject1).intValue() * i2;
      i1 += j;
      boolean bool3 = a(m, i1, i);
      if (bool3)
      {
        boolean bool2 = a(n, k, i);
        if (bool2) {
          bool1 = true;
        }
      }
      return bool1;
      bool3 = false;
      localObject2 = null;
    }
  }
  
  public static boolean a(Context paramContext)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool = false;
    Object localObject1 = new android/content/Intent;
    ((Intent)localObject1).<init>();
    ((Intent)localObject1).setClassName(paramContext, "com.google.android.gms.ads.AdActivity");
    Object localObject2 = paramContext.getPackageManager();
    int j = 65536;
    localObject2 = ((PackageManager)localObject2).resolveActivity((Intent)localObject1, j);
    if (localObject2 != null)
    {
      localObject1 = activityInfo;
      if (localObject1 != null) {}
    }
    else
    {
      localObject1 = "Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.";
      tp.e((String)localObject1);
      return bool;
    }
    String str1 = "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".";
    localObject1 = activityInfo;
    int k = configChanges & 0x10;
    Object localObject3;
    if (k == 0)
    {
      localObject1 = new Object[i];
      localObject3 = "keyboard";
      localObject1[0] = localObject3;
      tp.e(String.format(str1, (Object[])localObject1));
      k = 0;
      localObject1 = null;
    }
    for (;;)
    {
      localObject3 = activityInfo;
      int m = configChanges & 0x20;
      if (m == 0)
      {
        localObject1 = new Object[i];
        localObject3 = "keyboardHidden";
        localObject1[0] = localObject3;
        tp.e(String.format(str1, (Object[])localObject1));
        k = 0;
        localObject1 = null;
      }
      localObject3 = activityInfo;
      m = configChanges & 0x80;
      if (m == 0)
      {
        localObject1 = new Object[i];
        localObject3 = "orientation";
        localObject1[0] = localObject3;
        tp.e(String.format(str1, (Object[])localObject1));
        k = 0;
        localObject1 = null;
      }
      localObject3 = activityInfo;
      m = configChanges & 0x100;
      if (m == 0)
      {
        localObject1 = new Object[i];
        localObject3 = "screenLayout";
        localObject1[0] = localObject3;
        tp.e(String.format(str1, (Object[])localObject1));
        k = 0;
        localObject1 = null;
      }
      localObject3 = activityInfo;
      m = configChanges & 0x200;
      if (m == 0)
      {
        localObject1 = new Object[i];
        localObject3 = "uiMode";
        localObject1[0] = localObject3;
        tp.e(String.format(str1, (Object[])localObject1));
        k = 0;
        localObject1 = null;
      }
      localObject3 = activityInfo;
      m = configChanges & 0x400;
      if (m == 0)
      {
        localObject1 = new Object[i];
        localObject3 = "screenSize";
        localObject1[0] = localObject3;
        tp.e(String.format(str1, (Object[])localObject1));
        k = 0;
        localObject1 = null;
      }
      localObject2 = activityInfo;
      int n = configChanges & 0x800;
      if (n == 0)
      {
        localObject1 = new Object[i];
        String str2 = "smallestScreenSize";
        localObject1[0] = str2;
        localObject1 = String.format(str1, (Object[])localObject1);
        tp.e((String)localObject1);
        break;
      }
      bool = k;
      break;
      k = i;
    }
  }
  
  public static boolean a(Context paramContext, String paramString1, String paramString2)
  {
    bb localbb = bc.a(paramContext);
    int i = localbb.a(paramString2, paramString1);
    if (i == 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localbb = null;
    }
  }
  
  public static boolean a(View paramView, Context paramContext)
  {
    Object localObject1 = null;
    Object localObject2 = paramContext.getApplicationContext();
    if (localObject2 != null) {
      localObject2 = (PowerManager)((Context)localObject2).getSystemService("power");
    }
    for (Object localObject3 = localObject2;; localObject3 = null)
    {
      localObject2 = paramContext.getSystemService("keyguard");
      if (localObject2 != null)
      {
        boolean bool = localObject2 instanceof KeyguardManager;
        if (bool)
        {
          localObject2 = (KeyguardManager)localObject2;
          localObject1 = localObject2;
        }
      }
      return a(paramView, (PowerManager)localObject3, (KeyguardManager)localObject1);
    }
  }
  
  public static boolean a(View paramView, PowerManager paramPowerManager, KeyguardManager paramKeyguardManager)
  {
    boolean bool1 = true;
    Object localObject = w.e();
    boolean bool2 = d;
    label37:
    boolean bool3;
    label77:
    kd localkd;
    if (!bool2)
    {
      if (paramKeyguardManager == null)
      {
        bool2 = false;
        localObject = null;
        if (bool2) {
          break label178;
        }
      }
    }
    else
    {
      bool2 = bool1;
      int i = paramView.getVisibility();
      if (i != 0) {
        break label196;
      }
      bool3 = paramView.isShown();
      if (!bool3) {
        break label196;
      }
      if (paramPowerManager != null)
      {
        bool3 = paramPowerManager.isScreenOn();
        if (!bool3) {
          break label187;
        }
      }
      bool3 = bool1;
      if ((!bool3) || (!bool2)) {
        break label196;
      }
      localObject = ke.bm;
      localkd = w.q();
      localObject = (Boolean)localkd.a((jz)localObject);
      bool2 = ((Boolean)localObject).booleanValue();
      if (bool2)
      {
        localObject = new android/graphics/Rect;
        ((Rect)localObject).<init>();
        bool2 = paramView.getLocalVisibleRect((Rect)localObject);
        if (!bool2)
        {
          localObject = new android/graphics/Rect;
          ((Rect)localObject).<init>();
          bool2 = paramView.getGlobalVisibleRect((Rect)localObject);
          if (!bool2) {
            break label196;
          }
        }
      }
    }
    for (;;)
    {
      return bool1;
      bool2 = paramKeyguardManager.inKeyguardRestrictedInputMode();
      break;
      label178:
      bool2 = false;
      localObject = null;
      break label37;
      label187:
      bool3 = false;
      localkd = null;
      break label77;
      label196:
      bool1 = false;
    }
  }
  
  public static boolean a(ClassLoader paramClassLoader, Class paramClass, String paramString)
  {
    boolean bool = false;
    Class localClass = null;
    try
    {
      localClass = Class.forName(paramString, false, paramClassLoader);
      bool = paramClass.isAssignableFrom(localClass);
    }
    finally
    {
      for (;;) {}
    }
    return bool;
  }
  
  public static int[] a(Activity paramActivity)
  {
    Object localObject = paramActivity.getWindow();
    if (localObject != null)
    {
      int i = 16908290;
      View localView = ((Window)localObject).findViewById(i);
      if (localView != null)
      {
        int j = 2;
        localObject = new int[j];
        int k = localView.getWidth();
        localObject[0] = k;
        int m = 1;
        i = localView.getHeight();
        localObject[m] = i;
      }
    }
    for (;;)
    {
      return (int[])localObject;
      localObject = h();
    }
  }
  
  public static int b(View paramView)
  {
    int i = -1;
    int j;
    if (paramView == null) {
      j = i;
    }
    for (;;)
    {
      return j;
      for (Object localObject = paramView.getParent(); localObject != null; localObject = ((ViewParent)localObject).getParent())
      {
        boolean bool = localObject instanceof AdapterView;
        if (bool) {
          break;
        }
      }
      if (localObject == null)
      {
        j = i;
      }
      else
      {
        localObject = (AdapterView)localObject;
        j = ((AdapterView)localObject).getPositionForView(paramView);
      }
    }
  }
  
  public static int b(String paramString)
  {
    try
    {
      i = Integer.parseInt(paramString);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        String str = String.valueOf(localNumberFormatException);
        int j = String.valueOf(str).length() + 22;
        StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
        localStringBuilder1.<init>(j);
        StringBuilder localStringBuilder2 = localStringBuilder1.append("Could not parse value:");
        tp.e(str);
        int i = 0;
        str = null;
      }
    }
    return i;
  }
  
  public static String b()
  {
    int i = 1;
    Object localObject1 = UUID.randomUUID();
    long l1 = ((UUID)localObject1).getLeastSignificantBits();
    byte[] arrayOfByte1 = BigInteger.valueOf(l1).toByteArray();
    long l2 = ((UUID)localObject1).getMostSignificantBits();
    byte[] arrayOfByte2 = BigInteger.valueOf(l2).toByteArray();
    localObject1 = new java/math/BigInteger;
    ((BigInteger)localObject1).<init>(i, arrayOfByte1);
    String str = ((BigInteger)localObject1).toString();
    int j = 0;
    localObject1 = null;
    for (;;)
    {
      int k = 2;
      if (j >= k) {
        break;
      }
      Object localObject2 = "MD5";
      try
      {
        localObject2 = MessageDigest.getInstance((String)localObject2);
        ((MessageDigest)localObject2).update(arrayOfByte1);
        ((MessageDigest)localObject2).update(arrayOfByte2);
        int m = 8;
        byte[] arrayOfByte3 = new byte[m];
        localObject2 = ((MessageDigest)localObject2).digest();
        i = 0;
        int n = 8;
        System.arraycopy(localObject2, 0, arrayOfByte3, 0, n);
        localObject2 = new java/math/BigInteger;
        i = 1;
        ((BigInteger)localObject2).<init>(i, arrayOfByte3);
        str = ((BigInteger)localObject2).toString();
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        for (;;) {}
      }
      j += 1;
    }
    return str;
  }
  
  protected static String b(Context paramContext)
  {
    try
    {
      localObject = new android/webkit/WebView;
      ((WebView)localObject).<init>(paramContext);
      localObject = ((WebView)localObject).getSettings();
      localObject = ((WebSettings)localObject).getUserAgentString();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject;
        String str = g();
      }
    }
    return (String)localObject;
  }
  
  public static String b(Context paramContext, String paramString)
  {
    try
    {
      localObject1 = paramContext.openFileInput(paramString);
      str1 = new java/lang/String;
      Object localObject2 = new java/io/ByteArrayOutputStream;
      ((ByteArrayOutputStream)localObject2).<init>();
      h.a((InputStream)localObject1, (OutputStream)localObject2);
      localObject1 = ((ByteArrayOutputStream)localObject2).toByteArray();
      localObject2 = "UTF-8";
      str1.<init>((byte[])localObject1, (String)localObject2);
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        String str1;
        Object localObject1 = "Error reading from internal storage.";
        tp.b((String)localObject1, localIOException);
        String str2 = "";
      }
    }
    return str1;
  }
  
  public static void b(Activity paramActivity, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
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
          ((ViewTreeObserver)localObject1).removeOnScrollChangedListener(paramOnScrollChangedListener);
        }
      }
    }
  }
  
  public static void b(Context paramContext, String paramString1, String paramString2)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localArrayList.add(paramString2);
    a(paramContext, paramString1, localArrayList);
  }
  
  public static void b(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = ke.br;
    kd localkd = w.q();
    localObject = (Boolean)localkd.a((jz)localObject);
    boolean bool = ((Boolean)localObject).booleanValue();
    if (bool) {
      a(paramContext, paramString1, paramString2, paramBundle, paramBoolean);
    }
  }
  
  public static void b(Runnable paramRunnable)
  {
    Thread localThread1 = Looper.getMainLooper().getThread();
    Thread localThread2 = Thread.currentThread();
    if (localThread1 != localThread2) {
      paramRunnable.run();
    }
    for (;;)
    {
      return;
      ts.a(paramRunnable);
    }
  }
  
  public static int[] b(Activity paramActivity)
  {
    int i = 1;
    int[] arrayOfInt1 = a(paramActivity);
    int[] arrayOfInt2 = new int[2];
    ip.a();
    int j = arrayOfInt1[0];
    j = uk.b(paramActivity, j);
    arrayOfInt2[0] = j;
    ip.a();
    int k = arrayOfInt1[i];
    k = uk.b(paramActivity, k);
    arrayOfInt2[i] = k;
    return arrayOfInt2;
  }
  
  public static AlertDialog.Builder c(Context paramContext)
  {
    AlertDialog.Builder localBuilder = new android/app/AlertDialog$Builder;
    localBuilder.<init>(paramContext);
    return localBuilder;
  }
  
  private static Bitmap c(View paramView)
  {
    for (;;)
    {
      try
      {
        i = paramView.getWidth();
        j = paramView.getHeight();
        if ((i != 0) && (j != 0)) {
          continue;
        }
        localObject1 = "Width or height of view is zero";
        tp.e((String)localObject1);
        k = 0;
        localObject1 = null;
      }
      catch (RuntimeException localRuntimeException)
      {
        int i;
        int j;
        Object localObject1;
        int m;
        Bitmap.Config localConfig;
        Canvas localCanvas;
        String str = "Fail to capture the webview";
        tp.b(str, localRuntimeException);
        int k = 0;
        Object localObject2 = null;
        continue;
      }
      return (Bitmap)localObject1;
      k = paramView.getWidth();
      m = paramView.getHeight();
      localConfig = Bitmap.Config.RGB_565;
      localObject1 = Bitmap.createBitmap(k, m, localConfig);
      localCanvas = new android/graphics/Canvas;
      localCanvas.<init>((Bitmap)localObject1);
      localConfig = null;
      paramView.layout(0, 0, i, j);
      paramView.draw(localCanvas);
    }
  }
  
  public static String c()
  {
    Object localObject = Build.MANUFACTURER;
    String str1 = Build.MODEL;
    boolean bool = str1.startsWith((String)localObject);
    if (bool) {}
    for (;;)
    {
      return str1;
      int i = String.valueOf(localObject).length() + 1;
      int j = String.valueOf(str1).length();
      i += j;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(i);
      localObject = localStringBuilder.append((String)localObject);
      String str2 = " ";
      localObject = ((StringBuilder)localObject).append(str2);
      str1 = str1;
    }
  }
  
  public static void c(Context paramContext, String paramString1, String paramString2)
  {
    FileOutputStream localFileOutputStream = null;
    try
    {
      localFileOutputStream = paramContext.openFileOutput(paramString1, 0);
      localObject = "UTF-8";
      localObject = paramString2.getBytes((String)localObject);
      localFileOutputStream.write((byte[])localObject);
      localFileOutputStream.close();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject = "Error writing to file in internal storage.";
        tp.b((String)localObject, localException);
      }
    }
  }
  
  public static boolean c(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    String str;
    if (bool)
    {
      bool = false;
      str = null;
    }
    for (;;)
    {
      return bool;
      str = "([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)";
      bool = paramString.matches(str);
    }
  }
  
  public static int[] c(Activity paramActivity)
  {
    int i = 2;
    int j = 1;
    Object localObject1 = paramActivity.getWindow();
    Object localObject2;
    int m;
    if (localObject1 != null)
    {
      int k = 16908290;
      localObject2 = ((Window)localObject1).findViewById(k);
      if (localObject2 != null)
      {
        localObject1 = new int[i];
        m = ((View)localObject2).getTop();
        localObject1[0] = m;
        k = ((View)localObject2).getBottom();
        localObject1[j] = k;
      }
    }
    for (;;)
    {
      localObject2 = new int[i];
      ip.a();
      m = localObject1[0];
      m = uk.b(paramActivity, m);
      localObject2[0] = m;
      ip.a();
      int n = localObject1[j];
      n = uk.b(paramActivity, n);
      localObject2[j] = n;
      return (int[])localObject2;
      localObject1 = h();
    }
  }
  
  public static float d()
  {
    w.y();
    q localq = q.a();
    if (localq != null)
    {
      boolean bool = localq.d();
      if (!bool) {}
    }
    for (float f1 = localq.c();; f1 = 1.0F) {
      return f1;
    }
  }
  
  /* Error */
  private static Bitmap d(View paramView)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: invokevirtual 1064	android/view/View:isDrawingCacheEnabled	()Z
    //   6: istore_2
    //   7: iconst_1
    //   8: istore_3
    //   9: aload_0
    //   10: iload_3
    //   11: invokevirtual 45	android/view/View:setDrawingCacheEnabled	(Z)V
    //   14: aload_0
    //   15: invokevirtual 49	android/view/View:getDrawingCache	()Landroid/graphics/Bitmap;
    //   18: astore 4
    //   20: aload 4
    //   22: ifnull +46 -> 68
    //   25: aload 4
    //   27: invokestatic 55	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   30: astore 4
    //   32: aload_0
    //   33: iload_2
    //   34: invokevirtual 45	android/view/View:setDrawingCacheEnabled	(Z)V
    //   37: aload 4
    //   39: areturn
    //   40: astore 5
    //   42: iconst_0
    //   43: istore_3
    //   44: aconst_null
    //   45: astore 4
    //   47: aload 5
    //   49: astore_1
    //   50: ldc_w 1066
    //   53: astore 6
    //   55: aload 6
    //   57: aload_1
    //   58: invokestatic 526	com/google/android/gms/b/tp:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   61: goto -24 -> 37
    //   64: astore_1
    //   65: goto -15 -> 50
    //   68: iconst_0
    //   69: istore_3
    //   70: aconst_null
    //   71: astore 4
    //   73: goto -41 -> 32
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	paramView	View
    //   1	57	1	localObject	Object
    //   64	1	1	localRuntimeException1	RuntimeException
    //   6	28	2	bool1	boolean
    //   8	62	3	bool2	boolean
    //   18	54	4	localBitmap	Bitmap
    //   40	8	5	localRuntimeException2	RuntimeException
    //   53	3	6	str	String
    // Exception table:
    //   from	to	target	type
    //   2	6	40	java/lang/RuntimeException
    //   10	14	40	java/lang/RuntimeException
    //   14	18	40	java/lang/RuntimeException
    //   25	30	40	java/lang/RuntimeException
    //   33	37	64	java/lang/RuntimeException
  }
  
  public static jv d(Context paramContext)
  {
    jv localjv = new com/google/android/gms/b/jv;
    localjv.<init>(paramContext);
    return localjv;
  }
  
  public static boolean e()
  {
    w.y();
    q localq = q.a();
    boolean bool;
    if (localq != null) {
      bool = localq.e();
    }
    for (;;)
    {
      return bool;
      bool = false;
      localq = null;
    }
  }
  
  public static boolean e(Context paramContext)
  {
    Object localObject1 = "activity";
    for (;;)
    {
      try
      {
        localObject1 = paramContext.getSystemService((String)localObject1);
        localObject1 = (ActivityManager)localObject1;
        localObject4 = "keyguard";
        localObject4 = paramContext.getSystemService((String)localObject4);
        localObject4 = (KeyguardManager)localObject4;
        if ((localObject1 != null) && (localObject4 != null)) {
          continue;
        }
        bool1 = false;
        localObject1 = null;
      }
      finally
      {
        Object localObject4;
        boolean bool1;
        Iterator localIterator;
        int j;
        int k;
        int i;
        int m;
        boolean bool2 = false;
        Object localObject3 = null;
        continue;
      }
      return bool1;
      localObject1 = ((ActivityManager)localObject1).getRunningAppProcesses();
      if (localObject1 == null)
      {
        bool1 = false;
        localObject1 = null;
      }
      else
      {
        localIterator = ((List)localObject1).iterator();
        bool1 = localIterator.hasNext();
        if (bool1)
        {
          localObject1 = localIterator.next();
          localObject1 = (ActivityManager.RunningAppProcessInfo)localObject1;
          j = Process.myPid();
          k = pid;
          if (j != k) {
            continue;
          }
          i = importance;
          m = 100;
          if (i == m)
          {
            bool2 = ((KeyguardManager)localObject4).inKeyguardRestrictedInputMode();
            if (!bool2)
            {
              localObject1 = "power";
              localObject1 = paramContext.getSystemService((String)localObject1);
              localObject1 = (PowerManager)localObject1;
              if (localObject1 == null)
              {
                bool2 = false;
                localObject1 = null;
                if (bool2) {
                  bool2 = true;
                }
              }
              else
              {
                bool2 = ((PowerManager)localObject1).isScreenOn();
                continue;
              }
            }
          }
        }
        bool2 = false;
        localObject1 = null;
      }
    }
  }
  
  public static Bitmap f(Context paramContext)
  {
    Object localObject1 = null;
    bool = paramContext instanceof Activity;
    if (!bool) {
      return (Bitmap)localObject1;
    }
    for (;;)
    {
      try
      {
        localObject2 = ke.bV;
        localObject4 = w.q();
        localObject2 = ((kd)localObject4).a((jz)localObject2);
        localObject2 = (Boolean)localObject2;
        bool = ((Boolean)localObject2).booleanValue();
        if (!bool) {
          continue;
        }
        paramContext = (Activity)paramContext;
        localObject2 = paramContext.getWindow();
        if (localObject2 == null) {
          continue;
        }
        localObject2 = ((Window)localObject2).getDecorView();
        localObject2 = ((View)localObject2).getRootView();
        localObject2 = d((View)localObject2);
      }
      catch (RuntimeException localRuntimeException)
      {
        Object localObject2;
        Object localObject4 = "Fail to capture screen shot";
        tp.b((String)localObject4, localRuntimeException);
        bool = false;
        Object localObject3 = null;
        continue;
      }
      localObject1 = localObject2;
      break;
      paramContext = (Activity)paramContext;
      localObject2 = paramContext.getWindow();
      localObject2 = ((Window)localObject2).getDecorView();
      localObject2 = c((View)localObject2);
    }
  }
  
  public static Bundle f()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    try
    {
      Object localObject1 = ke.F;
      localObject2 = w.q();
      localObject1 = ((kd)localObject2).a((jz)localObject1);
      localObject1 = (Boolean)localObject1;
      boolean bool = ((Boolean)localObject1).booleanValue();
      if (bool)
      {
        localObject1 = new android/os/Debug$MemoryInfo;
        ((Debug.MemoryInfo)localObject1).<init>();
        Debug.getMemoryInfo((Debug.MemoryInfo)localObject1);
        localObject2 = "debug_memory_info";
        localBundle.putParcelable((String)localObject2, (Parcelable)localObject1);
      }
      localObject1 = ke.G;
      localObject2 = w.q();
      localObject1 = ((kd)localObject2).a((jz)localObject1);
      localObject1 = (Boolean)localObject1;
      bool = ((Boolean)localObject1).booleanValue();
      if (bool)
      {
        localObject1 = Runtime.getRuntime();
        localObject2 = "runtime_free_memory";
        long l = ((Runtime)localObject1).freeMemory();
        localBundle.putLong((String)localObject2, l);
        localObject2 = "runtime_max_memory";
        l = ((Runtime)localObject1).maxMemory();
        localBundle.putLong((String)localObject2, l);
        localObject2 = "runtime_total_memory";
        l = ((Runtime)localObject1).totalMemory();
        localBundle.putLong((String)localObject2, l);
      }
      localObject1 = "web_view_count";
      localObject2 = w.i();
      localObject2 = i;
      int i = ((AtomicInteger)localObject2).get();
      localBundle.putInt((String)localObject1, i);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = "Unable to gather memory stats";
        tp.c((String)localObject2, localException);
      }
    }
    return localBundle;
  }
  
  public static AudioManager g(Context paramContext)
  {
    return (AudioManager)paramContext.getSystemService("audio");
  }
  
  private static String g()
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    int i = 256;
    localStringBuffer.<init>(i);
    localStringBuffer.append("Mozilla/5.0 (Linux; U; Android");
    Object localObject1 = Build.VERSION.RELEASE;
    if (localObject1 != null)
    {
      localObject1 = localStringBuffer.append(" ");
      localObject2 = Build.VERSION.RELEASE;
      ((StringBuffer)localObject1).append((String)localObject2);
    }
    localObject1 = localStringBuffer.append("; ");
    Object localObject2 = Locale.getDefault();
    ((StringBuffer)localObject1).append(localObject2);
    localObject1 = Build.DEVICE;
    if (localObject1 != null)
    {
      localObject1 = localStringBuffer.append("; ");
      localObject2 = Build.DEVICE;
      ((StringBuffer)localObject1).append((String)localObject2);
      localObject1 = Build.DISPLAY;
      if (localObject1 != null)
      {
        localObject1 = localStringBuffer.append(" Build/");
        localObject2 = Build.DISPLAY;
        ((StringBuffer)localObject1).append((String)localObject2);
      }
    }
    localStringBuffer.append(") AppleWebKit/533 Version/4.0 Safari/533");
    return localStringBuffer.toString();
  }
  
  public static float h(Context paramContext)
  {
    int i = 3;
    float f1 = 0.0F;
    AudioManager localAudioManager = g(paramContext);
    if (localAudioManager == null) {}
    for (;;)
    {
      return f1;
      int j = localAudioManager.getStreamMaxVolume(i);
      int k = localAudioManager.getStreamVolume(i);
      if (j != 0)
      {
        f1 = k;
        float f2 = j;
        f1 /= f2;
      }
    }
  }
  
  private static int[] h()
  {
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = 0;
    arrayOfInt[1] = 0;
    return arrayOfInt;
  }
  
  public static int i(Context paramContext)
  {
    ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
    int i;
    if (localApplicationInfo == null)
    {
      i = 0;
      localApplicationInfo = null;
    }
    for (;;)
    {
      return i;
      i = targetSdkVersion;
    }
  }
  
  public static boolean j(Context paramContext)
  {
    bool = false;
    try
    {
      ClassLoader localClassLoader = paramContext.getClassLoader();
      localObject = ClientApi.class;
      localObject = ((Class)localObject).getName();
      localClassLoader.loadClass((String)localObject);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        bool = true;
      }
    }
    finally
    {
      for (;;)
      {
        tp.b("Error loading class.", localThrowable);
        Object localObject = w.i();
        String str = "AdUtil.isLiteSdk";
        ((tj)localObject).a(localThrowable, str);
      }
    }
    return bool;
  }
  
  private static String k(Context paramContext)
  {
    for (Object localObject1 = "activity";; localObject1 = ((ComponentName)localObject1).getClassName())
    {
      try
      {
        localObject1 = paramContext.getSystemService((String)localObject1);
        localObject1 = (ActivityManager)localObject1;
        if (localObject1 != null) {
          break label23;
        }
        localObject1 = null;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          label23:
          int i;
          boolean bool;
          ComponentName localComponentName;
          Object localObject2 = null;
        }
      }
      return (String)localObject1;
      i = 1;
      localObject1 = ((ActivityManager)localObject1).getRunningTasks(i);
      if (localObject1 == null) {
        break;
      }
      bool = ((List)localObject1).isEmpty();
      if (bool) {
        break;
      }
      bool = false;
      localComponentName = null;
      localObject1 = ((List)localObject1).get(0);
      localObject1 = (ActivityManager.RunningTaskInfo)localObject1;
      if (localObject1 == null) {
        break;
      }
      localComponentName = topActivity;
      if (localComponentName == null) {
        break;
      }
      localObject1 = topActivity;
    }
  }
  
  public final nj a(Context paramContext, un paramun)
  {
    synchronized (c)
    {
      Object localObject2 = f;
      if (localObject2 == null)
      {
        nj localnj = new com/google/android/gms/b/nj;
        localObject2 = paramContext.getApplicationContext();
        if (localObject2 != null) {
          paramContext = paramContext.getApplicationContext();
        }
        localObject2 = ke.b;
        kd localkd = w.q();
        localObject2 = localkd.a((jz)localObject2);
        localObject2 = (String)localObject2;
        localnj.<init>(paramContext, paramun, (String)localObject2);
        f = localnj;
      }
      localObject2 = f;
      return (nj)localObject2;
    }
  }
  
  public final String a(Context paramContext, String paramString)
  {
    for (;;)
    {
      synchronized (c)
      {
        String str = e;
        if (str != null)
        {
          str = e;
          return str;
        }
        if (paramString == null) {
          str = g();
        }
      }
      try
      {
        localObject3 = w.g();
        localObject3 = ((tu)localObject3).a(paramContext);
        e = ((String)localObject3);
      }
      catch (Exception localException)
      {
        Object localObject3;
        boolean bool;
        Object localObject5;
        Object localObject4;
        int i;
        int j;
        Object localObject6;
        for (;;) {}
      }
      localObject3 = e;
      bool = TextUtils.isEmpty((CharSequence)localObject3);
      if (bool)
      {
        ip.a();
        bool = uk.b();
        if (!bool)
        {
          bool = false;
          localObject3 = null;
          e = null;
          localObject3 = a;
          localObject5 = new com/google/android/gms/b/tt$2;
          ((tt.2)localObject5).<init>(this, paramContext);
          ((Handler)localObject3).post((Runnable)localObject5);
          for (;;)
          {
            localObject3 = e;
            if (localObject3 != null) {
              break label249;
            }
            try
            {
              localObject3 = c;
              localObject3.wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              localObject4 = g();
              e = ((String)localObject4);
              localObject5 = "Interrupted, use default user agent: ";
              localObject4 = e;
              localObject4 = String.valueOf(localObject4);
              i = ((String)localObject4).length();
              if (i == 0) {
                break label222;
              }
            }
          }
          localObject4 = ((String)localObject5).concat((String)localObject4);
          for (;;)
          {
            tp.e((String)localObject4);
            break;
            label222:
            localObject4 = new java/lang/String;
            ((String)localObject4).<init>((String)localObject5);
          }
        }
        localObject4 = b(paramContext);
        e = ((String)localObject4);
      }
      label249:
      localObject4 = e;
      localObject4 = String.valueOf(localObject4);
      localObject5 = String.valueOf(localObject4);
      j = ((String)localObject5).length() + 11;
      localObject6 = String.valueOf(paramString);
      i = ((String)localObject6).length();
      j += i;
      localObject6 = new java/lang/StringBuilder;
      ((StringBuilder)localObject6).<init>(j);
      localObject4 = ((StringBuilder)localObject6).append((String)localObject4);
      localObject5 = " (Mobile; ";
      localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
      localObject4 = ((StringBuilder)localObject4).append(paramString);
      localObject5 = ")";
      localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
      localObject4 = ((StringBuilder)localObject4).toString();
      e = ((String)localObject4);
      localObject4 = e;
    }
  }
  
  public final JSONObject a(Map paramMap)
  {
    try
    {
      Object localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>();
      Object localObject2 = paramMap.keySet();
      Object localObject3 = ((Set)localObject2).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject3).hasNext();
        if (!bool) {
          break;
        }
        localObject2 = ((Iterator)localObject3).next();
        localObject2 = (String)localObject2;
        Object localObject4 = paramMap.get(localObject2);
        a((JSONObject)localObject1, (String)localObject2, localObject4);
      }
      String str;
      int i;
      return (JSONObject)localObject1;
    }
    catch (ClassCastException localClassCastException)
    {
      localObject1 = new org/json/JSONException;
      localObject3 = "Could not convert map to JSON: ";
      str = String.valueOf(localClassCastException.getMessage());
      i = str.length();
      if (i != 0) {
        str = ((String)localObject3).concat(str);
      }
      for (;;)
      {
        ((JSONException)localObject1).<init>(str);
        throw ((Throwable)localObject1);
        str = new java/lang/String;
        str.<init>((String)localObject3);
      }
    }
  }
  
  public final void a(Context paramContext, String paramString, HttpURLConnection paramHttpURLConnection)
  {
    int i = 60000;
    paramHttpURLConnection.setConnectTimeout(i);
    paramHttpURLConnection.setInstanceFollowRedirects(false);
    paramHttpURLConnection.setReadTimeout(i);
    String str = a(paramContext, paramString);
    paramHttpURLConnection.setRequestProperty("User-Agent", str);
    paramHttpURLConnection.setUseCaches(false);
  }
}


/* Location:              com/google/android/gms/b/tt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */