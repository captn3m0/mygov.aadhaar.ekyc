package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class br
  implements Parcelable.Creator
{
  static void a(bq parambq, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    int j = a;
    c.b(paramParcel, 1, j);
    String str = b;
    c.a(paramParcel, 2, str);
    str = c;
    c.a(paramParcel, 3, str);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/br.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */