package com.google.android.gms.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class hx
  implements Parcelable.Creator
{
  static void a(hw paramhw, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    Object localObject = a;
    c.a(paramParcel, 2, (String)localObject);
    long l = b;
    c.a(paramParcel, 3, l);
    localObject = c;
    c.a(paramParcel, 4, (String)localObject);
    localObject = d;
    c.a(paramParcel, 5, (String)localObject);
    localObject = e;
    c.a(paramParcel, 6, (String)localObject);
    localObject = f;
    c.a(paramParcel, 7, (Bundle)localObject);
    boolean bool = g;
    c.a(paramParcel, 8, bool);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/hx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */