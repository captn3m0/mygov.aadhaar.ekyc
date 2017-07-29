package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class co
  implements Parcelable.Creator<cn>
{
  static void a(cn paramcn, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.a(paramParcel, 2, a);
    c.a(paramParcel, 3, b, paramInt);
    c.a(paramParcel, 4, c);
    c.a(paramParcel, 5, d);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/co.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */