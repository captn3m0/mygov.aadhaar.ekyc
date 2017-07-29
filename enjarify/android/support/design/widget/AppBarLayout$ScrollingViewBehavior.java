package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.design.a.i;
import android.support.v4.h.w;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

public class AppBarLayout$ScrollingViewBehavior
  extends j
{
  public AppBarLayout$ScrollingViewBehavior() {}
  
  public AppBarLayout$ScrollingViewBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject = a.i.ScrollingViewBehavior_Layout;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int i = a.i.ScrollingViewBehavior_Layout_behavior_overlapTop;
    i = ((TypedArray)localObject).getDimensionPixelSize(i, 0);
    d = i;
    ((TypedArray)localObject).recycle();
  }
  
  private static AppBarLayout b(List paramList)
  {
    int i = 0;
    Object localObject = null;
    int j = paramList.size();
    int k = 0;
    if (k < j)
    {
      localObject = (View)paramList.get(k);
      boolean bool = localObject instanceof AppBarLayout;
      if (!bool) {}
    }
    for (localObject = (AppBarLayout)localObject;; localObject = null)
    {
      return (AppBarLayout)localObject;
      i = k + 1;
      k = i;
      break;
      i = 0;
    }
  }
  
  public final boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, Rect paramRect, boolean paramBoolean)
  {
    boolean bool1 = true;
    Object localObject = paramCoordinatorLayout.a(paramView);
    AppBarLayout localAppBarLayout = b((List)localObject);
    boolean bool2;
    if (localAppBarLayout != null)
    {
      int i = paramView.getLeft();
      int j = paramView.getTop();
      paramRect.offset(i, j);
      localObject = a;
      j = paramCoordinatorLayout.getWidth();
      int k = paramCoordinatorLayout.getHeight();
      ((Rect)localObject).set(0, 0, j, k);
      bool2 = ((Rect)localObject).contains(paramRect);
      if (!bool2) {
        if (!paramBoolean)
        {
          bool2 = bool1;
          localAppBarLayout.a(false, bool2, bool1);
        }
      }
    }
    for (;;)
    {
      return bool1;
      bool2 = false;
      localObject = null;
      break;
      bool1 = false;
    }
  }
  
  public final boolean a_(View paramView)
  {
    return paramView instanceof AppBarLayout;
  }
  
  final float b(View paramView)
  {
    float f1 = 0.0F;
    boolean bool1 = paramView instanceof AppBarLayout;
    int j;
    int k;
    Object localObject;
    int i;
    float f2;
    if (bool1)
    {
      paramView = (AppBarLayout)paramView;
      j = paramView.getTotalScrollRange();
      k = paramView.getDownNestedPreScrollRange();
      localObject = getLayoutParamsa;
      boolean bool2 = localObject instanceof AppBarLayout.Behavior;
      if (bool2)
      {
        localObject = (AppBarLayout.Behavior)localObject;
        i = ((AppBarLayout.Behavior)localObject).a();
        if (k == 0) {
          break label105;
        }
        int m = j + i;
        if (m > k) {
          break label105;
        }
        i = 0;
        localObject = null;
        f2 = 0.0F;
      }
    }
    for (;;)
    {
      return f2;
      i = 0;
      f2 = 0.0F;
      localObject = null;
      break;
      label105:
      j -= k;
      if (j != 0)
      {
        f1 = 1.0F;
        f2 = i;
        float f3 = j;
        f2 = f2 / f3 + f1;
      }
      else
      {
        i = 0;
        localObject = null;
        f2 = 0.0F;
      }
    }
  }
  
  public final boolean b(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
  {
    Object localObject = getLayoutParamsa;
    boolean bool = localObject instanceof AppBarLayout.Behavior;
    if (bool)
    {
      localObject = (AppBarLayout.Behavior)localObject;
      int i = paramView2.getBottom();
      int j = paramView1.getTop();
      i -= j;
      int k = AppBarLayout.Behavior.a((AppBarLayout.Behavior)localObject) + i;
      i = c;
      k += i;
      i = d(paramView2);
      k -= i;
      w.e(paramView1, k);
    }
    return false;
  }
  
  final int c(View paramView)
  {
    boolean bool = paramView instanceof AppBarLayout;
    if (bool) {
      paramView = (AppBarLayout)paramView;
    }
    for (int i = paramView.getTotalScrollRange();; i = super.c(paramView)) {
      return i;
    }
  }
}


/* Location:              android/support/design/widget/AppBarLayout$ScrollingViewBehavior.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */