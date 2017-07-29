package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class lf
  implements Parcelable.Creator
{
  static void a(le paramle, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    int j = a;
    c.b(paramParcel, 1, j);
    boolean bool1 = b;
    c.a(paramParcel, 2, bool1);
    int k = c;
    c.b(paramParcel, 3, k);
    boolean bool2 = d;
    c.a(paramParcel, 4, bool2);
    int m = e;
    c.b(paramParcel, 5, m);
    jt localjt = f;
    c.a(paramParcel, 6, localjt, paramInt);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/lf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */