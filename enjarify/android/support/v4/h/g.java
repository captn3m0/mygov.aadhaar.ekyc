package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.KeyEvent;

public final class g
{
  static final g.c a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 11;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/h/g$b;
      ((g.b)localObject).<init>();
    }
    for (a = (g.c)localObject;; a = (g.c)localObject)
    {
      return;
      localObject = new android/support/v4/h/g$a;
      ((g.a)localObject).<init>();
    }
  }
  
  public static boolean a(KeyEvent paramKeyEvent)
  {
    return a.a(paramKeyEvent);
  }
}


/* Location:              android/support/v4/h/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */