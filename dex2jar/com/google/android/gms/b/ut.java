package com.google.android.gms.b;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@qi
final class ut
{
  private final Object a = new Object();
  private final List<Runnable> b = new ArrayList();
  private final List<Runnable> c = new ArrayList();
  private boolean d = false;
  
  private static void c(Runnable paramRunnable)
  {
    uk.a.post(paramRunnable);
  }
  
  public final void a()
  {
    synchronized (a)
    {
      if (d) {
        return;
      }
      Iterator localIterator1 = b.iterator();
      if (localIterator1.hasNext()) {
        ts.a((Runnable)localIterator1.next());
      }
    }
    Iterator localIterator2 = c.iterator();
    while (localIterator2.hasNext()) {
      c((Runnable)localIterator2.next());
    }
    b.clear();
    c.clear();
    d = true;
  }
  
  public final void a(Runnable paramRunnable)
  {
    synchronized (a)
    {
      if (d)
      {
        ts.a(paramRunnable);
        return;
      }
      b.add(paramRunnable);
    }
  }
  
  public final void b(Runnable paramRunnable)
  {
    synchronized (a)
    {
      if (d)
      {
        c(paramRunnable);
        return;
      }
      c.add(paramRunnable);
    }
  }
}


/* Location:              com/google/android/gms/b/ut.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */