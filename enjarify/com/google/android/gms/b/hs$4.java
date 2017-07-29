package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.a;
import com.google.android.gms.common.internal.o.c;

final class hs$4
  implements o.c
{
  hs$4(hs paramhs) {}
  
  public final void a(a parama)
  {
    Object localObject1 = a;
    synchronized (b)
    {
      localObject1 = a;
      d = null;
      localObject1 = a;
      localObject1 = c;
      if (localObject1 != null)
      {
        localObject1 = a;
        c = null;
        localObject1 = w.u();
        ((ub)localObject1).b();
      }
      localObject1 = a;
      localObject1 = b;
      localObject1.notifyAll();
      return;
    }
  }
}


/* Location:              com/google/android/gms/b/hs$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */