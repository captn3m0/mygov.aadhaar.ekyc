package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.a.a.a;
import android.support.v7.a.a.d;
import android.support.v7.a.a.j;
import android.support.v7.view.a;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.HorizontalScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public final class ay
  extends HorizontalScrollView
  implements AdapterView.OnItemSelectedListener
{
  private static final Interpolator i;
  Runnable a;
  am b;
  int c;
  int d;
  int e;
  private Spinner f;
  private boolean g;
  private int h;
  
  static
  {
    DecelerateInterpolator localDecelerateInterpolator = new android/view/animation/DecelerateInterpolator;
    localDecelerateInterpolator.<init>();
    i = localDecelerateInterpolator;
  }
  
  private boolean a()
  {
    Object localObject = f;
    boolean bool;
    if (localObject != null)
    {
      localObject = f.getParent();
      if (localObject == this) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  private boolean b()
  {
    boolean bool = a();
    if (!bool) {}
    for (;;)
    {
      return false;
      Object localObject = f;
      removeView((View)localObject);
      localObject = b;
      ViewGroup.LayoutParams localLayoutParams = new android/view/ViewGroup$LayoutParams;
      int k = -2;
      int m = -1;
      localLayoutParams.<init>(k, m);
      addView((View)localObject, localLayoutParams);
      localObject = f;
      int j = ((Spinner)localObject).getSelectedItemPosition();
      setTabSelected(j);
    }
  }
  
  public final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    Runnable localRunnable = a;
    if (localRunnable != null)
    {
      localRunnable = a;
      post(localRunnable);
    }
  }
  
  protected final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    a locala = a.a(getContext());
    Object localObject1 = a;
    Object localObject2 = a.j.ActionBar;
    int j = a.a.actionBarStyle;
    TypedArray localTypedArray = ((Context)localObject1).obtainStyledAttributes(null, (int[])localObject2, j, 0);
    int m = a.j.ActionBar_height;
    m = localTypedArray.getLayoutDimension(m, 0);
    localObject2 = a.getResources();
    boolean bool = locala.b();
    if (!bool)
    {
      int k = a.d.abc_action_bar_stacked_max_height;
      int n = ((Resources)localObject2).getDimensionPixelSize(k);
      m = Math.min(m, n);
    }
    localTypedArray.recycle();
    setContentHeight(m);
    localObject1 = a.getResources();
    int i1 = a.d.abc_action_bar_stacked_tab_max_width;
    m = ((Resources)localObject1).getDimensionPixelSize(i1);
    d = m;
  }
  
  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Runnable localRunnable = a;
    if (localRunnable != null)
    {
      localRunnable = a;
      removeCallbacks(localRunnable);
    }
  }
  
  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong) {}
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    int j = -2;
    int k = 1073741824;
    int m = 1;
    int i1 = 0;
    Object localObject1 = null;
    int i2 = -1;
    int i3 = View.MeasureSpec.getMode(paramInt1);
    int i4;
    label128:
    label155:
    label182:
    Object localObject2;
    if (i3 == k)
    {
      i4 = m;
      setFillViewport(i4);
      am localam = b;
      int i6 = localam.getChildCount();
      if (i6 <= m) {
        break label510;
      }
      int i7;
      if (i3 != k)
      {
        i7 = -1 << -1;
        if (i3 != i7) {
          break label510;
        }
      }
      i3 = 2;
      float f1 = 2.8E-45F;
      if (i6 <= i3) {
        break label493;
      }
      f1 = View.MeasureSpec.getSize(paramInt1);
      i6 = 1053609165;
      float f2 = 0.4F;
      f1 *= f2;
      i3 = (int)f1;
      c = i3;
      i3 = c;
      i6 = d;
      i3 = Math.min(i3, i6);
      c = i3;
      i3 = View.MeasureSpec.makeMeasureSpec(e, k);
      if (i4 != 0) {
        break label519;
      }
      boolean bool2 = g;
      if (!bool2) {
        break label519;
      }
      if (m == 0) {
        break label536;
      }
      b.measure(0, i3);
      localObject2 = b;
      m = ((am)localObject2).getMeasuredWidth();
      i1 = View.MeasureSpec.getSize(paramInt1);
      if (m <= i1) {
        break label528;
      }
      boolean bool1 = a();
      if (!bool1)
      {
        localObject2 = f;
        if (localObject2 == null)
        {
          localObject2 = new android/support/v7/widget/y;
          localObject1 = getContext();
          bool2 = false;
          f2 = 0.0F;
          localam = null;
          i7 = a.a.actionDropDownStyle;
          ((y)localObject2).<init>((Context)localObject1, null, i7);
          localObject1 = new android/support/v7/widget/am$a;
          ((am.a)localObject1).<init>(j, i2);
          ((Spinner)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
          ((Spinner)localObject2).setOnItemSelectedListener(this);
          f = ((Spinner)localObject2);
        }
        localObject2 = b;
        removeView((View)localObject2);
        localObject2 = f;
        localObject1 = new android/view/ViewGroup$LayoutParams;
        ((ViewGroup.LayoutParams)localObject1).<init>(j, i2);
        addView((View)localObject2, (ViewGroup.LayoutParams)localObject1);
        localObject2 = f.getAdapter();
        if (localObject2 == null)
        {
          localObject2 = f;
          localObject1 = new android/support/v7/widget/ay$a;
          ((ay.a)localObject1).<init>(this);
          ((Spinner)localObject2).setAdapter((SpinnerAdapter)localObject1);
        }
        localObject2 = a;
        if (localObject2 != null)
        {
          localObject2 = a;
          removeCallbacks((Runnable)localObject2);
          bool1 = false;
          localObject2 = null;
          a = null;
        }
        localObject2 = f;
        i1 = h;
        ((Spinner)localObject2).setSelection(i1);
      }
    }
    for (;;)
    {
      int n = getMeasuredWidth();
      super.onMeasure(paramInt1, i3);
      i1 = getMeasuredWidth();
      if ((i4 != 0) && (n != i1))
      {
        i5 = h;
        setTabSelected(i5);
      }
      return;
      int i5 = 0;
      break;
      label493:
      i3 = View.MeasureSpec.getSize(paramInt1) / 2;
      c = i3;
      break label128;
      label510:
      c = i2;
      break label155;
      label519:
      n = 0;
      localObject2 = null;
      break label182;
      label528:
      b();
      continue;
      label536:
      b();
    }
  }
  
  public final void onNothingSelected(AdapterView paramAdapterView) {}
  
  public final void setAllowCollapse(boolean paramBoolean)
  {
    g = paramBoolean;
  }
  
  public final void setContentHeight(int paramInt)
  {
    e = paramInt;
    requestLayout();
  }
  
  public final void setTabSelected(int paramInt)
  {
    h = paramInt;
    Object localObject1 = b;
    int j = ((am)localObject1).getChildCount();
    int k = 0;
    if (k < j)
    {
      localObject1 = b;
      Object localObject2 = ((am)localObject1).getChildAt(k);
      boolean bool;
      if (k == paramInt) {
        bool = true;
      }
      for (;;)
      {
        ((View)localObject2).setSelected(bool);
        if (bool)
        {
          localObject1 = b.getChildAt(paramInt);
          localObject2 = a;
          if (localObject2 != null)
          {
            localObject2 = a;
            removeCallbacks((Runnable)localObject2);
          }
          localObject2 = new android/support/v7/widget/ay$1;
          ((ay.1)localObject2).<init>(this, (View)localObject1);
          a = ((Runnable)localObject2);
          localObject1 = a;
          post((Runnable)localObject1);
        }
        int m = k + 1;
        k = m;
        break;
        m = 0;
        localObject1 = null;
      }
    }
    localObject1 = f;
    if ((localObject1 != null) && (paramInt >= 0))
    {
      localObject1 = f;
      ((Spinner)localObject1).setSelection(paramInt);
    }
  }
}


/* Location:              android/support/v7/widget/ay.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */