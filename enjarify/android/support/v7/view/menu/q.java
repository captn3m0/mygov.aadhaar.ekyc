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
    int i = Build.VERSION.SDK_INT;
    int j = 14;
    if (i >= j)
    {
      localObject = new android/support/v7/view/menu/r;
      ((r)localObject).<init>(paramContext, parama);
      return (Menu)localObject;
    }
    Object localObject = new java/lang/UnsupportedOperationException;
    ((UnsupportedOperationException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public static MenuItem a(Context paramContext, b paramb)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    if (i >= j)
    {
      localObject = new android/support/v7/view/menu/l;
      ((l)localObject).<init>(paramContext, paramb);
    }
    for (;;)
    {
      return (MenuItem)localObject;
      i = Build.VERSION.SDK_INT;
      j = 14;
      if (i < j) {
        break;
      }
      localObject = new android/support/v7/view/menu/k;
      ((k)localObject).<init>(paramContext, paramb);
    }
    Object localObject = new java/lang/UnsupportedOperationException;
    ((UnsupportedOperationException)localObject).<init>();
    throw ((Throwable)localObject);
  }
}


/* Location:              android/support/v7/view/menu/q.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */