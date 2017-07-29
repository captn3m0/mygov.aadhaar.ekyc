package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class lf
  implements Parcelable.Creator<le>
{
  static void a(le paramle, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, a);
    c.a(paramParcel, 2, b);
    c.b(paramParcel, 3, c);
    c.a(paramParcel, 4, d);
    c.b(paramParcel, 5, e);
    c.a(paramParcel, 6, f, paramInt);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/lf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */