package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.j;
import com.google.android.gms.common.internal.safeparcel.a;

@qi
public final class jt
  extends a
{
  public static final Parcelable.Creator<jt> CREATOR = new ju();
  public final boolean a;
  
  public jt(j paramj)
  {
    this(a);
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */