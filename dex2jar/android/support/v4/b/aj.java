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
    b = paramView.getViewTreeObserver();
    c = paramRunnable;
  }
  
  public static aj a(View paramView, Runnable paramRunnable)
  {
    paramRunnable = new aj(paramView, paramRunnable);
    paramView.getViewTreeObserver().addOnPreDrawListener(paramRunnable);
    paramView.addOnAttachStateChangeListener(paramRunnable);
    return paramRunnable;
  }
  
  private void a()
  {
    if (b.isAlive()) {
      b.removeOnPreDrawListener(this);
    }
    for (;;)
    {
      a.removeOnAttachStateChangeListener(this);
      return;
      a.getViewTreeObserver().removeOnPreDrawListener(this);
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
    b = paramView.getViewTreeObserver();
  }
  
  public final void onViewDetachedFromWindow(View paramView)
  {
    a();
  }
}


/* Location:              android/support/v4/b/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */