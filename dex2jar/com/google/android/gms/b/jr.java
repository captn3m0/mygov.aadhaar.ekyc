package com.google.android.gms.b;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

@qi
public final class jr
  extends il
{
  public jr(il paramil)
  {
    super(a, b, c, d, e, f, g, h, i, j);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel, 20293);
    c.a(paramParcel, 2, a);
    c.b(paramParcel, 3, b);
    c.b(paramParcel, 6, e);
    c.b(paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/b/jr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */