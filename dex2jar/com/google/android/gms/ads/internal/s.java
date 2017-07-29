package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.g.k;
import com.google.android.gms.b.gv;
import com.google.android.gms.b.gw.a;
import com.google.android.gms.b.ih;
import com.google.android.gms.b.il;
import com.google.android.gms.b.jt;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.km;
import com.google.android.gms.b.kq;
import com.google.android.gms.b.kw;
import com.google.android.gms.b.kx;
import com.google.android.gms.b.ky;
import com.google.android.gms.b.la;
import com.google.android.gms.b.lc;
import com.google.android.gms.b.lc.a;
import com.google.android.gms.b.le;
import com.google.android.gms.b.lh;
import com.google.android.gms.b.lq;
import com.google.android.gms.b.lr;
import com.google.android.gms.b.ls;
import com.google.android.gms.b.lt;
import com.google.android.gms.b.ns;
import com.google.android.gms.b.oc;
import com.google.android.gms.b.od;
import com.google.android.gms.b.og;
import com.google.android.gms.b.oh;
import com.google.android.gms.b.ph;
import com.google.android.gms.b.pt;
import com.google.android.gms.b.pz;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.tg;
import com.google.android.gms.b.tg.a;
import com.google.android.gms.b.tj;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.un;
import com.google.android.gms.b.vc;
import com.google.android.gms.b.vi;
import com.google.android.gms.common.internal.c;
import java.util.List;

@qi
public final class s
  extends b
{
  public vc l;
  
  public s(Context paramContext, e parame, il paramil, String paramString, oc paramoc, un paramun)
  {
    super(paramContext, paramil, paramString, paramoc, paramun, parame);
  }
  
  private void a(final kw paramkw)
  {
    tt.a.post(new Runnable()
    {
      public final void run()
      {
        try
        {
          if (f.s != null) {
            f.s.a(paramkw);
          }
          return;
        }
        catch (RemoteException localRemoteException)
        {
          tp.c("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", localRemoteException);
        }
      }
    });
  }
  
  private void a(final kx paramkx)
  {
    tt.a.post(new Runnable()
    {
      public final void run()
      {
        try
        {
          if (f.t != null) {
            f.t.a(paramkx);
          }
          return;
        }
        catch (RemoteException localRemoteException)
        {
          tp.c("Could not call OnContentAdLoadedListener.onContentAdLoaded().", localRemoteException);
        }
      }
    });
  }
  
  public final void G()
  {
    throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
  }
  
  public final void J()
  {
    if ((f.j != null) && (l != null))
    {
      ic.a(f.i, f.j, l.b(), l);
      return;
    }
    tp.e("Request to enable ActiveView before adState is available.");
  }
  
  public final String K()
  {
    return f.b;
  }
  
  public final k<String, lt> L()
  {
    c.b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
    return f.v;
  }
  
  public final void M()
  {
    if ((l != null) && (l.z() != null) && (f.w != null) && (f.w.f != null)) {
      l.z().b(f.w.f.a);
    }
  }
  
  public final boolean N()
  {
    return (f.j != null) && (f.j.n) && (f.j.r != null) && (f.j.r.o);
  }
  
  public final void a(k<String, lt> paramk)
  {
    c.b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
    f.v = paramk;
  }
  
  public final void a(kq paramkq)
  {
    throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
  }
  
  public final void a(lc paramlc)
  {
    if (f.j.j != null) {
      ic.a(f.i, f.j, new gw.a(paramlc), null);
    }
  }
  
  public final void a(le paramle)
  {
    c.b("setNativeAdOptions must be called on the main UI thread.");
    f.w = paramle;
  }
  
  public final void a(lq paramlq)
  {
    c.b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
    f.s = paramlq;
  }
  
  public final void a(lr paramlr)
  {
    c.b("setOnContentAdLoadedListener must be called on the main UI thread.");
    f.t = paramlr;
  }
  
  public final void a(ph paramph)
  {
    throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
  }
  
  public final void a(final tg.a parama, km paramkm)
  {
    if (d != null) {
      f.i = d;
    }
    if (e != -2)
    {
      tt.a.post(new Runnable()
      {
        public final void run()
        {
          b(new tg(parama));
        }
      });
      return;
    }
    f.F = 0;
    x localx = f;
    w.d();
    h = pt.a(f.c, this, parama, f.d, null, j, this, paramkm);
    parama = String.valueOf(f.h.getClass().getName());
    if (parama.length() != 0) {}
    for (parama = "AdRenderer: ".concat(parama);; parama = new String("AdRenderer: "))
    {
      tp.b(parama);
      return;
    }
  }
  
  public final void a(List<String> paramList)
  {
    c.b("setNativeTemplates must be called on the main UI thread.");
    f.B = paramList;
  }
  
  public final boolean a(ih paramih, km paramkm)
  {
    Object localObject = ke.cg;
    if (((Boolean)w.q().a((jz)localObject)).booleanValue())
    {
      localObject = ke.ch;
      if (((Boolean)w.q().a((jz)localObject)).booleanValue())
      {
        localObject = new pz(f.c, this, f.d, f.e);
        ((pz)localObject).a();
      }
    }
    try
    {
      ((pz)localObject).b();
      return super.a(paramih, paramkm);
    }
    catch (Exception paramih)
    {
      tp.c("Initializing javascript failed", paramih);
    }
    return false;
  }
  
  protected final boolean a(ih paramih, tg paramtg, boolean paramBoolean)
  {
    return e.b;
  }
  
  protected final boolean a(tg paramtg1, final tg paramtg2)
  {
    a(null);
    if (!f.c()) {
      throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
    }
    if (n) {}
    for (;;)
    {
      try
      {
        if (p == null) {
          continue;
        }
        localObject1 = p.h();
        if (p == null) {
          continue;
        }
        localObject3 = p.i();
        if ((localObject1 == null) || (f.s == null)) {
          continue;
        }
        str1 = ((og)localObject1).a();
        localList = ((og)localObject1).b();
        str2 = ((og)localObject1).c();
        if (((og)localObject1).d() == null) {
          continue;
        }
        localObject3 = ((og)localObject1).d();
        localObject3 = new kw(str1, localList, str2, (lh)localObject3, ((og)localObject1).e(), ((og)localObject1).f(), ((og)localObject1).g(), ((og)localObject1).h(), null, ((og)localObject1).l(), ((og)localObject1).m(), null);
        ((kw)localObject3).a(new la(f.c, this, f.d, (og)localObject1, (lc.a)localObject3));
        a((kw)localObject3);
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject1;
        Object localObject3;
        String str1;
        List localList;
        String str2;
        tp.c("Failed to get native ad mapper", localRemoteException);
        continue;
        localObject2 = null;
        continue;
        tp.e("No matching mapper/listener for retrieved native ad template.");
        a(0);
        return false;
      }
      return super.a(paramtg1, paramtg2);
      localObject1 = null;
      continue;
      localObject3 = null;
      continue;
      localObject3 = null;
      continue;
      if ((localObject3 != null) && (f.t != null))
      {
        str1 = ((oh)localObject3).a();
        localList = ((oh)localObject3).b();
        str2 = ((oh)localObject3).c();
        if (((oh)localObject3).d() != null)
        {
          localObject1 = ((oh)localObject3).d();
          localObject1 = new kx(str1, localList, str2, (lh)localObject1, ((oh)localObject3).e(), ((oh)localObject3).f(), null, ((oh)localObject3).j(), ((oh)localObject3).l(), null);
          ((kx)localObject1).a(new la(f.c, this, f.d, (oh)localObject3, (lc.a)localObject1));
          a((kx)localObject1);
          continue;
        }
      }
      final Object localObject2 = E;
      if (((localObject2 instanceof kx)) && (f.t != null))
      {
        a((kx)E);
      }
      else if (((localObject2 instanceof kw)) && (f.s != null))
      {
        a((kw)E);
      }
      else
      {
        if ((!(localObject2 instanceof ky)) || (f.v == null) || (f.v.get(((ky)localObject2).l()) == null)) {
          break;
        }
        localObject2 = ((ky)localObject2).l();
        tt.a.post(new Runnable()
        {
          public final void run()
          {
            try
            {
              ((lt)f.v.get(localObject2)).a((ky)paramtg2E);
              return;
            }
            catch (RemoteException localRemoteException)
            {
              tp.c("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", localRemoteException);
            }
          }
        });
      }
    }
    tp.e("No matching listener for retrieved native ad template.");
    a(0);
    return false;
  }
  
  public final ls b(String paramString)
  {
    c.b("getOnCustomClickListener must be called on the main UI thread.");
    return (ls)f.u.get(paramString);
  }
  
  public final void b(k<String, ls> paramk)
  {
    c.b("setOnCustomClickListener must be called on the main UI thread.");
    f.u = paramk;
  }
  
  public final void m()
  {
    throw new IllegalStateException("Native Ad DOES NOT support pause().");
  }
  
  public final void n()
  {
    throw new IllegalStateException("Native Ad DOES NOT support resume().");
  }
}


/* Location:              com/google/android/gms/ads/internal/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */