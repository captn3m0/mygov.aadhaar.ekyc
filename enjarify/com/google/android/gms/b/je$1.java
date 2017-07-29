package com.google.android.gms.b;

import android.os.Handler;
import java.util.concurrent.Executor;

final class je$1
  implements Executor
{
  je$1(je paramje, Handler paramHandler) {}
  
  public final void execute(Runnable paramRunnable)
  {
    a.post(paramRunnable);
  }
}


/* Location:              com/google/android/gms/b/je$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */