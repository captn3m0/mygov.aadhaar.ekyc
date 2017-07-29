package com.google.android.gms.ads.internal;

import com.google.android.gms.b.ih;
import java.lang.ref.WeakReference;

final class t$1
  implements Runnable
{
  t$1(t paramt, WeakReference paramWeakReference) {}
  
  public final void run()
  {
    Object localObject = b;
    ih localih = null;
    b = false;
    localObject = (a)a.get();
    if (localObject != null)
    {
      localih = b.a;
      ((a)localObject).c(localih);
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/t$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */