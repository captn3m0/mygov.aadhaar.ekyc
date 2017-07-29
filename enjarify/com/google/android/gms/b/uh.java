package com.google.android.gms.b;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import com.google.android.gms.ads.internal.w;
import java.util.concurrent.Callable;

public final class uh
{
  public static Object a(Callable paramCallable)
  {
    localThreadPolicy = StrictMode.getThreadPolicy();
    try
    {
      localObject1 = new android/os/StrictMode$ThreadPolicy$Builder;
      ((StrictMode.ThreadPolicy.Builder)localObject1).<init>(localThreadPolicy);
      localObject1 = ((StrictMode.ThreadPolicy.Builder)localObject1).permitDiskReads();
      localObject1 = ((StrictMode.ThreadPolicy.Builder)localObject1).permitDiskWrites();
      localObject1 = ((StrictMode.ThreadPolicy.Builder)localObject1).build();
      StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)localObject1);
      localObject1 = paramCallable.call();
      StrictMode.setThreadPolicy(localThreadPolicy);
    }
    finally
    {
      for (;;)
      {
        Object localObject1;
        Object localObject4 = "Unexpected exception.";
        try
        {
          tp.b((String)localObject4, localThrowable);
          localObject4 = w.i();
          String str = "StrictModeUtil.runWithLaxStrictMode";
          ((tj)localObject4).a(localThrowable, str);
          StrictMode.setThreadPolicy(localThreadPolicy);
          Object localObject2 = null;
        }
        finally
        {
          StrictMode.setThreadPolicy(localThreadPolicy);
        }
      }
    }
    return localObject1;
  }
}


/* Location:              com/google/android/gms/b/uh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */