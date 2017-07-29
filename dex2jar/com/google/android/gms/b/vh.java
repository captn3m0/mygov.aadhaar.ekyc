package com.google.android.gms.b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.overlay.g;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.i;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

@qi
final class vh
  extends WebView
  implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, vc
{
  private kk A;
  private kl B;
  private WeakReference<View.OnClickListener> C;
  private g D;
  private boolean E;
  private uj F;
  private int G = -1;
  private int H = -1;
  private int I = -1;
  private int J = -1;
  private Map<String, ms> K;
  private final WindowManager L;
  boolean a = false;
  private final a b;
  private final Object c = new Object();
  private final dw d;
  private final un e;
  private final u f;
  private final e g;
  private vd h;
  private g i;
  private il j;
  private boolean k;
  private boolean l;
  private boolean m;
  private boolean n;
  private Boolean o;
  private int p;
  private boolean q = true;
  private String r = "";
  private vi s;
  private boolean t;
  private boolean u;
  private kz v;
  private int w;
  private int x;
  private kk y;
  private kk z;
  
  private vh(a parama, il paramil, boolean paramBoolean, dw paramdw, un paramun, km paramkm, u paramu, e parame)
  {
    super(parama);
    b = parama;
    j = paramil;
    m = paramBoolean;
    p = -1;
    d = paramdw;
    e = paramun;
    f = paramu;
    g = parame;
    L = ((WindowManager)getContext().getSystemService("window"));
    setBackgroundColor(0);
    paramil = getSettings();
    paramil.setAllowFileAccess(false);
    paramil.setJavaScriptEnabled(true);
    paramil.setSavePassword(false);
    paramil.setSupportMultipleWindows(true);
    paramil.setJavaScriptCanOpenWindowsAutomatically(true);
    if (Build.VERSION.SDK_INT >= 21) {
      paramil.setMixedContentMode(2);
    }
    paramil.setUserAgentString(w.e().a(parama, a));
    w.g().a(getContext(), paramil);
    setDownloadListener(this);
    L();
    if (i.a()) {
      addJavascriptInterface(new vj(this), "googleAdsJsInterface");
    }
    int i1 = Build.VERSION.SDK_INT;
    removeJavascriptInterface("accessibility");
    removeJavascriptInterface("accessibilityTraversal");
    F = new uj(b.a, this, this, null);
    a(paramkm);
    w.g().b(parama);
  }
  
  private boolean G()
  {
    if ((!h.a()) && (!h.b())) {
      return false;
    }
    w.e();
    DisplayMetrics localDisplayMetrics = tt.a(L);
    ip.a();
    int i3 = uk.b(localDisplayMetrics, widthPixels);
    ip.a();
    int i4 = uk.b(localDisplayMetrics, heightPixels);
    Object localObject = b.a;
    int i2;
    int i1;
    if ((localObject == null) || (((Activity)localObject).getWindow() == null))
    {
      i2 = i4;
      i1 = i3;
      label93:
      if ((H == i3) && (G == i4) && (I == i1) && (J == i2)) {
        break label243;
      }
      if ((H == i3) && (G == i4)) {
        break label245;
      }
    }
    label243:
    label245:
    for (boolean bool = true;; bool = false)
    {
      H = i3;
      G = i4;
      I = i1;
      J = i2;
      new oy(this).a(i3, i4, i1, i2, density, L.getDefaultDisplay().getRotation());
      return bool;
      w.e();
      localObject = tt.a((Activity)localObject);
      ip.a();
      i1 = uk.b(localDisplayMetrics, localObject[0]);
      ip.a();
      i2 = uk.b(localDisplayMetrics, localObject[1]);
      break label93;
      break;
    }
  }
  
  private Boolean J()
  {
    synchronized (c)
    {
      Boolean localBoolean = o;
      return localBoolean;
    }
  }
  
  private void K()
  {
    ki.a(B.b, z, new String[] { "aeh2" });
  }
  
  private void L()
  {
    for (;;)
    {
      synchronized (c)
      {
        if ((m) || (j.d))
        {
          int i1 = Build.VERSION.SDK_INT;
          tp.b("Enabling hardware acceleration on an overlay.");
          M();
          return;
        }
        if (Build.VERSION.SDK_INT < 18)
        {
          tp.b("Disabling hardware acceleration on an AdView.");
          synchronized (c)
          {
            if (!n) {
              w.g().c(this);
            }
            n = true;
          }
        }
      }
      tp.b("Enabling hardware acceleration on an AdView.");
      M();
    }
  }
  
  private void M()
  {
    synchronized (c)
    {
      if (n) {
        w.g().b(this);
      }
      n = false;
      return;
    }
  }
  
  private void N()
  {
    synchronized (c)
    {
      if (!E)
      {
        E = true;
        ii.decrementAndGet();
      }
      return;
    }
  }
  
  private void O()
  {
    synchronized (c)
    {
      K = null;
      return;
    }
  }
  
  private void P()
  {
    if (B == null) {}
    km localkm;
    do
    {
      return;
      localkm = B.b;
    } while ((localkm == null) || (w.i().e() == null));
    w.i().e().a(localkm);
  }
  
  static vh a(Context paramContext, il paramil, boolean paramBoolean, dw paramdw, un paramun, km paramkm, u paramu, e parame)
  {
    return new vh(new a(paramContext), paramil, paramBoolean, paramdw, paramun, paramkm, paramu, parame);
  }
  
  private void a(km paramkm)
  {
    P();
    B = new kl(new km(true, "make_wv", j.a));
    km localkm = B.b;
    synchronized (b)
    {
      e = paramkm;
      z = ki.a(B.b);
      B.a("native:view_create", z);
      A = null;
      y = null;
      return;
    }
  }
  
  private void a(Boolean paramBoolean)
  {
    tj localtj;
    synchronized (c)
    {
      o = paramBoolean;
      localtj = w.i();
    }
    synchronized (a)
    {
      f = paramBoolean;
      return;
      paramBoolean = finally;
      throw paramBoolean;
    }
  }
  
  private void c(String paramString)
  {
    synchronized (c)
    {
      if (!r())
      {
        loadUrl(paramString);
        return;
      }
      tp.e("The webview is destroyed. Ignoring action.");
    }
  }
  
  /* Error */
  private void d(String paramString)
  {
    // Byte code:
    //   0: invokestatic 430	com/google/android/gms/common/util/i:c	()Z
    //   3: ifeq +158 -> 161
    //   6: aload_0
    //   7: invokespecial 432	com/google/android/gms/b/vh:J	()Ljava/lang/Boolean;
    //   10: ifnonnull +47 -> 57
    //   13: aload_0
    //   14: getfield 89	com/google/android/gms/b/vh:c	Ljava/lang/Object;
    //   17: astore_2
    //   18: aload_2
    //   19: monitorenter
    //   20: aload_0
    //   21: invokestatic 349	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   24: invokevirtual 434	com/google/android/gms/b/tj:k	()Ljava/lang/Boolean;
    //   27: putfield 301	com/google/android/gms/b/vh:o	Ljava/lang/Boolean;
    //   30: aload_0
    //   31: getfield 301	com/google/android/gms/b/vh:o	Ljava/lang/Boolean;
    //   34: astore_3
    //   35: aload_3
    //   36: ifnonnull +19 -> 55
    //   39: aload_0
    //   40: ldc_w 436
    //   43: aconst_null
    //   44: invokevirtual 440	com/google/android/gms/b/vh:evaluateJavascript	(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    //   47: aload_0
    //   48: iconst_1
    //   49: invokestatic 446	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   52: invokespecial 448	com/google/android/gms/b/vh:a	(Ljava/lang/Boolean;)V
    //   55: aload_2
    //   56: monitorexit
    //   57: aload_0
    //   58: invokespecial 432	com/google/android/gms/b/vh:J	()Ljava/lang/Boolean;
    //   61: invokevirtual 451	java/lang/Boolean:booleanValue	()Z
    //   64: ifeq +57 -> 121
    //   67: aload_0
    //   68: getfield 89	com/google/android/gms/b/vh:c	Ljava/lang/Object;
    //   71: astore_2
    //   72: aload_2
    //   73: monitorenter
    //   74: aload_0
    //   75: invokevirtual 419	com/google/android/gms/b/vh:r	()Z
    //   78: ifne +29 -> 107
    //   81: aload_0
    //   82: aload_1
    //   83: aconst_null
    //   84: invokevirtual 440	com/google/android/gms/b/vh:evaluateJavascript	(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    //   87: aload_2
    //   88: monitorexit
    //   89: return
    //   90: astore_3
    //   91: aload_0
    //   92: iconst_0
    //   93: invokestatic 446	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   96: invokespecial 448	com/google/android/gms/b/vh:a	(Ljava/lang/Boolean;)V
    //   99: goto -44 -> 55
    //   102: astore_1
    //   103: aload_2
    //   104: monitorexit
    //   105: aload_1
    //   106: athrow
    //   107: ldc_w 424
    //   110: invokestatic 426	com/google/android/gms/b/tp:e	(Ljava/lang/String;)V
    //   113: goto -26 -> 87
    //   116: astore_1
    //   117: aload_2
    //   118: monitorexit
    //   119: aload_1
    //   120: athrow
    //   121: aload_1
    //   122: invokestatic 454	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   125: astore_1
    //   126: aload_1
    //   127: invokevirtual 457	java/lang/String:length	()I
    //   130: ifeq +17 -> 147
    //   133: ldc_w 459
    //   136: aload_1
    //   137: invokevirtual 463	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   140: astore_1
    //   141: aload_0
    //   142: aload_1
    //   143: invokespecial 465	com/google/android/gms/b/vh:c	(Ljava/lang/String;)V
    //   146: return
    //   147: new 312	java/lang/String
    //   150: dup
    //   151: ldc_w 459
    //   154: invokespecial 467	java/lang/String:<init>	(Ljava/lang/String;)V
    //   157: astore_1
    //   158: goto -17 -> 141
    //   161: aload_1
    //   162: invokestatic 454	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   165: astore_1
    //   166: aload_1
    //   167: invokevirtual 457	java/lang/String:length	()I
    //   170: ifeq +17 -> 187
    //   173: ldc_w 459
    //   176: aload_1
    //   177: invokevirtual 463	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   180: astore_1
    //   181: aload_0
    //   182: aload_1
    //   183: invokespecial 465	com/google/android/gms/b/vh:c	(Ljava/lang/String;)V
    //   186: return
    //   187: new 312	java/lang/String
    //   190: dup
    //   191: ldc_w 459
    //   194: invokespecial 467	java/lang/String:<init>	(Ljava/lang/String;)V
    //   197: astore_1
    //   198: goto -17 -> 181
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	201	0	this	vh
    //   0	201	1	paramString	String
    //   34	2	3	localBoolean	Boolean
    //   90	1	3	localIllegalStateException	IllegalStateException
    // Exception table:
    //   from	to	target	type
    //   39	55	90	java/lang/IllegalStateException
    //   20	35	102	finally
    //   39	55	102	finally
    //   55	57	102	finally
    //   91	99	102	finally
    //   103	105	102	finally
    //   74	87	116	finally
    //   87	89	116	finally
    //   107	113	116	finally
    //   117	119	116	finally
  }
  
  private void e(boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    if (paramBoolean) {}
    for (String str = "1";; str = "0")
    {
      localHashMap.put("isVisible", str);
      a("onAdVisibilityChanged", localHashMap);
      return;
    }
  }
  
  public final boolean A()
  {
    for (;;)
    {
      synchronized (c)
      {
        if (w > 0)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public final void B()
  {
    F.a();
  }
  
  public final void C()
  {
    if (A == null)
    {
      A = ki.a(B.b);
      B.a("native:view_load", A);
    }
  }
  
  public final View.OnClickListener D()
  {
    return (View.OnClickListener)C.get();
  }
  
  public final kz E()
  {
    synchronized (c)
    {
      kz localkz = v;
      return localkz;
    }
  }
  
  public final void F()
  {
    setBackgroundColor(0);
  }
  
  public final void H()
  {
    synchronized (c)
    {
      a = true;
      if (f != null) {
        f.H();
      }
      return;
    }
  }
  
  public final void I()
  {
    synchronized (c)
    {
      a = false;
      if (f != null) {
        f.I();
      }
      return;
    }
  }
  
  public final WebView a()
  {
    return this;
  }
  
  public final void a(int paramInt)
  {
    if (paramInt == 0) {
      ki.a(B.b, z, new String[] { "aebb2" });
    }
    K();
    if (B.b != null) {
      B.b.a("close_type", String.valueOf(paramInt));
    }
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("closetype", String.valueOf(paramInt));
    localHashMap.put("version", e.a);
    a("onhide", localHashMap);
  }
  
  public final void a(Context paramContext)
  {
    b.setBaseContext(paramContext);
    F.a = b.a;
  }
  
  public final void a(Context paramContext, il paramil, km paramkm)
  {
    synchronized (c)
    {
      F.b();
      a(paramContext);
      i = null;
      j = paramil;
      m = false;
      k = false;
      r = "";
      p = -1;
      w.g();
      tu.b(this);
      loadUrl("about:blank");
      h.i();
      setOnTouchListener(null);
      setOnClickListener(null);
      q = true;
      a = false;
      s = null;
      a(paramkm);
      t = false;
      w = 0;
      w.B();
      mr.a(this);
      O();
      return;
    }
  }
  
  public final void a(g paramg)
  {
    synchronized (c)
    {
      i = paramg;
      return;
    }
  }
  
  public final void a(hb.a parama)
  {
    synchronized (c)
    {
      t = m;
      e(m);
      return;
    }
  }
  
  public final void a(il paramil)
  {
    synchronized (c)
    {
      j = paramil;
      requestLayout();
      return;
    }
  }
  
  public final void a(kz paramkz)
  {
    synchronized (c)
    {
      v = paramkz;
      return;
    }
  }
  
  public final void a(vi paramvi)
  {
    synchronized (c)
    {
      if (s != null)
      {
        tp.c("Attempt to create multiple AdWebViewVideoControllers.");
        return;
      }
      s = paramvi;
      return;
    }
  }
  
  public final void a(String paramString)
  {
    synchronized (c)
    {
      try
      {
        super.loadUrl(paramString);
        return;
      }
      catch (Throwable paramString)
      {
        for (;;)
        {
          w.i().a(paramString, "AdWebViewImpl.loadUrlUnsafe");
          tp.c("Could not call loadUrl. ", paramString);
        }
      }
    }
  }
  
  public final void a(String paramString, md parammd)
  {
    if (h != null) {
      h.a(paramString, parammd);
    }
  }
  
  public final void a(String paramString1, String paramString2)
  {
    d(String.valueOf(paramString1).length() + 3 + String.valueOf(paramString2).length() + paramString1 + "(" + paramString2 + ");");
  }
  
  public final void a(String paramString, Map<String, ?> paramMap)
  {
    try
    {
      paramMap = w.e().a(paramMap);
      b(paramString, paramMap);
      return;
    }
    catch (JSONException paramString)
    {
      tp.e("Could not convert parameters to JSON.");
    }
  }
  
  public final void a(String paramString, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = paramJSONObject;
    if (paramJSONObject == null) {
      localJSONObject = new JSONObject();
    }
    a(paramString, localJSONObject.toString());
  }
  
  public final void a(boolean paramBoolean)
  {
    synchronized (c)
    {
      m = paramBoolean;
      L();
      return;
    }
  }
  
  public final View b()
  {
    return this;
  }
  
  public final void b(int paramInt)
  {
    synchronized (c)
    {
      p = paramInt;
      if (i != null) {
        i.a(p);
      }
      return;
    }
  }
  
  public final void b(g paramg)
  {
    synchronized (c)
    {
      D = paramg;
      return;
    }
  }
  
  public final void b(String paramString)
  {
    Object localObject = c;
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    try
    {
      r = str;
      return;
    }
    finally {}
  }
  
  public final void b(String paramString, md parammd)
  {
    if (h != null) {
      h.b(paramString, parammd);
    }
  }
  
  public final void b(String paramString, JSONObject paramJSONObject)
  {
    Object localObject = paramJSONObject;
    if (paramJSONObject == null) {
      localObject = new JSONObject();
    }
    localObject = ((JSONObject)localObject).toString();
    paramJSONObject = new StringBuilder();
    paramJSONObject.append("(window.AFMA_ReceiveMessage || function() {})('");
    paramJSONObject.append(paramString);
    paramJSONObject.append("'");
    paramJSONObject.append(",");
    paramJSONObject.append((String)localObject);
    paramJSONObject.append(");");
    paramString = String.valueOf(paramJSONObject.toString());
    if (paramString.length() != 0) {}
    for (paramString = "Dispatching AFMA event: ".concat(paramString);; paramString = new String("Dispatching AFMA event: "))
    {
      tp.b(paramString);
      d(paramJSONObject.toString());
      return;
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    synchronized (c)
    {
      if (i != null)
      {
        i.a(h.a(), paramBoolean);
        return;
      }
      k = paramBoolean;
    }
  }
  
  public final void c()
  {
    K();
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", e.a);
    a("onhide", localHashMap);
  }
  
  public final void c(boolean paramBoolean)
  {
    synchronized (c)
    {
      q = paramBoolean;
      return;
    }
  }
  
  public final void d()
  {
    if (y == null)
    {
      ki.a(B.b, z, new String[] { "aes2" });
      y = ki.a(B.b);
      B.a("native:view_show", y);
    }
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", e.a);
    a("onshow", localHashMap);
  }
  
  public final void d(boolean paramBoolean)
  {
    int i1 = 1;
    synchronized (c)
    {
      int i2 = w;
      if (paramBoolean) {}
      for (;;)
      {
        w = (i1 + i2);
        g localg;
        if ((w <= 0) && (i != null)) {
          localg = i;
        }
        synchronized (p)
        {
          r = true;
          if (q != null)
          {
            tt.a.removeCallbacks(q);
            tt.a.post(q);
          }
          return;
          i1 = -1;
        }
      }
    }
  }
  
  public final void destroy()
  {
    synchronized (c)
    {
      P();
      F.b();
      if (i != null)
      {
        i.a();
        i.k();
        i = null;
      }
      h.i();
      if (l) {
        return;
      }
      w.B();
      mr.a(this);
      O();
      l = true;
      tp.a("Initiating WebView self destruct sequence in 3...");
      h.f();
      return;
    }
  }
  
  public final void e()
  {
    HashMap localHashMap = new HashMap(3);
    w.e();
    localHashMap.put("app_muted", String.valueOf(tt.e()));
    w.e();
    localHashMap.put("app_volume", String.valueOf(tt.d()));
    w.e();
    localHashMap.put("device_volume", String.valueOf(tt.h(getContext())));
    a("volume", localHashMap);
  }
  
  @TargetApi(19)
  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    synchronized (c)
    {
      if (r())
      {
        tp.e("The webview is destroyed. Ignoring action.");
        if (paramValueCallback != null) {
          paramValueCallback.onReceiveValue(null);
        }
        return;
      }
      super.evaluateJavascript(paramString, paramValueCallback);
      return;
    }
  }
  
  public final Activity f()
  {
    return b.a;
  }
  
  /* Error */
  protected final void finalize()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 89	com/google/android/gms/b/vh:c	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 694	com/google/android/gms/b/vh:l	Z
    //   11: ifne +27 -> 38
    //   14: aload_0
    //   15: getfield 244	com/google/android/gms/b/vh:h	Lcom/google/android/gms/b/vd;
    //   18: invokevirtual 555	com/google/android/gms/b/vd:i	()V
    //   21: invokestatic 570	com/google/android/gms/ads/internal/w:B	()Lcom/google/android/gms/b/mr;
    //   24: pop
    //   25: aload_0
    //   26: invokestatic 574	com/google/android/gms/b/mr:a	(Lcom/google/android/gms/b/vc;)Z
    //   29: pop
    //   30: aload_0
    //   31: invokespecial 576	com/google/android/gms/b/vh:O	()V
    //   34: aload_0
    //   35: invokespecial 738	com/google/android/gms/b/vh:N	()V
    //   38: aload_1
    //   39: monitorexit
    //   40: aload_0
    //   41: invokespecial 740	java/lang/Object:finalize	()V
    //   44: return
    //   45: astore_2
    //   46: aload_1
    //   47: monitorexit
    //   48: aload_2
    //   49: athrow
    //   50: astore_1
    //   51: aload_0
    //   52: invokespecial 740	java/lang/Object:finalize	()V
    //   55: aload_1
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	this	vh
    //   50	6	1	localObject2	Object
    //   45	4	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   7	38	45	finally
    //   38	40	45	finally
    //   46	48	45	finally
    //   0	7	50	finally
    //   48	50	50	finally
  }
  
  public final Context g()
  {
    return b.b;
  }
  
  public final e h()
  {
    return g;
  }
  
  public final g i()
  {
    synchronized (c)
    {
      g localg = i;
      return localg;
    }
  }
  
  public final g j()
  {
    synchronized (c)
    {
      g localg = D;
      return localg;
    }
  }
  
  public final il k()
  {
    synchronized (c)
    {
      il localil = j;
      return localil;
    }
  }
  
  public final vd l()
  {
    return h;
  }
  
  public final void loadData(String paramString1, String paramString2, String paramString3)
  {
    synchronized (c)
    {
      if (!r())
      {
        super.loadData(paramString1, paramString2, paramString3);
        return;
      }
      tp.e("The webview is destroyed. Ignoring action.");
    }
  }
  
  public final void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    synchronized (c)
    {
      if (!r())
      {
        super.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
        return;
      }
      tp.e("The webview is destroyed. Ignoring action.");
    }
  }
  
  public final void loadUrl(String paramString)
  {
    for (;;)
    {
      synchronized (c)
      {
        boolean bool = r();
        if (!bool) {
          try
          {
            super.loadUrl(paramString);
            return;
          }
          catch (Throwable paramString)
          {
            w.i().a(paramString, "AdWebViewImpl.loadUrl");
            tp.c("Could not call loadUrl. ", paramString);
            continue;
          }
        }
      }
      tp.e("The webview is destroyed. Ignoring action.");
    }
  }
  
  public final boolean m()
  {
    synchronized (c)
    {
      boolean bool = k;
      return bool;
    }
  }
  
  public final dw n()
  {
    return d;
  }
  
  public final un o()
  {
    return e;
  }
  
  protected final void onAttachedToWindow()
  {
    boolean bool2 = true;
    for (;;)
    {
      synchronized (c)
      {
        super.onAttachedToWindow();
        if (!r()) {
          F.c();
        }
        boolean bool1 = t;
        if ((h != null) && (h.b()))
        {
          bool1 = bool2;
          if (!u)
          {
            Object localObject2 = h.c();
            if (localObject2 != null)
            {
              w.C();
              ux.a(this, (ViewTreeObserver.OnGlobalLayoutListener)localObject2);
            }
            localObject2 = h.d();
            if (localObject2 != null)
            {
              w.C();
              ux.a(this, (ViewTreeObserver.OnScrollChangedListener)localObject2);
            }
            u = true;
            bool1 = bool2;
          }
          e(bool1);
          return;
        }
      }
    }
  }
  
  protected final void onDetachedFromWindow()
  {
    synchronized (c)
    {
      if (!r()) {
        F.d();
      }
      super.onDetachedFromWindow();
      if ((u) && (h != null) && (h.b()) && (getViewTreeObserver() != null) && (getViewTreeObserver().isAlive()))
      {
        Object localObject2 = h.c();
        if (localObject2 != null) {
          w.g().a(getViewTreeObserver(), (ViewTreeObserver.OnGlobalLayoutListener)localObject2);
        }
        localObject2 = h.d();
        if (localObject2 != null) {
          getViewTreeObserver().removeOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener)localObject2);
        }
        u = false;
      }
      e(false);
      return;
    }
  }
  
  public final void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    try
    {
      paramString2 = new Intent("android.intent.action.VIEW");
      paramString2.setDataAndType(Uri.parse(paramString1), paramString4);
      w.e();
      tt.a(getContext(), paramString2);
      return;
    }
    catch (ActivityNotFoundException paramString2)
    {
      tp.b(String.valueOf(paramString1).length() + 51 + String.valueOf(paramString4).length() + "Couldn't find an Activity to view url/mimetype: " + paramString1 + " / " + paramString4);
    }
  }
  
  @TargetApi(21)
  protected final void onDraw(Canvas paramCanvas)
  {
    if (r()) {}
    do
    {
      do
      {
        return;
      } while ((Build.VERSION.SDK_INT == 21) && (paramCanvas.isHardwareAccelerated()) && (!isAttachedToWindow()));
      super.onDraw(paramCanvas);
    } while ((h == null) || (h.k == null));
    h.k.a();
  }
  
  public final boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    jz localjz = ke.aE;
    if (((Boolean)w.q().a(localjz)).booleanValue())
    {
      float f1 = paramMotionEvent.getAxisValue(9);
      float f2 = paramMotionEvent.getAxisValue(10);
      if (paramMotionEvent.getActionMasked() == 8) {}
      for (int i1 = 1; (i1 != 0) && (((f1 > 0.0F) && (!canScrollVertically(-1))) || ((f1 < 0.0F) && (!canScrollVertically(1))) || ((f2 > 0.0F) && (!canScrollHorizontally(-1))) || ((f2 < 0.0F) && (!canScrollHorizontally(1)))); i1 = 0) {
        return false;
      }
    }
    return super.onGenericMotionEvent(paramMotionEvent);
  }
  
  public final void onGlobalLayout()
  {
    boolean bool = G();
    g localg = i();
    if ((localg != null) && (bool) && (m))
    {
      m = false;
      localg.n();
    }
  }
  
  @SuppressLint({"DrawAllocation"})
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i3 = Integer.MAX_VALUE;
    synchronized (c)
    {
      if (r())
      {
        setMeasuredDimension(0, 0);
        return;
      }
      if ((isInEditMode()) || (m) || (j.h))
      {
        super.onMeasure(paramInt1, paramInt2);
        return;
      }
    }
    Object localObject3;
    float f1;
    int i1;
    if (j.i)
    {
      localObject3 = ke.cs;
      if ((((Boolean)w.q().a((jz)localObject3)).booleanValue()) || (!i.a()))
      {
        super.onMeasure(paramInt1, paramInt2);
        return;
      }
      a("/contentHeight", new md()
      {
        public final void a(vc arg1, Map<String, String> paramAnonymousMap)
        {
          if (paramAnonymousMap != null)
          {
            ??? = (String)paramAnonymousMap.get("height");
            if (!TextUtils.isEmpty(???)) {
              try
              {
                int i = Integer.parseInt(???);
                synchronized (vh.a(vh.this))
                {
                  if (vh.b(vh.this) != i)
                  {
                    vh.a(vh.this, i);
                    requestLayout();
                  }
                  return;
                }
                return;
              }
              catch (Exception ???)
              {
                tp.c("Exception occurred while getting webview content height", ???);
              }
            }
          }
        }
      });
      d("(function() {  var height = -1;  if (document.body) { height = document.body.offsetHeight;}  else if (document.documentElement) {      height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  window.googleAdsJsInterface.notify(url);  })();");
      f1 = b.getResources().getDisplayMetrics().density;
      i1 = View.MeasureSpec.getSize(paramInt1);
    }
    int i4;
    int i2;
    switch (x)
    {
    case -1: 
      for (paramInt1 = (int)(f1 * x);; paramInt1 = View.MeasureSpec.getSize(paramInt2))
      {
        setMeasuredDimension(i1, paramInt1);
        return;
      }
      if (j.d)
      {
        localObject3 = new DisplayMetrics();
        L.getDefaultDisplay().getMetrics((DisplayMetrics)localObject3);
        setMeasuredDimension(widthPixels, heightPixels);
        return;
      }
      int i5 = View.MeasureSpec.getMode(paramInt1);
      i1 = View.MeasureSpec.getSize(paramInt1);
      i4 = View.MeasureSpec.getMode(paramInt2);
      i2 = View.MeasureSpec.getSize(paramInt2);
      if (i5 != Integer.MIN_VALUE) {
        if (i5 != 1073741824) {
          break;
        }
      }
      break;
    }
    for (;;)
    {
      if ((j.f > paramInt1) || (j.c > paramInt2))
      {
        f1 = b.getResources().getDisplayMetrics().density;
        paramInt1 = (int)(j.f / f1);
        paramInt2 = (int)(j.c / f1);
        i1 = (int)(i1 / f1);
        i2 = (int)(i2 / f1);
        tp.e(103 + "Not enough space to show ad. Needs " + paramInt1 + "x" + paramInt2 + " dp, but only has " + i1 + "x" + i2 + " dp.");
        if (getVisibility() != 8) {
          setVisibility(4);
        }
        setMeasuredDimension(0, 0);
      }
      for (;;)
      {
        return;
        if (getVisibility() != 8) {
          setVisibility(0);
        }
        setMeasuredDimension(j.f, j.c);
      }
      paramInt1 = Integer.MAX_VALUE;
      break label517;
      break;
      paramInt1 = i1;
      label517:
      if (i4 != Integer.MIN_VALUE)
      {
        paramInt2 = i3;
        if (i4 != 1073741824) {}
      }
      else
      {
        paramInt2 = i2;
      }
    }
  }
  
  public final void onPause()
  {
    if (r()) {
      return;
    }
    try
    {
      int i1 = Build.VERSION.SDK_INT;
      super.onPause();
      return;
    }
    catch (Exception localException)
    {
      tp.b("Could not pause webview.", localException);
    }
  }
  
  public final void onResume()
  {
    if (r()) {
      return;
    }
    try
    {
      int i1 = Build.VERSION.SDK_INT;
      super.onResume();
      return;
    }
    catch (Exception localException)
    {
      tp.b("Could not resume webview.", localException);
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (h.b()) {}
    for (;;)
    {
      synchronized (c)
      {
        if (v != null) {
          v.a(paramMotionEvent);
        }
        if (!r()) {
          break;
        }
        return false;
      }
      if (d != null) {
        d.a(paramMotionEvent);
      }
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public final boolean p()
  {
    synchronized (c)
    {
      boolean bool = m;
      return bool;
    }
  }
  
  public final int q()
  {
    synchronized (c)
    {
      int i1 = p;
      return i1;
    }
  }
  
  public final boolean r()
  {
    synchronized (c)
    {
      boolean bool = l;
      return bool;
    }
  }
  
  public final void s()
  {
    synchronized (c)
    {
      tp.a("Destroying WebView!");
      N();
      tt.a.post(new Runnable()
      {
        public final void run()
        {
          vh.c(vh.this);
        }
      });
      return;
    }
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    C = new WeakReference(paramOnClickListener);
    super.setOnClickListener(paramOnClickListener);
  }
  
  public final void setWebViewClient(WebViewClient paramWebViewClient)
  {
    super.setWebViewClient(paramWebViewClient);
    if ((paramWebViewClient instanceof vd)) {
      h = ((vd)paramWebViewClient);
    }
  }
  
  public final void stopLoading()
  {
    if (r()) {
      return;
    }
    try
    {
      super.stopLoading();
      return;
    }
    catch (Exception localException)
    {
      tp.b("Could not stop loading webview.", localException);
    }
  }
  
  public final boolean t()
  {
    synchronized (c)
    {
      boolean bool = q;
      return bool;
    }
  }
  
  public final boolean u()
  {
    synchronized (c)
    {
      boolean bool = a;
      return bool;
    }
  }
  
  public final String v()
  {
    synchronized (c)
    {
      String str = r;
      return str;
    }
  }
  
  public final vb w()
  {
    return null;
  }
  
  public final kk x()
  {
    return z;
  }
  
  public final kl y()
  {
    return B;
  }
  
  public final vi z()
  {
    synchronized (c)
    {
      vi localvi = s;
      return localvi;
    }
  }
  
  @qi
  public static final class a
    extends MutableContextWrapper
  {
    Activity a;
    Context b;
    private Context c;
    
    public a(Context paramContext)
    {
      super();
      setBaseContext(paramContext);
    }
    
    public final Object getSystemService(String paramString)
    {
      return b.getSystemService(paramString);
    }
    
    public final void setBaseContext(Context paramContext)
    {
      c = paramContext.getApplicationContext();
      if ((paramContext instanceof Activity)) {}
      for (Activity localActivity = (Activity)paramContext;; localActivity = null)
      {
        a = localActivity;
        b = paramContext;
        super.setBaseContext(c);
        return;
      }
    }
    
    public final void startActivity(Intent paramIntent)
    {
      if (a != null)
      {
        a.startActivity(paramIntent);
        return;
      }
      paramIntent.setFlags(268435456);
      c.startActivity(paramIntent);
    }
  }
}


/* Location:              com/google/android/gms/b/vh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */