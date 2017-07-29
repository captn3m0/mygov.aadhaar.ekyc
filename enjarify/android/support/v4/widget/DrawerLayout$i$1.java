package android.support.v4.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

final class DrawerLayout$i$1
  implements Runnable
{
  DrawerLayout$i$1(DrawerLayout.i parami) {}
  
  public final void run()
  {
    int i = 3;
    boolean bool1 = true;
    int j = 0;
    DrawerLayout.i locali = a;
    Object localObject = b;
    int k = h;
    int m = a;
    int i1;
    View localView1;
    label75:
    View localView2;
    int i2;
    if (m == i)
    {
      i1 = bool1;
      if (i1 == 0) {
        break label307;
      }
      localObject = c;
      localView1 = ((DrawerLayout)localObject).b(i);
      if (localView1 == null) {
        break label298;
      }
      m = -localView1.getWidth();
      m += k;
      localView2 = localView1;
      i2 = m;
    }
    for (;;)
    {
      label90:
      if (localView2 != null)
      {
        if (i1 != 0)
        {
          m = localView2.getLeft();
          if (m < i2) {}
        }
        else
        {
          if (i1 != 0) {
            return;
          }
          m = localView2.getLeft();
          if (m <= i2) {
            return;
          }
        }
        localObject = c;
        m = ((DrawerLayout)localObject).a(localView2);
        if (m == 0)
        {
          localObject = (DrawerLayout.g)localView2.getLayoutParams();
          p localp = b;
          int i3 = localView2.getTop();
          localp.a(localView2, i2, i3);
          c = bool1;
          localObject = c;
          ((DrawerLayout)localObject).invalidate();
          locali.c();
          DrawerLayout localDrawerLayout = c;
          boolean bool2 = f;
          if (!bool2)
          {
            long l = SystemClock.uptimeMillis();
            locali = null;
            localObject = MotionEvent.obtain(l, l, i, 0.0F, 0.0F, 0);
            i2 = localDrawerLayout.getChildCount();
            for (;;)
            {
              if (j < i2)
              {
                localView2 = localDrawerLayout.getChildAt(j);
                localView2.dispatchTouchEvent((MotionEvent)localObject);
                j += 1;
                continue;
                i1 = 0;
                localp = null;
                break;
                label298:
                bool2 = false;
                localObject = null;
                break label75;
                label307:
                localView1 = c.b(5);
                localObject = c;
                int n = ((DrawerLayout)localObject).getWidth() - k;
                localView2 = localView1;
                i2 = n;
                break label90;
              }
            }
            ((MotionEvent)localObject).recycle();
            f = bool1;
          }
        }
      }
    }
  }
}


/* Location:              android/support/v4/widget/DrawerLayout$i$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */