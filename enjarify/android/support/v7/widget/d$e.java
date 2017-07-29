package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.n;
import android.support.v7.view.menu.o.a;
import android.view.View;

final class d$e
  extends n
{
  public d$e(d paramd, Context paramContext, h paramh, View paramView)
  {
    super(paramContext, paramh, paramView, true, i);
    b = 8388613;
    localObject = p;
    a((o.a)localObject);
  }
  
  protected final void d()
  {
    h localh = d.a(d);
    if (localh != null)
    {
      localh = d.b(d);
      localh.close();
    }
    d.m = null;
    super.d();
  }
}


/* Location:              android/support/v7/widget/d$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */