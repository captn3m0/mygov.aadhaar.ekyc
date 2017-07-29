package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class er
  implements Parcelable.Creator<eq>
{
  static void a(eq parameq, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, a);
    c.a(paramParcel, 2, b, paramInt);
    c.a(paramParcel, 3, c, paramInt);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/er.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */