package android.support.v7.widget;

import android.view.View;

final class at$g$1
  implements bi.b
{
  at$g$1(at.g paramg) {}
  
  public final int a()
  {
    return a.m();
  }
  
  public final int a(View paramView)
  {
    at.h localh = (at.h)paramView.getLayoutParams();
    int i = at.g.e(paramView);
    int j = leftMargin;
    return i - j;
  }
  
  public final View a(int paramInt)
  {
    return a.d(paramInt);
  }
  
  public final int b()
  {
    int i = a.D;
    int j = a.o();
    return i - j;
  }
  
  public final int b(View paramView)
  {
    at.h localh = (at.h)paramView.getLayoutParams();
    int i = at.g.g(paramView);
    return rightMargin + i;
  }
}


/* Location:              android/support/v7/widget/at$g$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */