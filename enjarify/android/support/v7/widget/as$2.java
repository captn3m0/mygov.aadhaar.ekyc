package android.support.v7.widget;

import android.graphics.Rect;
import android.view.View;

final class as$2
  extends as
{
  as$2(at.g paramg)
  {
    super(paramg, (byte)0);
  }
  
  public final int a(View paramView)
  {
    at.h localh = (at.h)paramView.getLayoutParams();
    int i = at.g.f(paramView);
    int j = topMargin;
    return i - j;
  }
  
  public final void a(int paramInt)
  {
    a.f(paramInt);
  }
  
  public final int b()
  {
    return a.n();
  }
  
  public final int b(View paramView)
  {
    at.h localh = (at.h)paramView.getLayoutParams();
    int i = at.g.h(paramView);
    return bottomMargin + i;
  }
  
  public final int c()
  {
    int i = a.E;
    int j = a.p();
    return i - j;
  }
  
  public final int c(View paramView)
  {
    at.g localg = a;
    Rect localRect = c;
    localg.a(paramView, localRect);
    return c.bottom;
  }
  
  public final int d()
  {
    return a.E;
  }
  
  public final int d(View paramView)
  {
    at.g localg = a;
    Rect localRect = c;
    localg.a(paramView, localRect);
    return c.top;
  }
  
  public final int e()
  {
    int i = a.E;
    int j = a.n();
    i -= j;
    j = a.p();
    return i - j;
  }
  
  public final int e(View paramView)
  {
    at.h localh = (at.h)paramView.getLayoutParams();
    int i = at.g.d(paramView);
    int j = topMargin;
    i += j;
    return bottomMargin + i;
  }
  
  public final int f()
  {
    return a.p();
  }
  
  public final int f(View paramView)
  {
    at.h localh = (at.h)paramView.getLayoutParams();
    int i = at.g.c(paramView);
    int j = leftMargin;
    i += j;
    return rightMargin + i;
  }
  
  public final int g()
  {
    return a.C;
  }
  
  public final int h()
  {
    return a.B;
  }
}


/* Location:              android/support/v7/widget/as$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */