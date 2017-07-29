package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public final class bq
  extends a
{
  public static final Parcelable.Creator CREATOR;
  public final int a;
  public final String b;
  public final String c;
  
  static
  {
    br localbr = new com/google/android/gms/b/br;
    localbr.<init>();
    CREATOR = localbr;
  }
  
  bq(int paramInt, String paramString1, String paramString2)
  {
    a = paramInt;
    b = paramString1;
    c = paramString2;
  }
  
  public bq(String paramString1, String paramString2)
  {
    this(1, paramString1, paramString2);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    br.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/bq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */