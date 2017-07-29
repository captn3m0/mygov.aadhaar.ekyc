package android.support.v7.widget;

import android.graphics.Rect;
import android.support.v4.h.w;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class y$b$2
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  y$b$2(y.b paramb) {}
  
  public final void onGlobalLayout()
  {
    Object localObject = a;
    y localy = a.d;
    boolean bool1 = w.H(localy);
    boolean bool2;
    if (bool1)
    {
      localObject = c;
      bool2 = localy.getGlobalVisibleRect((Rect)localObject);
      if (bool2)
      {
        bool2 = true;
        if (bool2) {
          break label65;
        }
        localObject = a;
        ((y.b)localObject).e();
      }
    }
    for (;;)
    {
      return;
      bool2 = false;
      localObject = null;
      break;
      label65:
      a.a();
      localObject = a;
      y.b.a((y.b)localObject);
    }
  }
}


/* Location:              android/support/v7/widget/y$b$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */