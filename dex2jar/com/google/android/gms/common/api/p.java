package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class p
  implements Parcelable.Creator<Status>
{
  static void a(Status paramStatus, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramStatus.i);
    c.a(paramParcel, 2, j);
    c.a(paramParcel, 3, k, paramInt);
    c.b(paramParcel, 1000, h);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/common/api/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */