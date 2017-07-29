package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.view.View;

@TargetApi(21)
final class h
  extends f
{
  private InsetDrawable r;
  
  h(z paramz, m paramm, q.d paramd)
  {
    super(paramz, paramm, paramd);
  }
  
  public final float a()
  {
    return n.getElevation();
  }
  
  final void a(float paramFloat1, float paramFloat2)
  {
    if (Build.VERSION.SDK_INT == 21) {
      if (n.isEnabled())
      {
        n.setElevation(paramFloat1);
        if ((n.isFocused()) || (n.isPressed())) {
          n.setTranslationZ(paramFloat2);
        }
      }
    }
    for (;;)
    {
      if (o.b()) {
        f();
      }
      return;
      n.setTranslationZ(0.0F);
      continue;
      n.setElevation(0.0F);
      n.setTranslationZ(0.0F);
      continue;
      StateListAnimator localStateListAnimator = new StateListAnimator();
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.play(ObjectAnimator.ofFloat(n, "elevation", new float[] { paramFloat1 }).setDuration(0L)).with(ObjectAnimator.ofFloat(n, View.TRANSLATION_Z, new float[] { paramFloat2 }).setDuration(100L));
      localAnimatorSet.setInterpolator(b);
      localStateListAnimator.addState(j, localAnimatorSet);
      localAnimatorSet = new AnimatorSet();
      localAnimatorSet.play(ObjectAnimator.ofFloat(n, "elevation", new float[] { paramFloat1 }).setDuration(0L)).with(ObjectAnimator.ofFloat(n, View.TRANSLATION_Z, new float[] { paramFloat2 }).setDuration(100L));
      localAnimatorSet.setInterpolator(b);
      localStateListAnimator.addState(k, localAnimatorSet);
      localAnimatorSet = new AnimatorSet();
      localAnimatorSet.playSequentially(new Animator[] { ObjectAnimator.ofFloat(n, "elevation", new float[] { paramFloat1 }).setDuration(0L), ObjectAnimator.ofFloat(n, View.TRANSLATION_Z, new float[] { n.getTranslationZ() }).setDuration(100L), ObjectAnimator.ofFloat(n, View.TRANSLATION_Z, new float[] { 0.0F }).setDuration(100L) });
      localAnimatorSet.setInterpolator(b);
      localStateListAnimator.addState(l, localAnimatorSet);
      localAnimatorSet = new AnimatorSet();
      localAnimatorSet.play(ObjectAnimator.ofFloat(n, "elevation", new float[] { 0.0F }).setDuration(0L)).with(ObjectAnimator.ofFloat(n, View.TRANSLATION_Z, new float[] { 0.0F }).setDuration(0L));
      localAnimatorSet.setInterpolator(b);
      localStateListAnimator.addState(m, localAnimatorSet);
      n.setStateListAnimator(localStateListAnimator);
    }
  }
  
  final void a(int paramInt)
  {
    if ((e instanceof RippleDrawable))
    {
      ((RippleDrawable)e).setColor(ColorStateList.valueOf(paramInt));
      return;
    }
    super.a(paramInt);
  }
  
  final void a(Rect paramRect)
  {
    if (o.b())
    {
      float f1 = o.a();
      float f2 = n.getElevation() + this.i;
      int i = (int)Math.ceil(l.b(f2, f1, false));
      int j = (int)Math.ceil(l.a(f2, f1, false));
      paramRect.set(i, j, i, j);
      return;
    }
    paramRect.set(0, 0, 0, 0);
  }
  
  final void a(int[] paramArrayOfInt) {}
  
  final void b() {}
  
  final void b(Rect paramRect)
  {
    if (o.b())
    {
      r = new InsetDrawable(e, left, top, right, bottom);
      o.a(r);
      return;
    }
    o.a(e);
  }
  
  final void c()
  {
    f();
  }
  
  final boolean d()
  {
    return false;
  }
}


/* Location:              android/support/design/widget/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */