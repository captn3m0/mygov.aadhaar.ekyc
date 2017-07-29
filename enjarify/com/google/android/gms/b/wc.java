package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class wc
  implements Parcelable.Creator
{
  static void a(wb paramwb, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    Object localObject = a;
    c.a(paramParcel, 2, (Parcelable)localObject, paramInt);
    localObject = b;
    c.a(paramParcel, 3, (byte[])localObject);
    int j = 4;
    localObject = c;
    c.a(paramParcel, j, (int[])localObject);
    String[] arrayOfString = d;
    if (arrayOfString != null)
    {
      int k = c.a(paramParcel, 5);
      paramParcel.writeStringArray(arrayOfString);
      c.b(paramParcel, k);
    }
    j = 6;
    localObject = e;
    c.a(paramParcel, j, (int[])localObject);
    localObject = f;
    if (localObject != null)
    {
      int m = c.a(paramParcel, 7);
      int n = localObject.length;
      paramParcel.writeInt(n);
      j = 0;
      arrayOfString = null;
      while (j < n)
      {
        byte[] arrayOfByte = localObject[j];
        paramParcel.writeByteArray(arrayOfByte);
        j += 1;
      }
      c.b(paramParcel, m);
    }
    boolean bool = g;
    c.a(paramParcel, 8, bool);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/wc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */