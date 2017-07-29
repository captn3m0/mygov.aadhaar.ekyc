package com.google.android.gms.b;

import com.google.android.gms.c.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public final class n
{
  final Map a;
  final Map b;
  
  public n()
  {
    Object localObject = new java/util/WeakHashMap;
    ((WeakHashMap)localObject).<init>();
    localObject = Collections.synchronizedMap((Map)localObject);
    a = ((Map)localObject);
    localObject = new java/util/WeakHashMap;
    ((WeakHashMap)localObject).<init>();
    localObject = Collections.synchronizedMap((Map)localObject);
    b = ((Map)localObject);
  }
  
  final void a(boolean paramBoolean, Status paramStatus)
  {
    Object localObject2;
    synchronized (a)
    {
      localObject2 = new java/util/HashMap;
      localObject6 = a;
      ((HashMap)localObject2).<init>((Map)localObject6);
    }
    boolean bool1;
    synchronized (b)
    {
      localObject6 = new java/util/HashMap;
      Object localObject7 = b;
      ((HashMap)localObject6).<init>((Map)localObject7);
      localObject2 = ((Map)localObject2).entrySet();
      localObject7 = ((Set)localObject2).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject7).hasNext();
        if (!bool1) {
          break;
        }
        localObject2 = ((Iterator)localObject7).next();
        ??? = localObject2;
        ??? = (Map.Entry)localObject2;
        if (!paramBoolean)
        {
          localObject2 = (Boolean)((Map.Entry)???).getValue();
          bool1 = ((Boolean)localObject2).booleanValue();
          if (!bool1) {}
        }
        else
        {
          localObject2 = (h)((Map.Entry)???).getKey();
          ((h)localObject2).b(paramStatus);
        }
      }
      localObject3 = finally;
      throw ((Throwable)localObject3);
    }
    Object localObject5 = ((Map)localObject6).entrySet();
    Object localObject6 = ((Set)localObject5).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject6).hasNext();
      if (!bool1) {
        break;
      }
      localObject5 = (Map.Entry)((Iterator)localObject6).next();
      if (!paramBoolean)
      {
        ??? = (Boolean)((Map.Entry)localObject5).getValue();
        boolean bool2 = ((Boolean)???).booleanValue();
        if (!bool2) {}
      }
      else
      {
        localObject5 = (c)((Map.Entry)localObject5).getKey();
        ??? = new com/google/android/gms/common/api/l;
        ((l)???).<init>(paramStatus);
        ((c)localObject5).a((Exception)???);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */