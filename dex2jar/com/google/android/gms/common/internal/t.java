package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class t
  implements Parcelable.Creator<s>
{
  static void a(s params, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, a);
    c.b(paramParcel, 2, b);
    c.b(paramParcel, 3, c);
    c.a(paramParcel, 4, d);
    c.a(paramParcel, 5, e);
    c.a(paramParcel, 6, f, paramInt);
    c.a(paramParcel, 7, g);
    c.a(paramParcel, 8, h, paramInt);
    c.a(paramParcel, 10, params.i, paramInt);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/common/internal/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */