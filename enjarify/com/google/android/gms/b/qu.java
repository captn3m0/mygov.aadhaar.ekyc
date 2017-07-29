package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

public final class qu
  implements Parcelable.Creator
{
  static void a(qt paramqt, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    boolean bool = a;
    c.a(paramParcel, 2, bool);
    List localList = b;
    c.a(paramParcel, 3, localList);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/qu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */