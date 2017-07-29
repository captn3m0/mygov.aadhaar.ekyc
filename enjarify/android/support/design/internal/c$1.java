package android.support.design.internal;

import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.view.View;
import android.view.View.OnClickListener;

final class c$1
  implements View.OnClickListener
{
  c$1(c paramc) {}
  
  public final void onClick(View paramView)
  {
    paramView = (NavigationMenuItemView)paramView;
    a.b(true);
    j localj = paramView.getItemData();
    Object localObject = a.c;
    c localc = a;
    boolean bool1 = ((h)localObject).a(localj, localc, 0);
    if (localj != null)
    {
      boolean bool2 = localj.isCheckable();
      if ((bool2) && (bool1))
      {
        localObject = a.e;
        ((c.b)localObject).a(localj);
      }
    }
    a.b(false);
    a.a(false);
  }
}


/* Location:              android/support/design/internal/c$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */