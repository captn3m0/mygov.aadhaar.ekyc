package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.view.animation.Interpolator;

@TargetApi(12)
final class s
  extends q.e
{
  private final ValueAnimator a = new ValueAnimator();
  
  public final void a()
  {
    a.start();
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    a.setIntValues(new int[] { paramInt1, paramInt2 });
  }
  
  public final void a(long paramLong)
  {
    a.setDuration(paramLong);
  }
  
  public final void a(final q.e.a parama)
  {
    a.addListener(new AnimatorListenerAdapter()
    {
      public final void onAnimationCancel(Animator paramAnonymousAnimator) {}
      
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        parama.a();
      }
      
      public final void onAnimationStart(Animator paramAnonymousAnimator) {}
    });
  }
  
  public final void a(final q.e.b paramb)
  {
    a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        paramb.a();
      }
    });
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
    a.setFloatValues(new float[] { 0.0F, 1.0F });
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */