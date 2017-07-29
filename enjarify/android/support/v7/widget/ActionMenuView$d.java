package android.support.v7.widget;

import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.view.MenuItem;

final class ActionMenuView$d
  implements h.a
{
  ActionMenuView$d(ActionMenuView paramActionMenuView) {}
  
  public final void a(h paramh)
  {
    h.a locala = a.d;
    if (locala != null)
    {
      locala = a.d;
      locala.a(paramh);
    }
  }
  
  public final boolean a(h paramh, MenuItem paramMenuItem)
  {
    ActionMenuView.e locale = a.e;
    boolean bool;
    if (locale != null)
    {
      locale = a.e;
      bool = locale.a(paramMenuItem);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      locale = null;
    }
  }
}


/* Location:              android/support/v7/widget/ActionMenuView$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */