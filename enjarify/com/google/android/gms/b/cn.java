package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.a;

public final class cn
  extends a
{
  public static final Parcelable.Creator CREATOR;
  public final String a;
  public final cl b;
  public final String c;
  public final long d;
  
  static
  {
    co localco = new com/google/android/gms/b/co;
    localco.<init>();
    CREATOR = localco;
  }
  
  cn(cn paramcn, long paramLong)
  {
    c.a(paramcn);
    Object localObject = a;
    a = ((String)localObject);
    localObject = b;
    b = ((cl)localObject);
    localObject = c;
    c = ((String)localObject);
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
    int i = String.valueOf(str1).length() + 21;
    int j = String.valueOf(str2).length();
    i += j;
    j = String.valueOf(str3).length();
    i += j;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(i);
    return "origin=" + str1 + ",name=" + str2 + ",params=" + str3;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    co.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/b/cn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */