package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.m;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
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
  
  public final f.a a(f.a parama)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("GoogleApiClient is not connected yet.");
    throw localIllegalStateException;
  }
  
  public final void a()
  {
    Object localObject1 = a.f.values();
    Object localObject2 = ((Collection)localObject1).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (a.f)((Iterator)localObject2).next();
      ((a.f)localObject1).a();
    }
    localObject1 = a.m;
    localObject2 = Collections.emptySet();
    f = ((Set)localObject2);
  }
  
  public final void a(int paramInt) {}
  
  public final void a(Bundle paramBundle) {}
  
  public final void a(com.google.android.gms.common.a parama, com.google.android.gms.common.api.a parama1, boolean paramBoolean) {}
  
  public final boolean b()
  {
    return true;
  }
  
  public final void c()
  {
    v localv = a;
    Object localObject1 = a;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = new com/google/android/gms/b/r;
      p localp = h;
      Map localMap = i;
      m localm = d;
      a.b localb = j;
      Lock localLock = a;
      Context localContext = c;
      ((r)localObject1).<init>(localv, localp, localMap, localm, localb, localLock, localContext);
      k = ((u)localObject1);
      localObject1 = k;
      ((u)localObject1).a();
      localObject1 = b;
      ((Condition)localObject1).signalAll();
      return;
    }
    finally
    {
      a.unlock();
    }
  }
}


/* Location:              com/google/android/gms/b/s.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */