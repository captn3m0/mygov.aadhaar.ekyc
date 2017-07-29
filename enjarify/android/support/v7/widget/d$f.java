package android.support.v7.widget;

import android.support.v7.view.menu.b;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.o.a;
import android.support.v7.view.menu.u;
import android.view.MenuItem;

final class d$f
  implements o.a
{
  d$f(d paramd) {}
  
  public final void a(h paramh, boolean paramBoolean)
  {
    boolean bool = paramh instanceof u;
    if (bool)
    {
      localObject = ((h)paramh).k();
      ((h)localObject).b(false);
    }
    Object localObject = a.f;
    if (localObject != null) {
      ((o.a)localObject).a((h)paramh, paramBoolean);
    }
  }
  
  public final boolean a(h paramh)
  {
    boolean bool1;
    Object localObject;
    if (paramh == null)
    {
      bool1 = false;
      localObject = null;
    }
    for (;;)
    {
      return bool1;
      d locald = a;
      localObject = paramh;
      int i = ((u)paramh).getItem().getItemId();
      q = i;
      localObject = a.f;
      boolean bool2;
      if (localObject != null)
      {
        bool2 = ((o.a)localObject).a(paramh);
      }
      else
      {
        bool2 = false;
        localObject = null;
      }
    }
  }
}


/* Location:              android/support/v7/widget/d$f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */