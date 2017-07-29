package com.google.android.gms.b;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.h;
import com.google.android.gms.ads.internal.w;

final class or$3
  implements Runnable
{
  or$3(or paramor, AdOverlayInfoParcel paramAdOverlayInfoParcel) {}
  
  public final void run()
  {
    w.c();
    Activity localActivity = or.b(b);
    AdOverlayInfoParcel localAdOverlayInfoParcel = a;
    h.a(localActivity, localAdOverlayInfoParcel, true);
  }
}


/* Location:              com/google/android/gms/b/or$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */