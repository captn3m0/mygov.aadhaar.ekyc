package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class ce
  implements Parcelable.Creator<cd>
{
  static void a(cd paramcd, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, a);
    c.a(paramParcel, 2, b);
    c.a(paramParcel, 3, c);
    c.a(paramParcel, 4, d, paramInt);
    c.a(paramParcel, 5, e);
    c.a(paramParcel, 6, f);
    c.a(paramParcel, 7, g);
    c.a(paramParcel, 8, h, paramInt);
    c.a(paramParcel, 9, paramcd.i);
    c.a(paramParcel, 10, j, paramInt);
    c.a(paramParcel, 11, k);
    c.a(paramParcel, 12, l, paramInt);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/ce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */