package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.h.e.b;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

final class l$a
  extends k.a
  implements ActionProvider.VisibilityListener
{
  e.b e;
  
  public l$a(l paraml, Context paramContext, ActionProvider paramActionProvider)
  {
    super(paraml, paramContext, paramActionProvider);
  }
  
  public final View a(MenuItem paramMenuItem)
  {
    return c.onCreateActionView(paramMenuItem);
  }
  
  public final void a(e.b paramb)
  {
    e = paramb;
    c.setVisibilityListener(this);
  }
  
  public final boolean b()
  {
    return c.overridesItemVisibility();
  }
  
  public final boolean c()
  {
    return c.isVisible();
  }
  
  public final void onActionProviderVisibilityChanged(boolean paramBoolean)
  {
    e.b localb = e;
    if (localb != null)
    {
      localb = e;
      localb.a();
    }
  }
}


/* Location:              android/support/v7/view/menu/l$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */