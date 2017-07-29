package android.support.v4.b;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

final class aj
  implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener
{
  private final View a;
  private ViewTreeObserver b;
  private final Runnable c;
  
  private aj(View paramView, Runnable paramRunnable)
  {
    a = paramView;
    ViewTreeObserver localViewTreeObserver = paramView.getViewTreeObserver();
    b = localViewTreeObserver;
    c = paramRunnable;
  }
  
  public static aj a(View paramView, Runnable paramRunnable)
  {
    aj localaj = new android/support/v4/b/aj;
    localaj.<init>(paramView, paramRunnable);
    paramView.getViewTreeObserver().addOnPreDrawListener(localaj);
    paramView.addOnAttachStateChangeListener(localaj);
    return localaj;
  }
  
  private void a()
  {
    ViewTreeObserver localViewTreeObserver = b;
    boolean bool = localViewTreeObserver.isAlive();
    if (bool)
    {
      localViewTreeObserver = b;
      localViewTreeObserver.removeOnPreDrawListener(this);
    }
    for (;;)
    {
      a.removeOnAttachStateChangeListener(this);
      return;
      localViewTreeObserver = a.getViewTreeObserver();
      localViewTreeObserver.removeOnPreDrawListener(this);
    }
  }
  
  public final boolean onPreDraw()
  {
    a();
    c.run();
    return true;
  }
  
  public final void onViewAttachedToWindow(View paramView)
  {
    ViewTreeObserver localViewTreeObserver = paramView.getViewTreeObserver();
    b = localViewTreeObserver;
  }
  
  public final void onViewDetachedFromWindow(View paramView)
  {
    a();
  }
}


/* Location:              android/support/v4/b/aj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */