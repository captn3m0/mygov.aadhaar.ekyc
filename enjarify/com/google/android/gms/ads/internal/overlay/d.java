package com.google.android.gms.ads.internal.overlay;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class d
  implements Parcelable.Creator
{
  static void a(e parame, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    Object localObject = a;
    c.a(paramParcel, 2, (String)localObject);
    localObject = b;
    c.a(paramParcel, 3, (String)localObject);
    localObject = c;
    c.a(paramParcel, 4, (String)localObject);
    localObject = d;
    c.a(paramParcel, 5, (String)localObject);
    localObject = e;
    c.a(paramParcel, 6, (String)localObject);
    localObject = f;
    c.a(paramParcel, 7, (String)localObject);
    localObject = g;
    c.a(paramParcel, 8, (String)localObject);
    localObject = h;
    c.a(paramParcel, 9, (Parcelable)localObject, paramInt);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */