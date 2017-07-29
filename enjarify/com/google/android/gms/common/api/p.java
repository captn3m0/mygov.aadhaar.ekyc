package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class p
  implements Parcelable.Creator
{
  static void a(Status paramStatus, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    int j = paramStatus.i;
    c.b(paramParcel, 1, j);
    Object localObject = paramStatus.j;
    c.a(paramParcel, 2, (String)localObject);
    localObject = k;
    c.a(paramParcel, 3, (Parcelable)localObject, paramInt);
    j = h;
    c.b(paramParcel, 1000, j);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/common/api/p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */