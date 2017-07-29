package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class l
  implements Parcelable.Creator<k>
{
  static void a(k paramk, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.a(paramParcel, 1, a);
    c.b(paramParcel, 2, b);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/common/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */