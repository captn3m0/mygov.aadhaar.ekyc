package com.google.android.gms.ads.internal;

import com.google.android.gms.b.md;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.vc;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class p$4
  implements md
{
  p$4(CountDownLatch paramCountDownLatch) {}
  
  public final void a(vc paramvc, Map paramMap)
  {
    tp.e("Adapter returned an ad, but assets substitution failed");
    a.countDown();
    paramvc.destroy();
  }
}


/* Location:              com/google/android/gms/ads/internal/p$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */