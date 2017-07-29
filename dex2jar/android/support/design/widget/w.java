package android.support.design.widget;

import android.view.View;

final class w
{
  final View a;
  int b;
  int c;
  int d;
  int e;
  
  public w(View paramView)
  {
    a = paramView;
  }
  
  final void a()
  {
    android.support.v4.h.w.e(a, d - (a.getTop() - b));
    android.support.v4.h.w.f(a, e - (a.getLeft() - c));
  }
  
  public final boolean a(int paramInt)
  {
    if (d != paramInt)
    {
      d = paramInt;
      a();
      return true;
    }
    return false;
  }
}


/* Location:              android/support/design/widget/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */