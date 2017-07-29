package com.google.android.gms.ads.internal.overlay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class i
  implements Parcelable.Creator<AdOverlayInfoParcel>
{
  static void a(AdOverlayInfoParcel paramAdOverlayInfoParcel, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.a(paramParcel, 2, a, paramInt);
    c.a(paramParcel, 3, b.a(b).asBinder());
    c.a(paramParcel, 4, b.a(c).asBinder());
    c.a(paramParcel, 5, b.a(d).asBinder());
    c.a(paramParcel, 6, b.a(e).asBinder());
    c.a(paramParcel, 7, f);
    c.a(paramParcel, 8, g);
    c.a(paramParcel, 9, h);
    c.a(paramParcel, 10, b.a(paramAdOverlayInfoParcel.i).asBinder());
    c.b(paramParcel, 11, j);
    c.b(paramParcel, 12, k);
    c.a(paramParcel, 13, l);
    c.a(paramParcel, 14, m, paramInt);
    c.a(paramParcel, 15, b.a(n).asBinder());
    c.a(paramParcel, 16, o);
    c.a(paramParcel, 17, p, paramInt);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */