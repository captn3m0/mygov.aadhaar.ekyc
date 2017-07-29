package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class j
  implements Parcelable.Creator<a>
{
  static void a(a parama, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, b);
    c.b(paramParcel, 2, c);
    c.a(paramParcel, 3, d, paramInt);
    c.a(paramParcel, 4, e);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/common/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */