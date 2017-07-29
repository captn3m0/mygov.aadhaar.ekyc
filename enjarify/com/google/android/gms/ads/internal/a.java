package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.overlay.s;
import com.google.android.gms.b.gv;
import com.google.android.gms.b.gw;
import com.google.android.gms.b.hh;
import com.google.android.gms.b.hh.a;
import com.google.android.gms.b.hs;
import com.google.android.gms.b.ib;
import com.google.android.gms.b.ih;
import com.google.android.gms.b.ii;
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
import com.google.android.gms.b.jr;
import com.google.android.gms.b.jt;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.kg;
import com.google.android.gms.b.kk;
import com.google.android.gms.b.km;
import com.google.android.gms.b.kq;
import com.google.android.gms.b.ly;
import com.google.android.gms.b.ph;
import com.google.android.gms.b.pl;
import com.google.android.gms.b.pt.a;
import com.google.android.gms.b.qj.a;
import com.google.android.gms.b.qr;
import com.google.android.gms.b.rv;
import com.google.android.gms.b.sb;
import com.google.android.gms.b.ss;
import com.google.android.gms.b.ta;
import com.google.android.gms.b.tg;
import com.google.android.gms.b.tg.a;
import com.google.android.gms.b.th;
import com.google.android.gms.b.th.a;
import com.google.android.gms.b.tj;
import com.google.android.gms.b.tk;
import com.google.android.gms.b.tl;
import com.google.android.gms.b.tm;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.tt.a;
import com.google.android.gms.b.tu;
import com.google.android.gms.b.tx;
import com.google.android.gms.b.uj;
import com.google.android.gms.b.uk;
import com.google.android.gms.b.un;
import com.google.android.gms.b.vc;
import com.google.android.gms.b.vd;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.util.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;

public abstract class a
  extends ix.a
  implements s, ib, ly, pt.a, qj.a, tl
{
  protected km a;
  protected kk b;
  protected kk c;
  protected boolean d = false;
  protected final t e;
  protected final x f;
  protected transient ih g;
  protected final gv h;
  protected final e i;
  
  a(x paramx, e parame)
  {
    f = paramx;
    Object localObject1 = new com/google/android/gms/ads/internal/t;
    ((t)localObject1).<init>(this);
    e = ((t)localObject1);
    i = parame;
    localObject1 = w.e();
    Object localObject4 = f.c;
    boolean bool3 = b;
    if (!bool3)
    {
      localObject5 = new android/content/IntentFilter;
      ((IntentFilter)localObject5).<init>();
      ((IntentFilter)localObject5).addAction("android.intent.action.USER_PRESENT");
      ((IntentFilter)localObject5).addAction("android.intent.action.SCREEN_OFF");
      localObject4 = ((Context)localObject4).getApplicationContext();
      localObject6 = new com/google/android/gms/b/tt$a;
      ((tt.a)localObject6).<init>((tt)localObject1, (byte)0);
      ((Context)localObject4).registerReceiver((BroadcastReceiver)localObject6, (IntentFilter)localObject5);
      b = bool2;
    }
    localObject1 = w.i();
    localObject4 = f.c;
    Object localObject5 = f.e;
    ((tj)localObject1).a((Context)localObject4, (un)localObject5);
    localObject1 = w.j();
    localObject4 = f.c;
    ((hs)localObject1).a((Context)localObject4);
    localObject1 = ic;
    h = ((gv)localObject1);
    Object localObject6 = w.h();
    localObject1 = f;
    localObject4 = c;
    for (;;)
    {
      synchronized (a)
      {
        boolean bool4 = c;
        if (bool4) {
          break label648;
        }
        int j = Build.VERSION.SDK_INT;
        localObject1 = ke.aJ;
        localObject5 = w.q();
        localObject1 = ((kd)localObject5).a((jz)localObject1);
        localObject1 = (Boolean)localObject1;
        bool5 = ((Boolean)localObject1).booleanValue();
        if (!bool5)
        {
          localObject1 = ke.ct;
          localObject4 = w.q();
          localObject1 = (Boolean)((kd)localObject4).a((jz)localObject1);
          bool5 = ((Boolean)localObject1).booleanValue();
          if (bool5)
          {
            localObject1 = new java/util/Timer;
            ((Timer)localObject1).<init>();
            localObject5 = new java/util/concurrent/CountDownLatch;
            localObject4 = ke.cv;
            localObject6 = w.q();
            int k = ((Integer)((kd)localObject6).a((jz)localObject4)).intValue();
            ((CountDownLatch)localObject5).<init>(k);
            localObject4 = new com/google/android/gms/ads/internal/a$1;
            ((a.1)localObject4).<init>(this, (CountDownLatch)localObject5, (Timer)localObject1);
            long l1 = 0L;
            ??? = ke.cu;
            localkd = w.q();
            ??? = (Long)localkd.a((jz)???);
            long l2 = ((Long)???).longValue();
            ((Timer)localObject1).schedule((TimerTask)localObject4, l1, l2);
          }
          return;
        }
        bool3 = false;
        localObject5 = null;
        localObject1 = ((Context)localObject4).getApplicationContext();
        if (localObject1 == null) {
          localObject1 = localObject4;
        }
        bool1 = localObject1 instanceof Application;
        if (!bool1) {
          break label654;
        }
        localObject1 = (Application)localObject1;
        if (localObject1 == null)
        {
          localObject1 = "Can not cast Context to Application";
          tp.e((String)localObject1);
        }
      }
      localObject5 = b;
      if (localObject5 == null)
      {
        localObject5 = new com/google/android/gms/b/hh$a;
        ((hh.a)localObject5).<init>();
        b = ((hh.a)localObject5);
      }
      localObject5 = b;
      bool1 = d;
      if (!bool1)
      {
        ((Application)localObject2).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject5);
        bool5 = localObject4 instanceof Activity;
        if (bool5)
        {
          Object localObject8 = localObject4;
          localObject8 = (Activity)localObject4;
          localObject3 = localObject8;
          ((hh.a)localObject5).a((Activity)localObject8);
        }
        b = ((Context)localObject4);
        localObject3 = ke.aK;
        localObject4 = w.q();
        localObject3 = ((kd)localObject4).a((jz)localObject3);
        localObject3 = (Long)localObject3;
        long l3 = ((Long)localObject3).longValue();
        e = l3;
        bool5 = true;
        d = bool5;
      }
      boolean bool5 = true;
      c = bool5;
      label648:
      continue;
      label654:
      bool5 = false;
      Object localObject3 = null;
    }
  }
  
  protected static List a(String paramString, List paramList)
  {
    if (paramString == null) {}
    for (;;)
    {
      return paramList;
      ArrayList localArrayList = new java/util/ArrayList;
      int j = paramList.size();
      localArrayList.<init>(j);
      Iterator localIterator = paramList.iterator();
      boolean bool1 = localIterator.hasNext();
      if (bool1)
      {
        String str1 = (String)localIterator.next();
        if (paramString != null)
        {
          boolean bool2 = TextUtils.isEmpty(str1);
          if (!bool2) {
            break label80;
          }
        }
        for (;;)
        {
          localArrayList.add(str1);
          break;
          label80:
          w.e();
          String str2 = "fbs_aeid";
          str1 = tt.a(str1, str2, paramString).toString();
        }
      }
      paramList = localArrayList;
    }
  }
  
  private static long b(String paramString)
  {
    String str1 = "ufe";
    int j = paramString.indexOf(str1);
    int k = paramString.indexOf(',', j);
    int m = -1;
    if (k == m) {
      k = paramString.length();
    }
    j += 4;
    try
    {
      str1 = paramString.substring(j, k);
      l = Long.parseLong(str1);
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      for (;;)
      {
        String str2 = "Invalid index for Url fetch time in CSI latency info.";
        tp.e(str2);
        long l = -1;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        String str3 = "Cannot find valid format of Url fetch time in CSI latency info.";
        tp.e(str3);
      }
    }
    return l;
  }
  
  private void d(tg paramtg)
  {
    Object localObject1;
    boolean bool;
    if (paramtg != null)
    {
      localObject1 = D;
      bool = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool)
      {
        bool = H;
        if (!bool)
        {
          localObject1 = w.m();
          bool = ((tx)localObject1).b();
          if (bool) {
            break label41;
          }
        }
      }
    }
    for (;;)
    {
      return;
      label41:
      tp.b("Sending troubleshooting signals to the server.");
      Object localObject2 = w.m();
      Context localContext = f.c;
      String str1 = f.e.a;
      String str2 = D;
      String str3 = f.b;
      localObject1 = ke.dk;
      kd localkd = w.q();
      localObject1 = (String)localkd.a((jz)localObject1);
      localObject1 = ((tx)localObject2).a(localContext, (String)localObject1, str3, str1).buildUpon();
      localObject2 = "debugData";
      ((Uri.Builder)localObject1).appendQueryParameter((String)localObject2, str2);
      w.e();
      localObject1 = ((Uri.Builder)localObject1).build().toString();
      tt.b(localContext, str1, (String)localObject1);
      bool = true;
      H = bool;
    }
  }
  
  protected final void a(int paramInt)
  {
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>(30);
    tp.e("Failed to load ad: " + paramInt);
    d = false;
    localObject2 = f.n;
    if (localObject2 != null) {}
    try
    {
      localObject2 = f;
      localObject2 = n;
      ((it)localObject2).a(paramInt);
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          localObject2 = f;
          localObject2 = A;
          ((sb)localObject2).a(paramInt);
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          localObject1 = "Could not call RewardedVideoAdListener.onRewardedVideoAdFailedToLoad().";
          tp.c((String)localObject1, localRemoteException2);
          continue;
        }
        localRemoteException1 = localRemoteException1;
        localObject1 = "Could not call AdListener.onAdFailedToLoad().";
        tp.c((String)localObject1, localRemoteException1);
      }
    }
    localObject2 = f.A;
    if (localObject2 == null) {}
  }
  
  protected final void a(View paramView)
  {
    x.a locala = f.f;
    if (locala != null)
    {
      ViewGroup.LayoutParams localLayoutParams = w.g().d();
      locala.addView(paramView, localLayoutParams);
    }
  }
  
  public final void a(il paramil)
  {
    c.b("setAdSize must be called on the main UI thread.");
    f.i = paramil;
    Object localObject = f.j;
    int j;
    if (localObject != null)
    {
      localObject = f.j.b;
      if (localObject != null)
      {
        localObject = f;
        j = F;
        if (j == 0)
        {
          localObject = f.j.b;
          ((vc)localObject).a(paramil);
        }
      }
    }
    localObject = f.f;
    if (localObject == null) {}
    for (;;)
    {
      return;
      localObject = f.f;
      j = ((x.a)localObject).getChildCount();
      int k = 1;
      if (j > k)
      {
        localObject = f.f;
        View localView = f.f.getNextView();
        ((x.a)localObject).removeView(localView);
      }
      localObject = f.f;
      k = f;
      ((x.a)localObject).setMinimumWidth(k);
      localObject = f.f;
      k = c;
      ((x.a)localObject).setMinimumHeight(k);
      localObject = f.f;
      ((x.a)localObject).requestLayout();
    }
  }
  
  public final void a(is paramis)
  {
    c.b("setAdListener must be called on the main UI thread.");
    f.m = paramis;
  }
  
  public final void a(it paramit)
  {
    c.b("setAdListener must be called on the main UI thread.");
    f.n = paramit;
  }
  
  public final void a(iz paramiz)
  {
    c.b("setAppEventListener must be called on the main UI thread.");
    f.o = paramiz;
  }
  
  public final void a(jb paramjb)
  {
    c.b("setCorrelationIdProvider must be called on the main UI thread");
    f.p = paramjb;
  }
  
  public final void a(jh paramjh)
  {
    c.b("setIconAdOptions must be called on the main UI thread.");
    f.y = paramjh;
  }
  
  public final void a(jt paramjt)
  {
    c.b("setVideoOptions must be called on the main UI thread.");
    f.x = paramjt;
  }
  
  public void a(kq paramkq)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
    throw localIllegalStateException;
  }
  
  public void a(ph paramph)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("setInAppPurchaseListener is not supported for current ad type");
    throw localIllegalStateException;
  }
  
  public void a(pl parampl, String paramString)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("setPlayStorePurchaseParams is not supported for current ad type");
    throw localIllegalStateException;
  }
  
  public final void a(sb paramsb)
  {
    c.b("setRewardedVideoAdListener can only be called from the UI thread.");
    f.A = paramsb;
  }
  
  protected final void a(ss paramss)
  {
    sb localsb = f.A;
    if (localsb == null) {}
    for (;;)
    {
      return;
      String str = "";
      int j = 1;
      if (paramss != null) {}
      try
      {
        str = a;
        j = b;
        Object localObject = f;
        localObject = A;
        rv localrv = new com/google/android/gms/b/rv;
        localrv.<init>(str, j);
        ((sb)localObject).a(localrv);
      }
      catch (RemoteException localRemoteException)
      {
        str = "Could not call RewardedVideoAdListener.onRewarded().";
        tp.c(str, localRemoteException);
      }
    }
  }
  
  public final void a(tg.a parama)
  {
    long l1 = -1;
    int j = 1;
    Object localObject1 = b;
    long l2 = n;
    boolean bool1 = l2 < l1;
    if (bool1)
    {
      localObject1 = b.y;
      bool1 = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool1)
      {
        localObject1 = b.y;
        l2 = b((String)localObject1);
        bool2 = l2 < l1;
        if (bool2)
        {
          ??? = a;
          long l3 = b.n;
          l2 += l3;
          localObject1 = ((km)???).a(l2);
          localObject4 = a;
          ??? = new String[j];
          String str = "stc";
          ???[0] = str;
          ((km)localObject4).a((kk)localObject1, (String[])???);
        }
      }
    }
    localObject1 = a;
    Object localObject4 = b.y;
    boolean bool2 = a;
    if (bool2) {}
    synchronized (b)
    {
      c = ((String)localObject4);
      localObject1 = a;
      localObject4 = b;
      ??? = new String[j];
      ???[0] = "arf";
      ((km)localObject1).a((kk)localObject4, (String[])???);
      localObject1 = a.a();
      c = ((kk)localObject1);
      localObject1 = a;
      ??? = b.z;
      ((km)localObject1).a("gqi", (String)???);
      f.g = null;
      f.k = parama;
      localObject1 = a;
      a(parama, (km)localObject1);
      return;
    }
  }
  
  public abstract void a(tg.a parama, km paramkm);
  
  public final void a(String paramString)
  {
    tp.e("RewardedVideoAd.setUserId() is deprecated. Please do not call this method.");
  }
  
  public final void a(String paramString1, String paramString2)
  {
    Object localObject = f.o;
    if (localObject != null) {}
    try
    {
      localObject = f;
      localObject = o;
      ((iz)localObject).a(paramString1, paramString2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call the AppEventListener.";
        tp.c(str, localRemoteException);
      }
    }
  }
  
  public final void a(HashSet paramHashSet)
  {
    f.I = paramHashSet;
  }
  
  public void a(boolean paramBoolean)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    throw localUnsupportedOperationException;
  }
  
  public boolean a(ih paramih)
  {
    c.b("loadAd must be called on the main UI thread.");
    Object localObject1 = w.j();
    Object localObject2 = ke.da;
    ??? = w.q();
    localObject2 = (Boolean)((kd)???).a((jz)localObject2);
    boolean bool1 = ((Boolean)localObject2).booleanValue();
    if (bool1) {}
    for (;;)
    {
      synchronized (b)
      {
        ((hs)localObject1).a();
        w.e();
        localObject2 = tt.a;
        localObject6 = a;
        ((Handler)localObject2).removeCallbacks((Runnable)localObject6);
        w.e();
        localObject6 = tt.a;
        localObject1 = a;
        localObject2 = ke.db;
        localObject7 = w.q();
        localObject2 = ((kd)localObject7).a((jz)localObject2);
        localObject2 = (Long)localObject2;
        long l1 = ((Long)localObject2).longValue();
        ((Handler)localObject6).postDelayed((Runnable)localObject1, l1);
        localObject2 = ke.aR;
        localObject1 = w.q();
        localObject2 = (Boolean)((kd)localObject1).a((jz)localObject2);
        bool1 = ((Boolean)localObject2).booleanValue();
        if (bool1) {
          ih.a(paramih);
        }
        localObject8 = this;
        localObject2 = f.c;
        bool1 = f.b((Context)localObject2);
        if (bool1)
        {
          localObject8 = paramih;
          localObject2 = k;
          if (localObject2 != null)
          {
            Object localObject9 = new com/google/android/gms/b/ii;
            localObject8 = localObject9;
            ((ii)localObject9).<init>(paramih);
            bool1 = false;
            j = null;
            localObject2 = new com/google/android/gms/b/ih;
            j = 7;
            l2 = a;
            localObject7 = b;
            int k = c;
            List localList1 = d;
            boolean bool2 = e;
            int m = f;
            boolean bool3 = g;
            String str1 = h;
            jp localjp = i;
            Location localLocation = j;
            String str2 = k;
            Bundle localBundle1 = l;
            localObject8 = localObject9;
            Bundle localBundle2 = m;
            localObject8 = localObject9;
            List localList2 = n;
            localObject8 = localObject9;
            String str3 = o;
            localObject8 = localObject9;
            localObject8 = p;
            localObject9 = localObject8;
            ((ih)localObject2).<init>(j, l2, (Bundle)localObject7, k, localList1, bool2, m, bool3, str1, localjp, localLocation, str2, localBundle1, localBundle2, localList2, str3, (String)localObject8, false);
            paramih = (ih)localObject2;
          }
        }
        localObject8 = this;
        localObject2 = f.g;
        if (localObject2 == null)
        {
          localObject2 = f.h;
          if (localObject2 == null) {
            break label477;
          }
        }
        localObject8 = this;
        localObject2 = g;
        if (localObject2 != null)
        {
          localObject2 = "Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.";
          tp.e((String)localObject2);
          localObject8 = paramih;
          g = paramih;
          bool1 = false;
          localObject2 = null;
          return bool1;
        }
      }
      Object localObject4 = "Loading already in progress, saving this object for future refreshes.";
      tp.e((String)localObject4);
      continue;
      label477:
      tp.d("Starting ad request.");
      localObject1 = new com/google/android/gms/b/km;
      localObject4 = ke.T;
      bool1 = ((Boolean)w.q().a((jz)localObject4)).booleanValue();
      ??? = "load_ad";
      Object localObject6 = f.i.a;
      ((km)localObject1).<init>(bool1, (String)???, (String)localObject6);
      a = ((km)localObject1);
      localObject4 = new com/google/android/gms/b/kk;
      ((kk)localObject4).<init>(-1, null, null);
      b = ((kk)localObject4);
      localObject4 = new com/google/android/gms/b/kk;
      long l2 = -1;
      int j = 0;
      localObject1 = null;
      Object localObject7 = null;
      ((kk)localObject4).<init>(l2, null, null);
      c = ((kk)localObject4);
      localObject4 = a.a();
      b = ((kk)localObject4);
      Object localObject8 = paramih;
      bool1 = f;
      if (!bool1)
      {
        ip.a();
        localObject8 = this;
        localObject4 = String.valueOf(uk.a(f.c));
        j = String.valueOf(localObject4).length() + 71;
        ??? = new java/lang/StringBuilder;
        ((StringBuilder)???).<init>(j);
        localObject4 = ((StringBuilder)???).append("Use AdRequest.Builder.addTestDevice(\"").append((String)localObject4);
        localObject1 = "\") to get test ads on this device.";
        localObject4 = (String)localObject1;
        tp.d((String)localObject4);
      }
      localObject8 = this;
      localObject4 = e;
      localObject8 = paramih;
      a = paramih;
      localObject8 = this;
      localObject4 = a;
      bool1 = a(paramih, (km)localObject4);
      d = bool1;
      bool1 = d;
    }
  }
  
  protected abstract boolean a(ih paramih, km paramkm);
  
  boolean a(tg paramtg)
  {
    return false;
  }
  
  public abstract boolean a(tg paramtg1, tg paramtg2);
  
  public void b(tg paramtg)
  {
    int j = 1;
    int k = -2;
    long l1 = -1;
    Object localObject1 = a;
    Object localObject8 = c;
    ??? = new String[j];
    ??? = "awr";
    ???[0] = ???;
    ((km)localObject1).a((kk)localObject8, (String[])???);
    localObject1 = f;
    int m = 0;
    localObject8 = null;
    h = null;
    int n = d;
    if (n != k)
    {
      n = d;
      m = 3;
      if (n != m)
      {
        localObject1 = w.i();
        localObject8 = f.I;
      }
    }
    for (;;)
    {
      synchronized (a)
      {
        localObject1 = d;
        ((HashSet)localObject1).addAll((Collection)localObject8);
        n = d;
        m = -1;
        if (n == m)
        {
          d = false;
          return;
        }
      }
      boolean bool2 = a(paramtg);
      if (bool2)
      {
        localObject3 = "Ad refresh scheduled.";
        tp.b((String)localObject3);
      }
      int i1 = d;
      if (i1 == k) {
        break;
      }
      i1 = d;
      a(i1);
    }
    Object localObject3 = f.D;
    if (localObject3 == null)
    {
      localObject3 = f;
      localObject8 = new com/google/android/gms/b/tm;
      ??? = f.b;
      ((tm)localObject8).<init>((String)???);
      D = ((tm)localObject8);
    }
    localObject3 = h;
    localObject8 = f.j;
    ((gv)localObject3).a((tg)localObject8);
    localObject3 = f.j;
    boolean bool3 = a((tg)localObject3, paramtg);
    long l4;
    if (bool3)
    {
      f.j = paramtg;
      localObject3 = f;
      localObject8 = l;
      if (localObject8 != null)
      {
        localObject8 = j;
        long l2;
        if (localObject8 != null)
        {
          localObject8 = l;
          ??? = j;
          l2 = A;
        }
        synchronized (c)
        {
          j = l2;
          l2 = j;
          boolean bool4 = l2 < l1;
          if (bool4)
          {
            ??? = a;
            ((tj)???).a((th)localObject8);
          }
          localObject8 = l;
          ??? = j;
          l2 = B;
          synchronized (c)
          {
            long l3 = j;
            boolean bool5 = l3 < l1;
            if (bool5)
            {
              d = l2;
              ??? = a;
              ((tj)???).a((th)localObject8);
            }
            localObject8 = l;
            ??? = j;
            bool4 = n;
            synchronized (c)
            {
              l4 = j;
              boolean bool1 = l4 < l1;
              if (bool1)
              {
                f = bool4;
                ??? = a;
                ((tj)???).a((th)localObject8);
              }
              localObject8 = l;
              localObject3 = i;
              bool3 = d;
            }
          }
        }
      }
    }
    for (;;)
    {
      synchronized (c)
      {
        l4 = j;
        boolean bool6 = l4 < l1;
        if (bool6)
        {
          l4 = SystemClock.elapsedRealtime();
          g = l4;
          if (!bool3)
          {
            l4 = g;
            e = l4;
            localObject3 = a;
            ((tj)localObject3).a((th)localObject8);
          }
        }
        localObject8 = a;
        ??? = "is_mraid";
        localObject3 = f.j;
        bool3 = ((tg)localObject3).a();
        if (bool3)
        {
          localObject3 = "1";
          ((km)localObject8).a((String)???, (String)localObject3);
          localObject8 = a;
          ??? = "is_mediation";
          localObject3 = f.j;
          bool3 = n;
          if (!bool3) {
            break label1025;
          }
          localObject3 = "1";
          ((km)localObject8).a((String)???, (String)localObject3);
          localObject3 = f.j.b;
          if (localObject3 != null)
          {
            localObject3 = f.j.b.l();
            if (localObject3 != null)
            {
              localObject8 = a;
              ??? = "is_delay_pl";
              localObject3 = f.j.b.l();
              bool3 = ((vd)localObject3).e();
              if (!bool3) {
                break label1033;
              }
              localObject3 = "1";
              ((km)localObject8).a((String)???, (String)localObject3);
            }
          }
          localObject3 = a;
          localObject8 = b;
          ??? = new String[j];
          ??? = "ttc";
          ???[0] = ???;
          ((km)localObject3).a((kk)localObject8, (String[])???);
          localObject3 = w.i().e();
          if (localObject3 != null)
          {
            localObject3 = w.i().e();
            localObject8 = a;
            ((kg)localObject3).a((km)localObject8);
          }
          localObject3 = f;
          bool3 = ((x)localObject3).c();
          if (bool3) {
            u();
          }
          localObject3 = I;
          if (localObject3 == null) {
            break;
          }
          w.e();
          localObject3 = f.c;
          localObject8 = I;
          tt.a((Context)localObject3, (List)localObject8);
          break;
          localObject4 = finally;
          throw ((Throwable)localObject4);
          localObject5 = finally;
          throw ((Throwable)localObject5);
          localObject6 = finally;
          throw ((Throwable)localObject6);
        }
      }
      String str = "0";
      continue;
      label1025:
      str = "0";
      continue;
      label1033:
      str = "0";
    }
  }
  
  protected boolean b(ih paramih)
  {
    Context localContext = null;
    Object localObject = f.f;
    boolean bool1;
    if (localObject == null)
    {
      bool1 = false;
      localObject = null;
    }
    for (;;)
    {
      return bool1;
      localObject = f.f.getParent();
      boolean bool2 = localObject instanceof View;
      if (!bool2)
      {
        bool1 = false;
        localObject = null;
      }
      else
      {
        localObject = (View)localObject;
        w.e();
        localContext = ((View)localObject).getContext();
        bool1 = tt.a((View)localObject, localContext);
      }
    }
  }
  
  public final void c(ih paramih)
  {
    boolean bool = b(paramih);
    if (bool) {
      a(paramih);
    }
    for (;;)
    {
      return;
      tp.d("Ad is not visible. Not refreshing ad.");
      t localt = e;
      localt.a(paramih);
    }
  }
  
  protected final void c(tg paramtg)
  {
    long l1 = -1;
    Object localObject1;
    if (paramtg == null)
    {
      localObject1 = "Ad state was null when trying to ping impression URLs.";
      tp.e((String)localObject1);
    }
    for (;;)
    {
      return;
      tp.b("Pinging Impression URLs.");
      localObject1 = f.l;
      if (localObject1 != null) {
        localObject1 = f.l;
      }
      synchronized (c)
      {
        long l2 = j;
        boolean bool1 = l2 < l1;
        if (bool1)
        {
          l2 = e;
          bool1 = l2 < l1;
          if (!bool1)
          {
            l2 = SystemClock.elapsedRealtime();
            e = l2;
            ??? = a;
            ((tj)???).a((th)localObject1);
          }
        }
        localObject1 = a;
        localObject1 = ((tj)localObject1).d();
        synchronized (f)
        {
          int j = i + 1;
          i = j;
          localObject1 = e;
          if (localObject1 == null) {
            continue;
          }
          boolean bool2 = F;
          if (bool2) {
            continue;
          }
          localObject1 = w.D();
          ??? = f.c;
          localObject1 = ((ta)localObject1).d((Context)???);
          w.e();
          ??? = f.c;
          ??? = f.e.a;
          List localList = e;
          localList = a((String)localObject1, localList);
          tt.a((Context)???, (String)???, localList);
          F = true;
          d(paramtg);
          ??? = e;
          int k = ((List)???).size();
          if (k <= 0) {
            continue;
          }
          ??? = w.D();
          ??? = f.c;
          ((ta)???).b((Context)???, (String)localObject1);
        }
      }
    }
  }
  
  public void e()
  {
    Object localObject1 = f.j;
    if (localObject1 == null)
    {
      localObject1 = "Ad state was null when trying to ping click URLs.";
      tp.e((String)localObject1);
    }
    for (;;)
    {
      return;
      tp.b("Pinging click URLs.");
      localObject1 = f.l;
      if (localObject1 != null) {
        localObject1 = f.l;
      }
      synchronized (c)
      {
        long l1 = j;
        long l2 = -1;
        boolean bool = l1 < l2;
        Object localObject5;
        if (bool)
        {
          localObject5 = new com/google/android/gms/b/th$a;
          ((th.a)localObject5).<init>();
          l2 = SystemClock.elapsedRealtime();
          a = l2;
          ??? = b;
          ((LinkedList)???).add(localObject5);
          l1 = h;
          l2 = 1L;
          l1 += l2;
          h = l1;
          localObject5 = a;
          localObject5 = ((tj)localObject5).d();
        }
        synchronized (f)
        {
          int j = h + 1;
          h = j;
          localObject5 = a;
          ((tj)localObject5).a((th)localObject1);
          localObject1 = f.j.c;
          if (localObject1 != null)
          {
            localObject1 = w.D();
            ??? = f.c;
            localObject1 = ((ta)localObject1).d((Context)???);
            w.e();
            ??? = f.c;
            localObject5 = f.e.a;
            ??? = f.j.c;
            ??? = a((String)localObject1, (List)???);
            tt.a((Context)???, (String)localObject5, (List)???);
            ??? = f.j.c;
            int k = ((List)???).size();
            if (k > 0)
            {
              ??? = w.D();
              localObject5 = f.c;
              ((ta)???).a((Context)localObject5, (String)localObject1);
            }
          }
          localObject1 = f.m;
          if (localObject1 == null) {
            continue;
          }
          try
          {
            localObject1 = f;
            localObject1 = m;
            ((is)localObject1).a();
          }
          catch (RemoteException localRemoteException)
          {
            ??? = "Could not notify onAdClicked event.";
            tp.c((String)???, localRemoteException);
          }
        }
      }
    }
  }
  
  public final void f()
  {
    s();
  }
  
  public final e g()
  {
    return i;
  }
  
  public void h()
  {
    c.b("destroy must be called on the main UI thread.");
    e.a();
    Object localObject1 = h;
    Object localObject3 = f.j;
    synchronized (a)
    {
      localObject1 = b;
      localObject1 = ((WeakHashMap)localObject1).get(localObject3);
      localObject1 = (gw)localObject1;
      if (localObject1 != null) {
        ((gw)localObject1).d();
      }
      localObject1 = f;
      localObject3 = f;
      if (localObject3 != null)
      {
        localObject3 = f;
        tp.a("Disable position monitoring on adFrame.");
        ??? = b;
        if (??? != null)
        {
          localObject3 = b;
          ((uj)localObject3).b();
        }
      }
      n = null;
      o = null;
      r = null;
      q = null;
      z = null;
      p = null;
      ((x)localObject1).a(false);
      localObject3 = f;
      if (localObject3 != null)
      {
        localObject3 = f;
        ((x.a)localObject3).removeAllViews();
      }
      ((x)localObject1).a();
      ((x)localObject1).b();
      j = null;
      return;
    }
  }
  
  public final com.google.android.gms.a.a i()
  {
    c.b("getAdFrame must be called on the main UI thread.");
    return b.a(f.f);
  }
  
  public final il j()
  {
    c.b("getAdSize must be called on the main UI thread.");
    Object localObject = f.i;
    if (localObject == null) {
      localObject = null;
    }
    for (;;)
    {
      return (il)localObject;
      localObject = new com/google/android/gms/b/jr;
      il localil = f.i;
      ((jr)localObject).<init>(localil);
    }
  }
  
  public final boolean k()
  {
    c.b("isLoaded must be called on the main UI thread.");
    Object localObject = f.g;
    boolean bool;
    if (localObject == null)
    {
      localObject = f.h;
      if (localObject == null)
      {
        localObject = f.j;
        if (localObject != null) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public final void l()
  {
    c.b("recordManualImpression must be called on the main UI thread.");
    Object localObject = f.j;
    if (localObject == null)
    {
      localObject = "Ad state was null when trying to ping manual tracking URLs.";
      tp.e((String)localObject);
    }
    for (;;)
    {
      return;
      tp.b("Pinging manual tracking URLs.");
      localObject = f.j.f;
      if (localObject != null)
      {
        localObject = f.j;
        boolean bool1 = G;
        if (!bool1)
        {
          w.e();
          localObject = f.c;
          String str = f.e.a;
          List localList = f.j.f;
          tt.a((Context)localObject, str, localList);
          localObject = f.j;
          boolean bool2 = true;
          G = bool2;
          w();
        }
      }
    }
  }
  
  public void m()
  {
    c.b("pause must be called on the main UI thread.");
  }
  
  public void n()
  {
    c.b("resume must be called on the main UI thread.");
  }
  
  public final void o()
  {
    c.b("stopLoading must be called on the main UI thread.");
    d = false;
    f.a(true);
  }
  
  public final boolean p()
  {
    return d;
  }
  
  public jf q()
  {
    return null;
  }
  
  public void r()
  {
    tp.d("Ad closing.");
    localObject = f.n;
    if (localObject != null) {}
    try
    {
      localObject = f;
      localObject = n;
      ((it)localObject).a();
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          localObject = f;
          localObject = A;
          ((sb)localObject).d();
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          String str = "Could not call RewardedVideoAdListener.onRewardedVideoAdClosed().";
          tp.c(str, localRemoteException2);
          continue;
        }
        localRemoteException1 = localRemoteException1;
        str = "Could not call AdListener.onAdClosed().";
        tp.c(str, localRemoteException1);
      }
    }
    localObject = f.A;
    if (localObject == null) {}
  }
  
  protected final void s()
  {
    tp.d("Ad leaving application.");
    localObject = f.n;
    if (localObject != null) {}
    try
    {
      localObject = f;
      localObject = n;
      ((it)localObject).b();
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          localObject = f;
          localObject = A;
          ((sb)localObject).e();
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          String str = "Could not call  RewardedVideoAdListener.onRewardedVideoAdLeftApplication().";
          tp.c(str, localRemoteException2);
          continue;
        }
        localRemoteException1 = localRemoteException1;
        str = "Could not call AdListener.onAdLeftApplication().";
        tp.c(str, localRemoteException1);
      }
    }
    localObject = f.A;
    if (localObject == null) {}
  }
  
  protected final void t()
  {
    tp.d("Ad opening.");
    localObject = f.n;
    if (localObject != null) {}
    try
    {
      localObject = f;
      localObject = n;
      ((it)localObject).d();
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          localObject = f;
          localObject = A;
          ((sb)localObject).b();
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          String str = "Could not call RewardedVideoAdListener.onRewardedVideoAdOpened().";
          tp.c(str, localRemoteException2);
          continue;
        }
        localRemoteException1 = localRemoteException1;
        str = "Could not call AdListener.onAdOpened().";
        tp.c(str, localRemoteException1);
      }
    }
    localObject = f.A;
    if (localObject == null) {}
  }
  
  protected void u()
  {
    tp.d("Ad finished loading.");
    d = false;
    localObject = f.n;
    if (localObject != null) {}
    try
    {
      localObject = f;
      localObject = n;
      ((it)localObject).c();
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          localObject = f;
          localObject = A;
          ((sb)localObject).a();
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          String str = "Could not call RewardedVideoAdListener.onRewardedVideoAdLoaded().";
          tp.c(str, localRemoteException2);
          continue;
        }
        localRemoteException1 = localRemoteException1;
        str = "Could not call AdListener.onAdLoaded().";
        tp.c(str, localRemoteException1);
      }
    }
    localObject = f.A;
    if (localObject == null) {}
  }
  
  protected final void v()
  {
    Object localObject = f.A;
    if (localObject == null) {}
    for (;;)
    {
      return;
      try
      {
        localObject = f;
        localObject = A;
        ((sb)localObject).c();
      }
      catch (RemoteException localRemoteException)
      {
        String str = "Could not call RewardedVideoAdListener.onVideoStarted().";
        tp.c(str, localRemoteException);
      }
    }
  }
  
  public final void w()
  {
    tg localtg = f.j;
    d(localtg);
  }
}


/* Location:              com/google/android/gms/ads/internal/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */