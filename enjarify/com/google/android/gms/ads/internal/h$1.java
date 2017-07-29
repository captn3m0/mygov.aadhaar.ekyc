package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.b.md;
import com.google.android.gms.b.tj;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.vc;
import java.util.Map;

final class h$1
  implements md
{
  h$1(h paramh, Runnable paramRunnable) {}
  
  public final void a(vc paramvc, Map paramMap)
  {
    paramvc.b("/appSettingsFetched", this);
    Object localObject1 = b;
    Object localObject3 = a;
    Object localObject4;
    if (paramMap != null)
    {
      localObject4 = "true";
      localObject1 = "isSuccessful";
    }
    Object localObject5;
    try
    {
      localObject1 = paramMap.get(localObject1);
      localObject1 = (String)localObject1;
      boolean bool = ((String)localObject4).equalsIgnoreCase((String)localObject1);
      if (bool)
      {
        localObject1 = "appSettingsJson";
        localObject1 = paramMap.get(localObject1);
        localObject1 = (String)localObject1;
        localObject4 = w.i();
        localObject5 = b;
        localObject5 = b;
        ((tj)localObject4).a((Context)localObject5, (String)localObject1);
      }
      try
      {
        localObject1 = a;
        if (localObject1 != null)
        {
          localObject1 = a;
          ((Runnable)localObject1).run();
        }
      }
      finally
      {
        for (;;)
        {
          localObject4 = w.i();
          localObject5 = "ConfigLoader.maybeFetchNewAppSettings";
          ((tj)localObject4).a(localThrowable, (String)localObject5);
          localObject4 = "ConfigLoader post task failed.";
          tp.c((String)localObject4, localThrowable);
        }
      }
      return;
    }
    finally {}
  }
}


/* Location:              com/google/android/gms/ads/internal/h$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */