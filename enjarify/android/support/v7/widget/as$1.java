package android.support.v7.widget;

import android.graphics.Rect;
import android.view.View;

final class as$1
  extends as
{
  as$1(at.g paramg)
  {
    super(paramg, (byte)0);
  }
  
  public final int a(View paramView)
  {
    at.h localh = (at.h)paramView.getLayoutParams();
    int i = at.g.e(paramView);
    int j = leftMargin;
    return i - j;
  }
  
  public final void a(int paramInt)
  {
    a.e(paramInt);
  }
  
  public final int b()
  {
    return a.m();
  }
  
  public final int b(View paramView)
  {
    at.h localh = (at.h)paramView.getLayoutParams();
    int i = at.g.g(paramView);
    return rightMargin + i;
  }
  
  public final int c()
  {
    int i = a.D;
    int j = a.o();
    return i - j;
  }
  
  public final int c(View paramView)
  {
    at.g localg = a;
    Rect localRect = c;
    localg.a(paramView, localRect);
    return c.right;
  }
  
  public final int d()
  {
    return a.D;
  }
  
  public final int d(View paramView)
  {
    at.g localg = a;
    Rect localRect = c;
    localg.a(paramView, localRect);
    return c.left;
  }
  
  public final int e()
  {
    int i = a.D;
    int j = a.m();
    i -= j;
    j = a.o();
    return i - j;
  }
  
  public final int e(View paramView)
  {
    at.h localh = (at.h)paramView.getLayoutParams();
    int i = at.g.c(paramView);
    int j = leftMargin;
    i += j;
    return rightMargin + i;
  }
  
  public final int f()
  {
    return a.o();
  }
  
  public final int f(View paramView)
  {
    at.h localh = (at.h)paramView.getLayoutParams();
    int i = at.g.d(paramView);
    int j = topMargin;
    i += j;
    return bottomMargin + i;
  }
  
  public final int g()
  {
    return a.B;
  }
  
  public final int h()
  {
    return a.C;
  }
}


/* Location:              android/support/v7/widget/as$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */