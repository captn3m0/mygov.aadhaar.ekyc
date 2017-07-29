package android.support.v4.h;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class af$1
  extends AnimatorListenerAdapter
{
  af$1(ai paramai, View paramView) {}
  
  public final void onAnimationCancel(Animator paramAnimator)
  {
    ai localai = a;
    View localView = b;
    localai.c(localView);
  }
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    ai localai = a;
    View localView = b;
    localai.b(localView);
  }
  
  public final void onAnimationStart(Animator paramAnimator)
  {
    ai localai = a;
    View localView = b;
    localai.a(localView);
  }
}


/* Location:              android/support/v4/h/af$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */