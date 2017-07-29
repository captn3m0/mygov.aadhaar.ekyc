package com.google.android.gms.b;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

public final class as
  extends k
  implements h
{
  j a;
  as b;
  volatile i c;
  d d;
  final Object e;
  Status f;
  final WeakReference g;
  final as.a h;
  boolean i;
  
  private boolean a()
  {
    com.google.android.gms.common.api.c localc = (com.google.android.gms.common.api.c)g.get();
    i locali = c;
    boolean bool;
    if ((locali != null) && (localc != null)) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localc = null;
    }
  }
  
  final void a(Status paramStatus)
  {
    synchronized (e)
    {
      f = paramStatus;
      Status localStatus = f;
      b(localStatus);
      return;
    }
  }
  
  public final void a(g paramg)
  {
    synchronized (e)
    {
      Object localObject2 = paramg.a();
      boolean bool = ((Status)localObject2).b();
      if (bool)
      {
        localObject2 = a;
        if (localObject2 != null)
        {
          localObject2 = am.a();
          as.1 local1 = new com/google/android/gms/b/as$1;
          local1.<init>(this, paramg);
          ((ExecutorService)localObject2).submit(local1);
        }
        for (;;)
        {
          return;
          bool = a();
          if (bool) {
            localObject2 = c;
          }
        }
      }
      localObject2 = paramg.a();
      a((Status)localObject2);
    }
  }
  
  final void b(Status paramStatus)
  {
    synchronized (e)
    {
      Object localObject2 = a;
      if (localObject2 != null)
      {
        localObject2 = "onFailure must not return null";
        com.google.android.gms.common.internal.c.a(paramStatus, localObject2);
        localObject2 = b;
        ((as)localObject2).a(paramStatus);
      }
      boolean bool;
      do
      {
        return;
        bool = a();
      } while (!bool);
      localObject2 = c;
    }
  }
}


/* Location:              com/google/android/gms/b/as.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */