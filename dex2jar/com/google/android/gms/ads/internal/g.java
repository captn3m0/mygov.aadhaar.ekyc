package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.d;
import com.google.android.gms.b.gv;
import com.google.android.gms.b.hb;
import com.google.android.gms.b.ih;
import com.google.android.gms.b.il;
import com.google.android.gms.b.ip;
import com.google.android.gms.b.jf;
import com.google.android.gms.b.jt;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.nr;
import com.google.android.gms.b.oc;
import com.google.android.gms.b.od;
import com.google.android.gms.b.og;
import com.google.android.gms.b.oh;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.qr;
import com.google.android.gms.b.sx;
import com.google.android.gms.b.sz;
import com.google.android.gms.b.ta;
import com.google.android.gms.b.tg;
import com.google.android.gms.b.tg.a;
import com.google.android.gms.b.tj;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.uk;
import com.google.android.gms.b.un;
import com.google.android.gms.b.ux;
import com.google.android.gms.b.vc;
import com.google.android.gms.b.vd;
import com.google.android.gms.b.vd.c;
import com.google.android.gms.b.vd.e;
import com.google.android.gms.b.vi;
import java.util.List;

@qi
public final class g
  extends c
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  private boolean l;
  
  public g(Context paramContext, il paramil, String paramString, oc paramoc, un paramun, e parame)
  {
    super(paramContext, paramil, paramString, paramoc, paramun, parame);
  }
  
  private boolean b(tg paramtg1, tg paramtg2)
  {
    View localView1;
    if (n)
    {
      localView1 = p.a(paramtg2);
      if (localView1 == null)
      {
        tp.e("Could not get mediation view");
        return false;
      }
      View localView2 = f.f.getNextView();
      if (localView2 != null)
      {
        if ((localView2 instanceof vc)) {
          ((vc)localView2).destroy();
        }
        f.f.removeView(localView2);
      }
      if (p.b(paramtg2)) {}
    }
    for (;;)
    {
      try
      {
        a(localView1);
        if (f.f.getChildCount() > 1) {
          f.f.showNext();
        }
        if (paramtg1 != null)
        {
          paramtg1 = f.f.getNextView();
          if (!(paramtg1 instanceof vc)) {
            break label280;
          }
          ((vc)paramtg1).a(f.c, f.i, a);
          f.b();
        }
        f.f.setVisibility(0);
        return true;
      }
      catch (Throwable paramtg1)
      {
        w.i().a(paramtg1, "BannerAdManager.swapViews");
        tp.c("Could not add mediation view to view hierarchy.", paramtg1);
        return false;
      }
      if ((v != null) && (b != null))
      {
        b.a(v);
        f.f.removeAllViews();
        f.f.setMinimumWidth(v.f);
        f.f.setMinimumHeight(v.c);
        a(b.b());
        continue;
        label280:
        if (paramtg1 != null) {
          f.f.removeView(paramtg1);
        }
      }
    }
  }
  
  public final void G()
  {
    throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
  }
  
  protected final vc a(tg.a parama, f paramf, sx paramsx)
  {
    if ((f.i.g == null) && (f.i.i))
    {
      x localx = f;
      if (b.A)
      {
        localObject = f.i;
        i = ((il)localObject);
      }
    }
    else
    {
      return super.a(parama, paramf, paramsx);
    }
    Object localObject = b.m;
    if (localObject != null)
    {
      localObject = ((String)localObject).split("[xX]");
      localObject[0] = localObject[0].trim();
      localObject[1] = localObject[1].trim();
    }
    for (localObject = new d(Integer.parseInt(localObject[0]), Integer.parseInt(localObject[1]));; localObject = f.i.c())
    {
      localObject = new il(f.c, (d)localObject);
      break;
    }
  }
  
  protected final void a(tg paramtg, boolean paramBoolean)
  {
    oh localoh = null;
    super.a(paramtg, paramBoolean);
    a locala;
    vc localvc;
    if (p.b(paramtg))
    {
      locala = new a();
      if ((paramtg != null) && (p.b(paramtg)))
      {
        localvc = b;
        if (localvc == null) {
          break label66;
        }
      }
    }
    label66:
    for (View localView = localvc.b(); localView == null; localView = null)
    {
      tp.e("AdWebView is null");
      return;
    }
    List localList;
    for (;;)
    {
      try
      {
        if (o != null)
        {
          localList = o.o;
          if ((localList != null) && (!localList.isEmpty())) {
            break;
          }
          tp.e("No template ids present in mediation response");
          return;
        }
      }
      catch (RemoteException paramtg)
      {
        tp.c("Error occurred while recording impression and registering for clicks", paramtg);
        return;
      }
      localList = null;
    }
    if (p != null) {}
    for (og localog = p.h();; localog = null)
    {
      if (p != null) {
        localoh = p.i();
      }
      if ((localList.contains("2")) && (localog != null))
      {
        localog.b(b.a(localView));
        if (!localog.j()) {
          localog.i();
        }
        localvc.l().a("/nativeExpressViewClicked", p.a(localog, null, locala));
        return;
      }
      if ((localList.contains("1")) && (localoh != null))
      {
        localoh.b(b.a(localView));
        if (!localoh.h()) {
          localoh.g();
        }
        localvc.l().a("/nativeExpressViewClicked", p.a(null, localoh, locala));
        return;
      }
      tp.e("No matching template id and mapper");
      return;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    com.google.android.gms.common.internal.c.b("setManualImpressionsEnabled must be called from the main thread.");
    l = paramBoolean;
  }
  
  public final boolean a(ih paramih)
  {
    if (h == l) {
      return super.a(paramih);
    }
    int i = a;
    long l1 = b;
    Bundle localBundle = c;
    int j = d;
    List localList = e;
    boolean bool2 = f;
    int k = g;
    if ((h) || (l)) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      paramih = new ih(i, l1, localBundle, j, localList, bool2, k, bool1, i, j, k, l, m, n, o, p, q, r);
      break;
    }
  }
  
  public final boolean a(tg paramtg1, final tg paramtg2)
  {
    int j = 0;
    if (!super.a(paramtg1, paramtg2)) {
      return false;
    }
    if ((f.c()) && (!b(paramtg1, paramtg2)))
    {
      a(0);
      return false;
    }
    final Object localObject1;
    label134:
    Object localObject2;
    if (k)
    {
      d(paramtg2);
      w.C();
      ux.a(f.f, this);
      w.C();
      ux.a(f.f, this);
      if (!m)
      {
        localObject1 = new Runnable()
        {
          public final void run()
          {
            d(f.j);
          }
        };
        if (b == null) {
          break label363;
        }
        paramtg1 = b.l();
        if (paramtg1 != null) {
          k = new vd.e()
          {
            public final void a()
            {
              if (!m)
              {
                w.e();
                tt.b(localObject1);
              }
            }
          };
        }
      }
      if (b == null) {
        break label473;
      }
      localObject1 = b.z();
      localObject2 = b.l();
      paramtg1 = (tg)localObject1;
      if (localObject2 != null) {
        ((vd)localObject2).g();
      }
    }
    label363:
    label407:
    label473:
    for (paramtg1 = (tg)localObject1;; paramtg1 = null)
    {
      if ((f.x != null) && (paramtg1 != null)) {
        paramtg1.b(f.x.a);
      }
      int i = Build.VERSION.SDK_INT;
      if (f.c()) {
        if (b != null)
        {
          if (j != null) {
            h.a(f.i, paramtg2);
          }
          paramtg1 = new hb(f.c, b.b());
          localObject1 = w.D();
          localObject2 = ke.av;
          i = j;
          if (((Boolean)w.q().a((jz)localObject2)).booleanValue())
          {
            i = j;
            if (((ta)localObject1).a()) {
              i = 1;
            }
          }
          if (i != 0) {
            paramtg1.a(new sz(f.c, f.b));
          }
          if (!paramtg2.a()) {
            break label407;
          }
          paramtg1.a(b);
        }
      }
      for (;;)
      {
        return true;
        paramtg1 = null;
        break;
        if (f.d())
        {
          paramtg1 = ke.cb;
          if (!((Boolean)w.q().a(paramtg1)).booleanValue()) {
            break label134;
          }
        }
        a(paramtg2, false);
        break label134;
        b.l().e = new vd.c()
        {
          public final void a()
          {
            a(paramtg2b);
          }
        };
        continue;
        if ((f.E != null) && (j != null)) {
          h.a(f.i, paramtg2, f.E);
        }
      }
    }
  }
  
  final void d(tg paramtg)
  {
    if (paramtg == null) {}
    do
    {
      do
      {
        return;
      } while ((m) || (f.f == null));
      w.e();
    } while ((!tt.a(f.f, f.c)) || (!f.f.getGlobalVisibleRect(new Rect(), null)));
    if ((paramtg != null) && (b != null) && (b.l() != null)) {
      b.l().k = null;
    }
    a(paramtg, false);
    m = true;
  }
  
  public final void onGlobalLayout()
  {
    d(f.j);
  }
  
  public final void onScrollChanged()
  {
    d(f.j);
  }
  
  public final jf q()
  {
    com.google.android.gms.common.internal.c.b("getVideoController must be called from the main thread.");
    if ((f.j != null) && (f.j.b != null)) {
      return f.j.b.z();
    }
    return null;
  }
  
  protected final boolean x()
  {
    boolean bool = true;
    w.e();
    if (!tt.a(f.c, f.c.getPackageName(), "android.permission.INTERNET"))
    {
      ip.a();
      uk.a(f.f, f.i, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
      bool = false;
    }
    w.e();
    if (!tt.a(f.c))
    {
      ip.a();
      uk.a(f.f, f.i, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
      bool = false;
    }
    if ((!bool) && (f.f != null)) {
      f.f.setVisibility(0);
    }
    return bool;
  }
  
  public final class a
  {
    public a() {}
  }
}


/* Location:              com/google/android/gms/ads/internal/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */