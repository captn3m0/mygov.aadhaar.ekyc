package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class b
{
  public static int a(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    int j = a(paramParcel, i);
    int k = paramParcel.dataPosition();
    int m = (char)-1 & i;
    int n = 20293;
    b.a locala;
    String str2;
    if (m != n)
    {
      locala = new com/google/android/gms/common/internal/safeparcel/b$a;
      String str1 = "Expected object header. Got 0x";
      str2 = String.valueOf(Integer.toHexString(i));
      m = str2.length();
      if (m != 0) {
        str2 = str1.concat(str2);
      }
      for (;;)
      {
        locala.<init>(str2, paramParcel);
        throw locala;
        str2 = new java/lang/String;
        str2.<init>(str1);
      }
    }
    i = k + j;
    if (i >= k)
    {
      j = paramParcel.dataSize();
      if (i <= j) {}
    }
    else
    {
      locala = new com/google/android/gms/common/internal/safeparcel/b$a;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(54);
      str2 = "Size read is invalid start=" + k + " end=" + i;
      locala.<init>(str2, paramParcel);
      throw locala;
    }
    return i;
  }
  
  public static int a(Parcel paramParcel, int paramInt)
  {
    int i = -65536;
    int j = paramInt & i;
    if (j != i)
    {
      j = paramInt >> 16;
      i = (char)-1;
      j &= i;
    }
    for (;;)
    {
      return j;
      j = paramParcel.readInt();
    }
  }
  
  public static Parcelable a(Parcel paramParcel, int paramInt, Parcelable.Creator paramCreator)
  {
    int i = a(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    Parcelable localParcelable;
    if (i == 0) {
      localParcelable = null;
    }
    for (;;)
    {
      return localParcelable;
      localParcelable = (Parcelable)paramCreator.createFromParcel(paramParcel);
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
  
  public static void a(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    if (paramInt1 != paramInt2)
    {
      b.a locala = new com/google/android/gms/common/internal/safeparcel/b$a;
      String str = String.valueOf(Integer.toHexString(paramInt1));
      int i = String.valueOf(str).length() + 46;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(i);
      str = "Expected size " + paramInt2 + " got " + paramInt1 + " (0x" + str + ")";
      locala.<init>(str, paramParcel);
      throw locala;
    }
  }
  
  public static void b(Parcel paramParcel, int paramInt)
  {
    int i = a(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    i += j;
    paramParcel.setDataPosition(i);
  }
  
  private static void b(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    int i = a(paramParcel, paramInt1);
    if (i != paramInt2)
    {
      b.a locala = new com/google/android/gms/common/internal/safeparcel/b$a;
      String str1 = String.valueOf(Integer.toHexString(i));
      int j = String.valueOf(str1).length() + 46;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(j);
      String str2 = "Expected size " + paramInt2 + " got " + i + " (0x" + str1 + ")";
      locala.<init>(str2, paramParcel);
      throw locala;
    }
  }
  
  public static Object[] b(Parcel paramParcel, int paramInt, Parcelable.Creator paramCreator)
  {
    int i = a(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    Object[] arrayOfObject;
    if (i == 0) {
      arrayOfObject = null;
    }
    for (;;)
    {
      return arrayOfObject;
      arrayOfObject = paramParcel.createTypedArray(paramCreator);
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
  
  public static ArrayList c(Parcel paramParcel, int paramInt, Parcelable.Creator paramCreator)
  {
    int i = a(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    ArrayList localArrayList;
    if (i == 0) {
      localArrayList = null;
    }
    for (;;)
    {
      return localArrayList;
      localArrayList = paramParcel.createTypedArrayList(paramCreator);
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
  
  public static boolean c(Parcel paramParcel, int paramInt)
  {
    b(paramParcel, paramInt, 4);
    int i = paramParcel.readInt();
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public static int d(Parcel paramParcel, int paramInt)
  {
    b(paramParcel, paramInt, 4);
    return paramParcel.readInt();
  }
  
  public static Integer e(Parcel paramParcel, int paramInt)
  {
    int i = a(paramParcel, paramInt);
    if (i == 0) {
      i = 0;
    }
    for (Integer localInteger = null;; localInteger = Integer.valueOf(i))
    {
      return localInteger;
      int j = 4;
      a(paramParcel, i, j);
      i = paramParcel.readInt();
    }
  }
  
  public static long f(Parcel paramParcel, int paramInt)
  {
    b(paramParcel, paramInt, 8);
    return paramParcel.readLong();
  }
  
  public static float g(Parcel paramParcel, int paramInt)
  {
    b(paramParcel, paramInt, 4);
    return paramParcel.readFloat();
  }
  
  public static String h(Parcel paramParcel, int paramInt)
  {
    int i = a(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    String str;
    if (i == 0) {
      str = null;
    }
    for (;;)
    {
      return str;
      str = paramParcel.readString();
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
  
  public static IBinder i(Parcel paramParcel, int paramInt)
  {
    int i = a(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    IBinder localIBinder;
    if (i == 0) {
      localIBinder = null;
    }
    for (;;)
    {
      return localIBinder;
      localIBinder = paramParcel.readStrongBinder();
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
  
  public static Bundle j(Parcel paramParcel, int paramInt)
  {
    int i = a(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    Bundle localBundle;
    if (i == 0) {
      localBundle = null;
    }
    for (;;)
    {
      return localBundle;
      localBundle = paramParcel.readBundle();
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
  
  public static byte[] k(Parcel paramParcel, int paramInt)
  {
    int i = a(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    byte[] arrayOfByte;
    if (i == 0) {
      arrayOfByte = null;
    }
    for (;;)
    {
      return arrayOfByte;
      arrayOfByte = paramParcel.createByteArray();
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
  
  public static int[] l(Parcel paramParcel, int paramInt)
  {
    int i = a(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    int[] arrayOfInt;
    if (i == 0) {
      arrayOfInt = null;
    }
    for (;;)
    {
      return arrayOfInt;
      arrayOfInt = paramParcel.createIntArray();
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
  
  public static ArrayList m(Parcel paramParcel, int paramInt)
  {
    int i = a(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    ArrayList localArrayList;
    if (i == 0) {
      localArrayList = null;
    }
    for (;;)
    {
      return localArrayList;
      localArrayList = paramParcel.createStringArrayList();
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
}


/* Location:              com/google/android/gms/common/internal/safeparcel/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */