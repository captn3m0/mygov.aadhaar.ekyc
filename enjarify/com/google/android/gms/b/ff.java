package com.google.android.gms.b;

import java.lang.reflect.Method;

public final class ff
  extends gm
{
  private long i;
  
  public ff(eu parameu, String paramString1, String paramString2, bf.a parama, long paramLong, int paramInt)
  {
    super(parameu, paramString1, paramString2, parama, paramInt, 25);
    i = paramLong;
  }
  
  protected final void a()
  {
    Object localObject1 = f;
    Long localLong1 = null;
    ??? = new Object[0];
    localObject1 = (Long)((Method)localObject1).invoke(null, (Object[])???);
    long l1 = ((Long)localObject1).longValue();
    synchronized (e)
    {
      bf.a locala = e;
      Long localLong2 = Long.valueOf(l1);
      ae = localLong2;
      long l2 = i;
      long l3 = 0L;
      boolean bool = l2 < l3;
      if (bool)
      {
        locala = e;
        l2 = i;
        l1 -= l2;
        localObject1 = Long.valueOf(l1);
        q = ((Long)localObject1);
        localObject1 = e;
        l2 = i;
        localLong1 = Long.valueOf(l2);
        v = localLong1;
      }
      return;
    }
  }
}


/* Location:              com/google/android/gms/b/ff.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */