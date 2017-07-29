package com.google.android.gms.b;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.e.a;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public final class jj
{
  final Date a;
  final String b;
  final int c;
  final Set d;
  final Location e;
  final boolean f;
  final Bundle g;
  public final Map h;
  final String i;
  final String j;
  final a k;
  final int l;
  final Set m;
  final Bundle n;
  final Set o;
  final boolean p;
  
  public jj(jj.a parama)
  {
    this(parama, (byte)0);
  }
  
  private jj(jj.a parama, byte paramByte)
  {
    Object localObject = g;
    a = ((Date)localObject);
    localObject = h;
    b = ((String)localObject);
    int i1 = i;
    c = i1;
    localObject = Collections.unmodifiableSet(a);
    d = ((Set)localObject);
    localObject = j;
    e = ((Location)localObject);
    boolean bool1 = k;
    f = bool1;
    localObject = b;
    g = ((Bundle)localObject);
    localObject = Collections.unmodifiableMap(c);
    h = ((Map)localObject);
    localObject = l;
    i = ((String)localObject);
    localObject = m;
    j = ((String)localObject);
    k = null;
    int i2 = n;
    l = i2;
    localObject = Collections.unmodifiableSet(d);
    m = ((Set)localObject);
    localObject = e;
    n = ((Bundle)localObject);
    localObject = Collections.unmodifiableSet(f);
    o = ((Set)localObject);
    boolean bool2 = o;
    p = bool2;
  }
}


/* Location:              com/google/android/gms/b/jj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */