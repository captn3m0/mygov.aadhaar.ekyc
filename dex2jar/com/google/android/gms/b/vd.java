package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.PopupWindow;
import com.google.android.gms.ads.internal.f;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.e;
import com.google.android.gms.ads.internal.overlay.g;
import com.google.android.gms.ads.internal.overlay.g.b;
import com.google.android.gms.ads.internal.overlay.h;
import com.google.android.gms.ads.internal.overlay.j;
import com.google.android.gms.ads.internal.overlay.s;
import com.google.android.gms.ads.internal.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

@qi
public class vd
  extends WebViewClient
{
  private static final String[] o = { "UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS" };
  private static final String[] p = { "NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID" };
  private final ox A;
  private oz B;
  private boolean C;
  private boolean D;
  protected vc a;
  final Object b = new Object();
  public a c;
  b d;
  public c e;
  boolean f = false;
  boolean g;
  boolean h;
  public f i;
  ot j;
  public e k;
  protected sx l;
  boolean m;
  int n;
  private final HashMap<String, List<md>> q = new HashMap();
  private ib r;
  private j s;
  private ly t;
  private mf u;
  private mh v;
  private boolean w;
  private ViewTreeObserver.OnGlobalLayoutListener x;
  private ViewTreeObserver.OnScrollChangedListener y;
  private s z;
  
  public vd(vc paramvc, boolean paramBoolean)
  {
    this(paramvc, paramBoolean, new ox(paramvc, paramvc.g(), new jv(paramvc.getContext())));
  }
  
  private vd(vc paramvc, boolean paramBoolean, ox paramox)
  {
    a = paramvc;
    g = paramBoolean;
    A = paramox;
    j = null;
  }
  
  private void a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    Object localObject = ke.bs;
    if (!((Boolean)w.q().a((jz)localObject)).booleanValue()) {
      return;
    }
    localObject = new Bundle();
    ((Bundle)localObject).putString("err", paramString1);
    ((Bundle)localObject).putString("code", paramString2);
    if (!TextUtils.isEmpty(paramString3))
    {
      paramString1 = Uri.parse(paramString3);
      if (paramString1.getHost() == null) {}
    }
    for (paramString1 = paramString1.getHost();; paramString1 = "")
    {
      ((Bundle)localObject).putString("host", paramString1);
      w.e();
      tt.a(paramContext, a.o().a, "gmob-apps", (Bundle)localObject, true);
      return;
    }
  }
  
  private void a(Uri paramUri)
  {
    String str1 = paramUri.getPath();
    List localList = (List)q.get(str1);
    if (localList != null)
    {
      w.e();
      Map localMap = tt.a(paramUri);
      if (tp.a(2))
      {
        paramUri = String.valueOf(str1);
        if (paramUri.length() != 0) {}
        for (paramUri = "Received GMSG: ".concat(paramUri);; paramUri = new String("Received GMSG: "))
        {
          tp.a(paramUri);
          paramUri = localMap.keySet().iterator();
          while (paramUri.hasNext())
          {
            str1 = (String)paramUri.next();
            String str2 = (String)localMap.get(str1);
            tp.a(String.valueOf(str1).length() + 4 + String.valueOf(str2).length() + "  " + str1 + ": " + str2);
          }
        }
      }
      paramUri = localList.iterator();
      while (paramUri.hasNext()) {
        ((md)paramUri.next()).a(a, localMap);
      }
    }
    paramUri = String.valueOf(paramUri);
    tp.a(String.valueOf(paramUri).length() + 32 + "No GMSG handler found for GMSG: " + paramUri);
  }
  
  private void a(AdOverlayInfoParcel paramAdOverlayInfoParcel)
  {
    boolean bool2 = false;
    if (j != null) {}
    for (boolean bool1 = j.b();; bool1 = false)
    {
      w.c();
      Context localContext = a.getContext();
      if (!bool1) {
        bool2 = true;
      }
      h.a(localContext, paramAdOverlayInfoParcel, bool2);
      if ((l != null) && (l == null) && (a != null)) {
        paramAdOverlayInfoParcel = a.b;
      }
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    A.a(paramInt1, paramInt2);
    if (j != null)
    {
      ot localot = j;
      synchronized (j)
      {
        d = paramInt1;
        e = paramInt2;
        if ((q != null) && (paramBoolean))
        {
          int[] arrayOfInt = localot.a();
          if (arrayOfInt != null)
          {
            PopupWindow localPopupWindow = q;
            ip.a();
            paramInt1 = uk.a(l, arrayOfInt[0]);
            ip.a();
            localPopupWindow.update(paramInt1, uk.a(l, arrayOfInt[1]), q.getWidth(), q.getHeight());
            localot.a(arrayOfInt[0], arrayOfInt[1]);
          }
        }
        else
        {
          return;
        }
        localot.a(true);
      }
    }
  }
  
  public final void a(ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    synchronized (b)
    {
      w = true;
      a.B();
      x = paramOnGlobalLayoutListener;
      y = paramOnScrollChangedListener;
      return;
    }
  }
  
  public final void a(e parame)
  {
    j localj = null;
    boolean bool = a.p();
    ib localib;
    if ((bool) && (!a.k().d))
    {
      localib = null;
      if (!bool) {
        break label75;
      }
    }
    for (;;)
    {
      a(new AdOverlayInfoParcel(parame, localib, localj, z, a.o()));
      return;
      localib = r;
      break;
      label75:
      localj = s;
    }
  }
  
  public final void a(ib paramib, j paramj, ly paramly, s params, boolean paramBoolean, mf parammf, mh parammh, f paramf, oz paramoz, sx paramsx)
  {
    f localf = paramf;
    if (paramf == null) {
      localf = new f(a.getContext());
    }
    j = new ot(a, paramoz);
    l = paramsx;
    a("/appEvent", new lx(paramly));
    a("/backButton", mc.l);
    a("/refresh", mc.m);
    a("/canOpenURLs", mc.b);
    a("/canOpenIntents", mc.c);
    a("/click", mc.d);
    a("/close", mc.e);
    a("/customClose", mc.g);
    a("/instrument", mc.r);
    a("/delayPageLoaded", mc.t);
    a("/delayPageClosed", mc.u);
    a("/getLocationInfo", mc.v);
    a("/httpTrack", mc.h);
    a("/log", mc.i);
    a("/mraid", new mk(localf, j));
    a("/mraidLoaded", A);
    a("/open", new ml(parammf, localf, j));
    a("/precache", mc.q);
    a("/touch", mc.k);
    a("/video", mc.n);
    a("/videoMeta", mc.o);
    a("/appStreaming", mc.f);
    if (w.D().a()) {
      a("/logScionEvent", mc.p);
    }
    if (parammh != null) {
      a("/setInterstitialProperties", new mg(parammh));
    }
    r = paramib;
    s = paramj;
    t = paramly;
    u = parammf;
    z = params;
    i = localf;
    B = paramoz;
    v = parammh;
    f = paramBoolean;
  }
  
  public final void a(vc paramvc)
  {
    a = paramvc;
  }
  
  public final void a(String paramString, md parammd)
  {
    synchronized (b)
    {
      List localList = (List)q.get(paramString);
      Object localObject1 = localList;
      if (localList == null)
      {
        localObject1 = new CopyOnWriteArrayList();
        q.put(paramString, localObject1);
      }
      ((List)localObject1).add(parammd);
      return;
    }
  }
  
  public final void a(boolean paramBoolean, int paramInt)
  {
    if ((a.p()) && (!a.k().d)) {}
    for (ib localib = null;; localib = r)
    {
      a(new AdOverlayInfoParcel(localib, s, z, a, paramBoolean, paramInt, a.o()));
      return;
    }
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString)
  {
    Object localObject = null;
    boolean bool = a.p();
    ib localib;
    if ((bool) && (!a.k().d))
    {
      localib = null;
      if (!bool) {
        break label95;
      }
    }
    for (;;)
    {
      a(new AdOverlayInfoParcel(localib, (j)localObject, t, z, a, paramBoolean, paramInt, paramString, a.o(), u));
      return;
      localib = r;
      break;
      label95:
      localObject = new d(a, s);
    }
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    boolean bool = a.p();
    ib localib;
    if ((bool) && (!a.k().d))
    {
      localib = null;
      if (!bool) {
        break label97;
      }
    }
    label97:
    for (Object localObject = null;; localObject = new d(a, s))
    {
      a(new AdOverlayInfoParcel(localib, (j)localObject, t, z, a, paramBoolean, paramInt, paramString1, paramString2, a.o(), u));
      return;
      localib = r;
      break;
    }
  }
  
  public final boolean a()
  {
    synchronized (b)
    {
      boolean bool = g;
      return bool;
    }
  }
  
  public final void b(String paramString, md parammd)
  {
    synchronized (b)
    {
      paramString = (List)q.get(paramString);
      if (paramString == null) {
        return;
      }
      paramString.remove(parammd);
      return;
    }
  }
  
  public final boolean b()
  {
    synchronized (b)
    {
      boolean bool = w;
      return bool;
    }
  }
  
  public final ViewTreeObserver.OnGlobalLayoutListener c()
  {
    synchronized (b)
    {
      ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener = x;
      return localOnGlobalLayoutListener;
    }
  }
  
  public final ViewTreeObserver.OnScrollChangedListener d()
  {
    synchronized (b)
    {
      ViewTreeObserver.OnScrollChangedListener localOnScrollChangedListener = y;
      return localOnScrollChangedListener;
    }
  }
  
  public final boolean e()
  {
    synchronized (b)
    {
      boolean bool = h;
      return bool;
    }
  }
  
  public final void f()
  {
    synchronized (b)
    {
      tp.a("Loading blank page in WebView, 2...");
      C = true;
      a.a("about:blank");
      return;
    }
  }
  
  public final void g()
  {
    if (l != null) {
      tt.a.post(new Runnable()
      {
        public final void run()
        {
          if (l != null)
          {
            Object localObject = l;
            localObject = a;
          }
        }
      });
    }
  }
  
  public final void h()
  {
    a locala;
    vc localvc;
    if ((c != null) && (((D) && (n <= 0)) || (m)))
    {
      locala = c;
      localvc = a;
      if (m) {
        break label70;
      }
    }
    label70:
    for (boolean bool = true;; bool = false)
    {
      locala.a(localvc, bool);
      c = null;
      a.C();
      return;
    }
  }
  
  public final void i()
  {
    if (l != null) {
      l = null;
    }
    synchronized (b)
    {
      q.clear();
      r = null;
      s = null;
      c = null;
      d = null;
      t = null;
      f = false;
      g = false;
      w = false;
      h = false;
      u = null;
      z = null;
      e = null;
      if (j != null)
      {
        j.a(true);
        j = null;
      }
      return;
    }
  }
  
  public final void onLoadResource(WebView paramWebView, String paramString)
  {
    paramWebView = String.valueOf(paramString);
    if (paramWebView.length() != 0) {}
    for (paramWebView = "Loading resource: ".concat(paramWebView);; paramWebView = new String("Loading resource: "))
    {
      tp.a(paramWebView);
      paramWebView = Uri.parse(paramString);
      if (("gmsg".equalsIgnoreCase(paramWebView.getScheme())) && ("mobileads.google.com".equalsIgnoreCase(paramWebView.getHost()))) {
        a(paramWebView);
      }
      return;
    }
  }
  
  public final void onPageFinished(WebView arg1, String paramString)
  {
    synchronized (b)
    {
      if (C)
      {
        tp.a("Blank page loaded, 1...");
        a.s();
        return;
      }
      D = true;
      if (d != null)
      {
        d.a();
        d = null;
      }
      h();
      return;
    }
  }
  
  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    if ((paramInt < 0) && (-paramInt - 1 < o.length)) {}
    for (String str = o[(-paramInt - 1)];; str = String.valueOf(paramInt))
    {
      a(a.getContext(), "http_err", str, paramString2);
      super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
      return;
    }
  }
  
  public final void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    int i1;
    if (paramSslError != null)
    {
      i1 = paramSslError.getPrimaryError();
      if ((i1 < 0) || (i1 >= p.length)) {
        break label65;
      }
    }
    label65:
    for (String str = p[i1];; str = String.valueOf(i1))
    {
      a(a.getContext(), "ssl_err", str, w.g().a(paramSslError));
      super.onReceivedSslError(paramWebView, paramSslErrorHandler, paramSslError);
      return;
    }
  }
  
  @TargetApi(11)
  public WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    try
    {
      paramWebView = hw.a(paramString);
      if (paramWebView == null) {
        return null;
      }
      paramWebView = w.j().a(paramWebView);
      if ((paramWebView != null) && (paramWebView.a()))
      {
        paramWebView = new WebResourceResponse("", "", paramWebView.b());
        return paramWebView;
      }
    }
    catch (Throwable paramWebView)
    {
      w.i().a(paramWebView, "AdWebViewClient.shouldInterceptRequest");
    }
    return null;
  }
  
  public boolean shouldOverrideKeyEvent(WebView paramWebView, KeyEvent paramKeyEvent)
  {
    switch (paramKeyEvent.getKeyCode())
    {
    default: 
      return false;
    }
    return true;
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    Object localObject1 = String.valueOf(paramString);
    if (((String)localObject1).length() != 0)
    {
      localObject1 = "AdWebView shouldOverrideUrlLoading: ".concat((String)localObject1);
      tp.a((String)localObject1);
      localObject1 = Uri.parse(paramString);
      if ((!"gmsg".equalsIgnoreCase(((Uri)localObject1).getScheme())) || (!"mobileads.google.com".equalsIgnoreCase(((Uri)localObject1).getHost()))) {
        break label86;
      }
      a((Uri)localObject1);
    }
    label86:
    label343:
    for (;;)
    {
      return true;
      localObject1 = new String("AdWebView shouldOverrideUrlLoading: ");
      break;
      Object localObject2;
      if ((f) && (paramWebView == a.a()))
      {
        localObject2 = ((Uri)localObject1).getScheme();
        if (("http".equalsIgnoreCase((String)localObject2)) || ("https".equalsIgnoreCase((String)localObject2))) {}
        for (int i1 = 1; i1 != 0; i1 = 0)
        {
          if (r != null)
          {
            localObject1 = ke.aq;
            if (((Boolean)w.q().a((jz)localObject1)).booleanValue())
            {
              r.e();
              r = null;
            }
          }
          return super.shouldOverrideUrlLoading(paramWebView, paramString);
        }
      }
      if (a.a().willNotDraw()) {
        break label368;
      }
      try
      {
        localObject2 = a.n();
        paramWebView = (WebView)localObject1;
        if (localObject2 != null)
        {
          paramWebView = (WebView)localObject1;
          if (((dw)localObject2).b((Uri)localObject1)) {
            paramWebView = ((dw)localObject2).a((Uri)localObject1, a.getContext(), a.b());
          }
        }
      }
      catch (dx paramWebView)
      {
        paramWebView = String.valueOf(paramString);
        if (paramWebView.length() == 0) {
          break label343;
        }
        for (paramWebView = "Unable to append parameter to URL: ".concat(paramWebView);; paramWebView = new String("Unable to append parameter to URL: "))
        {
          tp.e(paramWebView);
          paramWebView = (WebView)localObject1;
          break;
        }
        i.a(paramString);
      }
      if ((i == null) || (i.a())) {
        a(new e("android.intent.action.VIEW", paramWebView.toString(), null, null, null, null, null));
      }
    }
    label368:
    paramWebView = String.valueOf(paramString);
    if (paramWebView.length() != 0) {}
    for (paramWebView = "AdWebView unable to handle URL: ".concat(paramWebView);; paramWebView = new String("AdWebView unable to handle URL: "))
    {
      tp.e(paramWebView);
      break;
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(vc paramvc, boolean paramBoolean);
  }
  
  public static abstract interface b
  {
    public abstract void a();
  }
  
  public static abstract interface c
  {
    public abstract void a();
  }
  
  private static final class d
    implements j
  {
    private vc a;
    private j b;
    
    public d(vc paramvc, j paramj)
    {
      a = paramvc;
      b = paramj;
    }
    
    public final void a()
    {
      b.a();
      a.c();
    }
    
    public final void b() {}
    
    public final void c() {}
    
    public final void d()
    {
      b.d();
      a.d();
    }
  }
  
  public static abstract interface e
  {
    public abstract void a();
  }
}


/* Location:              com/google/android/gms/b/vd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */