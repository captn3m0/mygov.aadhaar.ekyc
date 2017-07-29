package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class b$a
{
  final Intent a;
  private final BroadcastReceiver.PendingResult b;
  private boolean c = false;
  private final ScheduledFuture d;
  
  b$a(Intent paramIntent, BroadcastReceiver.PendingResult paramPendingResult, ScheduledExecutorService paramScheduledExecutorService)
  {
    a = paramIntent;
    b = paramPendingResult;
    Object localObject = new com/google/firebase/iid/b$a$1;
    ((b.a.1)localObject).<init>(this, paramIntent);
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    localObject = paramScheduledExecutorService.schedule((Runnable)localObject, 9500L, localTimeUnit);
    d = ((ScheduledFuture)localObject);
  }
  
  final void a()
  {
    try
    {
      boolean bool = c;
      if (!bool)
      {
        Object localObject1 = b;
        ((BroadcastReceiver.PendingResult)localObject1).finish();
        localObject1 = d;
        ((ScheduledFuture)localObject1).cancel(false);
        bool = true;
        c = bool;
      }
      return;
    }
    finally {}
  }
}


/* Location:              com/google/firebase/iid/b$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */