package com.google.android.gms.ads.internal;

import com.google.android.gms.b.qv;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.up;
import com.google.android.gms.b.us;

final class b$4
  implements Runnable
{
  b$4(us paramus, up paramup, boolean paramBoolean1, boolean paramBoolean2) {}
  
  public final void run()
  {
    boolean bool1 = false;
    for (;;)
    {
      try
      {
        localObject1 = a;
        bool2 = ((us)localObject1).isDone();
        if (!bool2) {
          continue;
        }
        localObject1 = a;
        localObject1 = ((us)localObject1).get();
        localObject1 = (Boolean)localObject1;
        bool2 = ((Boolean)localObject1).booleanValue();
        bool1 = bool2;
      }
      catch (InterruptedException localInterruptedException)
      {
        Object localObject1;
        boolean bool2;
        boolean bool3;
        boolean bool4;
        Thread localThread = Thread.currentThread();
        localThread.interrupt();
        continue;
      }
      catch (Exception localException)
      {
        Object localObject2 = "Error receiving app streaming support";
        tp.b((String)localObject2, localException);
        continue;
      }
      localObject1 = b;
      localObject2 = new com/google/android/gms/b/qv;
      bool3 = c;
      bool4 = d;
      ((qv)localObject2).<init>(bool3, bool4, bool1);
      ((up)localObject1).b(localObject2);
      return;
      bool2 = false;
      localObject1 = null;
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/b$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */