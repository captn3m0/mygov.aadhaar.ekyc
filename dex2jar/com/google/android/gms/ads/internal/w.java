package com.google.android.gms.ads.internal;

import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.overlay.a;
import com.google.android.gms.ads.internal.overlay.t;
import com.google.android.gms.ads.internal.overlay.u;
import com.google.android.gms.ads.internal.purchase.i;
import com.google.android.gms.b.hh;
import com.google.android.gms.b.hr;
import com.google.android.gms.b.hs;
import com.google.android.gms.b.kb;
import com.google.android.gms.b.kc;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.kh;
import com.google.android.gms.b.mr;
import com.google.android.gms.b.mz;
import com.google.android.gms.b.nn;
import com.google.android.gms.b.nx;
import com.google.android.gms.b.pt;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.qj;
import com.google.android.gms.b.ro;
import com.google.android.gms.b.ta;
import com.google.android.gms.b.tj;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.tu;
import com.google.android.gms.b.tu.a;
import com.google.android.gms.b.tu.b;
import com.google.android.gms.b.tu.c;
import com.google.android.gms.b.tu.d;
import com.google.android.gms.b.tu.e;
import com.google.android.gms.b.tu.f;
import com.google.android.gms.b.tu.g;
import com.google.android.gms.b.tu.h;
import com.google.android.gms.b.tx;
import com.google.android.gms.b.ub;
import com.google.android.gms.b.uc;
import com.google.android.gms.b.uu;
import com.google.android.gms.b.ux;
import com.google.android.gms.b.ve;
import com.google.android.gms.common.util.c;
import com.google.android.gms.common.util.e;

@qi
public final class w
{
  private static final Object a = new Object();
  private static w b;
  private final t A;
  private final u B;
  private final nx C;
  private final uc D;
  private final r E;
  private final mr F;
  private final ux G;
  private final ta H;
  private final a c = new a();
  private final qj d = new qj();
  private final com.google.android.gms.ads.internal.overlay.h e = new com.google.android.gms.ads.internal.overlay.h();
  private final pt f = new pt();
  private final tt g = new tt();
  private final ve h = new ve();
  private final tu i;
  private final hh j;
  private final tj k;
  private final hr l;
  private final hs m;
  private final c n;
  private final h o;
  private final kh p;
  private final tx q;
  private final ro r;
  private final kb s;
  private final kc t;
  private final kd u;
  private final uu v;
  private final i w;
  private final mz x;
  private final nn y;
  private final ub z;
  
  static
  {
    w localw = new w();
    synchronized (a)
    {
      b = localw;
      return;
    }
  }
  
  protected w()
  {
    int i1 = Build.VERSION.SDK_INT;
    Object localObject;
    if (i1 >= 21) {
      localObject = new tu.h();
    }
    for (;;)
    {
      i = ((tu)localObject);
      j = new hh();
      k = new tj();
      l = new hr();
      m = new hs();
      n = e.d();
      o = new h();
      p = new kh();
      q = new tx();
      r = new ro();
      s = new kb();
      t = new kc();
      u = new kd();
      v = new uu();
      w = new i();
      x = new mz();
      y = new nn();
      z = new ub();
      A = new t();
      B = new u();
      C = new nx();
      D = new uc();
      E = new r();
      F = new mr();
      G = new ux();
      H = new ta();
      return;
      if (i1 >= 19) {
        localObject = new tu.g();
      } else if (i1 >= 18) {
        localObject = new tu.e();
      } else if (i1 >= 17) {
        localObject = new tu.d();
      } else if (i1 >= 16) {
        localObject = new tu.f();
      } else if (i1 >= 14) {
        localObject = new tu.c();
      } else if (i1 >= 11) {
        localObject = new tu.b();
      } else if (i1 >= 9) {
        localObject = new tu.a();
      } else {
        localObject = new tu();
      }
    }
  }
  
  public static h A()
  {
    return Eo;
  }
  
  public static mr B()
  {
    return EF;
  }
  
  public static ux C()
  {
    return EG;
  }
  
  public static ta D()
  {
    return EH;
  }
  
  private static w E()
  {
    synchronized (a)
    {
      w localw = b;
      return localw;
    }
  }
  
  public static qj a()
  {
    return Ed;
  }
  
  public static a b()
  {
    return Ec;
  }
  
  public static com.google.android.gms.ads.internal.overlay.h c()
  {
    return Ee;
  }
  
  public static pt d()
  {
    return Ef;
  }
  
  public static tt e()
  {
    return Eg;
  }
  
  public static ve f()
  {
    return Eh;
  }
  
  public static tu g()
  {
    return Ei;
  }
  
  public static hh h()
  {
    return Ej;
  }
  
  public static tj i()
  {
    return Ek;
  }
  
  public static hs j()
  {
    return Em;
  }
  
  public static c k()
  {
    return En;
  }
  
  public static kh l()
  {
    return Ep;
  }
  
  public static tx m()
  {
    return Eq;
  }
  
  public static ro n()
  {
    return Er;
  }
  
  public static kc o()
  {
    return Et;
  }
  
  public static kb p()
  {
    return Es;
  }
  
  public static kd q()
  {
    return Eu;
  }
  
  public static uu r()
  {
    return Ev;
  }
  
  public static i s()
  {
    return Ew;
  }
  
  public static mz t()
  {
    return Ex;
  }
  
  public static ub u()
  {
    return Ez;
  }
  
  public static t v()
  {
    return EA;
  }
  
  public static u w()
  {
    return EB;
  }
  
  public static nx x()
  {
    return EC;
  }
  
  public static r y()
  {
    return EE;
  }
  
  public static uc z()
  {
    return ED;
  }
}


/* Location:              com/google/android/gms/ads/internal/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */