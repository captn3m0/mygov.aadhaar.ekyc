package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

@Deprecated
public final class j
  extends a
{
  public static final Parcelable.Creator<j> CREATOR = new k();
  final int a;
  
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */