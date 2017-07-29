package com.google.android.gms.b;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class ra
  implements Parcelable.Creator
{
  static void a(qz paramqz, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    ParcelFileDescriptor localParcelFileDescriptor = a;
    c.a(paramParcel, 2, localParcelFileDescriptor, paramInt);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/ra.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */