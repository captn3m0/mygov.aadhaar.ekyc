package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class uo
  implements Parcelable.Creator<un>
{
  static void a(un paramun, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.a(paramParcel, 2, a);
    c.b(paramParcel, 3, b);
    c.b(paramParcel, 4, c);
    c.a(paramParcel, 5, d);
    c.a(paramParcel, 6, e);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/uo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */