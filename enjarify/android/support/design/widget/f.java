package android.support.design.widget;

import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.os.Build.VERSION;
import android.support.v4.h.w;
import android.view.ViewPropertyAnimator;

class f
  extends e
{
  private float r;
  
  f(z paramz, m paramm, q.d paramd)
  {
    super(paramz, paramm, paramd);
    float f = n.getRotation();
    r = f;
  }
  
  private boolean i()
  {
    z localz = n;
    boolean bool = w.F(localz);
    if (bool)
    {
      localz = n;
      bool = localz.isInEditMode();
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localz = null;
    }
  }
  
  final void a(g.a parama)
  {
    int i = 0;
    Object localObject1 = null;
    int j = h();
    if (j != 0) {}
    for (;;)
    {
      return;
      Object localObject2 = n.animate();
      ((ViewPropertyAnimator)localObject2).cancel();
      j = i();
      if (j != 0)
      {
        j = 1;
        c = j;
        localObject2 = n.animate().scaleX(0.0F).scaleY(0.0F).alpha(0.0F);
        long l = 200L;
        localObject2 = ((ViewPropertyAnimator)localObject2).setDuration(l);
        localObject1 = a.c;
        localObject2 = ((ViewPropertyAnimator)localObject2).setInterpolator((TimeInterpolator)localObject1);
        localObject1 = new android/support/design/widget/f$1;
        ((f.1)localObject1).<init>(this, parama);
        ((ViewPropertyAnimator)localObject2).setListener((Animator.AnimatorListener)localObject1);
      }
      else
      {
        localObject2 = n;
        i = 4;
        ((z)localObject2).a(i, false);
      }
    }
  }
  
  final void b(g.a parama)
  {
    float f = 1.0F;
    boolean bool = g();
    if (bool) {}
    for (;;)
    {
      return;
      Object localObject1 = n.animate();
      ((ViewPropertyAnimator)localObject1).cancel();
      bool = i();
      if (bool)
      {
        c = 2;
        localObject1 = n;
        int i = ((z)localObject1).getVisibility();
        if (i != 0)
        {
          n.setAlpha(0.0F);
          n.setScaleY(0.0F);
          localObject1 = n;
          ((z)localObject1).setScaleX(0.0F);
        }
        localObject1 = n.animate().scaleX(f).scaleY(f).alpha(f);
        long l = 200L;
        localObject1 = ((ViewPropertyAnimator)localObject1).setDuration(l);
        Object localObject2 = a.d;
        localObject1 = ((ViewPropertyAnimator)localObject1).setInterpolator((TimeInterpolator)localObject2);
        localObject2 = new android/support/design/widget/f$2;
        ((f.2)localObject2).<init>(this, parama);
        ((ViewPropertyAnimator)localObject1).setListener((Animator.AnimatorListener)localObject2);
      }
      else
      {
        n.a(0, false);
        n.setAlpha(f);
        n.setScaleY(f);
        localObject1 = n;
        ((z)localObject1).setScaleX(f);
      }
    }
  }
  
  boolean d()
  {
    return true;
  }
  
  final void e()
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    Object localObject = n;
    float f2 = ((z)localObject).getRotation();
    float f3 = r;
    boolean bool2 = f3 < f2;
    int j;
    int m;
    if (bool2)
    {
      r = f2;
      int k = Build.VERSION.SDK_INT;
      j = 19;
      f3 = 2.7E-44F;
      if (k == j)
      {
        f2 = r % 90.0F;
        j = 0;
        f3 = 0.0F;
        boolean bool3 = f2 < 0.0F;
        if (!bool3) {
          break label205;
        }
        localObject = n;
        m = ((z)localObject).getLayerType();
        if (m != i)
        {
          localObject = n;
          ((z)localObject).setLayerType(i, null);
        }
      }
    }
    for (;;)
    {
      localObject = a;
      boolean bool1;
      if (localObject != null)
      {
        localObject = a;
        f3 = -r;
        f1 = k;
        bool1 = f1 < f3;
        if (bool1)
        {
          k = f3;
          ((l)localObject).invalidateSelf();
        }
      }
      localObject = f;
      if (localObject != null)
      {
        localObject = f;
        f3 = -r;
        f1 = h;
        bool1 = f3 < f1;
        if (bool1)
        {
          h = f3;
          ((c)localObject).invalidateSelf();
        }
      }
      return;
      label205:
      localObject = n;
      m = ((z)localObject).getLayerType();
      if (m != 0)
      {
        localObject = n;
        j = 0;
        f3 = 0.0F;
        ((z)localObject).setLayerType(0, null);
      }
    }
  }
}


/* Location:              android/support/design/widget/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */