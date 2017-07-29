package android.support.v7.widget;

import android.util.Log;
import android.view.animation.Interpolator;

public final class at$q$a
{
  int a;
  private int b;
  private int c;
  private int d;
  private Interpolator e;
  private boolean f;
  private int g;
  
  final void a(at paramat)
  {
    int i = a;
    int k;
    if (i >= 0)
    {
      i = a;
      k = -1;
      a = k;
      paramat.a(i);
      f = false;
    }
    for (;;)
    {
      return;
      boolean bool = f;
      if (bool)
      {
        Object localObject = e;
        if (localObject != null)
        {
          j = d;
          if (j <= 0)
          {
            localObject = new java/lang/IllegalStateException;
            ((IllegalStateException)localObject).<init>("If you provide an interpolator, you must set a positive duration");
            throw ((Throwable)localObject);
          }
        }
        int j = d;
        if (j <= 0)
        {
          localObject = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject).<init>("Scroll duration must be a positive number");
          throw ((Throwable)localObject);
        }
        localObject = e;
        int m;
        int n;
        if (localObject == null)
        {
          j = d;
          k = -1 << -1;
          if (j == k)
          {
            localObject = C;
            k = b;
            m = c;
            n = ((at.t)localObject).a(k, m);
            ((at.t)localObject).a(k, m, n);
          }
        }
        for (;;)
        {
          j = g + 1;
          g = j;
          j = g;
          k = 10;
          if (j > k)
          {
            localObject = "RecyclerView";
            String str = "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary";
            Log.e((String)localObject, str);
          }
          f = false;
          break;
          localObject = C;
          k = b;
          m = c;
          n = d;
          ((at.t)localObject).a(k, m, n);
          continue;
          localObject = C;
          k = b;
          m = c;
          n = d;
          Interpolator localInterpolator = e;
          ((at.t)localObject).a(k, m, n, localInterpolator);
        }
      }
      g = 0;
    }
  }
}


/* Location:              android/support/v7/widget/at$q$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */