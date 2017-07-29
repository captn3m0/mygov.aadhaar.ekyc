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
    OverScroller localOverScroller;
    if (paramInterpolator != null)
    {
      localOverScroller = new android/widget/OverScroller;
      localOverScroller.<init>(paramContext, paramInterpolator);
    }
    for (;;)
    {
      a = localOverScroller;
      return;
      localOverScroller = new android/widget/OverScroller;
      localOverScroller.<init>(paramContext);
    }
  }
  
  public static m a(Context paramContext, Interpolator paramInterpolator)
  {
    m localm = new android/support/v4/widget/m;
    int i = Build.VERSION.SDK_INT;
    int k = 14;
    if (i >= k) {}
    int j;
    for (i = 1;; j = 0)
    {
      localm.<init>(i, paramContext, paramInterpolator);
      return localm;
    }
  }
  
  public final float a()
  {
    boolean bool = b;
    OverScroller localOverScroller;
    float f;
    if (bool)
    {
      localOverScroller = (OverScroller)a;
      f = localOverScroller.getCurrVelocity();
    }
    for (;;)
    {
      return f;
      bool = false;
      f = 0.0F;
      localOverScroller = null;
    }
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
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */