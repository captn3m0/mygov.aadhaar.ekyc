package android.support.v4.h;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

class ae$b
  extends ae.a
{
  WeakHashMap b = null;
  
  public final long a(View paramView)
  {
    return paramView.animate().getDuration();
  }
  
  public final void a(ae paramae, View paramView)
  {
    paramView.animate().cancel();
  }
  
  public final void a(ae paramae, View paramView, float paramFloat)
  {
    paramView.animate().alpha(paramFloat);
  }
  
  public void a(ae paramae, View paramView, ai paramai)
  {
    paramView.setTag(2113929216, paramai);
    ae.b.a locala = new android/support/v4/h/ae$b$a;
    locala.<init>(paramae);
    ViewPropertyAnimator localViewPropertyAnimator = paramView.animate();
    af.1 local1 = new android/support/v4/h/af$1;
    local1.<init>(locala, paramView);
    localViewPropertyAnimator.setListener(local1);
  }
  
  public final void a(View paramView, long paramLong)
  {
    paramView.animate().setDuration(paramLong);
  }
  
  public final void a(View paramView, Interpolator paramInterpolator)
  {
    paramView.animate().setInterpolator(paramInterpolator);
  }
  
  public final void b(ae paramae, View paramView)
  {
    paramView.animate().start();
  }
  
  public final void b(ae paramae, View paramView, float paramFloat)
  {
    paramView.animate().translationX(paramFloat);
  }
  
  public final void b(View paramView, long paramLong)
  {
    paramView.animate().setStartDelay(paramLong);
  }
  
  public final void c(ae paramae, View paramView, float paramFloat)
  {
    paramView.animate().translationY(paramFloat);
  }
}


/* Location:              android/support/v4/h/ae$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */