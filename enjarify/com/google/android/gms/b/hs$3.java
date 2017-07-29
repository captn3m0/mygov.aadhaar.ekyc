package com.google.android.gms.b;

import android.os.DeadObjectException;
import com.google.android.gms.common.internal.o.b;

final class hs$3
  implements o.b
{
  hs$3(hs paramhs) {}
  
  public final void a()
  {
    Object localObject1 = a;
    synchronized (b)
    {
      try
      {
        localObject1 = a;
        localObject4 = a;
        localObject4 = c;
        localObject4 = ((hv)localObject4).n();
        d = ((hz)localObject4);
      }
      catch (DeadObjectException localDeadObjectException)
      {
        for (;;)
        {
          Object localObject4 = "Unable to obtain a cache service instance.";
          tp.b((String)localObject4, localDeadObjectException);
          hs localhs = a;
          hs.a(localhs);
        }
      }
      localObject1 = a;
      localObject1 = b;
      localObject1.notifyAll();
      return;
    }
  }
  
  public final void a(int paramInt)
  {
    Object localObject1 = a;
    synchronized (b)
    {
      localObject1 = a;
      d = null;
      localObject1 = a;
      localObject1 = b;
      localObject1.notifyAll();
      return;
    }
  }
}


/* Location:              com/google/android/gms/b/hs$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */