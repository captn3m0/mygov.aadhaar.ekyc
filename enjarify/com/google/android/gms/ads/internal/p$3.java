package com.google.android.gms.ads.internal;

import android.view.View;
import com.google.android.gms.b.md;
import com.google.android.gms.b.vc;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class p$3
  implements md
{
  p$3(CountDownLatch paramCountDownLatch) {}
  
  public final void a(vc paramvc, Map paramMap)
  {
    a.countDown();
    paramvc.b().setVisibility(0);
  }
}


/* Location:              com/google/android/gms/ads/internal/p$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */