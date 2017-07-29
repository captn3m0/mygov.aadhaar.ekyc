package android.support.design.widget;

import android.support.v4.h.al;
import android.support.v4.h.s;
import android.support.v4.h.w;
import android.view.View;

final class CoordinatorLayout$1
  implements s
{
  CoordinatorLayout$1(CoordinatorLayout paramCoordinatorLayout) {}
  
  public final al a(View paramView, al paramal)
  {
    int i = 1;
    int j = 0;
    CoordinatorLayout localCoordinatorLayout = a;
    Object localObject = g;
    boolean bool1 = x.a(localObject, paramal);
    al localal;
    if (!bool1)
    {
      g = paramal;
      boolean bool2;
      if (paramal != null)
      {
        int k = paramal.b();
        if (k > 0)
        {
          k = i;
          h = k;
          bool2 = h;
          if (bool2) {
            break label193;
          }
          localObject = localCoordinatorLayout.getBackground();
          if (localObject != null) {
            break label193;
          }
        }
      }
      for (;;)
      {
        localCoordinatorLayout.setWillNotDraw(i);
        bool2 = paramal.e();
        if (bool2) {
          break label201;
        }
        int m = localCoordinatorLayout.getChildCount();
        localal = paramal;
        while (j < m)
        {
          localObject = localCoordinatorLayout.getChildAt(j);
          boolean bool3 = w.x((View)localObject);
          if (bool3)
          {
            localObject = getLayoutParamsa;
            if (localObject != null)
            {
              bool2 = localal.e();
              if (bool2) {
                break;
              }
            }
          }
          localObject = localal;
          j += 1;
        }
        bool2 = false;
        localObject = null;
        break;
        label193:
        i = 0;
        localal = null;
      }
      label201:
      localal = paramal;
      localCoordinatorLayout.requestLayout();
    }
    for (;;)
    {
      return localal;
      localal = paramal;
    }
  }
}


/* Location:              android/support/design/widget/CoordinatorLayout$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */