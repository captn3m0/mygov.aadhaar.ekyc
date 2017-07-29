package com.google.ads;

import com.google.android.gms.ads.d;

@Deprecated
public final class b
{
  public static final b b = new b(-1, -2);
  public static final b c = new b(320, 50);
  public static final b d = new b(300, 250);
  public static final b e = new b(468, 60);
  public static final b f = new b(728, 90);
  public static final b g = new b(160, 600);
  public final d a;
  
  private b(int paramInt1, int paramInt2)
  {
    this(new d(paramInt1, paramInt2));
  }
  
  public b(d paramd)
  {
    a = paramd;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    return a.equals(a);
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */