package com.google.android.gms.ads.internal.purchase;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.a.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class a
  implements Parcelable.Creator<GInAppPurchaseManagerInfoParcel>
{
  static void a(GInAppPurchaseManagerInfoParcel paramGInAppPurchaseManagerInfoParcel, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.a(paramParcel, 3, b.a(a).asBinder());
    c.a(paramParcel, 4, b.a(b).asBinder());
    c.a(paramParcel, 5, b.a(c).asBinder());
    c.a(paramParcel, 6, b.a(d).asBinder());
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/ads/internal/purchase/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */