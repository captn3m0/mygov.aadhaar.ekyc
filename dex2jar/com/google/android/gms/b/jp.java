package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@qi
public final class jp
  extends com.google.android.gms.common.internal.safeparcel.a
{
  public static final Parcelable.Creator<jp> CREATOR = new jq();
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
    a = a;
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
    m = m;
    n = n;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    jq.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/jp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */