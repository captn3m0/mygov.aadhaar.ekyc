package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.h;
import com.google.android.gms.b.gv;
import com.google.android.gms.b.hb;
import com.google.android.gms.b.ih;
import com.google.android.gms.b.il;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.km;
import com.google.android.gms.b.mh;
import com.google.android.gms.b.mn;
import com.google.android.gms.b.mn.a;
import com.google.android.gms.b.nr;
import com.google.android.gms.b.ns;
import com.google.android.gms.b.oc;
import com.google.android.gms.b.od;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.qo;
import com.google.android.gms.b.qr;
import com.google.android.gms.b.ri;
import com.google.android.gms.b.ss;
import com.google.android.gms.b.sx;
import com.google.android.gms.b.sz;
import com.google.android.gms.b.ta;
import com.google.android.gms.b.tg;
import com.google.android.gms.b.tg.a;
import com.google.android.gms.b.to;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.tu;
import com.google.android.gms.b.uc;
import com.google.android.gms.b.un;
import com.google.android.gms.b.vc;
import com.google.android.gms.b.vd;
import com.google.android.gms.b.vd.c;
import com.google.android.gms.b.ve;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

@qi
public final class m
  extends c
  implements mh, mn.a
{
  protected transient boolean l = false;
  private int m = -1;
  private boolean n;
  private float o;
  private final sz p;
  
  public m(Context paramContext, il paramil, String paramString, oc paramoc, un paramun, e parame)
  {
    super(paramContext, paramil, paramString, paramoc, paramun, parame);
    if (w.D().c()) {}
    for (paramContext = new sz(paramContext, paramString);; paramContext = null)
    {
      p = paramContext;
      return;
    }
  }
  
  private void a(Bundle paramBundle)
  {
    w.e();
    tt.b(f.c, f.e.a, "gmob-apps", paramBundle, false);
  }
  
  private static tg.a b(tg.a parama)
  {
    try
    {
      Object localObject1 = ri.a(b).toString();
      Object localObject2 = new JSONObject();
      ((JSONObject)localObject2).put("pubid", a.e);
      localObject2 = ((JSONObject)localObject2).toString();
      localObject2 = new nr((String)localObject1, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), Collections.emptyList(), Collections.emptyList(), (String)localObject2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
      localObject1 = b;
      localObject2 = Collections.singletonList(localObject2);
      jz localjz = ke.bG;
      localObject2 = new ns((List)localObject2, ((Long)w.q().a(localjz)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), J, K, "");
      localObject1 = new qr(a, b, c, Collections.emptyList(), Collections.emptyList(), g, true, i, Collections.emptyList(), k, l, m, n, o, p, q, null, s, t, u, v, w, z, A, B, null, Collections.emptyList(), Collections.emptyList(), F, G, H, I, J, K, L, null, N, O, P);
      return new tg.a(a, (qr)localObject1, (ns)localObject2, d, e, f, g, null);
    }
    catch (JSONException localJSONException)
    {
      tp.b("Unable to generate ad state for an interstitial ad with pooling.", localJSONException);
    }
    return parama;
  }
  
  public final void G()
  {
    com.google.android.gms.common.internal.c.b("showInterstitial must be called on the main UI thread.");
    if (f.j == null)
    {
      tp.e("The interstitial has not loaded.");
      return;
    }
    Object localObject1 = ke.br;
    if (((Boolean)w.q().a((jz)localObject1)).booleanValue()) {
      if (f.c.getApplicationContext() == null) {
        break label241;
      }
    }
    Object localObject3;
    label241:
    for (localObject1 = f.c.getApplicationContext().getPackageName();; localObject2 = f.c.getPackageName())
    {
      if (!l)
      {
        tp.e("It is not recommended to show an interstitial before onAdLoaded completes.");
        localObject3 = new Bundle();
        ((Bundle)localObject3).putString("appid", (String)localObject1);
        ((Bundle)localObject3).putString("action", "show_interstitial_before_load_finish");
        a((Bundle)localObject3);
      }
      w.e();
      if (!tt.e(f.c))
      {
        tp.e("It is not recommended to show an interstitial when app is not in foreground.");
        localObject3 = new Bundle();
        ((Bundle)localObject3).putString("appid", (String)localObject1);
        ((Bundle)localObject3).putString("action", "show_interstitial_app_not_in_foreground");
        a((Bundle)localObject3);
      }
      if (f.d()) {
        break;
      }
      if ((!f.j.n) || (f.j.p == null)) {
        break label255;
      }
      try
      {
        f.j.p.b();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        tp.c("Could not show interstitial.", localRemoteException);
        O();
        return;
      }
    }
    label255:
    if (f.j.b == null)
    {
      tp.e("The interstitial failed to load.");
      return;
    }
    if (f.j.b.p())
    {
      tp.e("The interstitial is already showing.");
      return;
    }
    f.j.b.a(true);
    if (f.j.j != null) {
      h.a(f.i, f.j);
    }
    int i = Build.VERSION.SDK_INT;
    final Object localObject2 = f.j;
    if (((tg)localObject2).a())
    {
      new hb(f.c, b.b()).a(b);
      if (!f.H) {
        break label513;
      }
      w.e();
      localObject2 = tt.f(f.c);
      label424:
      localObject3 = w.z();
      if (localObject2 != null) {
        break label518;
      }
      tp.b("Bitmap is null. Skipping putting into the Memory Map.");
    }
    for (i = -1;; i = b.getAndIncrement())
    {
      m = i;
      localObject3 = ke.bU;
      if ((!((Boolean)w.q().a((jz)localObject3)).booleanValue()) || (localObject2 == null)) {
        break label553;
      }
      new a(m).c();
      return;
      b.l().e = new vd.c()
      {
        public final void a()
        {
          new hb(f.c, localObject2b.b()).a(localObject2b);
        }
      };
      break;
      label513:
      localObject2 = null;
      break label424;
      label518:
      a.put(Integer.valueOf(b.get()), localObject2);
    }
    label553:
    localObject2 = new n(f.H, N(), false, 0.0F, -1);
    int j = f.j.b.q();
    i = j;
    if (j == -1) {
      i = f.j.g;
    }
    localObject2 = new AdOverlayInfoParcel(this, this, this, f.j.b, i, f.e, f.j.C, (n)localObject2);
    w.c();
    h.a(f.c, (AdOverlayInfoParcel)localObject2, true);
  }
  
  protected final boolean N()
  {
    if (!(f.c instanceof Activity)) {
      return false;
    }
    Window localWindow = ((Activity)f.c).getWindow();
    if ((localWindow == null) || (localWindow.getDecorView() == null)) {
      return false;
    }
    Rect localRect1 = new Rect();
    Rect localRect2 = new Rect();
    localWindow.getDecorView().getGlobalVisibleRect(localRect1, null);
    localWindow.getDecorView().getWindowVisibleDisplayFrame(localRect2);
    return (bottom != 0) && (bottom != 0) && (top == top);
  }
  
  public final void O()
  {
    uc localuc = w.z();
    int i = m;
    a.remove(Integer.valueOf(i));
    if (f.c())
    {
      f.a();
      f.j = null;
      f.H = false;
      l = false;
    }
  }
  
  public final void P()
  {
    if ((f.j != null) && (f.j.y != null))
    {
      w.e();
      tt.a(f.c, f.e.a, f.j.y);
    }
    v();
  }
  
  protected final vc a(tg.a parama, f paramf, sx paramsx)
  {
    w.f();
    vc localvc = ve.a(f.c, f.i, false, false, f.d, f.e, a, this, i);
    vd localvd = localvc.l();
    jz localjz = ke.ap;
    localvd.a(this, null, this, this, ((Boolean)w.q().a(localjz)).booleanValue(), this, this, paramf, null, paramsx);
    a(localvc);
    localvc.b(a.v);
    localvc.l().a("/reward", new mn(this));
    return localvc;
  }
  
  public final void a()
  {
    super.a();
    if (w.D().c()) {
      p.a(false);
    }
  }
  
  public final void a(tg.a parama, km paramkm)
  {
    int j = 1;
    Object localObject = ke.aW;
    if (!((Boolean)w.q().a((jz)localObject)).booleanValue())
    {
      super.a(parama, paramkm);
      return;
    }
    if (e != -2)
    {
      super.a(parama, paramkm);
      return;
    }
    localObject = a.c.m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
    int i;
    if ((localObject == null) || (!((Bundle)localObject).containsKey("gw")))
    {
      i = 1;
      if (b.h) {
        break label131;
      }
    }
    for (;;)
    {
      if ((i != 0) && (j != 0)) {
        f.k = b(parama);
      }
      super.a(f.k, paramkm);
      return;
      i = 0;
      break;
      label131:
      j = 0;
    }
  }
  
  public final void a(boolean paramBoolean, float paramFloat)
  {
    n = paramBoolean;
    o = paramFloat;
  }
  
  public final boolean a(ih paramih, km paramkm)
  {
    if (f.j != null)
    {
      tp.e("An interstitial is already loading. Aborting.");
      return false;
    }
    return super.a(paramih, paramkm);
  }
  
  protected final boolean a(ih paramih, tg paramtg, boolean paramBoolean)
  {
    if ((f.c()) && (b != null))
    {
      w.g();
      tu.a(b);
    }
    return e.b;
  }
  
  public final boolean a(tg paramtg1, tg paramtg2)
  {
    if (!super.a(paramtg1, paramtg2)) {
      return false;
    }
    if ((!f.c()) && (f.E != null) && (j != null)) {
      h.a(f.i, paramtg2, f.E);
    }
    return true;
  }
  
  public final void b(ss paramss)
  {
    ss localss = paramss;
    if (f.j != null)
    {
      if (f.j.z != null)
      {
        w.e();
        tt.a(f.c, f.e.a, f.j.z);
      }
      localss = paramss;
      if (f.j.x != null) {
        localss = f.j.x;
      }
    }
    a(localss);
  }
  
  public final void b(boolean paramBoolean)
  {
    f.H = paramBoolean;
  }
  
  public final void d()
  {
    E();
    super.d();
    Object localObject1;
    if ((f.j != null) && (f.j.b != null))
    {
      localObject1 = f.j.b.l();
      if (localObject1 != null) {
        ((vd)localObject1).g();
      }
    }
    Object localObject2;
    ta localta;
    Context localContext;
    if (w.D().c())
    {
      localObject2 = w.D().a(f.c);
      localta = w.D();
      localContext = f.c;
      localObject1 = f.b;
      if ((localta.a()) && ((localContext instanceof Activity)) && (!TextUtils.isEmpty((CharSequence)localObject2))) {
        break label236;
      }
    }
    try
    {
      for (;;)
      {
        localObject2 = localContext.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
        Object localObject3 = ((Class)localObject2).getDeclaredMethod("getInstance", new Class[] { Context.class }).invoke(null, new Object[] { localContext });
        Activity localActivity = (Activity)localContext;
        ((Class)localObject2).getDeclaredMethod("setCurrentScreen", new Class[] { Activity.class, String.class, String.class }).invoke(localObject3, new Object[] { localActivity, localObject1, localContext.getPackageName() });
        p.a(true);
        return;
        label236:
        localObject1 = String.valueOf(localObject1).length() + 1 + String.valueOf(localObject2).length() + (String)localObject1 + "_" + (String)localObject2;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localta.a(localException, "setCurrentScreen");
      }
    }
  }
  
  protected final void r()
  {
    O();
    super.r();
  }
  
  protected final void u()
  {
    super.u();
    l = true;
  }
  
  @qi
  private final class a
    extends to
  {
    private final int b;
    
    public a(int paramInt)
    {
      b = paramInt;
    }
    
    public final void a()
    {
      boolean bool1 = fH;
      boolean bool2 = N();
      boolean bool3 = m.a(m.this);
      float f = m.b(m.this);
      int i;
      final Object localObject;
      if (fH)
      {
        i = b;
        localObject = new n(bool1, bool2, bool3, f, i);
        i = fj.b.q();
        if (i != -1) {
          break label192;
        }
        i = fj.g;
      }
      label192:
      for (;;)
      {
        localObject = new AdOverlayInfoParcel(m.this, m.this, m.this, fj.b, i, fe, fj.C, (n)localObject);
        tt.a.post(new Runnable()
        {
          public final void run()
          {
            w.c();
            h.a(f.c, localObject, true);
          }
        });
        return;
        i = -1;
        break;
      }
    }
    
    public final void c_() {}
  }
}


/* Location:              com/google/android/gms/ads/internal/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */