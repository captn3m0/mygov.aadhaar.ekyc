package android.support.v7.widget;

import android.support.v4.h.aj;
import android.view.View;

final class bg$2
  extends aj
{
  private boolean c = false;
  
  bg$2(bg parambg, int paramInt) {}
  
  public final void a(View paramView)
  {
    b.a.setVisibility(0);
  }
  
  public final void b(View paramView)
  {
    boolean bool = c;
    if (!bool)
    {
      Toolbar localToolbar = b.a;
      int i = a;
      localToolbar.setVisibility(i);
    }
  }
  
  public final void c(View paramView)
  {
    c = true;
  }
}


/* Location:              android/support/v7/widget/bg$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */