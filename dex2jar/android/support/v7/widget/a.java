package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.support.v4.h.ae;
import android.support.v4.h.ai;
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
  protected final a a = new a();
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
    paramAttributeSet = new TypedValue();
    if ((paramContext.getTheme().resolveAttribute(android.support.v7.a.a.a.actionBarPopupTheme, paramAttributeSet, true)) && (resourceId != 0))
    {
      b = new ContextThemeWrapper(paramContext, resourceId);
      return;
    }
    b = paramContext;
  }
  
  protected static int a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBoolean) {
      return paramInt1 - paramInt2;
    }
    return paramInt1 + paramInt2;
  }
  
  protected static int a(View paramView, int paramInt1, int paramInt2)
  {
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, Integer.MIN_VALUE), paramInt2);
    return Math.max(0, paramInt1 - paramView.getMeasuredWidth() + 0);
  }
  
  protected static int a(View paramView, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    paramInt2 = (paramInt3 - j) / 2 + paramInt2;
    if (paramBoolean) {
      paramView.layout(paramInt1 - i, paramInt2, paramInt1, j + paramInt2);
    }
    for (;;)
    {
      paramInt1 = i;
      if (paramBoolean) {
        paramInt1 = -i;
      }
      return paramInt1;
      paramView.layout(paramInt1, paramInt2, paramInt1 + i, j + paramInt2);
    }
  }
  
  public ae a(int paramInt, long paramLong)
  {
    if (f != null) {
      f.a();
    }
    if (paramInt == 0)
    {
      if (getVisibility() != 0) {
        w.c(this, 0.0F);
      }
      localae = w.s(this).a(1.0F);
      localae.a(paramLong);
      localae.a(a.a(localae, paramInt));
      return localae;
    }
    ae localae = w.s(this).a(0.0F);
    localae.a(paramLong);
    localae.a(a.a(localae, paramInt));
    return localae;
  }
  
  public boolean a()
  {
    if (d != null) {
      return d.f();
    }
    return false;
  }
  
  public int getAnimatedVisibility()
  {
    if (f != null) {
      return a.a;
    }
    return getVisibility();
  }
  
  public int getContentHeight()
  {
    return e;
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    paramConfiguration = getContext().obtainStyledAttributes(null, a.j.ActionBar, android.support.v7.a.a.a.actionBarStyle, 0);
    setContentHeight(paramConfiguration.getLayoutDimension(a.j.ActionBar_height, 0));
    paramConfiguration.recycle();
    if (d != null) {
      d.d();
    }
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i = n.a(paramMotionEvent);
    if (i == 9) {
      h = false;
    }
    if (!h)
    {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if ((i == 9) && (!bool)) {
        h = true;
      }
    }
    if ((i == 10) || (i == 3)) {
      h = false;
    }
    return true;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = n.a(paramMotionEvent);
    if (i == 0) {
      g = false;
    }
    if (!g)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if ((i == 0) && (!bool)) {
        g = true;
      }
    }
    if ((i == 1) || (i == 3)) {
      g = false;
    }
    return true;
  }
  
  public void setContentHeight(int paramInt)
  {
    e = paramInt;
    requestLayout();
  }
  
  public void setVisibility(int paramInt)
  {
    if (paramInt != getVisibility())
    {
      if (f != null) {
        f.a();
      }
      super.setVisibility(paramInt);
    }
  }
  
  protected final class a
    implements ai
  {
    int a;
    private boolean c = false;
    
    protected a() {}
    
    public final a a(ae paramae, int paramInt)
    {
      f = paramae;
      a = paramInt;
      return this;
    }
    
    public final void a(View paramView)
    {
      a.a(a.this);
      c = false;
    }
    
    public final void b(View paramView)
    {
      if (c) {
        return;
      }
      f = null;
      a.a(a.this, a);
    }
    
    public final void c(View paramView)
    {
      c = true;
    }
  }
}


/* Location:              android/support/v7/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */