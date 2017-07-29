package android.support.design.widget;

import android.view.MotionEvent;
import android.view.View;

final class b$a
  extends SwipeDismissBehavior
{
  b$a(b paramb) {}
  
  private boolean a(CoordinatorLayout paramCoordinatorLayout, b.e parame, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    switch (i)
    {
    }
    for (;;)
    {
      return super.a(paramCoordinatorLayout, parame, paramMotionEvent);
      float f1 = paramMotionEvent.getX();
      i = (int)f1;
      float f2 = paramMotionEvent.getY();
      int j = (int)f2;
      boolean bool = paramCoordinatorLayout.a(parame, i, j);
      if (bool)
      {
        n localn = n.a();
        n.a locala = a.e;
        localn.a(locala);
        continue;
        localn = n.a();
        locala = a.e;
        localn.b(locala);
      }
    }
  }
  
  public final boolean b(View paramView)
  {
    return paramView instanceof b.e;
  }
}


/* Location:              android/support/design/widget/b$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */