package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class co
  implements Parcelable.Creator
{
  static void a(cn paramcn, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    Object localObject = a;
    c.a(paramParcel, 2, (String)localObject);
    localObject = b;
    c.a(paramParcel, 3, (Parcelable)localObject, paramInt);
    localObject = c;
    c.a(paramParcel, 4, (String)localObject);
    long l = d;
    c.a(paramParcel, 5, l);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/co.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */