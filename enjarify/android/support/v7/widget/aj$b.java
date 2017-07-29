package android.support.v7.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

final class aj$b
  implements Runnable
{
  aj$b(aj paramaj) {}
  
  public final void run()
  {
    boolean bool1 = true;
    aj localaj = a;
    localaj.d();
    View localView = c;
    boolean bool2 = localView.isEnabled();
    if (bool2)
    {
      bool2 = localView.isLongClickable();
      if (!bool2) {
        break label39;
      }
    }
    for (;;)
    {
      return;
      label39:
      bool2 = localaj.b();
      if (bool2)
      {
        localView.getParent().requestDisallowInterceptTouchEvent(bool1);
        long l = SystemClock.uptimeMillis();
        int i = 3;
        MotionEvent localMotionEvent = MotionEvent.obtain(l, l, i, 0.0F, 0.0F, 0);
        localView.onTouchEvent(localMotionEvent);
        localMotionEvent.recycle();
        d = bool1;
      }
    }
  }
}


/* Location:              android/support/v7/widget/aj$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */