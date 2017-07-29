package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.f;

public final class eq
  extends com.google.android.gms.common.internal.safeparcel.a
{
  public static final Parcelable.Creator<eq> CREATOR = new er();
  final int a;
  final com.google.android.gms.common.a b;
  final f c;
  
  public eq()
  {
    this(new com.google.android.gms.common.a(8, null));
  }
  
  eq(int paramInt, com.google.android.gms.common.a parama, f paramf)
  {
    a = paramInt;
    b = parama;
    c = paramf;
  }
  
  private eq(com.google.android.gms.common.a parama)
  {
    this(1, parama, null);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    er.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/b/eq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */