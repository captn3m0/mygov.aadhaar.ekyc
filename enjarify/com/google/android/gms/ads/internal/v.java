package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
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
import com.google.android.gms.b.sb;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.ts;
import com.google.android.gms.b.uk;
import com.google.android.gms.b.un;
import com.google.android.gms.common.internal.c;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public final class v
  extends ix.a
{
  private final un a;
  private final il b;
  private final Future c;
  private final Context d;
  private final v.b e;
  private WebView f;
  private it g;
  private gn h;
  private AsyncTask i;
  
  public v(Context paramContext, il paramil, String paramString, un paramun)
  {
    d = paramContext;
    a = paramun;
    b = paramil;
    Object localObject1 = new android/webkit/WebView;
    Object localObject2 = d;
    ((WebView)localObject1).<init>((Context)localObject2);
    f = ((WebView)localObject1);
    localObject1 = new com/google/android/gms/ads/internal/v$3;
    ((v.3)localObject1).<init>(this);
    localObject1 = ts.a((Callable)localObject1);
    c = ((Future)localObject1);
    localObject1 = new com/google/android/gms/ads/internal/v$b;
    ((v.b)localObject1).<init>(paramString);
    e = ((v.b)localObject1);
    a(0);
    f.setVerticalScrollBarEnabled(false);
    f.getSettings().setJavaScriptEnabled(true);
    localObject1 = f;
    localObject2 = new com/google/android/gms/ads/internal/v$1;
    ((v.1)localObject2).<init>(this);
    ((WebView)localObject1).setWebViewClient((WebViewClient)localObject2);
    localObject1 = f;
    localObject2 = new com/google/android/gms/ads/internal/v$2;
    ((v.2)localObject2).<init>(this);
    ((WebView)localObject1).setOnTouchListener((View.OnTouchListener)localObject2);
  }
  
  private String c(String paramString)
  {
    Object localObject1 = h;
    if (localObject1 == null) {}
    for (;;)
    {
      return paramString;
      Uri localUri = Uri.parse(paramString);
      try
      {
        localObject1 = h;
        localObject4 = d;
        a locala = b.a(localUri);
        localObject4 = b.a(localObject4);
        localObject1 = a;
        localObject1 = ((gr)localObject1).b(locala, (a)localObject4);
        if (localObject1 == null)
        {
          localObject1 = new com/google/android/gms/b/go;
          ((go)localObject1).<init>();
          throw ((Throwable)localObject1);
        }
      }
      catch (RemoteException localRemoteException)
      {
        localObject4 = "Unable to process ad data";
        tp.c((String)localObject4, localRemoteException);
        for (Object localObject2 = localUri;; localObject2 = (Uri)localObject2)
        {
          paramString = ((Uri)localObject2).toString();
          break;
          localObject2 = b.a((a)localObject2);
        }
      }
      catch (go localgo)
      {
        for (;;)
        {
          Object localObject4 = "Unable to parse ad click url";
          tp.c((String)localObject4, localgo);
          Object localObject3 = localUri;
        }
      }
    }
  }
  
  public final String F()
  {
    return null;
  }
  
  public final void G()
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Unused method");
    throw localIllegalStateException;
  }
  
  final String a()
  {
    Object localObject1 = new android/net/Uri$Builder;
    ((Uri.Builder)localObject1).<init>();
    Object localObject2 = ((Uri.Builder)localObject1).scheme("https://");
    Object localObject3 = ke.cL;
    localObject3 = (String)w.q().a((jz)localObject3);
    ((Uri.Builder)localObject2).appendEncodedPath((String)localObject3);
    localObject2 = e.c;
    ((Uri.Builder)localObject1).appendQueryParameter("query", (String)localObject2);
    localObject2 = e.a;
    ((Uri.Builder)localObject1).appendQueryParameter("pubId", (String)localObject2);
    Object localObject5 = e.b;
    localObject3 = ((Map)localObject5).keySet();
    Iterator localIterator = ((Set)localObject3).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject3 = (String)localIterator.next();
      localObject2 = (String)((Map)localObject5).get(localObject3);
      ((Uri.Builder)localObject1).appendQueryParameter((String)localObject3, (String)localObject2);
    }
    localObject2 = ((Uri.Builder)localObject1).build();
    localObject3 = h;
    if (localObject3 != null) {}
    try
    {
      localObject3 = h;
      localObject1 = d;
      localObject5 = b.a(localObject2);
      localObject1 = b.a(localObject1);
      localObject3 = a;
      localObject3 = ((gr)localObject3).a((a)localObject5, (a)localObject1);
      if (localObject3 == null)
      {
        localObject3 = new com/google/android/gms/b/go;
        ((go)localObject3).<init>();
        throw ((Throwable)localObject3);
      }
    }
    catch (go localgo)
    {
      localObject1 = "Unable to process ad data";
      tp.c((String)localObject1, localgo);
      for (Object localObject4 = localObject2;; localObject4 = (Uri)localObject4)
      {
        localObject2 = String.valueOf(b());
        localObject4 = String.valueOf(((Uri)localObject4).getEncodedQuery());
        int j = String.valueOf(localObject2).length() + 1;
        int k = String.valueOf(localObject4).length();
        j += k;
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>(j);
        return (String)localObject2 + "#" + (String)localObject4;
        localObject4 = b.a((a)localObject4);
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
  
  final void a(int paramInt)
  {
    Object localObject = f;
    if (localObject == null) {}
    for (;;)
    {
      return;
      localObject = new android/view/ViewGroup$LayoutParams;
      int j = -1;
      ((ViewGroup.LayoutParams)localObject).<init>(j, paramInt);
      WebView localWebView = f;
      localWebView.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
  }
  
  public final void a(il paramil)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("AdSize must be set before initialization");
    throw localIllegalStateException;
  }
  
  public final void a(is paramis)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Unused method");
    throw localIllegalStateException;
  }
  
  public final void a(it paramit)
  {
    g = paramit;
  }
  
  public final void a(iz paramiz)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Unused method");
    throw localIllegalStateException;
  }
  
  public final void a(jb paramjb)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Unused method");
    throw localIllegalStateException;
  }
  
  public final void a(jh paramjh)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Unused method");
    throw localIllegalStateException;
  }
  
  public final void a(jt paramjt)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Unused method");
    throw localIllegalStateException;
  }
  
  public final void a(kq paramkq)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Unused method");
    throw localIllegalStateException;
  }
  
  public final void a(ph paramph)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Unused method");
    throw localIllegalStateException;
  }
  
  public final void a(pl parampl, String paramString)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Unused method");
    throw localIllegalStateException;
  }
  
  public final void a(sb paramsb)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Unused method");
    throw localIllegalStateException;
  }
  
  public final void a(String paramString)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Unused method");
    throw localIllegalStateException;
  }
  
  public final void a(boolean paramBoolean) {}
  
  public final boolean a(ih paramih)
  {
    c.a(f, "This Search Ad has already been torn down");
    v.b localb = e;
    un localun = a;
    Object localObject1 = j.n;
    c = ((String)localObject1);
    localObject1 = null;
    Object localObject2 = m;
    if (localObject2 != null)
    {
      localObject1 = m;
      localObject2 = AdMobAdapter.class.getName();
      localObject1 = ((Bundle)localObject1).getBundle((String)localObject2);
    }
    for (Object localObject3 = localObject1;; localObject3 = null)
    {
      if (localObject3 != null)
      {
        localObject1 = ke.cM;
        localObject1 = (String)w.q().a((jz)localObject1);
        localObject2 = ((Bundle)localObject3).keySet();
        Iterator localIterator = ((Set)localObject2).iterator();
        for (;;)
        {
          boolean bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          localObject2 = (String)localIterator.next();
          boolean bool2 = ((String)localObject1).equals(localObject2);
          if (bool2)
          {
            localObject2 = ((Bundle)localObject3).getString((String)localObject2);
            d = ((String)localObject2);
          }
          else
          {
            Object localObject4 = "csa_";
            bool2 = ((String)localObject2).startsWith((String)localObject4);
            if (bool2)
            {
              localObject4 = b;
              int j = 4;
              String str = ((String)localObject2).substring(j);
              localObject2 = ((Bundle)localObject3).getString((String)localObject2);
              ((Map)localObject4).put(str, localObject2);
            }
          }
        }
        localObject1 = b;
        localObject2 = "SDKVersion";
        localObject3 = a;
        ((Map)localObject1).put(localObject2, localObject3);
      }
      localObject1 = new com/google/android/gms/ads/internal/v$a;
      ((v.a)localObject1).<init>(this, (byte)0);
      localObject2 = new Void[0];
      localObject1 = ((v.a)localObject1).execute((Object[])localObject2);
      i = ((AsyncTask)localObject1);
      return true;
    }
  }
  
  final int b(String paramString)
  {
    int j = 0;
    Object localObject1 = Uri.parse(paramString);
    Object localObject2 = "height";
    localObject1 = ((Uri)localObject1).getQueryParameter((String)localObject2);
    boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
    if (bool) {}
    for (;;)
    {
      return j;
      try
      {
        ip.a();
        localObject2 = d;
        int k = Integer.parseInt((String)localObject1);
        j = uk.a((Context)localObject2, k);
      }
      catch (NumberFormatException localNumberFormatException) {}
    }
  }
  
  final String b()
  {
    Object localObject1 = e.d;
    boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
    if (bool) {
      localObject1 = "www.google.com";
    }
    for (Object localObject2 = localObject1;; localObject2 = localObject1)
    {
      String str = String.valueOf("https://");
      localObject1 = ke.cL;
      localObject1 = (String)w.q().a((jz)localObject1);
      int j = String.valueOf(str).length();
      int k = String.valueOf(localObject2).length();
      j += k;
      k = String.valueOf(localObject1).length();
      j += k;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(j);
      return str + (String)localObject2 + (String)localObject1;
    }
  }
  
  public final void h()
  {
    boolean bool = true;
    c.b("destroy must be called on the main UI thread.");
    i.cancel(bool);
    c.cancel(bool);
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
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Unused method");
    throw localIllegalStateException;
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
}


/* Location:              com/google/android/gms/ads/internal/v.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */