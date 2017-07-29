package com.google.android.gms.ads.internal;

import android.os.Handler;
import com.google.android.gms.b.ih;
import com.google.android.gms.b.tp;
import java.lang.ref.WeakReference;

public final class t
{
  ih a;
  boolean b = false;
  private final t.a c;
  private final Runnable d;
  private boolean e = false;
  private long f = 0L;
  
  public t(a parama)
  {
    this(parama, locala);
  }
  
  private t(a parama, t.a parama1)
  {
    c = parama1;
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(parama);
    t.1 local1 = new com/google/android/gms/ads/internal/t$1;
    local1.<init>(this, localWeakReference);
    d = local1;
  }
  
  public final void a()
  {
    b = false;
    t.a locala = c;
    Runnable localRunnable = d;
    locala.a(localRunnable);
  }
  
  public final void a(ih paramih)
  {
    a(paramih, 60000L);
  }
  
  public final void a(ih paramih, long paramLong)
  {
    boolean bool = b;
    Object localObject1;
    if (bool)
    {
      localObject1 = "An ad refresh is already scheduled.";
      tp.e((String)localObject1);
    }
    for (;;)
    {
      return;
      a = paramih;
      b = true;
      f = paramLong;
      bool = e;
      if (!bool)
      {
        int i = 65;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>(i);
        tp.d("Scheduling ad refresh " + paramLong + " milliseconds from now.");
        localObject1 = c;
        localObject2 = d;
        localObject1 = a;
        ((Handler)localObject1).postDelayed((Runnable)localObject2, paramLong);
      }
    }
  }
  
  public final void b()
  {
    e = true;
    boolean bool = b;
    if (bool)
    {
      t.a locala = c;
      Runnable localRunnable = d;
      locala.a(localRunnable);
    }
  }
  
  public final void c()
  {
    e = false;
    boolean bool = b;
    if (bool)
    {
      b = false;
      ih localih = a;
      long l = f;
      a(localih, l);
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/t.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */