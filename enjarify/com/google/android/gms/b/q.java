package com.google.android.gms.b;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.h;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class q
  implements u
{
  final v a;
  boolean b = false;
  
  public q(v paramv)
  {
    a = paramv;
  }
  
  public final f.a a(f.a parama)
  {
    for (;;)
    {
      try
      {
        localObject1 = a;
        localObject1 = m;
        localObject1 = k;
        ((at)localObject1).a(parama);
        localObject1 = a;
        localObject1 = m;
        localObject2 = a;
        localObject1 = e;
        localObject1 = ((Map)localObject1).get(localObject2);
        localObject1 = (a.f)localObject1;
        localObject2 = "Appropriate Api was not requested.";
        c.a(localObject1, localObject2);
        boolean bool1 = ((a.f)localObject1).b();
        if (bool1) {
          continue;
        }
        localObject2 = a;
        localObject2 = g;
        a.d locald = a;
        bool1 = ((Map)localObject2).containsKey(locald);
        if (!bool1) {
          continue;
        }
        localObject1 = new com/google/android/gms/common/api/Status;
        int i = 17;
        ((Status)localObject1).<init>(i);
        parama.a((Status)localObject1);
      }
      catch (DeadObjectException localDeadObjectException)
      {
        Object localObject1;
        boolean bool2;
        v localv = a;
        Object localObject2 = new com/google/android/gms/b/q$1;
        ((q.1)localObject2).<init>(this, this);
        localv.a((v.a)localObject2);
        continue;
      }
      return parama;
      bool2 = localObject1 instanceof h;
      if (bool2)
      {
        localObject1 = (h)localObject1;
        localObject1 = a;
      }
      parama.a((a.c)localObject1);
    }
  }
  
  public final void a() {}
  
  public final void a(int paramInt)
  {
    a.a(null);
    ac.a locala = a.n;
    boolean bool = b;
    locala.a(paramInt, bool);
  }
  
  public final void a(Bundle paramBundle) {}
  
  public final void a(com.google.android.gms.common.a parama, com.google.android.gms.common.api.a parama1, boolean paramBoolean) {}
  
  public final boolean b()
  {
    boolean bool1 = true;
    v localv = null;
    boolean bool2 = b;
    Object localObject1;
    if (bool2)
    {
      bool1 = false;
      localObject1 = null;
    }
    for (;;)
    {
      return bool1;
      Object localObject2 = a.m;
      bool2 = ((t)localObject2).f();
      if (bool2)
      {
        b = bool1;
        localObject1 = a.m.j;
        localObject2 = ((Set)localObject1).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject2).hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = (as)((Iterator)localObject2).next();
          c = null;
        }
        bool1 = false;
        localObject1 = null;
      }
      else
      {
        localv = a;
        localv.a(null);
      }
    }
  }
  
  public final void c()
  {
    boolean bool = b;
    if (bool)
    {
      bool = false;
      b = false;
      v localv = a;
      q.2 local2 = new com/google/android/gms/b/q$2;
      local2.<init>(this, this);
      localv.a(local2);
    }
  }
}


/* Location:              com/google/android/gms/b/q.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */