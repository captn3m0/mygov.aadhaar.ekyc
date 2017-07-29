package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Debug;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
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
import com.google.android.gms.b.qi;
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

@qi
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
  
  a(final x paramx, e parame)
  {
    f = paramx;
    e = new t(this);
    i = parame;
    paramx = w.e();
    parame = f.c;
    Object localObject1;
    if (!b)
    {
      localObject1 = new IntentFilter();
      ((IntentFilter)localObject1).addAction("android.intent.action.USER_PRESENT");
      ((IntentFilter)localObject1).addAction("android.intent.action.SCREEN_OFF");
      parame.getApplicationContext().registerReceiver(new tt.a(paramx, (byte)0), (IntentFilter)localObject1);
      b = true;
    }
    w.i().a(f.c, f.e);
    w.j().a(f.c);
    h = ic;
    hh localhh = w.h();
    parame = f.c;
    for (;;)
    {
      synchronized (a)
      {
        if (c) {
          break label432;
        }
        int j = Build.VERSION.SDK_INT;
        paramx = ke.aJ;
        if (!((Boolean)w.q().a(paramx)).booleanValue())
        {
          paramx = ke.ct;
          if (((Boolean)w.q().a(paramx)).booleanValue())
          {
            paramx = new Timer();
            parame = ke.cv;
            parame = new TimerTask()
            {
              public final void run()
              {
                Object localObject = ke.cv;
                if (((Integer)w.q().a((jz)localObject)).intValue() != a.getCount())
                {
                  tp.b("Stopping method tracing");
                  Debug.stopMethodTracing();
                  if (a.getCount() == 0L)
                  {
                    paramx.cancel();
                    return;
                  }
                }
                localObject = String.valueOf(f.c.getPackageName()).concat("_adsTrace_");
                try
                {
                  tp.b("Starting method tracing");
                  a.countDown();
                  long l = w.k().a();
                  localObject = String.valueOf(localObject).length() + 20 + (String)localObject + l;
                  jz localjz = ke.cw;
                  Debug.startMethodTracing((String)localObject, ((Integer)w.q().a(localjz)).intValue());
                  return;
                }
                catch (Exception localException)
                {
                  tp.c("Exception occurred while starting method tracing.", localException);
                }
              }
            };
            localObject1 = ke.cu;
            paramx.schedule(parame, 0L, ((Long)w.q().a((jz)localObject1)).longValue());
          }
          return;
        }
        localObject1 = parame.getApplicationContext();
        paramx = (x)localObject1;
        if (localObject1 == null) {
          paramx = parame;
        }
        if (!(paramx instanceof Application)) {
          break label438;
        }
        paramx = (Application)paramx;
        if (paramx == null) {
          tp.e("Can not cast Context to Application");
        }
      }
      if (b == null) {
        b = new hh.a();
      }
      localObject1 = b;
      if (!d)
      {
        paramx.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject1);
        if ((parame instanceof Activity)) {
          ((hh.a)localObject1).a((Activity)parame);
        }
        b = parame;
        paramx = ke.aK;
        e = ((Long)w.q().a(paramx)).longValue();
        d = true;
      }
      c = true;
      label432:
      continue;
      label438:
      paramx = null;
    }
  }
  
  protected static List<String> a(String paramString, List<String> paramList)
  {
    if (paramString == null) {
      return paramList;
    }
    ArrayList localArrayList = new ArrayList(paramList.size());
    Iterator localIterator = paramList.iterator();
    if (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramList = str;
      if (paramString != null) {
        if (!TextUtils.isEmpty(str)) {
          break label73;
        }
      }
      for (paramList = str;; paramList = tt.a(str, "fbs_aeid", paramString).toString())
      {
        localArrayList.add(paramList);
        break;
        label73:
        w.e();
      }
    }
    return localArrayList;
  }
  
  private static long b(String paramString)
  {
    int m = paramString.indexOf("ufe");
    int k = paramString.indexOf(',', m);
    int j = k;
    if (k == -1) {
      j = paramString.length();
    }
    try
    {
      long l = Long.parseLong(paramString.substring(m + 4, j));
      return l;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      tp.e("Invalid index for Url fetch time in CSI latency info.");
      return -1L;
    }
    catch (NumberFormatException paramString)
    {
      for (;;)
      {
        tp.e("Cannot find valid format of Url fetch time in CSI latency info.");
      }
    }
  }
  
  private void d(tg paramtg)
  {
    if ((paramtg == null) || (TextUtils.isEmpty(D)) || (H) || (!w.m().b())) {
      return;
    }
    tp.b("Sending troubleshooting signals to the server.");
    Object localObject = w.m();
    Context localContext = f.c;
    String str1 = f.e.a;
    String str2 = D;
    String str3 = f.b;
    jz localjz = ke.dk;
    localObject = ((tx)localObject).a(localContext, (String)w.q().a(localjz), str3, str1).buildUpon();
    ((Uri.Builder)localObject).appendQueryParameter("debugData", str2);
    w.e();
    tt.b(localContext, str1, ((Uri.Builder)localObject).build().toString());
    H = true;
  }
  
  protected final void a(int paramInt)
  {
    tp.e(30 + "Failed to load ad: " + paramInt);
    d = false;
    if (f.n != null) {}
    try
    {
      f.n.a(paramInt);
      if (f.A == null) {}
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          f.A.a(paramInt);
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          tp.c("Could not call RewardedVideoAdListener.onRewardedVideoAdFailedToLoad().", localRemoteException2);
        }
        localRemoteException1 = localRemoteException1;
        tp.c("Could not call AdListener.onAdFailedToLoad().", localRemoteException1);
      }
    }
  }
  
  protected final void a(View paramView)
  {
    x.a locala = f.f;
    if (locala != null) {
      locala.addView(paramView, w.g().d());
    }
  }
  
  public final void a(il paramil)
  {
    com.google.android.gms.common.internal.c.b("setAdSize must be called on the main UI thread.");
    f.i = paramil;
    if ((f.j != null) && (f.j.b != null) && (f.F == 0)) {
      f.j.b.a(paramil);
    }
    if (f.f == null) {
      return;
    }
    if (f.f.getChildCount() > 1) {
      f.f.removeView(f.f.getNextView());
    }
    f.f.setMinimumWidth(f);
    f.f.setMinimumHeight(c);
    f.f.requestLayout();
  }
  
  public final void a(is paramis)
  {
    com.google.android.gms.common.internal.c.b("setAdListener must be called on the main UI thread.");
    f.m = paramis;
  }
  
  public final void a(it paramit)
  {
    com.google.android.gms.common.internal.c.b("setAdListener must be called on the main UI thread.");
    f.n = paramit;
  }
  
  public final void a(iz paramiz)
  {
    com.google.android.gms.common.internal.c.b("setAppEventListener must be called on the main UI thread.");
    f.o = paramiz;
  }
  
  public final void a(jb paramjb)
  {
    com.google.android.gms.common.internal.c.b("setCorrelationIdProvider must be called on the main UI thread");
    f.p = paramjb;
  }
  
  public final void a(jh paramjh)
  {
    com.google.android.gms.common.internal.c.b("setIconAdOptions must be called on the main UI thread.");
    f.y = paramjh;
  }
  
  public final void a(jt paramjt)
  {
    com.google.android.gms.common.internal.c.b("setVideoOptions must be called on the main UI thread.");
    f.x = paramjt;
  }
  
  public void a(kq paramkq)
  {
    throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
  }
  
  public void a(ph paramph)
  {
    throw new IllegalStateException("setInAppPurchaseListener is not supported for current ad type");
  }
  
  public void a(pl parampl, String paramString)
  {
    throw new IllegalStateException("setPlayStorePurchaseParams is not supported for current ad type");
  }
  
  public final void a(sb paramsb)
  {
    com.google.android.gms.common.internal.c.b("setRewardedVideoAdListener can only be called from the UI thread.");
    f.A = paramsb;
  }
  
  protected final void a(ss paramss)
  {
    if (f.A == null) {
      return;
    }
    String str = "";
    int j = 1;
    if (paramss != null) {}
    try
    {
      str = a;
      j = b;
      f.A.a(new rv(str, j));
      return;
    }
    catch (RemoteException paramss)
    {
      tp.c("Could not call RewardedVideoAdListener.onRewarded().", paramss);
    }
  }
  
  public final void a(tg.a parama)
  {
    if ((b.n != -1L) && (!TextUtils.isEmpty(b.y)))
    {
      long l = b(b.y);
      if (l != -1L)
      {
        ??? = a.a(l + b.n);
        a.a((kk)???, new String[] { "stc" });
      }
    }
    km localkm = a;
    String str = b.y;
    if (a) {}
    synchronized (b)
    {
      c = str;
      a.a(b, new String[] { "arf" });
      c = a.a();
      a.a("gqi", b.z);
      f.g = null;
      f.k = parama;
      a(parama, a);
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
    if (f.o != null) {}
    try
    {
      f.o.a(paramString1, paramString2);
      return;
    }
    catch (RemoteException paramString1)
    {
      tp.c("Could not call the AppEventListener.", paramString1);
    }
  }
  
  public final void a(HashSet<th> paramHashSet)
  {
    f.I = paramHashSet;
  }
  
  public void a(boolean paramBoolean)
  {
    throw new UnsupportedOperationException("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
  }
  
  public boolean a(ih paramih)
  {
    com.google.android.gms.common.internal.c.b("loadAd must be called on the main UI thread.");
    Object localObject2 = w.j();
    ??? = ke.da;
    if (((Boolean)w.q().a((jz)???)).booleanValue()) {}
    for (;;)
    {
      synchronized (b)
      {
        ((hs)localObject2).a();
        w.e();
        tt.a.removeCallbacks(a);
        w.e();
        Handler localHandler = tt.a;
        localObject2 = a;
        jz localjz = ke.db;
        localHandler.postDelayed((Runnable)localObject2, ((Long)w.q().a(localjz)).longValue());
        ??? = ke.aR;
        if (((Boolean)w.q().a((jz)???)).booleanValue()) {
          ih.a(paramih);
        }
        ??? = paramih;
        if (f.b(f.c))
        {
          ??? = paramih;
          if (k != null)
          {
            paramih = new ii(paramih);
            j = null;
            ??? = new ih(7, a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, false);
          }
        }
        if ((f.g == null) && (f.h == null)) {
          break;
        }
        if (g != null)
        {
          tp.e("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
          g = ((ih)???);
          return false;
        }
      }
      tp.e("Loading already in progress, saving this object for future refreshes.");
    }
    tp.d("Starting ad request.");
    paramih = ke.T;
    a = new km(((Boolean)w.q().a(paramih)).booleanValue(), "load_ad", f.i.a);
    b = new kk(-1L, null, null);
    c = new kk(-1L, null, null);
    b = a.a();
    if (!f)
    {
      ip.a();
      paramih = String.valueOf(uk.a(f.c));
      tp.d(String.valueOf(paramih).length() + 71 + "Use AdRequest.Builder.addTestDevice(\"" + paramih + "\") to get test ads on this device.");
    }
    e.a = ((ih)???);
    d = a((ih)???, a);
    return d;
  }
  
  protected abstract boolean a(ih paramih, km paramkm);
  
  boolean a(tg paramtg)
  {
    return false;
  }
  
  public abstract boolean a(tg paramtg1, tg paramtg2);
  
  public void b(tg paramtg)
  {
    a.a(c, new String[] { "awr" });
    f.h = null;
    Object localObject3;
    if ((d != -2) && (d != 3))
    {
      ??? = w.i();
      localObject3 = f.I;
    }
    synchronized (a)
    {
      d.addAll((Collection)localObject3);
      if (d == -1)
      {
        d = false;
        return;
      }
    }
    if (a(paramtg)) {
      tp.b("Ad refresh scheduled.");
    }
    if (d != -2)
    {
      a(d);
      return;
    }
    if (f.D == null) {
      f.D = new tm(f.b);
    }
    h.a(f.j);
    boolean bool;
    if (a(f.j, paramtg))
    {
      f.j = paramtg;
      ??? = f;
      if (l != null)
      {
        long l;
        if (j != null)
        {
          localObject3 = l;
          l = j.A;
        }
        synchronized (c)
        {
          j = l;
          if (j != -1L) {
            a.a((th)localObject3);
          }
          localObject3 = l;
          l = j.B;
          synchronized (c)
          {
            if (j != -1L)
            {
              d = l;
              a.a((th)localObject3);
            }
            localObject3 = l;
            bool = j.n;
            synchronized (c)
            {
              if (j != -1L)
              {
                f = bool;
                a.a((th)localObject3);
              }
              ??? = l;
              bool = i.d;
            }
          }
        }
      }
    }
    for (;;)
    {
      synchronized (c)
      {
        if (j != -1L)
        {
          g = SystemClock.elapsedRealtime();
          if (!bool)
          {
            e = g;
            a.a((th)???);
          }
        }
        ??? = a;
        if (f.j.a())
        {
          ??? = "1";
          ((km)???).a("is_mraid", (String)???);
          ??? = a;
          if (!f.j.n) {
            break label733;
          }
          ??? = "1";
          ((km)???).a("is_mediation", (String)???);
          if ((f.j.b != null) && (f.j.b.l() != null))
          {
            ??? = a;
            if (!f.j.b.l().e()) {
              break label741;
            }
            ??? = "1";
            ((km)???).a("is_delay_pl", (String)???);
          }
          a.a(b, new String[] { "ttc" });
          if (w.i().e() != null) {
            w.i().e().a(a);
          }
          if (f.c()) {
            u();
          }
          if (I == null) {
            break;
          }
          w.e();
          tt.a(f.c, I);
          return;
          paramtg = finally;
          throw paramtg;
          paramtg = finally;
          throw paramtg;
          paramtg = finally;
          throw paramtg;
        }
      }
      ??? = "0";
      continue;
      label733:
      ??? = "0";
      continue;
      label741:
      ??? = "0";
    }
  }
  
  protected boolean b(ih paramih)
  {
    if (f.f == null) {
      return false;
    }
    paramih = f.f.getParent();
    if (!(paramih instanceof View)) {
      return false;
    }
    paramih = (View)paramih;
    w.e();
    return tt.a(paramih, paramih.getContext());
  }
  
  public final void c(ih paramih)
  {
    if (b(paramih))
    {
      a(paramih);
      return;
    }
    tp.d("Ad is not visible. Not refreshing ad.");
    e.a(paramih);
  }
  
  protected final void c(tg paramtg)
  {
    if (paramtg == null) {
      tp.e("Ad state was null when trying to ping impression URLs.");
    }
    for (;;)
    {
      return;
      tp.b("Pinging Impression URLs.");
      if (f.l != null) {
        ??? = f.l;
      }
      synchronized (c)
      {
        if ((j != -1L) && (e == -1L))
        {
          e = SystemClock.elapsedRealtime();
          a.a((th)???);
        }
        tk localtk = a.d();
        synchronized (f)
        {
          i += 1;
          if ((e == null) || (F)) {
            continue;
          }
          ??? = w.D().d(f.c);
          w.e();
          tt.a(f.c, f.e.a, a((String)???, e));
          F = true;
          d(paramtg);
          if (e.size() <= 0) {
            continue;
          }
          w.D().b(f.c, (String)???);
          return;
        }
      }
    }
  }
  
  public void e()
  {
    if (f.j == null) {
      tp.e("Ad state was null when trying to ping click URLs.");
    }
    for (;;)
    {
      return;
      tp.b("Pinging click URLs.");
      th localth;
      if (f.l != null) {
        localth = f.l;
      }
      synchronized (c)
      {
        tk localtk;
        if (j != -1L)
        {
          ??? = new th.a();
          a = SystemClock.elapsedRealtime();
          b.add(???);
          h += 1L;
          localtk = a.d();
        }
        synchronized (f)
        {
          h += 1;
          a.a(localth);
          if (f.j.c != null)
          {
            ??? = w.D().d(f.c);
            w.e();
            tt.a(f.c, f.e.a, a((String)???, f.j.c));
            if (f.j.c.size() > 0) {
              w.D().a(f.c, (String)???);
            }
          }
          if (f.m == null) {
            continue;
          }
          try
          {
            f.m.a();
            return;
          }
          catch (RemoteException localRemoteException)
          {
            tp.c("Could not notify onAdClicked event.", localRemoteException);
            return;
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
    com.google.android.gms.common.internal.c.b("destroy must be called on the main UI thread.");
    e.a();
    Object localObject2 = h;
    tg localtg = f.j;
    synchronized (a)
    {
      localObject2 = (gw)b.get(localtg);
      if (localObject2 != null) {
        ((gw)localObject2).d();
      }
      ??? = f;
      if (f != null)
      {
        localObject2 = f;
        tp.a("Disable position monitoring on adFrame.");
        if (b != null) {
          b.b();
        }
      }
      n = null;
      o = null;
      r = null;
      q = null;
      z = null;
      p = null;
      ((x)???).a(false);
      if (f != null) {
        f.removeAllViews();
      }
      ((x)???).a();
      ((x)???).b();
      j = null;
      return;
    }
  }
  
  public final com.google.android.gms.a.a i()
  {
    com.google.android.gms.common.internal.c.b("getAdFrame must be called on the main UI thread.");
    return b.a(f.f);
  }
  
  public final il j()
  {
    com.google.android.gms.common.internal.c.b("getAdSize must be called on the main UI thread.");
    if (f.i == null) {
      return null;
    }
    return new jr(f.i);
  }
  
  public final boolean k()
  {
    com.google.android.gms.common.internal.c.b("isLoaded must be called on the main UI thread.");
    return (f.g == null) && (f.h == null) && (f.j != null);
  }
  
  public final void l()
  {
    com.google.android.gms.common.internal.c.b("recordManualImpression must be called on the main UI thread.");
    if (f.j == null) {
      tp.e("Ad state was null when trying to ping manual tracking URLs.");
    }
    do
    {
      return;
      tp.b("Pinging manual tracking URLs.");
    } while ((f.j.f == null) || (f.j.G));
    w.e();
    tt.a(f.c, f.e.a, f.j.f);
    f.j.G = true;
    w();
  }
  
  public void m()
  {
    com.google.android.gms.common.internal.c.b("pause must be called on the main UI thread.");
  }
  
  public void n()
  {
    com.google.android.gms.common.internal.c.b("resume must be called on the main UI thread.");
  }
  
  public final void o()
  {
    com.google.android.gms.common.internal.c.b("stopLoading must be called on the main UI thread.");
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
    if (f.n != null) {}
    try
    {
      f.n.a();
      if (f.A == null) {}
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          f.A.d();
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          tp.c("Could not call RewardedVideoAdListener.onRewardedVideoAdClosed().", localRemoteException2);
        }
        localRemoteException1 = localRemoteException1;
        tp.c("Could not call AdListener.onAdClosed().", localRemoteException1);
      }
    }
  }
  
  protected final void s()
  {
    tp.d("Ad leaving application.");
    if (f.n != null) {}
    try
    {
      f.n.b();
      if (f.A == null) {}
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          f.A.e();
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          tp.c("Could not call  RewardedVideoAdListener.onRewardedVideoAdLeftApplication().", localRemoteException2);
        }
        localRemoteException1 = localRemoteException1;
        tp.c("Could not call AdListener.onAdLeftApplication().", localRemoteException1);
      }
    }
  }
  
  protected final void t()
  {
    tp.d("Ad opening.");
    if (f.n != null) {}
    try
    {
      f.n.d();
      if (f.A == null) {}
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          f.A.b();
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          tp.c("Could not call RewardedVideoAdListener.onRewardedVideoAdOpened().", localRemoteException2);
        }
        localRemoteException1 = localRemoteException1;
        tp.c("Could not call AdListener.onAdOpened().", localRemoteException1);
      }
    }
  }
  
  protected void u()
  {
    tp.d("Ad finished loading.");
    d = false;
    if (f.n != null) {}
    try
    {
      f.n.c();
      if (f.A == null) {}
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          f.A.a();
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          tp.c("Could not call RewardedVideoAdListener.onRewardedVideoAdLoaded().", localRemoteException2);
        }
        localRemoteException1 = localRemoteException1;
        tp.c("Could not call AdListener.onAdLoaded().", localRemoteException1);
      }
    }
  }
  
  protected final void v()
  {
    if (f.A == null) {
      return;
    }
    try
    {
      f.A.c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      tp.c("Could not call RewardedVideoAdListener.onVideoStarted().", localRemoteException);
    }
  }
  
  public final void w()
  {
    d(f.j);
  }
}


/* Location:              com/google/android/gms/ads/internal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */