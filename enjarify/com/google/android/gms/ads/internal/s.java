package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.g.k;
import android.view.View;
import com.google.android.gms.b.dw;
import com.google.android.gms.b.gv;
import com.google.android.gms.b.gw.a;
import com.google.android.gms.b.ih;
import com.google.android.gms.b.il;
import com.google.android.gms.b.jf;
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
import com.google.android.gms.b.ns;
import com.google.android.gms.b.oc;
import com.google.android.gms.b.od;
import com.google.android.gms.b.og;
import com.google.android.gms.b.oh;
import com.google.android.gms.b.ph;
import com.google.android.gms.b.pt;
import com.google.android.gms.b.pz;
import com.google.android.gms.b.tg;
import com.google.android.gms.b.tg.a;
import com.google.android.gms.b.tj;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.tv;
import com.google.android.gms.b.un;
import com.google.android.gms.b.vc;
import com.google.android.gms.b.vi;
import com.google.android.gms.common.internal.c;
import java.util.List;

public final class s
  extends b
{
  public vc l;
  
  public s(Context paramContext, e parame, il paramil, String paramString, oc paramoc, un paramun)
  {
    super(paramContext, paramil, paramString, paramoc, paramun, parame);
  }
  
  private void a(kw paramkw)
  {
    Handler localHandler = tt.a;
    s.2 local2 = new com/google/android/gms/ads/internal/s$2;
    local2.<init>(this, paramkw);
    localHandler.post(local2);
  }
  
  private void a(kx paramkx)
  {
    Handler localHandler = tt.a;
    s.3 local3 = new com/google/android/gms/ads/internal/s$3;
    local3.<init>(this, paramkx);
    localHandler.post(local3);
  }
  
  public final void G()
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Interstitial is NOT supported by NativeAdManager.");
    throw localIllegalStateException;
  }
  
  public final void J()
  {
    Object localObject = f.j;
    if (localObject != null)
    {
      localObject = l;
      if (localObject != null)
      {
        localObject = ic;
        il localil = f.i;
        tg localtg = f.j;
        View localView = l.b();
        vc localvc = l;
        ((gv)localObject).a(localil, localtg, localView, localvc);
      }
    }
    for (;;)
    {
      return;
      localObject = "Request to enable ActiveView before adState is available.";
      tp.e((String)localObject);
    }
  }
  
  public final String K()
  {
    return f.b;
  }
  
  public final k L()
  {
    c.b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
    return f.v;
  }
  
  public final void M()
  {
    Object localObject = l;
    if (localObject != null)
    {
      localObject = l.z();
      if (localObject != null)
      {
        localObject = f.w;
        if (localObject != null)
        {
          localObject = f.w.f;
          if (localObject != null)
          {
            localObject = l.z();
            jt localjt = f.w.f;
            boolean bool = a;
            ((vi)localObject).b(bool);
          }
        }
      }
    }
  }
  
  public final boolean N()
  {
    Object localObject = f.j;
    boolean bool;
    if (localObject != null)
    {
      localObject = f.j;
      bool = n;
      if (bool)
      {
        localObject = f.j.r;
        if (localObject != null)
        {
          localObject = f.j.r;
          bool = o;
          if (bool) {
            bool = true;
          }
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
  
  public final void a(k paramk)
  {
    c.b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
    f.v = paramk;
  }
  
  public final void a(kq paramkq)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("CustomRendering is NOT supported by NativeAdManager.");
    throw localIllegalStateException;
  }
  
  public final void a(lc paramlc)
  {
    Object localObject = f.j.j;
    if (localObject != null)
    {
      localObject = ic;
      il localil = f.i;
      tg localtg = f.j;
      gw.a locala = new com/google/android/gms/b/gw$a;
      locala.<init>(paramlc);
      ((gv)localObject).a(localil, localtg, locala, null);
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
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("In App Purchase is NOT supported by NativeAdManager.");
    throw localIllegalStateException;
  }
  
  public final void a(tg.a parama, km paramkm)
  {
    Object localObject1 = d;
    if (localObject1 != null)
    {
      localObject1 = f;
      localObject2 = d;
      i = ((il)localObject2);
    }
    int i = e;
    int j = -2;
    if (i != j)
    {
      localObject1 = tt.a;
      localObject2 = new com/google/android/gms/ads/internal/s$1;
      ((s.1)localObject2).<init>(this, parama);
      ((Handler)localObject1).post((Runnable)localObject2);
      return;
    }
    localObject1 = f;
    j = 0;
    F = 0;
    x localx = f;
    w.d();
    localObject1 = f.c;
    dw localdw = f.d;
    oc localoc = this.j;
    Object localObject2 = this;
    localObject1 = pt.a((Context)localObject1, this, parama, localdw, null, localoc, this, paramkm);
    h = ((tv)localObject1);
    localObject2 = "AdRenderer: ";
    localObject1 = String.valueOf(f.h.getClass().getName());
    int k = ((String)localObject1).length();
    if (k != 0) {
      localObject1 = ((String)localObject2).concat((String)localObject1);
    }
    for (;;)
    {
      tp.b((String)localObject1);
      break;
      localObject1 = new java/lang/String;
      ((String)localObject1).<init>((String)localObject2);
    }
  }
  
  public final void a(List paramList)
  {
    c.b("setNativeTemplates must be called on the main UI thread.");
    f.B = paramList;
  }
  
  public final boolean a(ih paramih, km paramkm)
  {
    Object localObject1 = ke.cg;
    localObject3 = w.q();
    localObject1 = (Boolean)((kd)localObject3).a((jz)localObject1);
    bool = ((Boolean)localObject1).booleanValue();
    if (bool)
    {
      localObject1 = ke.ch;
      localObject3 = w.q();
      localObject1 = (Boolean)((kd)localObject3).a((jz)localObject1);
      bool = ((Boolean)localObject1).booleanValue();
      if (bool)
      {
        localObject1 = new com/google/android/gms/b/pz;
        localObject3 = f.c;
        dw localdw = f.d;
        un localun = f.e;
        ((pz)localObject1).<init>((Context)localObject3, this, localdw, localun);
        ((pz)localObject1).a();
      }
    }
    try
    {
      ((pz)localObject1).b();
      bool = super.a(paramih, paramkm);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localObject3 = "Initializing javascript failed";
        tp.c((String)localObject3, localException);
        bool = false;
        Object localObject2 = null;
      }
    }
    return bool;
  }
  
  protected final boolean a(ih paramih, tg paramtg, boolean paramBoolean)
  {
    return e.b;
  }
  
  protected final boolean a(tg paramtg1, tg paramtg2)
  {
    a(null);
    Object localObject1 = f;
    boolean bool = ((x)localObject1).c();
    if (!bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Native ad DOES NOT have custom rendering mode.");
      throw ((Throwable)localObject1);
    }
    bool = n;
    label93:
    Object localObject5;
    Object localObject6;
    if (bool)
    {
      try
      {
        localObject1 = p;
        if (localObject1 == null) {
          break label322;
        }
        localObject1 = p;
        localObject1 = ((od)localObject1).h();
        localObject3 = localObject1;
        localObject1 = p;
        if (localObject1 == null) {
          break label333;
        }
        localObject1 = p;
        localObject1 = ((od)localObject1).i();
        localObject4 = localObject1;
        if (localObject3 == null) {
          break label350;
        }
        localObject1 = f;
        localObject1 = s;
        if (localObject1 == null) {
          break label350;
        }
        localObject1 = new com/google/android/gms/b/kw;
        localObject5 = ((og)localObject3).a();
        localObject6 = ((og)localObject3).b();
        localObject7 = ((og)localObject3).c();
        localObject8 = ((og)localObject3).d();
        if (localObject8 == null) {
          break label344;
        }
        localObject8 = ((og)localObject3).d();
        label166:
        localObject9 = ((og)localObject3).e();
        double d = ((og)localObject3).f();
        localObject10 = ((og)localObject3).g();
        localObject11 = ((og)localObject3).h();
        localObject4 = ((og)localObject3).l();
        jf localjf = ((og)localObject3).m();
        ((kw)localObject1).<init>((String)localObject5, (List)localObject6, (String)localObject7, (lh)localObject8, (String)localObject9, d, (String)localObject10, (String)localObject11, null, (Bundle)localObject4, localjf, null);
        localObject5 = new com/google/android/gms/b/la;
        localObject6 = f;
        localObject6 = c;
        localObject7 = f;
        localObject8 = d;
        localObject7 = this;
        localObject9 = localObject3;
        localObject12 = localObject1;
        ((la)localObject5).<init>((Context)localObject6, this, (dw)localObject8, (og)localObject3, (lc.a)localObject1);
        ((kw)localObject1).a((lc)localObject5);
        a((kw)localObject1);
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          Object localObject3;
          Object localObject4;
          Object localObject7;
          Object localObject9;
          Object localObject10;
          Object localObject11;
          Object localObject12;
          label311:
          localObject5 = "Failed to get native ad mapper";
          tp.c((String)localObject5, localRemoteException);
          continue;
          Object localObject8 = null;
          continue;
          localObject2 = "No matching mapper/listener for retrieved native ad template.";
          tp.e((String)localObject2);
          bool = false;
          localObject2 = null;
          a(0);
          bool = false;
          localObject2 = null;
        }
      }
      bool = super.a(paramtg1, paramtg2);
    }
    for (;;)
    {
      return bool;
      label322:
      bool = false;
      localObject1 = null;
      localObject3 = null;
      break;
      label333:
      bool = false;
      localObject1 = null;
      localObject4 = null;
      break label93;
      label344:
      localObject8 = null;
      break label166;
      label350:
      if (localObject4 != null)
      {
        localObject1 = f;
        localObject1 = t;
        if (localObject1 != null)
        {
          localObject1 = new com/google/android/gms/b/kx;
          localObject5 = ((oh)localObject4).a();
          localObject6 = ((oh)localObject4).b();
          localObject7 = ((oh)localObject4).c();
          localObject8 = ((oh)localObject4).d();
          if (localObject8 != null)
          {
            localObject8 = ((oh)localObject4).d();
            localObject9 = ((oh)localObject4).e();
            localObject12 = ((oh)localObject4).f();
            localObject10 = ((oh)localObject4).j();
            localObject11 = ((oh)localObject4).l();
            ((kx)localObject1).<init>((String)localObject5, (List)localObject6, (String)localObject7, (lh)localObject8, (String)localObject9, (String)localObject12, null, (Bundle)localObject10, (jf)localObject11, null);
            localObject5 = new com/google/android/gms/b/la;
            localObject6 = f;
            localObject6 = c;
            localObject7 = f;
            localObject8 = d;
            localObject7 = this;
            localObject9 = localObject4;
            localObject12 = localObject1;
            ((la)localObject5).<init>((Context)localObject6, this, (dw)localObject8, (oh)localObject4, (lc.a)localObject1);
            ((kx)localObject1).a((lc)localObject5);
            a((kx)localObject1);
            break label311;
          }
        }
      }
      localObject5 = E;
      bool = localObject5 instanceof kx;
      if (bool)
      {
        localObject2 = f.t;
        if (localObject2 != null)
        {
          localObject2 = (kx)E;
          a((kx)localObject2);
          break label311;
        }
      }
      bool = localObject5 instanceof kw;
      if (bool)
      {
        localObject2 = f.s;
        if (localObject2 != null)
        {
          localObject2 = (kw)E;
          a((kw)localObject2);
          break label311;
        }
      }
      bool = localObject5 instanceof ky;
      if (bool)
      {
        localObject2 = f.v;
        if (localObject2 != null)
        {
          localObject6 = f.v;
          localObject2 = localObject5;
          localObject2 = ((ky)localObject5).l();
          localObject2 = ((k)localObject6).get(localObject2);
          if (localObject2 != null)
          {
            localObject2 = ((ky)localObject5).l();
            localObject5 = tt.a;
            localObject6 = new com/google/android/gms/ads/internal/s$4;
            ((s.4)localObject6).<init>(this, (String)localObject2, paramtg2);
            ((Handler)localObject5).post((Runnable)localObject6);
            break label311;
          }
        }
      }
      tp.e("No matching listener for retrieved native ad template.");
      a(0);
      bool = false;
      Object localObject2 = null;
    }
  }
  
  public final ls b(String paramString)
  {
    c.b("getOnCustomClickListener must be called on the main UI thread.");
    return (ls)f.u.get(paramString);
  }
  
  public final void b(k paramk)
  {
    c.b("setOnCustomClickListener must be called on the main UI thread.");
    f.u = paramk;
  }
  
  public final void m()
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Native Ad DOES NOT support pause().");
    throw localIllegalStateException;
  }
  
  public final void n()
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Native Ad DOES NOT support resume().");
    throw localIllegalStateException;
  }
}


/* Location:              com/google/android/gms/ads/internal/s.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */