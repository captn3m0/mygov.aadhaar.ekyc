package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.a;

public final class cd
  extends a
{
  public static final Parcelable.Creator<cd> CREATOR = new ce();
  public final int a;
  public String b;
  public String c;
  public do d;
  public long e;
  public boolean f;
  public String g;
  public cn h;
  public long i;
  public cn j;
  public long k;
  public cn l;
  
  cd(int paramInt, String paramString1, String paramString2, do paramdo, long paramLong1, boolean paramBoolean, String paramString3, cn paramcn1, long paramLong2, cn paramcn2, long paramLong3, cn paramcn3)
  {
    a = paramInt;
    b = paramString1;
    c = paramString2;
    d = paramdo;
    e = paramLong1;
    f = paramBoolean;
    g = paramString3;
    h = paramcn1;
    i = paramLong2;
    j = paramcn2;
    k = paramLong3;
    l = paramcn3;
  }
  
  cd(cd paramcd)
  {
    a = 1;
    c.a(paramcd);
    b = b;
    c = c;
    d = d;
    e = e;
    f = f;
    g = g;
    h = h;
    i = i;
    j = j;
    k = k;
    l = l;
  }
  
  cd(String paramString1, String paramString2, do paramdo, long paramLong1, boolean paramBoolean, String paramString3, cn paramcn1, long paramLong2, cn paramcn2, long paramLong3, cn paramcn3)
  {
    a = 1;
    b = paramString1;
    c = paramString2;
    d = paramdo;
    e = paramLong1;
    f = paramBoolean;
    g = paramString3;
    h = paramcn1;
    i = paramLong2;
    j = paramcn2;
    k = paramLong3;
    l = paramcn3;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ce.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/b/cd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */