package android.support.v7.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v4.e.a.b;
import android.support.v4.h.e.b;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

@TargetApi(16)
final class l
  extends k
{
  l(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
  }
  
  final k.a a(ActionProvider paramActionProvider)
  {
    return new a(a, paramActionProvider);
  }
  
  final class a
    extends k.a
    implements ActionProvider.VisibilityListener
  {
    e.b e;
    
    public a(Context paramContext, ActionProvider paramActionProvider)
    {
      super(paramContext, paramActionProvider);
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
      if (e != null) {
        e.a();
      }
    }
  }
}


/* Location:              android/support/v7/view/menu/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */