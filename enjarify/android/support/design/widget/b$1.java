package android.support.design.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.design.a.a;
import android.support.v4.h.ae;
import android.support.v4.h.ai;
import android.support.v4.h.w;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

final class b$1
  implements Handler.Callback
{
  public final boolean handleMessage(Message paramMessage)
  {
    long l = 250L;
    int i = 1;
    int j = 0;
    Object localObject1 = null;
    int m = what;
    Object localObject4;
    switch (m)
    {
    default: 
      m = 0;
      localObject2 = null;
      return m;
    case 0: 
      localObject2 = (b)obj;
      Object localObject3 = c.getParent();
      if (localObject3 == null)
      {
        localObject3 = c.getLayoutParams();
        boolean bool2 = localObject3 instanceof CoordinatorLayout.d;
        if (bool2)
        {
          localObject3 = (CoordinatorLayout.d)localObject3;
          localObject4 = new android/support/design/widget/b$a;
          ((b.a)localObject4).<init>((b)localObject2);
          float f1 = SwipeDismissBehavior.a(0.1F);
          f = f1;
          f1 = SwipeDismissBehavior.a(0.6F);
          g = f1;
          d = 0;
          localObject1 = new android/support/design/widget/b$5;
          ((b.5)localObject1).<init>((b)localObject2);
          c = ((SwipeDismissBehavior.a)localObject1);
          ((CoordinatorLayout.d)localObject3).a((CoordinatorLayout.a)localObject4);
          j = 80;
          g = j;
        }
        localObject3 = b;
        localObject1 = c;
        ((ViewGroup)localObject3).addView((View)localObject1);
      }
      localObject3 = c;
      localObject1 = new android/support/design/widget/b$6;
      ((b.6)localObject1).<init>((b)localObject2);
      ((b.e)localObject3).setOnAttachStateChangeListener((b.c)localObject1);
      localObject3 = c;
      boolean bool3 = w.F((View)localObject3);
      if (bool3)
      {
        bool3 = ((b)localObject2).e();
        if (bool3) {
          ((b)localObject2).b();
        }
      }
      for (;;)
      {
        m = i;
        break;
        ((b)localObject2).c();
        continue;
        localObject3 = c;
        localObject1 = new android/support/design/widget/b$7;
        ((b.7)localObject1).<init>((b)localObject2);
        ((b.e)localObject3).setOnLayoutChangeListener((b.d)localObject1);
      }
    }
    Object localObject2 = (b)obj;
    int i1 = arg1;
    boolean bool1 = ((b)localObject2).e();
    int n;
    if (bool1)
    {
      localObject1 = c;
      int k = ((b.e)localObject1).getVisibility();
      if (k == 0)
      {
        k = Build.VERSION.SDK_INT;
        n = 14;
        float f2 = 2.0E-44F;
        if (k >= n)
        {
          localObject1 = w.s(c);
          n = c.getHeight();
          f2 = n;
          localObject1 = ((ae)localObject1).c(f2);
          localObject4 = a.b;
          localObject1 = ((ae)localObject1).a((Interpolator)localObject4).a(l);
          localObject4 = new android/support/design/widget/b$10;
          ((b.10)localObject4).<init>((b)localObject2, i1);
          localObject2 = ((ae)localObject1).a((ai)localObject4);
          ((ae)localObject2).b();
        }
      }
    }
    for (;;)
    {
      m = i;
      break;
      localObject1 = c.getContext();
      n = a.a.design_snackbar_out;
      localObject1 = AnimationUtils.loadAnimation((Context)localObject1, n);
      localObject4 = a.b;
      ((Animation)localObject1).setInterpolator((Interpolator)localObject4);
      ((Animation)localObject1).setDuration(l);
      localObject4 = new android/support/design/widget/b$2;
      ((b.2)localObject4).<init>((b)localObject2, i1);
      ((Animation)localObject1).setAnimationListener((Animation.AnimationListener)localObject4);
      localObject2 = c;
      ((b.e)localObject2).startAnimation((Animation)localObject1);
      continue;
      ((b)localObject2).d();
    }
  }
}


/* Location:              android/support/design/widget/b$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */