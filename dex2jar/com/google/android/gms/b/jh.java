package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

@qi
public final class jh
  extends a
{
  public static final Parcelable.Creator<jh> CREATOR = new ji();
  public final int a;
  
  public jh(int paramInt)
  {
    a = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ji.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/jh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */