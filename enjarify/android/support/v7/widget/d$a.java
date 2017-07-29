package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.n;
import android.support.v7.view.menu.o.a;
import android.support.v7.view.menu.u;
import android.view.View;

final class d$a
  extends n
{
  public d$a(d paramd, Context paramContext, u paramu, View paramView)
  {
    super(paramContext, paramu, paramView, false, i);
    localObject = (j)paramu.getItem();
    boolean bool = ((j)localObject).f();
    if (!bool)
    {
      localObject = i;
      if (localObject != null) {
        break label84;
      }
    }
    label84:
    for (localObject = (View)d.c(paramd);; localObject = i)
    {
      a = ((View)localObject);
      localObject = p;
      a((o.a)localObject);
      return;
    }
  }
  
  protected final void d()
  {
    d.n = null;
    d.q = 0;
    super.d();
  }
}


/* Location:              android/support/v7/widget/d$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */