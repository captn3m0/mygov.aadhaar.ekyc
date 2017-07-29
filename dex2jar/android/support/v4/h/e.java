package android.support.v4.h;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class e
{
  public a a;
  public b b;
  private final Context c;
  
  public e(Context paramContext)
  {
    c = paramContext;
  }
  
  public abstract View a();
  
  public View a(MenuItem paramMenuItem)
  {
    return a();
  }
  
  public void a(b paramb)
  {
    if (b != null) {
      Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
    }
    b = paramb;
  }
  
  public void a(SubMenu paramSubMenu) {}
  
  public final void a(boolean paramBoolean)
  {
    if (a != null) {
      a.b(paramBoolean);
    }
  }
  
  public boolean b()
  {
    return false;
  }
  
  public boolean c()
  {
    return true;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean e()
  {
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void b(boolean paramBoolean);
  }
  
  public static abstract interface b
  {
    public abstract void a();
  }
}


/* Location:              android/support/v4/h/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */