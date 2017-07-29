package android.support.design.widget;

import android.support.v4.h.w;
import android.support.v4.widget.p;
import android.support.v4.widget.p.a;
import android.view.View;
import android.view.ViewParent;

final class SwipeDismissBehavior$1
  extends p.a
{
  private int b;
  private int c = -1;
  
  SwipeDismissBehavior$1(SwipeDismissBehavior paramSwipeDismissBehavior) {}
  
  public final int a(View paramView)
  {
    return paramView.getWidth();
  }
  
  public final void a(int paramInt)
  {
    SwipeDismissBehavior.a locala = a.c;
    if (locala != null)
    {
      locala = a.c;
      locala.a(paramInt);
    }
  }
  
  public final void a(View paramView, float paramFloat1, float paramFloat2)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 1;
    c = -1;
    int k = paramView.getWidth();
    boolean bool1 = paramFloat1 < 0.0F;
    SwipeDismissBehavior localSwipeDismissBehavior1;
    int i2;
    float f1;
    label78:
    label111:
    boolean bool2;
    Object localObject2;
    if (bool1)
    {
      int m = w.g(paramView);
      if (m == j)
      {
        m = j;
        localSwipeDismissBehavior1 = a;
        i2 = d;
        int i4 = 2;
        f1 = 2.8E-45F;
        if (i2 != i4) {
          break label179;
        }
        m = j;
        if (m == 0) {
          break label435;
        }
        int n = paramView.getLeft();
        i = b;
        if (n >= i) {
          break label423;
        }
        n = b - k;
        localObject1 = a.b;
        k = paramView.getTop();
        bool2 = ((p)localObject1).a(n, k);
        if (!bool2) {
          break label447;
        }
        localObject2 = new android/support/design/widget/SwipeDismissBehavior$b;
        localObject1 = a;
        ((SwipeDismissBehavior.b)localObject2).<init>((SwipeDismissBehavior)localObject1, paramView, j);
        w.a(paramView, (Runnable)localObject2);
      }
    }
    for (;;)
    {
      return;
      bool2 = false;
      localObject2 = null;
      break;
      label179:
      localSwipeDismissBehavior1 = a;
      i2 = d;
      if (i2 == 0)
      {
        if (bool2)
        {
          bool2 = paramFloat1 < 0.0F;
          if (bool2)
          {
            bool2 = j;
            break label78;
          }
          bool2 = false;
          localObject2 = null;
          break label78;
        }
        bool2 = paramFloat1 < 0.0F;
        if (bool2)
        {
          bool2 = j;
          break label78;
        }
        bool2 = false;
        localObject2 = null;
        break label78;
      }
      localSwipeDismissBehavior1 = a;
      i2 = d;
      if (i2 == j)
      {
        if (bool2)
        {
          bool2 = paramFloat1 < 0.0F;
          if (bool2)
          {
            bool2 = j;
            break label78;
          }
          bool2 = false;
          localObject2 = null;
          break label78;
        }
        bool2 = paramFloat1 < 0.0F;
        if (bool2)
        {
          bool2 = j;
          break label78;
        }
        bool2 = false;
        localObject2 = null;
        break label78;
        i1 = paramView.getLeft();
        int i3 = b;
        i1 -= i3;
        float f2 = paramView.getWidth();
        SwipeDismissBehavior localSwipeDismissBehavior2 = a;
        f1 = e;
        f2 *= f1;
        i3 = Math.round(f2);
        i1 = Math.abs(i1);
        if (i1 >= i3)
        {
          i1 = j;
          break label78;
        }
        i1 = 0;
        localObject2 = null;
        break label78;
      }
      int i1 = 0;
      localObject2 = null;
      break label78;
      label423:
      i1 = b + k;
      break label111;
      label435:
      i1 = b;
      j = 0;
      break label111;
      label447:
      if (j != 0)
      {
        localObject2 = a.c;
        if (localObject2 != null)
        {
          localObject2 = a.c;
          ((SwipeDismissBehavior.a)localObject2).a(paramView);
        }
      }
    }
  }
  
  public final boolean a(View paramView, int paramInt)
  {
    int i = c;
    int j = -1;
    SwipeDismissBehavior localSwipeDismissBehavior;
    boolean bool;
    if (i == j)
    {
      localSwipeDismissBehavior = a;
      bool = localSwipeDismissBehavior.b(paramView);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localSwipeDismissBehavior = null;
    }
  }
  
  public final void b(View paramView, int paramInt)
  {
    float f1 = 1.0F;
    int i = b;
    float f2 = i;
    float f3 = paramView.getWidth();
    SwipeDismissBehavior localSwipeDismissBehavior1 = a;
    float f4 = f;
    f3 *= f4;
    f2 += f3;
    int j = b;
    f3 = j;
    f4 = paramView.getWidth();
    SwipeDismissBehavior localSwipeDismissBehavior2 = a;
    float f5 = g;
    f4 *= f5;
    f3 += f4;
    f4 = paramInt;
    boolean bool = f4 < f2;
    if (!bool) {
      w.c(paramView, f1);
    }
    for (;;)
    {
      return;
      f4 = paramInt;
      bool = f4 < f3;
      if (!bool)
      {
        i = 0;
        f2 = 0.0F;
        w.c(paramView, 0.0F);
      }
      else
      {
        f4 = paramInt;
        f2 = SwipeDismissBehavior.a(f2, f3, f4);
        f2 = SwipeDismissBehavior.a(f1 - f2);
        w.c(paramView, f2);
      }
    }
  }
  
  public final int c(View paramView, int paramInt)
  {
    return paramView.getTop();
  }
  
  public final int d(View paramView, int paramInt)
  {
    int i = 1;
    int j = w.g(paramView);
    SwipeDismissBehavior localSwipeDismissBehavior;
    int k;
    if (j == i)
    {
      j = i;
      localSwipeDismissBehavior = a;
      k = d;
      if (k != 0) {
        break label101;
      }
      if (j == 0) {
        break label76;
      }
      j = b;
      i = paramView.getWidth();
      j -= i;
      i = b;
    }
    for (;;)
    {
      return SwipeDismissBehavior.a(j, paramInt, i);
      j = 0;
      break;
      label76:
      j = b;
      i = b;
      k = paramView.getWidth();
      i += k;
      continue;
      label101:
      localSwipeDismissBehavior = a;
      k = d;
      if (k == i)
      {
        if (j != 0)
        {
          j = b;
          i = b;
          k = paramView.getWidth();
          i += k;
        }
        else
        {
          j = b;
          i = paramView.getWidth();
          j -= i;
          i = b;
        }
      }
      else
      {
        j = b;
        i = paramView.getWidth();
        j -= i;
        i = b;
        k = paramView.getWidth();
        i += k;
      }
    }
  }
  
  public final void e(View paramView, int paramInt)
  {
    c = paramInt;
    int i = paramView.getLeft();
    b = i;
    ViewParent localViewParent = paramView.getParent();
    if (localViewParent != null)
    {
      boolean bool = true;
      localViewParent.requestDisallowInterceptTouchEvent(bool);
    }
  }
}


/* Location:              android/support/design/widget/SwipeDismissBehavior$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */