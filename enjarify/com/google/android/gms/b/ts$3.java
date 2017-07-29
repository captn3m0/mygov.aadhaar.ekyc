package com.google.android.gms.b;

import android.os.Process;
import com.google.android.gms.ads.internal.w;
import java.util.concurrent.Callable;

final class ts$3
  implements Runnable
{
  ts$3(up paramup, Callable paramCallable) {}
  
  public final void run()
  {
    int i = 10;
    try
    {
      Process.setThreadPriority(i);
      up localup = a;
      localObject = b;
      localObject = ((Callable)localObject).call();
      localup.b(localObject);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject = w.i();
        String str = "AdThreadPool.submit";
        ((tj)localObject).a(localException, str);
        localObject = a;
        ((up)localObject).a(localException);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/ts$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */