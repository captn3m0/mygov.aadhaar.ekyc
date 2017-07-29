package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class cb
  implements Parcelable.Creator
{
  static void a(ca paramca, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    String str = a;
    c.a(paramParcel, 2, str);
    str = b;
    c.a(paramParcel, 3, str);
    str = c;
    c.a(paramParcel, 4, str);
    str = d;
    c.a(paramParcel, 5, str);
    long l = e;
    c.a(paramParcel, 6, l);
    l = f;
    c.a(paramParcel, 7, l);
    str = g;
    c.a(paramParcel, 8, str);
    boolean bool = h;
    c.a(paramParcel, 9, bool);
    bool = paramca.i;
    c.a(paramParcel, 10, bool);
    l = paramca.j;
    c.a(paramParcel, 11, l);
    str = k;
    c.a(paramParcel, 12, str);
    l = paramca.l;
    c.a(paramParcel, 13, l);
    l = m;
    c.a(paramParcel, 14, l);
    int j = n;
    c.b(paramParcel, 15, j);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/cb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */