package com.google.android.gms.b;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class ax
  implements Executor
{
  private final Handler a;
  
  public ax(Looper paramLooper)
  {
    Handler localHandler = new android/os/Handler;
    localHandler.<init>(paramLooper);
    a = localHandler;
  }
  
  public final void execute(Runnable paramRunnable)
  {
    a.post(paramRunnable);
  }
}


/* Location:              com/google/android/gms/b/ax.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */