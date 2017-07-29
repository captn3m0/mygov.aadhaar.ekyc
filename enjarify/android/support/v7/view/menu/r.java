package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.e.a.a;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class r
  extends c
  implements Menu
{
  r(Context paramContext, a parama)
  {
    super(paramContext, parama);
  }
  
  public MenuItem add(int paramInt)
  {
    MenuItem localMenuItem = ((a)d).add(paramInt);
    return a(localMenuItem);
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    MenuItem localMenuItem = ((a)d).add(paramInt1, paramInt2, paramInt3, paramInt4);
    return a(localMenuItem);
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    MenuItem localMenuItem = ((a)d).add(paramInt1, paramInt2, paramInt3, paramCharSequence);
    return a(localMenuItem);
  }
  
  public MenuItem add(CharSequence paramCharSequence)
  {
    MenuItem localMenuItem = ((a)d).add(paramCharSequence);
    return a(localMenuItem);
  }
  
  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem)
  {
    MenuItem[] arrayOfMenuItem = null;
    int i;
    if (paramArrayOfMenuItem != null)
    {
      i = paramArrayOfMenuItem.length;
      arrayOfMenuItem = new MenuItem[i];
    }
    a locala = (a)d;
    int j = paramInt1;
    int k = paramInt2;
    j = locala.addIntentOptions(paramInt1, paramInt2, paramInt3, paramComponentName, paramArrayOfIntent, paramIntent, paramInt4, arrayOfMenuItem);
    if (arrayOfMenuItem != null)
    {
      i = 0;
      locala = null;
      k = arrayOfMenuItem.length;
      while (i < k)
      {
        MenuItem localMenuItem = arrayOfMenuItem[i];
        localMenuItem = a(localMenuItem);
        paramArrayOfMenuItem[i] = localMenuItem;
        i += 1;
      }
    }
    return j;
  }
  
  public SubMenu addSubMenu(int paramInt)
  {
    SubMenu localSubMenu = ((a)d).addSubMenu(paramInt);
    return a(localSubMenu);
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    SubMenu localSubMenu = ((a)d).addSubMenu(paramInt1, paramInt2, paramInt3, paramInt4);
    return a(localSubMenu);
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    SubMenu localSubMenu = ((a)d).addSubMenu(paramInt1, paramInt2, paramInt3, paramCharSequence);
    return a(localSubMenu);
  }
  
  public SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    SubMenu localSubMenu = ((a)d).addSubMenu(paramCharSequence);
    return a(localSubMenu);
  }
  
  public void clear()
  {
    Map localMap = b;
    if (localMap != null)
    {
      localMap = b;
      localMap.clear();
    }
    localMap = c;
    if (localMap != null)
    {
      localMap = c;
      localMap.clear();
    }
    ((a)d).clear();
  }
  
  public void close()
  {
    ((a)d).close();
  }
  
  public MenuItem findItem(int paramInt)
  {
    MenuItem localMenuItem = ((a)d).findItem(paramInt);
    return a(localMenuItem);
  }
  
  public MenuItem getItem(int paramInt)
  {
    MenuItem localMenuItem = ((a)d).getItem(paramInt);
    return a(localMenuItem);
  }
  
  public boolean hasVisibleItems()
  {
    return ((a)d).hasVisibleItems();
  }
  
  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    return ((a)d).isShortcutKey(paramInt, paramKeyEvent);
  }
  
  public boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    return ((a)d).performIdentifierAction(paramInt1, paramInt2);
  }
  
  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    return ((a)d).performShortcut(paramInt1, paramKeyEvent, paramInt2);
  }
  
  public void removeGroup(int paramInt)
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = b.keySet();
      Iterator localIterator = ((Set)localObject).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (MenuItem)localIterator.next();
        int i = ((MenuItem)localObject).getGroupId();
        if (paramInt == i) {
          localIterator.remove();
        }
      }
    }
    ((a)d).removeGroup(paramInt);
  }
  
  public void removeItem(int paramInt)
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = b.keySet();
      Iterator localIterator = ((Set)localObject).iterator();
      int i;
      do
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (MenuItem)localIterator.next();
        i = ((MenuItem)localObject).getItemId();
      } while (paramInt != i);
      localIterator.remove();
    }
    ((a)d).removeItem(paramInt);
  }
  
  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    ((a)d).setGroupCheckable(paramInt, paramBoolean1, paramBoolean2);
  }
  
  public void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
    ((a)d).setGroupEnabled(paramInt, paramBoolean);
  }
  
  public void setGroupVisible(int paramInt, boolean paramBoolean)
  {
    ((a)d).setGroupVisible(paramInt, paramBoolean);
  }
  
  public void setQwertyMode(boolean paramBoolean)
  {
    ((a)d).setQwertyMode(paramBoolean);
  }
  
  public int size()
  {
    return ((a)d).size();
  }
}


/* Location:              android/support/v7/view/menu/r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */