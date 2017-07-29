package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.e.a.b;
import android.support.v4.g.a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

abstract class c<T>
  extends d<T>
{
  final Context a;
  Map<b, MenuItem> b;
  Map<android.support.v4.e.a.c, SubMenu> c;
  
  c(Context paramContext, T paramT)
  {
    super(paramT);
    a = paramContext;
  }
  
  final MenuItem a(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof b))
    {
      b localb = (b)paramMenuItem;
      if (b == null) {
        b = new a();
      }
      MenuItem localMenuItem = (MenuItem)b.get(paramMenuItem);
      paramMenuItem = localMenuItem;
      if (localMenuItem == null)
      {
        paramMenuItem = q.a(a, localb);
        b.put(localb, paramMenuItem);
      }
      return paramMenuItem;
    }
    return paramMenuItem;
  }
  
  final SubMenu a(SubMenu paramSubMenu)
  {
    if ((paramSubMenu instanceof android.support.v4.e.a.c))
    {
      android.support.v4.e.a.c localc = (android.support.v4.e.a.c)paramSubMenu;
      if (c == null) {
        c = new a();
      }
      SubMenu localSubMenu = (SubMenu)c.get(localc);
      paramSubMenu = localSubMenu;
      if (localSubMenu == null)
      {
        paramSubMenu = a;
        if (Build.VERSION.SDK_INT >= 14)
        {
          paramSubMenu = new v(paramSubMenu, localc);
          c.put(localc, paramSubMenu);
        }
      }
      else
      {
        return paramSubMenu;
      }
      throw new UnsupportedOperationException();
    }
    return paramSubMenu;
  }
}


/* Location:              android/support/v7/view/menu/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */