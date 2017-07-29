package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;

final class cz$1
  implements Runnable
{
  cz$1(dc paramdc, long paramLong, Bundle paramBundle, Context paramContext, cu paramcu) {}
  
  public final void run()
  {
    long l1 = 0L;
    Object localObject1 = a.j();
    Object localObject2 = a.o().x();
    String str = "_fot";
    localObject1 = ((cg)localObject1).c((String)localObject2, str);
    if (localObject1 != null)
    {
      localObject2 = e;
      boolean bool1 = localObject2 instanceof Long;
      if (bool1) {
        localObject1 = (Long)e;
      }
    }
    for (long l2 = ((Long)localObject1).longValue();; l2 = l1)
    {
      long l3 = b;
      boolean bool2 = l2 < l1;
      if (bool2)
      {
        bool2 = l3 < l2;
        if (bool2)
        {
          bool2 = l3 < l1;
          if (bool2) {}
        }
        else
        {
          l3 = 1L;
        }
      }
      for (l2 -= l3;; l2 = l3)
      {
        boolean bool3 = l2 < l1;
        if (bool3)
        {
          Bundle localBundle = c;
          localObject3 = "click_timestamp";
          localBundle.putLong((String)localObject3, l2);
        }
        localObject1 = AppMeasurement.getInstance(d);
        Object localObject3 = c;
        ((AppMeasurement)localObject1).logEventInternal("auto", "_cmp", (Bundle)localObject3);
        e.g.a("Install campaign recorded");
        return;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/cz$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */