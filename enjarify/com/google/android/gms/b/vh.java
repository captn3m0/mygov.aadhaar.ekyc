package com.google.android.gms.b;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
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

final class vh
  extends WebView
  implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, vc
{
  private kk A;
  private kl B;
  private WeakReference C;
  private g D;
  private boolean E;
  private uj F;
  private int G;
  private int H;
  private int I;
  private int J;
  private Map K;
  private final WindowManager L;
  boolean a;
  private final vh.a b;
  private final Object c;
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
  private boolean q;
  private String r;
  private vi s;
  private boolean t;
  private boolean u;
  private kz v;
  private int w;
  private int x;
  private kk y;
  private kk z;
  
  private vh(vh.a parama, il paramil, boolean paramBoolean, dw paramdw, un paramun, km paramkm, u paramu, e parame)
  {
    super(parama);
    Object localObject2 = new java/lang/Object;
    localObject2.<init>();
    c = localObject2;
    q = bool1;
    a = false;
    r = "";
    G = i1;
    H = i1;
    I = i1;
    J = i1;
    b = parama;
    j = paramil;
    m = paramBoolean;
    p = i1;
    d = paramdw;
    e = paramun;
    f = paramu;
    g = parame;
    localObject2 = getContext();
    Object localObject3 = "window";
    localObject2 = (WindowManager)((Context)localObject2).getSystemService((String)localObject3);
    L = ((WindowManager)localObject2);
    setBackgroundColor(0);
    localObject2 = getSettings();
    ((WebSettings)localObject2).setAllowFileAccess(false);
    ((WebSettings)localObject2).setJavaScriptEnabled(bool1);
    ((WebSettings)localObject2).setSavePassword(false);
    ((WebSettings)localObject2).setSupportMultipleWindows(bool1);
    ((WebSettings)localObject2).setJavaScriptCanOpenWindowsAutomatically(bool1);
    i1 = Build.VERSION.SDK_INT;
    int i2 = 21;
    if (i1 >= i2)
    {
      i1 = 2;
      ((WebSettings)localObject2).setMixedContentMode(i1);
    }
    localObject3 = w.e();
    localObject1 = a;
    localObject3 = ((tt)localObject3).a(parama, (String)localObject1);
    ((WebSettings)localObject2).setUserAgentString((String)localObject3);
    localObject3 = w.g();
    localObject1 = getContext();
    ((tu)localObject3).a((Context)localObject1, (WebSettings)localObject2);
    setDownloadListener(this);
    L();
    boolean bool2 = i.a();
    if (bool2)
    {
      localObject2 = new com/google/android/gms/b/vj;
      ((vj)localObject2).<init>(this);
      localObject3 = "googleAdsJsInterface";
      addJavascriptInterface(localObject2, (String)localObject3);
    }
    int i3 = Build.VERSION.SDK_INT;
    removeJavascriptInterface("accessibility");
    removeJavascriptInterface("accessibilityTraversal");
    localObject2 = new com/google/android/gms/b/uj;
    localObject3 = b.a;
    ((uj)localObject2).<init>((Activity)localObject3, this, this, null);
    F = ((uj)localObject2);
    a(paramkm);
    w.g().b(parama);
  }
  
  private boolean G()
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool1 = false;
    oy localoy = null;
    Object localObject1 = h;
    boolean bool2 = ((vd)localObject1).a();
    if (!bool2)
    {
      localObject1 = h;
      bool2 = ((vd)localObject1).b();
      if (bool2) {}
    }
    Object localObject2;
    int i2;
    int i3;
    Activity localActivity;
    Object localObject3;
    int i4;
    int i5;
    label139:
    do
    {
      return bool1;
      w.e();
      localObject1 = L;
      localObject2 = tt.a((WindowManager)localObject1);
      ip.a();
      i2 = widthPixels;
      i2 = uk.b((DisplayMetrics)localObject2, i2);
      ip.a();
      i3 = heightPixels;
      i3 = uk.b((DisplayMetrics)localObject2, i3);
      localActivity = b.a;
      if (localActivity != null)
      {
        localObject3 = localActivity.getWindow();
        if (localObject3 != null) {
          break label301;
        }
      }
      i4 = i3;
      i5 = i2;
      i6 = H;
      if (i6 != i2) {
        break;
      }
      i6 = G;
      if (i6 != i3) {
        break;
      }
      i6 = I;
      if (i6 != i5) {
        break;
      }
      i6 = J;
    } while (i6 == i4);
    int i6 = H;
    if (i6 == i2)
    {
      i6 = G;
      if (i6 == i3) {
        break label353;
      }
    }
    label301:
    label353:
    for (i6 = i1;; i6 = 0)
    {
      H = i2;
      G = i3;
      I = i5;
      J = i4;
      localoy = new com/google/android/gms/b/oy;
      localoy.<init>(this);
      f1 = density;
      localObject2 = L.getDefaultDisplay();
      int i7 = ((Display)localObject2).getRotation();
      localoy.a(i2, i3, i5, i4, f1, i7);
      bool1 = i6;
      break;
      w.e();
      localObject3 = tt.a(localActivity);
      ip.a();
      i5 = localObject3[0];
      i5 = uk.b((DisplayMetrics)localObject2, i5);
      ip.a();
      i4 = localObject3[i1];
      i4 = uk.b((DisplayMetrics)localObject2, i4);
      break label139;
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
    km localkm = B.b;
    kk localkk = z;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = "aeh2";
    ki.a(localkm, localkk, arrayOfString);
  }
  
  private void L()
  {
    for (;;)
    {
      synchronized (c)
      {
        boolean bool1 = m;
        Object localObject2;
        if (!bool1)
        {
          localObject2 = j;
          bool1 = d;
          if (!bool1) {}
        }
        else
        {
          i1 = Build.VERSION.SDK_INT;
          localObject2 = "Enabling hardware acceleration on an overlay.";
          tp.b((String)localObject2);
          M();
          return;
        }
        int i1 = Build.VERSION.SDK_INT;
        int i2 = 18;
        if (i1 < i2)
        {
          localObject2 = "Disabling hardware acceleration on an AdView.";
          tp.b((String)localObject2);
          synchronized (c)
          {
            boolean bool2 = n;
            if (!bool2)
            {
              localObject2 = w.g();
              ((tu)localObject2).c(this);
            }
            bool2 = true;
            n = bool2;
          }
        }
      }
      String str = "Enabling hardware acceleration on an AdView.";
      tp.b(str);
      M();
    }
  }
  
  private void M()
  {
    synchronized (c)
    {
      boolean bool = n;
      if (bool)
      {
        localtu = w.g();
        localtu.b(this);
      }
      bool = false;
      tu localtu = null;
      n = false;
      return;
    }
  }
  
  private void N()
  {
    synchronized (c)
    {
      boolean bool = E;
      if (!bool)
      {
        bool = true;
        E = bool;
        Object localObject2 = w.i();
        localObject2 = i;
        ((AtomicInteger)localObject2).decrementAndGet();
      }
      return;
    }
  }
  
  private void O()
  {
    Object localObject1 = c;
    Object localObject2 = null;
    try
    {
      K = null;
      return;
    }
    finally {}
  }
  
  private void P()
  {
    Object localObject = B;
    if (localObject == null) {}
    for (;;)
    {
      return;
      localObject = B.b;
      if (localObject != null)
      {
        kg localkg = w.i().e();
        if (localkg != null)
        {
          localkg = w.i().e();
          localkg.a((km)localObject);
        }
      }
    }
  }
  
  static vh a(Context paramContext, il paramil, boolean paramBoolean, dw paramdw, un paramun, km paramkm, u paramu, e parame)
  {
    vh.a locala = new com/google/android/gms/b/vh$a;
    locala.<init>(paramContext);
    vh localvh = new com/google/android/gms/b/vh;
    localvh.<init>(locala, paramil, paramBoolean, paramdw, paramun, paramkm, paramu, parame);
    return localvh;
  }
  
  private void a(km paramkm)
  {
    P();
    Object localObject1 = new com/google/android/gms/b/kl;
    ??? = new com/google/android/gms/b/km;
    boolean bool = true;
    String str1 = "make_wv";
    String str2 = j.a;
    ((km)???).<init>(bool, str1, str2);
    ((kl)localObject1).<init>((km)???);
    B = ((kl)localObject1);
    localObject1 = B.b;
    synchronized (b)
    {
      e = paramkm;
      localObject1 = ki.a(B.b);
      z = ((kk)localObject1);
      localObject1 = B;
      kk localkk = z;
      ((kl)localObject1).a("native:view_create", localkk);
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
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  private void c(String paramString)
  {
    synchronized (c)
    {
      boolean bool = r();
      if (!bool)
      {
        loadUrl(paramString);
        return;
      }
      String str = "The webview is destroyed. Ignoring action.";
      tp.e(str);
    }
  }
  
  /* Error */
  private void d(String paramString)
  {
    // Byte code:
    //   0: invokestatic 415	com/google/android/gms/common/util/i:c	()Z
    //   3: istore_2
    //   4: iload_2
    //   5: ifeq +208 -> 213
    //   8: aload_0
    //   9: invokespecial 418	com/google/android/gms/b/vh:J	()Ljava/lang/Boolean;
    //   12: astore_3
    //   13: aload_3
    //   14: ifnonnull +63 -> 77
    //   17: aload_0
    //   18: getfield 80	com/google/android/gms/b/vh:c	Ljava/lang/Object;
    //   21: astore 4
    //   23: aload 4
    //   25: monitorenter
    //   26: invokestatic 342	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   29: astore_3
    //   30: aload_3
    //   31: invokevirtual 420	com/google/android/gms/b/tj:k	()Ljava/lang/Boolean;
    //   34: astore_3
    //   35: aload_0
    //   36: aload_3
    //   37: putfield 294	com/google/android/gms/b/vh:o	Ljava/lang/Boolean;
    //   40: aload_0
    //   41: getfield 294	com/google/android/gms/b/vh:o	Ljava/lang/Boolean;
    //   44: astore_3
    //   45: aload_3
    //   46: ifnonnull +28 -> 74
    //   49: ldc_w 422
    //   52: astore_3
    //   53: iconst_0
    //   54: istore 5
    //   56: aload_0
    //   57: aload_3
    //   58: aconst_null
    //   59: invokevirtual 426	com/google/android/gms/b/vh:evaluateJavascript	(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    //   62: iconst_1
    //   63: istore_2
    //   64: iload_2
    //   65: invokestatic 432	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   68: astore_3
    //   69: aload_0
    //   70: aload_3
    //   71: invokespecial 435	com/google/android/gms/b/vh:a	(Ljava/lang/Boolean;)V
    //   74: aload 4
    //   76: monitorexit
    //   77: aload_0
    //   78: invokespecial 418	com/google/android/gms/b/vh:J	()Ljava/lang/Boolean;
    //   81: astore_3
    //   82: aload_3
    //   83: invokevirtual 438	java/lang/Boolean:booleanValue	()Z
    //   86: istore_2
    //   87: iload_2
    //   88: ifeq +76 -> 164
    //   91: aload_0
    //   92: getfield 80	com/google/android/gms/b/vh:c	Ljava/lang/Object;
    //   95: astore 4
    //   97: aload 4
    //   99: monitorenter
    //   100: aload_0
    //   101: invokevirtual 406	com/google/android/gms/b/vh:r	()Z
    //   104: istore_2
    //   105: iload_2
    //   106: ifne +41 -> 147
    //   109: iconst_0
    //   110: istore_2
    //   111: aconst_null
    //   112: astore_3
    //   113: aload_0
    //   114: aload_1
    //   115: aconst_null
    //   116: invokevirtual 426	com/google/android/gms/b/vh:evaluateJavascript	(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    //   119: aload 4
    //   121: monitorexit
    //   122: return
    //   123: astore_3
    //   124: iconst_0
    //   125: istore_2
    //   126: aconst_null
    //   127: astore_3
    //   128: iconst_0
    //   129: invokestatic 432	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   132: astore_3
    //   133: aload_0
    //   134: aload_3
    //   135: invokespecial 435	com/google/android/gms/b/vh:a	(Ljava/lang/Boolean;)V
    //   138: goto -64 -> 74
    //   141: astore_3
    //   142: aload 4
    //   144: monitorexit
    //   145: aload_3
    //   146: athrow
    //   147: ldc_w 411
    //   150: astore_3
    //   151: aload_3
    //   152: invokestatic 413	com/google/android/gms/b/tp:e	(Ljava/lang/String;)V
    //   155: goto -36 -> 119
    //   158: astore_3
    //   159: aload 4
    //   161: monitorexit
    //   162: aload_3
    //   163: athrow
    //   164: ldc_w 440
    //   167: astore 4
    //   169: aload_1
    //   170: invokestatic 443	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   173: astore_3
    //   174: aload_3
    //   175: invokevirtual 446	java/lang/String:length	()I
    //   178: istore 5
    //   180: iload 5
    //   182: ifeq +18 -> 200
    //   185: aload 4
    //   187: aload_3
    //   188: invokevirtual 450	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   191: astore_3
    //   192: aload_0
    //   193: aload_3
    //   194: invokespecial 452	com/google/android/gms/b/vh:c	(Ljava/lang/String;)V
    //   197: goto -75 -> 122
    //   200: new 305	java/lang/String
    //   203: astore_3
    //   204: aload_3
    //   205: aload 4
    //   207: invokespecial 454	java/lang/String:<init>	(Ljava/lang/String;)V
    //   210: goto -18 -> 192
    //   213: ldc_w 440
    //   216: astore 4
    //   218: aload_1
    //   219: invokestatic 443	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   222: astore_3
    //   223: aload_3
    //   224: invokevirtual 446	java/lang/String:length	()I
    //   227: istore 5
    //   229: iload 5
    //   231: ifeq +18 -> 249
    //   234: aload 4
    //   236: aload_3
    //   237: invokevirtual 450	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   240: astore_3
    //   241: aload_0
    //   242: aload_3
    //   243: invokespecial 452	com/google/android/gms/b/vh:c	(Ljava/lang/String;)V
    //   246: goto -124 -> 122
    //   249: new 305	java/lang/String
    //   252: astore_3
    //   253: aload_3
    //   254: aload 4
    //   256: invokespecial 454	java/lang/String:<init>	(Ljava/lang/String;)V
    //   259: goto -18 -> 241
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	262	0	this	vh
    //   0	262	1	paramString	String
    //   3	123	2	bool	boolean
    //   12	101	3	localObject1	Object
    //   123	1	3	localIllegalStateException	IllegalStateException
    //   127	8	3	localBoolean	Boolean
    //   141	5	3	localObject2	Object
    //   150	2	3	str1	String
    //   158	5	3	localObject3	Object
    //   173	81	3	str2	String
    //   54	176	5	i1	int
    // Exception table:
    //   from	to	target	type
    //   58	62	123	java/lang/IllegalStateException
    //   64	68	123	java/lang/IllegalStateException
    //   70	74	123	java/lang/IllegalStateException
    //   26	29	141	finally
    //   30	34	141	finally
    //   36	40	141	finally
    //   40	44	141	finally
    //   58	62	141	finally
    //   64	68	141	finally
    //   70	74	141	finally
    //   74	77	141	finally
    //   128	132	141	finally
    //   134	138	141	finally
    //   142	145	141	finally
    //   100	104	158	finally
    //   115	119	158	finally
    //   119	122	158	finally
    //   151	155	158	finally
    //   159	162	158	finally
  }
  
  private void e(boolean paramBoolean)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    String str1 = "isVisible";
    if (paramBoolean) {}
    for (String str2 = "1";; str2 = "0")
    {
      localHashMap.put(str1, str2);
      a("onAdVisibilityChanged", localHashMap);
      return;
    }
  }
  
  public final boolean A()
  {
    synchronized (c)
    {
      int i1 = w;
      if (i1 > 0)
      {
        i1 = 1;
        return i1;
      }
      int i2 = 0;
      Object localObject2 = null;
    }
  }
  
  public final void B()
  {
    F.a();
  }
  
  public final void C()
  {
    Object localObject = A;
    if (localObject == null)
    {
      localObject = ki.a(B.b);
      A = ((kk)localObject);
      localObject = B;
      String str = "native:view_load";
      kk localkk = A;
      ((kl)localObject).a(str, localkk);
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
    Object localObject1 = c;
    boolean bool = true;
    try
    {
      a = bool;
      u localu = f;
      if (localu != null)
      {
        localu = f;
        localu.H();
      }
      return;
    }
    finally {}
  }
  
  public final void I()
  {
    Object localObject1 = c;
    u localu = null;
    try
    {
      a = false;
      localu = f;
      if (localu != null)
      {
        localu = f;
        localu.I();
      }
      return;
    }
    finally {}
  }
  
  public final WebView a()
  {
    return this;
  }
  
  public final void a(int paramInt)
  {
    Object localObject2;
    if (paramInt == 0)
    {
      localObject1 = B.b;
      localObject2 = z;
      int i1 = 1;
      localObject3 = new String[i1];
      String str = "aebb2";
      localObject3[0] = str;
      ki.a((km)localObject1, (kk)localObject2, (String[])localObject3);
    }
    K();
    Object localObject1 = B.b;
    if (localObject1 != null)
    {
      localObject1 = B.b;
      localObject2 = "close_type";
      localObject3 = String.valueOf(paramInt);
      ((km)localObject1).a((String)localObject2, (String)localObject3);
    }
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>(2);
    Object localObject3 = String.valueOf(paramInt);
    ((HashMap)localObject1).put("closetype", localObject3);
    localObject3 = e.a;
    ((HashMap)localObject1).put("version", localObject3);
    a("onhide", (Map)localObject1);
  }
  
  public final void a(Context paramContext)
  {
    b.setBaseContext(paramContext);
    uj localuj = F;
    Activity localActivity = b.a;
    a = localActivity;
  }
  
  public final void a(Context paramContext, il paramil, km paramkm)
  {
    synchronized (c)
    {
      Object localObject2 = F;
      ((uj)localObject2).b();
      a(paramContext);
      int i1 = 0;
      localObject2 = null;
      i = null;
      j = paramil;
      i1 = 0;
      localObject2 = null;
      m = false;
      i1 = 0;
      localObject2 = null;
      k = false;
      localObject2 = "";
      r = ((String)localObject2);
      i1 = -1;
      p = i1;
      w.g();
      tu.b(this);
      localObject2 = "about:blank";
      loadUrl((String)localObject2);
      localObject2 = h;
      ((vd)localObject2).i();
      i1 = 0;
      localObject2 = null;
      setOnTouchListener(null);
      i1 = 0;
      localObject2 = null;
      setOnClickListener(null);
      i1 = 1;
      q = i1;
      i1 = 0;
      localObject2 = null;
      a = false;
      i1 = 0;
      localObject2 = null;
      s = null;
      a(paramkm);
      i1 = 0;
      localObject2 = null;
      t = false;
      i1 = 0;
      localObject2 = null;
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
      boolean bool = m;
      t = bool;
      bool = m;
      e(bool);
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
      Object localObject2 = s;
      if (localObject2 != null)
      {
        localObject2 = "Attempt to create multiple AdWebViewVideoControllers.";
        tp.c((String)localObject2);
        return;
      }
      s = paramvi;
    }
  }
  
  /* Error */
  public final void a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 80	com/google/android/gms/b/vh:c	Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_0
    //   8: aload_1
    //   9: invokespecial 574	android/webkit/WebView:loadUrl	(Ljava/lang/String;)V
    //   12: aload_2
    //   13: monitorexit
    //   14: return
    //   15: astore_3
    //   16: invokestatic 342	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   19: astore 4
    //   21: ldc_w 576
    //   24: astore 5
    //   26: aload 4
    //   28: aload_3
    //   29: aload 5
    //   31: invokevirtual 579	com/google/android/gms/b/tj:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   34: ldc_w 581
    //   37: astore 4
    //   39: aload 4
    //   41: aload_3
    //   42: invokestatic 584	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   45: goto -33 -> 12
    //   48: astore_3
    //   49: aload_2
    //   50: monitorexit
    //   51: aload_3
    //   52: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	this	vh
    //   0	53	1	paramString	String
    //   4	46	2	localObject1	Object
    //   15	27	3	localThrowable	Throwable
    //   48	4	3	localObject2	Object
    //   19	21	4	localObject3	Object
    //   24	6	5	str	String
    // Exception table:
    //   from	to	target	type
    //   8	12	15	finally
    //   12	14	48	finally
    //   16	19	48	finally
    //   29	34	48	finally
    //   41	45	48	finally
    //   49	51	48	finally
  }
  
  public final void a(String paramString, md parammd)
  {
    vd localvd = h;
    if (localvd != null)
    {
      localvd = h;
      localvd.a(paramString, parammd);
    }
  }
  
  public final void a(String paramString1, String paramString2)
  {
    int i1 = String.valueOf(paramString1).length() + 3;
    int i2 = String.valueOf(paramString2).length();
    i1 += i2;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(i1);
    String str = paramString1 + "(" + paramString2 + ");";
    d(str);
  }
  
  public final void a(String paramString, Map paramMap)
  {
    try
    {
      Object localObject = w.e();
      localObject = ((tt)localObject).a(paramMap);
      b(paramString, (JSONObject)localObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        String str = "Could not convert parameters to JSON.";
        tp.e(str);
      }
    }
  }
  
  public final void a(String paramString, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
    {
      paramJSONObject = new org/json/JSONObject;
      paramJSONObject.<init>();
    }
    String str = paramJSONObject.toString();
    a(paramString, str);
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
      g localg = i;
      if (localg != null)
      {
        localg = i;
        int i1 = p;
        localg.a(i1);
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
    Object localObject1 = c;
    if (paramString == null) {
      paramString = "";
    }
    try
    {
      r = paramString;
      return;
    }
    finally {}
  }
  
  public final void b(String paramString, md parammd)
  {
    vd localvd = h;
    if (localvd != null)
    {
      localvd = h;
      localvd.b(paramString, parammd);
    }
  }
  
  public final void b(String paramString, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
    {
      paramJSONObject = new org/json/JSONObject;
      paramJSONObject.<init>();
    }
    String str1 = paramJSONObject.toString();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("(window.AFMA_ReceiveMessage || function() {})('");
    localStringBuilder.append(paramString);
    localStringBuilder.append("'");
    localStringBuilder.append(",");
    localStringBuilder.append(str1);
    localStringBuilder.append(");");
    String str2 = "Dispatching AFMA event: ";
    str1 = String.valueOf(localStringBuilder.toString());
    int i1 = str1.length();
    if (i1 != 0) {
      str1 = str2.concat(str1);
    }
    for (;;)
    {
      tp.b(str1);
      str1 = localStringBuilder.toString();
      d(str1);
      return;
      str1 = new java/lang/String;
      str1.<init>(str2);
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    synchronized (c)
    {
      g localg = i;
      if (localg != null)
      {
        localg = i;
        vd localvd = h;
        boolean bool = localvd.a();
        localg.a(bool, paramBoolean);
        return;
      }
      k = paramBoolean;
    }
  }
  
  public final void c()
  {
    K();
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>(1);
    String str = e.a;
    localHashMap.put("version", str);
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
    int i1 = 1;
    Object localObject1 = y;
    if (localObject1 == null)
    {
      localObject1 = B.b;
      Object localObject2 = z;
      localObject3 = new String[i1];
      String str = "aes2";
      localObject3[0] = str;
      ki.a((km)localObject1, (kk)localObject2, (String[])localObject3);
      localObject1 = ki.a(B.b);
      y = ((kk)localObject1);
      localObject1 = B;
      localObject2 = "native:view_show";
      localObject3 = y;
      ((kl)localObject1).a((String)localObject2, (kk)localObject3);
    }
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>(i1);
    Object localObject3 = e.a;
    ((HashMap)localObject1).put("version", localObject3);
    a("onshow", (Map)localObject1);
  }
  
  public final void d(boolean paramBoolean)
  {
    int i1 = 1;
    Object localObject5;
    synchronized (c)
    {
      int i2 = w;
      Object localObject2;
      boolean bool;
      if (paramBoolean)
      {
        i1 += i2;
        w = i1;
        i1 = w;
        if (i1 <= 0)
        {
          localObject2 = i;
          if (localObject2 != null)
          {
            localObject2 = i;
            localObject5 = p;
            bool = true;
          }
        }
      }
      try
      {
        r = bool;
        Object localObject6 = q;
        if (localObject6 != null)
        {
          localObject6 = tt.a;
          Runnable localRunnable = q;
          ((Handler)localObject6).removeCallbacks(localRunnable);
          localObject6 = tt.a;
          localObject2 = q;
          ((Handler)localObject6).post((Runnable)localObject2);
        }
        return;
      }
      finally {}
      i1 = -1;
    }
  }
  
  public final void destroy()
  {
    synchronized (c)
    {
      P();
      Object localObject2 = F;
      ((uj)localObject2).b();
      localObject2 = i;
      if (localObject2 != null)
      {
        localObject2 = i;
        ((g)localObject2).a();
        localObject2 = i;
        ((g)localObject2).k();
        bool = false;
        localObject2 = null;
        i = null;
      }
      localObject2 = h;
      ((vd)localObject2).i();
      boolean bool = l;
      if (bool) {
        return;
      }
      w.B();
      mr.a(this);
      O();
      bool = true;
      l = bool;
      localObject2 = "Initiating WebView self destruct sequence in 3...";
      tp.a((String)localObject2);
      localObject2 = h;
      ((vd)localObject2).f();
    }
  }
  
  public final void e()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>(3);
    w.e();
    String str = String.valueOf(tt.e());
    localHashMap.put("app_muted", str);
    w.e();
    str = String.valueOf(tt.d());
    localHashMap.put("app_volume", str);
    w.e();
    str = String.valueOf(tt.h(getContext()));
    localHashMap.put("device_volume", str);
    a("volume", localHashMap);
  }
  
  public final void evaluateJavascript(String paramString, ValueCallback paramValueCallback)
  {
    synchronized (c)
    {
      boolean bool = r();
      if (bool)
      {
        String str = "The webview is destroyed. Ignoring action.";
        tp.e(str);
        if (paramValueCallback != null)
        {
          bool = false;
          str = null;
          paramValueCallback.onReceiveValue(null);
        }
        return;
      }
      super.evaluateJavascript(paramString, paramValueCallback);
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
    //   1: getfield 80	com/google/android/gms/b/vh:c	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 670	com/google/android/gms/b/vh:l	Z
    //   11: istore_2
    //   12: iload_2
    //   13: ifne +29 -> 42
    //   16: aload_0
    //   17: getfield 238	com/google/android/gms/b/vh:h	Lcom/google/android/gms/b/vd;
    //   20: astore_3
    //   21: aload_3
    //   22: invokevirtual 540	com/google/android/gms/b/vd:i	()V
    //   25: invokestatic 555	com/google/android/gms/ads/internal/w:B	()Lcom/google/android/gms/b/mr;
    //   28: pop
    //   29: aload_0
    //   30: invokestatic 559	com/google/android/gms/b/mr:a	(Lcom/google/android/gms/b/vc;)Z
    //   33: pop
    //   34: aload_0
    //   35: invokespecial 562	com/google/android/gms/b/vh:O	()V
    //   38: aload_0
    //   39: invokespecial 709	com/google/android/gms/b/vh:N	()V
    //   42: aload_1
    //   43: monitorexit
    //   44: aload_0
    //   45: invokespecial 712	java/lang/Object:finalize	()V
    //   48: return
    //   49: astore_3
    //   50: aload_1
    //   51: monitorexit
    //   52: aload_3
    //   53: athrow
    //   54: astore_3
    //   55: aload_0
    //   56: invokespecial 712	java/lang/Object:finalize	()V
    //   59: aload_3
    //   60: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	this	vh
    //   11	2	2	bool	boolean
    //   20	2	3	localvd	vd
    //   49	4	3	localObject2	Object
    //   54	6	3	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   7	11	49	finally
    //   16	20	49	finally
    //   21	25	49	finally
    //   25	29	49	finally
    //   29	34	49	finally
    //   34	38	49	finally
    //   38	42	49	finally
    //   42	44	49	finally
    //   50	52	49	finally
    //   0	4	54	finally
    //   5	7	54	finally
    //   52	54	54	finally
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
      boolean bool = r();
      if (!bool)
      {
        super.loadData(paramString1, paramString2, paramString3);
        return;
      }
      String str = "The webview is destroyed. Ignoring action.";
      tp.e(str);
    }
  }
  
  public final void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    synchronized (c)
    {
      boolean bool = r();
      if (!bool)
      {
        super.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
        return;
      }
      String str = "The webview is destroyed. Ignoring action.";
      tp.e(str);
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
          finally
          {
            localThrowable = finally;
            Object localObject3 = w.i();
            String str2 = "AdWebViewImpl.loadUrl";
            ((tj)localObject3).a(localThrowable, str2);
            localObject3 = "Could not call loadUrl. ";
            tp.c((String)localObject3, localThrowable);
            continue;
          }
        }
      }
      String str1 = "The webview is destroyed. Ignoring action.";
      tp.e(str1);
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
    boolean bool2;
    for (boolean bool1 = true;; bool1 = bool2) {
      synchronized (c)
      {
        super.onAttachedToWindow();
        bool2 = r();
        Object localObject2;
        if (!bool2)
        {
          localObject2 = F;
          ((uj)localObject2).c();
        }
        bool2 = t;
        vd localvd = h;
        if (localvd != null)
        {
          localvd = h;
          boolean bool3 = localvd.b();
          if (bool3)
          {
            bool2 = u;
            if (!bool2)
            {
              localObject2 = h;
              localObject2 = ((vd)localObject2).c();
              if (localObject2 != null)
              {
                w.C();
                ux.a(this, (ViewTreeObserver.OnGlobalLayoutListener)localObject2);
              }
              localObject2 = h;
              localObject2 = ((vd)localObject2).d();
              if (localObject2 != null)
              {
                w.C();
                ux.a(this, (ViewTreeObserver.OnScrollChangedListener)localObject2);
              }
              bool2 = true;
              u = bool2;
            }
            e(bool1);
            return;
          }
        }
      }
    }
  }
  
  protected final void onDetachedFromWindow()
  {
    synchronized (c)
    {
      boolean bool = r();
      Object localObject2;
      if (!bool)
      {
        localObject2 = F;
        ((uj)localObject2).d();
      }
      super.onDetachedFromWindow();
      bool = u;
      if (bool)
      {
        localObject2 = h;
        if (localObject2 != null)
        {
          localObject2 = h;
          bool = ((vd)localObject2).b();
          if (bool)
          {
            localObject2 = getViewTreeObserver();
            if (localObject2 != null)
            {
              localObject2 = getViewTreeObserver();
              bool = ((ViewTreeObserver)localObject2).isAlive();
              if (bool)
              {
                localObject2 = h;
                localObject2 = ((vd)localObject2).c();
                Object localObject4;
                if (localObject2 != null)
                {
                  localObject4 = w.g();
                  ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
                  ((tu)localObject4).a(localViewTreeObserver, (ViewTreeObserver.OnGlobalLayoutListener)localObject2);
                }
                localObject2 = h;
                localObject2 = ((vd)localObject2).d();
                if (localObject2 != null)
                {
                  localObject4 = getViewTreeObserver();
                  ((ViewTreeObserver)localObject4).removeOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener)localObject2);
                }
                bool = false;
                localObject2 = null;
                u = false;
              }
            }
          }
        }
      }
      e(false);
      return;
    }
  }
  
  public final void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    try
    {
      Intent localIntent = new android/content/Intent;
      localObject2 = "android.intent.action.VIEW";
      localIntent.<init>((String)localObject2);
      localObject2 = Uri.parse(paramString1);
      localIntent.setDataAndType((Uri)localObject2, paramString4);
      w.e();
      localObject2 = getContext();
      tt.a((Context)localObject2, localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      for (;;)
      {
        int i1 = String.valueOf(paramString1).length() + 51;
        int i2 = String.valueOf(paramString4).length();
        i1 += i2;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>(i1);
        Object localObject1 = ((StringBuilder)localObject2).append("Couldn't find an Activity to view url/mimetype: ").append(paramString1);
        localObject2 = " / ";
        localObject1 = (String)localObject2 + paramString4;
        tp.b((String)localObject1);
      }
    }
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    boolean bool1 = r();
    if (bool1) {}
    for (;;)
    {
      return;
      int i1 = Build.VERSION.SDK_INT;
      int i2 = 21;
      if (i1 == i2)
      {
        boolean bool2 = paramCanvas.isHardwareAccelerated();
        if (bool2)
        {
          bool2 = isAttachedToWindow();
          if (!bool2) {
            continue;
          }
        }
      }
      super.onDraw(paramCanvas);
      Object localObject = h;
      if (localObject != null)
      {
        localObject = h.k;
        if (localObject != null)
        {
          localObject = h.k;
          ((vd.e)localObject).a();
        }
      }
    }
  }
  
  public final boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    int i1 = -1;
    int i2 = 1;
    Object localObject = ke.aE;
    kd localkd = w.q();
    localObject = (Boolean)localkd.a((jz)localObject);
    boolean bool1 = ((Boolean)localObject).booleanValue();
    boolean bool2;
    if (bool1)
    {
      float f1 = paramMotionEvent.getAxisValue(9);
      float f2 = paramMotionEvent.getAxisValue(10);
      int i3 = paramMotionEvent.getActionMasked();
      int i4 = 8;
      if (i3 == i4)
      {
        i3 = i2;
        if (i3 == 0) {
          break label189;
        }
        bool2 = f1 < 0.0F;
        if (bool2)
        {
          bool2 = canScrollVertically(i1);
          if (!bool2) {}
        }
        else
        {
          bool2 = f1 < 0.0F;
          if (bool2)
          {
            bool2 = canScrollVertically(i2);
            if (!bool2) {}
          }
          else
          {
            bool2 = f2 < 0.0F;
            if (bool2)
            {
              bool2 = canScrollHorizontally(i1);
              if (!bool2) {}
            }
            else
            {
              bool2 = f2 < 0.0F;
              if (!bool2) {
                break label189;
              }
              bool2 = canScrollHorizontally(i2);
              if (bool2) {
                break label189;
              }
            }
          }
        }
        bool2 = false;
        localObject = null;
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localObject = null;
      break;
      label189:
      bool2 = super.onGenericMotionEvent(paramMotionEvent);
    }
  }
  
  public final void onGlobalLayout()
  {
    boolean bool = G();
    g localg = i();
    if ((localg != null) && (bool))
    {
      bool = m;
      if (bool)
      {
        bool = false;
        m = false;
        localg.n();
      }
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = -1 >>> 1;
    float f1 = 0.0F / 0.0F;
    int i3 = 1073741824;
    int i4 = 8;
    int i5 = -1 << -1;
    Object localObject5;
    label127:
    Object localObject4;
    float f2;
    int i2;
    for (;;)
    {
      synchronized (c)
      {
        bool2 = r();
        if (bool2)
        {
          i1 = 0;
          f1 = 0.0F;
          Object localObject2 = null;
          bool2 = false;
          localObject5 = null;
          setMeasuredDimension(0, 0);
          return;
        }
        bool2 = isInEditMode();
        if (!bool2)
        {
          bool2 = m;
          if (!bool2)
          {
            localObject5 = j;
            bool2 = h;
            if (!bool2) {
              break label127;
            }
          }
        }
        super.onMeasure(paramInt1, paramInt2);
      }
      localObject5 = j;
      boolean bool2 = i;
      if (bool2)
      {
        localObject4 = ke.cs;
        localObject5 = w.q();
        localObject4 = ((kd)localObject5).a((jz)localObject4);
        localObject4 = (Boolean)localObject4;
        boolean bool1 = ((Boolean)localObject4).booleanValue();
        if (!bool1)
        {
          bool1 = i.a();
          if (bool1) {}
        }
        else
        {
          super.onMeasure(paramInt1, paramInt2);
          continue;
        }
        localObject4 = "/contentHeight";
        localObject5 = new com/google/android/gms/b/vh$1;
        ((vh.1)localObject5).<init>(this);
        a((String)localObject4, (md)localObject5);
        localObject4 = "(function() {  var height = -1;  if (document.body) { height = document.body.offsetHeight;}  else if (document.documentElement) {      height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  window.googleAdsJsInterface.notify(url);  })();";
        d((String)localObject4);
        localObject4 = b;
        localObject4 = ((vh.a)localObject4).getResources();
        localObject4 = ((Resources)localObject4).getDisplayMetrics();
        f1 = density;
        int i6 = View.MeasureSpec.getSize(paramInt1);
        i8 = x;
        switch (i8)
        {
        default: 
          i8 = x;
          f2 = i8;
          f1 *= f2;
        }
        for (i2 = (int)f1;; i2 = View.MeasureSpec.getSize(paramInt2))
        {
          setMeasuredDimension(i6, i2);
          break;
        }
      }
      else
      {
        localObject5 = j;
        boolean bool3 = d;
        if (!bool3) {
          break;
        }
        localObject4 = new android/util/DisplayMetrics;
        ((DisplayMetrics)localObject4).<init>();
        localObject5 = L;
        localObject5 = ((WindowManager)localObject5).getDefaultDisplay();
        ((Display)localObject5).getMetrics((DisplayMetrics)localObject4);
        i7 = widthPixels;
        i2 = heightPixels;
        setMeasuredDimension(i7, i2);
      }
    }
    int i8 = View.MeasureSpec.getMode(paramInt1);
    int i9 = View.MeasureSpec.getSize(paramInt1);
    int i10 = View.MeasureSpec.getMode(paramInt2);
    int i7 = View.MeasureSpec.getSize(paramInt2);
    if ((i8 == i5) || (i8 == i3)) {
      i8 = i9;
    }
    for (;;)
    {
      if ((i10 == i5) || (i10 == i3)) {
        i2 = i7;
      }
      il localil = j;
      i10 = f;
      Object localObject6;
      if (i10 <= i8)
      {
        localObject6 = j;
        i8 = c;
        if (i8 <= i2) {}
      }
      else
      {
        localObject4 = b;
        localObject4 = ((vh.a)localObject4).getResources();
        localObject4 = ((Resources)localObject4).getDisplayMetrics();
        f1 = density;
        localObject6 = j;
        f2 = f / f1;
        i8 = (int)f2;
        localil = j;
        float f3 = c / f1;
        i10 = (int)f3;
        float f4 = i9 / f1;
        i9 = (int)f4;
        f1 = i7 / f1;
        i2 = (int)f1;
        i7 = 103;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(i7);
        localObject5 = "Not enough space to show ad. Needs ";
        localObject5 = localStringBuilder.append((String)localObject5);
        localObject5 = ((StringBuilder)localObject5).append(i8);
        localObject6 = "x";
        localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
        localObject5 = ((StringBuilder)localObject5).append(i10);
        localObject6 = " dp, but only has ";
        localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
        localObject5 = ((StringBuilder)localObject5).append(i9);
        localObject6 = "x";
        localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
        localObject4 = ((StringBuilder)localObject5).append(i2);
        localObject5 = " dp.";
        localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
        localObject4 = ((StringBuilder)localObject4).toString();
        tp.e((String)localObject4);
        i2 = getVisibility();
        if (i2 != i4)
        {
          i2 = 4;
          f1 = 5.6E-45F;
          setVisibility(i2);
        }
        i2 = 0;
        f1 = 0.0F;
        localObject4 = null;
        i7 = 0;
        localObject5 = null;
        setMeasuredDimension(0, 0);
      }
      for (;;)
      {
        break;
        i2 = getVisibility();
        if (i2 != i4)
        {
          i2 = 0;
          f1 = 0.0F;
          localObject4 = null;
          setVisibility(0);
        }
        localObject4 = j;
        i2 = f;
        localObject5 = j;
        i7 = c;
        setMeasuredDimension(i2, i7);
      }
      i8 = i2;
      f2 = f1;
    }
  }
  
  public final void onPause()
  {
    boolean bool = r();
    if (bool) {}
    for (;;)
    {
      return;
      try
      {
        int i1 = Build.VERSION.SDK_INT;
        super.onPause();
      }
      catch (Exception localException)
      {
        String str = "Could not pause webview.";
        tp.b(str, localException);
      }
    }
  }
  
  public final void onResume()
  {
    boolean bool = r();
    if (bool) {}
    for (;;)
    {
      return;
      try
      {
        int i1 = Build.VERSION.SDK_INT;
        super.onResume();
      }
      catch (Exception localException)
      {
        String str = "Could not resume webview.";
        tp.b(str, localException);
      }
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    Object localObject1 = h;
    boolean bool = ((vd)localObject1).b();
    if (bool) {}
    for (;;)
    {
      synchronized (c)
      {
        localObject1 = v;
        if (localObject1 != null)
        {
          localObject1 = v;
          ((kz)localObject1).a(paramMotionEvent);
        }
        bool = r();
        if (!bool) {
          break label90;
        }
        bool = false;
        localObject1 = null;
        return bool;
      }
      dw localdw = d;
      if (localdw != null)
      {
        localdw = d;
        localdw.a(paramMotionEvent);
        continue;
        label90:
        bool = super.onTouchEvent(paramMotionEvent);
      }
    }
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
    Object localObject1 = c;
    Object localObject2 = "Destroying WebView!";
    try
    {
      tp.a((String)localObject2);
      N();
      localObject2 = tt.a;
      vh.2 local2 = new com/google/android/gms/b/vh$2;
      local2.<init>(this);
      ((Handler)localObject2).post(local2);
      return;
    }
    finally {}
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramOnClickListener);
    C = localWeakReference;
    super.setOnClickListener(paramOnClickListener);
  }
  
  public final void setWebViewClient(WebViewClient paramWebViewClient)
  {
    super.setWebViewClient(paramWebViewClient);
    boolean bool = paramWebViewClient instanceof vd;
    if (bool)
    {
      paramWebViewClient = (vd)paramWebViewClient;
      h = paramWebViewClient;
    }
  }
  
  public final void stopLoading()
  {
    boolean bool = r();
    if (bool) {}
    for (;;)
    {
      return;
      try
      {
        super.stopLoading();
      }
      catch (Exception localException)
      {
        String str = "Could not stop loading webview.";
        tp.b(str, localException);
      }
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
}


/* Location:              com/google/android/gms/b/vh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */