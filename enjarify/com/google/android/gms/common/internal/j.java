package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public final class j
  extends a
{
  public static final Parcelable.Creator CREATOR;
  final int a;
  
  static
  {
    k localk = new com/google/android/gms/common/internal/k;
    localk.<init>();
    CREATOR = localk;
  }
  
  j(int paramInt)
  {
    a = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    k.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/common/internal/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */