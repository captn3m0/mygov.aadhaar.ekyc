package android.support.v7.widget;

import android.content.Context;
import android.support.v4.f.e;
import android.support.v4.h.w;
import android.support.v4.widget.h;
import android.support.v4.widget.m;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.ArrayList;

final class at$t
  implements Runnable
{
  int a;
  int b;
  m c;
  Interpolator d;
  private boolean f;
  private boolean g;
  
  public at$t(at paramat)
  {
    Object localObject = at.L;
    d = ((Interpolator)localObject);
    f = false;
    g = false;
    localObject = paramat.getContext();
    Interpolator localInterpolator = at.L;
    localObject = m.a((Context)localObject, localInterpolator);
    c = ((m)localObject);
  }
  
  final int a(int paramInt1, int paramInt2)
  {
    float f1 = 1.0F;
    int i = Math.abs(paramInt1);
    int j = Math.abs(paramInt2);
    float f2;
    int m;
    int i1;
    at localat;
    if (i > j)
    {
      k = 1;
      f2 = Float.MIN_VALUE;
      double d1 = Math.sqrt(0.0D);
      m = (int)d1;
      n = paramInt1 * paramInt1;
      i1 = paramInt2 * paramInt2;
      n += i1;
      double d2 = Math.sqrt(n);
      i1 = (int)d2;
      if (k == 0) {
        break label225;
      }
      localat = e;
    }
    float f7;
    for (int n = localat.getWidth();; n = localat.getHeight())
    {
      int i2 = n / 2;
      float f3 = i1 * f1;
      float f4 = n;
      f3 /= f4;
      f3 = Math.min(f1, f3);
      f4 = i2;
      float f5 = i2;
      float f6 = 0.5F;
      double d3 = f3 - f6;
      double d4 = 0.4712389167638204D;
      d3 = Math.sin((float)(d3 * d4));
      f3 = (float)d3 * f5 + f4;
      if (m <= 0) {
        break label241;
      }
      f7 = m;
      f7 = Math.abs(f3 / f7);
      f2 = 1000.0F * f7;
      k = Math.round(f2) * 4;
      return Math.min(k, 2000);
      k = 0;
      f2 = 0.0F;
      break;
      label225:
      localat = e;
    }
    label241:
    if (k != 0) {}
    for (int k = i;; k = j)
    {
      f2 = k;
      f7 = n;
      f2 = f2 / f7 + f1;
      n = 1133903872;
      f7 = 300.0F;
      f2 *= f7;
      k = (int)f2;
      break;
    }
  }
  
  final void a()
  {
    boolean bool = f;
    if (bool)
    {
      bool = true;
      g = bool;
    }
    for (;;)
    {
      return;
      e.removeCallbacks(this);
      at localat = e;
      w.a(localat, this);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    Interpolator localInterpolator = at.L;
    a(paramInt1, paramInt2, paramInt3, localInterpolator);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
  {
    Object localObject = d;
    if (localObject != paramInterpolator)
    {
      d = paramInterpolator;
      localObject = m.a(e.getContext(), paramInterpolator);
      c = ((m)localObject);
    }
    e.setScrollState(2);
    b = 0;
    a = 0;
    c.a(0, 0, paramInt1, paramInt2, paramInt3);
    a();
  }
  
  public final void b()
  {
    e.removeCallbacks(this);
    c.a.abortAnimation();
  }
  
  public final void run()
  {
    Object localObject1 = e.m;
    if (localObject1 == null)
    {
      b();
      return;
    }
    g = false;
    f = true;
    e.b();
    m localm = c;
    at.q localq = e.m.t;
    localObject1 = a;
    boolean bool1 = ((OverScroller)localObject1).computeScrollOffset();
    int k;
    int m;
    int i;
    int n;
    int i1;
    int i2;
    int i3;
    Object localObject2;
    int i5;
    Object localObject3;
    int i6;
    int i9;
    label379:
    int i8;
    if (bool1)
    {
      k = a.getCurrX();
      m = a.getCurrY();
      i = a;
      n = k - i;
      i = b;
      i1 = m - i;
      i2 = 0;
      at.m localm1 = null;
      i3 = 0;
      localObject2 = null;
      a = k;
      b = m;
      i5 = 0;
      at.g localg = null;
      i = 0;
      localObject1 = null;
      localObject3 = e.l;
      if (localObject3 == null) {
        break label975;
      }
      e.c();
      e.h();
      localObject3 = "RV Scroll";
      e.a((String)localObject3);
      if (n != 0)
      {
        localg = e.m;
        localm1 = e.d;
        localObject3 = e.F;
        i2 = localg.a(n, localm1, (at.r)localObject3);
        i5 = n - i2;
      }
      if (i1 != 0)
      {
        localObject1 = e.m;
        localObject2 = e.d;
        localObject3 = e.F;
        i3 = ((at.g)localObject1).b(i1, (at.m)localObject2, (at.r)localObject3);
        i = i1 - i3;
      }
      e.a();
      e.o();
      e.i();
      localObject3 = e;
      i6 = 0;
      ((at)localObject3).a(false);
      if (localq == null) {
        break label975;
      }
      boolean bool2 = b;
      if (bool2) {
        break label975;
      }
      bool2 = c;
      if (!bool2) {
        break label975;
      }
      localObject3 = e.F;
      int i7 = ((at.r)localObject3).a();
      if (i7 != 0) {
        break label946;
      }
      localq.a();
      i9 = i5;
      i5 = i3;
      i3 = i9;
      localObject3 = e.o;
      boolean bool3 = ((ArrayList)localObject3).isEmpty();
      if (!bool3)
      {
        localObject3 = e;
        ((at)localObject3).invalidate();
      }
      localObject3 = e;
      i8 = ((at)localObject3).getOverScrollMode();
      i6 = 2;
      if (i8 != i6)
      {
        localObject3 = e;
        ((at)localObject3).a(n, i1);
      }
      if ((i3 != 0) || (i != 0))
      {
        i6 = (int)localm.a();
        i8 = 0;
        localObject3 = null;
        if (i3 == k) {
          break label1157;
        }
        if (i3 >= 0) {
          break label990;
        }
        i8 = -i6;
      }
    }
    label489:
    label516:
    label575:
    label605:
    label769:
    label803:
    label826:
    label946:
    label975:
    label990:
    label1022:
    label1050:
    label1092:
    label1100:
    label1108:
    label1157:
    for (int i10 = i8;; i10 = 0)
    {
      i8 = 0;
      localObject3 = null;
      if (i != m) {
        if (i < 0) {
          i6 = -i6;
        }
      }
      for (;;)
      {
        localObject3 = e;
        i8 = ((at)localObject3).getOverScrollMode();
        int i11 = 2;
        h localh;
        if (i8 != i11)
        {
          localObject3 = e;
          if (i10 >= 0) {
            break label1022;
          }
          ((at)localObject3).d();
          localh = x;
          int i12 = -i10;
          localh.a(i12);
          if (i6 >= 0) {
            break label1050;
          }
          ((at)localObject3).f();
          localh = y;
          i12 = -i6;
          localh.a(i12);
          if ((i10 != 0) || (i6 != 0)) {
            w.c((View)localObject3);
          }
        }
        if ((i10 == 0) && (i3 != k))
        {
          localObject2 = a;
          i3 = ((OverScroller)localObject2).getFinalX();
          if (i3 != 0) {}
        }
        else if ((i6 == 0) && (i != m))
        {
          localObject1 = a;
          i = ((OverScroller)localObject1).getFinalY();
          if (i != 0) {}
        }
        else
        {
          localObject1 = a;
          ((OverScroller)localObject1).abortAnimation();
        }
        if ((i2 != 0) || (i5 != 0))
        {
          localObject1 = e;
          ((at)localObject1).m();
        }
        localObject1 = e;
        int j = at.a((at)localObject1);
        if (j == 0)
        {
          localObject1 = e;
          ((at)localObject1).invalidate();
        }
        int i4;
        if (i1 != 0)
        {
          localObject1 = e.m;
          j = ((at.g)localObject1).f();
          if ((j != 0) && (i5 == i1))
          {
            j = 1;
            i3 = j;
            if (n == 0) {
              break label1092;
            }
            localObject1 = e.m;
            j = ((at.g)localObject1).e();
            if ((j == 0) || (i2 != n)) {
              break label1092;
            }
            j = 1;
            if (((n != 0) || (i1 != 0)) && (j == 0) && (i3 == 0)) {
              break label1100;
            }
            j = 1;
            localObject2 = a;
            i4 = ((OverScroller)localObject2).isFinished();
            if ((i4 == 0) && (j != 0)) {
              break label1108;
            }
            localObject1 = e;
            i4 = 0;
            localObject2 = null;
            ((at)localObject1).setScrollState(0);
            j = at.p();
            if (j != 0)
            {
              localObject1 = e.E;
              ((ak.a)localObject1).a();
            }
          }
        }
        for (;;)
        {
          if (localq != null)
          {
            j = b;
            if (j != 0) {
              at.q.a(localq);
            }
            j = g;
            if (j == 0) {
              localq.a();
            }
          }
          localObject1 = null;
          f = false;
          j = g;
          if (j == 0) {
            break;
          }
          a();
          break;
          i6 = a;
          if (i6 >= i8)
          {
            i8 += -1;
            a = i8;
          }
          at.q.a(localq);
          i9 = i5;
          i5 = i4;
          i4 = i9;
          break label379;
          if (i4 > 0)
          {
            i8 = i6;
            break label489;
          }
          i8 = 0;
          localObject3 = null;
          break label489;
          if (j > 0) {
            break label516;
          }
          i6 = 0;
          break label516;
          if (i10 <= 0) {
            break label575;
          }
          ((at)localObject3).e();
          localh = z;
          localh.a(i10);
          break label575;
          if (i6 <= 0) {
            break label605;
          }
          ((at)localObject3).g();
          localh = A;
          localh.a(i6);
          break label605;
          j = 0;
          localObject1 = null;
          i4 = 0;
          localObject2 = null;
          break label769;
          j = 0;
          localObject1 = null;
          break label803;
          j = 0;
          localObject1 = null;
          break label826;
          a();
          localObject1 = e.D;
          if (localObject1 != null)
          {
            localObject1 = e.D;
            localObject2 = e;
            ((ak)localObject1).a((at)localObject2, n, i1);
          }
        }
        i6 = 0;
      }
    }
  }
}


/* Location:              android/support/v7/widget/at$t.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */