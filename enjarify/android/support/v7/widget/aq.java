package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.menu.h;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public final class aq
  extends an
  implements ap
{
  public static Method a;
  public ap b;
  
  static
  {
    Object localObject = PopupWindow.class;
    String str2 = "setTouchModal";
    int i = 1;
    try
    {
      Class[] arrayOfClass = new Class[i];
      Class localClass = Boolean.TYPE;
      arrayOfClass[0] = localClass;
      localObject = ((Class)localObject).getDeclaredMethod(str2, arrayOfClass);
      a = (Method)localObject;
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        String str1 = "MenuPopupWindow";
        str2 = "Could not find method setTouchModal() on PopupWindow. Oh well.";
        Log.i(str1, str2);
      }
    }
  }
  
  public aq(Context paramContext, int paramInt1, int paramInt2)
  {
    super(paramContext, null, paramInt1, paramInt2);
  }
  
  final ah a(Context paramContext, boolean paramBoolean)
  {
    aq.a locala = new android/support/v7/widget/aq$a;
    locala.<init>(paramContext, paramBoolean);
    locala.setHoverListener(this);
    return locala;
  }
  
  public final void a(h paramh, MenuItem paramMenuItem)
  {
    ap localap = b;
    if (localap != null)
    {
      localap = b;
      localap.a(paramh, paramMenuItem);
    }
  }
  
  public final void b(h paramh, MenuItem paramMenuItem)
  {
    ap localap = b;
    if (localap != null)
    {
      localap = b;
      localap.b(paramh, paramMenuItem);
    }
  }
}


/* Location:              android/support/v7/widget/aq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */