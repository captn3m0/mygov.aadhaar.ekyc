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

public final class w
{
  private static final Object a;
  private static w b;
  private final t A;
  private final u B;
  private final nx C;
  private final uc D;
  private final r E;
  private final mr F;
  private final ux G;
  private final ta H;
  private final a c;
  private final qj d;
  private final com.google.android.gms.ads.internal.overlay.h e;
  private final pt f;
  private final tt g;
  private final ve h;
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
    Object localObject1 = new java/lang/Object;
    localObject1.<init>();
    a = localObject1;
    localObject1 = new com/google/android/gms/ads/internal/w;
    ((w)localObject1).<init>();
    synchronized (a)
    {
      b = (w)localObject1;
      return;
    }
  }
  
  protected w()
  {
    Object localObject = new com/google/android/gms/ads/internal/overlay/a;
    ((a)localObject).<init>();
    c = ((a)localObject);
    localObject = new com/google/android/gms/b/qj;
    ((qj)localObject).<init>();
    d = ((qj)localObject);
    localObject = new com/google/android/gms/ads/internal/overlay/h;
    ((com.google.android.gms.ads.internal.overlay.h)localObject).<init>();
    e = ((com.google.android.gms.ads.internal.overlay.h)localObject);
    localObject = new com/google/android/gms/b/pt;
    ((pt)localObject).<init>();
    f = ((pt)localObject);
    localObject = new com/google/android/gms/b/tt;
    ((tt)localObject).<init>();
    g = ((tt)localObject);
    localObject = new com/google/android/gms/b/ve;
    ((ve)localObject).<init>();
    h = ((ve)localObject);
    int i1 = Build.VERSION.SDK_INT;
    int i2 = 21;
    if (i1 >= i2)
    {
      localObject = new com/google/android/gms/b/tu$h;
      ((tu.h)localObject).<init>();
    }
    for (;;)
    {
      i = ((tu)localObject);
      localObject = new com/google/android/gms/b/hh;
      ((hh)localObject).<init>();
      j = ((hh)localObject);
      localObject = new com/google/android/gms/b/tj;
      ((tj)localObject).<init>();
      k = ((tj)localObject);
      localObject = new com/google/android/gms/b/hr;
      ((hr)localObject).<init>();
      l = ((hr)localObject);
      localObject = new com/google/android/gms/b/hs;
      ((hs)localObject).<init>();
      m = ((hs)localObject);
      localObject = e.d();
      n = ((c)localObject);
      localObject = new com/google/android/gms/ads/internal/h;
      ((h)localObject).<init>();
      o = ((h)localObject);
      localObject = new com/google/android/gms/b/kh;
      ((kh)localObject).<init>();
      p = ((kh)localObject);
      localObject = new com/google/android/gms/b/tx;
      ((tx)localObject).<init>();
      q = ((tx)localObject);
      localObject = new com/google/android/gms/b/ro;
      ((ro)localObject).<init>();
      r = ((ro)localObject);
      localObject = new com/google/android/gms/b/kb;
      ((kb)localObject).<init>();
      s = ((kb)localObject);
      localObject = new com/google/android/gms/b/kc;
      ((kc)localObject).<init>();
      t = ((kc)localObject);
      localObject = new com/google/android/gms/b/kd;
      ((kd)localObject).<init>();
      u = ((kd)localObject);
      localObject = new com/google/android/gms/b/uu;
      ((uu)localObject).<init>();
      v = ((uu)localObject);
      localObject = new com/google/android/gms/ads/internal/purchase/i;
      ((i)localObject).<init>();
      w = ((i)localObject);
      localObject = new com/google/android/gms/b/mz;
      ((mz)localObject).<init>();
      x = ((mz)localObject);
      localObject = new com/google/android/gms/b/nn;
      ((nn)localObject).<init>();
      y = ((nn)localObject);
      localObject = new com/google/android/gms/b/ub;
      ((ub)localObject).<init>();
      z = ((ub)localObject);
      localObject = new com/google/android/gms/ads/internal/overlay/t;
      ((t)localObject).<init>();
      A = ((t)localObject);
      localObject = new com/google/android/gms/ads/internal/overlay/u;
      ((u)localObject).<init>();
      B = ((u)localObject);
      localObject = new com/google/android/gms/b/nx;
      ((nx)localObject).<init>();
      C = ((nx)localObject);
      localObject = new com/google/android/gms/b/uc;
      ((uc)localObject).<init>();
      D = ((uc)localObject);
      localObject = new com/google/android/gms/ads/internal/r;
      ((r)localObject).<init>();
      E = ((r)localObject);
      localObject = new com/google/android/gms/b/mr;
      ((mr)localObject).<init>();
      F = ((mr)localObject);
      localObject = new com/google/android/gms/b/ux;
      ((ux)localObject).<init>();
      G = ((ux)localObject);
      localObject = new com/google/android/gms/b/ta;
      ((ta)localObject).<init>();
      H = ((ta)localObject);
      return;
      i2 = 19;
      if (i1 >= i2)
      {
        localObject = new com/google/android/gms/b/tu$g;
        ((tu.g)localObject).<init>();
      }
      else
      {
        i2 = 18;
        if (i1 >= i2)
        {
          localObject = new com/google/android/gms/b/tu$e;
          ((tu.e)localObject).<init>();
        }
        else
        {
          i2 = 17;
          if (i1 >= i2)
          {
            localObject = new com/google/android/gms/b/tu$d;
            ((tu.d)localObject).<init>();
          }
          else
          {
            i2 = 16;
            if (i1 >= i2)
            {
              localObject = new com/google/android/gms/b/tu$f;
              ((tu.f)localObject).<init>();
            }
            else
            {
              i2 = 14;
              if (i1 >= i2)
              {
                localObject = new com/google/android/gms/b/tu$c;
                ((tu.c)localObject).<init>();
              }
              else
              {
                i2 = 11;
                if (i1 >= i2)
                {
                  localObject = new com/google/android/gms/b/tu$b;
                  ((tu.b)localObject).<init>();
                }
                else
                {
                  i2 = 9;
                  if (i1 >= i2)
                  {
                    localObject = new com/google/android/gms/b/tu$a;
                    ((tu.a)localObject).<init>();
                  }
                  else
                  {
                    localObject = new com/google/android/gms/b/tu;
                    ((tu)localObject).<init>();
                  }
                }
              }
            }
          }
        }
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
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */