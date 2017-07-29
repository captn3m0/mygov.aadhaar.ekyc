package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class wc
  implements Parcelable.Creator<wb>
{
  static void a(wb paramwb, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.a(paramParcel, 2, a, paramInt);
    c.a(paramParcel, 3, b);
    c.a(paramParcel, 4, c);
    Object localObject = d;
    if (localObject != null)
    {
      paramInt = c.a(paramParcel, 5);
      paramParcel.writeStringArray((String[])localObject);
      c.b(paramParcel, paramInt);
    }
    c.a(paramParcel, 6, e);
    localObject = f;
    if (localObject != null)
    {
      int j = c.a(paramParcel, 7);
      int k = localObject.length;
      paramParcel.writeInt(k);
      paramInt = 0;
      while (paramInt < k)
      {
        paramParcel.writeByteArray(localObject[paramInt]);
        paramInt += 1;
      }
      c.b(paramParcel, j);
    }
    c.a(paramParcel, 8, g);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/wc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */