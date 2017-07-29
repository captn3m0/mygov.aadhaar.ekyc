package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.support.v4.h.w;
import android.view.ViewPropertyAnimator;

@TargetApi(14)
class f
  extends e
{
  private float r = n.getRotation();
  
  f(z paramz, m paramm, q.d paramd)
  {
    super(paramz, paramm, paramd);
  }
  
  private boolean i()
  {
    return (w.F(n)) && (!n.isInEditMode());
  }
  
  final void a(final g.a parama)
  {
    if (h()) {
      return;
    }
    n.animate().cancel();
    if (i())
    {
      c = 1;
      n.animate().scaleX(0.0F).scaleY(0.0F).alpha(0.0F).setDuration(200L).setInterpolator(a.c).setListener(new AnimatorListenerAdapter()
      {
        private boolean d;
        
        public final void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          d = true;
        }
        
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          c = 0;
          if (!d)
          {
            paramAnonymousAnimator = n;
            if (!a) {
              break label43;
            }
          }
          label43:
          for (int i = 8;; i = 4)
          {
            paramAnonymousAnimator.a(i, a);
            return;
          }
        }
        
        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
          n.a(0, a);
          d = false;
        }
      });
      return;
    }
    n.a(4, false);
  }
  
  final void b(final g.a parama)
  {
    if (g()) {
      return;
    }
    n.animate().cancel();
    if (i())
    {
      c = 2;
      if (n.getVisibility() != 0)
      {
        n.setAlpha(0.0F);
        n.setScaleY(0.0F);
        n.setScaleX(0.0F);
      }
      n.animate().scaleX(1.0F).scaleY(1.0F).alpha(1.0F).setDuration(200L).setInterpolator(a.d).setListener(new AnimatorListenerAdapter()
      {
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          c = 0;
        }
        
        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
          n.a(0, a);
        }
      });
      return;
    }
    n.a(0, false);
    n.setAlpha(1.0F);
    n.setScaleY(1.0F);
    n.setScaleX(1.0F);
  }
  
  boolean d()
  {
    return true;
  }
  
  final void e()
  {
    float f = n.getRotation();
    if (r != f)
    {
      r = f;
      if (Build.VERSION.SDK_INT == 19)
      {
        if (r % 90.0F == 0.0F) {
          break label135;
        }
        if (n.getLayerType() != 1) {
          n.setLayerType(1, null);
        }
      }
    }
    for (;;)
    {
      Object localObject;
      if (a != null)
      {
        localObject = a;
        f = -r;
        if (k != f)
        {
          k = f;
          ((l)localObject).invalidateSelf();
        }
      }
      if (this.f != null)
      {
        localObject = this.f;
        f = -r;
        if (f != h)
        {
          h = f;
          ((c)localObject).invalidateSelf();
        }
      }
      return;
      label135:
      if (n.getLayerType() != 0) {
        n.setLayerType(0, null);
      }
    }
  }
}


/* Location:              android/support/design/widget/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */