package android.support.v7.app;

import android.support.v7.view.menu.h;
import android.view.Menu;
import android.view.Window.Callback;
import java.util.List;

final class i$a
  extends l.a
{
  i$a(i parami, Window.Callback paramCallback)
  {
    super(parami, paramCallback);
  }
  
  public final void onProvideKeyboardShortcuts(List paramList, Menu paramMenu, int paramInt)
  {
    Object localObject = b;
    h localh = null;
    localObject = ((i)localObject).g(0);
    if (localObject != null)
    {
      localh = j;
      if (localh != null)
      {
        localObject = j;
        super.onProvideKeyboardShortcuts(paramList, (Menu)localObject, paramInt);
      }
    }
    for (;;)
    {
      return;
      super.onProvideKeyboardShortcuts(paramList, paramMenu, paramInt);
    }
  }
}


/* Location:              android/support/v7/app/i$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */