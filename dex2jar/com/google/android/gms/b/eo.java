package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.a;

public final class eo
  extends a
{
  public static final Parcelable.Creator<eo> CREATOR = new ep();
  final int a;
  final d b;
  
  eo(int paramInt, d paramd)
  {
    a = paramInt;
    b = paramd;
  }
  
  public eo(d paramd)
  {
    this(1, paramd);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ep.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/b/eo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */