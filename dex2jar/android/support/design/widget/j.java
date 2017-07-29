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
  extends v<View>
{
  final Rect a = new Rect();
  final Rect b = new Rect();
  int c = 0;
  int d;
  
  public j() {}
  
  public j(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  abstract View a(List<View> paramList);
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int j = getLayoutParamsheight;
    if ((j == -1) || (j == -2))
    {
      View localView = a(paramCoordinatorLayout.a(paramView));
      if (localView != null)
      {
        if ((w.x(localView)) && (!w.x(paramView)))
        {
          w.a(paramView, true);
          if (w.x(paramView))
          {
            paramView.requestLayout();
            return true;
          }
        }
        int i = View.MeasureSpec.getSize(paramInt3);
        paramInt3 = i;
        if (i == 0) {
          paramInt3 = paramCoordinatorLayout.getHeight();
        }
        int k = localView.getMeasuredHeight();
        int m = c(localView);
        if (j == -1) {}
        for (i = 1073741824;; i = Integer.MIN_VALUE)
        {
          paramCoordinatorLayout.a(paramView, paramInt1, paramInt2, View.MeasureSpec.makeMeasureSpec(m + (paramInt3 - k), i), paramInt4);
          return true;
        }
      }
    }
    return false;
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
    View localView = a(paramCoordinatorLayout.a(paramView));
    if (localView != null)
    {
      CoordinatorLayout.d locald = (CoordinatorLayout.d)paramView.getLayoutParams();
      Rect localRect = a;
      localRect.set(paramCoordinatorLayout.getPaddingLeft() + leftMargin, localView.getBottom() + topMargin, paramCoordinatorLayout.getWidth() - paramCoordinatorLayout.getPaddingRight() - rightMargin, paramCoordinatorLayout.getHeight() + localView.getBottom() - paramCoordinatorLayout.getPaddingBottom() - bottomMargin);
      al localal = paramCoordinatorLayout.getLastWindowInsets();
      if ((localal != null) && (w.x(paramCoordinatorLayout)) && (!w.x(paramView)))
      {
        left += localal.a();
        right -= localal.c();
      }
      paramCoordinatorLayout = b;
      int j = c;
      int i = j;
      if (j == 0) {
        i = 8388659;
      }
      f.a(i, paramView.getMeasuredWidth(), paramView.getMeasuredHeight(), localRect, paramCoordinatorLayout, paramInt);
      paramInt = d(localView);
      paramView.layout(left, top - paramInt, right, bottom - paramInt);
      c = (top - localView.getBottom());
      return;
    }
    super.c(paramCoordinatorLayout, paramView, paramInt);
    c = 0;
  }
  
  final int d(View paramView)
  {
    if (d == 0) {
      return 0;
    }
    return k.a((int)(b(paramView) * d), 0, d);
  }
}


/* Location:              android/support/design/widget/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */