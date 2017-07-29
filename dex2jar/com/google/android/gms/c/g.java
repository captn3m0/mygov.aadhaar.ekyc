package com.google.android.gms.c;

import java.util.Queue;

final class g<TResult>
{
  final Object a = new Object();
  Queue<f<TResult>> b;
  private boolean c;
  
  public final void a(b<TResult> paramb)
  {
    for (;;)
    {
      f localf;
      synchronized (a)
      {
        if ((b == null) || (c)) {
          return;
        }
        c = true;
        synchronized (a)
        {
          localf = (f)b.poll();
          if (localf == null)
          {
            c = false;
            return;
          }
        }
      }
      localf.a(paramb);
    }
  }
}


/* Location:              com/google/android/gms/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */