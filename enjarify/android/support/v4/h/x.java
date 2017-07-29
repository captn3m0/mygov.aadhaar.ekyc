package android.support.v4.h;

import android.os.IBinder;
import android.view.View;
import java.lang.reflect.Field;

final class x
{
  private static Field a;
  private static boolean b;
  private static Field c;
  private static boolean d;
  
  static int a(View paramView)
  {
    boolean bool1 = true;
    boolean bool2 = b;
    String str;
    if (!bool2)
    {
      localObject1 = View.class;
      str = "mMinWidth";
    }
    try
    {
      localObject1 = ((Class)localObject1).getDeclaredField(str);
      a = (Field)localObject1;
      boolean bool3 = true;
      ((Field)localObject1).setAccessible(bool3);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
    b = bool1;
    Object localObject1 = a;
    if (localObject1 != null) {}
    for (;;)
    {
      try
      {
        localObject1 = a;
        localObject1 = ((Field)localObject1).get(paramView);
        localObject1 = (Integer)localObject1;
        i = ((Integer)localObject1).intValue();
        return i;
      }
      catch (Exception localException) {}
      int i = 0;
      Object localObject2 = null;
    }
  }
  
  static int b(View paramView)
  {
    boolean bool1 = true;
    boolean bool2 = d;
    String str;
    if (!bool2)
    {
      localObject1 = View.class;
      str = "mMinHeight";
    }
    try
    {
      localObject1 = ((Class)localObject1).getDeclaredField(str);
      c = (Field)localObject1;
      boolean bool3 = true;
      ((Field)localObject1).setAccessible(bool3);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
    d = bool1;
    Object localObject1 = c;
    if (localObject1 != null) {}
    for (;;)
    {
      try
      {
        localObject1 = c;
        localObject1 = ((Field)localObject1).get(paramView);
        localObject1 = (Integer)localObject1;
        i = ((Integer)localObject1).intValue();
        return i;
      }
      catch (Exception localException) {}
      int i = 0;
      Object localObject2 = null;
    }
  }
  
  static boolean c(View paramView)
  {
    IBinder localIBinder = paramView.getWindowToken();
    boolean bool;
    if (localIBinder != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localIBinder = null;
    }
  }
}


/* Location:              android/support/v4/h/x.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */