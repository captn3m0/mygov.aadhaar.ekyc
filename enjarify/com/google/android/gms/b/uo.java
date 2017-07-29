package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class uo
  implements Parcelable.Creator
{
  static void a(un paramun, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    String str = a;
    c.a(paramParcel, 2, str);
    int j = b;
    c.b(paramParcel, 3, j);
    j = c;
    c.b(paramParcel, 4, j);
    boolean bool = d;
    c.a(paramParcel, 5, bool);
    bool = e;
    c.a(paramParcel, 6, bool);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/uo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */