package com.google.android.gms.b;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.g;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class at
{
  public static final Status a = new Status(8, "The connection to Google Play services was lost");
  static final h<?>[] b = new h[0];
  final Set<h<?>> c = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
  private final a d = new a()
  {
    public final void a(h<?> paramAnonymoush)
    {
      c.remove(paramAnonymoush);
    }
  };
  private final Map<a.d<?>, a.f> e;
  
  public at(Map<a.d<?>, a.f> paramMap)
  {
    e = paramMap;
  }
  
  public final void a()
  {
    h[] arrayOfh = (h[])c.toArray(b);
    int j = arrayOfh.length;
    int i = 0;
    while (i < j)
    {
      h localh = arrayOfh[i];
      localh.a(null);
      if (localh.c()) {
        c.remove(localh);
      }
      i += 1;
    }
  }
  
  final void a(h<? extends g> paramh)
  {
    c.add(paramh);
    paramh.a(d);
  }
  
  static abstract interface a
  {
    public abstract void a(h<?> paramh);
  }
}


/* Location:              com/google/android/gms/b/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */