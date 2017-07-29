package android.support.v7.app;

import android.support.v7.view.menu.h;
import android.view.Menu;
import android.view.Window.Callback;

final class q$1
  implements Runnable
{
  q$1(q paramq) {}
  
  public final void run()
  {
    boolean bool1 = false;
    Object localObject1 = null;
    q localq = a;
    Menu localMenu = localq.h();
    boolean bool2 = localMenu instanceof h;
    if (bool2)
    {
      localObject1 = localMenu;
      localObject1 = (h)localMenu;
    }
    for (localObject3 = localObject1;; localObject3 = null)
    {
      if (localObject3 != null) {
        ((h)localObject3).d();
      }
      try
      {
        ((Menu)localMenu).clear();
        localObject1 = c;
        bool1 = ((Window.Callback)localObject1).onCreatePanelMenu(0, (Menu)localMenu);
        if (bool1)
        {
          localObject1 = c;
          localq = null;
          bool1 = ((Window.Callback)localObject1).onPreparePanel(0, null, (Menu)localMenu);
          if (bool1) {}
        }
        else
        {
          ((Menu)localMenu).clear();
        }
        return;
      }
      finally
      {
        if (localObject3 == null) {
          break;
        }
        ((h)localObject3).e();
      }
      bool2 = false;
    }
  }
}


/* Location:              android/support/v7/app/q$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */