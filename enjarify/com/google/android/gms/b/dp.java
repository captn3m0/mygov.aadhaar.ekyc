package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class dp
  implements Parcelable.Creator
{
  static void a(do paramdo, Parcel paramParcel)
  {
    int i = 4;
    int j = 8;
    int k = c.a(paramParcel, 20293);
    int m = a;
    c.b(paramParcel, 1, m);
    String str = b;
    c.a(paramParcel, 2, str);
    int n = 3;
    float f = 4.2E-45F;
    long l = c;
    c.a(paramParcel, n, l);
    Object localObject = paramdo.d;
    if (localObject != null)
    {
      c.a(paramParcel, i, j);
      l = ((Long)localObject).longValue();
      paramParcel.writeLong(l);
    }
    localObject = e;
    if (localObject != null)
    {
      m = 5;
      c.a(paramParcel, m, i);
      f = ((Float)localObject).floatValue();
      paramParcel.writeFloat(f);
    }
    str = paramdo.f;
    c.a(paramParcel, 6, str);
    n = 7;
    f = 9.8E-45F;
    str = g;
    c.a(paramParcel, n, str);
    localObject = h;
    if (localObject != null)
    {
      c.a(paramParcel, j, j);
      double d = ((Double)localObject).doubleValue();
      paramParcel.writeDouble(d);
    }
    c.b(paramParcel, k);
  }
}


/* Location:              com/google/android/gms/b/dp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */