package android.support.v7.widget;

import android.view.View;
import android.view.ViewParent;

final class aj$a
  implements Runnable
{
  aj$a(aj paramaj) {}
  
  public final void run()
  {
    ViewParent localViewParent = a.c.getParent();
    if (localViewParent != null)
    {
      boolean bool = true;
      localViewParent.requestDisallowInterceptTouchEvent(bool);
    }
  }
}


/* Location:              android/support/v7/widget/aj$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */