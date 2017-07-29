package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class j
  implements Parcelable.Creator
{
  static void a(a parama, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    int j = b;
    c.b(paramParcel, 1, j);
    j = c;
    c.b(paramParcel, 2, j);
    Object localObject = d;
    c.a(paramParcel, 3, (Parcelable)localObject, paramInt);
    localObject = e;
    c.a(paramParcel, 4, (String)localObject);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/common/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */