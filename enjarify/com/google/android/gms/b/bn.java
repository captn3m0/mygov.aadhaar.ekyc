package com.google.android.gms.b;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.util.concurrent.Callable;

public final class bn
{
  public static Object a(Callable paramCallable)
  {
    localThreadPolicy = StrictMode.getThreadPolicy();
    try
    {
      localObject1 = StrictMode.ThreadPolicy.LAX;
      StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)localObject1);
      localObject1 = paramCallable.call();
      StrictMode.setThreadPolicy(localThreadPolicy);
    }
    finally
    {
      for (;;)
      {
        Object localObject1;
        StrictMode.setThreadPolicy(localThreadPolicy);
        Object localObject3 = null;
      }
    }
    return localObject1;
  }
}


/* Location:              com/google/android/gms/b/bn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */