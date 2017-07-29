package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class sh
  implements Parcelable.Creator
{
  static void a(sg paramsg, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    Object localObject = a;
    c.a(paramParcel, 2, (Parcelable)localObject, paramInt);
    localObject = b;
    c.a(paramParcel, 3, (String)localObject);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/sh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */