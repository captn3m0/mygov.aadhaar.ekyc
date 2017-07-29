package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class o
  implements Parcelable.Creator
{
  static void a(n paramn, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    boolean bool = a;
    c.a(paramParcel, 2, bool);
    bool = b;
    c.a(paramParcel, 3, bool);
    String str = c;
    c.a(paramParcel, 4, str);
    bool = d;
    c.a(paramParcel, 5, bool);
    float f = e;
    c.a(paramParcel, 6, f);
    int j = paramn.f;
    c.b(paramParcel, 7, j);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/ads/internal/o.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */