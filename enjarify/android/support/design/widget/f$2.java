package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class f$2
  extends AnimatorListenerAdapter
{
  f$2(f paramf, g.a parama) {}
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    c.c = 0;
  }
  
  public final void onAnimationStart(Animator paramAnimator)
  {
    z localz = c.n;
    boolean bool = a;
    localz.a(0, bool);
  }
}


/* Location:              android/support/design/widget/f$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */