package com.google.android.gms.b;

import android.os.Handler;

@qi
public final class pv
  extends to
{
  final pt.a a;
  private final qr b;
  private final tg.a c;
  
  public pv(tg.a parama, pt.a parama1)
  {
    c = parama;
    b = c.b;
    a = parama1;
  }
  
  public final void a()
  {
    final tg localtg = new tg(c.a.c, null, null, 0, null, null, b.l, b.k, c.a.i, false, null, null, null, null, null, b.i, c.d, b.g, c.f, b.n, b.o, c.h, null, null, null, null, c.b.F, c.b.G, null, null, null);
    tt.a.post(new Runnable()
    {
      public final void run()
      {
        a.b(localtg);
      }
    });
  }
  
  public final void c_() {}
}


/* Location:              com/google/android/gms/b/pv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */