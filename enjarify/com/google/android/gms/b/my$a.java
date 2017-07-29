package com.google.android.gms.b;

import android.os.Handler;
import com.google.android.gms.ads.internal.w;
import java.util.Random;

final class my$a
  extends it.a
{
  private final it a;
  
  my$a(it paramit)
  {
    a = paramit;
  }
  
  public final void a()
  {
    Object localObject1 = nd.a();
    Object localObject2 = ke.bg;
    Object localObject3 = w.q();
    localObject2 = (Float)((kd)localObject3).a((jz)localObject2);
    float f1 = ((Float)localObject2).floatValue();
    int i = c;
    int j = b;
    i += j;
    int k = d;
    float f2 = i;
    float f3 = k * f1;
    boolean bool1 = f2 < f3;
    int m;
    int n;
    if (bool1)
    {
      boolean bool2 = Float.isNaN(f1);
      if (!bool2) {}
    }
    else
    {
      localObject2 = ke.be;
      localObject1 = w.q();
      m = ((Integer)((kd)localObject1).a((jz)localObject2)).intValue();
      localObject2 = ke.bf;
      localObject3 = w.q();
      localObject2 = (Integer)((kd)localObject3).a((jz)localObject2);
      n = ((Integer)localObject2).intValue();
      if ((m > 0) && (n >= 0)) {
        break label161;
      }
      localObject2 = w.t();
      ((mz)localObject2).a();
    }
    for (;;)
    {
      a.a();
      return;
      label161:
      localObject3 = new java/util/Random;
      ((Random)localObject3).<init>();
      n += 1;
      n = ((Random)localObject3).nextInt(n) + m;
      long l = n;
      localObject3 = tt.a;
      my.a.1 local1 = new com/google/android/gms/b/my$a$1;
      local1.<init>();
      ((Handler)localObject3).postDelayed(local1, l);
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


/* Location:              com/google/android/gms/b/my$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */