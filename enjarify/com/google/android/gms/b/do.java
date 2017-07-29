package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.a;

public final class do
  extends a
{
  public static final Parcelable.Creator CREATOR;
  public final int a;
  public final String b;
  public final long c;
  public final Long d;
  public final Float e;
  public final String f;
  public final String g;
  public final Double h;
  
  static
  {
    dp localdp = new com/google/android/gms/b/dp;
    localdp.<init>();
    CREATOR = localdp;
  }
  
  do(int paramInt, String paramString1, long paramLong, Long paramLong1, Float paramFloat, String paramString2, String paramString3, Double paramDouble)
  {
    a = paramInt;
    b = paramString1;
    c = paramLong;
    d = paramLong1;
    e = null;
    int i = 1;
    if (paramInt == i) {
      if (paramFloat != null)
      {
        double d1 = paramFloat.doubleValue();
        localDouble = Double.valueOf(d1);
      }
    }
    for (h = localDouble;; h = paramDouble)
    {
      f = paramString2;
      g = paramString3;
      return;
    }
  }
  
  do(dq paramdq)
  {
    this(str1, l, localObject, str2);
  }
  
  do(String paramString1, long paramLong, Object paramObject, String paramString2)
  {
    c.a(paramString1);
    int i = 2;
    a = i;
    b = paramString1;
    c = paramLong;
    g = paramString2;
    if (paramObject == null)
    {
      d = null;
      e = null;
      h = null;
      f = null;
    }
    for (;;)
    {
      return;
      boolean bool = paramObject instanceof Long;
      if (bool)
      {
        paramObject = (Long)paramObject;
        d = ((Long)paramObject);
        e = null;
        h = null;
        f = null;
      }
      else
      {
        bool = paramObject instanceof String;
        if (bool)
        {
          d = null;
          e = null;
          h = null;
          paramObject = (String)paramObject;
          f = ((String)paramObject);
        }
        else
        {
          bool = paramObject instanceof Double;
          if (!bool) {
            break;
          }
          d = null;
          e = null;
          paramObject = (Double)paramObject;
          h = ((Double)paramObject);
          f = null;
        }
      }
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>("User attribute given of un-supported type");
    throw localIllegalArgumentException;
  }
  
  public final Object a()
  {
    Object localObject = d;
    if (localObject != null) {
      localObject = d;
    }
    for (;;)
    {
      return localObject;
      localObject = h;
      if (localObject != null)
      {
        localObject = h;
      }
      else
      {
        localObject = f;
        if (localObject != null) {
          localObject = f;
        } else {
          localObject = null;
        }
      }
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    dp.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/do.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */