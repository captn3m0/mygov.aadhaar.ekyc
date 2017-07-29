package com.google.android.gms.ads.internal.purchase;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.a.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class a
  implements Parcelable.Creator
{
  static void a(GInAppPurchaseManagerInfoParcel paramGInAppPurchaseManagerInfoParcel, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    IBinder localIBinder = b.a(a).asBinder();
    c.a(paramParcel, 3, localIBinder);
    localIBinder = b.a(b).asBinder();
    c.a(paramParcel, 4, localIBinder);
    localIBinder = b.a(c).asBinder();
    c.a(paramParcel, 5, localIBinder);
    localIBinder = b.a(d).asBinder();
    c.a(paramParcel, 6, localIBinder);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/ads/internal/purchase/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */