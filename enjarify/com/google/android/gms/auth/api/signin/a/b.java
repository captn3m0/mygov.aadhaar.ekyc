package com.google.android.gms.auth.api.signin.a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class b
  extends com.google.android.gms.common.internal.safeparcel.a
{
  public static final Parcelable.Creator CREATOR;
  final int a;
  public int b;
  Bundle c;
  
  static
  {
    a locala = new com/google/android/gms/auth/api/signin/a/a;
    locala.<init>();
    CREATOR = locala;
  }
  
  b(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramBundle;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/auth/api/signin/a/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */