package android.support.design.widget;

import android.support.v4.h.al;
import android.support.v4.h.s;
import android.support.v4.h.w;
import android.view.View;

final class AppBarLayout$1
  implements s
{
  AppBarLayout$1(AppBarLayout paramAppBarLayout) {}
  
  public final al a(View paramView, al paramal)
  {
    AppBarLayout localAppBarLayout = a;
    al localal1 = null;
    boolean bool = w.x(localAppBarLayout);
    if (bool) {
      localal1 = paramal;
    }
    al localal2 = c;
    bool = x.a(localal2, localal1);
    if (!bool)
    {
      c = localal1;
      localAppBarLayout.a();
    }
    return paramal;
  }
}


/* Location:              android/support/design/widget/AppBarLayout$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */