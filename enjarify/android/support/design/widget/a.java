package android.support.design.widget;

import android.support.v4.h.b.b;
import android.support.v4.h.b.c;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

final class a
{
  static final Interpolator a;
  static final Interpolator b;
  static final Interpolator c;
  static final Interpolator d;
  static final Interpolator e;
  
  static
  {
    Object localObject = new android/view/animation/LinearInterpolator;
    ((LinearInterpolator)localObject).<init>();
    a = (Interpolator)localObject;
    localObject = new android/support/v4/h/b/b;
    ((b)localObject).<init>();
    b = (Interpolator)localObject;
    localObject = new android/support/v4/h/b/a;
    ((android.support.v4.h.b.a)localObject).<init>();
    c = (Interpolator)localObject;
    localObject = new android/support/v4/h/b/c;
    ((c)localObject).<init>();
    d = (Interpolator)localObject;
    localObject = new android/view/animation/DecelerateInterpolator;
    ((DecelerateInterpolator)localObject).<init>();
    e = (Interpolator)localObject;
  }
  
  static int a(int paramInt1, int paramInt2, float paramFloat)
  {
    return Math.round((paramInt2 - paramInt1) * paramFloat) + paramInt1;
  }
}


/* Location:              android/support/design/widget/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */