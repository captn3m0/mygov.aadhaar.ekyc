package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.a.i;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout.LayoutParams;

public final class AppBarLayout$a
  extends LinearLayout.LayoutParams
{
  int a;
  Interpolator b;
  
  public AppBarLayout$a()
  {
    super(-1, -2);
    a = 1;
  }
  
  public AppBarLayout$a(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int i = 1;
    a = i;
    Object localObject = a.i.AppBarLayout_Layout;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int j = a.i.AppBarLayout_Layout_layout_scrollFlags;
    j = ((TypedArray)localObject).getInt(j, 0);
    a = j;
    j = a.i.AppBarLayout_Layout_layout_scrollInterpolator;
    boolean bool = ((TypedArray)localObject).hasValue(j);
    if (bool)
    {
      int k = a.i.AppBarLayout_Layout_layout_scrollInterpolator;
      k = ((TypedArray)localObject).getResourceId(k, 0);
      Interpolator localInterpolator = AnimationUtils.loadInterpolator(paramContext, k);
      b = localInterpolator;
    }
    ((TypedArray)localObject).recycle();
  }
  
  public AppBarLayout$a(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    a = 1;
  }
  
  public AppBarLayout$a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
    a = 1;
  }
  
  public AppBarLayout$a(LinearLayout.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    a = 1;
  }
}


/* Location:              android/support/design/widget/AppBarLayout$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */