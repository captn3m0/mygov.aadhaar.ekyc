package android.support.v7.widget;

import android.support.v7.view.menu.s;
import android.view.View;
import android.widget.PopupWindow;

final class y$1
  extends aj
{
  y$1(y paramy, View paramView, y.b paramb)
  {
    super(paramView);
  }
  
  public final s a()
  {
    return a;
  }
  
  public final boolean b()
  {
    Object localObject = b.a.q;
    boolean bool = ((PopupWindow)localObject).isShowing();
    if (!bool)
    {
      localObject = b.a;
      ((y.b)localObject).d();
    }
    return true;
  }
}


/* Location:              android/support/v7/widget/y$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */