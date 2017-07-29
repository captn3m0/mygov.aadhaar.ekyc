package android.support.v4.a;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;

final class d
  implements b
{
  private TimeInterpolator a;
  
  public final void a(View paramView)
  {
    Object localObject = a;
    if (localObject == null)
    {
      localObject = new android/animation/ValueAnimator;
      ((ValueAnimator)localObject).<init>();
      localObject = ((ValueAnimator)localObject).getInterpolator();
      a = ((TimeInterpolator)localObject);
    }
    localObject = paramView.animate();
    TimeInterpolator localTimeInterpolator = a;
    ((ViewPropertyAnimator)localObject).setInterpolator(localTimeInterpolator);
  }
}


/* Location:              android/support/v4/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */