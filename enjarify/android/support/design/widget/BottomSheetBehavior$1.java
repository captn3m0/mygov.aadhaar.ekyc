package android.support.design.widget;

import android.support.v4.h.w;
import android.support.v4.widget.p;
import android.support.v4.widget.p.a;
import android.view.View;
import java.lang.ref.WeakReference;

final class BottomSheetBehavior$1
  extends p.a
{
  BottomSheetBehavior$1(BottomSheetBehavior paramBottomSheetBehavior) {}
  
  public final int a()
  {
    BottomSheetBehavior localBottomSheetBehavior1 = a;
    boolean bool = c;
    int i;
    BottomSheetBehavior localBottomSheetBehavior2;
    int j;
    if (bool)
    {
      localBottomSheetBehavior1 = a;
      i = f;
      localBottomSheetBehavior2 = a;
      j = a;
      i -= j;
    }
    for (;;)
    {
      return i;
      localBottomSheetBehavior1 = a;
      i = b;
      localBottomSheetBehavior2 = a;
      j = a;
      i -= j;
    }
  }
  
  public final void a(int paramInt)
  {
    int i = 1;
    if (paramInt == i)
    {
      BottomSheetBehavior localBottomSheetBehavior = a;
      localBottomSheetBehavior.a(i);
    }
  }
  
  public final void a(View paramView, float paramFloat1, float paramFloat2)
  {
    int i = 4;
    int k = 3;
    int m = 0;
    BottomSheetBehavior localBottomSheetBehavior1 = null;
    boolean bool2 = paramFloat2 < 0.0F;
    Object localObject1;
    Object localObject2;
    if (bool2)
    {
      localObject1 = a;
      i = a;
      localObject2 = a.e;
      m = paramView.getLeft();
      boolean bool1 = ((p)localObject2).a(m, i);
      if (!bool1) {
        break label308;
      }
      localObject1 = a;
      int n = 2;
      ((BottomSheetBehavior)localObject1).a(n);
      localObject1 = new android/support/design/widget/BottomSheetBehavior$b;
      localObject2 = a;
      ((BottomSheetBehavior.b)localObject1).<init>((BottomSheetBehavior)localObject2, paramView, k);
      w.a(paramView, (Runnable)localObject1);
    }
    for (;;)
    {
      return;
      localObject2 = a;
      boolean bool3 = c;
      if (bool3)
      {
        localObject2 = a;
        bool3 = ((BottomSheetBehavior)localObject2).a(paramView, paramFloat2);
        if (bool3)
        {
          localBottomSheetBehavior2 = a;
          j = f;
          k = 5;
          break;
        }
      }
      bool3 = paramFloat2 < 0.0F;
      if (!bool3)
      {
        int i1 = paramView.getTop();
        localBottomSheetBehavior1 = a;
        m = a;
        m = Math.abs(i1 - m);
        BottomSheetBehavior localBottomSheetBehavior3 = a;
        int i2 = b;
        i1 = Math.abs(i1 - i2);
        if (m < i1)
        {
          localObject1 = a;
          j = a;
          break;
        }
        localBottomSheetBehavior2 = a;
        k = b;
        i3 = j;
        j = k;
        k = i3;
        break;
      }
      BottomSheetBehavior localBottomSheetBehavior2 = a;
      k = b;
      int i3 = j;
      int j = k;
      k = i3;
      break;
      label308:
      localObject1 = a;
      ((BottomSheetBehavior)localObject1).a(k);
    }
  }
  
  public final boolean a(View paramView, int paramInt)
  {
    int i = 1;
    Object localObject = a;
    int j = d;
    if (j == i)
    {
      j = 0;
      localObject = null;
    }
    for (;;)
    {
      return j;
      localObject = a;
      boolean bool1 = j;
      if (bool1)
      {
        bool1 = false;
        localObject = null;
      }
      else
      {
        localObject = a;
        int k = d;
        int m = 3;
        if (k == m)
        {
          localObject = a;
          k = i;
          if (k == paramInt)
          {
            localObject = (View)a.h.get();
            if (localObject != null)
            {
              m = -1;
              bool2 = w.b((View)localObject, m);
              if (bool2)
              {
                bool2 = false;
                localObject = null;
                continue;
              }
            }
          }
        }
        localObject = a.g;
        if (localObject != null)
        {
          localObject = a.g.get();
          if (localObject == paramView)
          {
            bool2 = i;
            continue;
          }
        }
        boolean bool2 = false;
        localObject = null;
      }
    }
  }
  
  public final void b(View paramView, int paramInt)
  {
    a.a();
  }
  
  public final int c(View paramView, int paramInt)
  {
    int i = a.a;
    BottomSheetBehavior localBottomSheetBehavior = a;
    boolean bool = c;
    if (bool) {
      localBottomSheetBehavior = a;
    }
    for (int j = f;; j = b)
    {
      return k.a(paramInt, i, j);
      localBottomSheetBehavior = a;
    }
  }
  
  public final int d(View paramView, int paramInt)
  {
    return paramView.getLeft();
  }
}


/* Location:              android/support/design/widget/BottomSheetBehavior$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */