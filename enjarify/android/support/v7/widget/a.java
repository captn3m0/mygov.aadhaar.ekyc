package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.support.v4.h.ae;
import android.support.v4.h.n;
import android.support.v4.h.w;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

abstract class a
  extends ViewGroup
{
  protected final a.a a;
  protected final Context b;
  protected ActionMenuView c;
  protected d d;
  protected int e;
  protected ae f;
  private boolean g;
  private boolean h;
  
  a(Context paramContext)
  {
    this(paramContext, null);
  }
  
  a(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject1 = new android/support/v7/widget/a$a;
    ((a.a)localObject1).<init>(this);
    a = ((a.a)localObject1);
    localObject1 = new android/util/TypedValue;
    ((TypedValue)localObject1).<init>();
    Object localObject2 = paramContext.getTheme();
    int i = android.support.v7.a.a.a.actionBarPopupTheme;
    boolean bool1 = true;
    boolean bool2 = ((Resources.Theme)localObject2).resolveAttribute(i, (TypedValue)localObject1, bool1);
    if (bool2)
    {
      int j = resourceId;
      if (j != 0)
      {
        localObject2 = new android/view/ContextThemeWrapper;
        int k = resourceId;
        ((ContextThemeWrapper)localObject2).<init>(paramContext, k);
      }
    }
    for (b = ((Context)localObject2);; b = paramContext) {
      return;
    }
  }
  
  protected static int a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = paramInt1 - paramInt2;; i = paramInt1 + paramInt2) {
      return i;
    }
  }
  
  protected static int a(View paramView, int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.makeMeasureSpec(paramInt1, -1 << -1);
    paramView.measure(i, paramInt2);
    i = paramView.getMeasuredWidth();
    i = paramInt1 - i + 0;
    return Math.max(0, i);
  }
  
  protected static int a(View paramView, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    int k = (paramInt3 - j) / 2 + paramInt2;
    int m;
    if (paramBoolean)
    {
      m = paramInt1 - i;
      j += k;
      paramView.layout(m, k, paramInt1, j);
    }
    for (;;)
    {
      if (paramBoolean) {
        i = -i;
      }
      return i;
      m = paramInt1 + i;
      j += k;
      paramView.layout(paramInt1, k, m, j);
    }
  }
  
  public ae a(int paramInt, long paramLong)
  {
    float f1 = 0.0F;
    a.a locala = null;
    ae localae = f;
    if (localae != null)
    {
      localae = f;
      localae.a();
    }
    if (paramInt == 0)
    {
      int i = getVisibility();
      if (i != 0) {
        w.c(this, 0.0F);
      }
      localae = w.s(this);
      f1 = 1.0F;
      localae = localae.a(f1);
      localae.a(paramLong);
      locala = a.a(localae, paramInt);
      localae.a(locala);
    }
    for (;;)
    {
      return localae;
      localae = w.s(this).a(0.0F);
      localae.a(paramLong);
      locala = a.a(localae, paramInt);
      localae.a(locala);
    }
  }
  
  public boolean a()
  {
    d locald = d;
    boolean bool;
    if (locald != null)
    {
      locald = d;
      bool = locald.f();
    }
    for (;;)
    {
      return bool;
      bool = false;
      locald = null;
    }
  }
  
  public int getAnimatedVisibility()
  {
    Object localObject = f;
    if (localObject != null) {
      localObject = a;
    }
    for (int i = a;; i = getVisibility()) {
      return i;
    }
  }
  
  public int getContentHeight()
  {
    return e;
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    Object localObject = getContext();
    int[] arrayOfInt = a.j.ActionBar;
    int i = android.support.v7.a.a.a.actionBarStyle;
    localObject = ((Context)localObject).obtainStyledAttributes(null, arrayOfInt, i, 0);
    int j = a.j.ActionBar_height;
    j = ((TypedArray)localObject).getLayoutDimension(j, 0);
    setContentHeight(j);
    ((TypedArray)localObject).recycle();
    localObject = d;
    if (localObject != null)
    {
      localObject = d;
      ((d)localObject).d();
    }
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i = 9;
    boolean bool1 = true;
    int j = n.a(paramMotionEvent);
    if (j == i) {
      h = false;
    }
    boolean bool2 = h;
    if (!bool2)
    {
      bool2 = super.onHoverEvent(paramMotionEvent);
      if ((j == i) && (!bool2)) {
        h = bool1;
      }
    }
    int k = 10;
    if (j != k)
    {
      k = 3;
      if (j != k) {}
    }
    else
    {
      h = false;
    }
    return bool1;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 1;
    int j = n.a(paramMotionEvent);
    if (j == 0) {
      g = false;
    }
    boolean bool = g;
    if (!bool)
    {
      bool = super.onTouchEvent(paramMotionEvent);
      if ((j == 0) && (!bool)) {
        g = i;
      }
    }
    if (j != i)
    {
      int k = 3;
      if (j != k) {}
    }
    else
    {
      g = false;
    }
    return i;
  }
  
  public void setContentHeight(int paramInt)
  {
    e = paramInt;
    requestLayout();
  }
  
  public void setVisibility(int paramInt)
  {
    int i = getVisibility();
    if (paramInt != i)
    {
      ae localae = f;
      if (localae != null)
      {
        localae = f;
        localae.a();
      }
      super.setVisibility(paramInt);
    }
  }
}


/* Location:              android/support/v7/widget/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */