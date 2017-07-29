package android.support.v7.view;

import android.content.Context;
import android.support.v4.e.a.a;
import android.support.v4.g.k;
import android.support.v7.view.menu.q;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public final class f$a
  implements b.a
{
  final ActionMode.Callback a;
  final Context b;
  final ArrayList c;
  final k d;
  
  public f$a(Context paramContext, ActionMode.Callback paramCallback)
  {
    b = paramContext;
    a = paramCallback;
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    c = ((ArrayList)localObject);
    localObject = new android/support/v4/g/k;
    ((k)localObject).<init>();
    d = ((k)localObject);
  }
  
  private Menu a(Menu paramMenu)
  {
    Object localObject1 = (Menu)d.get(paramMenu);
    if (localObject1 == null)
    {
      Object localObject2 = b;
      localObject1 = paramMenu;
      localObject1 = (a)paramMenu;
      localObject1 = q.a((Context)localObject2, (a)localObject1);
      localObject2 = d;
      ((k)localObject2).put(paramMenu, localObject1);
    }
    return (Menu)localObject1;
  }
  
  public final void a(b paramb)
  {
    ActionMode.Callback localCallback = a;
    ActionMode localActionMode = b(paramb);
    localCallback.onDestroyActionMode(localActionMode);
  }
  
  public final boolean a(b paramb, Menu paramMenu)
  {
    ActionMode.Callback localCallback = a;
    ActionMode localActionMode = b(paramb);
    Menu localMenu = a(paramMenu);
    return localCallback.onCreateActionMode(localActionMode, localMenu);
  }
  
  public final boolean a(b paramb, MenuItem paramMenuItem)
  {
    ActionMode.Callback localCallback = a;
    ActionMode localActionMode = b(paramb);
    Object localObject = b;
    paramMenuItem = (android.support.v4.e.a.b)paramMenuItem;
    localObject = q.a((Context)localObject, paramMenuItem);
    return localCallback.onActionItemClicked(localActionMode, (MenuItem)localObject);
  }
  
  public final ActionMode b(b paramb)
  {
    int i = 0;
    f localf = null;
    int j = c.size();
    int k = 0;
    Object localObject = null;
    if (k < j)
    {
      localf = (f)c.get(k);
      if (localf != null)
      {
        b localb = b;
        if (localb != paramb) {}
      }
    }
    for (;;)
    {
      return localf;
      i = k + 1;
      k = i;
      break;
      localf = new android/support/v7/view/f;
      localObject = b;
      localf.<init>((Context)localObject, paramb);
      localObject = c;
      ((ArrayList)localObject).add(localf);
    }
  }
  
  public final boolean b(b paramb, Menu paramMenu)
  {
    ActionMode.Callback localCallback = a;
    ActionMode localActionMode = b(paramb);
    Menu localMenu = a(paramMenu);
    return localCallback.onPrepareActionMode(localActionMode, localMenu);
  }
}


/* Location:              android/support/v7/view/f$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */