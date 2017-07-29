package com.google.android.gms.b;

import com.google.android.gms.c.c;
import com.google.android.gms.c.h;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import java.util.Iterator;
import java.util.Set;

public final class d
{
  final android.support.v4.g.a<wn<?>, com.google.android.gms.common.a> a = new android.support.v4.g.a();
  final c<Void> b = new c();
  private int c;
  private boolean d = false;
  
  public d(Iterable<? extends n<?>> paramIterable)
  {
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      n localn = (n)paramIterable.next();
      a.put(b, null);
    }
    c = a.keySet().size();
  }
  
  public final void a(wn<?> paramwn, com.google.android.gms.common.a parama)
  {
    a.put(paramwn, parama);
    c -= 1;
    if (!parama.b()) {
      d = true;
    }
    if (c == 0)
    {
      if (d)
      {
        paramwn = new m(a);
        b.a.a(paramwn);
      }
    }
    else {
      return;
    }
    b.a();
  }
}


/* Location:              com/google/android/gms/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */