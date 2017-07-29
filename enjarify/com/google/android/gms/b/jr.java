package com.google.android.gms.b;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

public final class jr
  extends il
{
  public jr(il paramil)
  {
    super(str, i, j, bool1, k, m, arrayOfil, bool2, bool3, bool4);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    String str = a;
    c.a(paramParcel, 2, str);
    int j = b;
    c.b(paramParcel, 3, j);
    j = e;
    c.b(paramParcel, 6, j);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/jr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */