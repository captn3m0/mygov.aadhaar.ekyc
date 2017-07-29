package com.google.android.gms.b;

import android.os.Bundle;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.g;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class s
  implements u
{
  private final v a;
  
  public s(v paramv)
  {
    a = paramv;
  }
  
  public final <A extends a.c, T extends f.a<? extends g, A>> T a(T paramT)
  {
    throw new IllegalStateException("GoogleApiClient is not connected yet.");
  }
  
  public final void a()
  {
    Iterator localIterator = a.f.values().iterator();
    while (localIterator.hasNext()) {
      ((a.f)localIterator.next()).a();
    }
    a.m.f = Collections.emptySet();
  }
  
  public final void a(int paramInt) {}
  
  public final void a(Bundle paramBundle) {}
  
  public final void a(com.google.android.gms.common.a parama, com.google.android.gms.common.api.a<?> parama1, boolean paramBoolean) {}
  
  public final boolean b()
  {
    return true;
  }
  
  public final void c()
  {
    v localv = a;
    a.lock();
    try
    {
      k = new r(localv, h, i, d, j, a, c);
      k.a();
      b.signalAll();
      return;
    }
    finally
    {
      a.unlock();
    }
  }
}


/* Location:              com/google/android/gms/b/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */