package android.support.v4.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

public final class m
{
  public OverScroller a;
  private final boolean b;
  
  private m(boolean paramBoolean, Context paramContext, Interpolator paramInterpolator)
  {
    b = paramBoolean;
    if (paramInterpolator != null) {}
    for (paramContext = new OverScroller(paramContext, paramInterpolator);; paramContext = new OverScroller(paramContext))
    {
      a = paramContext;
      return;
    }
  }
  
  public static m a(Context paramContext, Interpolator paramInterpolator)
  {
    if (Build.VERSION.SDK_INT >= 14) {}
    for (boolean bool = true;; bool = false) {
      return new m(bool, paramContext, paramInterpolator);
    }
  }
  
  public final float a()
  {
    if (b) {
      return ((OverScroller)a).getCurrVelocity();
    }
    return 0.0F;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    a.startScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    a.fling(0, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
  }
  
  public final boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    return a.springBack(paramInt1, paramInt2, 0, 0, 0, paramInt3);
  }
}


/* Location:              android/support/v4/widget/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */