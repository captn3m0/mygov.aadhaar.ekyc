package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public final class k
  extends a
{
  public static final Parcelable.Creator CREATOR;
  public final String a;
  public final int b;
  
  static
  {
    l locall = new com/google/android/gms/common/l;
    locall.<init>();
    CREATOR = locall;
  }
  
  public k(String paramString, int paramInt)
  {
    a = paramString;
    b = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    l.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/common/k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */