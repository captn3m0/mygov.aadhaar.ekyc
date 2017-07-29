package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.c.a.a;
import android.support.v4.h.w;
import android.support.v7.a.a.f;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class ButtonBarLayout
  extends LinearLayout
{
  private boolean a;
  private int b = -1;
  
  public ButtonBarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Resources localResources = getResources();
    int i = a.a(localResources);
    int j = 320;
    if (i >= j) {
      i = 1;
    }
    for (;;)
    {
      Object localObject = a.j.ButtonBarLayout;
      localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
      int k = a.j.ButtonBarLayout_allowStacking;
      boolean bool = ((TypedArray)localObject).getBoolean(k, i);
      a = bool;
      ((TypedArray)localObject).recycle();
      return;
      bool = false;
      localResources = null;
    }
  }
  
  private int a(int paramInt)
  {
    int i = getChildCount();
    int j = paramInt;
    if (j < i)
    {
      View localView = getChildAt(j);
      int k = localView.getVisibility();
      if (k != 0) {}
    }
    for (;;)
    {
      return j;
      j += 1;
      break;
      j = -1;
    }
  }
  
  private boolean a()
  {
    int i = 1;
    int j = getOrientation();
    if (j == i) {}
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  private void setStacked(boolean paramBoolean)
  {
    label17:
    View localView;
    if (paramBoolean)
    {
      i = 1;
      setOrientation(i);
      if (!paramBoolean) {
        break label83;
      }
      i = 5;
      setGravity(i);
      i = a.f.spacer;
      localView = findViewById(i);
      if (localView != null) {
        if (!paramBoolean) {
          break label89;
        }
      }
    }
    label83:
    label89:
    for (int i = 8;; i = 4)
    {
      localView.setVisibility(i);
      i = getChildCount() + -2;
      while (i >= 0)
      {
        localView = getChildAt(i);
        bringChildToFront(localView);
        i += -1;
      }
      i = 0;
      break;
      i = 80;
      break label17;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    int m = 0;
    float f2 = 0.0F;
    DisplayMetrics localDisplayMetrics = null;
    int n = View.MeasureSpec.getSize(paramInt1);
    boolean bool2 = a;
    if (bool2)
    {
      int i1 = b;
      if (n > i1)
      {
        bool3 = a();
        if (bool3) {
          setStacked(false);
        }
      }
      b = n;
    }
    boolean bool3 = a();
    int i4;
    float f3;
    float f4;
    int i3;
    int i5;
    label192:
    LinearLayout.LayoutParams localLayoutParams;
    View localView2;
    int k;
    if (!bool3)
    {
      int i2 = View.MeasureSpec.getMode(paramInt1);
      i4 = 1073741824;
      f3 = 2.0F;
      if (i2 == i4)
      {
        f4 = -0.0F;
        i2 = View.MeasureSpec.makeMeasureSpec(n, -1 << -1);
        i4 = i;
        f3 = f1;
        super.onMeasure(i2, paramInt2);
        boolean bool4 = a;
        if (bool4)
        {
          bool4 = a();
          if (!bool4)
          {
            i3 = Build.VERSION.SDK_INT;
            i5 = 11;
            if (i3 < i5) {
              break label433;
            }
            i3 = w.i(this) & 0xFF000000;
            i5 = 16777216;
            if (i3 != i5) {
              break label421;
            }
            i3 = i;
            f4 = f1;
            if (i3 != 0)
            {
              setStacked(i);
              i4 = i;
              f3 = f1;
            }
          }
        }
        if (i4 != 0) {
          super.onMeasure(paramInt1, paramInt2);
        }
        i4 = a(0);
        if (i4 < 0) {
          break label556;
        }
        View localView1 = getChildAt(i4);
        localLayoutParams = (LinearLayout.LayoutParams)localView1.getLayoutParams();
        m = getPaddingTop();
        int j = localView1.getMeasuredHeight() + m;
        m = topMargin;
        j += m;
        i3 = bottomMargin + j + 0;
        boolean bool1 = a();
        if (!bool1) {
          break label540;
        }
        i4 += 1;
        i4 = a(i4);
        if (i4 >= 0)
        {
          f4 = i3;
          localView2 = getChildAt(i4);
          i4 = localView2.getPaddingTop();
          f3 = i4;
          k = 1098907648;
          localDisplayMetrics = getResources().getDisplayMetrics();
          f2 = density;
          f1 = 16.0F * f2;
          f3 += f1;
          f4 += f3;
          i3 = (int)f4;
        }
      }
    }
    for (;;)
    {
      i4 = w.r(this);
      if (i4 != i3) {
        setMinimumHeight(i3);
      }
      return;
      i3 = paramInt1;
      i4 = 0;
      localView2 = null;
      f3 = 0.0F;
      break;
      label421:
      i3 = 0;
      localLayoutParams = null;
      f4 = 0.0F;
      break label192;
      label433:
      int i6 = getChildCount();
      i3 = 0;
      localLayoutParams = null;
      f4 = 0.0F;
      i5 = 0;
      while (i3 < i6)
      {
        View localView3 = getChildAt(i3);
        int i7 = localView3.getMeasuredWidth();
        i5 += i7;
        i3 += 1;
      }
      i3 = getPaddingLeft() + i5;
      i5 = getPaddingRight();
      i3 += i5;
      if (i3 > n)
      {
        i3 = k;
        f4 = f1;
        break label192;
      }
      i3 = 0;
      localLayoutParams = null;
      f4 = 0.0F;
      break label192;
      label540:
      i4 = getPaddingBottom();
      i3 += i4;
      continue;
      label556:
      i3 = 0;
      localLayoutParams = null;
      f4 = 0.0F;
    }
  }
  
  public void setAllowStacking(boolean paramBoolean)
  {
    boolean bool = a;
    if (bool != paramBoolean)
    {
      a = paramBoolean;
      bool = a;
      if (!bool)
      {
        int i = getOrientation();
        int j = 1;
        if (i == j)
        {
          i = 0;
          setStacked(false);
        }
      }
      requestLayout();
    }
  }
}


/* Location:              android/support/v7/widget/ButtonBarLayout.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */