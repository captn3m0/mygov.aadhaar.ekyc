package android.support.design.widget;

import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.view.MenuItem;

final class NavigationView$1
  implements h.a
{
  NavigationView$1(NavigationView paramNavigationView) {}
  
  public final void a(h paramh) {}
  
  public final boolean a(h paramh, MenuItem paramMenuItem)
  {
    NavigationView.a locala = a.c;
    boolean bool;
    if (locala != null)
    {
      locala = a.c;
      locala.a(paramMenuItem);
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      locala = null;
    }
  }
}


/* Location:              android/support/design/widget/NavigationView$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */