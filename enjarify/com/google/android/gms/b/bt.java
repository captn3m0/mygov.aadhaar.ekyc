package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class bt
  implements Parcelable.Creator
{
  static void a(bs parambs, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    int j = 1;
    int k = a;
    c.b(paramParcel, j, k);
    k = 2;
    byte[] arrayOfByte = c;
    if (arrayOfByte != null) {}
    for (arrayOfByte = c;; arrayOfByte = gb.a(b))
    {
      c.a(paramParcel, k, arrayOfByte);
      c.b(paramParcel, i);
      return;
    }
  }
}


/* Location:              com/google/android/gms/b/bt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */