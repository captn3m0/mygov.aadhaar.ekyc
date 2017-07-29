package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class qw
  implements Parcelable.Creator
{
  static void a(qv paramqv, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    boolean bool = a;
    c.a(paramParcel, 2, bool);
    bool = b;
    c.a(paramParcel, 3, bool);
    bool = c;
    c.a(paramParcel, 4, bool);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/qw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */