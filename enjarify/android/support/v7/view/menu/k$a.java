package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.h.e;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

class k$a
  extends e
{
  final ActionProvider c;
  
  public k$a(k paramk, Context paramContext, ActionProvider paramActionProvider)
  {
    super(paramContext);
    c = paramActionProvider;
  }
  
  public final View a()
  {
    return c.onCreateActionView();
  }
  
  public final void a(SubMenu paramSubMenu)
  {
    ActionProvider localActionProvider = c;
    SubMenu localSubMenu = d.a(paramSubMenu);
    localActionProvider.onPrepareSubMenu(localSubMenu);
  }
  
  public final boolean d()
  {
    return c.onPerformDefaultAction();
  }
  
  public final boolean e()
  {
    return c.hasSubMenu();
  }
}


/* Location:              android/support/v7/view/menu/k$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */