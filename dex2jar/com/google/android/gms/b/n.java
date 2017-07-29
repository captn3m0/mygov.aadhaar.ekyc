package com.google.android.gms.b;

import com.google.android.gms.c.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d.a;
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
  final Map<h<?>, Boolean> a = Collections.synchronizedMap(new WeakHashMap());
  final Map<c<?>, Boolean> b = Collections.synchronizedMap(new WeakHashMap());
  
  final void a(boolean paramBoolean, Status paramStatus)
  {
    Object localObject2;
    synchronized (a)
    {
      localObject2 = new HashMap(a);
    }
    synchronized (b)
    {
      ??? = new HashMap(b);
      localObject2 = ((Map)localObject2).entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        ??? = (Map.Entry)((Iterator)localObject2).next();
        if ((paramBoolean) || (((Boolean)((Map.Entry)???).getValue()).booleanValue()))
        {
          ((h)((Map.Entry)???).getKey()).b(paramStatus);
          continue;
          paramStatus = finally;
          throw paramStatus;
        }
      }
    }
    ??? = ((Map)???).entrySet().iterator();
    while (((Iterator)???).hasNext())
    {
      localObject2 = (Map.Entry)((Iterator)???).next();
      if ((paramBoolean) || (((Boolean)((Map.Entry)localObject2).getValue()).booleanValue())) {
        ((c)((Map.Entry)localObject2).getKey()).a(new l(paramStatus));
      }
    }
  }
}


/* Location:              com/google/android/gms/b/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */