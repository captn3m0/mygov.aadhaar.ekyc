package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class k
  implements Parcelable.Creator<j>
{
  static void a(j paramj, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, a);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/common/internal/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */