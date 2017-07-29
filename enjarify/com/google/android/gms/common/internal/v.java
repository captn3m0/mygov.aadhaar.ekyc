package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class v
  implements Handler.Callback
{
  public final v.a a;
  public final ArrayList b;
  public final ArrayList c;
  public final ArrayList d;
  public volatile boolean e;
  public final AtomicInteger f;
  public boolean g;
  public final Handler h;
  public final Object i;
  
  public v(Looper paramLooper, v.a parama)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    b = ((ArrayList)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    c = ((ArrayList)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    d = ((ArrayList)localObject);
    e = false;
    localObject = new java/util/concurrent/atomic/AtomicInteger;
    ((AtomicInteger)localObject).<init>(0);
    f = ((AtomicInteger)localObject);
    g = false;
    localObject = new java/lang/Object;
    localObject.<init>();
    i = localObject;
    a = parama;
    localObject = new android/os/Handler;
    ((Handler)localObject).<init>(paramLooper, this);
    h = ((Handler)localObject);
  }
  
  public final void a()
  {
    e = false;
    f.incrementAndGet();
  }
  
  public final void a(c.c paramc)
  {
    c.a(paramc);
    synchronized (i)
    {
      Object localObject2 = d;
      boolean bool = ((ArrayList)localObject2).contains(paramc);
      if (bool)
      {
        localObject2 = "GmsClientEvents";
        Object localObject4 = String.valueOf(paramc);
        Object localObject5 = String.valueOf(localObject4);
        int j = ((String)localObject5).length() + 67;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(j);
        localObject5 = "registerConnectionFailedListener(): listener ";
        localObject5 = localStringBuilder.append((String)localObject5);
        localObject4 = ((StringBuilder)localObject5).append((String)localObject4);
        localObject5 = " is already registered";
        localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
        localObject4 = ((StringBuilder)localObject4).toString();
        Log.w((String)localObject2, (String)localObject4);
        return;
      }
      localObject2 = d;
      ((ArrayList)localObject2).add(paramc);
    }
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    int j = 1;
    int k = what;
    if (k == j) {}
    Object localObject2;
    for (c.b localb = (c.b)obj;; localObject2 = null)
    {
      synchronized (i)
      {
        boolean bool = e;
        if (bool)
        {
          localObject4 = a;
          bool = ((v.a)localObject4).b();
          if (bool)
          {
            localObject4 = b;
            bool = ((ArrayList)localObject4).contains(localb);
            if (bool)
            {
              bool = false;
              localObject4 = null;
              localb.a(null);
            }
          }
        }
        k = j;
        return k;
      }
      j = what;
      int n = 45;
      Object localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>(n);
      String str = "Don't know how to handle message: " + j;
      ??? = new java/lang/Exception;
      ((Exception)???).<init>();
      Log.wtf("GmsClientEvents", str, (Throwable)???);
      int m = 0;
    }
  }
}


/* Location:              com/google/android/gms/common/internal/v.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */