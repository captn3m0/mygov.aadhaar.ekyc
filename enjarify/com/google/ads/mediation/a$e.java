package com.google.ads.mediation;

import com.google.android.gms.ads.b.e;
import com.google.android.gms.ads.b.e.a;
import com.google.android.gms.ads.b.f;
import com.google.android.gms.ads.b.f.a;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.b.ib;

final class a$e
  extends com.google.android.gms.ads.a
  implements e.a, f.a, ib
{
  final a a;
  final h b;
  
  public a$e(a parama, h paramh)
  {
    a = parama;
    b = paramh;
  }
  
  public final void a() {}
  
  public final void a(int paramInt)
  {
    b.c(paramInt);
  }
  
  public final void a(e parame)
  {
    h localh = b;
    a.a locala = new com/google/ads/mediation/a$a;
    locala.<init>(parame);
    localh.a(locala);
  }
  
  public final void a(f paramf)
  {
    h localh = b;
    a.b localb = new com/google/ads/mediation/a$b;
    localb.<init>(paramf);
    localh.a(localb);
  }
  
  public final void b()
  {
    b.k();
  }
  
  public final void c()
  {
    b.l();
  }
  
  public final void d()
  {
    b.m();
  }
  
  public final void e()
  {
    b.n();
  }
}


/* Location:              com/google/ads/mediation/a$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */