package android.support.v4.h;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;

class w$f
  extends w.d
{
  public final void a(View paramView, Drawable paramDrawable)
  {
    paramView.setBackground(paramDrawable);
  }
  
  public final void a(View paramView, Runnable paramRunnable)
  {
    paramView.postOnAnimation(paramRunnable);
  }
  
  public final void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    paramView.postOnAnimationDelayed(paramRunnable, paramLong);
  }
  
  public final boolean b(View paramView)
  {
    return paramView.hasTransientState();
  }
  
  public final void c(View paramView)
  {
    paramView.postInvalidateOnAnimation();
  }
  
  public void c(View paramView, int paramInt)
  {
    int i = 4;
    if (paramInt == i) {
      paramInt = 2;
    }
    paramView.setImportantForAccessibility(paramInt);
  }
  
  public final int d(View paramView)
  {
    return paramView.getImportantForAccessibility();
  }
  
  public final ViewParent h(View paramView)
  {
    return paramView.getParentForAccessibility();
  }
  
  public final boolean n(View paramView)
  {
    return paramView.hasOverlappingRendering();
  }
  
  public final int r(View paramView)
  {
    return paramView.getMinimumWidth();
  }
  
  public final int s(View paramView)
  {
    return paramView.getMinimumHeight();
  }
  
  public void w(View paramView)
  {
    paramView.requestFitSystemWindows();
  }
  
  public final boolean z(View paramView)
  {
    return paramView.getFitsSystemWindows();
  }
}


/* Location:              android/support/v4/h/w$f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */