package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.b.gn;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.tp;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class v$a
  extends AsyncTask
{
  private v$a(v paramv) {}
  
  private String a()
  {
    try
    {
      localObject1 = a;
      Object localObject2 = a;
      Future localFuture = v.e((v)localObject2);
      localObject2 = ke.cN;
      kd localkd = w.q();
      localObject2 = localkd.a((jz)localObject2);
      localObject2 = (Long)localObject2;
      long l = ((Long)localObject2).longValue();
      localObject2 = TimeUnit.MILLISECONDS;
      localObject2 = localFuture.get(l, (TimeUnit)localObject2);
      localObject2 = (gn)localObject2;
      v.a((v)localObject1, (gn)localObject2);
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        Object localObject1 = "Failed to load ad data";
        tp.c((String)localObject1, localInterruptedException);
      }
    }
    catch (TimeoutException localTimeoutException)
    {
      for (;;)
      {
        String str = "Timed out waiting for ad data";
        tp.e(str);
      }
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;) {}
    }
    return a.a();
  }
}


/* Location:              com/google/android/gms/ads/internal/v$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */