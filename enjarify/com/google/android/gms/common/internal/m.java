package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;

public final class m
  extends a
{
  public static final Parcelable.Creator CREATOR;
  final int a;
  final IBinder b;
  final Scope[] c;
  Integer d;
  Integer e;
  
  static
  {
    n localn = new com/google/android/gms/common/internal/n;
    localn.<init>();
    CREATOR = localn;
  }
  
  m(int paramInt, IBinder paramIBinder, Scope[] paramArrayOfScope, Integer paramInteger1, Integer paramInteger2)
  {
    a = paramInt;
    b = paramIBinder;
    c = paramArrayOfScope;
    d = paramInteger1;
    e = paramInteger2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    n.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/common/internal/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */