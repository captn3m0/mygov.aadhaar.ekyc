package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.h;

final class m$a$1
  implements Runnable
{
  m$a$1(m.a parama, AdOverlayInfoParcel paramAdOverlayInfoParcel) {}
  
  public final void run()
  {
    w.c();
    Context localContext = b.a.f.c;
    AdOverlayInfoParcel localAdOverlayInfoParcel = a;
    h.a(localContext, localAdOverlayInfoParcel, true);
  }
}


/* Location:              com/google/android/gms/ads/internal/m$a$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */