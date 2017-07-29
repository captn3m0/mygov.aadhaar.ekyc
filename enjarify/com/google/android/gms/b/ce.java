package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class ce
  implements Parcelable.Creator
{
  static void a(cd paramcd, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    int j = a;
    c.b(paramParcel, 1, j);
    Object localObject = b;
    c.a(paramParcel, 2, (String)localObject);
    localObject = c;
    c.a(paramParcel, 3, (String)localObject);
    localObject = d;
    c.a(paramParcel, 4, (Parcelable)localObject, paramInt);
    long l = e;
    c.a(paramParcel, 5, l);
    boolean bool = f;
    c.a(paramParcel, 6, bool);
    localObject = g;
    c.a(paramParcel, 7, (String)localObject);
    localObject = h;
    c.a(paramParcel, 8, (Parcelable)localObject, paramInt);
    l = paramcd.i;
    c.a(paramParcel, 9, l);
    localObject = paramcd.j;
    c.a(paramParcel, 10, (Parcelable)localObject, paramInt);
    l = k;
    c.a(paramParcel, 11, l);
    localObject = paramcd.l;
    c.a(paramParcel, 12, (Parcelable)localObject, paramInt);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/ce.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */