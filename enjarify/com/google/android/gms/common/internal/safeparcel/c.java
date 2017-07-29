package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class c
{
  public static int a(Parcel paramParcel, int paramInt)
  {
    int i = 0xFFFF0000 | paramInt;
    paramParcel.writeInt(i);
    paramParcel.writeInt(0);
    return paramParcel.dataPosition();
  }
  
  public static void a(Parcel paramParcel, int paramInt, float paramFloat)
  {
    a(paramParcel, paramInt, 4);
    paramParcel.writeFloat(paramFloat);
  }
  
  public static void a(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    int i = (char)-1;
    if (paramInt2 >= i)
    {
      i = 0xFFFF0000 | paramInt1;
      paramParcel.writeInt(i);
      paramParcel.writeInt(paramInt2);
    }
    for (;;)
    {
      return;
      i = paramInt2 << 16 | paramInt1;
      paramParcel.writeInt(i);
    }
  }
  
  public static void a(Parcel paramParcel, int paramInt, long paramLong)
  {
    a(paramParcel, paramInt, 8);
    paramParcel.writeLong(paramLong);
  }
  
  public static void a(Parcel paramParcel, int paramInt, Bundle paramBundle)
  {
    if (paramBundle == null) {}
    for (;;)
    {
      return;
      int i = a(paramParcel, paramInt);
      paramParcel.writeBundle(paramBundle);
      b(paramParcel, i);
    }
  }
  
  public static void a(Parcel paramParcel, int paramInt, IBinder paramIBinder)
  {
    if (paramIBinder == null) {}
    for (;;)
    {
      return;
      int i = a(paramParcel, paramInt);
      paramParcel.writeStrongBinder(paramIBinder);
      b(paramParcel, i);
    }
  }
  
  public static void a(Parcel paramParcel, int paramInt1, Parcelable paramParcelable, int paramInt2)
  {
    if (paramParcelable == null) {}
    for (;;)
    {
      return;
      int i = a(paramParcel, paramInt1);
      paramParcelable.writeToParcel(paramParcel, paramInt2);
      b(paramParcel, i);
    }
  }
  
  public static void a(Parcel paramParcel, int paramInt, Integer paramInteger)
  {
    if (paramInteger == null) {}
    for (;;)
    {
      return;
      a(paramParcel, paramInt, 4);
      int i = paramInteger.intValue();
      paramParcel.writeInt(i);
    }
  }
  
  public static void a(Parcel paramParcel, int paramInt, String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      return;
      int i = a(paramParcel, paramInt);
      paramParcel.writeString(paramString);
      b(paramParcel, i);
    }
  }
  
  public static void a(Parcel paramParcel, int paramInt, List paramList)
  {
    if (paramList == null) {}
    for (;;)
    {
      return;
      int i = a(paramParcel, paramInt);
      paramParcel.writeStringList(paramList);
      b(paramParcel, i);
    }
  }
  
  public static void a(Parcel paramParcel, int paramInt, boolean paramBoolean)
  {
    int i = 4;
    a(paramParcel, paramInt, i);
    if (paramBoolean) {}
    for (i = 1;; i = 0)
    {
      paramParcel.writeInt(i);
      return;
    }
  }
  
  public static void a(Parcel paramParcel, int paramInt, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    for (;;)
    {
      return;
      int i = a(paramParcel, paramInt);
      paramParcel.writeByteArray(paramArrayOfByte);
      b(paramParcel, i);
    }
  }
  
  public static void a(Parcel paramParcel, int paramInt, int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null) {}
    for (;;)
    {
      return;
      int i = a(paramParcel, paramInt);
      paramParcel.writeIntArray(paramArrayOfInt);
      b(paramParcel, i);
    }
  }
  
  public static void a(Parcel paramParcel, int paramInt1, Parcelable[] paramArrayOfParcelable, int paramInt2)
  {
    if (paramArrayOfParcelable == null) {}
    for (;;)
    {
      return;
      int i = a(paramParcel, paramInt1);
      int j = paramArrayOfParcelable.length;
      paramParcel.writeInt(j);
      int k = 0;
      if (k < j)
      {
        Parcelable localParcelable = paramArrayOfParcelable[k];
        if (localParcelable == null) {
          paramParcel.writeInt(0);
        }
        for (;;)
        {
          k += 1;
          break;
          a(paramParcel, localParcelable, paramInt2);
        }
      }
      b(paramParcel, i);
    }
  }
  
  private static void a(Parcel paramParcel, Parcelable paramParcelable, int paramInt)
  {
    int i = paramParcel.dataPosition();
    paramParcel.writeInt(1);
    int j = paramParcel.dataPosition();
    paramParcelable.writeToParcel(paramParcel, paramInt);
    int k = paramParcel.dataPosition();
    paramParcel.setDataPosition(i);
    i = k - j;
    paramParcel.writeInt(i);
    paramParcel.setDataPosition(k);
  }
  
  public static void b(Parcel paramParcel, int paramInt)
  {
    int i = paramParcel.dataPosition();
    int j = i - paramInt;
    int k = paramInt + -4;
    paramParcel.setDataPosition(k);
    paramParcel.writeInt(j);
    paramParcel.setDataPosition(i);
  }
  
  public static void b(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    a(paramParcel, paramInt1, 4);
    paramParcel.writeInt(paramInt2);
  }
  
  public static void b(Parcel paramParcel, int paramInt, List paramList)
  {
    if (paramList == null) {}
    for (;;)
    {
      return;
      int i = a(paramParcel, paramInt);
      int j = paramList.size();
      paramParcel.writeInt(j);
      int k = 0;
      if (k < j)
      {
        Parcelable localParcelable = (Parcelable)paramList.get(k);
        if (localParcelable == null) {
          paramParcel.writeInt(0);
        }
        for (;;)
        {
          int m = k + 1;
          k = m;
          break;
          a(paramParcel, localParcelable, 0);
        }
      }
      b(paramParcel, i);
    }
  }
}


/* Location:              com/google/android/gms/common/internal/safeparcel/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */