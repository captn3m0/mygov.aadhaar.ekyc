package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;

final class r
  extends q.e
{
  static final Handler a = new Handler(Looper.getMainLooper());
  long b;
  boolean c;
  float d;
  long e = 200L;
  Interpolator f;
  final Runnable g = new Runnable()
  {
    public final void run()
    {
      float f1 = 0.0F;
      r localr = r.this;
      float f2;
      if (c)
      {
        f2 = (float)(SystemClock.uptimeMillis() - b) / (float)e;
        if (f2 >= 0.0F) {
          break label112;
        }
      }
      for (;;)
      {
        f2 = f1;
        if (f != null) {
          f2 = f.getInterpolation(f1);
        }
        d = f2;
        localr.h();
        if (SystemClock.uptimeMillis() >= b + e)
        {
          c = false;
          localr.i();
        }
        if (c) {
          r.a.postDelayed(g, 10L);
        }
        return;
        label112:
        if (f2 > 1.0F) {
          f1 = 1.0F;
        } else {
          f1 = f2;
        }
      }
    }
  };
  private final int[] h = new int[2];
  private final float[] i = new float[2];
  private ArrayList<q.e.a> j;
  private ArrayList<q.e.b> k;
  
  private void j()
  {
    if (j != null)
    {
      int m = 0;
      int n = j.size();
      while (m < n)
      {
        j.get(m);
        m += 1;
      }
    }
  }
  
  public final void a()
  {
    if (c) {
      return;
    }
    if (f == null) {
      f = new AccelerateDecelerateInterpolator();
    }
    c = true;
    d = 0.0F;
    b = SystemClock.uptimeMillis();
    h();
    j();
    a.postDelayed(g, 10L);
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    h[0] = paramInt1;
    h[1] = paramInt2;
  }
  
  public final void a(long paramLong)
  {
    e = paramLong;
  }
  
  public final void a(q.e.a parama)
  {
    if (j == null) {
      j = new ArrayList();
    }
    j.add(parama);
  }
  
  public final void a(q.e.b paramb)
  {
    if (k == null) {
      k = new ArrayList();
    }
    k.add(paramb);
  }
  
  public final void a(Interpolator paramInterpolator)
  {
    f = paramInterpolator;
  }
  
  public final boolean b()
  {
    return c;
  }
  
  public final int c()
  {
    return a.a(h[0], h[1], d);
  }
  
  public final void d()
  {
    i[0] = 0.0F;
    i[1] = 1.0F;
  }
  
  public final void e()
  {
    int m = 0;
    c = false;
    a.removeCallbacks(g);
    if (j != null)
    {
      int n = j.size();
      while (m < n)
      {
        j.get(m);
        m += 1;
      }
    }
    i();
  }
  
  public final float f()
  {
    return d;
  }
  
  public final void g()
  {
    if (c)
    {
      c = false;
      a.removeCallbacks(g);
      d = 1.0F;
      h();
      i();
    }
  }
  
  final void h()
  {
    if (k != null)
    {
      int n = k.size();
      int m = 0;
      while (m < n)
      {
        ((q.e.b)k.get(m)).a();
        m += 1;
      }
    }
  }
  
  final void i()
  {
    if (j != null)
    {
      int n = j.size();
      int m = 0;
      while (m < n)
      {
        ((q.e.a)j.get(m)).a();
        m += 1;
      }
    }
  }
}


/* Location:              android/support/design/widget/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */