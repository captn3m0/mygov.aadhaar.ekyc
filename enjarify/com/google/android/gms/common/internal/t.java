package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class t
  implements Parcelable.Creator
{
  static void a(s params, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    int j = a;
    c.b(paramParcel, 1, j);
    j = b;
    c.b(paramParcel, 2, j);
    j = c;
    c.b(paramParcel, 3, j);
    Object localObject = d;
    c.a(paramParcel, 4, (String)localObject);
    localObject = e;
    c.a(paramParcel, 5, (IBinder)localObject);
    localObject = f;
    c.a(paramParcel, 6, (Parcelable[])localObject, paramInt);
    localObject = g;
    c.a(paramParcel, 7, (Bundle)localObject);
    localObject = h;
    c.a(paramParcel, 8, (Parcelable)localObject, paramInt);
    localObject = params.i;
    c.a(paramParcel, 10, (Parcelable[])localObject, paramInt);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/common/internal/t.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */