package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.m;
import com.google.android.gms.ads.internal.overlay.p;
import com.google.android.gms.ads.internal.overlay.q;
import com.google.android.gms.ads.internal.overlay.w;
import com.google.android.gms.b.ma;
import com.google.android.gms.b.mu;
import com.google.android.gms.b.su;
import com.google.android.gms.b.sy;

public final class e
{
  public final mu a;
  public final m b;
  public final p c;
  public final sy d;
  
  private e(mu parammu, m paramm, p paramp, sy paramsy)
  {
    a = parammu;
    b = paramm;
    c = paramp;
    d = paramsy;
  }
  
  public static e a()
  {
    e locale = new com/google/android/gms/ads/internal/e;
    ma localma = new com/google/android/gms/b/ma;
    localma.<init>();
    q localq = new com/google/android/gms/ads/internal/overlay/q;
    localq.<init>();
    w localw = new com/google/android/gms/ads/internal/overlay/w;
    localw.<init>();
    su localsu = new com/google/android/gms/b/su;
    localsu.<init>();
    locale.<init>(localma, localq, localw, localsu);
    return locale;
  }
}


/* Location:              com/google/android/gms/ads/internal/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */