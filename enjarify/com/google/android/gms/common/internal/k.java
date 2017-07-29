package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class k
  implements Parcelable.Creator
{
  static void a(j paramj, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    int j = a;
    c.b(paramParcel, 1, j);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/common/internal/k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */