package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.a.b;
import android.support.design.a.h;
import android.support.design.a.i;
import android.support.v4.h.al;
import android.support.v4.h.s;
import android.support.v4.h.w;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import java.util.List;

public class AppBarLayout
  extends LinearLayout
{
  boolean a;
  int b;
  al c;
  boolean d;
  private int e;
  private int f;
  private int g;
  private List h;
  private boolean i;
  private final int[] j;
  
  public AppBarLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AppBarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    e = m;
    f = m;
    g = m;
    b = 0;
    Object localObject = new int[2];
    j = ((int[])localObject);
    setOrientation(1);
    p.a(paramContext);
    m = Build.VERSION.SDK_INT;
    if (m >= k)
    {
      y.a(this);
      m = a.h.Widget_Design_AppBarLayout;
      y.a(this, paramAttributeSet, m);
    }
    localObject = a.i.AppBarLayout;
    int n = a.h.Widget_Design_AppBarLayout;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject, 0, n);
    n = a.i.AppBarLayout_android_background;
    Drawable localDrawable = ((TypedArray)localObject).getDrawable(n);
    w.a(this, localDrawable);
    n = a.i.AppBarLayout_expanded;
    boolean bool1 = ((TypedArray)localObject).hasValue(n);
    if (bool1)
    {
      int i1 = a.i.AppBarLayout_expanded;
      boolean bool2 = ((TypedArray)localObject).getBoolean(i1, false);
      a(bool2, false, false);
    }
    int i2 = Build.VERSION.SDK_INT;
    if (i2 >= k)
    {
      i2 = a.i.AppBarLayout_elevation;
      boolean bool3 = ((TypedArray)localObject).hasValue(i2);
      if (bool3)
      {
        int i3 = a.i.AppBarLayout_elevation;
        i3 = ((TypedArray)localObject).getDimensionPixelSize(i3, 0);
        float f1 = i3;
        y.a(this, f1);
      }
    }
    ((TypedArray)localObject).recycle();
    localObject = new android/support/design/widget/AppBarLayout$1;
    ((AppBarLayout.1)localObject).<init>(this);
    w.a(this, (s)localObject);
  }
  
  private AppBarLayout.a a(AttributeSet paramAttributeSet)
  {
    AppBarLayout.a locala = new android/support/design/widget/AppBarLayout$a;
    Context localContext = getContext();
    locala.<init>(localContext, paramAttributeSet);
    return locala;
  }
  
  private static AppBarLayout.a a(ViewGroup.LayoutParams paramLayoutParams)
  {
    int k = Build.VERSION.SDK_INT;
    int m = 19;
    boolean bool;
    AppBarLayout.a locala;
    if (k >= m)
    {
      bool = paramLayoutParams instanceof LinearLayout.LayoutParams;
      if (bool)
      {
        locala = new android/support/design/widget/AppBarLayout$a;
        paramLayoutParams = (LinearLayout.LayoutParams)paramLayoutParams;
        locala.<init>(paramLayoutParams);
      }
    }
    for (;;)
    {
      return locala;
      bool = paramLayoutParams instanceof ViewGroup.MarginLayoutParams;
      if (bool)
      {
        locala = new android/support/design/widget/AppBarLayout$a;
        paramLayoutParams = (ViewGroup.MarginLayoutParams)paramLayoutParams;
        locala.<init>(paramLayoutParams);
      }
      else
      {
        locala = new android/support/design/widget/AppBarLayout$a;
        locala.<init>(paramLayoutParams);
      }
    }
  }
  
  final void a()
  {
    int k = -1;
    e = k;
    f = k;
    g = k;
  }
  
  final void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int k = 0;
    int n;
    if (paramBoolean1)
    {
      m = 1;
      n = m;
      if (!paramBoolean2) {
        break label64;
      }
    }
    label64:
    for (int m = 4;; m = 0)
    {
      m |= n;
      if (paramBoolean3) {
        k = 8;
      }
      k |= m;
      b = k;
      requestLayout();
      return;
      m = 2;
      n = m;
      break;
    }
  }
  
  final void b()
  {
    List localList1 = h;
    if (localList1 != null)
    {
      int k = 0;
      localList1 = null;
      List localList2 = h;
      int m = localList2.size();
      while (k < m)
      {
        List localList3 = h;
        localList3.get(k);
        k += 1;
      }
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof AppBarLayout.a;
  }
  
  int getDownNestedPreScrollRange()
  {
    int k = f;
    int m = -1;
    if (k != m) {
      k = f;
    }
    for (;;)
    {
      return k;
      k = getChildCount() + -1;
      int n = k;
      m = 0;
      if (n >= 0)
      {
        View localView = getChildAt(n);
        AppBarLayout.a locala = (AppBarLayout.a)localView.getLayoutParams();
        int i1 = localView.getMeasuredHeight();
        int i2 = a;
        int i3 = i2 & 0x5;
        int i4 = 5;
        if (i3 == i4)
        {
          i3 = topMargin;
          k = bottomMargin + i3 + m;
          m = i2 & 0x8;
          if (m != 0)
          {
            m = w.r(localView);
            k += m;
          }
        }
        for (;;)
        {
          n += -1;
          m = k;
          break;
          m = i2 & 0x2;
          if (m != 0)
          {
            m = w.r(localView);
            m = i1 - m;
            k += m;
          }
          else
          {
            m = getTopInset();
            m = i1 - m;
            k += m;
            continue;
            if (m > 0) {
              break label181;
            }
            k = m;
          }
        }
      }
      label181:
      k = Math.max(0, m);
      f = k;
    }
  }
  
  int getDownNestedScrollRange()
  {
    int k = g;
    int m = -1;
    if (k != m)
    {
      k = g;
      return k;
    }
    int n = getChildCount();
    int i1 = 0;
    m = 0;
    label29:
    if (i1 < n)
    {
      View localView = getChildAt(i1);
      AppBarLayout.a locala = (AppBarLayout.a)localView.getLayoutParams();
      int i2 = localView.getMeasuredHeight();
      int i3 = topMargin;
      int i4 = bottomMargin;
      i3 += i4;
      i2 += i3;
      k = a;
      i3 = k & 0x1;
      if (i3 != 0)
      {
        m += i2;
        k &= 0x2;
        if (k != 0)
        {
          k = w.r(localView);
          i1 = getTopInset();
          k += i1;
        }
      }
    }
    for (k = m - k;; k = m)
    {
      k = Math.max(0, k);
      g = k;
      break;
      k = i1 + 1;
      i1 = k;
      break label29;
    }
  }
  
  final int getMinimumHeightForVisibleOverlappingContent()
  {
    int k = getTopInset();
    int m = w.r(this);
    if (m != 0) {
      m = m * 2 + k;
    }
    for (;;)
    {
      return m;
      m = getChildCount();
      View localView;
      if (m > 0)
      {
        m += -1;
        localView = getChildAt(m);
        m = w.r(localView);
      }
      for (;;)
      {
        if (m == 0) {
          break label66;
        }
        m = m * 2 + k;
        break;
        m = 0;
        localView = null;
      }
      label66:
      m = getHeight() / 3;
    }
  }
  
  int getPendingAction()
  {
    return b;
  }
  
  public float getTargetElevation()
  {
    return 0.0F;
  }
  
  final int getTopInset()
  {
    al localal = c;
    int k;
    if (localal != null)
    {
      localal = c;
      k = localal.b();
    }
    for (;;)
    {
      return k;
      k = 0;
      localal = null;
    }
  }
  
  public final int getTotalScrollRange()
  {
    int k = e;
    int m = -1;
    if (k != m)
    {
      k = e;
      return k;
    }
    int n = getChildCount();
    int i1 = 0;
    m = 0;
    label29:
    if (i1 < n)
    {
      View localView = getChildAt(i1);
      AppBarLayout.a locala = (AppBarLayout.a)localView.getLayoutParams();
      int i2 = localView.getMeasuredHeight();
      int i3 = a;
      int i4 = i3 & 0x1;
      if (i4 != 0)
      {
        i4 = topMargin;
        i2 += i4;
        k = bottomMargin + i2;
        m += k;
        k = i3 & 0x2;
        if (k != 0) {
          k = w.r(localView);
        }
      }
    }
    for (k = m - k;; k = m)
    {
      m = getTopInset();
      k -= m;
      k = Math.max(0, k);
      e = k;
      break;
      k = i1 + 1;
      i1 = k;
      break label29;
    }
  }
  
  int getUpNestedPreScrollRange()
  {
    return getTotalScrollRange();
  }
  
  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt1 = j;
    int k = arrayOfInt1.length + paramInt;
    int[] arrayOfInt2 = super.onCreateDrawableState(k);
    int i1 = 0;
    boolean bool1 = i;
    if (bool1)
    {
      int m = a.b.state_collapsible;
      arrayOfInt1[0] = m;
      i1 = 1;
      boolean bool2 = i;
      if (!bool2) {
        break label82;
      }
      bool2 = d;
      if (!bool2) {
        break label82;
      }
    }
    label82:
    for (int n = a.b.state_collapsed;; n = -a.b.state_collapsed)
    {
      arrayOfInt1[i1] = n;
      return mergeDrawableStates(arrayOfInt2, arrayOfInt1);
      n = -a.b.state_collapsible;
      break;
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int k = 1;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    a();
    a = false;
    int m = getChildCount();
    int n = 0;
    Object localObject;
    label76:
    int i2;
    if (n < m)
    {
      localObject = getChildAtgetLayoutParamsb;
      if (localObject != null) {
        a = k;
      }
    }
    else
    {
      m = getChildCount();
      n = 0;
      if (n >= m) {
        break label200;
      }
      localObject = (AppBarLayout.a)getChildAt(n).getLayoutParams();
      int i1 = a & 0x1;
      if (i1 != k) {
        break label178;
      }
      i2 = a & 0xA;
      if (i2 == 0) {
        break label178;
      }
      i2 = k;
      label132:
      if (i2 == 0) {
        break label187;
      }
      i2 = k;
    }
    for (;;)
    {
      k = i;
      if (k != i2)
      {
        i = i2;
        refreshDrawableState();
      }
      return;
      int i3 = n + 1;
      n = i3;
      break;
      label178:
      i3 = 0;
      localObject = null;
      break label132;
      label187:
      i3 = n + 1;
      n = i3;
      break label76;
      label200:
      i3 = 0;
      localObject = null;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    a();
  }
  
  public void setExpanded(boolean paramBoolean)
  {
    boolean bool = w.F(this);
    a(paramBoolean, bool, true);
  }
  
  public void setOrientation(int paramInt)
  {
    int k = 1;
    if (paramInt != k)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("AppBarLayout is always vertical and does not support horizontal orientation");
      throw localIllegalArgumentException;
    }
    super.setOrientation(paramInt);
  }
  
  public void setTargetElevation(float paramFloat)
  {
    int k = Build.VERSION.SDK_INT;
    int m = 21;
    if (k >= m) {
      y.a(this, paramFloat);
    }
  }
}


/* Location:              android/support/design/widget/AppBarLayout.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */