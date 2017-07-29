package com.google.android.gms.b;

import java.util.concurrent.atomic.AtomicBoolean;

final class pr$1
  implements Runnable
{
  pr$1(pr parampr) {}
  
  public final void run()
  {
    Object localObject = a.g;
    boolean bool = ((AtomicBoolean)localObject).get();
    if (!bool) {}
    for (;;)
    {
      return;
      tp.c("Timed out waiting for WebView to finish loading.");
      localObject = a;
      ((pr)localObject).b();
    }
  }
}


/* Location:              com/google/android/gms/b/pr$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */