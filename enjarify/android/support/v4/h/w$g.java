package android.support.v4.h;

import android.view.Display;
import android.view.View;

class w$g
  extends w.f
{
  public final boolean C(View paramView)
  {
    return paramView.isPaddingRelative();
  }
  
  public final Display K(View paramView)
  {
    return paramView.getDisplay();
  }
  
  public final void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.setPaddingRelative(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final int g(View paramView)
  {
    return paramView.getLayoutDirection();
  }
  
  public final int l(View paramView)
  {
    return paramView.getPaddingStart();
  }
  
  public final int m(View paramView)
  {
    return paramView.getPaddingEnd();
  }
  
  public final int v(View paramView)
  {
    return paramView.getWindowSystemUiVisibility();
  }
}


/* Location:              android/support/v4/h/w$g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */