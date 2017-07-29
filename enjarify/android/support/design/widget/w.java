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
    View localView = a;
    int i = d;
    int j = a.getTop();
    int k = b;
    j -= k;
    i -= j;
    android.support.v4.h.w.e(localView, i);
    localView = a;
    i = e;
    j = a.getLeft();
    k = c;
    j -= k;
    i -= j;
    android.support.v4.h.w.f(localView, i);
  }
  
  public final boolean a(int paramInt)
  {
    int i = d;
    if (i != paramInt)
    {
      d = paramInt;
      a();
    }
    for (i = 1;; i = 0) {
      return i;
    }
  }
}


/* Location:              android/support/design/widget/w.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */