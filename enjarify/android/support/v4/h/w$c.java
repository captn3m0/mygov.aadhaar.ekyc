package android.support.v4.h;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.view.View;

class w$c
  extends w.b
{
  public final void A(View paramView)
  {
    paramView.jumpDrawablesToCurrentState();
  }
  
  public final void B(View paramView)
  {
    paramView.setSaveFromParentEnabled(false);
  }
  
  public final int a(int paramInt1, int paramInt2)
  {
    return View.combineMeasuredStates(paramInt1, paramInt2);
  }
  
  public final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return View.resolveSizeAndState(paramInt1, paramInt2, paramInt3);
  }
  
  final long a()
  {
    return ValueAnimator.getFrameDelay();
  }
  
  public final void a(View paramView, float paramFloat)
  {
    paramView.setTranslationX(paramFloat);
  }
  
  public final void b(View paramView, float paramFloat)
  {
    paramView.setTranslationY(paramFloat);
  }
  
  public final void b(View paramView, boolean paramBoolean)
  {
    paramView.setActivated(paramBoolean);
  }
  
  public final void c(View paramView, float paramFloat)
  {
    paramView.setAlpha(paramFloat);
  }
  
  public final void d(View paramView, int paramInt)
  {
    paramView.setLayerType(paramInt, null);
  }
  
  public final float e(View paramView)
  {
    return paramView.getAlpha();
  }
  
  public final int f(View paramView)
  {
    return paramView.getLayerType();
  }
  
  public void f(View paramView, int paramInt)
  {
    y.b(paramView, paramInt);
  }
  
  public void g(View paramView, int paramInt)
  {
    y.a(paramView, paramInt);
  }
  
  public final int i(View paramView)
  {
    return paramView.getMeasuredWidthAndState();
  }
  
  public final int j(View paramView)
  {
    return paramView.getMeasuredState();
  }
  
  public final float o(View paramView)
  {
    return paramView.getTranslationX();
  }
  
  public final float p(View paramView)
  {
    return paramView.getTranslationY();
  }
  
  public final Matrix q(View paramView)
  {
    return paramView.getMatrix();
  }
}


/* Location:              android/support/v4/h/w$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */