package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;

class b$d
  implements b.a
{
  final Activity a;
  c.a b;
  
  b$d(Activity paramActivity)
  {
    a = paramActivity;
  }
  
  public final Drawable a()
  {
    return c.a(a);
  }
  
  public final void a(int paramInt)
  {
    c.a locala = b;
    Activity localActivity = a;
    locala = c.a(locala, localActivity, paramInt);
    b = locala;
  }
  
  public final void a(Drawable paramDrawable, int paramInt)
  {
    ActionBar localActionBar = a.getActionBar();
    if (localActionBar != null)
    {
      localActionBar.setDisplayShowHomeEnabled(true);
      c.a locala = c.a(a, paramDrawable, paramInt);
      b = locala;
      locala = null;
      localActionBar.setDisplayShowHomeEnabled(false);
    }
  }
  
  public Context b()
  {
    return a;
  }
  
  public final boolean c()
  {
    ActionBar localActionBar = a.getActionBar();
    int i;
    if (localActionBar != null)
    {
      i = localActionBar.getDisplayOptions() & 0x4;
      if (i != 0) {
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localActionBar = null;
    }
  }
}


/* Location:              android/support/v7/app/b$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */