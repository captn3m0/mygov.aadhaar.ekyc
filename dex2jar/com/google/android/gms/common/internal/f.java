package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class f
  extends com.google.android.gms.common.internal.safeparcel.a
{
  public static final Parcelable.Creator<f> CREATOR = new g();
  final int a;
  public IBinder b;
  public com.google.android.gms.common.a c;
  public boolean d;
  public boolean e;
  
  f(int paramInt, IBinder paramIBinder, com.google.android.gms.common.a parama, boolean paramBoolean1, boolean paramBoolean2)
  {
    a = paramInt;
    b = paramIBinder;
    c = parama;
    d = paramBoolean1;
    e = paramBoolean2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof f)) {
        return false;
      }
      paramObject = (f)paramObject;
    } while ((c.equals(c)) && (z.a.a(b).equals(z.a.a(b))));
    return false;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    g.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/common/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */