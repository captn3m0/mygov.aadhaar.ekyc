package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.a;

public final class do
  extends a
{
  public static final Parcelable.Creator<do> CREATOR = new dp();
  public final int a;
  public final String b;
  public final long c;
  public final Long d;
  public final Float e;
  public final String f;
  public final String g;
  public final Double h;
  
  do(int paramInt, String paramString1, long paramLong, Long paramLong1, Float paramFloat, String paramString2, String paramString3, Double paramDouble)
  {
    a = paramInt;
    b = paramString1;
    c = paramLong;
    d = paramLong1;
    e = null;
    if (paramInt == 1)
    {
      paramString1 = (String)localObject;
      if (paramFloat != null) {
        paramString1 = Double.valueOf(paramFloat.doubleValue());
      }
    }
    for (h = paramString1;; h = paramDouble)
    {
      f = paramString2;
      g = paramString3;
      return;
    }
  }
  
  do(dq paramdq)
  {
    this(c, d, e, b);
  }
  
  do(String paramString1, long paramLong, Object paramObject, String paramString2)
  {
    c.a(paramString1);
    a = 2;
    b = paramString1;
    c = paramLong;
    g = paramString2;
    if (paramObject == null)
    {
      d = null;
      e = null;
      h = null;
      f = null;
      return;
    }
    if ((paramObject instanceof Long))
    {
      d = ((Long)paramObject);
      e = null;
      h = null;
      f = null;
      return;
    }
    if ((paramObject instanceof String))
    {
      d = null;
      e = null;
      h = null;
      f = ((String)paramObject);
      return;
    }
    if ((paramObject instanceof Double))
    {
      d = null;
      e = null;
      h = ((Double)paramObject);
      f = null;
      return;
    }
    throw new IllegalArgumentException("User attribute given of un-supported type");
  }
  
  public final Object a()
  {
    if (d != null) {
      return d;
    }
    if (h != null) {
      return h;
    }
    if (f != null) {
      return f;
    }
    return null;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    dp.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/do.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */