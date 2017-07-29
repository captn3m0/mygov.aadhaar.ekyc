package android.support.v7.view.menu;

import android.support.v4.h.m.e;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;

final class k$c
  extends d
  implements m.e
{
  k$c(k paramk, MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    super(paramOnActionExpandListener);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    MenuItem.OnActionExpandListener localOnActionExpandListener = (MenuItem.OnActionExpandListener)d;
    MenuItem localMenuItem = a.a(paramMenuItem);
    return localOnActionExpandListener.onMenuItemActionExpand(localMenuItem);
  }
  
  public final boolean b(MenuItem paramMenuItem)
  {
    MenuItem.OnActionExpandListener localOnActionExpandListener = (MenuItem.OnActionExpandListener)d;
    MenuItem localMenuItem = a.a(paramMenuItem);
    return localOnActionExpandListener.onMenuItemActionCollapse(localMenuItem);
  }
}


/* Location:              android/support/v7/view/menu/k$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */