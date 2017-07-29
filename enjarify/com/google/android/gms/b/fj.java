package com.google.android.gms.b;

import android.content.Context;
import java.lang.reflect.Method;

public final class fj
  extends gm
{
  private long i = -1;
  
  public fj(eu parameu, String paramString1, String paramString2, bf.a parama, int paramInt)
  {
    super(parameu, paramString1, paramString2, parama, paramInt, 12);
  }
  
  protected final void a()
  {
    long l1 = -1;
    Object localObject1 = e;
    ??? = Long.valueOf(l1);
    l = ((Long)???);
    long l2 = i;
    boolean bool = l2 < l1;
    Object localObject4;
    if (!bool)
    {
      localObject1 = f;
      ??? = null;
      int k = 1;
      localObject4 = new Object[k];
      Context localContext = b.a();
      localObject4[0] = localContext;
      localObject1 = (Integer)((Method)localObject1).invoke(null, (Object[])localObject4);
      int j = ((Integer)localObject1).intValue();
      l2 = j;
      i = l2;
    }
    synchronized (e)
    {
      localObject1 = e;
      l1 = i;
      localObject4 = Long.valueOf(l1);
      l = ((Long)localObject4);
      return;
    }
  }
}


/* Location:              com/google/android/gms/b/fj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */