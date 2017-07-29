package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Debug;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.tp;
import com.google.android.gms.common.util.c;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

final class a$1
  extends TimerTask
{
  a$1(a parama, CountDownLatch paramCountDownLatch, Timer paramTimer) {}
  
  public final void run()
  {
    Object localObject1 = ke.cv;
    Object localObject2 = w.q();
    localObject1 = (Integer)((kd)localObject2).a((jz)localObject1);
    long l1 = ((Integer)localObject1).intValue();
    Object localObject3 = a;
    long l2 = ((CountDownLatch)localObject3).getCount();
    boolean bool = l1 < l2;
    if (bool)
    {
      tp.b("Stopping method tracing");
      Debug.stopMethodTracing();
      localObject1 = a;
      l1 = ((CountDownLatch)localObject1).getCount();
      l2 = 0L;
      bool = l1 < l2;
      if (!bool)
      {
        localObject1 = b;
        ((Timer)localObject1).cancel();
      }
    }
    for (;;)
    {
      return;
      localObject1 = String.valueOf(c.f.c.getPackageName()).concat("_adsTrace_");
      localObject2 = "Starting method tracing";
      try
      {
        tp.b((String)localObject2);
        localObject2 = a;
        ((CountDownLatch)localObject2).countDown();
        localObject2 = w.k();
        l2 = ((c)localObject2).a();
        localObject2 = String.valueOf(localObject1);
        int j = ((String)localObject2).length() + 20;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(j);
        localObject1 = localStringBuilder.append((String)localObject1);
        localObject1 = ((StringBuilder)localObject1).append(l2);
        localObject2 = ((StringBuilder)localObject1).toString();
        localObject1 = ke.cw;
        localObject3 = w.q();
        localObject1 = ((kd)localObject3).a((jz)localObject1);
        localObject1 = (Integer)localObject1;
        int i = ((Integer)localObject1).intValue();
        Debug.startMethodTracing((String)localObject2, i);
      }
      catch (Exception localException)
      {
        localObject2 = "Exception occurred while starting method tracing.";
        tp.c((String)localObject2, localException);
      }
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/a$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */