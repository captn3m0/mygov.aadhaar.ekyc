package android.support.design.widget;

import android.animation.ValueAnimator;
import android.view.animation.Interpolator;

final class s
  extends q.e
{
  private final ValueAnimator a;
  
  s()
  {
    ValueAnimator localValueAnimator = new android/animation/ValueAnimator;
    localValueAnimator.<init>();
    a = localValueAnimator;
  }
  
  public final void a()
  {
    a.start();
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    ValueAnimator localValueAnimator = a;
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = paramInt1;
    arrayOfInt[1] = paramInt2;
    localValueAnimator.setIntValues(arrayOfInt);
  }
  
  public final void a(long paramLong)
  {
    a.setDuration(paramLong);
  }
  
  public final void a(q.e.a parama)
  {
    ValueAnimator localValueAnimator = a;
    s.2 local2 = new android/support/design/widget/s$2;
    local2.<init>(this, parama);
    localValueAnimator.addListener(local2);
  }
  
  public final void a(q.e.b paramb)
  {
    ValueAnimator localValueAnimator = a;
    s.1 local1 = new android/support/design/widget/s$1;
    local1.<init>(this, paramb);
    localValueAnimator.addUpdateListener(local1);
  }
  
  public final void a(Interpolator paramInterpolator)
  {
    a.setInterpolator(paramInterpolator);
  }
  
  public final boolean b()
  {
    return a.isRunning();
  }
  
  public final int c()
  {
    return ((Integer)a.getAnimatedValue()).intValue();
  }
  
  public final void d()
  {
    ValueAnimator localValueAnimator = a;
    float[] arrayOfFloat = new float[2];
    float[] tmp10_9 = arrayOfFloat;
    tmp10_9[0] = 0.0F;
    tmp10_9[1] = 1.0F;
    localValueAnimator.setFloatValues(arrayOfFloat);
  }
  
  public final void e()
  {
    a.cancel();
  }
  
  public final float f()
  {
    return a.getAnimatedFraction();
  }
  
  public final void g()
  {
    a.end();
  }
}


/* Location:              android/support/design/widget/s.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */