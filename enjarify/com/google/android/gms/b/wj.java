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
  public static final Parcelable.Creator CREATOR;
  public final String a;
  public final int b;
  public final int c;
  public final String d;
  public final String e;
  public final boolean f;
  public final String g;
  public final boolean h;
  public final int i;
  
  static
  {
    wk localwk = new com/google/android/gms/b/wk;
    localwk.<init>();
    CREATOR = localwk;
  }
  
  public wj(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4, boolean paramBoolean, int paramInt3)
  {
    String str = (String)c.a(paramString1);
    a = str;
    b = paramInt1;
    c = paramInt2;
    g = paramString2;
    d = paramString3;
    e = paramString4;
    boolean bool;
    if (!paramBoolean) {
      bool = true;
    }
    for (;;)
    {
      f = bool;
      h = paramBoolean;
      i = paramInt3;
      return;
      bool = false;
      str = null;
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
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof wj;
      if (bool2)
      {
        paramObject = (wj)paramObject;
        String str1 = a;
        String str2 = a;
        bool2 = str1.equals(str2);
        if (bool2)
        {
          int j = b;
          int m = b;
          if (j == m)
          {
            j = c;
            m = c;
            if (j == m)
            {
              str1 = g;
              str2 = g;
              boolean bool3 = b.a(str1, str2);
              if (bool3)
              {
                str1 = d;
                str2 = d;
                bool3 = b.a(str1, str2);
                if (bool3)
                {
                  str1 = e;
                  str2 = e;
                  bool3 = b.a(str1, str2);
                  if (bool3)
                  {
                    bool3 = f;
                    boolean bool4 = f;
                    if (bool3 == bool4)
                    {
                      bool3 = h;
                      bool4 = h;
                      if (bool3 == bool4)
                      {
                        int k = i;
                        int n = i;
                        if (k == n) {
                          continue;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        bool1 = false;
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[9];
    Object localObject = a;
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(b);
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(c);
    arrayOfObject[2] = localObject;
    localObject = g;
    arrayOfObject[3] = localObject;
    localObject = d;
    arrayOfObject[4] = localObject;
    localObject = e;
    arrayOfObject[5] = localObject;
    localObject = Boolean.valueOf(f);
    arrayOfObject[6] = localObject;
    localObject = Boolean.valueOf(h);
    arrayOfObject[7] = localObject;
    localObject = Integer.valueOf(i);
    arrayOfObject[8] = localObject;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final String toString()
  {
    char c1 = ',';
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("PlayLoggerContext[");
    StringBuilder localStringBuilder2 = localStringBuilder1.append("package=");
    String str = a;
    localStringBuilder2.append(str).append(c1);
    localStringBuilder2 = localStringBuilder1.append("packageVersionCode=");
    int j = b;
    localStringBuilder2.append(j).append(c1);
    localStringBuilder2 = localStringBuilder1.append("logSource=");
    j = c;
    localStringBuilder2.append(j).append(c1);
    localStringBuilder2 = localStringBuilder1.append("logSourceName=");
    str = g;
    localStringBuilder2.append(str).append(c1);
    localStringBuilder2 = localStringBuilder1.append("uploadAccount=");
    str = d;
    localStringBuilder2.append(str).append(c1);
    localStringBuilder2 = localStringBuilder1.append("loggingId=");
    str = e;
    localStringBuilder2.append(str).append(c1);
    localStringBuilder2 = localStringBuilder1.append("logAndroidId=");
    boolean bool = f;
    localStringBuilder2.append(bool).append(c1);
    localStringBuilder2 = localStringBuilder1.append("isAnonymous=");
    bool = h;
    localStringBuilder2.append(bool).append(c1);
    localStringBuilder2 = localStringBuilder1.append("qosTier=");
    int k = i;
    localStringBuilder2.append(k);
    localStringBuilder1.append("]");
    return localStringBuilder1.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    wk.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/wj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */