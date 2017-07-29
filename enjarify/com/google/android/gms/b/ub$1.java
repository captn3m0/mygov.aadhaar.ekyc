package com.google.android.gms.b;

final class ub$1
  implements Runnable
{
  ub$1(ub paramub) {}
  
  public final void run()
  {
    Object localObject1 = a.b;
    Object localObject2 = "Suspending the looper thread";
    try
    {
      tp.a((String)localObject2);
      for (;;)
      {
        localObject2 = a;
        int i = a;
        if (i != 0) {
          break;
        }
        try
        {
          localObject2 = a;
          localObject2 = b;
          localObject2.wait();
          localObject2 = "Looper thread resumed";
          tp.a((String)localObject2);
        }
        catch (InterruptedException localInterruptedException)
        {
          String str = "Looper thread interrupted.";
          tp.a(str);
        }
      }
    }
    finally {}
  }
}


/* Location:              com/google/android/gms/b/ub$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */