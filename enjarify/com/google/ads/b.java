package com.google.ads;

import com.google.android.gms.ads.d;

public final class b
{
  public static final b b;
  public static final b c;
  public static final b d;
  public static final b e;
  public static final b f;
  public static final b g;
  public final d a;
  
  static
  {
    b localb = new com/google/ads/b;
    localb.<init>(-1, -2);
    b = localb;
    localb = new com/google/ads/b;
    localb.<init>(320, 50);
    c = localb;
    localb = new com/google/ads/b;
    localb.<init>(300, 250);
    d = localb;
    localb = new com/google/ads/b;
    localb.<init>(468, 60);
    e = localb;
    localb = new com/google/ads/b;
    localb.<init>(728, 90);
    f = localb;
    localb = new com/google/ads/b;
    localb.<init>(160, 600);
    g = localb;
  }
  
  private b(int paramInt1, int paramInt2)
  {
    this(locald);
  }
  
  public b(d paramd)
  {
    a = paramd;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof b;
    d locald1;
    if (!bool)
    {
      bool = false;
      locald1 = null;
    }
    for (;;)
    {
      return bool;
      paramObject = (b)paramObject;
      locald1 = a;
      d locald2 = a;
      bool = locald1.equals(locald2);
    }
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final String toString()
  {
    return a.toString();
  }
}


/* Location:              com/google/ads/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */