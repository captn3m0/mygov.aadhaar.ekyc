package com.google.android.gms.b;

import java.util.Collection;
import java.util.Set;

public final class o
  extends g
{
  final com.google.android.gms.common.util.a d;
  private x f;
  
  public final void a()
  {
    super.a();
    Object localObject1 = d;
    boolean bool = ((com.google.android.gms.common.util.a)localObject1).isEmpty();
    if (!bool) {
      localObject1 = f;
    }
    synchronized (x.b)
    {
      Object localObject4 = g;
      if (localObject4 != this)
      {
        g = this;
        localObject4 = h;
        ((Set)localObject4).clear();
        localObject1 = h;
        localObject4 = d;
        ((Set)localObject1).addAll((Collection)localObject4);
      }
      return;
    }
  }
  
  protected final void a(com.google.android.gms.common.a parama, int paramInt)
  {
    f.b(parama, paramInt);
  }
  
  public final void b()
  {
    super.b();
    Object localObject1 = f;
    synchronized (x.b)
    {
      o localo = g;
      if (localo == this)
      {
        localo = null;
        g = null;
        localObject1 = h;
        ((Set)localObject1).clear();
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
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */