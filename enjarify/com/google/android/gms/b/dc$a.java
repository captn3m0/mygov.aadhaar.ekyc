package com.google.android.gms.b;

import com.google.android.gms.common.internal.c;
import java.util.ArrayList;
import java.util.List;

final class dc$a
  implements cg.b
{
  du.e a;
  List b;
  List c;
  long d;
  
  private dc$a(dc paramdc) {}
  
  private static long a(du.b paramb)
  {
    long l = 60;
    return c.longValue() / 1000L / l / l;
  }
  
  public final void a(du.e parame)
  {
    c.a(parame);
    a = parame;
  }
  
  public final boolean a(long paramLong, du.b paramb)
  {
    c.a(paramb);
    Object localObject = c;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      c = ((List)localObject);
    }
    localObject = b;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      b = ((List)localObject);
    }
    localObject = c;
    int i = ((List)localObject).size();
    long l1;
    long l2;
    boolean bool;
    if (i > 0)
    {
      localObject = (du.b)c.get(0);
      l1 = a((du.b)localObject);
      l2 = a(paramb);
      bool = l1 < l2;
      if (bool)
      {
        bool = false;
        localObject = null;
      }
    }
    for (;;)
    {
      return bool;
      l1 = d;
      l2 = paramb.f();
      l1 += l2;
      l2 = cf.af();
      bool = l1 < l2;
      if (!bool)
      {
        bool = false;
        localObject = null;
      }
      else
      {
        d = l1;
        c.add(paramb);
        localObject = b;
        Long localLong = Long.valueOf(paramLong);
        ((List)localObject).add(localLong);
        localObject = c;
        int j = ((List)localObject).size();
        int k = cf.ag();
        if (j >= k)
        {
          j = 0;
          localObject = null;
        }
        else
        {
          j = 1;
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/b/dc$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */