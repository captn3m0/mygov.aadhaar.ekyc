package android.support.design.widget;

import android.support.v4.h.w;
import android.support.v4.widget.p;
import android.view.View;

final class SwipeDismissBehavior$b
  implements Runnable
{
  private final View b;
  private final boolean c;
  
  SwipeDismissBehavior$b(SwipeDismissBehavior paramSwipeDismissBehavior, View paramView, boolean paramBoolean)
  {
    b = paramView;
    c = paramBoolean;
  }
  
  public final void run()
  {
    Object localObject = a.b;
    boolean bool;
    if (localObject != null)
    {
      localObject = a.b;
      bool = ((p)localObject).b();
      if (bool)
      {
        localObject = b;
        w.a((View)localObject, this);
      }
    }
    for (;;)
    {
      return;
      bool = c;
      if (bool)
      {
        localObject = a.c;
        if (localObject != null)
        {
          localObject = a.c;
          View localView = b;
          ((SwipeDismissBehavior.a)localObject).a(localView);
        }
      }
    }
  }
}


/* Location:              android/support/design/widget/SwipeDismissBehavior$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */