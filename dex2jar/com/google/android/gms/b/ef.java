package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class ef
  implements Parcelable.Creator<ee>
{
  static void a(ee paramee, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, a);
    c.b(paramParcel, 2, b);
    c.a(paramParcel, 3, c, paramInt);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/ef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */