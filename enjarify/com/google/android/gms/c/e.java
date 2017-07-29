package com.google.android.gms.c;

import java.util.concurrent.Executor;

final class e
  implements f
{
  final Object a;
  a b;
  private final Executor c;
  
  public e(Executor paramExecutor, a parama)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
    c = paramExecutor;
    b = parama;
  }
  
  public final void a(b paramb)
  {
    synchronized (a)
    {
      Object localObject2 = b;
      if (localObject2 == null) {
        return;
      }
      localObject2 = c;
      ??? = new com/google/android/gms/c/e$1;
      ((e.1)???).<init>(this, paramb);
      ((Executor)localObject2).execute((Runnable)???);
    }
  }
}


/* Location:              com/google/android/gms/c/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */