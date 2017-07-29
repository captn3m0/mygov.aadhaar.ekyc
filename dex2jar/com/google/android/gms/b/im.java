package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class im
  implements Parcelable.Creator<il>
{
  static void a(il paramil, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.a(paramParcel, 2, a);
    c.b(paramParcel, 3, b);
    c.b(paramParcel, 4, c);
    c.a(paramParcel, 5, d);
    c.b(paramParcel, 6, e);
    c.b(paramParcel, 7, f);
    c.a(paramParcel, 8, g, paramInt);
    c.a(paramParcel, 9, h);
    c.a(paramParcel, 10, paramil.i);
    c.a(paramParcel, 11, j);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/im.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */