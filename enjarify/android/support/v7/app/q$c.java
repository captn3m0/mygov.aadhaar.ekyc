package android.support.v7.app;

import android.support.v7.view.menu.h;
import android.support.v7.view.menu.o.a;
import android.view.Window.Callback;

final class q$c
  implements o.a
{
  q$c(q paramq) {}
  
  public final void a(h paramh, boolean paramBoolean)
  {
    Window.Callback localCallback = a.c;
    if (localCallback != null)
    {
      localCallback = a.c;
      localCallback.onPanelClosed(0, paramh);
    }
  }
  
  public final boolean a(h paramh)
  {
    if (paramh == null)
    {
      Window.Callback localCallback = a.c;
      if (localCallback != null)
      {
        localCallback = a.c;
        localCallback.onMenuOpened(0, paramh);
      }
    }
    return true;
  }
}


/* Location:              android/support/v7/app/q$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */