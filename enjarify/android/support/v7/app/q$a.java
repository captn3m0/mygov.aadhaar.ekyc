package android.support.v7.app;

import android.support.v7.view.menu.h;
import android.support.v7.view.menu.o.a;
import android.support.v7.widget.ae;
import android.view.Window.Callback;

final class q$a
  implements o.a
{
  private boolean b;
  
  q$a(q paramq) {}
  
  public final void a(h paramh, boolean paramBoolean)
  {
    boolean bool = b;
    if (bool) {}
    for (;;)
    {
      return;
      bool = true;
      b = bool;
      a.a.n();
      Window.Callback localCallback = a.c;
      if (localCallback != null)
      {
        localCallback = a.c;
        int i = 108;
        localCallback.onPanelClosed(i, paramh);
      }
      bool = false;
      localCallback = null;
      b = false;
    }
  }
  
  public final boolean a(h paramh)
  {
    Window.Callback localCallback = a.c;
    boolean bool;
    if (localCallback != null)
    {
      localCallback = a.c;
      int i = 108;
      localCallback.onMenuOpened(i, paramh);
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localCallback = null;
    }
  }
}


/* Location:              android/support/v7/app/q$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */