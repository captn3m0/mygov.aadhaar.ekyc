package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.h.w;
import android.support.v7.a.a.f;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class ActionBarContainer
  extends FrameLayout
{
  Drawable a;
  Drawable b;
  Drawable c;
  boolean d;
  boolean e;
  private boolean f;
  private View g;
  private View h;
  private View i;
  private int j;
  
  public ActionBarContainer(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionBarContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int k = Build.VERSION.SDK_INT;
    int m = 21;
    Object localObject;
    boolean bool2;
    if (k >= m)
    {
      localObject = new android/support/v7/widget/c;
      ((c)localObject).<init>(this);
      w.a(this, (Drawable)localObject);
      localObject = a.j.ActionBar;
      localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
      m = a.j.ActionBar_background;
      Drawable localDrawable = ((TypedArray)localObject).getDrawable(m);
      a = localDrawable;
      m = a.j.ActionBar_backgroundStacked;
      localDrawable = ((TypedArray)localObject).getDrawable(m);
      b = localDrawable;
      m = a.j.ActionBar_height;
      m = ((TypedArray)localObject).getDimensionPixelSize(m, -1);
      j = m;
      m = getId();
      int n = a.f.split_action_bar;
      if (m == n)
      {
        d = bool1;
        m = a.j.ActionBar_backgroundSplit;
        localDrawable = ((TypedArray)localObject).getDrawable(m);
        c = localDrawable;
      }
      ((TypedArray)localObject).recycle();
      bool2 = d;
      if (!bool2) {
        break label219;
      }
      localObject = c;
      if (localObject != null) {
        break label210;
      }
      bool2 = bool1;
    }
    for (;;)
    {
      setWillNotDraw(bool2);
      return;
      localObject = new android/support/v7/widget/b;
      ((b)localObject).<init>(this);
      break;
      label210:
      bool2 = false;
      localObject = null;
      continue;
      label219:
      localObject = a;
      if (localObject == null)
      {
        localObject = b;
        if (localObject == null)
        {
          bool2 = bool1;
          continue;
        }
      }
      bool2 = false;
      localObject = null;
    }
  }
  
  private static boolean a(View paramView)
  {
    if (paramView != null)
    {
      k = paramView.getVisibility();
      int n = 8;
      if (k != n)
      {
        k = paramView.getMeasuredHeight();
        if (k != 0) {
          break label30;
        }
      }
    }
    label30:
    int m;
    for (int k = 1;; m = 0) {
      return k;
    }
  }
  
  private static int b(View paramView)
  {
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)paramView.getLayoutParams();
    int k = paramView.getMeasuredHeight();
    int m = topMargin;
    k += m;
    return bottomMargin + k;
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = a;
    boolean bool;
    int[] arrayOfInt;
    if (localDrawable != null)
    {
      localDrawable = a;
      bool = localDrawable.isStateful();
      if (bool)
      {
        localDrawable = a;
        arrayOfInt = getDrawableState();
        localDrawable.setState(arrayOfInt);
      }
    }
    localDrawable = b;
    if (localDrawable != null)
    {
      localDrawable = b;
      bool = localDrawable.isStateful();
      if (bool)
      {
        localDrawable = b;
        arrayOfInt = getDrawableState();
        localDrawable.setState(arrayOfInt);
      }
    }
    localDrawable = c;
    if (localDrawable != null)
    {
      localDrawable = c;
      bool = localDrawable.isStateful();
      if (bool)
      {
        localDrawable = c;
        arrayOfInt = getDrawableState();
        localDrawable.setState(arrayOfInt);
      }
    }
  }
  
  public View getTabContainer()
  {
    return g;
  }
  
  public void jumpDrawablesToCurrentState()
  {
    int k = Build.VERSION.SDK_INT;
    int m = 11;
    if (k >= m)
    {
      super.jumpDrawablesToCurrentState();
      Drawable localDrawable = a;
      if (localDrawable != null)
      {
        localDrawable = a;
        localDrawable.jumpToCurrentState();
      }
      localDrawable = b;
      if (localDrawable != null)
      {
        localDrawable = b;
        localDrawable.jumpToCurrentState();
      }
      localDrawable = c;
      if (localDrawable != null)
      {
        localDrawable = c;
        localDrawable.jumpToCurrentState();
      }
    }
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    int k = a.f.action_bar;
    View localView = findViewById(k);
    h = localView;
    k = a.f.action_context_bar;
    localView = findViewById(k);
    i = localView;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = f;
    if (!bool)
    {
      bool = super.onInterceptTouchEvent(paramMotionEvent);
      if (!bool) {
        break label23;
      }
    }
    label23:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int k = 8;
    int m = 1;
    float f1 = Float.MIN_VALUE;
    int n = 0;
    Object localObject1 = null;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    View localView1 = g;
    int i3;
    Object localObject2;
    int i4;
    int i5;
    int i6;
    if (localView1 != null)
    {
      int i1 = localView1.getVisibility();
      if (i1 != k)
      {
        i3 = m;
        if (localView1 != null)
        {
          i1 = localView1.getVisibility();
          if (i1 != k)
          {
            k = getMeasuredHeight();
            localObject2 = (FrameLayout.LayoutParams)localView1.getLayoutParams();
            i4 = localView1.getMeasuredHeight();
            i4 = k - i4;
            i5 = bottomMargin;
            i4 -= i5;
            i1 = bottomMargin;
            i1 = k - i1;
            localView1.layout(paramInt1, i4, paramInt3, i1);
          }
        }
        boolean bool = d;
        if (!bool) {
          break label213;
        }
        localObject2 = c;
        if (localObject2 == null) {
          break label537;
        }
        localObject2 = c;
        i3 = getMeasuredWidth();
        i6 = getMeasuredHeight();
        ((Drawable)localObject2).setBounds(0, 0, i3, i6);
      }
    }
    for (;;)
    {
      if (m != 0) {
        invalidate();
      }
      return;
      i3 = 0;
      break;
      label213:
      localObject2 = a;
      int i2;
      View localView2;
      View localView3;
      View localView4;
      if (localObject2 != null)
      {
        localObject2 = h;
        i2 = ((View)localObject2).getVisibility();
        if (i2 == 0)
        {
          localObject2 = a;
          localObject1 = h;
          n = ((View)localObject1).getLeft();
          localView2 = h;
          k = localView2.getTop();
          localView3 = h;
          i4 = localView3.getRight();
          localView4 = h;
          i5 = localView4.getBottom();
          ((Drawable)localObject2).setBounds(n, k, i4, i5);
          label313:
          i2 = m;
        }
      }
      for (float f2 = f1;; f2 = 0.0F)
      {
        e = i3;
        if (i3 != 0)
        {
          localObject1 = b;
          if (localObject1 != null)
          {
            localObject2 = b;
            n = localView1.getLeft();
            i3 = localView1.getTop();
            k = localView1.getRight();
            i6 = localView1.getBottom();
            ((Drawable)localObject2).setBounds(n, i3, k, i6);
            break;
            localObject2 = i;
            if (localObject2 != null)
            {
              localObject2 = i;
              i2 = ((View)localObject2).getVisibility();
              if (i2 == 0)
              {
                localObject2 = a;
                localObject1 = i;
                n = ((View)localObject1).getLeft();
                localView2 = i;
                k = localView2.getTop();
                localView3 = i;
                i4 = localView3.getRight();
                localView4 = i;
                i5 = localView4.getBottom();
                ((Drawable)localObject2).setBounds(n, k, i4, i5);
                break label313;
              }
            }
            localObject2 = a;
            ((Drawable)localObject2).setBounds(0, 0, 0, 0);
            break label313;
          }
        }
        m = i2;
        f1 = f2;
        break;
        i2 = 0;
        localObject2 = null;
      }
      label537:
      m = 0;
      f1 = 0.0F;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int k = -1 << -1;
    View localView1 = h;
    int m;
    int i2;
    if (localView1 == null)
    {
      m = View.MeasureSpec.getMode(paramInt2);
      if (m == k)
      {
        m = j;
        if (m >= 0)
        {
          m = j;
          i2 = View.MeasureSpec.getSize(paramInt2);
          m = Math.min(m, i2);
          paramInt2 = View.MeasureSpec.makeMeasureSpec(m, k);
        }
      }
    }
    super.onMeasure(paramInt1, paramInt2);
    localView1 = h;
    if (localView1 == null) {}
    int i3;
    do
    {
      do
      {
        do
        {
          return;
          i3 = View.MeasureSpec.getMode(paramInt2);
          localView1 = g;
        } while (localView1 == null);
        localView1 = g;
        m = localView1.getVisibility();
        i2 = 8;
      } while (m == i2);
      m = 1073741824;
    } while (i3 == m);
    localView1 = h;
    boolean bool1 = a(localView1);
    if (!bool1)
    {
      localView1 = h;
      n = b(localView1);
      i2 = n;
      label171:
      if (i3 != k) {
        break label277;
      }
    }
    int i1;
    label277:
    for (int n = View.MeasureSpec.getSize(paramInt2);; i1 = -1 >>> 1)
    {
      i3 = getMeasuredWidth();
      View localView2 = g;
      k = b(localView2);
      i2 += k;
      n = Math.min(i2, n);
      setMeasuredDimension(i3, n);
      break;
      localView1 = i;
      boolean bool2 = a(localView1);
      if (!bool2)
      {
        localView1 = i;
        i1 = b(localView1);
        i2 = i1;
        break label171;
      }
      i1 = 0;
      localView1 = null;
      i2 = 0;
      break label171;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    super.onTouchEvent(paramMotionEvent);
    return true;
  }
  
  public void setPrimaryBackground(Drawable paramDrawable)
  {
    boolean bool1 = true;
    Object localObject = a;
    int k;
    View localView1;
    if (localObject != null)
    {
      localObject = a;
      k = 0;
      localView1 = null;
      ((Drawable)localObject).setCallback(null);
      localObject = a;
      unscheduleDrawable((Drawable)localObject);
    }
    a = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      localObject = h;
      if (localObject != null)
      {
        localObject = a;
        localView1 = h;
        k = localView1.getLeft();
        View localView2 = h;
        int m = localView2.getTop();
        View localView3 = h;
        int n = localView3.getRight();
        View localView4 = h;
        int i1 = localView4.getBottom();
        ((Drawable)localObject).setBounds(k, m, n, i1);
      }
    }
    boolean bool2 = d;
    if (bool2)
    {
      localObject = c;
      if (localObject != null) {}
    }
    for (;;)
    {
      setWillNotDraw(bool1);
      invalidate();
      return;
      bool1 = false;
      continue;
      localObject = a;
      if (localObject == null)
      {
        localObject = b;
        if (localObject == null) {}
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public void setSplitBackground(Drawable paramDrawable)
  {
    boolean bool1 = true;
    Drawable localDrawable = c;
    int k;
    if (localDrawable != null)
    {
      localDrawable = c;
      k = 0;
      localDrawable.setCallback(null);
      localDrawable = c;
      unscheduleDrawable(localDrawable);
    }
    c = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      bool2 = d;
      if (bool2)
      {
        localDrawable = c;
        if (localDrawable != null)
        {
          localDrawable = c;
          k = getMeasuredWidth();
          int m = getMeasuredHeight();
          localDrawable.setBounds(0, 0, k, m);
        }
      }
    }
    boolean bool2 = d;
    if (bool2)
    {
      localDrawable = c;
      if (localDrawable != null) {}
    }
    for (;;)
    {
      setWillNotDraw(bool1);
      invalidate();
      return;
      bool1 = false;
      continue;
      localDrawable = a;
      if (localDrawable == null)
      {
        localDrawable = b;
        if (localDrawable == null) {}
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public void setStackedBackground(Drawable paramDrawable)
  {
    boolean bool1 = true;
    Drawable localDrawable = b;
    int k;
    View localView1;
    if (localDrawable != null)
    {
      localDrawable = b;
      k = 0;
      localView1 = null;
      localDrawable.setCallback(null);
      localDrawable = b;
      unscheduleDrawable(localDrawable);
    }
    b = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      bool2 = e;
      if (bool2)
      {
        localDrawable = b;
        if (localDrawable != null)
        {
          localDrawable = b;
          localView1 = g;
          k = localView1.getLeft();
          View localView2 = g;
          int m = localView2.getTop();
          View localView3 = g;
          int n = localView3.getRight();
          View localView4 = g;
          int i1 = localView4.getBottom();
          localDrawable.setBounds(k, m, n, i1);
        }
      }
    }
    boolean bool2 = d;
    if (bool2)
    {
      localDrawable = c;
      if (localDrawable != null) {}
    }
    for (;;)
    {
      setWillNotDraw(bool1);
      invalidate();
      return;
      bool1 = false;
      continue;
      localDrawable = a;
      if (localDrawable == null)
      {
        localDrawable = b;
        if (localDrawable == null) {}
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public void setTabContainer(ay paramay)
  {
    Object localObject = g;
    if (localObject != null)
    {
      localObject = g;
      removeView((View)localObject);
    }
    g = paramay;
    if (paramay != null)
    {
      addView(paramay);
      localObject = paramay.getLayoutParams();
      width = -1;
      int k = -2;
      height = k;
      localObject = null;
      paramay.setAllowCollapse(false);
    }
  }
  
  public void setTransitioning(boolean paramBoolean)
  {
    f = paramBoolean;
    if (paramBoolean) {}
    for (int k = 393216;; k = 262144)
    {
      setDescendantFocusability(k);
      return;
    }
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      Drawable localDrawable = a;
      if (localDrawable != null)
      {
        localDrawable = a;
        localDrawable.setVisible(bool, false);
      }
      localDrawable = b;
      if (localDrawable != null)
      {
        localDrawable = b;
        localDrawable.setVisible(bool, false);
      }
      localDrawable = c;
      if (localDrawable != null)
      {
        localDrawable = c;
        localDrawable.setVisible(bool, false);
      }
      return;
    }
  }
  
  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback)
  {
    return null;
  }
  
  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback, int paramInt)
  {
    if (paramInt != 0) {}
    for (ActionMode localActionMode = super.startActionModeForChild(paramView, paramCallback, paramInt);; localActionMode = null) {
      return localActionMode;
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    Drawable localDrawable = a;
    if (paramDrawable == localDrawable)
    {
      bool = d;
      if (!bool) {}
    }
    else
    {
      localDrawable = b;
      if (paramDrawable == localDrawable)
      {
        bool = e;
        if (bool) {}
      }
      else
      {
        localDrawable = c;
        if (paramDrawable == localDrawable)
        {
          bool = d;
          if (bool) {}
        }
        else
        {
          bool = super.verifyDrawable(paramDrawable);
          if (!bool) {
            break label71;
          }
        }
      }
    }
    boolean bool = true;
    for (;;)
    {
      return bool;
      label71:
      bool = false;
      localDrawable = null;
    }
  }
}


/* Location:              android/support/v7/widget/ActionBarContainer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */