package com.google.android.gms.b;

import java.util.Set;

public final class o
  extends g
{
  final com.google.android.gms.common.util.a<wn<?>> d;
  private x f;
  
  public final void a()
  {
    super.a();
    if (!d.isEmpty())
    {
      x localx = f;
      synchronized (x.b)
      {
        if (g != this)
        {
          g = this;
          h.clear();
          h.addAll(d);
        }
        return;
      }
    }
  }
  
  protected final void a(com.google.android.gms.common.a parama, int paramInt)
  {
    f.b(parama, paramInt);
  }
  
  public final void b()
  {
    super.b();
    x localx = f;
    synchronized (x.b)
    {
      if (g == this)
      {
        g = null;
        h.clear();
      }
      return;
    }
  }
  
  protected final void c()
  {
    f.b();
  }
}


/* Location:              com/google/android/gms/b/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */