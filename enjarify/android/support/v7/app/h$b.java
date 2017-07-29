package android.support.v7.app;

import android.support.v7.view.i;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;

class h$b
  extends i
{
  h$b(h paramh, Window.Callback paramCallback)
  {
    super(paramCallback);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    h localh = a;
    boolean bool = localh.a(paramKeyEvent);
    if (!bool)
    {
      bool = super.dispatchKeyEvent(paramKeyEvent);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localh = null;
    }
  }
  
  public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
  {
    boolean bool = super.dispatchKeyShortcutEvent(paramKeyEvent);
    h localh;
    if (!bool)
    {
      localh = a;
      int i = paramKeyEvent.getKeyCode();
      bool = localh.a(i, paramKeyEvent);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localh = null;
    }
  }
  
  public void onContentChanged() {}
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if (paramInt == 0)
    {
      bool = paramMenu instanceof android.support.v7.view.menu.h;
      if (bool) {}
    }
    for (boolean bool = false;; bool = super.onCreatePanelMenu(paramInt, (Menu)paramMenu)) {
      return bool;
    }
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    super.onMenuOpened(paramInt, paramMenu);
    a.e(paramInt);
    return true;
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    super.onPanelClosed(paramInt, paramMenu);
    a.d(paramInt);
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    boolean bool = paramMenu instanceof android.support.v7.view.menu.h;
    Object localObject1;
    Object localObject2;
    if (bool)
    {
      localObject1 = paramMenu;
      localObject1 = (android.support.v7.view.menu.h)paramMenu;
      localObject2 = localObject1;
      if ((paramInt != 0) || (localObject2 != null)) {
        break label54;
      }
      bool = false;
      localObject1 = null;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject1 = null;
      localObject2 = null;
      break;
      label54:
      if (localObject2 != null)
      {
        bool = true;
        l = bool;
      }
      bool = super.onPreparePanel(paramInt, paramView, (Menu)paramMenu);
      if (localObject2 != null) {
        l = false;
      }
    }
  }
}


/* Location:              android/support/v7/app/h$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */