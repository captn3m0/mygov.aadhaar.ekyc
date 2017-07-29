package android.support.v7.app;

import android.support.v4.h.ae;
import android.support.v4.h.aj;
import android.support.v4.h.w;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.widget.PopupWindow;

final class m$b$1
  extends aj
{
  m$b$1(m.b paramb) {}
  
  public final void b(View paramView)
  {
    Object localObject = a.a.r;
    int i = 8;
    ((ActionBarContextView)localObject).setVisibility(i);
    localObject = a.a.s;
    if (localObject != null)
    {
      localObject = a.a.s;
      ((PopupWindow)localObject).dismiss();
    }
    for (;;)
    {
      a.a.r.removeAllViews();
      a.a.u.a(null);
      a.a.u = null;
      return;
      localObject = a.a.r.getParent();
      boolean bool = localObject instanceof View;
      if (bool)
      {
        localObject = (View)a.a.r.getParent();
        w.w((View)localObject);
      }
    }
  }
}


/* Location:              android/support/v7/app/m$b$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */