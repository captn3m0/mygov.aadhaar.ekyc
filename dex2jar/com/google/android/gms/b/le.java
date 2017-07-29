package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.b.c;
import com.google.android.gms.common.internal.safeparcel.a;

@qi
public final class le
  extends a
{
  public static final Parcelable.Creator<le> CREATOR = new lf();
  public final int a;
  public final boolean b;
  public final int c;
  public final boolean d;
  public final int e;
  public final jt f;
  
  public le(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, int paramInt3, jt paramjt)
  {
    a = paramInt1;
    b = paramBoolean1;
    c = paramInt2;
    d = paramBoolean2;
    e = paramInt3;
    f = paramjt;
  }
  
  public le(c paramc) {}
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    lf.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/b/le.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */