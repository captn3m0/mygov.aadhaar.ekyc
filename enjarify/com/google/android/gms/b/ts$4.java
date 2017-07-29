package com.google.android.gms.b;

import java.util.concurrent.Future;

final class ts$4
  implements Runnable
{
  ts$4(up paramup, Future paramFuture) {}
  
  public final void run()
  {
    Object localObject = a;
    boolean bool1 = ((up)localObject).isCancelled();
    if (bool1)
    {
      localObject = b;
      boolean bool2 = true;
      ((Future)localObject).cancel(bool2);
    }
  }
}


/* Location:              com/google/android/gms/b/ts$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */