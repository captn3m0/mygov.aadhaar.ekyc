package com.google.android.gms.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.b.il;
import com.google.android.gms.b.ip;
import com.google.android.gms.b.uk;

public final class d
{
  public static final d a;
  public static final d b;
  public static final d c;
  public static final d d;
  public static final d e;
  public static final d f;
  public static final d g;
  public static final d h;
  public static final d i;
  public static final d j;
  public final int k;
  public final int l;
  private final String m;
  
  static
  {
    int n = 320;
    int i1 = -3;
    int i2 = 50;
    d locald = new com/google/android/gms/ads/d;
    locald.<init>(n, i2, "320x50_mb");
    a = locald;
    locald = new com/google/android/gms/ads/d;
    locald.<init>(468, 60, "468x60_as");
    b = locald;
    locald = new com/google/android/gms/ads/d;
    locald.<init>(n, 100, "320x100_as");
    c = locald;
    locald = new com/google/android/gms/ads/d;
    locald.<init>(728, 90, "728x90_as");
    d = locald;
    locald = new com/google/android/gms/ads/d;
    locald.<init>(300, 250, "300x250_as");
    e = locald;
    locald = new com/google/android/gms/ads/d;
    locald.<init>(160, 600, "160x600_as");
    f = locald;
    locald = new com/google/android/gms/ads/d;
    locald.<init>(-1, -2, "smart_banner");
    g = locald;
    locald = new com/google/android/gms/ads/d;
    locald.<init>(i1, -4, "fluid");
    h = locald;
    locald = new com/google/android/gms/ads/d;
    locald.<init>(i2, i2, "50x50_mb");
    i = locald;
    locald = new com/google/android/gms/ads/d;
    locald.<init>(i1, 0, "search_v2");
    j = locald;
  }
  
  public d(int paramInt1, int paramInt2) {}
  
  d(int paramInt1, int paramInt2, String paramString)
  {
    int n;
    IllegalArgumentException localIllegalArgumentException;
    StringBuilder localStringBuilder;
    String str;
    if (paramInt1 < 0)
    {
      n = -1;
      if (paramInt1 != n)
      {
        n = -3;
        if (paramInt1 != n)
        {
          localIllegalArgumentException = new java/lang/IllegalArgumentException;
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>(37);
          str = "Invalid width for AdSize: " + paramInt1;
          localIllegalArgumentException.<init>(str);
          throw localIllegalArgumentException;
        }
      }
    }
    if (paramInt2 < 0)
    {
      n = -2;
      if (paramInt2 != n)
      {
        n = -4;
        if (paramInt2 != n)
        {
          localIllegalArgumentException = new java/lang/IllegalArgumentException;
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>(38);
          str = "Invalid height for AdSize: " + paramInt2;
          localIllegalArgumentException.<init>(str);
          throw localIllegalArgumentException;
        }
      }
    }
    k = paramInt1;
    l = paramInt2;
    m = paramString;
  }
  
  public final int a(Context paramContext)
  {
    int n = l;
    switch (n)
    {
    default: 
      ip.a();
      n = l;
      n = uk.a(paramContext, n);
    }
    for (;;)
    {
      return n;
      DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
      n = il.b(localDisplayMetrics);
      continue;
      n = -1;
    }
  }
  
  public final int b(Context paramContext)
  {
    int n = k;
    switch (n)
    {
    case -2: 
    default: 
      ip.a();
      n = k;
      n = uk.a(paramContext, n);
    }
    for (;;)
    {
      return n;
      DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
      n = il.a(localDisplayMetrics);
      continue;
      n = -1;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof d;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (d)paramObject;
        int n = k;
        int i1 = k;
        if (n == i1)
        {
          n = l;
          i1 = l;
          if (n == i1)
          {
            String str1 = m;
            String str2 = m;
            boolean bool3 = str1.equals(str2);
            if (bool3) {
              continue;
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public final int hashCode()
  {
    return m.hashCode();
  }
  
  public final String toString()
  {
    return m;
  }
}


/* Location:              com/google/android/gms/ads/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */