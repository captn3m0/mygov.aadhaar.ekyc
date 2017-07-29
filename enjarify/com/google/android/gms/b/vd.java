package com.google.android.gms.b;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
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
import com.google.android.gms.ads.internal.overlay.h;
import com.google.android.gms.ads.internal.overlay.j;
import com.google.android.gms.ads.internal.overlay.s;
import com.google.android.gms.ads.internal.w;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class vd
  extends WebViewClient
{
  private static final String[] o;
  private static final String[] p;
  private final ox A;
  private oz B;
  private boolean C;
  private boolean D;
  protected vc a;
  final Object b;
  public vd.a c;
  vd.b d;
  public vd.c e;
  boolean f;
  boolean g;
  boolean h;
  public f i;
  ot j;
  public vd.e k;
  protected sx l;
  boolean m;
  int n;
  private final HashMap q;
  private ib r;
  private j s;
  private ly t;
  private mf u;
  private mh v;
  private boolean w;
  private ViewTreeObserver.OnGlobalLayoutListener x;
  private ViewTreeObserver.OnScrollChangedListener y;
  private s z;
  
  static
  {
    int i1 = 4;
    int i2 = 3;
    int i3 = 2;
    int i4 = 1;
    String[] arrayOfString = new String[15];
    arrayOfString[0] = "UNKNOWN";
    arrayOfString[i4] = "HOST_LOOKUP";
    arrayOfString[i3] = "UNSUPPORTED_AUTH_SCHEME";
    arrayOfString[i2] = "AUTHENTICATION";
    arrayOfString[i1] = "PROXY_AUTHENTICATION";
    arrayOfString[5] = "CONNECT";
    arrayOfString[6] = "IO";
    arrayOfString[7] = "TIMEOUT";
    arrayOfString[8] = "REDIRECT_LOOP";
    arrayOfString[9] = "UNSUPPORTED_SCHEME";
    arrayOfString[10] = "FAILED_SSL_HANDSHAKE";
    arrayOfString[11] = "BAD_URL";
    arrayOfString[12] = "FILE";
    arrayOfString[13] = "FILE_NOT_FOUND";
    arrayOfString[14] = "TOO_MANY_REQUESTS";
    o = arrayOfString;
    arrayOfString = new String[6];
    arrayOfString[0] = "NOT_YET_VALID";
    arrayOfString[i4] = "EXPIRED";
    arrayOfString[i3] = "ID_MISMATCH";
    arrayOfString[i2] = "UNTRUSTED";
    arrayOfString[i1] = "DATE_INVALID";
    arrayOfString[5] = "INVALID";
    p = arrayOfString;
  }
  
  public vd(vc paramvc, boolean paramBoolean)
  {
    this(paramvc, paramBoolean, localox);
  }
  
  private vd(vc paramvc, boolean paramBoolean, ox paramox)
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    q = ((HashMap)localObject);
    localObject = new java/lang/Object;
    localObject.<init>();
    b = localObject;
    f = false;
    a = paramvc;
    g = paramBoolean;
    A = paramox;
    j = null;
  }
  
  private void a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    Object localObject1 = ke.bs;
    Object localObject2 = w.q();
    localObject1 = (Boolean)((kd)localObject2).a((jz)localObject1);
    boolean bool1 = ((Boolean)localObject1).booleanValue();
    if (!bool1) {
      return;
    }
    localObject2 = new android/os/Bundle;
    ((Bundle)localObject2).<init>();
    ((Bundle)localObject2).putString("err", paramString1);
    localObject1 = "code";
    ((Bundle)localObject2).putString((String)localObject1, paramString2);
    String str1 = "host";
    bool1 = TextUtils.isEmpty(paramString3);
    if (!bool1)
    {
      localObject1 = Uri.parse(paramString3);
      String str2 = ((Uri)localObject1).getHost();
      if (str2 == null) {}
    }
    for (localObject1 = ((Uri)localObject1).getHost();; localObject1 = "")
    {
      ((Bundle)localObject2).putString(str1, (String)localObject1);
      w.e();
      localObject1 = a.o().a;
      str1 = "gmob-apps";
      boolean bool2 = true;
      tt.a(paramContext, (String)localObject1, str1, (Bundle)localObject2, bool2);
      break;
    }
  }
  
  private void a(Uri paramUri)
  {
    Object localObject1 = paramUri.getPath();
    Object localObject2 = (List)q.get(localObject1);
    if (localObject2 != null)
    {
      w.e();
      Map localMap = tt.a(paramUri);
      boolean bool1 = tp.a(2);
      if (bool1)
      {
        localObject3 = "Received GMSG: ";
        localObject1 = String.valueOf(localObject1);
        int i1 = ((String)localObject1).length();
        if (i1 != 0) {
          localObject1 = ((String)localObject3).concat((String)localObject1);
        }
        for (;;)
        {
          tp.a((String)localObject1);
          localObject1 = localMap.keySet();
          Iterator localIterator = ((Set)localObject1).iterator();
          for (;;)
          {
            boolean bool2 = localIterator.hasNext();
            if (!bool2) {
              break;
            }
            localObject1 = (String)localIterator.next();
            localObject3 = (String)localMap.get(localObject1);
            int i3 = String.valueOf(localObject1).length() + 4;
            int i4 = String.valueOf(localObject3).length();
            i3 += i4;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>(i3);
            localObject1 = localStringBuilder.append("  ").append((String)localObject1);
            String str = ": ";
            localObject1 = str + (String)localObject3;
            tp.a((String)localObject1);
          }
          localObject1 = new java/lang/String;
          ((String)localObject1).<init>((String)localObject3);
        }
      }
      localObject1 = ((List)localObject2).iterator();
      for (;;)
      {
        boolean bool3 = ((Iterator)localObject1).hasNext();
        if (!bool3) {
          break;
        }
        localObject2 = (md)((Iterator)localObject1).next();
        localObject3 = a;
        ((md)localObject2).a((vc)localObject3, localMap);
      }
    }
    localObject2 = String.valueOf(paramUri);
    int i2 = String.valueOf(localObject2).length() + 32;
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>(i2);
    localObject1 = ((StringBuilder)localObject3).append("No GMSG handler found for GMSG: ");
    localObject2 = (String)localObject2;
    tp.a((String)localObject2);
  }
  
  private void a(AdOverlayInfoParcel paramAdOverlayInfoParcel)
  {
    boolean bool1 = false;
    Object localObject = j;
    boolean bool2;
    if (localObject != null)
    {
      localObject = j;
      bool2 = ((ot)localObject).b();
    }
    for (;;)
    {
      w.c();
      Context localContext = a.getContext();
      if (!bool2) {
        bool1 = true;
      }
      h.a(localContext, paramAdOverlayInfoParcel, bool1);
      localObject = l;
      if (localObject != null)
      {
        localObject = l;
        if (localObject == null)
        {
          localObject = a;
          if (localObject != null) {
            localObject = a.b;
          }
        }
      }
      return;
      bool2 = false;
      localObject = null;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    A.a(paramInt1, paramInt2);
    ot localot = j;
    if (localot != null) {
      localot = j;
    }
    synchronized (j)
    {
      d = paramInt1;
      e = paramInt2;
      Object localObject3 = q;
      if ((localObject3 != null) && (paramBoolean))
      {
        localObject3 = localot.a();
        if (localObject3 != null)
        {
          PopupWindow localPopupWindow1 = q;
          ip.a();
          Activity localActivity1 = l;
          int i1 = 0;
          Activity localActivity2 = null;
          i1 = localObject3[0];
          int i2 = uk.a(localActivity1, i1);
          ip.a();
          localActivity2 = l;
          int i3 = 1;
          i3 = localObject3[i3];
          i1 = uk.a(localActivity2, i3);
          PopupWindow localPopupWindow2 = q;
          i3 = localPopupWindow2.getWidth();
          PopupWindow localPopupWindow3 = q;
          int i4 = localPopupWindow3.getHeight();
          localPopupWindow1.update(i2, i1, i3, i4);
          int i5 = 0;
          localPopupWindow1 = null;
          i5 = localObject3[0];
          i2 = 1;
          i6 = localObject3[i2];
          localot.a(i5, i6);
        }
      }
      else
      {
        return;
      }
      int i6 = 1;
      localot.a(i6);
    }
  }
  
  public final void a(ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    Object localObject1 = b;
    boolean bool = true;
    try
    {
      w = bool;
      vc localvc = a;
      localvc.B();
      x = paramOnGlobalLayoutListener;
      y = paramOnScrollChangedListener;
      return;
    }
    finally {}
  }
  
  public final void a(e parame)
  {
    j localj = null;
    boolean bool1 = a.p();
    AdOverlayInfoParcel localAdOverlayInfoParcel = new com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;
    Object localObject;
    if (bool1)
    {
      localObject = a.k();
      boolean bool2 = d;
      if (!bool2)
      {
        bool2 = false;
        localObject = null;
        if (!bool1) {
          break label100;
        }
      }
    }
    for (;;)
    {
      s locals = z;
      un localun = a.o();
      localAdOverlayInfoParcel.<init>(parame, (ib)localObject, localj, locals, localun);
      a(localAdOverlayInfoParcel);
      return;
      localObject = r;
      break;
      label100:
      localj = s;
    }
  }
  
  public final void a(ib paramib, j paramj, ly paramly, s params, boolean paramBoolean, mf parammf, mh parammh, f paramf, oz paramoz, sx paramsx)
  {
    if (paramf == null)
    {
      paramf = new com/google/android/gms/ads/internal/f;
      localObject1 = a.getContext();
      paramf.<init>((Context)localObject1);
    }
    Object localObject1 = new com/google/android/gms/b/ot;
    Object localObject2 = a;
    ((ot)localObject1).<init>((vc)localObject2, paramoz);
    j = ((ot)localObject1);
    l = paramsx;
    localObject2 = new com/google/android/gms/b/lx;
    ((lx)localObject2).<init>(paramly);
    a("/appEvent", (md)localObject2);
    localObject2 = mc.l;
    a("/backButton", (md)localObject2);
    localObject2 = mc.m;
    a("/refresh", (md)localObject2);
    localObject2 = mc.b;
    a("/canOpenURLs", (md)localObject2);
    localObject2 = mc.c;
    a("/canOpenIntents", (md)localObject2);
    localObject2 = mc.d;
    a("/click", (md)localObject2);
    localObject2 = mc.e;
    a("/close", (md)localObject2);
    localObject2 = mc.g;
    a("/customClose", (md)localObject2);
    localObject2 = mc.r;
    a("/instrument", (md)localObject2);
    localObject2 = mc.t;
    a("/delayPageLoaded", (md)localObject2);
    localObject2 = mc.u;
    a("/delayPageClosed", (md)localObject2);
    localObject2 = mc.v;
    a("/getLocationInfo", (md)localObject2);
    localObject2 = mc.h;
    a("/httpTrack", (md)localObject2);
    localObject2 = mc.i;
    a("/log", (md)localObject2);
    localObject2 = new com/google/android/gms/b/mk;
    ot localot = j;
    ((mk)localObject2).<init>(paramf, localot);
    a("/mraid", (md)localObject2);
    localObject2 = A;
    a("/mraidLoaded", (md)localObject2);
    localObject2 = new com/google/android/gms/b/ml;
    localot = j;
    ((ml)localObject2).<init>(parammf, paramf, localot);
    a("/open", (md)localObject2);
    localObject2 = mc.q;
    a("/precache", (md)localObject2);
    localObject2 = mc.k;
    a("/touch", (md)localObject2);
    localObject2 = mc.n;
    a("/video", (md)localObject2);
    localObject2 = mc.o;
    a("/videoMeta", (md)localObject2);
    localObject2 = mc.f;
    a("/appStreaming", (md)localObject2);
    localObject1 = w.D();
    boolean bool = ((ta)localObject1).a();
    if (bool)
    {
      localObject1 = "/logScionEvent";
      localObject2 = mc.p;
      a((String)localObject1, (md)localObject2);
    }
    if (parammh != null)
    {
      localObject1 = "/setInterstitialProperties";
      localObject2 = new com/google/android/gms/b/mg;
      ((mg)localObject2).<init>(parammh);
      a((String)localObject1, (md)localObject2);
    }
    r = paramib;
    s = paramj;
    t = paramly;
    u = parammf;
    z = params;
    i = paramf;
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
      Object localObject2 = q;
      localObject2 = ((HashMap)localObject2).get(paramString);
      localObject2 = (List)localObject2;
      if (localObject2 == null)
      {
        localObject2 = new java/util/concurrent/CopyOnWriteArrayList;
        ((CopyOnWriteArrayList)localObject2).<init>();
        HashMap localHashMap = q;
        localHashMap.put(paramString, localObject2);
      }
      ((List)localObject2).add(parammd);
      return;
    }
  }
  
  public final void a(boolean paramBoolean, int paramInt)
  {
    boolean bool = a.p();
    AdOverlayInfoParcel localAdOverlayInfoParcel = new com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;
    if (bool)
    {
      localObject = a.k();
      bool = d;
      if (!bool) {
        bool = false;
      }
    }
    for (Object localObject = null;; localObject = r)
    {
      j localj = s;
      s locals = z;
      vc localvc = a;
      un localun = a.o();
      localAdOverlayInfoParcel.<init>((ib)localObject, localj, locals, localvc, paramBoolean, paramInt, localun);
      a(localAdOverlayInfoParcel);
      return;
    }
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString)
  {
    Object localObject1 = null;
    boolean bool1 = a.p();
    AdOverlayInfoParcel localAdOverlayInfoParcel = new com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;
    Object localObject2;
    if (bool1)
    {
      localObject2 = a.k();
      boolean bool2 = d;
      if (!bool2)
      {
        bool2 = false;
        localObject2 = null;
        if (!bool1) {
          break label131;
        }
      }
    }
    for (;;)
    {
      Object localObject3 = t;
      Object localObject4 = z;
      vc localvc = a;
      un localun = a.o();
      mf localmf = u;
      localAdOverlayInfoParcel.<init>((ib)localObject2, (j)localObject1, (ly)localObject3, (s)localObject4, localvc, paramBoolean, paramInt, paramString, localun, localmf);
      a(localAdOverlayInfoParcel);
      return;
      localObject2 = r;
      break;
      label131:
      localObject1 = new com/google/android/gms/b/vd$d;
      localObject3 = a;
      localObject4 = s;
      ((vd.d)localObject1).<init>((vc)localObject3, (j)localObject4);
    }
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    boolean bool1 = a.p();
    AdOverlayInfoParcel localAdOverlayInfoParcel = new com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;
    Object localObject1;
    Object localObject2;
    if (bool1)
    {
      localObject1 = a.k();
      boolean bool2 = d;
      if (!bool2)
      {
        bool2 = false;
        localObject1 = null;
        if (!bool1) {
          break label136;
        }
        bool1 = false;
        localObject2 = null;
      }
    }
    for (;;)
    {
      Object localObject3 = t;
      Object localObject4 = z;
      vc localvc = a;
      un localun = a.o();
      mf localmf = u;
      localAdOverlayInfoParcel.<init>((ib)localObject1, (j)localObject2, (ly)localObject3, (s)localObject4, localvc, paramBoolean, paramInt, paramString1, paramString2, localun, localmf);
      a(localAdOverlayInfoParcel);
      return;
      localObject1 = r;
      break;
      label136:
      localObject2 = new com/google/android/gms/b/vd$d;
      localObject3 = a;
      localObject4 = s;
      ((vd.d)localObject2).<init>((vc)localObject3, (j)localObject4);
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
      Object localObject2 = q;
      localObject2 = ((HashMap)localObject2).get(paramString);
      localObject2 = (List)localObject2;
      if (localObject2 == null) {
        return;
      }
      ((List)localObject2).remove(parammd);
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
    Object localObject1 = b;
    Object localObject2 = "Loading blank page in WebView, 2...";
    try
    {
      tp.a((String)localObject2);
      boolean bool = true;
      C = bool;
      localObject2 = a;
      String str = "about:blank";
      ((vc)localObject2).a(str);
      return;
    }
    finally {}
  }
  
  public final void g()
  {
    Object localObject = l;
    if (localObject != null)
    {
      localObject = tt.a;
      vd.1 local1 = new com/google/android/gms/b/vd$1;
      local1.<init>(this);
      ((Handler)localObject).post(local1);
    }
  }
  
  public final void h()
  {
    vd.a locala1 = c;
    boolean bool2;
    vd.a locala2;
    vc localvc;
    if (locala1 != null)
    {
      boolean bool1 = D;
      if (bool1)
      {
        int i1 = n;
        if (i1 <= 0) {}
      }
      else
      {
        bool2 = m;
        if (!bool2) {
          break label76;
        }
      }
      locala2 = c;
      localvc = a;
      bool2 = m;
      if (bool2) {
        break label86;
      }
      bool2 = true;
    }
    for (;;)
    {
      locala2.a(localvc, bool2);
      bool2 = false;
      locala1 = null;
      c = null;
      label76:
      a.C();
      return;
      label86:
      bool2 = false;
      locala1 = null;
    }
  }
  
  public final void i()
  {
    ??? = null;
    Object localObject2 = l;
    if (localObject2 != null) {
      l = null;
    }
    synchronized (b)
    {
      localObject2 = q;
      ((HashMap)localObject2).clear();
      localObject2 = null;
      r = null;
      localObject2 = null;
      s = null;
      localObject2 = null;
      c = null;
      localObject2 = null;
      d = null;
      localObject2 = null;
      t = null;
      localObject2 = null;
      f = false;
      localObject2 = null;
      g = false;
      localObject2 = null;
      w = false;
      localObject2 = null;
      h = false;
      localObject2 = null;
      u = null;
      localObject2 = null;
      z = null;
      localObject2 = null;
      e = null;
      localObject2 = j;
      if (localObject2 != null)
      {
        localObject2 = j;
        boolean bool = true;
        ((ot)localObject2).a(bool);
        localObject2 = null;
        j = null;
      }
      return;
    }
  }
  
  public final void onLoadResource(WebView paramWebView, String paramString)
  {
    String str1 = "Loading resource: ";
    Object localObject = String.valueOf(paramString);
    int i1 = ((String)localObject).length();
    if (i1 != 0) {
      localObject = str1.concat((String)localObject);
    }
    for (;;)
    {
      tp.a((String)localObject);
      localObject = Uri.parse(paramString);
      str1 = "gmsg";
      String str2 = ((Uri)localObject).getScheme();
      boolean bool = str1.equalsIgnoreCase(str2);
      if (bool)
      {
        str1 = "mobileads.google.com";
        str2 = ((Uri)localObject).getHost();
        bool = str1.equalsIgnoreCase(str2);
        if (bool) {
          a((Uri)localObject);
        }
      }
      return;
      localObject = new java/lang/String;
      ((String)localObject).<init>(str1);
    }
  }
  
  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    synchronized (b)
    {
      boolean bool = C;
      if (bool)
      {
        localObject2 = "Blank page loaded, 1...";
        tp.a((String)localObject2);
        localObject2 = a;
        ((vc)localObject2).s();
        return;
      }
      bool = true;
      D = bool;
      Object localObject2 = d;
      if (localObject2 != null)
      {
        d.a();
        bool = false;
        localObject2 = null;
        d = null;
      }
      h();
    }
  }
  
  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    Object localObject1;
    int i2;
    if (paramInt < 0)
    {
      int i1 = -paramInt + -1;
      localObject1 = o;
      i2 = localObject1.length;
      if (i1 < i2)
      {
        localObject2 = o;
        i2 = -paramInt + -1;
      }
    }
    for (Object localObject2 = localObject2[i2];; localObject2 = String.valueOf(paramInt))
    {
      localObject1 = a.getContext();
      a((Context)localObject1, "http_err", (String)localObject2, paramString2);
      super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
      return;
    }
  }
  
  public final void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    int i1;
    Object localObject;
    if (paramSslError != null)
    {
      i1 = paramSslError.getPrimaryError();
      if (i1 < 0) {
        break label89;
      }
      localObject = p;
      int i2 = localObject.length;
      if (i1 >= i2) {
        break label89;
      }
      localObject = p;
    }
    label89:
    for (String str1 = localObject[i1];; str1 = String.valueOf(i1))
    {
      localObject = a.getContext();
      String str2 = "ssl_err";
      String str3 = w.g().a(paramSslError);
      a((Context)localObject, str2, str1, str3);
      super.onReceivedSslError(paramWebView, paramSslErrorHandler, paramSslError);
      return;
    }
  }
  
  public WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    Object localObject1 = null;
    for (;;)
    {
      try
      {
        localObject2 = hw.a(paramString);
        if (localObject2 != null) {
          continue;
        }
      }
      finally
      {
        Object localObject2;
        boolean bool;
        String str2;
        Object localObject3 = w.i();
        String str1 = "AdWebViewClient.shouldInterceptRequest";
        ((tj)localObject3).a(localThrowable, str1);
        continue;
      }
      return (WebResourceResponse)localObject1;
      localObject3 = w.j();
      localObject3 = ((hs)localObject3).a((hw)localObject2);
      if (localObject3 != null)
      {
        bool = ((ht)localObject3).a();
        if (bool)
        {
          localObject2 = new android/webkit/WebResourceResponse;
          str1 = "";
          str2 = "";
          localObject3 = ((ht)localObject3).b();
          ((WebResourceResponse)localObject2).<init>(str1, str2, (InputStream)localObject3);
          localObject1 = localObject2;
        }
      }
    }
  }
  
  public boolean shouldOverrideKeyEvent(WebView paramWebView, KeyEvent paramKeyEvent)
  {
    int i1 = paramKeyEvent.getKeyCode();
    switch (i1)
    {
    }
    int i2;
    for (i1 = 0;; i2 = 1) {
      return i1;
    }
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    boolean bool1 = true;
    Object localObject1 = "AdWebView shouldOverrideUrlLoading: ";
    Object localObject2 = String.valueOf(paramString);
    int i1 = ((String)localObject2).length();
    Object localObject3;
    boolean bool3;
    if (i1 != 0)
    {
      localObject2 = ((String)localObject1).concat((String)localObject2);
      tp.a((String)localObject2);
      localObject2 = Uri.parse(paramString);
      localObject1 = "gmsg";
      localObject3 = ((Uri)localObject2).getScheme();
      bool3 = ((String)localObject1).equalsIgnoreCase((String)localObject3);
      if (!bool3) {
        break label124;
      }
      localObject1 = "mobileads.google.com";
      localObject3 = ((Uri)localObject2).getHost();
      bool3 = ((String)localObject1).equalsIgnoreCase((String)localObject3);
      if (!bool3) {
        break label124;
      }
      a((Uri)localObject2);
    }
    label124:
    label288:
    label513:
    for (;;)
    {
      boolean bool4 = bool1;
      return bool4;
      localObject2 = new java/lang/String;
      ((String)localObject2).<init>((String)localObject1);
      break;
      bool3 = f;
      boolean bool2;
      if (bool3)
      {
        localObject1 = a.a();
        if (paramWebView == localObject1)
        {
          localObject1 = ((Uri)localObject2).getScheme();
          localObject3 = "http";
          bool2 = ((String)localObject3).equalsIgnoreCase((String)localObject1);
          if (!bool2)
          {
            localObject3 = "https";
            bool3 = ((String)localObject3).equalsIgnoreCase((String)localObject1);
            if (!bool3) {}
          }
          else
          {
            bool3 = bool1;
          }
          for (;;)
          {
            if (!bool3) {
              break label288;
            }
            localObject2 = r;
            if (localObject2 != null)
            {
              localObject2 = ke.aq;
              localObject1 = w.q();
              localObject2 = (Boolean)((kd)localObject1).a((jz)localObject2);
              bool4 = ((Boolean)localObject2).booleanValue();
              if (bool4)
              {
                localObject2 = r;
                ((ib)localObject2).e();
                r = null;
              }
            }
            bool4 = super.shouldOverrideUrlLoading(paramWebView, paramString);
            break;
            bool3 = false;
            localObject1 = null;
          }
        }
      }
      localObject1 = a.a();
      bool3 = ((WebView)localObject1).willNotDraw();
      if (bool3) {
        break label543;
      }
      try
      {
        localObject1 = a;
        localObject1 = ((vc)localObject1).n();
        if (localObject1 != null)
        {
          bool2 = ((dw)localObject1).b((Uri)localObject2);
          if (bool2)
          {
            localObject3 = a;
            localObject3 = ((vc)localObject3).getContext();
            localObject4 = a;
            localObject4 = ((vc)localObject4).b();
            localObject2 = ((dw)localObject1).a((Uri)localObject2, (Context)localObject3, (View)localObject4);
          }
        }
        localObject3 = localObject2;
      }
      catch (dx localdx)
      {
        Object localObject4;
        localObject3 = "Unable to append parameter to URL: ";
        str = String.valueOf(paramString);
        int i3 = str.length();
        if (i3 == 0) {
          break label513;
        }
        str = ((String)localObject3).concat(str);
        for (;;)
        {
          tp.e(str);
          localObject3 = localObject2;
          break;
          str = new java/lang/String;
          str.<init>((String)localObject3);
        }
        localObject2 = i;
        ((f)localObject2).a(paramString);
      }
      localObject2 = i;
      if (localObject2 != null)
      {
        localObject2 = i;
        bool4 = ((f)localObject2).a();
        if (!bool4) {}
      }
      else
      {
        localObject2 = new com/google/android/gms/ads/internal/overlay/e;
        localObject1 = "android.intent.action.VIEW";
        localObject3 = ((Uri)localObject3).toString();
        i3 = 0;
        localObject4 = null;
        ((e)localObject2).<init>((String)localObject1, (String)localObject3, null, null, null, null, null);
        a((e)localObject2);
        continue;
      }
    }
    label543:
    String str = "AdWebView unable to handle URL: ";
    localObject2 = String.valueOf(paramString);
    int i2 = ((String)localObject2).length();
    if (i2 != 0) {
      localObject2 = str.concat((String)localObject2);
    }
    for (;;)
    {
      tp.e((String)localObject2);
      break;
      localObject2 = new java/lang/String;
      ((String)localObject2).<init>(str);
    }
  }
}


/* Location:              com/google/android/gms/b/vd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */