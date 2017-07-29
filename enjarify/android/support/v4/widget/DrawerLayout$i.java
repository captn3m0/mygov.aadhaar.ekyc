package android.support.v4.widget;

import android.view.View;
import java.util.List;

final class DrawerLayout$i
  extends p.a
{
  final int a;
  p b;
  private final Runnable d;
  
  DrawerLayout$i(DrawerLayout paramDrawerLayout, int paramInt)
  {
    DrawerLayout.i.1 local1 = new android/support/v4/widget/DrawerLayout$i$1;
    local1.<init>(this);
    d = local1;
    a = paramInt;
  }
  
  public final int a(View paramView)
  {
    boolean bool = DrawerLayout.d(paramView);
    if (bool) {}
    for (int i = paramView.getWidth();; i = 0) {
      return i;
    }
  }
  
  public final void a(int paramInt)
  {
    int i = 32;
    int j = 2;
    float f1 = 2.8E-45F;
    int n = 1;
    DrawerLayout localDrawerLayout = c;
    View localView = b.j;
    Object localObject1 = c;
    int i1 = a;
    p localp = d;
    int i4 = a;
    if ((i1 == n) || (i4 == n)) {
      i4 = n;
    }
    Object localObject2;
    float f2;
    int i5;
    while ((localView != null) && (paramInt == 0))
    {
      localObject2 = (DrawerLayout.g)localView.getLayoutParams();
      f2 = b;
      boolean bool4 = f2 < 0.0F;
      if (bool4) {
        break label352;
      }
      localObject2 = (DrawerLayout.g)localView.getLayoutParams();
      int i2 = d & 0x1;
      if (i2 == n)
      {
        d = 0;
        localObject2 = g;
        if (localObject2 != null)
        {
          localObject2 = g;
          j = ((List)localObject2).size() + -1;
          i2 = j;
          for (;;)
          {
            if (i2 >= 0)
            {
              localObject2 = (DrawerLayout.f)g.get(i2);
              ((DrawerLayout.f)localObject2).b();
              j = i2 + -1;
              i2 = j;
              continue;
              if ((i2 == j) || (i4 == j))
              {
                i4 = j;
                break;
              }
              i5 = 0;
              localp = null;
              break;
            }
          }
        }
        localDrawerLayout.a(localView, false);
        boolean bool1 = localDrawerLayout.hasWindowFocus();
        if (bool1)
        {
          localObject2 = localDrawerLayout.getRootView();
          if (localObject2 != null) {
            ((View)localObject2).sendAccessibilityEvent(i);
          }
        }
      }
    }
    for (;;)
    {
      int k = e;
      if (i5 == k) {
        break;
      }
      e = i5;
      localObject2 = g;
      if (localObject2 == null) {
        break;
      }
      localObject2 = g;
      k = ((List)localObject2).size() + -1;
      while (k >= 0)
      {
        localObject1 = g;
        ((List)localObject1).get(k);
        k += -1;
      }
      label352:
      f1 = b;
      int i3 = 1065353216;
      f2 = 1.0F;
      boolean bool2 = f1 < f2;
      if (!bool2)
      {
        localObject2 = (DrawerLayout.g)localView.getLayoutParams();
        i3 = d & 0x1;
        if (i3 == 0)
        {
          d = n;
          localObject2 = g;
          if (localObject2 != null)
          {
            localObject2 = g;
            int m = ((List)localObject2).size() + -1;
            for (i3 = m; i3 >= 0; i3 = m)
            {
              localObject2 = (DrawerLayout.f)g.get(i3);
              ((DrawerLayout.f)localObject2).a();
              m = i3 + -1;
            }
          }
          localDrawerLayout.a(localView, n);
          boolean bool3 = localDrawerLayout.hasWindowFocus();
          if (bool3) {
            localDrawerLayout.sendAccessibilityEvent(i);
          }
        }
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    int i = paramInt1 & 0x1;
    int j = 1;
    if (i == j)
    {
      localObject1 = c;
      j = 3;
    }
    for (Object localObject1 = ((DrawerLayout)localObject1).b(j);; localObject1 = ((DrawerLayout)localObject1).b(j))
    {
      if (localObject1 != null)
      {
        Object localObject2 = c;
        j = ((DrawerLayout)localObject2).a((View)localObject1);
        if (j == 0)
        {
          localObject2 = b;
          ((p)localObject2).a((View)localObject1, paramInt2);
        }
      }
      return;
      localObject1 = c;
      j = 5;
    }
  }
  
  public final void a(View paramView, float paramFloat1, float paramFloat2)
  {
    float f1 = 0.5F;
    float f2 = DrawerLayout.b(paramView);
    int i = paramView.getWidth();
    DrawerLayout localDrawerLayout = c;
    int j = 3;
    int k = localDrawerLayout.a(paramView, j);
    if (k != 0)
    {
      k = paramFloat1 < 0.0F;
      if (k <= 0)
      {
        k = paramFloat1 < 0.0F;
        if (k == 0)
        {
          k = f2 < f1;
          if (k <= 0) {}
        }
      }
      else
      {
        k = 0;
        localDrawerLayout = null;
      }
    }
    for (;;)
    {
      p localp = b;
      i = paramView.getTop();
      localp.a(k, i);
      c.invalidate();
      return;
      int m = -i;
      continue;
      localDrawerLayout = c;
      m = localDrawerLayout.getWidth();
      boolean bool1 = paramFloat1 < 0.0F;
      if (!bool1)
      {
        bool1 = paramFloat1 < 0.0F;
        if (!bool1)
        {
          boolean bool2 = f2 < f1;
          if (!bool2) {}
        }
      }
      else
      {
        m -= i;
      }
    }
  }
  
  public final boolean a(View paramView, int paramInt)
  {
    boolean bool = DrawerLayout.d(paramView);
    DrawerLayout localDrawerLayout;
    int i;
    if (bool)
    {
      localDrawerLayout = c;
      int k = a;
      bool = localDrawerLayout.a(paramView, k);
      if (bool)
      {
        localDrawerLayout = c;
        i = localDrawerLayout.a(paramView);
        if (i == 0) {
          i = 1;
        }
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localDrawerLayout = null;
    }
  }
  
  public final void b()
  {
    DrawerLayout localDrawerLayout = c;
    Runnable localRunnable = d;
    localDrawerLayout.removeCallbacks(localRunnable);
  }
  
  public final void b(View paramView, int paramInt)
  {
    int i = paramView.getWidth();
    DrawerLayout localDrawerLayout = c;
    int k = 3;
    boolean bool2 = localDrawerLayout.a(paramView, k);
    int m;
    float f1;
    int j;
    if (bool2)
    {
      m = i + paramInt;
      f1 = m;
      f2 = i;
      f2 = f1 / f2;
      c.a(paramView, f2);
      m = 0;
      f1 = 0.0F;
      localDrawerLayout = null;
      boolean bool1 = f2 < 0.0F;
      if (bool1) {
        break label131;
      }
      j = 4;
    }
    for (float f2 = 5.6E-45F;; f2 = 0.0F)
    {
      paramView.setVisibility(j);
      c.invalidate();
      return;
      localDrawerLayout = c;
      m = localDrawerLayout.getWidth() - paramInt;
      f1 = m;
      f2 = j;
      f2 = f1 / f2;
      break;
      label131:
      j = 0;
    }
  }
  
  public final int c(View paramView, int paramInt)
  {
    return paramView.getTop();
  }
  
  final void c()
  {
    int i = 3;
    int j = a;
    if (j == i) {
      i = 5;
    }
    DrawerLayout localDrawerLayout = c;
    View localView = localDrawerLayout.b(i);
    if (localView != null)
    {
      localDrawerLayout = c;
      localDrawerLayout.f(localView);
    }
  }
  
  public final int d(View paramView, int paramInt)
  {
    DrawerLayout localDrawerLayout = c;
    int i = 3;
    boolean bool = localDrawerLayout.a(paramView, i);
    if (bool)
    {
      j = -paramView.getWidth();
      i = Math.min(paramInt, 0);
    }
    for (int j = Math.max(j, i);; j = Math.max(i, j))
    {
      return j;
      localDrawerLayout = c;
      j = localDrawerLayout.getWidth();
      i = paramView.getWidth();
      i = j - i;
      j = Math.min(paramInt, j);
    }
  }
  
  public final void d()
  {
    DrawerLayout localDrawerLayout = c;
    Runnable localRunnable = d;
    localDrawerLayout.postDelayed(localRunnable, 160L);
  }
  
  public final void e(View paramView, int paramInt)
  {
    getLayoutParamsc = false;
    c();
  }
}


/* Location:              android/support/v4/widget/DrawerLayout$i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */