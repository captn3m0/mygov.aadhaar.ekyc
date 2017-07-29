package android.support.v7.widget;

import android.view.animation.Interpolator;

final class at$3
  implements Interpolator
{
  public final float getInterpolation(float paramFloat)
  {
    float f1 = 1.0F;
    float f2 = paramFloat - f1;
    float f3 = f2 * f2 * f2 * f2;
    return f2 * f3 + f1;
  }
}


/* Location:              android/support/v7/widget/at$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */