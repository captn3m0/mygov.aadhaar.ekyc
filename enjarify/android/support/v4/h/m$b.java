package android.support.v4.h;

import android.view.MenuItem;
import android.view.View;

class m$b
  implements m.d
{
  public final MenuItem a(MenuItem paramMenuItem, View paramView)
  {
    return paramMenuItem.setActionView(paramView);
  }
  
  public final View a(MenuItem paramMenuItem)
  {
    return paramMenuItem.getActionView();
  }
  
  public final void a(MenuItem paramMenuItem, int paramInt)
  {
    paramMenuItem.setShowAsAction(paramInt);
  }
  
  public final MenuItem b(MenuItem paramMenuItem, int paramInt)
  {
    return paramMenuItem.setActionView(paramInt);
  }
  
  public boolean b(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public boolean c(MenuItem paramMenuItem)
  {
    return false;
  }
}


/* Location:              android/support/v4/h/m$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */