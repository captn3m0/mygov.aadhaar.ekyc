package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class n
  implements Parcelable.Creator<m>
{
  static void a(m paramm, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, a);
    c.a(paramParcel, 2, b);
    c.a(paramParcel, 3, c, paramInt);
    c.a(paramParcel, 4, d);
    c.a(paramParcel, 5, e);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/common/internal/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */