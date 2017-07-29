package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public final class rc
  extends a
{
  public static final Parcelable.Creator CREATOR;
  String a;
  
  static
  {
    rd localrd = new com/google/android/gms/b/rd;
    localrd.<init>();
    CREATOR = localrd;
  }
  
  public rc(String paramString)
  {
    a = paramString;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    rd.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/rc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */