package android.support.v7.widget;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.PopupWindow;

final class an$d
  implements View.OnTouchListener
{
  an$d(an paraman) {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    float f1 = paramMotionEvent.getX();
    int j = (int)f1;
    float f2 = paramMotionEvent.getY();
    int k = (int)f2;
    Object localObject;
    Handler localHandler;
    if (i == 0)
    {
      PopupWindow localPopupWindow = a.q;
      if (localPopupWindow != null)
      {
        localPopupWindow = a.q;
        boolean bool = localPopupWindow.isShowing();
        if ((bool) && (j >= 0))
        {
          localPopupWindow = a.q;
          int m = localPopupWindow.getWidth();
          if ((j < m) && (k >= 0))
          {
            localObject = a.q;
            j = ((PopupWindow)localObject).getHeight();
            if (k < j)
            {
              localHandler = a.n;
              localObject = a.m;
              long l = 250L;
              localHandler.postDelayed((Runnable)localObject, l);
            }
          }
        }
      }
    }
    for (;;)
    {
      return false;
      j = 1;
      f1 = Float.MIN_VALUE;
      if (i == j)
      {
        localHandler = a.n;
        localObject = a.m;
        localHandler.removeCallbacks((Runnable)localObject);
      }
    }
  }
}


/* Location:              android/support/v7/widget/an$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */