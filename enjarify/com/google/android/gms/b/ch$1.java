package com.google.android.gms.b;

import android.os.Looper;

final class ch$1
  implements Runnable
{
  ch$1(ch paramch) {}
  
  public final void run()
  {
    Object localObject1 = Looper.myLooper();
    Object localObject2 = Looper.getMainLooper();
    if (localObject1 == localObject2)
    {
      localObject1 = ch.a(a).f();
      ((db)localObject1).a(this);
    }
    for (;;)
    {
      return;
      localObject1 = a;
      boolean bool = ((ch)localObject1).b();
      localObject2 = a;
      ch.b((ch)localObject2);
      if (bool)
      {
        localObject1 = a;
        bool = ch.c((ch)localObject1);
        if (bool)
        {
          localObject1 = a;
          ((ch)localObject1).a();
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/b/ch$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */