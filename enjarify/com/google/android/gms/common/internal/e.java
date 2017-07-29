package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class e
  implements Parcelable.Creator
{
  static void a(d paramd, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    int j = a;
    c.b(paramParcel, 1, j);
    Object localObject = b;
    c.a(paramParcel, 2, (Parcelable)localObject, paramInt);
    j = c;
    c.b(paramParcel, 3, j);
    localObject = d;
    c.a(paramParcel, 4, (Parcelable)localObject, paramInt);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/common/internal/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */