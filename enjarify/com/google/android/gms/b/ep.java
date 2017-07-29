package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.c;

public final class ep
  implements Parcelable.Creator
{
  static void a(eo parameo, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    int j = a;
    c.b(paramParcel, 1, j);
    d locald = b;
    c.a(paramParcel, 2, locald, paramInt);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/ep.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */