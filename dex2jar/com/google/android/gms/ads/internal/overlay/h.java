package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.b.ib;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.un;
import com.google.android.gms.common.util.i;

@qi
public final class h
{
  public static void a(Context paramContext, AdOverlayInfoParcel paramAdOverlayInfoParcel, boolean paramBoolean)
  {
    if ((k == 4) && (c == null))
    {
      if (b != null) {
        b.e();
      }
      w.b();
      a.a(paramContext, a, i);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setClassName(paramContext, "com.google.android.gms.ads.AdActivity");
    localIntent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", m.d);
    localIntent.putExtra("shouldCallOnOverlayOpened", paramBoolean);
    AdOverlayInfoParcel.a(localIntent, paramAdOverlayInfoParcel);
    if (!i.e()) {
      localIntent.addFlags(524288);
    }
    if (!(paramContext instanceof Activity)) {
      localIntent.addFlags(268435456);
    }
    w.e();
    tt.a(paramContext, localIntent);
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */