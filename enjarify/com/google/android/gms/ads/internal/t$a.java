package com.google.android.gms.ads.internal;

import android.os.Handler;

public final class t$a
{
  final Handler a;
  
  public t$a(Handler paramHandler)
  {
    a = paramHandler;
  }
  
  public final void a(Runnable paramRunnable)
  {
    a.removeCallbacks(paramRunnable);
  }
}


/* Location:              com/google/android/gms/ads/internal/t$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */