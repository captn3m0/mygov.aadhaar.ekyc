package android.support.design.widget;

import android.os.Handler;
import android.os.SystemClock;
import android.view.animation.Interpolator;

final class r$1
  implements Runnable
{
  r$1(r paramr) {}
  
  public final void run()
  {
    int i = 1065353216;
    float f1 = 1.0F;
    boolean bool1 = false;
    float f2 = 0.0F;
    Handler localHandler = null;
    r localr = a;
    boolean bool2 = c;
    long l1;
    long l2;
    float f3;
    if (bool2)
    {
      l1 = SystemClock.uptimeMillis();
      l2 = b;
      f3 = (float)(l1 - l2);
      l1 = e;
      float f4 = (float)l1;
      f3 /= f4;
      boolean bool3 = f3 < 0.0F;
      if (!bool3) {
        break label217;
      }
    }
    for (;;)
    {
      Object localObject = f;
      if (localObject != null)
      {
        localObject = f;
        f2 = ((Interpolator)localObject).getInterpolation(f2);
      }
      d = f2;
      localr.h();
      long l3 = SystemClock.uptimeMillis();
      l1 = b;
      l2 = e;
      l1 += l2;
      bool1 = l3 < l1;
      if (!bool1)
      {
        bool1 = false;
        f2 = 0.0F;
        localHandler = null;
        c = false;
        localr.i();
      }
      bool1 = c;
      if (bool1)
      {
        localHandler = r.a;
        localObject = g;
        long l4 = 10;
        localHandler.postDelayed((Runnable)localObject, l4);
      }
      return;
      label217:
      bool1 = f3 < f1;
      if (bool1)
      {
        bool1 = i;
        f2 = f1;
      }
      else
      {
        f2 = f3;
      }
    }
  }
}


/* Location:              android/support/design/widget/r$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */