package com.google.android.gms.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class ef
  implements Parcelable.Creator
{
  static void a(ee paramee, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    int j = a;
    c.b(paramParcel, 1, j);
    j = b;
    c.b(paramParcel, 2, j);
    Intent localIntent = c;
    c.a(paramParcel, 3, localIntent, paramInt);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/ef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */