package android.support.v4.h;

import android.view.View;
import android.view.ViewPropertyAnimator;

class ae$d
  extends ae.b
{
  public final void a(ae paramae, View paramView, ai paramai)
  {
    ViewPropertyAnimator localViewPropertyAnimator;
    ag.1 local1;
    if (paramai != null)
    {
      localViewPropertyAnimator = paramView.animate();
      local1 = new android/support/v4/h/ag$1;
      local1.<init>(paramai, paramView);
      localViewPropertyAnimator.setListener(local1);
    }
    for (;;)
    {
      return;
      localViewPropertyAnimator = paramView.animate();
      local1 = null;
      localViewPropertyAnimator.setListener(null);
    }
  }
}


/* Location:              android/support/v4/h/ae$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */