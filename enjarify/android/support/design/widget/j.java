package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.h.al;
import android.support.v4.h.f;
import android.support.v4.h.w;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import java.util.List;

abstract class j
  extends v
{
  final Rect a;
  final Rect b;
  int c;
  int d;
  
  public j()
  {
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    a = localRect;
    localRect = new android/graphics/Rect;
    localRect.<init>();
    b = localRect;
    c = 0;
  }
  
  public j(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    a = localRect;
    localRect = new android/graphics/Rect;
    localRect.<init>();
    b = localRect;
    c = 0;
  }
  
  abstract View a(List paramList);
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = -1;
    int j = 1;
    Object localObject = paramView.getLayoutParams();
    int k = height;
    View localView;
    boolean bool;
    if (k != i)
    {
      int m = -2;
      if (k != m) {}
    }
    else
    {
      localObject = paramCoordinatorLayout.a(paramView);
      localView = a((List)localObject);
      if (localView != null)
      {
        bool = w.x(localView);
        if (bool)
        {
          bool = w.x(paramView);
          if (!bool)
          {
            w.a(paramView, j);
            bool = w.x(paramView);
            if (bool)
            {
              paramView.requestLayout();
              bool = j;
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool;
      int n = View.MeasureSpec.getSize(paramInt3);
      if (n == 0) {
        n = paramCoordinatorLayout.getHeight();
      }
      int i1 = localView.getMeasuredHeight();
      n -= i1;
      int i2 = c(localView) + n;
      if (k == i) {}
      for (n = 1073741824;; n = -1 << -1)
      {
        i = View.MeasureSpec.makeMeasureSpec(i2, n);
        localObject = paramCoordinatorLayout;
        i2 = paramInt1;
        i1 = paramInt2;
        paramCoordinatorLayout.a(paramView, paramInt1, paramInt2, i, paramInt4);
        n = j;
        break;
      }
      n = 0;
      localObject = null;
    }
  }
  
  float b(View paramView)
  {
    return 1.0F;
  }
  
  int c(View paramView)
  {
    return paramView.getMeasuredHeight();
  }
  
  protected final void c(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt)
  {
    Object localObject = paramCoordinatorLayout.a(paramView);
    View localView = a((List)localObject);
    int i2;
    if (localView != null)
    {
      localObject = (CoordinatorLayout.d)paramView.getLayoutParams();
      Rect localRect1 = a;
      int i = paramCoordinatorLayout.getPaddingLeft();
      int j = leftMargin;
      i += j;
      j = localView.getBottom();
      int m = topMargin;
      j += m;
      m = paramCoordinatorLayout.getWidth();
      int n = paramCoordinatorLayout.getPaddingRight();
      m -= n;
      n = rightMargin;
      m -= n;
      n = paramCoordinatorLayout.getHeight();
      int i1 = localView.getBottom();
      n += i1;
      i1 = paramCoordinatorLayout.getPaddingBottom();
      n -= i1;
      i1 = bottomMargin;
      n -= i1;
      localRect1.set(i, j, m, n);
      al localal = paramCoordinatorLayout.getLastWindowInsets();
      if (localal != null)
      {
        boolean bool = w.x(paramCoordinatorLayout);
        if (bool)
        {
          bool = w.x(paramView);
          if (!bool)
          {
            k = left;
            m = localal.a();
            k += m;
            left = k;
            k = right;
            i = localal.c();
            i = k - i;
            right = i;
          }
        }
      }
      Rect localRect2 = b;
      i2 = c;
      if (i2 == 0) {
        i2 = 8388659;
      }
      i = paramView.getMeasuredWidth();
      int k = paramView.getMeasuredHeight();
      n = paramInt;
      f.a(i2, i, k, localRect1, localRect2, paramInt);
      i2 = d(localView);
      i = left;
      k = top - i2;
      int i3 = right;
      n = bottom;
      i2 = n - i2;
      paramView.layout(i, k, i3, i2);
      i2 = top;
      i = localView.getBottom();
      i2 -= i;
    }
    for (c = i2;; c = 0)
    {
      return;
      super.c(paramCoordinatorLayout, paramView, paramInt);
      i2 = 0;
      localObject = null;
    }
  }
  
  final int d(View paramView)
  {
    int i = 0;
    int j = d;
    if (j == 0) {}
    for (;;)
    {
      return i;
      float f1 = b(paramView);
      float f2 = d;
      f1 *= f2;
      j = (int)f1;
      int k = d;
      i = k.a(j, 0, k);
    }
  }
}


/* Location:              android/support/design/widget/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */