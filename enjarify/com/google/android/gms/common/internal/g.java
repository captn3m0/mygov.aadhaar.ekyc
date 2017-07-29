package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class g
  implements Parcelable.Creator
{
  static void a(f paramf, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    int j = a;
    c.b(paramParcel, 1, j);
    Object localObject = b;
    c.a(paramParcel, 2, (IBinder)localObject);
    localObject = c;
    c.a(paramParcel, 3, (Parcelable)localObject, paramInt);
    boolean bool = d;
    c.a(paramParcel, 4, bool);
    bool = e;
    c.a(paramParcel, 5, bool);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/common/internal/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */