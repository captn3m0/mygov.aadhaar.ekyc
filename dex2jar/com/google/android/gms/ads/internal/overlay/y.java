package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.qi;
import java.util.concurrent.TimeUnit;

@qi
@TargetApi(14)
public final class y
{
  final long a;
  long b;
  boolean c;
  
  y()
  {
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    jz localjz = ke.B;
    a = localTimeUnit.toNanos(((Long)w.q().a(localjz)).longValue());
    c = true;
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */