package com.google.android.gms.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.o;
import java.util.concurrent.Callable;

final class ke$1
  implements Callable
{
  ke$1(Context paramContext) {}
  
  private Void a()
  {
    Object localObject1 = w.q();
    Object localObject2 = a;
    boolean bool1 = c;
    if (!bool1) {}
    for (;;)
    {
      synchronized (a)
      {
        boolean bool2 = c;
        if (bool2) {
          return null;
        }
      }
      try
      {
        localObject2 = o.f((Context)localObject2);
        if (localObject2 == null)
        {
          localObject2 = b;
          ((ConditionVariable)localObject2).open();
          continue;
          localObject3 = finally;
          throw ((Throwable)localObject3);
        }
        w.o();
        String str = "google_ads_flags";
        int i = 1;
        Object localObject4 = ((Context)localObject3).getSharedPreferences(str, i);
        d = ((SharedPreferences)localObject4);
        boolean bool3 = true;
        c = bool3;
        localObject4 = b;
        ((ConditionVariable)localObject4).open();
      }
      finally
      {
        localObject1 = b;
        ((ConditionVariable)localObject1).open();
      }
    }
  }
}


/* Location:              com/google/android/gms/b/ke$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */