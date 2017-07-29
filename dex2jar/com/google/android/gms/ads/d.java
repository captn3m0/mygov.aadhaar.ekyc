package com.google.android.gms.ads;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.b.il;
import com.google.android.gms.b.ip;
import com.google.android.gms.b.uk;

public final class d
{
  public static final d a = new d(320, 50, "320x50_mb");
  public static final d b = new d(468, 60, "468x60_as");
  public static final d c = new d(320, 100, "320x100_as");
  public static final d d = new d(728, 90, "728x90_as");
  public static final d e = new d(300, 250, "300x250_as");
  public static final d f = new d(160, 600, "160x600_as");
  public static final d g = new d(-1, -2, "smart_banner");
  public static final d h = new d(-3, -4, "fluid");
  public static final d i = new d(50, 50, "50x50_mb");
  public static final d j = new d(-3, 0, "search_v2");
  public final int k;
  public final int l;
  private final String m;
  
  public d(int paramInt1, int paramInt2) {}
  
  d(int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 < 0) && (paramInt1 != -1) && (paramInt1 != -3)) {
      throw new IllegalArgumentException(37 + "Invalid width for AdSize: " + paramInt1);
    }
    if ((paramInt2 < 0) && (paramInt2 != -2) && (paramInt2 != -4)) {
      throw new IllegalArgumentException(38 + "Invalid height for AdSize: " + paramInt2);
    }
    k = paramInt1;
    l = paramInt2;
    m = paramString;
  }
  
  public final int a(Context paramContext)
  {
    switch (l)
    {
    default: 
      ip.a();
      return uk.a(paramContext, l);
    case -2: 
      return il.b(paramContext.getResources().getDisplayMetrics());
    }
    return -1;
  }
  
  public final int b(Context paramContext)
  {
    switch (k)
    {
    case -2: 
    default: 
      ip.a();
      return uk.a(paramContext, k);
    case -1: 
      return il.a(paramContext.getResources().getDisplayMetrics());
    }
    return -1;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof d)) {
        return false;
      }
      paramObject = (d)paramObject;
    } while ((k == k) && (l == l) && (m.equals(m)));
    return false;
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */