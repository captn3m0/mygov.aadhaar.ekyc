package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class cm
  implements Parcelable.Creator<cl>
{
  static void a(cl paramcl, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.a(paramParcel, 2, paramcl.a());
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/cm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */