package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class f$1
  extends AnimatorListenerAdapter
{
  private boolean d;
  
  f$1(f paramf, g.a parama) {}
  
  public final void onAnimationCancel(Animator paramAnimator)
  {
    d = true;
  }
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    f localf = c;
    z localz = null;
    c = 0;
    boolean bool1 = d;
    if (!bool1)
    {
      localf = c;
      localz = n;
      bool1 = a;
      if (!bool1) {
        break label63;
      }
    }
    label63:
    for (int i = 8;; i = 4)
    {
      boolean bool2 = a;
      localz.a(i, bool2);
      return;
    }
  }
  
  public final void onAnimationStart(Animator paramAnimator)
  {
    z localz = c.n;
    boolean bool = a;
    localz.a(0, bool);
    d = false;
  }
}


/* Location:              android/support/design/widget/f$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */