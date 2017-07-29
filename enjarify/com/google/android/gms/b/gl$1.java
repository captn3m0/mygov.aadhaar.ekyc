package com.google.android.gms.b;

import java.util.concurrent.BlockingQueue;

final class gl$1
  implements Runnable
{
  gl$1(gl paramgl, pc parampc) {}
  
  public final void run()
  {
    try
    {
      Object localObject = b;
      localObject = gl.a((gl)localObject);
      pc localpc = a;
      ((BlockingQueue)localObject).put(localpc);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
}


/* Location:              com/google/android/gms/b/gl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */