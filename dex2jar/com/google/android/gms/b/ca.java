package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.a;

public final class ca
  extends a
{
  public static final Parcelable.Creator<ca> CREATOR = new cb();
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  public final long e;
  public final long f;
  public final String g;
  public final boolean h;
  public final boolean i;
  public final long j;
  public final String k;
  public final long l;
  public final long m;
  public final int n;
  
  ca(String paramString1, String paramString2, String paramString3, long paramLong1, String paramString4, long paramLong2, long paramLong3, String paramString5, boolean paramBoolean1, boolean paramBoolean2, String paramString6, long paramLong4, long paramLong5, int paramInt)
  {
    c.a(paramString1);
    a = paramString1;
    paramString1 = paramString2;
    if (TextUtils.isEmpty(paramString2)) {
      paramString1 = null;
    }
    b = paramString1;
    c = paramString3;
    j = paramLong1;
    d = paramString4;
    e = paramLong2;
    f = paramLong3;
    g = paramString5;
    h = paramBoolean1;
    i = paramBoolean2;
    k = paramString6;
    l = paramLong4;
    m = paramLong5;
    n = paramInt;
  }
  
  ca(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong1, long paramLong2, String paramString5, boolean paramBoolean1, boolean paramBoolean2, long paramLong3, String paramString6, long paramLong4, long paramLong5, int paramInt)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
    j = paramLong3;
    d = paramString4;
    e = paramLong1;
    f = paramLong2;
    g = paramString5;
    h = paramBoolean1;
    i = paramBoolean2;
    k = paramString6;
    l = paramLong4;
    m = paramLong5;
    n = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cb.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */