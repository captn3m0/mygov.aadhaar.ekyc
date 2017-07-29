package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class wk
  implements Parcelable.Creator
{
  static void a(wj paramwj, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    String str = a;
    c.a(paramParcel, 2, str);
    int j = b;
    c.b(paramParcel, 3, j);
    j = c;
    c.b(paramParcel, 4, j);
    str = d;
    c.a(paramParcel, 5, str);
    str = e;
    c.a(paramParcel, 6, str);
    boolean bool = f;
    c.a(paramParcel, 7, bool);
    str = g;
    c.a(paramParcel, 8, str);
    bool = h;
    c.a(paramParcel, 9, bool);
    int k = paramwj.i;
    c.b(paramParcel, 10, k);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/wk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */