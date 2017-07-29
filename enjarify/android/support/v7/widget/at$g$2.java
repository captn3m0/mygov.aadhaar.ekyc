package android.support.v7.widget;

import android.view.View;

final class at$g$2
  implements bi.b
{
  at$g$2(at.g paramg) {}
  
  public final int a()
  {
    return a.n();
  }
  
  public final int a(View paramView)
  {
    at.h localh = (at.h)paramView.getLayoutParams();
    int i = at.g.f(paramView);
    int j = topMargin;
    return i - j;
  }
  
  public final View a(int paramInt)
  {
    return a.d(paramInt);
  }
  
  public final int b()
  {
    int i = a.E;
    int j = a.p();
    return i - j;
  }
  
  public final int b(View paramView)
  {
    at.h localh = (at.h)paramView.getLayoutParams();
    int i = at.g.h(paramView);
    return bottomMargin + i;
  }
}


/* Location:              android/support/v7/widget/at$g$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */