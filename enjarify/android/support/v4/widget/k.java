package android.support.v4.widget;

import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

final class k
{
  private static Field a;
  
  static
  {
    Object localObject = PopupWindow.class;
    String str1 = "mOverlapAnchor";
    try
    {
      localObject = ((Class)localObject).getDeclaredField(str1);
      a = (Field)localObject;
      boolean bool = true;
      ((Field)localObject).setAccessible(bool);
      return;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        str1 = "PopupWindowCompatApi21";
        String str2 = "Could not fetch mOverlapAnchor field from PopupWindow";
        Log.i(str1, str2, localNoSuchFieldException);
      }
    }
  }
  
  static void a(PopupWindow paramPopupWindow, boolean paramBoolean)
  {
    Field localField = a;
    if (localField != null) {}
    try
    {
      localField = a;
      localObject = Boolean.valueOf(paramBoolean);
      localField.set(paramPopupWindow, localObject);
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        Object localObject = "PopupWindowCompatApi21";
        String str = "Could not set overlap anchor field in PopupWindow";
        Log.i((String)localObject, str, localIllegalAccessException);
      }
    }
  }
}


/* Location:              android/support/v4/widget/k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */