package com.google.android.gms.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.safeparcel.a;

public final class ee
  extends a
  implements g
{
  public static final Parcelable.Creator CREATOR;
  final int a;
  int b;
  Intent c;
  
  static
  {
    ef localef = new com/google/android/gms/b/ef;
    localef.<init>();
    CREATOR = localef;
  }
  
  public ee()
  {
    this((byte)0);
  }
  
  private ee(byte paramByte)
  {
    this(2, 0, null);
  }
  
  ee(int paramInt1, int paramInt2, Intent paramIntent)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramIntent;
  }
  
  public final Status a()
  {
    int i = b;
    if (i == 0) {}
    for (Status localStatus = Status.a;; localStatus = Status.e) {
      return localStatus;
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ef.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/b/ee.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */