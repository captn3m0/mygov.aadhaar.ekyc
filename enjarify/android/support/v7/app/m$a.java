package android.support.v7.app;

import android.support.v7.view.menu.o.a;
import android.view.Window;
import android.view.Window.Callback;

final class m$a
  implements o.a
{
  m$a(m paramm) {}
  
  public final void a(android.support.v7.view.menu.h paramh, boolean paramBoolean)
  {
    a.b(paramh);
  }
  
  public final boolean a(android.support.v7.view.menu.h paramh)
  {
    Window.Callback localCallback = a.c.getCallback();
    if (localCallback != null)
    {
      int i = 108;
      localCallback.onMenuOpened(i, paramh);
    }
    return true;
  }
}


/* Location:              android/support/v7/app/m$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */