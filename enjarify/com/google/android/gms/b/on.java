package com.google.android.gms.b;

import android.location.Location;
import com.google.android.gms.ads.b.c;
import com.google.android.gms.ads.b.c.a;
import com.google.android.gms.ads.j;
import com.google.android.gms.ads.j.a;
import com.google.android.gms.ads.mediation.l;
import java.util.Date;
import java.util.List;
import java.util.Set;

public final class on
  implements l
{
  private final Date a;
  private final int b;
  private final Set c;
  private final boolean d;
  private final Location e;
  private final int f;
  private final le g;
  private final List h;
  private final boolean i;
  
  public on(Date paramDate, int paramInt1, Set paramSet, Location paramLocation, boolean paramBoolean1, int paramInt2, le paramle, List paramList, boolean paramBoolean2)
  {
    a = paramDate;
    b = paramInt1;
    c = paramSet;
    e = paramLocation;
    d = paramBoolean1;
    f = paramInt2;
    g = paramle;
    h = paramList;
    i = paramBoolean2;
  }
  
  public final Date a()
  {
    return a;
  }
  
  public final int b()
  {
    return b;
  }
  
  public final Set c()
  {
    return c;
  }
  
  public final Location d()
  {
    return e;
  }
  
  public final int e()
  {
    return f;
  }
  
  public final boolean f()
  {
    return d;
  }
  
  public final boolean g()
  {
    return i;
  }
  
  public final c h()
  {
    Object localObject1 = g;
    if (localObject1 == null) {}
    for (localObject1 = null;; localObject1 = ((c.a)localObject1).a())
    {
      return (c)localObject1;
      localObject1 = new com/google/android/gms/ads/b/c$a;
      ((c.a)localObject1).<init>();
      boolean bool1 = g.b;
      a = bool1;
      int j = g.c;
      b = j;
      boolean bool2 = g.d;
      c = bool2;
      Object localObject2 = g;
      int k = a;
      int m = 2;
      if (k >= m)
      {
        localObject2 = g;
        k = e;
        e = k;
      }
      localObject2 = g;
      k = a;
      m = 3;
      if (k >= m)
      {
        localObject2 = g.f;
        if (localObject2 != null)
        {
          localObject2 = new com/google/android/gms/ads/j$a;
          ((j.a)localObject2).<init>();
          boolean bool3 = g.f.a;
          a = bool3;
          j localj = new com/google/android/gms/ads/j;
          localj.<init>((j.a)localObject2, (byte)0);
          d = localj;
        }
      }
    }
  }
  
  public final boolean i()
  {
    List localList = h;
    boolean bool;
    if (localList != null)
    {
      localList = h;
      String str = "2";
      bool = localList.contains(str);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localList = null;
    }
  }
  
  public final boolean j()
  {
    List localList = h;
    boolean bool;
    if (localList != null)
    {
      localList = h;
      String str = "1";
      bool = localList.contains(str);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localList = null;
    }
  }
}


/* Location:              com/google/android/gms/b/on.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */