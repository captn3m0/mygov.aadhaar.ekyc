package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class jp
  extends com.google.android.gms.common.internal.safeparcel.a
{
  public static final Parcelable.Creator CREATOR;
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  public final int f;
  public final int g;
  public final int h;
  public final String i;
  public final int j;
  public final String k;
  public final int l;
  public final int m;
  public final String n;
  
  static
  {
    jq localjq = new com/google/android/gms/b/jq;
    localjq.<init>();
    CREATOR = localjq;
  }
  
  jp(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, String paramString1, int paramInt9, String paramString2, int paramInt10, int paramInt11, String paramString3)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
    d = paramInt4;
    e = paramInt5;
    f = paramInt6;
    g = paramInt7;
    h = paramInt8;
    i = paramString1;
    j = paramInt9;
    k = paramString2;
    l = paramInt10;
    m = paramInt11;
    n = paramString3;
  }
  
  public jp(com.google.android.gms.ads.e.a parama)
  {
    int i1 = a;
    a = i1;
    i1 = b;
    b = i1;
    i1 = c;
    c = i1;
    i1 = d;
    d = i1;
    i1 = e;
    e = i1;
    i1 = f;
    f = i1;
    i1 = g;
    g = i1;
    i1 = h;
    h = i1;
    String str = i;
    i = str;
    i1 = j;
    j = i1;
    str = k;
    k = str;
    i1 = l;
    l = i1;
    i1 = m;
    m = i1;
    str = n;
    n = str;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    jq.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/jp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */