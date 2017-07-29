package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.Property;
import android.view.View;

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
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject1;
    boolean bool;
    if (i == j)
    {
      localObject1 = this.n;
      bool = ((z)localObject1).isEnabled();
      if (bool)
      {
        this.n.setElevation(paramFloat1);
        localObject1 = this.n;
        bool = ((z)localObject1).isFocused();
        if (!bool)
        {
          localObject1 = this.n;
          bool = ((z)localObject1).isPressed();
          if (!bool) {}
        }
        else
        {
          localObject1 = this.n;
          ((z)localObject1).setTranslationZ(paramFloat2);
        }
      }
    }
    for (;;)
    {
      localObject1 = o;
      bool = ((m)localObject1).b();
      if (bool) {
        f();
      }
      return;
      localObject1 = this.n;
      j = 0;
      Object localObject2 = null;
      ((z)localObject1).setTranslationZ(0.0F);
      continue;
      this.n.setElevation(0.0F);
      localObject1 = this.n;
      j = 0;
      localObject2 = null;
      ((z)localObject1).setTranslationZ(0.0F);
      continue;
      localObject1 = new android/animation/StateListAnimator;
      ((StateListAnimator)localObject1).<init>();
      localObject2 = new android/animation/AnimatorSet;
      ((AnimatorSet)localObject2).<init>();
      Object localObject3 = this.n;
      Object localObject4 = new float[1];
      localObject4[0] = paramFloat1;
      localObject3 = ObjectAnimator.ofFloat(localObject3, "elevation", (float[])localObject4).setDuration(0L);
      localObject3 = ((AnimatorSet)localObject2).play((Animator)localObject3);
      Object localObject5 = this.n;
      localObject4 = View.TRANSLATION_Z;
      Object localObject6 = new float[1];
      localObject6[0] = paramFloat2;
      localObject5 = ObjectAnimator.ofFloat(localObject5, (Property)localObject4, (float[])localObject6).setDuration(100);
      ((AnimatorSet.Builder)localObject3).with((Animator)localObject5);
      localObject3 = b;
      ((AnimatorSet)localObject2).setInterpolator((TimeInterpolator)localObject3);
      localObject3 = j;
      ((StateListAnimator)localObject1).addState((int[])localObject3, (Animator)localObject2);
      localObject2 = new android/animation/AnimatorSet;
      ((AnimatorSet)localObject2).<init>();
      localObject3 = this.n;
      localObject4 = new float[1];
      localObject4[0] = paramFloat1;
      localObject3 = ObjectAnimator.ofFloat(localObject3, "elevation", (float[])localObject4).setDuration(0L);
      localObject3 = ((AnimatorSet)localObject2).play((Animator)localObject3);
      localObject5 = this.n;
      localObject4 = View.TRANSLATION_Z;
      localObject6 = new float[1];
      localObject6[0] = paramFloat2;
      localObject5 = ObjectAnimator.ofFloat(localObject5, (Property)localObject4, (float[])localObject6).setDuration(100);
      ((AnimatorSet.Builder)localObject3).with((Animator)localObject5);
      localObject3 = b;
      ((AnimatorSet)localObject2).setInterpolator((TimeInterpolator)localObject3);
      localObject3 = k;
      ((StateListAnimator)localObject1).addState((int[])localObject3, (Animator)localObject2);
      localObject2 = new android/animation/AnimatorSet;
      ((AnimatorSet)localObject2).<init>();
      int k = 3;
      localObject3 = new Animator[k];
      localObject4 = this.n;
      float[] arrayOfFloat = new float[1];
      arrayOfFloat[0] = paramFloat1;
      localObject4 = ObjectAnimator.ofFloat(localObject4, "elevation", arrayOfFloat).setDuration(0L);
      localObject3[0] = localObject4;
      localObject4 = this.n;
      localObject6 = View.TRANSLATION_Z;
      arrayOfFloat = new float[1];
      float f = this.n.getTranslationZ();
      arrayOfFloat[0] = f;
      localObject4 = ObjectAnimator.ofFloat(localObject4, (Property)localObject6, arrayOfFloat).setDuration(100);
      localObject3[1] = localObject4;
      int m = 2;
      localObject4 = this.n;
      localObject6 = View.TRANSLATION_Z;
      arrayOfFloat = new float[1];
      f = 0.0F;
      arrayOfFloat[0] = 0.0F;
      localObject4 = ObjectAnimator.ofFloat(localObject4, (Property)localObject6, arrayOfFloat);
      long l1 = 100;
      localObject4 = ((ObjectAnimator)localObject4).setDuration(l1);
      localObject3[m] = localObject4;
      ((AnimatorSet)localObject2).playSequentially((Animator[])localObject3);
      localObject3 = b;
      ((AnimatorSet)localObject2).setInterpolator((TimeInterpolator)localObject3);
      localObject3 = l;
      ((StateListAnimator)localObject1).addState((int[])localObject3, (Animator)localObject2);
      localObject2 = new android/animation/AnimatorSet;
      ((AnimatorSet)localObject2).<init>();
      localObject3 = this.n;
      int n = 1;
      localObject4 = new float[n];
      localObject4[0] = 0.0F;
      localObject3 = ObjectAnimator.ofFloat(localObject3, "elevation", (float[])localObject4).setDuration(0L);
      localObject3 = ((AnimatorSet)localObject2).play((Animator)localObject3);
      localObject5 = this.n;
      localObject4 = View.TRANSLATION_Z;
      int i1 = 1;
      localObject6 = new float[i1];
      arrayOfFloat = null;
      localObject6[0] = 0.0F;
      localObject5 = ObjectAnimator.ofFloat(localObject5, (Property)localObject4, (float[])localObject6);
      long l2 = 0L;
      localObject5 = ((ObjectAnimator)localObject5).setDuration(l2);
      ((AnimatorSet.Builder)localObject3).with((Animator)localObject5);
      localObject3 = b;
      ((AnimatorSet)localObject2).setInterpolator((TimeInterpolator)localObject3);
      localObject3 = m;
      ((StateListAnimator)localObject1).addState((int[])localObject3, (Animator)localObject2);
      localObject2 = this.n;
      ((z)localObject2).setStateListAnimator((StateListAnimator)localObject1);
    }
  }
  
  final void a(int paramInt)
  {
    Object localObject = e;
    boolean bool = localObject instanceof RippleDrawable;
    if (bool)
    {
      localObject = (RippleDrawable)e;
      ColorStateList localColorStateList = ColorStateList.valueOf(paramInt);
      ((RippleDrawable)localObject).setColor(localColorStateList);
    }
    for (;;)
    {
      return;
      super.a(paramInt);
    }
  }
  
  final void a(Rect paramRect)
  {
    m localm = o;
    boolean bool = localm.b();
    if (bool)
    {
      localm = o;
      float f1 = localm.a();
      z localz = n;
      float f2 = localz.getElevation();
      float f3 = this.i;
      f2 += f3;
      f3 = l.b(f2, f1, false);
      double d1 = Math.ceil(f3);
      int j = (int)d1;
      f1 = l.a(f2, f1, false);
      double d2 = Math.ceil(f1);
      int i = (int)d2;
      paramRect.set(j, i, j, i);
    }
    for (;;)
    {
      return;
      paramRect.set(0, 0, 0, 0);
    }
  }
  
  final void a(int[] paramArrayOfInt) {}
  
  final void b() {}
  
  final void b(Rect paramRect)
  {
    Object localObject1 = o;
    boolean bool = ((m)localObject1).b();
    Object localObject2;
    if (bool)
    {
      localObject1 = new android/graphics/drawable/InsetDrawable;
      localObject2 = e;
      int i = left;
      int j = top;
      int k = right;
      int m = bottom;
      ((InsetDrawable)localObject1).<init>((Drawable)localObject2, i, j, k, m);
      r = ((InsetDrawable)localObject1);
      localObject1 = o;
      localObject2 = r;
      ((m)localObject1).a((Drawable)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = o;
      localObject2 = e;
      ((m)localObject1).a((Drawable)localObject2);
    }
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
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */