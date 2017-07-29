package com.google.android.gms.b;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

final class ur$1
  implements Runnable
{
  ur$1(up paramup, ur.a parama, us paramus) {}
  
  public final void run()
  {
    try
    {
      up localup1 = a;
      Object localObject1 = b;
      Object localObject2 = c;
      localObject2 = ((us)localObject2).get();
      localObject1 = ((ur.a)localObject1).a(localObject2);
      localup1.b(localObject1);
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;)
      {
        up localup2 = a;
        boolean bool = true;
        localup2.cancel(bool);
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
    catch (CancellationException localCancellationException)
    {
      for (;;) {}
    }
  }
}


/* Location:              com/google/android/gms/b/ur$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */