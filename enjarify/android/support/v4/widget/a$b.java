package android.support.v4.widget;

import android.os.SystemClock;
import android.support.v4.h.w;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;

final class a$b
  implements Runnable
{
  a$b(a parama) {}
  
  public final void run()
  {
    long l1 = 0L;
    Object localObject1 = a;
    boolean bool = e;
    if (!bool) {}
    for (;;)
    {
      return;
      localObject1 = a;
      bool = c;
      long l2;
      if (bool)
      {
        a.c = false;
        localObject1 = a.a;
        l2 = AnimationUtils.currentAnimationTimeMillis();
        e = l2;
        i = -1;
        l2 = e;
        f = l2;
        f1 = 0.5F;
        j = f1;
        g = 0;
        h = 0;
      }
      localObject1 = a;
      a.a locala = a;
      long l3 = i;
      bool = l3 < l1;
      if (bool)
      {
        l3 = AnimationUtils.currentAnimationTimeMillis();
        l2 = i;
        j = k;
        long l4 = j;
        l2 += l4;
        bool = l3 < l2;
        if (bool) {
          bool = true;
        }
      }
      for (float f2 = Float.MIN_VALUE;; f2 = 0.0F)
      {
        if (!bool)
        {
          localObject1 = a;
          bool = ((a)localObject1).a();
          if (bool) {
            break label224;
          }
        }
        localObject1 = a;
        e = false;
        break;
        bool = false;
        localObject1 = null;
      }
      label224:
      localObject1 = a;
      bool = d;
      if (bool)
      {
        a.d = false;
        a locala1 = a;
        l3 = SystemClock.uptimeMillis();
        j = 3;
        f3 = 4.2E-45F;
        l2 = l3;
        localObject1 = MotionEvent.obtain(l3, l3, j, 0.0F, 0.0F, 0);
        localObject2 = b;
        ((View)localObject2).onTouchEvent((MotionEvent)localObject1);
        ((MotionEvent)localObject1).recycle();
      }
      l3 = f;
      bool = l3 < l1;
      if (!bool)
      {
        localObject1 = new java/lang/RuntimeException;
        ((RuntimeException)localObject1).<init>("Cannot compute scroll delta before calling start()");
        throw ((Throwable)localObject1);
      }
      l3 = AnimationUtils.currentAnimationTimeMillis();
      float f4 = locala.a(l3);
      float f5 = -4.0F * f4 * f4;
      int j = 1082130432;
      float f3 = 4.0F;
      f4 = f4 * f3 + f5;
      long l5 = f;
      l5 = l3 - l5;
      f = l3;
      f2 = (float)l5 * f4;
      float f1 = c;
      int i = (int)(f2 * f1);
      g = i;
      f2 = (float)l5 * f4;
      f1 = d;
      f2 *= f1;
      i = (int)f2;
      h = i;
      i = h;
      Object localObject2 = a;
      ((a)localObject2).a(i);
      localObject1 = a.b;
      w.a((View)localObject1, this);
    }
  }
}


/* Location:              android/support/v4/widget/a$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */