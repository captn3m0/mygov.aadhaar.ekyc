package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class dp
  implements Parcelable.Creator<do>
{
  static void a(do paramdo, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, a);
    c.a(paramParcel, 2, b);
    c.a(paramParcel, 3, c);
    Object localObject = d;
    if (localObject != null)
    {
      c.a(paramParcel, 4, 8);
      paramParcel.writeLong(((Long)localObject).longValue());
    }
    localObject = e;
    if (localObject != null)
    {
      c.a(paramParcel, 5, 4);
      paramParcel.writeFloat(((Float)localObject).floatValue());
    }
    c.a(paramParcel, 6, f);
    c.a(paramParcel, 7, g);
    paramdo = h;
    if (paramdo != null)
    {
      c.a(paramParcel, 8, 8);
      paramParcel.writeDouble(paramdo.doubleValue());
    }
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/dp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */