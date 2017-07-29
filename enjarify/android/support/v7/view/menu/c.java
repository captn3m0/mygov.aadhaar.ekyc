package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.e.a.b;
import android.support.v4.g.a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

abstract class c
  extends d
{
  final Context a;
  Map b;
  Map c;
  
  c(Context paramContext, Object paramObject)
  {
    super(paramObject);
    a = paramContext;
  }
  
  final MenuItem a(MenuItem paramMenuItem)
  {
    boolean bool = paramMenuItem instanceof b;
    Object localObject2;
    if (bool)
    {
      Object localObject1 = paramMenuItem;
      localObject1 = (b)paramMenuItem;
      localObject2 = b;
      if (localObject2 == null)
      {
        localObject2 = new android/support/v4/g/a;
        ((a)localObject2).<init>();
        b = ((Map)localObject2);
      }
      localObject2 = (MenuItem)b.get(paramMenuItem);
      if (localObject2 == null)
      {
        localObject2 = q.a(a, (b)localObject1);
        Map localMap = b;
        localMap.put(localObject1, localObject2);
      }
    }
    for (;;)
    {
      return (MenuItem)localObject2;
      localObject2 = paramMenuItem;
    }
  }
  
  final SubMenu a(SubMenu paramSubMenu)
  {
    boolean bool = paramSubMenu instanceof android.support.v4.e.a.c;
    Object localObject1;
    if (bool)
    {
      paramSubMenu = (android.support.v4.e.a.c)paramSubMenu;
      localObject1 = c;
      if (localObject1 == null)
      {
        localObject1 = new android/support/v4/g/a;
        ((a)localObject1).<init>();
        c = ((Map)localObject1);
      }
      localObject1 = (SubMenu)c.get(paramSubMenu);
      if (localObject1 == null)
      {
        Object localObject2 = a;
        int i = Build.VERSION.SDK_INT;
        int j = 14;
        if (i < j) {
          break label103;
        }
        localObject1 = new android/support/v7/view/menu/v;
        ((v)localObject1).<init>((Context)localObject2, paramSubMenu);
        localObject2 = c;
        ((Map)localObject2).put(paramSubMenu, localObject1);
      }
    }
    for (;;)
    {
      return (SubMenu)localObject1;
      label103:
      localObject1 = new java/lang/UnsupportedOperationException;
      ((UnsupportedOperationException)localObject1).<init>();
      throw ((Throwable)localObject1);
      localObject1 = paramSubMenu;
    }
  }
}


/* Location:              android/support/v7/view/menu/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */