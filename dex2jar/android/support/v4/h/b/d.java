package android.support.v4.h.b;

import android.view.animation.Interpolator;

abstract class d
  implements Interpolator
{
  private final float[] a;
  private final float b;
  
  public d(float[] paramArrayOfFloat)
  {
    a = paramArrayOfFloat;
    b = (1.0F / (a.length - 1));
  }
  
  public float getInterpolation(float paramFloat)
  {
    if (paramFloat >= 1.0F) {
      return 1.0F;
    }
    if (paramFloat <= 0.0F) {
      return 0.0F;
    }
    int i = Math.min((int)((a.length - 1) * paramFloat), a.length - 2);
    paramFloat = (paramFloat - i * b) / b;
    float f = a[i];
    return (a[(i + 1)] - a[i]) * paramFloat + f;
  }
}


/* Location:              android/support/v4/h/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */