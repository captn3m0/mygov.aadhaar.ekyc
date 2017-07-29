package android.support.v4.h;

import android.annotation.TargetApi;
import android.view.View;
import java.lang.reflect.Field;

@TargetApi(9)
final class x
{
  private static Field a;
  private static boolean b;
  private static Field c;
  private static boolean d;
  
  static int a(View paramView)
  {
    if (!b) {}
    try
    {
      Field localField = View.class.getDeclaredField("mMinWidth");
      a = localField;
      localField.setAccessible(true);
      b = true;
      if (a != null) {
        try
        {
          int i = ((Integer)a.get(paramView)).intValue();
          return i;
        }
        catch (Exception paramView) {}
      }
      return 0;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
  
  static int b(View paramView)
  {
    if (!d) {}
    try
    {
      Field localField = View.class.getDeclaredField("mMinHeight");
      c = localField;
      localField.setAccessible(true);
      d = true;
      if (c != null) {
        try
        {
          int i = ((Integer)c.get(paramView)).intValue();
          return i;
        }
        catch (Exception paramView) {}
      }
      return 0;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
  
  static boolean c(View paramView)
  {
    return paramView.getWindowToken() != null;
  }
}


/* Location:              android/support/v4/h/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */