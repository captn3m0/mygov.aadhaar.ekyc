package android.support.v4.h;

import android.view.View;

class w$i
  extends w.h
{
  public final boolean G(View paramView)
  {
    return paramView.isLaidOut();
  }
  
  public final boolean I(View paramView)
  {
    return paramView.isAttachedToWindow();
  }
  
  public final void c(View paramView, int paramInt)
  {
    paramView.setImportantForAccessibility(paramInt);
  }
  
  public final void k(View paramView)
  {
    paramView.setAccessibilityLiveRegion(1);
  }
}


/* Location:              android/support/v4/h/w$i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */