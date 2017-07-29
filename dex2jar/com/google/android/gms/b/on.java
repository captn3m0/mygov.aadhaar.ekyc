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

@qi
public final class on
  implements l
{
  private final Date a;
  private final int b;
  private final Set<String> c;
  private final boolean d;
  private final Location e;
  private final int f;
  private final le g;
  private final List<String> h;
  private final boolean i;
  
  public on(Date paramDate, int paramInt1, Set<String> paramSet, Location paramLocation, boolean paramBoolean1, int paramInt2, le paramle, List<String> paramList, boolean paramBoolean2)
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
  
  public final Set<String> c()
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
    if (g == null) {
      return null;
    }
    c.a locala = new c.a();
    a = g.b;
    b = g.c;
    c = g.d;
    if (g.a >= 2) {
      e = g.e;
    }
    if ((g.a >= 3) && (g.f != null))
    {
      j.a locala1 = new j.a();
      a = g.f.a;
      d = new j(locala1, (byte)0);
    }
    return locala.a();
  }
  
  public final boolean i()
  {
    return (h != null) && (h.contains("2"));
  }
  
  public final boolean j()
  {
    return (h != null) && (h.contains("1"));
  }
}


/* Location:              com/google/android/gms/b/on.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */