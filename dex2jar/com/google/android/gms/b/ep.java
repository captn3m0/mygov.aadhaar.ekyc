package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class ep
  implements Parcelable.Creator<eo>
{
  static void a(eo parameo, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, a);
    c.a(paramParcel, 2, b, paramInt);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/ep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */