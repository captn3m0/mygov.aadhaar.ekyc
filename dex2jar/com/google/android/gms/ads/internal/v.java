package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.b.gn;
import com.google.android.gms.b.go;
import com.google.android.gms.b.gr;
import com.google.android.gms.b.ih;
import com.google.android.gms.b.il;
import com.google.android.gms.b.ip;
import com.google.android.gms.b.is;
import com.google.android.gms.b.it;
import com.google.android.gms.b.ix.a;
import com.google.android.gms.b.iz;
import com.google.android.gms.b.jb;
import com.google.android.gms.b.jf;
import com.google.android.gms.b.jh;
import com.google.android.gms.b.jp;
import com.google.android.gms.b.jt;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.kq;
import com.google.android.gms.b.ph;
import com.google.android.gms.b.pl;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.sb;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.ts;
import com.google.android.gms.b.uk;
import com.google.android.gms.b.un;
import com.google.android.gms.common.internal.c;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@qi
public final class v
  extends ix.a
{
  private final un a;
  private final il b;
  private final Future<gn> c;
  private final Context d;
  private final b e;
  private WebView f;
  private it g;
  private gn h;
  private AsyncTask<Void, Void, String> i;
  
  public v(Context paramContext, il paramil, String paramString, un paramun)
  {
    d = paramContext;
    a = paramun;
    b = paramil;
    f = new WebView(d);
    c = ts.a(new Callable() {});
    e = new b(paramString);
    a(0);
    f.setVerticalScrollBarEnabled(false);
    f.getSettings().setJavaScriptEnabled(true);
    f.setWebViewClient(new WebViewClient()
    {
      public final void onReceivedError(WebView paramAnonymousWebView, WebResourceRequest paramAnonymousWebResourceRequest, WebResourceError paramAnonymousWebResourceError)
      {
        if (v.a(v.this) != null) {}
        try
        {
          v.a(v.this).a(0);
          return;
        }
        catch (RemoteException paramAnonymousWebView)
        {
          tp.c("Could not call AdListener.onAdFailedToLoad().", paramAnonymousWebView);
        }
      }
      
      public final boolean shouldOverrideUrlLoading(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        if (paramAnonymousString.startsWith(b())) {
          return false;
        }
        paramAnonymousWebView = ke.cI;
        if (paramAnonymousString.startsWith((String)w.q().a(paramAnonymousWebView)))
        {
          if (v.a(v.this) != null) {}
          try
          {
            v.a(v.this).a(3);
            a(0);
            return true;
          }
          catch (RemoteException paramAnonymousWebView)
          {
            for (;;)
            {
              tp.c("Could not call AdListener.onAdFailedToLoad().", paramAnonymousWebView);
            }
          }
        }
        paramAnonymousWebView = ke.cJ;
        if (paramAnonymousString.startsWith((String)w.q().a(paramAnonymousWebView)))
        {
          if (v.a(v.this) != null) {}
          try
          {
            v.a(v.this).a(0);
            a(0);
            return true;
          }
          catch (RemoteException paramAnonymousWebView)
          {
            for (;;)
            {
              tp.c("Could not call AdListener.onAdFailedToLoad().", paramAnonymousWebView);
            }
          }
        }
        paramAnonymousWebView = ke.cK;
        if (paramAnonymousString.startsWith((String)w.q().a(paramAnonymousWebView)))
        {
          if (v.a(v.this) != null) {}
          try
          {
            v.a(v.this).c();
            int i = b(paramAnonymousString);
            a(i);
            return true;
          }
          catch (RemoteException paramAnonymousWebView)
          {
            for (;;)
            {
              tp.c("Could not call AdListener.onAdLoaded().", paramAnonymousWebView);
            }
          }
        }
        if (paramAnonymousString.startsWith("gmsg://")) {
          return true;
        }
        if (v.a(v.this) != null) {}
        try
        {
          v.a(v.this).b();
          paramAnonymousWebView = v.a(v.this, paramAnonymousString);
          v.b(v.this, paramAnonymousWebView);
          return true;
        }
        catch (RemoteException paramAnonymousWebView)
        {
          for (;;)
          {
            tp.c("Could not call AdListener.onAdLeftApplication().", paramAnonymousWebView);
          }
        }
      }
    });
    f.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        if (v.b(v.this) != null) {}
        try
        {
          ba.d(b.a(paramAnonymousMotionEvent));
          return false;
        }
        catch (RemoteException paramAnonymousView)
        {
          for (;;)
          {
            tp.c("Unable to process ad data", paramAnonymousView);
          }
        }
      }
    });
  }
  
  private String c(String paramString)
  {
    if (h == null) {
      return paramString;
    }
    paramString = Uri.parse(paramString);
    try
    {
      Object localObject1 = h;
      Object localObject2 = d;
      a locala = b.a(paramString);
      localObject2 = b.a(localObject2);
      localObject1 = a.b(locala, (a)localObject2);
      if (localObject1 == null) {
        throw new go();
      }
    }
    catch (RemoteException localRemoteException)
    {
      tp.c("Unable to process ad data", localRemoteException);
      for (;;)
      {
        return paramString.toString();
        Uri localUri = (Uri)b.a(localRemoteException);
        paramString = localUri;
      }
    }
    catch (go localgo)
    {
      for (;;)
      {
        tp.c("Unable to parse ad click url", localgo);
      }
    }
  }
  
  public final String F()
  {
    return null;
  }
  
  public final void G()
  {
    throw new IllegalStateException("Unused method");
  }
  
  final String a()
  {
    Object localObject1 = new Uri.Builder();
    Object localObject3 = ((Uri.Builder)localObject1).scheme("https://");
    Object localObject4 = ke.cL;
    ((Uri.Builder)localObject3).appendEncodedPath((String)w.q().a((jz)localObject4));
    ((Uri.Builder)localObject1).appendQueryParameter("query", e.c);
    ((Uri.Builder)localObject1).appendQueryParameter("pubId", e.a);
    localObject3 = e.b;
    localObject4 = ((Map)localObject3).keySet().iterator();
    Object localObject5;
    while (((Iterator)localObject4).hasNext())
    {
      localObject5 = (String)((Iterator)localObject4).next();
      ((Uri.Builder)localObject1).appendQueryParameter((String)localObject5, (String)((Map)localObject3).get(localObject5));
    }
    localObject3 = ((Uri.Builder)localObject1).build();
    if (h != null) {}
    try
    {
      localObject1 = h;
      localObject5 = d;
      localObject4 = b.a(localObject3);
      localObject5 = b.a(localObject5);
      localObject1 = a.a((a)localObject4, (a)localObject5);
      if (localObject1 == null) {
        throw new go();
      }
    }
    catch (go localgo)
    {
      tp.c("Unable to process ad data", localgo);
      for (Object localObject2 = localObject3;; localObject2 = (Uri)b.a((a)localObject2))
      {
        localObject3 = String.valueOf(b());
        localObject2 = String.valueOf(((Uri)localObject2).getEncodedQuery());
        return String.valueOf(localObject3).length() + 1 + String.valueOf(localObject2).length() + (String)localObject3 + "#" + (String)localObject2;
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
  
  final void a(int paramInt)
  {
    if (f == null) {
      return;
    }
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, paramInt);
    f.setLayoutParams(localLayoutParams);
  }
  
  public final void a(il paramil)
  {
    throw new IllegalStateException("AdSize must be set before initialization");
  }
  
  public final void a(is paramis)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void a(it paramit)
  {
    g = paramit;
  }
  
  public final void a(iz paramiz)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void a(jb paramjb)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void a(jh paramjh)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void a(jt paramjt)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void a(kq paramkq)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void a(ph paramph)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void a(pl parampl, String paramString)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void a(sb paramsb)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void a(String paramString)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void a(boolean paramBoolean) {}
  
  public final boolean a(ih paramih)
  {
    c.a(f, "This Search Ad has already been torn down");
    b localb = e;
    un localun = a;
    c = j.n;
    if (m != null) {}
    for (paramih = m.getBundle(AdMobAdapter.class.getName());; paramih = null)
    {
      if (paramih != null)
      {
        Object localObject = ke.cM;
        localObject = (String)w.q().a((jz)localObject);
        Iterator localIterator = paramih.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          if (((String)localObject).equals(str)) {
            d = paramih.getString(str);
          } else if (str.startsWith("csa_")) {
            b.put(str.substring(4), paramih.getString(str));
          }
        }
        b.put("SDKVersion", a);
      }
      i = new a((byte)0).execute(new Void[0]);
      return true;
    }
  }
  
  final int b(String paramString)
  {
    paramString = Uri.parse(paramString).getQueryParameter("height");
    if (TextUtils.isEmpty(paramString)) {
      return 0;
    }
    try
    {
      ip.a();
      int j = uk.a(d, Integer.parseInt(paramString));
      return j;
    }
    catch (NumberFormatException paramString) {}
    return 0;
  }
  
  final String b()
  {
    String str1 = e.d;
    if (TextUtils.isEmpty(str1)) {
      str1 = "www.google.com";
    }
    for (;;)
    {
      String str2 = String.valueOf("https://");
      Object localObject = ke.cL;
      localObject = (String)w.q().a((jz)localObject);
      return String.valueOf(str2).length() + String.valueOf(str1).length() + String.valueOf(localObject).length() + str2 + str1 + (String)localObject;
    }
  }
  
  public final void h()
  {
    c.b("destroy must be called on the main UI thread.");
    i.cancel(true);
    c.cancel(true);
    f.destroy();
    f = null;
  }
  
  public final a i()
  {
    c.b("getAdFrame must be called on the main UI thread.");
    return b.a(f);
  }
  
  public final il j()
  {
    return b;
  }
  
  public final boolean k()
  {
    return false;
  }
  
  public final void l()
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void m()
  {
    c.b("pause must be called on the main UI thread.");
  }
  
  public final void n()
  {
    c.b("resume must be called on the main UI thread.");
  }
  
  public final void o() {}
  
  public final boolean p()
  {
    return false;
  }
  
  public final jf q()
  {
    return null;
  }
  
  private final class a
    extends AsyncTask<Void, Void, String>
  {
    private a() {}
    
    private String a()
    {
      try
      {
        v localv = v.this;
        Future localFuture = v.e(v.this);
        jz localjz = ke.cN;
        v.a(localv, (gn)localFuture.get(((Long)w.q().a(localjz)).longValue(), TimeUnit.MILLISECONDS));
        return v.this.a();
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          tp.c("Failed to load ad data", localInterruptedException);
        }
      }
      catch (TimeoutException localTimeoutException)
      {
        for (;;)
        {
          tp.e("Timed out waiting for ad data");
        }
      }
      catch (ExecutionException localExecutionException)
      {
        for (;;) {}
      }
    }
  }
  
  private static final class b
  {
    final String a;
    final Map<String, String> b;
    String c;
    String d;
    
    public b(String paramString)
    {
      a = paramString;
      b = new TreeMap();
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */