package com.google.android.gms.b;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.p.a;
import com.google.android.gms.common.internal.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class r$c
  extends r.f
{
  private final ArrayList c;
  
  public r$c(r paramr, ArrayList paramArrayList)
  {
    super(paramr, (byte)0);
    c = paramArrayList;
  }
  
  public final void a()
  {
    Object localObject1 = a.a.m;
    Object localObject2 = a;
    Object localObject3 = k;
    if (localObject3 == null) {}
    Object localObject4;
    for (localObject3 = Collections.emptySet();; localObject3 = localObject4)
    {
      f = ((Set)localObject3);
      localObject3 = c;
      localObject4 = ((ArrayList)localObject3).iterator();
      boolean bool1;
      for (;;)
      {
        bool1 = ((Iterator)localObject4).hasNext();
        if (!bool1) {
          break;
        }
        localObject3 = (a.f)((Iterator)localObject4).next();
        localObject1 = a.h;
        localObject2 = a.a.m.f;
        ((a.f)localObject3).a((z)localObject1, (Set)localObject2);
      }
      localObject4 = new java/util/HashSet;
      localObject3 = k.b;
      ((HashSet)localObject4).<init>((Collection)localObject3);
      Map localMap1 = k.d;
      localObject3 = localMap1.keySet();
      Iterator localIterator = ((Set)localObject3).iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject3 = (a)localIterator.next();
        Map localMap2 = a.g;
        a.d locald = ((a)localObject3).b();
        boolean bool2 = localMap2.containsKey(locald);
        if (!bool2)
        {
          localObject3 = geta;
          ((Set)localObject4).addAll((Collection)localObject3);
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/b/r$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */