package com.google.android.gms.b;

import android.os.Handler;
import com.google.android.gms.ads.internal.m;
import com.google.android.gms.ads.internal.w;
import java.util.Random;

@qi
final class my
{
  it a;
  iz b;
  ph c;
  kq d;
  is e;
  sb f;
  
  final void a(m paramm)
  {
    if (a != null) {
      paramm.a(new a(a));
    }
    if (b != null) {
      paramm.a(b);
    }
    if (c != null) {
      paramm.a(c);
    }
    if (d != null) {
      paramm.a(d);
    }
    if (e != null) {
      paramm.a(e);
    }
    if (f != null) {
      paramm.a(f);
    }
  }
  
  private static final class a
    extends it.a
  {
    private final it a;
    
    a(it paramit)
    {
      a = paramit;
    }
    
    public final void a()
    {
      Object localObject = nd.a();
      jz localjz = ke.bg;
      float f = ((Float)w.q().a(localjz)).floatValue();
      int i = c;
      int j = b;
      int k = d;
      if ((i + j <= k * f) || (Float.isNaN(f)))
      {
        localObject = ke.be;
        i = ((Integer)w.q().a((jz)localObject)).intValue();
        localObject = ke.bf;
        j = ((Integer)w.q().a((jz)localObject)).intValue();
        if ((i > 0) && (j >= 0)) {
          break label128;
        }
        w.t().a();
      }
      for (;;)
      {
        a.a();
        return;
        label128:
        long l = new Random().nextInt(j + 1) + i;
        tt.a.postDelayed(new Runnable()
        {
          public final void run()
          {
            w.t().a();
          }
        }, l);
      }
    }
    
    public final void a(int paramInt)
    {
      a.a(paramInt);
    }
    
    public final void b()
    {
      a.b();
    }
    
    public final void c()
    {
      a.c();
    }
    
    public final void d()
    {
      a.d();
    }
  }
}


/* Location:              com/google/android/gms/b/my.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */