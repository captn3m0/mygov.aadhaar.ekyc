package android.support.a.a;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

final class c$1
  implements Drawable.Callback
{
  c$1(c paramc) {}
  
  public final void invalidateDrawable(Drawable paramDrawable)
  {
    a.invalidateSelf();
  }
  
  public final void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    a.scheduleSelf(paramRunnable, paramLong);
  }
  
  public final void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    a.unscheduleSelf(paramRunnable);
  }
}


/* Location:              android/support/a/a/c$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */