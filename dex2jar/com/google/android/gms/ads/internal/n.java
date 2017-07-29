package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.b.qi;
import com.google.android.gms.common.internal.safeparcel.a;

@qi
public final class n
  extends a
{
  public static final Parcelable.Creator<n> CREATOR = new o();
  public final boolean a;
  public final boolean b;
  public final String c;
  public final boolean d;
  public final float e;
  public final int f;
  
  n(boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3, float paramFloat, int paramInt)
  {
    a = paramBoolean1;
    b = paramBoolean2;
    c = paramString;
    d = paramBoolean3;
    e = paramFloat;
    f = paramInt;
  }
  
  public n(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, float paramFloat, int paramInt)
  {
    this(paramBoolean1, paramBoolean2, null, paramBoolean3, paramFloat, paramInt);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    o.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/ads/internal/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */