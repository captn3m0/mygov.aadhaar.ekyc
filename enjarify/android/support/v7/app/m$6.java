package android.support.v7.app;

import android.support.v4.h.ae;
import android.support.v4.h.aj;
import android.support.v4.h.w;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;

final class m$6
  extends aj
{
  m$6(m paramm) {}
  
  public final void a(View paramView)
  {
    a.r.setVisibility(0);
    Object localObject = a.r;
    int i = 32;
    ((ActionBarContextView)localObject).sendAccessibilityEvent(i);
    localObject = a.r.getParent();
    boolean bool = localObject instanceof View;
    if (bool)
    {
      localObject = (View)a.r.getParent();
      w.w((View)localObject);
    }
  }
  
  public final void b(View paramView)
  {
    w.c(a.r, 1.0F);
    a.u.a(null);
    a.u = null;
  }
}


/* Location:              android/support/v7/app/m$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */