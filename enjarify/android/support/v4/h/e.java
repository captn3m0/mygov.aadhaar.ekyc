package android.support.v4.h;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class e
{
  public e.a a;
  public e.b b;
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
  
  public void a(e.b paramb)
  {
    Object localObject1 = b;
    if (localObject1 != null)
    {
      localObject1 = "ActionProvider(support)";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
      String str = getClass().getSimpleName();
      localObject2 = ((StringBuilder)localObject2).append(str);
      str = " instance while it is still in use somewhere else?";
      localObject2 = str;
      Log.w((String)localObject1, (String)localObject2);
    }
    b = paramb;
  }
  
  public void a(SubMenu paramSubMenu) {}
  
  public final void a(boolean paramBoolean)
  {
    e.a locala = a;
    if (locala != null)
    {
      locala = a;
      locala.b(paramBoolean);
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
}


/* Location:              android/support/v4/h/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */