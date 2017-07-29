package com.google.android.gms.b;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.a;
import com.google.android.gms.common.internal.o.b;
import com.google.android.gms.common.internal.o.c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class bo$a
  implements o.b, o.c
{
  protected bp a;
  private final String b;
  private final String c;
  private final LinkedBlockingQueue d;
  private final HandlerThread e;
  
  public bo$a(Context paramContext, String paramString1, String paramString2)
  {
    b = paramString1;
    c = paramString2;
    Object localObject = new android/os/HandlerThread;
    ((HandlerThread)localObject).<init>("GassClient");
    e = ((HandlerThread)localObject);
    e.start();
    localObject = new com/google/android/gms/b/bp;
    Looper localLooper = e.getLooper();
    ((bp)localObject).<init>(paramContext, localLooper, this, this);
    a = ((bp)localObject);
    localObject = new java/util/concurrent/LinkedBlockingQueue;
    ((LinkedBlockingQueue)localObject).<init>();
    d = ((LinkedBlockingQueue)localObject);
    a.f_();
  }
  
  private bu c()
  {
    try
    {
      localObject1 = a;
      localObject1 = ((bp)localObject1).n();
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2 = null;
      }
    }
    catch (DeadObjectException localDeadObjectException)
    {
      for (;;) {}
    }
    return (bu)localObject1;
  }
  
  private void d()
  {
    bp localbp = a;
    if (localbp != null)
    {
      localbp = a;
      boolean bool = localbp.b();
      if (!bool)
      {
        localbp = a;
        bool = localbp.c();
        if (!bool) {}
      }
      else
      {
        localbp = a;
        localbp.a();
      }
    }
  }
  
  public final void a()
  {
    Object localObject1 = c();
    if (localObject1 != null) {}
    for (;;)
    {
      try
      {
        localObject3 = new com/google/android/gms/b/bq;
        localObject4 = b;
        String str = c;
        ((bq)localObject3).<init>((String)localObject4, str);
        localObject3 = ((bu)localObject1).a((bq)localObject3);
        localObject1 = b;
        if (localObject1 != null)
        {
          i = 1;
          if (i != 0) {}
        }
      }
      finally
      {
        Object localObject3;
        Object localObject4;
        int i;
        int j;
        d();
        HandlerThread localHandlerThread = e;
        localHandlerThread.quit();
        continue;
      }
      try
      {
        localObject1 = c;
        localObject4 = new com/google/android/gms/b/bf$a;
        ((bf.a)localObject4).<init>();
        j = localObject1.length;
        localObject1 = gb.a((gb)localObject4, (byte[])localObject1, j);
        localObject1 = (bf.a)localObject1;
        b = ((bf.a)localObject1);
        i = 0;
        localObject1 = null;
        c = null;
        ((bs)localObject3).a();
        localObject1 = b;
        localObject3 = d;
        ((LinkedBlockingQueue)localObject3).put(localObject1);
        d();
        localObject1 = e;
        ((HandlerThread)localObject1).quit();
        return;
      }
      catch (ga localga)
      {
        localObject3 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject3).<init>(localga);
        throw ((Throwable)localObject3);
      }
      i = 0;
      localObject1 = null;
    }
  }
  
  public final void a(int paramInt)
  {
    try
    {
      LinkedBlockingQueue localLinkedBlockingQueue = d;
      bf.a locala = new com/google/android/gms/b/bf$a;
      locala.<init>();
      localLinkedBlockingQueue.put(locala);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public final void a(a parama)
  {
    try
    {
      LinkedBlockingQueue localLinkedBlockingQueue = d;
      bf.a locala = new com/google/android/gms/b/bf$a;
      locala.<init>();
      localLinkedBlockingQueue.put(locala);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public final bf.a b()
  {
    try
    {
      localObject1 = d;
      long l = 5000L;
      TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
      localObject1 = ((LinkedBlockingQueue)localObject1).poll(l, localTimeUnit);
      localObject1 = (bf.a)localObject1;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2 = null;
      }
    }
    if (localObject1 == null)
    {
      localObject1 = new com/google/android/gms/b/bf$a;
      ((bf.a)localObject1).<init>();
    }
    return (bf.a)localObject1;
  }
}


/* Location:              com/google/android/gms/b/bo$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */