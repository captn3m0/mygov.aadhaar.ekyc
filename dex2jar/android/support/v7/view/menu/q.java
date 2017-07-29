package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.e.a.a;
import android.support.v4.e.a.b;
import android.view.Menu;
import android.view.MenuItem;

public final class q
{
  public static Menu a(Context paramContext, a parama)
  {
    if (Build.VERSION.SDK_INT >= 14) {
      return new r(paramContext, parama);
    }
    throw new UnsupportedOperationException();
  }
  
  public static MenuItem a(Context paramContext, b paramb)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return new l(paramContext, paramb);
    }
    if (Build.VERSION.SDK_INT >= 14) {
      return new k(paramContext, paramb);
    }
    throw new UnsupportedOperationException();
  }
}


/* Location:              android/support/v7/view/menu/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */