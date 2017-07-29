package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public final class sg
  extends a
{
  public static final Parcelable.Creator CREATOR;
  public final ih a;
  public final String b;
  
  static
  {
    sh localsh = new com/google/android/gms/b/sh;
    localsh.<init>();
    CREATOR = localsh;
  }
  
  public sg(ih paramih, String paramString)
  {
    a = paramih;
    b = paramString;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    sh.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/b/sg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */