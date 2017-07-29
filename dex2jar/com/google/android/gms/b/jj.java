package com.google.android.gms.b;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.e.a;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@qi
public final class jj
{
  final Date a;
  final String b;
  final int c;
  final Set<String> d;
  final Location e;
  final boolean f;
  final Bundle g;
  public final Map<Class<? extends Object>, Object> h;
  final String i;
  final String j;
  final a k;
  final int l;
  final Set<String> m;
  final Bundle n;
  final Set<String> o;
  final boolean p;
  
  public jj(a parama)
  {
    this(parama, (byte)0);
  }
  
  private jj(a parama, byte paramByte)
  {
    a = g;
    b = h;
    c = i;
    d = Collections.unmodifiableSet(a);
    e = j;
    f = k;
    g = b;
    h = Collections.unmodifiableMap(c);
    i = l;
    j = m;
    k = null;
    l = n;
    m = Collections.unmodifiableSet(d);
    n = e;
    o = Collections.unmodifiableSet(f);
    p = o;
  }
  
  public static final class a
  {
    public final HashSet<String> a = new HashSet();
    public final Bundle b = new Bundle();
    final HashMap<Class<? extends Object>, Object> c = new HashMap();
    public final HashSet<String> d = new HashSet();
    final Bundle e = new Bundle();
    final HashSet<String> f = new HashSet();
    public Date g;
    String h;
    public int i = -1;
    public Location j;
    boolean k = false;
    String l;
    String m;
    public int n = -1;
    public boolean o;
    
    public final void a(String paramString)
    {
      d.add(paramString);
    }
  }
}


/* Location:              com/google/android/gms/b/jj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */