package android.support.v4.h;

import android.view.View;
import android.view.ViewPropertyAnimator;

class ae$e
  extends ae.c
{
  public final void a(View paramView, ak paramak)
  {
    ah.1 local1 = null;
    if (paramak != null)
    {
      local1 = new android/support/v4/h/ah$1;
      local1.<init>(paramak, paramView);
    }
    paramView.animate().setUpdateListener(local1);
  }
}


/* Location:              android/support/v4/h/ae$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */