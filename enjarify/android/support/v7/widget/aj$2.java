package android.support.v7.widget;

import android.support.v4.h.w;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class aj$2
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  boolean a;
  
  aj$2(aj paramaj)
  {
    boolean bool = w.H(b.c);
    a = bool;
  }
  
  public final void onGlobalLayout()
  {
    boolean bool1 = a;
    View localView = b.c;
    boolean bool2 = w.H(localView);
    a = bool2;
    if (bool1)
    {
      bool1 = a;
      if (!bool1)
      {
        aj localaj = b;
        aj.a(localaj);
      }
    }
  }
}


/* Location:              android/support/v7/widget/aj$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */