package android.support.v7.view.menu;

import android.view.MenuItem;

final class e$2$1
  implements Runnable
{
  e$2$1(e.2 param2, e.a parama, MenuItem paramMenuItem, h paramh) {}
  
  public final void run()
  {
    Object localObject = a;
    if (localObject != null)
    {
      localObject = d.a;
      boolean bool1 = true;
      d = bool1;
      a.b.b(false);
      localObject = d.a;
      d = false;
    }
    localObject = b;
    boolean bool2 = ((MenuItem)localObject).isEnabled();
    if (bool2)
    {
      localObject = b;
      bool2 = ((MenuItem)localObject).hasSubMenu();
      if (bool2)
      {
        localObject = c;
        MenuItem localMenuItem = b;
        int i = 4;
        ((h)localObject).a(localMenuItem, null, i);
      }
    }
  }
}


/* Location:              android/support/v7/view/menu/e$2$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */