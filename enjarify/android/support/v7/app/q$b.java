package android.support.v7.app;

import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.support.v7.widget.ae;
import android.view.MenuItem;
import android.view.Window.Callback;

final class q$b
  implements h.a
{
  q$b(q paramq) {}
  
  public final void a(h paramh)
  {
    int i = 108;
    Object localObject = a.c;
    boolean bool;
    if (localObject != null)
    {
      localObject = a.a;
      bool = ((ae)localObject).i();
      if (!bool) {
        break label53;
      }
      localObject = a.c;
      ((Window.Callback)localObject).onPanelClosed(i, paramh);
    }
    for (;;)
    {
      return;
      label53:
      localObject = a.c;
      bool = ((Window.Callback)localObject).onPreparePanel(0, null, paramh);
      if (bool)
      {
        localObject = a.c;
        ((Window.Callback)localObject).onMenuOpened(i, paramh);
      }
    }
  }
  
  public final boolean a(h paramh, MenuItem paramMenuItem)
  {
    return false;
  }
}


/* Location:              android/support/v7/app/q$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */