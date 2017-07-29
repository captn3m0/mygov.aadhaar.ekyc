package com.google.android.gms.b;

import android.content.Context;
import android.os.ConditionVariable;
import com.google.android.gms.ads.internal.w;

final class bl$1
  implements Runnable
{
  bl$1(bl parambl) {}
  
  public final void run()
  {
    Object localObject1 = a.b;
    if (localObject1 != null) {}
    for (;;)
    {
      return;
      synchronized (bl.b())
      {
        localObject1 = a;
        localObject1 = b;
        if (localObject1 == null) {}
      }
      Object localObject3 = ke.bH;
      Object localObject6 = w.q();
      localObject3 = ((kd)localObject6).a((jz)localObject3);
      localObject3 = (Boolean)localObject3;
      bool = ((Boolean)localObject3).booleanValue();
      if (bool) {}
      try
      {
        localObject6 = new com/google/android/gms/b/vz;
        Object localObject7 = a;
        localObject7 = bl.a((bl)localObject7);
        localObject7 = ((eu)localObject7).a();
        String str = "ADSHIELD";
        ((vz)localObject6).<init>((Context)localObject7, str);
        bl.a = (vz)localObject6;
      }
      finally
      {
        for (;;)
        {
          bool = false;
          Object localObject5 = null;
        }
      }
      localObject6 = a;
      localObject3 = Boolean.valueOf(bool);
      b = ((Boolean)localObject3);
      localObject3 = bl.b();
      ((ConditionVariable)localObject3).open();
    }
  }
}


/* Location:              com/google/android/gms/b/bl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */