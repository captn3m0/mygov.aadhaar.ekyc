package com.google.android.gms.b;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.g;
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
  
  public final <A extends a.c, T extends f.a<? extends g, A>> T a(T paramT)
  {
    try
    {
      a.m.k.a(paramT);
      Object localObject1 = a.m;
      Object localObject2 = a;
      localObject2 = (a.f)e.get(localObject2);
      c.a(localObject2, "Appropriate Api was not requested.");
      if ((!((a.f)localObject2).b()) && (a.g.containsKey(a)))
      {
        paramT.a(new Status(17));
        return paramT;
      }
      localObject1 = localObject2;
      if ((localObject2 instanceof h)) {
        localObject1 = a;
      }
      paramT.a((a.c)localObject1);
      return paramT;
    }
    catch (DeadObjectException localDeadObjectException)
    {
      a.a(new v.a(this)
      {
        public final void a()
        {
          a(1);
        }
      });
    }
    return paramT;
  }
  
  public final void a() {}
  
  public final void a(int paramInt)
  {
    a.a(null);
    a.n.a(paramInt, b);
  }
  
  public final void a(Bundle paramBundle) {}
  
  public final void a(com.google.android.gms.common.a parama, com.google.android.gms.common.api.a<?> parama1, boolean paramBoolean) {}
  
  public final boolean b()
  {
    if (b) {
      return false;
    }
    if (a.m.f())
    {
      b = true;
      Iterator localIterator = a.m.j.iterator();
      while (localIterator.hasNext()) {
        nextc = null;
      }
      return false;
    }
    a.a(null);
    return true;
  }
  
  public final void c()
  {
    if (b)
    {
      b = false;
      a.a(new v.a(this)
      {
        public final void a()
        {
          a.n.a(null);
        }
      });
    }
  }
}


/* Location:              com/google/android/gms/b/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */