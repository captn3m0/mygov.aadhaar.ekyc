package android.support.v7.view.menu;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class k$d
  extends d
  implements MenuItem.OnMenuItemClickListener
{
  k$d(k paramk, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    super(paramOnMenuItemClickListener);
  }
  
  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    MenuItem.OnMenuItemClickListener localOnMenuItemClickListener = (MenuItem.OnMenuItemClickListener)d;
    MenuItem localMenuItem = a.a(paramMenuItem);
    return localOnMenuItemClickListener.onMenuItemClick(localMenuItem);
  }
}


/* Location:              android/support/v7/view/menu/k$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */