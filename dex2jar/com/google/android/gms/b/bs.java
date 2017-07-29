package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public final class bs
  extends a
{
  public static final Parcelable.Creator<bs> CREATOR = new bt();
  public final int a;
  bf.a b;
  byte[] c;
  
  bs(int paramInt, byte[] paramArrayOfByte)
  {
    a = paramInt;
    b = null;
    c = paramArrayOfByte;
    a();
  }
  
  final void a()
  {
    if ((b == null) && (c != null)) {}
    while ((b != null) && (c == null)) {
      return;
    }
    if ((b != null) && (c != null)) {
      throw new IllegalStateException("Invalid internal representation - full");
    }
    if ((b == null) && (c == null)) {
      throw new IllegalStateException("Invalid internal representation - empty");
    }
    throw new IllegalStateException("Impossible");
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bt.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */