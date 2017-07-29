package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.j;
import com.google.android.gms.common.internal.safeparcel.a;

public final class jt
  extends a
{
  public static final Parcelable.Creator CREATOR;
  public final boolean a;
  
  static
  {
    ju localju = new com/google/android/gms/b/ju;
    localju.<init>();
    CREATOR = localju;
  }
  
  public jt(j paramj)
  {
    this(bool);
  }
  
  public jt(boolean paramBoolean)
  {
    a = paramBoolean;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ju.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/jt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */