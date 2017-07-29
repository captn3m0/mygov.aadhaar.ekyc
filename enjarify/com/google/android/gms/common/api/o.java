package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class o
  implements Parcelable.Creator
{
  static void a(Scope paramScope, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    int j = a;
    c.b(paramParcel, 1, j);
    String str = b;
    c.a(paramParcel, 2, str);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/common/api/o.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */