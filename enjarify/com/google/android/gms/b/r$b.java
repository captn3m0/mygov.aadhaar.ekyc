package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.internal.o.f;
import com.google.android.gms.common.m;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class r$b
  extends r.f
{
  private final Map c;
  
  public r$b(r paramr, Map paramMap)
  {
    super(paramr, (byte)0);
    c = paramMap;
  }
  
  public final void a()
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = c.keySet().iterator();
    boolean bool1 = false;
    Object localObject3 = null;
    float f1 = 0.0F;
    int j = ((Iterator)localObject2).hasNext();
    float f2;
    Object localObject4;
    if (j != 0)
    {
      localObject3 = (a.f)((Iterator)localObject2).next();
      j = 1;
      f2 = Float.MIN_VALUE;
      localObject4 = c;
      localObject3 = (r.a)((Map)localObject4).get(localObject3);
      bool1 = a;
      if (bool1) {}
    }
    for (;;)
    {
      if (j != 0)
      {
        localObject3 = a.d;
        localObject1 = a.c;
        i = ((m)localObject3).a((Context)localObject1);
        j = i;
      }
      while (j != 0)
      {
        localObject3 = new com/google/android/gms/common/a;
        i = 0;
        ((a)localObject3).<init>(j, null);
        localObject1 = a.a;
        r.b.1 local1 = new com/google/android/gms/b/r$b$1;
        localObject2 = a;
        local1.<init>(this, (u)localObject2, (a)localObject3);
        ((v)localObject1).a(local1);
        return;
        bool2 = false;
        local1 = null;
        f2 = 0.0F;
      }
      localObject3 = a;
      bool1 = f;
      if (bool1)
      {
        localObject3 = a.e;
        ((ec)localObject3).i();
      }
      localObject3 = c.keySet();
      localObject2 = ((Set)localObject3).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        localObject3 = ((Iterator)localObject2).next();
        localObject1 = localObject3;
        localObject1 = (a.f)localObject3;
        localObject3 = (o.f)c.get(localObject1);
        if (bool2)
        {
          localObject1 = a.a;
          localObject4 = new com/google/android/gms/b/r$b$2;
          r localr = a;
          ((r.b.2)localObject4).<init>(localr, (o.f)localObject3);
          ((v)localObject1).a((v.a)localObject4);
        }
        else
        {
          ((a.f)localObject1).a((o.f)localObject3);
        }
      }
      bool1 = bool2;
      f1 = f2;
      break;
      boolean bool2 = bool1;
      f2 = f1;
    }
  }
}


/* Location:              com/google/android/gms/b/r$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */