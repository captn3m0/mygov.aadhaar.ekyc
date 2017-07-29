package com.google.android.gms.c;

import java.util.concurrent.Executor;

final class e<TResult>
  implements f<TResult>
{
  final Object a = new Object();
  a<TResult> b;
  private final Executor c;
  
  public e(Executor paramExecutor, a<TResult> parama)
  {
    c = paramExecutor;
    b = parama;
  }
  
  public final void a(final b<TResult> paramb)
  {
    synchronized (a)
    {
      if (b == null) {
        return;
      }
      c.execute(new Runnable()
      {
        public final void run()
        {
          synchronized (a)
          {
            if (b != null) {
              b.a(paramb);
            }
            return;
          }
        }
      });
      return;
    }
  }
}


/* Location:              com/google/android/gms/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */