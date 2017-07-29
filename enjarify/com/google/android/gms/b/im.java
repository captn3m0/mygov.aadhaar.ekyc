package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class im
  implements Parcelable.Creator
{
  static void a(il paramil, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    Object localObject = a;
    c.a(paramParcel, 2, (String)localObject);
    int j = b;
    c.b(paramParcel, 3, j);
    j = c;
    c.b(paramParcel, 4, j);
    boolean bool1 = d;
    c.a(paramParcel, 5, bool1);
    int k = e;
    c.b(paramParcel, 6, k);
    k = f;
    c.b(paramParcel, 7, k);
    localObject = g;
    c.a(paramParcel, 8, (Parcelable[])localObject, paramInt);
    boolean bool2 = h;
    c.a(paramParcel, 9, bool2);
    bool2 = paramil.i;
    c.a(paramParcel, 10, bool2);
    bool2 = paramil.j;
    c.a(paramParcel, 11, bool2);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/im.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */