package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlertDialog.Builder;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
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
import java.io.InputStreamReader;
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

@qi
public final class tt
{
  public static final Handler a = new tq(Looper.getMainLooper());
  public boolean b = false;
  private final Object c = new Object();
  private boolean d = true;
  private String e;
  private nj f;
  
  public static Bitmap a(View paramView)
  {
    paramView.setDrawingCacheEnabled(true);
    Bitmap localBitmap = Bitmap.createBitmap(paramView.getDrawingCache());
    paramView.setDrawingCacheEnabled(false);
    return localBitmap;
  }
  
  public static Uri a(String paramString1, String paramString2, String paramString3)
  {
    int j = paramString1.indexOf("&adurl");
    int i = j;
    if (j == -1) {
      i = paramString1.indexOf("?adurl");
    }
    if (i != -1) {
      return Uri.parse(paramString1.substring(0, i + 1) + paramString2 + "=" + paramString3 + "&" + paramString1.substring(i + 1));
    }
    return Uri.parse(paramString1).buildUpon().appendQueryParameter(paramString2, paramString3).build();
  }
  
  public static Bundle a(hi paramhi)
  {
    if (paramhi == null) {}
    do
    {
      do
      {
        return null;
        ??? = ke.ac;
        if (((Boolean)w.q().a((jz)???)).booleanValue()) {
          break;
        }
        ??? = ke.ae;
      } while (!((Boolean)w.q().a((jz)???)).booleanValue());
    } while ((w.i().a()) && (w.i().b()));
    if (a) {}
    label287:
    for (;;)
    {
      synchronized (b)
      {
        a = false;
        b.notifyAll();
        tp.b("ContentFetchThread: wakeup");
        localObject2 = c.a();
        if (localObject2 != null)
        {
          ??? = f;
          paramhi = g;
          localObject2 = h;
          if (??? != null) {
            w.i().a((String)???);
          }
          if (localObject2 == null) {
            break label287;
          }
          w.i().b((String)localObject2);
          Bundle localBundle = new Bundle(1);
          if (localObject2 != null)
          {
            jz localjz = ke.ae;
            if ((((Boolean)w.q().a(localjz)).booleanValue()) && (!w.i().b())) {
              localBundle.putString("v_fp_vertical", (String)localObject2);
            }
          }
          if (??? != null)
          {
            localObject2 = ke.ac;
            if ((((Boolean)w.q().a((jz)localObject2)).booleanValue()) && (!w.i().a()))
            {
              localBundle.putString("fingerprint", (String)???);
              if (!((String)???).equals(paramhi)) {
                localBundle.putString("v_fp", paramhi);
              }
            }
          }
          if (localBundle.isEmpty()) {
            break;
          }
          return localBundle;
        }
      }
      ??? = w.i().i();
      Object localObject2 = w.i().j();
      paramhi = null;
    }
  }
  
  public static DisplayMetrics a(WindowManager paramWindowManager)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    paramWindowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics;
  }
  
  public static PopupWindow a(View paramView, int paramInt1, int paramInt2)
  {
    return new PopupWindow(paramView, paramInt1, paramInt2, false);
  }
  
  public static String a()
  {
    return UUID.randomUUID().toString();
  }
  
  public static String a(Context paramContext, View paramView, il paramil)
  {
    Object localObject = ke.at;
    if (!((Boolean)w.q().a((jz)localObject)).booleanValue()) {
      return null;
    }
    for (;;)
    {
      try
      {
        localObject = new JSONObject();
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("width", e);
        localJSONObject.put("height", b);
        ((JSONObject)localObject).put("size", localJSONObject);
        ((JSONObject)localObject).put("activity", k(paramContext));
        if (!d)
        {
          paramContext = new JSONArray();
          if (paramView != null)
          {
            paramil = paramView.getParent();
            if (paramil != null)
            {
              int i = -1;
              if ((paramil instanceof ViewGroup)) {
                i = ((ViewGroup)paramil).indexOfChild(paramView);
              }
              paramView = new JSONObject();
              paramView.put("type", paramil.getClass().getName());
              paramView.put("index_of_child", i);
              paramContext.put(paramView);
            }
            if ((paramil == null) || (!(paramil instanceof View))) {
              break label230;
            }
            paramView = (View)paramil;
            continue;
          }
          if (paramContext.length() > 0) {
            ((JSONObject)localObject).put("parents", paramContext);
          }
        }
        paramContext = ((JSONObject)localObject).toString();
        return paramContext;
      }
      catch (JSONException paramContext)
      {
        tp.c("Fail to get view hierarchy json", paramContext);
        return null;
      }
      label230:
      paramView = null;
    }
  }
  
  private static String a(Context paramContext, dw paramdw, String paramString, View paramView)
  {
    int k = 0;
    if (paramdw == null) {
      return paramString;
    }
    try
    {
      Uri localUri = Uri.parse(paramString);
      int j = k;
      Object localObject;
      int m;
      int i;
      if (paramdw.b(localUri))
      {
        localObject = dw.d;
        m = localObject.length;
        i = 0;
      }
      for (;;)
      {
        j = k;
        if (i < m)
        {
          String str = localObject[i];
          if (localUri.getPath().endsWith(str)) {
            j = 1;
          }
        }
        else
        {
          localObject = localUri;
          if (j != 0) {
            localObject = paramdw.a(localUri, paramContext, paramView);
          }
          paramContext = ((Uri)localObject).toString();
          return paramContext;
        }
        i += 1;
      }
      return paramString;
    }
    catch (Exception paramContext) {}
  }
  
  public static String a(vc paramvc, String paramString)
  {
    return a(paramvc.getContext(), paramvc.n(), paramString, paramvc.b());
  }
  
  public static String a(InputStreamReader paramInputStreamReader)
  {
    StringBuilder localStringBuilder = new StringBuilder(8192);
    char[] arrayOfChar = new char['ࠀ'];
    for (;;)
    {
      int i = paramInputStreamReader.read(arrayOfChar);
      if (i == -1) {
        break;
      }
      localStringBuilder.append(arrayOfChar, 0, i);
    }
    return localStringBuilder.toString();
  }
  
  public static String a(String paramString)
  {
    return Uri.parse(paramString).buildUpon().query(null).build().toString();
  }
  
  public static String a(String paramString, Map<String, String> paramMap)
  {
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramString = paramString.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] { str }), String.format("$1%s$2", new Object[] { Uri.encode((String)paramMap.get(str)) }));
    }
    return paramString.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] { "[^@]+" }), String.format("$1%s$2", new Object[] { "" })).replaceAll("@@", "@");
  }
  
  public static Map<String, String> a(Uri paramUri)
  {
    if (paramUri == null) {
      return null;
    }
    HashMap localHashMap = new HashMap();
    Iterator localIterator = w.g().a(paramUri).iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, paramUri.getQueryParameter(str));
    }
    return localHashMap;
  }
  
  private JSONArray a(Collection<?> paramCollection)
  {
    JSONArray localJSONArray = new JSONArray();
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      a(localJSONArray, paramCollection.next());
    }
    return localJSONArray;
  }
  
  private JSONObject a(Bundle paramBundle)
  {
    JSONObject localJSONObject = new JSONObject();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      a(localJSONObject, str, paramBundle.get(str));
    }
    return localJSONObject;
  }
  
  public static void a(Activity paramActivity, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    paramActivity = paramActivity.getWindow();
    if ((paramActivity != null) && (paramActivity.getDecorView() != null) && (paramActivity.getDecorView().getViewTreeObserver() != null)) {
      paramActivity.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(paramOnGlobalLayoutListener);
    }
  }
  
  public static void a(Activity paramActivity, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    paramActivity = paramActivity.getWindow();
    if ((paramActivity != null) && (paramActivity.getDecorView() != null) && (paramActivity.getDecorView().getViewTreeObserver() != null)) {
      paramActivity.getDecorView().getViewTreeObserver().addOnScrollChangedListener(paramOnScrollChangedListener);
    }
  }
  
  public static void a(Context paramContext, Intent paramIntent)
  {
    try
    {
      paramContext.startActivity(paramIntent);
      return;
    }
    catch (Throwable localThrowable)
    {
      paramIntent.addFlags(268435456);
      paramContext.startActivity(paramIntent);
    }
  }
  
  @TargetApi(18)
  public static void a(Context paramContext, Uri paramUri)
  {
    try
    {
      Bundle localBundle = new Bundle();
      jz localjz = ke.dd;
      if ((((Boolean)w.q().a(localjz)).booleanValue()) && (i.b())) {
        localBundle.putBinder("android.support.customtabs.extra.SESSION", null);
      }
      localBundle.putString("com.android.browser.application_id", paramContext.getPackageName());
      paramContext.startActivity(new Intent("android.intent.action.VIEW", paramUri).putExtras(localBundle));
      paramContext = String.valueOf(paramUri.toString());
      tp.b(String.valueOf(paramContext).length() + 26 + "Opening " + paramContext + " in a new browser.");
      return;
    }
    catch (ActivityNotFoundException paramContext)
    {
      tp.b("No browser is found.", paramContext);
    }
  }
  
  public static void a(Context paramContext, final String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      w.e();
      paramBundle.putString("device", c());
      paramBundle.putString("eids", TextUtils.join(",", ke.a()));
    }
    ip.a();
    uk.a(paramContext, paramString1, paramString2, paramBundle, paramBoolean, new uk.a()
    {
      public final void a(String paramAnonymousString)
      {
        w.e();
        tt.b(tt.this, paramString1, paramAnonymousString);
      }
    });
  }
  
  public static void a(Context paramContext, String paramString, List<String> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      new ud(paramContext, paramString, (String)paramList.next()).c();
    }
  }
  
  public static void a(final Context paramContext, List<String> paramList)
  {
    if (!(paramContext instanceof Activity)) {}
    while (TextUtils.isEmpty(gi.a((Activity)paramContext))) {
      return;
    }
    if (paramList == null)
    {
      tp.a("Cannot ping urls: empty list.");
      return;
    }
    if (!ks.a(paramContext))
    {
      tp.a("Cannot ping url because custom tabs is not supported");
      return;
    }
    final ks localks = new ks();
    c = new ks.a() {};
    localks.b((Activity)paramContext);
  }
  
  public static void a(Runnable paramRunnable)
  {
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      paramRunnable.run();
      return;
    }
    a.post(paramRunnable);
  }
  
  public static void a(List<String> paramList, String paramString)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      new ud((String)paramList.next(), paramString).c();
    }
  }
  
  private void a(JSONArray paramJSONArray, Object paramObject)
  {
    if ((paramObject instanceof Bundle))
    {
      paramJSONArray.put(a((Bundle)paramObject));
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramJSONArray.put(a((Map)paramObject));
      return;
    }
    if ((paramObject instanceof Collection))
    {
      paramJSONArray.put(a((Collection)paramObject));
      return;
    }
    if ((paramObject instanceof Object[]))
    {
      paramObject = (Object[])paramObject;
      JSONArray localJSONArray = new JSONArray();
      int j = paramObject.length;
      int i = 0;
      while (i < j)
      {
        a(localJSONArray, paramObject[i]);
        i += 1;
      }
      paramJSONArray.put(localJSONArray);
      return;
    }
    paramJSONArray.put(paramObject);
  }
  
  private void a(JSONObject paramJSONObject, String paramString, Object paramObject)
  {
    if ((paramObject instanceof Bundle))
    {
      paramJSONObject.put(paramString, a((Bundle)paramObject));
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramJSONObject.put(paramString, a((Map)paramObject));
      return;
    }
    if ((paramObject instanceof Collection))
    {
      if (paramString != null) {}
      for (;;)
      {
        paramJSONObject.put(paramString, a((Collection)paramObject));
        return;
        paramString = "null";
      }
    }
    if ((paramObject instanceof Object[]))
    {
      paramJSONObject.put(paramString, a(Arrays.asList((Object[])paramObject)));
      return;
    }
    paramJSONObject.put(paramString, paramObject);
  }
  
  private static boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    return Math.abs(paramInt1 - paramInt2) <= paramInt3;
  }
  
  @TargetApi(24)
  public static boolean a(Activity paramActivity, Configuration paramConfiguration)
  {
    boolean bool2 = false;
    ip.a();
    int j = uk.a(paramActivity, screenHeightDp);
    int k = uk.a(paramActivity, screenWidthDp);
    paramConfiguration = a((WindowManager)paramActivity.getApplicationContext().getSystemService("window"));
    int m = heightPixels;
    int n = widthPixels;
    int i = paramActivity.getResources().getIdentifier("status_bar_height", "dimen", "android");
    if (i > 0) {}
    for (i = paramActivity.getResources().getDimensionPixelSize(i);; i = 0)
    {
      int i1 = (int)Math.round(getResourcesgetDisplayMetricsdensity + 0.5D);
      paramActivity = ke.dm;
      i1 = ((Integer)w.q().a(paramActivity)).intValue() * i1;
      boolean bool1 = bool2;
      if (a(m, i + j, i1))
      {
        bool1 = bool2;
        if (a(n, k, i1)) {
          bool1 = true;
        }
      }
      return bool1;
    }
  }
  
  public static boolean a(Context paramContext)
  {
    Intent localIntent = new Intent();
    localIntent.setClassName(paramContext, "com.google.android.gms.ads.AdActivity");
    paramContext = paramContext.getPackageManager().resolveActivity(localIntent, 65536);
    if ((paramContext == null) || (activityInfo == null))
    {
      tp.e("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
      return false;
    }
    if ((activityInfo.configChanges & 0x10) == 0) {
      tp.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "keyboard" }));
    }
    for (boolean bool = false;; bool = true)
    {
      if ((activityInfo.configChanges & 0x20) == 0)
      {
        tp.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "keyboardHidden" }));
        bool = false;
      }
      if ((activityInfo.configChanges & 0x80) == 0)
      {
        tp.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "orientation" }));
        bool = false;
      }
      if ((activityInfo.configChanges & 0x100) == 0)
      {
        tp.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "screenLayout" }));
        bool = false;
      }
      if ((activityInfo.configChanges & 0x200) == 0)
      {
        tp.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "uiMode" }));
        bool = false;
      }
      if ((activityInfo.configChanges & 0x400) == 0)
      {
        tp.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "screenSize" }));
        bool = false;
      }
      if ((activityInfo.configChanges & 0x800) == 0)
      {
        tp.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "smallestScreenSize" }));
        return false;
      }
      return bool;
    }
  }
  
  public static boolean a(Context paramContext, String paramString1, String paramString2)
  {
    return bc.a(paramContext).a(paramString2, paramString1) == 0;
  }
  
  public static boolean a(View paramView, Context paramContext)
  {
    Object localObject2 = null;
    Object localObject1 = paramContext.getApplicationContext();
    if (localObject1 != null) {}
    for (localObject1 = (PowerManager)((Context)localObject1).getSystemService("power");; localObject1 = null)
    {
      Object localObject3 = paramContext.getSystemService("keyguard");
      paramContext = (Context)localObject2;
      if (localObject3 != null)
      {
        paramContext = (Context)localObject2;
        if ((localObject3 instanceof KeyguardManager)) {
          paramContext = (KeyguardManager)localObject3;
        }
      }
      return a(paramView, (PowerManager)localObject1, paramContext);
    }
  }
  
  public static boolean a(View paramView, PowerManager paramPowerManager, KeyguardManager paramKeyguardManager)
  {
    boolean bool;
    int i;
    if (!ed)
    {
      if (paramKeyguardManager == null)
      {
        bool = false;
        if (bool) {
          break label119;
        }
      }
    }
    else
    {
      i = 1;
      label23:
      if ((paramView.getVisibility() != 0) || (!paramView.isShown())) {
        break label130;
      }
      if ((paramPowerManager != null) && (!paramPowerManager.isScreenOn())) {
        break label124;
      }
    }
    label119:
    label124:
    for (int j = 1;; j = 0)
    {
      if ((j == 0) || (i == 0)) {
        break label130;
      }
      paramPowerManager = ke.bm;
      if ((((Boolean)w.q().a(paramPowerManager)).booleanValue()) && (!paramView.getLocalVisibleRect(new Rect())) && (!paramView.getGlobalVisibleRect(new Rect()))) {
        break label130;
      }
      return true;
      bool = paramKeyguardManager.inKeyguardRestrictedInputMode();
      break;
      i = 0;
      break label23;
    }
    label130:
    return false;
  }
  
  public static boolean a(ClassLoader paramClassLoader, Class<?> paramClass, String paramString)
  {
    try
    {
      boolean bool = paramClass.isAssignableFrom(Class.forName(paramString, false, paramClassLoader));
      return bool;
    }
    catch (Throwable paramClassLoader) {}
    return false;
  }
  
  public static int[] a(Activity paramActivity)
  {
    paramActivity = paramActivity.getWindow();
    if (paramActivity != null)
    {
      paramActivity = paramActivity.findViewById(16908290);
      if (paramActivity != null) {
        return new int[] { paramActivity.getWidth(), paramActivity.getHeight() };
      }
    }
    return h();
  }
  
  public static int b(View paramView)
  {
    if (paramView == null) {
      return -1;
    }
    for (ViewParent localViewParent = paramView.getParent(); (localViewParent != null) && (!(localViewParent instanceof AdapterView)); localViewParent = localViewParent.getParent()) {}
    if (localViewParent == null) {
      return -1;
    }
    return ((AdapterView)localViewParent).getPositionForView(paramView);
  }
  
  public static int b(String paramString)
  {
    try
    {
      int i = Integer.parseInt(paramString);
      return i;
    }
    catch (NumberFormatException paramString)
    {
      paramString = String.valueOf(paramString);
      tp.e(String.valueOf(paramString).length() + 22 + "Could not parse value:" + paramString);
    }
    return 0;
  }
  
  public static String b()
  {
    Object localObject1 = UUID.randomUUID();
    byte[] arrayOfByte1 = BigInteger.valueOf(((UUID)localObject1).getLeastSignificantBits()).toByteArray();
    byte[] arrayOfByte2 = BigInteger.valueOf(((UUID)localObject1).getMostSignificantBits()).toByteArray();
    localObject1 = new BigInteger(1, arrayOfByte1).toString();
    int i = 0;
    while (i < 2)
    {
      try
      {
        Object localObject2 = MessageDigest.getInstance("MD5");
        ((MessageDigest)localObject2).update(arrayOfByte1);
        ((MessageDigest)localObject2).update(arrayOfByte2);
        byte[] arrayOfByte3 = new byte[8];
        System.arraycopy(((MessageDigest)localObject2).digest(), 0, arrayOfByte3, 0, 8);
        localObject2 = new BigInteger(1, arrayOfByte3).toString();
        localObject1 = localObject2;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        for (;;) {}
      }
      i += 1;
    }
    return (String)localObject1;
  }
  
  protected static String b(Context paramContext)
  {
    try
    {
      paramContext = new WebView(paramContext).getSettings().getUserAgentString();
      return paramContext;
    }
    catch (Exception paramContext) {}
    return g();
  }
  
  public static String b(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.openFileInput(paramString);
      paramString = new ByteArrayOutputStream();
      h.a(paramContext, paramString);
      paramContext = new String(paramString.toByteArray(), "UTF-8");
      return paramContext;
    }
    catch (IOException paramContext)
    {
      tp.b("Error reading from internal storage.", paramContext);
    }
    return "";
  }
  
  public static void b(Activity paramActivity, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    paramActivity = paramActivity.getWindow();
    if ((paramActivity != null) && (paramActivity.getDecorView() != null) && (paramActivity.getDecorView().getViewTreeObserver() != null)) {
      paramActivity.getDecorView().getViewTreeObserver().removeOnScrollChangedListener(paramOnScrollChangedListener);
    }
  }
  
  public static void b(Context paramContext, String paramString1, String paramString2)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramString2);
    a(paramContext, paramString1, localArrayList);
  }
  
  public static void b(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean)
  {
    jz localjz = ke.br;
    if (((Boolean)w.q().a(localjz)).booleanValue()) {
      a(paramContext, paramString1, paramString2, paramBundle, paramBoolean);
    }
  }
  
  public static void b(Runnable paramRunnable)
  {
    if (Looper.getMainLooper().getThread() != Thread.currentThread())
    {
      paramRunnable.run();
      return;
    }
    ts.a(paramRunnable);
  }
  
  public static int[] b(Activity paramActivity)
  {
    int[] arrayOfInt = a(paramActivity);
    ip.a();
    int i = uk.b(paramActivity, arrayOfInt[0]);
    ip.a();
    return new int[] { i, uk.b(paramActivity, arrayOfInt[1]) };
  }
  
  public static AlertDialog.Builder c(Context paramContext)
  {
    return new AlertDialog.Builder(paramContext);
  }
  
  private static Bitmap c(View paramView)
  {
    try
    {
      int i = paramView.getWidth();
      int j = paramView.getHeight();
      if ((i == 0) || (j == 0))
      {
        tp.e("Width or height of view is zero");
        return null;
      }
      Bitmap localBitmap = Bitmap.createBitmap(paramView.getWidth(), paramView.getHeight(), Bitmap.Config.RGB_565);
      Canvas localCanvas = new Canvas(localBitmap);
      paramView.layout(0, 0, i, j);
      paramView.draw(localCanvas);
      return localBitmap;
    }
    catch (RuntimeException paramView)
    {
      tp.b("Fail to capture the webview", paramView);
    }
    return null;
  }
  
  public static String c()
  {
    String str1 = Build.MANUFACTURER;
    String str2 = Build.MODEL;
    if (str2.startsWith(str1)) {
      return str2;
    }
    return String.valueOf(str1).length() + 1 + String.valueOf(str2).length() + str1 + " " + str2;
  }
  
  public static void c(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      paramContext = paramContext.openFileOutput(paramString1, 0);
      paramContext.write(paramString2.getBytes("UTF-8"));
      paramContext.close();
      return;
    }
    catch (Exception paramContext)
    {
      tp.b("Error writing to file in internal storage.", paramContext);
    }
  }
  
  public static boolean c(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    return paramString.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
  }
  
  public static int[] c(Activity paramActivity)
  {
    Object localObject = paramActivity.getWindow();
    if (localObject != null)
    {
      View localView = ((Window)localObject).findViewById(16908290);
      if (localView != null)
      {
        localObject = new int[2];
        localObject[0] = localView.getTop();
        localObject[1] = localView.getBottom();
      }
    }
    for (;;)
    {
      ip.a();
      int i = uk.b(paramActivity, localObject[0]);
      ip.a();
      return new int[] { i, uk.b(paramActivity, localObject[1]) };
      localObject = h();
    }
  }
  
  public static float d()
  {
    w.y();
    q localq = q.a();
    if ((localq != null) && (localq.d())) {
      return localq.c();
    }
    return 1.0F;
  }
  
  /* Error */
  private static Bitmap d(View paramView)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 1099	android/view/View:isDrawingCacheEnabled	()Z
    //   4: istore_1
    //   5: aload_0
    //   6: iconst_1
    //   7: invokevirtual 56	android/view/View:setDrawingCacheEnabled	(Z)V
    //   10: aload_0
    //   11: invokevirtual 60	android/view/View:getDrawingCache	()Landroid/graphics/Bitmap;
    //   14: astore_2
    //   15: aload_2
    //   16: ifnull +31 -> 47
    //   19: aload_2
    //   20: invokestatic 66	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   23: astore_2
    //   24: aload_0
    //   25: iload_1
    //   26: invokevirtual 56	android/view/View:setDrawingCacheEnabled	(Z)V
    //   29: aload_2
    //   30: areturn
    //   31: astore_0
    //   32: aconst_null
    //   33: astore_2
    //   34: ldc_w 1101
    //   37: aload_0
    //   38: invokestatic 562	com/google/android/gms/b/tp:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   41: aload_2
    //   42: areturn
    //   43: astore_0
    //   44: goto -10 -> 34
    //   47: aconst_null
    //   48: astore_2
    //   49: goto -25 -> 24
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	52	0	paramView	View
    //   4	22	1	bool	boolean
    //   14	35	2	localBitmap	Bitmap
    // Exception table:
    //   from	to	target	type
    //   0	15	31	java/lang/RuntimeException
    //   19	24	31	java/lang/RuntimeException
    //   24	29	43	java/lang/RuntimeException
  }
  
  public static jv d(Context paramContext)
  {
    return new jv(paramContext);
  }
  
  public static boolean e()
  {
    w.y();
    q localq = q.a();
    if (localq != null) {
      return localq.e();
    }
    return false;
  }
  
  public static boolean e(Context paramContext)
  {
    boolean bool;
    label134:
    do
    {
      try
      {
        Object localObject = (ActivityManager)paramContext.getSystemService("activity");
        KeyguardManager localKeyguardManager = (KeyguardManager)paramContext.getSystemService("keyguard");
        if ((localObject != null) && (localKeyguardManager != null))
        {
          localObject = ((ActivityManager)localObject).getRunningAppProcesses();
          if (localObject == null) {
            return false;
          }
          localObject = ((List)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
            if (Process.myPid() == pid) {
              if ((importance == 100) && (!localKeyguardManager.inKeyguardRestrictedInputMode()))
              {
                paramContext = (PowerManager)paramContext.getSystemService("power");
                if (paramContext == null)
                {
                  bool = false;
                  break label134;
                }
                bool = paramContext.isScreenOn();
                break label134;
              }
            }
          }
          return false;
        }
      }
      catch (Throwable paramContext)
      {
        return false;
      }
      return false;
    } while (!bool);
    return true;
  }
  
  public static Bitmap f(Context paramContext)
  {
    if (!(paramContext instanceof Activity)) {
      return null;
    }
    try
    {
      jz localjz = ke.bV;
      if (((Boolean)w.q().a(localjz)).booleanValue())
      {
        paramContext = ((Activity)paramContext).getWindow();
        if (paramContext != null) {
          return d(paramContext.getDecorView().getRootView());
        }
      }
      else
      {
        paramContext = c(((Activity)paramContext).getWindow().getDecorView());
      }
    }
    catch (RuntimeException paramContext)
    {
      tp.b("Fail to capture screen shot", paramContext);
      paramContext = null;
    }
    return paramContext;
  }
  
  public static Bundle f()
  {
    Bundle localBundle = new Bundle();
    try
    {
      Object localObject = ke.F;
      if (((Boolean)w.q().a((jz)localObject)).booleanValue())
      {
        localObject = new Debug.MemoryInfo();
        Debug.getMemoryInfo((Debug.MemoryInfo)localObject);
        localBundle.putParcelable("debug_memory_info", (Parcelable)localObject);
      }
      localObject = ke.G;
      if (((Boolean)w.q().a((jz)localObject)).booleanValue())
      {
        localObject = Runtime.getRuntime();
        localBundle.putLong("runtime_free_memory", ((Runtime)localObject).freeMemory());
        localBundle.putLong("runtime_max_memory", ((Runtime)localObject).maxMemory());
        localBundle.putLong("runtime_total_memory", ((Runtime)localObject).totalMemory());
      }
      localBundle.putInt("web_view_count", ii.get());
      return localBundle;
    }
    catch (Exception localException)
    {
      tp.c("Unable to gather memory stats", localException);
    }
    return localBundle;
  }
  
  public static AudioManager g(Context paramContext)
  {
    return (AudioManager)paramContext.getSystemService("audio");
  }
  
  private static String g()
  {
    StringBuffer localStringBuffer = new StringBuffer(256);
    localStringBuffer.append("Mozilla/5.0 (Linux; U; Android");
    if (Build.VERSION.RELEASE != null) {
      localStringBuffer.append(" ").append(Build.VERSION.RELEASE);
    }
    localStringBuffer.append("; ").append(Locale.getDefault());
    if (Build.DEVICE != null)
    {
      localStringBuffer.append("; ").append(Build.DEVICE);
      if (Build.DISPLAY != null) {
        localStringBuffer.append(" Build/").append(Build.DISPLAY);
      }
    }
    localStringBuffer.append(") AppleWebKit/533 Version/4.0 Safari/533");
    return localStringBuffer.toString();
  }
  
  public static float h(Context paramContext)
  {
    paramContext = g(paramContext);
    if (paramContext == null) {}
    int i;
    int j;
    do
    {
      return 0.0F;
      i = paramContext.getStreamMaxVolume(3);
      j = paramContext.getStreamVolume(3);
    } while (i == 0);
    return j / i;
  }
  
  private static int[] h()
  {
    return new int[] { 0, 0 };
  }
  
  public static int i(Context paramContext)
  {
    paramContext = paramContext.getApplicationInfo();
    if (paramContext == null) {
      return 0;
    }
    return targetSdkVersion;
  }
  
  public static boolean j(Context paramContext)
  {
    try
    {
      paramContext.getClassLoader().loadClass(ClientApi.class.getName());
      return false;
    }
    catch (ClassNotFoundException paramContext)
    {
      return true;
    }
    catch (Throwable paramContext)
    {
      tp.b("Error loading class.", paramContext);
      w.i().a(paramContext, "AdUtil.isLiteSdk");
    }
    return false;
  }
  
  private static String k(Context paramContext)
  {
    try
    {
      paramContext = (ActivityManager)paramContext.getSystemService("activity");
      if (paramContext == null) {
        return null;
      }
      paramContext = paramContext.getRunningTasks(1);
      if ((paramContext != null) && (!paramContext.isEmpty()))
      {
        paramContext = (ActivityManager.RunningTaskInfo)paramContext.get(0);
        if ((paramContext != null) && (topActivity != null))
        {
          paramContext = topActivity.getClassName();
          return paramContext;
        }
      }
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  public final nj a(Context paramContext, un paramun)
  {
    synchronized (c)
    {
      if (f == null)
      {
        Context localContext = paramContext;
        if (paramContext.getApplicationContext() != null) {
          localContext = paramContext.getApplicationContext();
        }
        paramContext = ke.b;
        f = new nj(localContext, paramun, (String)w.q().a(paramContext));
      }
      paramContext = f;
      return paramContext;
    }
  }
  
  public final String a(final Context paramContext, String paramString)
  {
    synchronized (c)
    {
      if (e != null)
      {
        paramContext = e;
        return paramContext;
      }
      if (paramString == null)
      {
        paramContext = g();
        return paramContext;
      }
    }
    try
    {
      e = w.g().a(paramContext);
      if (TextUtils.isEmpty(e))
      {
        ip.a();
        if (!uk.b())
        {
          e = null;
          a.post(new Runnable()
          {
            public final void run()
            {
              synchronized (tt.a(tt.this))
              {
                tt.a(tt.this, tt.b(paramContext));
                tt.a(tt.this).notifyAll();
                return;
              }
            }
          });
          for (;;)
          {
            paramContext = e;
            if (paramContext != null) {
              break label171;
            }
            try
            {
              c.wait();
            }
            catch (InterruptedException paramContext)
            {
              e = g();
              paramContext = String.valueOf(e);
              if (paramContext.length() == 0) {}
            }
          }
          for (paramContext = "Interrupted, use default user agent: ".concat(paramContext);; paramContext = new String("Interrupted, use default user agent: "))
          {
            tp.e(paramContext);
            break;
          }
        }
        e = b(paramContext);
      }
      label171:
      paramContext = String.valueOf(e);
      e = (String.valueOf(paramContext).length() + 11 + String.valueOf(paramString).length() + paramContext + " (Mobile; " + paramString + ")");
      paramContext = e;
      return paramContext;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public final JSONObject a(Map<String, ?> paramMap)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      Iterator localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        a(localJSONObject, str, paramMap.get(str));
      }
      return localJSONObject;
    }
    catch (ClassCastException paramMap)
    {
      paramMap = String.valueOf(paramMap.getMessage());
      if (paramMap.length() != 0) {}
      for (paramMap = "Could not convert map to JSON: ".concat(paramMap);; paramMap = new String("Could not convert map to JSON: ")) {
        throw new JSONException(paramMap);
      }
    }
  }
  
  public final void a(Context paramContext, String paramString, HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection.setConnectTimeout(60000);
    paramHttpURLConnection.setInstanceFollowRedirects(false);
    paramHttpURLConnection.setReadTimeout(60000);
    paramHttpURLConnection.setRequestProperty("User-Agent", a(paramContext, paramString));
    paramHttpURLConnection.setUseCaches(false);
  }
  
  private final class a
    extends BroadcastReceiver
  {
    private a() {}
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      if ("android.intent.action.USER_PRESENT".equals(paramIntent.getAction())) {
        tt.a(tt.this, true);
      }
      while (!"android.intent.action.SCREEN_OFF".equals(paramIntent.getAction())) {
        return;
      }
      tt.a(tt.this, false);
    }
  }
}


/* Location:              com/google/android/gms/b/tt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */