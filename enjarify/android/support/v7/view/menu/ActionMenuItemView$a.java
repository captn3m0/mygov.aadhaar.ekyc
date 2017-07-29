package android.support.v7.view.menu;

import android.support.v7.widget.aj;

final class ActionMenuItemView$a
  extends aj
{
  public ActionMenuItemView$a(ActionMenuItemView paramActionMenuItemView)
  {
    super(paramActionMenuItemView);
  }
  
  public final s a()
  {
    Object localObject = a.c;
    if (localObject != null) {}
    for (localObject = a.c.a();; localObject = null) {
      return (s)localObject;
    }
  }
  
  protected final boolean b()
  {
    boolean bool1 = false;
    Object localObject = a.b;
    if (localObject != null)
    {
      localObject = a.b;
      j localj = a.a;
      boolean bool2 = ((h.b)localObject).a(localj);
      if (bool2)
      {
        localObject = a();
        if (localObject != null)
        {
          bool2 = ((s)localObject).f();
          if (bool2) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
}


/* Location:              android/support/v7/view/menu/ActionMenuItemView$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */