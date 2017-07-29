package android.support.v4.a;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewPropertyAnimator;

@TargetApi(12)
final class d
  implements b
{
  private TimeInterpolator a;
  
  public final void a(View paramView)
  {
    if (a == null) {
      a = new ValueAnimator().getInterpolator();
    }
    paramView.animate().setInterpolator(a);
  }
}


/* Location:              android/support/v4/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */