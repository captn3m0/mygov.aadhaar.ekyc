package com.google.android.gms.b;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class at
{
  public static final Status a;
  static final h[] b = new h[0];
  final Set c;
  private final at.a d;
  private final Map e;
  
  static
  {
    Status localStatus = new com/google/android/gms/common/api/Status;
    localStatus.<init>(8, "The connection to Google Play services was lost");
    a = localStatus;
  }
  
  public at(Map paramMap)
  {
    Object localObject = new java/util/WeakHashMap;
    ((WeakHashMap)localObject).<init>();
    localObject = Collections.synchronizedSet(Collections.newSetFromMap((Map)localObject));
    c = ((Set)localObject);
    localObject = new com/google/android/gms/b/at$1;
    ((at.1)localObject).<init>(this);
    d = ((at.a)localObject);
    e = paramMap;
  }
  
  public final void a()
  {
    Object localObject1 = c;
    h[] arrayOfh = b;
    localObject1 = (h[])((Set)localObject1).toArray(arrayOfh);
    int i = localObject1.length;
    int j = 0;
    arrayOfh = null;
    while (j < i)
    {
      Object localObject2 = localObject1[j];
      Set localSet = null;
      ((h)localObject2).a(null);
      boolean bool = ((h)localObject2).c();
      if (bool)
      {
        localSet = c;
        localSet.remove(localObject2);
      }
      j += 1;
    }
  }
  
  final void a(h paramh)
  {
    c.add(paramh);
    at.a locala = d;
    paramh.a(locala);
  }
}


/* Location:              com/google/android/gms/b/at.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */