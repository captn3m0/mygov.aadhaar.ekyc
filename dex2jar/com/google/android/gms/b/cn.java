package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.a;

public final class cn
  extends a
{
  public static final Parcelable.Creator<cn> CREATOR = new co();
  public final String a;
  public final cl b;
  public final String c;
  public final long d;
  
  cn(cn paramcn, long paramLong)
  {
    c.a(paramcn);
    a = a;
    b = b;
    c = c;
    d = paramLong;
  }
  
  public cn(String paramString1, cl paramcl, String paramString2, long paramLong)
  {
    a = paramString1;
    b = paramcl;
    c = paramString2;
    d = paramLong;
  }
  
  public final String toString()
  {
    String str1 = c;
    String str2 = a;
    String str3 = String.valueOf(b);
    return String.valueOf(str1).length() + 21 + String.valueOf(str2).length() + String.valueOf(str3).length() + "origin=" + str1 + ",name=" + str2 + ",params=" + str3;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    co.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/b/cn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */