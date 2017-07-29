package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class er
  implements Parcelable.Creator
{
  static void a(eq parameq, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    int j = a;
    c.b(paramParcel, 1, j);
    Object localObject = b;
    c.a(paramParcel, 2, (Parcelable)localObject, paramInt);
    localObject = c;
    c.a(paramParcel, 3, (Parcelable)localObject, paramInt);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/er.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */