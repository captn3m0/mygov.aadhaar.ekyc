package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

@qi
public final class sg
  extends a
{
  public static final Parcelable.Creator<sg> CREATOR = new sh();
  public final ih a;
  public final String b;
  
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */