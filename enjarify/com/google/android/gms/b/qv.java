package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public final class qv
  extends a
{
  public static final Parcelable.Creator CREATOR;
  public final boolean a;
  public final boolean b;
  public final boolean c;
  
  static
  {
    qw localqw = new com/google/android/gms/b/qw;
    localqw.<init>();
    CREATOR = localqw;
  }
  
  public qv(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    a = paramBoolean1;
    b = paramBoolean2;
    c = paramBoolean3;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    qw.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/qv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */