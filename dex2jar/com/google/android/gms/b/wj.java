package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Arrays;

public final class wj
  extends a
{
  public static final Parcelable.Creator<wj> CREATOR = new wk();
  public final String a;
  public final int b;
  public final int c;
  public final String d;
  public final String e;
  public final boolean f;
  public final String g;
  public final boolean h;
  public final int i;
  
  public wj(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4, boolean paramBoolean, int paramInt3)
  {
    a = ((String)c.a(paramString1));
    b = paramInt1;
    c = paramInt2;
    g = paramString2;
    d = paramString3;
    e = paramString4;
    if (!paramBoolean) {}
    for (boolean bool = true;; bool = false)
    {
      f = bool;
      h = paramBoolean;
      i = paramInt3;
      return;
    }
  }
  
  public wj(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, boolean paramBoolean1, String paramString4, boolean paramBoolean2, int paramInt3)
  {
    a = paramString1;
    b = paramInt1;
    c = paramInt2;
    d = paramString2;
    e = paramString3;
    f = paramBoolean1;
    g = paramString4;
    h = paramBoolean2;
    i = paramInt3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof wj)) {
        break;
      }
      paramObject = (wj)paramObject;
    } while ((a.equals(a)) && (b == b) && (c == c) && (b.a(g, g)) && (b.a(d, d)) && (b.a(e, e)) && (f == f) && (h == h) && (i == i));
    return false;
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, Integer.valueOf(b), Integer.valueOf(c), g, d, e, Boolean.valueOf(f), Boolean.valueOf(h), Integer.valueOf(i) });
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PlayLoggerContext[");
    localStringBuilder.append("package=").append(a).append(',');
    localStringBuilder.append("packageVersionCode=").append(b).append(',');
    localStringBuilder.append("logSource=").append(c).append(',');
    localStringBuilder.append("logSourceName=").append(g).append(',');
    localStringBuilder.append("uploadAccount=").append(d).append(',');
    localStringBuilder.append("loggingId=").append(e).append(',');
    localStringBuilder.append("logAndroidId=").append(f).append(',');
    localStringBuilder.append("isAnonymous=").append(h).append(',');
    localStringBuilder.append("qosTier=").append(i);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    wk.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/wj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */