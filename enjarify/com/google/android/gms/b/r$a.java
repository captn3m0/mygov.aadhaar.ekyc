package com.google.android.gms.b;

import android.os.Looper;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.o.f;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

final class r$a
  implements o.f
{
  final boolean a;
  private final WeakReference b;
  private final com.google.android.gms.common.api.a c;
  
  public r$a(r paramr, com.google.android.gms.common.api.a parama, boolean paramBoolean)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramr);
    b = localWeakReference;
    c = parama;
    a = paramBoolean;
  }
  
  public final void a(com.google.android.gms.common.a parama)
  {
    boolean bool1 = false;
    com.google.android.gms.common.api.a locala = null;
    Object localObject2 = (r)b.get();
    if (localObject2 == null) {}
    for (;;)
    {
      return;
      Object localObject3 = Looper.myLooper();
      Looper localLooper = a.m.b;
      if (localObject3 == localLooper) {
        bool1 = true;
      }
      localObject3 = "onReportServiceBinding must be called on the GoogleApiClient handler thread";
      c.a(bool1, localObject3);
      b.lock();
      bool1 = false;
      locala = null;
      try
      {
        bool1 = ((r)localObject2).b(0);
        if (!bool1)
        {
          localObject2 = b;
          ((Lock)localObject2).unlock();
          continue;
        }
        bool1 = parama.b();
        if (!bool1)
        {
          locala = c;
          boolean bool2 = a;
          ((r)localObject2).b(parama, locala, bool2);
        }
        bool1 = ((r)localObject2).d();
        if (bool1) {
          ((r)localObject2).e();
        }
        localObject2 = b;
        ((Lock)localObject2).unlock();
      }
      finally
      {
        b.unlock();
      }
    }
  }
}


/* Location:              com/google/android/gms/b/r$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */