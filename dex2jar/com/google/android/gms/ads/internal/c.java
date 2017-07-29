package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.b.gv;
import com.google.android.gms.b.il;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.km;
import com.google.android.gms.b.kn;
import com.google.android.gms.b.kp;
import com.google.android.gms.b.kq;
import com.google.android.gms.b.md;
import com.google.android.gms.b.nk;
import com.google.android.gms.b.oc;
import com.google.android.gms.b.oz;
import com.google.android.gms.b.pt;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.qo;
import com.google.android.gms.b.qr;
import com.google.android.gms.b.sx;
import com.google.android.gms.b.tg;
import com.google.android.gms.b.tg.a;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.un;
import com.google.android.gms.b.vc;
import com.google.android.gms.b.vd;
import com.google.android.gms.b.ve;
import java.util.Map;

@qi
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
    vc localvc = null;
    View localView = f.f.getNextView();
    Object localObject;
    if ((localView instanceof vc))
    {
      localvc = (vc)localView;
      localObject = ke.aC;
      if (!((Boolean)w.q().a((jz)localObject)).booleanValue()) {
        break label231;
      }
      tp.b("Reusing webview...");
      localvc.a(f.c, f.i, a);
    }
    for (;;)
    {
      localObject = localvc;
      if (localvc == null)
      {
        if (localView != null) {
          f.f.removeView(localView);
        }
        w.f();
        localvc = ve.a(f.c, f.i, false, false, f.d, f.e, a, this, i);
        localObject = localvc;
        if (f.i.g == null)
        {
          a(localvc.b());
          localObject = localvc;
        }
      }
      ((vc)localObject).l().a(this, this, this, this, false, this, null, paramf, this, paramsx);
      a((nk)localObject);
      ((vc)localObject).b(a.v);
      return (vc)localObject;
      label231:
      localvc.destroy();
      localvc = null;
    }
  }
  
  public final void a(kq paramkq)
  {
    com.google.android.gms.common.internal.c.b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
    f.z = paramkq;
  }
  
  protected final void a(nk paramnk)
  {
    paramnk.a("/trackActiveViewUnit", new md()
    {
      public final void a(vc paramAnonymousvc, Map<String, String> paramAnonymousMap)
      {
        if (f.j != null)
        {
          h.a(f.i, f.j, paramAnonymousvc.b(), paramAnonymousvc);
          return;
        }
        tp.e("Request to enable ActiveView before adState is available.");
      }
    });
  }
  
  protected void a(final tg.a parama, final km paramkm)
  {
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
    if (d != null) {
      f.i = d;
    }
    if ((b.h) && (!b.B))
    {
      f.F = 0;
      x localx = f;
      w.d();
      h = pt.a(f.c, this, parama, f.d, null, j, this, paramkm);
      return;
    }
    tt.a.post(new Runnable()
    {
      public final void run()
      {
        if ((paramab.s) && (f.z != null))
        {
          Object localObject1 = null;
          if (paramab.b != null)
          {
            w.e();
            localObject1 = tt.a(paramab.b);
          }
          localObject1 = new kn(c.this, (String)localObject1, paramab.c);
          f.F = 1;
          try
          {
            d = false;
            f.z.a((kp)localObject1);
            return;
          }
          catch (RemoteException localRemoteException)
          {
            tp.c("Could not call the onCustomRenderedAdLoadedListener.", localRemoteException);
            d = true;
          }
        }
        Object localObject2 = new f(f.c, parama);
        vc localvc = a(parama, (f)localObject2, b);
        localvc.setOnTouchListener(new View.OnTouchListener()
        {
          public final boolean onTouch(View paramAnonymous2View, MotionEvent paramAnonymous2MotionEvent)
          {
            a = true;
            return false;
          }
        });
        localvc.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymous2View)
          {
            a = true;
          }
        });
        f.F = 0;
        localObject2 = f;
        w.d();
        h = pt.a(f.c, c.this, parama, f.d, localvc, j, c.this, paramkm);
      }
    });
  }
  
  protected boolean a(tg paramtg1, tg paramtg2)
  {
    if ((f.c()) && (f.f != null)) {
      f.f.a.b = C;
    }
    return super.a(paramtg1, paramtg2);
  }
  
  public final void b(View paramView)
  {
    f.E = paramView;
    b(new tg(f.k));
  }
}


/* Location:              com/google/android/gms/ads/internal/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */