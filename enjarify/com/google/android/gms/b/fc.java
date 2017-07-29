package com.google.android.gms.b;

import java.lang.reflect.Method;

public final class fc
  extends gm
{
  public fc(eu parameu, String paramString1, String paramString2, bf.a parama, int paramInt)
  {
    super(parameu, paramString1, paramString2, parama, paramInt, 5);
  }
  
  protected final void a()
  {
    long l1 = -1;
    int i = 1;
    Object localObject1 = e;
    ??? = Long.valueOf(l1);
    e = ((Long)???);
    localObject1 = e;
    ??? = Long.valueOf(l1);
    f = ((Long)???);
    localObject1 = f;
    Object localObject4 = new Object[i];
    Object localObject5 = b.a();
    localObject4[0] = localObject5;
    localObject1 = (int[])((Method)localObject1).invoke(null, (Object[])localObject4);
    synchronized (e)
    {
      localObject4 = e;
      int j = 0;
      localObject5 = null;
      j = localObject1[0];
      long l2 = j;
      localObject5 = Long.valueOf(l2);
      e = ((Long)localObject5);
      localObject4 = e;
      j = 1;
      int k = localObject1[j];
      l2 = k;
      localObject1 = Long.valueOf(l2);
      f = ((Long)localObject1);
      return;
    }
  }
}


/* Location:              com/google/android/gms/b/fc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */