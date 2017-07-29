package com.google.android.gms.b;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.List;

public final class fl
  extends gm
{
  private List i = null;
  
  public fl(eu parameu, String paramString1, String paramString2, bf.a parama, int paramInt)
  {
    super(parameu, paramString1, paramString2, parama, paramInt, 31);
  }
  
  protected final void a()
  {
    long l1 = -1;
    int j = 1;
    Object localObject1 = e;
    ??? = Long.valueOf(l1);
    y = ((Long)???);
    localObject1 = e;
    ??? = Long.valueOf(l1);
    z = ((Long)???);
    localObject1 = i;
    int k;
    Object localObject4;
    Context localContext;
    if (localObject1 == null)
    {
      localObject1 = f;
      k = 0;
      ??? = null;
      localObject4 = new Object[j];
      localContext = b.a();
      localObject4[0] = localContext;
      localObject1 = (List)((Method)localObject1).invoke(null, (Object[])localObject4);
      i = ((List)localObject1);
    }
    localObject1 = i;
    if (localObject1 != null)
    {
      localObject1 = i;
      int m = ((List)localObject1).size();
      k = 2;
      if (m != k) {}
    }
    synchronized (e)
    {
      localObject4 = e;
      localObject1 = i;
      int n = 0;
      localContext = null;
      localObject1 = ((List)localObject1).get(0);
      localObject1 = (Long)localObject1;
      long l2 = ((Long)localObject1).longValue();
      localObject1 = Long.valueOf(l2);
      y = ((Long)localObject1);
      localObject4 = e;
      localObject1 = i;
      n = 1;
      localObject1 = ((List)localObject1).get(n);
      localObject1 = (Long)localObject1;
      l2 = ((Long)localObject1).longValue();
      localObject1 = Long.valueOf(l2);
      z = ((Long)localObject1);
      return;
    }
  }
}


/* Location:              com/google/android/gms/b/fl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */