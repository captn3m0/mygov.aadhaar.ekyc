package com.google.android.gms.b;

import com.google.android.gms.common.internal.c;

public final class nj$d
  extends uw
{
  ty a;
  private final Object e;
  private boolean f;
  private int g;
  
  public nj$d(ty paramty)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    e = localObject;
    a = paramty;
    f = false;
    g = 0;
  }
  
  private void d()
  {
    synchronized (e)
    {
      int i = g;
      if (i >= 0) {
        i = 1;
      }
      for (;;)
      {
        c.a(i);
        boolean bool = f;
        if (!bool) {
          break;
        }
        int j = g;
        if (j != 0) {
          break;
        }
        localObject2 = "No reference is left (including root). Cleaning up engine.";
        tp.a((String)localObject2);
        localObject2 = new com/google/android/gms/b/nj$d$3;
        ((nj.d.3)localObject2).<init>(this);
        uv.b localb = new com/google/android/gms/b/uv$b;
        localb.<init>();
        a((uv.c)localObject2, localb);
        return;
        j = 0;
        localObject2 = null;
      }
      Object localObject2 = "There are still references to the engine. Not destroying.";
      tp.a((String)localObject2);
    }
  }
  
  public final void c()
  {
    boolean bool = true;
    synchronized (e)
    {
      int i = g;
      if (i >= 0)
      {
        c.a(bool);
        str = "Releasing root reference. JS Engine will be destroyed once other references are released.";
        tp.a(str);
        bool = true;
        f = bool;
        d();
        return;
      }
      bool = false;
      String str = null;
    }
  }
  
  public final nj.c h_()
  {
    nj.c localc = new com/google/android/gms/b/nj$c;
    localc.<init>(this);
    synchronized (e)
    {
      nj.d.1 local1 = new com/google/android/gms/b/nj$d$1;
      local1.<init>(localc);
      nj.d.2 local2 = new com/google/android/gms/b/nj$d$2;
      local2.<init>(localc);
      a(local1, local2);
      int i = g;
      if (i >= 0)
      {
        i = 1;
        c.a(i);
        j = g + 1;
        g = j;
        return localc;
      }
      int j = 0;
      local1 = null;
    }
  }
  
  protected final void i_()
  {
    synchronized (e)
    {
      int i = g;
      if (i > 0)
      {
        i = 1;
        c.a(i);
        str = "Releasing 1 reference for JS Engine";
        tp.a(str);
        j = g + -1;
        g = j;
        d();
        return;
      }
      int j = 0;
      String str = null;
    }
  }
}


/* Location:              com/google/android/gms/b/nj$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */