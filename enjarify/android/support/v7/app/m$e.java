package android.support.v7.app;

import android.support.v7.view.menu.o.a;
import android.view.Window;
import android.view.Window.Callback;

final class m$e
  implements o.a
{
  m$e(m paramm) {}
  
  public final void a(android.support.v7.view.menu.h paramh, boolean paramBoolean)
  {
    boolean bool1 = true;
    android.support.v7.view.menu.h localh = paramh.k();
    boolean bool2;
    Object localObject;
    m localm;
    if (localh != paramh)
    {
      bool2 = bool1;
      localObject = a;
      if (bool2) {
        paramh = localh;
      }
      localObject = ((m)localObject).a(paramh);
      if (localObject != null)
      {
        if (!bool2) {
          break label97;
        }
        localm = a;
        int i = a;
        localm.a(i, (m.d)localObject, localh);
        localm = a;
        localm.a((m.d)localObject, bool1);
      }
    }
    for (;;)
    {
      return;
      bool2 = false;
      localm = null;
      break;
      label97:
      localm = a;
      localm.a((m.d)localObject, paramBoolean);
    }
  }
  
  public final boolean a(android.support.v7.view.menu.h paramh)
  {
    if (paramh == null)
    {
      Object localObject = a;
      boolean bool1 = i;
      if (bool1)
      {
        localObject = a.c.getCallback();
        if (localObject != null)
        {
          m localm = a;
          boolean bool2 = o;
          if (!bool2)
          {
            int i = 108;
            ((Window.Callback)localObject).onMenuOpened(i, paramh);
          }
        }
      }
    }
    return true;
  }
}


/* Location:              android/support/v7/app/m$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */