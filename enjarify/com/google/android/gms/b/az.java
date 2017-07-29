package com.google.android.gms.b;

import android.os.Process;

final class az
  implements Runnable
{
  private final Runnable a;
  private final int b;
  
  public az(Runnable paramRunnable, int paramInt)
  {
    a = paramRunnable;
    b = paramInt;
  }
  
  public final void run()
  {
    Process.setThreadPriority(b);
    a.run();
  }
}


/* Location:              com/google/android/gms/b/az.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */