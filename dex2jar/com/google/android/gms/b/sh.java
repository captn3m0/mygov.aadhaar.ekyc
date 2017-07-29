package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class sh
  implements Parcelable.Creator<sg>
{
  static void a(sg paramsg, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.a(paramParcel, 2, a, paramInt);
    c.a(paramParcel, 3, b);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/sh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */