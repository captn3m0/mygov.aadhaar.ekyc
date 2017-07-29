package android.support.design.widget;

import android.support.v4.h.w;
import android.support.v4.widget.m;
import android.view.View;
import android.widget.OverScroller;

final class i$a
  implements Runnable
{
  private final CoordinatorLayout b;
  private final View c;
  
  i$a(i parami, CoordinatorLayout paramCoordinatorLayout, View paramView)
  {
    b = paramCoordinatorLayout;
    c = paramView;
  }
  
  public final void run()
  {
    Object localObject = c;
    CoordinatorLayout localCoordinatorLayout;
    View localView;
    if (localObject != null)
    {
      localObject = a.a;
      if (localObject != null)
      {
        localObject = a.a.a;
        boolean bool = ((OverScroller)localObject).computeScrollOffset();
        if (!bool) {
          break label97;
        }
        localObject = a;
        localCoordinatorLayout = b;
        localView = c;
        OverScroller localOverScroller = a.a.a;
        int i = localOverScroller.getCurrY();
        ((i)localObject).a_(localCoordinatorLayout, localView, i);
        localObject = c;
        w.a((View)localObject, this);
      }
    }
    for (;;)
    {
      return;
      label97:
      localObject = a;
      localCoordinatorLayout = b;
      localView = c;
      ((i)localObject).a(localCoordinatorLayout, localView);
    }
  }
}


/* Location:              android/support/design/widget/i$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */