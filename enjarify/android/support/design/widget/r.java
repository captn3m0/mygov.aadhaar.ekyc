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
  static final Handler a;
  long b;
  boolean c;
  float d;
  long e;
  Interpolator f;
  final Runnable g;
  private final int[] h;
  private final float[] i;
  private ArrayList j;
  private ArrayList k;
  
  static
  {
    Handler localHandler = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    localHandler.<init>(localLooper);
    a = localHandler;
  }
  
  r()
  {
    Object localObject = new int[m];
    h = ((int[])localObject);
    localObject = new float[m];
    i = ((float[])localObject);
    e = 200L;
    localObject = new android/support/design/widget/r$1;
    ((r.1)localObject).<init>(this);
    g = ((Runnable)localObject);
  }
  
  private void j()
  {
    ArrayList localArrayList1 = j;
    if (localArrayList1 != null)
    {
      int m = 0;
      localArrayList1 = null;
      ArrayList localArrayList2 = j;
      int n = localArrayList2.size();
      while (m < n)
      {
        ArrayList localArrayList3 = j;
        localArrayList3.get(m);
        m += 1;
      }
    }
  }
  
  public final void a()
  {
    boolean bool = c;
    if (bool) {}
    for (;;)
    {
      return;
      Object localObject = f;
      if (localObject == null)
      {
        localObject = new android/view/animation/AccelerateDecelerateInterpolator;
        ((AccelerateDecelerateInterpolator)localObject).<init>();
        f = ((Interpolator)localObject);
      }
      c = true;
      bool = false;
      d = 0.0F;
      long l1 = SystemClock.uptimeMillis();
      b = l1;
      h();
      j();
      localObject = a;
      Runnable localRunnable = g;
      long l2 = 10;
      ((Handler)localObject).postDelayed(localRunnable, l2);
    }
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
    ArrayList localArrayList = j;
    if (localArrayList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      j = localArrayList;
    }
    j.add(parama);
  }
  
  public final void a(q.e.b paramb)
  {
    ArrayList localArrayList = k;
    if (localArrayList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      k = localArrayList;
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
    int m = h[0];
    int n = h[1];
    float f1 = d;
    return a.a(m, n, f1);
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
    Object localObject1 = a;
    Object localObject2 = g;
    ((Handler)localObject1).removeCallbacks((Runnable)localObject2);
    localObject1 = j;
    if (localObject1 != null)
    {
      localObject1 = j;
      int n = ((ArrayList)localObject1).size();
      while (m < n)
      {
        localObject2 = j;
        ((ArrayList)localObject2).get(m);
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
    boolean bool = c;
    if (bool)
    {
      c = false;
      Handler localHandler = a;
      Runnable localRunnable = g;
      localHandler.removeCallbacks(localRunnable);
      int m = 1065353216;
      float f1 = 1.0F;
      d = f1;
      h();
      i();
    }
  }
  
  final void h()
  {
    Object localObject = k;
    if (localObject != null)
    {
      int m = 0;
      localObject = null;
      int n = k.size();
      for (int i1 = 0; i1 < n; i1 = m)
      {
        localObject = (q.e.b)k.get(i1);
        ((q.e.b)localObject).a();
        m = i1 + 1;
      }
    }
  }
  
  final void i()
  {
    Object localObject = j;
    if (localObject != null)
    {
      int m = 0;
      localObject = null;
      int n = j.size();
      for (int i1 = 0; i1 < n; i1 = m)
      {
        localObject = (q.e.a)j.get(i1);
        ((q.e.a)localObject).a();
        m = i1 + 1;
      }
    }
  }
}


/* Location:              android/support/design/widget/r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */