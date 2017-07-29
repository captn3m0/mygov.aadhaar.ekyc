package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.google.android.gms.b.dw;
import com.google.android.gms.b.il;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.km;
import com.google.android.gms.b.kq;
import com.google.android.gms.b.nk;
import com.google.android.gms.b.oc;
import com.google.android.gms.b.oz;
import com.google.android.gms.b.pt;
import com.google.android.gms.b.qo;
import com.google.android.gms.b.qr;
import com.google.android.gms.b.sx;
import com.google.android.gms.b.tg;
import com.google.android.gms.b.tg.a;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.tv;
import com.google.android.gms.b.tw;
import com.google.android.gms.b.un;
import com.google.android.gms.b.vc;
import com.google.android.gms.b.vd;
import com.google.android.gms.b.ve;

public abstract class c
  extends b
  implements i, oz
{
  public c(Context paramContext, il paramil, String paramString, oc paramoc, un paramun, e parame)
  {
    super(paramContext, paramil, paramString, paramoc, paramun, parame);
  }
  
  public final void J()
  {
    e();
  }
  
  public final void K()
  {
    E();
    l();
  }
  
  public final void L()
  {
    t();
  }
  
  public final void M()
  {
    r();
  }
  
  protected vc a(tg.a parama, f paramf, sx paramsx)
  {
    Object localObject1 = null;
    Object localObject2 = f.f.getNextView();
    boolean bool = localObject2 instanceof vc;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    if (bool)
    {
      localObject1 = localObject2;
      localObject1 = (vc)localObject2;
      localObject3 = ke.aC;
      localObject4 = w.q();
      localObject3 = (Boolean)((kd)localObject4).a((jz)localObject3);
      bool = ((Boolean)localObject3).booleanValue();
      if (!bool) {
        break label329;
      }
      tp.b("Reusing webview...");
      localObject3 = f.c;
      localObject4 = f.i;
      localObject5 = a;
      ((vc)localObject1).a((Context)localObject3, (il)localObject4, (km)localObject5);
    }
    for (;;)
    {
      if (localObject1 == null)
      {
        if (localObject2 != null)
        {
          localObject1 = f.f;
          ((x.a)localObject1).removeView((View)localObject2);
        }
        w.f();
        localObject1 = f.c;
        localObject2 = f.i;
        bool = false;
        localObject3 = null;
        localObject4 = null;
        localObject5 = f.d;
        un localun = f.e;
        localObject6 = a;
        localObject7 = i;
        localObject1 = ve.a((Context)localObject1, (il)localObject2, false, false, (dw)localObject5, localun, (km)localObject6, this, (e)localObject7);
        localObject2 = f.i.g;
        if (localObject2 == null)
        {
          localObject2 = ((vc)localObject1).b();
          a((View)localObject2);
        }
      }
      Object localObject8 = localObject1;
      localObject1 = ((vc)localObject1).l();
      localObject2 = this;
      localObject3 = this;
      localObject4 = this;
      localObject5 = this;
      Object localObject6 = this;
      Object localObject7 = paramf;
      ((vd)localObject1).a(this, this, this, this, false, this, null, paramf, this, paramsx);
      a((nk)localObject8);
      localObject1 = a.v;
      ((vc)localObject8).b((String)localObject1);
      return (vc)localObject8;
      label329:
      ((vc)localObject1).destroy();
      localObject1 = null;
    }
  }
  
  public final void a(kq paramkq)
  {
    com.google.android.gms.common.internal.c.b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
    f.z = paramkq;
  }
  
  protected final void a(nk paramnk)
  {
    c.1 local1 = new com/google/android/gms/ads/internal/c$1;
    local1.<init>(this);
    paramnk.a("/trackActiveViewUnit", local1);
  }
  
  protected void a(tg.a parama, km paramkm)
  {
    int i = e;
    int j = -2;
    Object localObject1;
    Object localObject2;
    if (i != j)
    {
      localObject1 = tt.a;
      localObject2 = new com/google/android/gms/ads/internal/c$2;
      ((c.2)localObject2).<init>(this, parama);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = d;
      if (localObject1 != null)
      {
        localObject1 = f;
        localObject2 = d;
        i = ((il)localObject2);
      }
      localObject1 = b;
      boolean bool = h;
      if (bool)
      {
        localObject1 = b;
        bool = B;
        if (!bool)
        {
          localObject1 = f;
          j = 0;
          F = 0;
          x localx = f;
          w.d();
          localObject1 = f.c;
          dw localdw = f.d;
          oc localoc = this.j;
          localObject2 = this;
          localObject1 = pt.a((Context)localObject1, this, parama, localdw, null, localoc, this, paramkm);
          h = ((tv)localObject1);
          continue;
        }
      }
      localObject1 = tt.a;
      localObject2 = new com/google/android/gms/ads/internal/c$3;
      ((c.3)localObject2).<init>(this, parama, paramkm);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
  }
  
  protected boolean a(tg paramtg1, tg paramtg2)
  {
    Object localObject = f;
    boolean bool = ((x)localObject).c();
    if (bool)
    {
      localObject = f.f;
      if (localObject != null)
      {
        localObject = f.f.a;
        String str = C;
        b = str;
      }
    }
    return super.a(paramtg1, paramtg2);
  }
  
  public final void b(View paramView)
  {
    f.E = paramView;
    tg localtg = new com/google/android/gms/b/tg;
    tg.a locala = f.k;
    localtg.<init>(locala);
    b(localtg);
  }
}


/* Location:              com/google/android/gms/ads/internal/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */