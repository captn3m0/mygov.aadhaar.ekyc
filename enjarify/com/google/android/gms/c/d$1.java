package com.google.android.gms.c;

import java.util.concurrent.Callable;

public final class d$1
  implements Runnable
{
  public d$1(h paramh, Callable paramCallable) {}
  
  public final void run()
  {
    try
    {
      h localh = a;
      localObject = b;
      localObject = ((Callable)localObject).call();
      localh.a(localObject);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject = a;
        ((h)localObject).a(localException);
      }
    }
  }
}


/* Location:              com/google/android/gms/c/d$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */