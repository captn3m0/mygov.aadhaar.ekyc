package android.support.design.widget;

import android.support.v4.h.al;
import android.support.v4.h.s;
import android.view.View;

final class b$3
  implements s
{
  b$3(b paramb) {}
  
  public final al a(View paramView, al paramal)
  {
    int i = paramView.getPaddingLeft();
    int j = paramView.getPaddingTop();
    int k = paramView.getPaddingRight();
    int m = paramal.d();
    paramView.setPadding(i, j, k, m);
    return paramal;
  }
}


/* Location:              android/support/design/widget/b$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */