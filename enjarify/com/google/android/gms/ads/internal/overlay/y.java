package com.google.android.gms.ads.internal.overlay;

import com.google.android.gms.ads.internal.w;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import java.util.concurrent.TimeUnit;

public final class y
{
  final long a;
  long b;
  boolean c;
  
  y()
  {
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    jz localjz = ke.B;
    long l1 = ((Long)w.q().a(localjz)).longValue();
    long l2 = localTimeUnit.toNanos(l1);
    a = l2;
    c = true;
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/y.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */