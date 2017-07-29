package android.support.v7.widget;

import android.view.MenuItem;

final class Toolbar$1
  implements ActionMenuView.e
{
  Toolbar$1(Toolbar paramToolbar) {}
  
  public final boolean a(MenuItem paramMenuItem)
  {
    Toolbar.c localc = a.o;
    boolean bool;
    if (localc != null)
    {
      localc = a.o;
      bool = localc.a(paramMenuItem);
    }
    for (;;)
    {
      return bool;
      bool = false;
      localc = null;
    }
  }
}


/* Location:              android/support/v7/widget/Toolbar$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */