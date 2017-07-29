package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.c;

public final class ue
{
  private long a;
  private long b = Long.MIN_VALUE;
  private Object c;
  
  public ue(long paramLong)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    c = localObject;
    a = paramLong;
  }
  
  public final boolean a()
  {
    synchronized (c)
    {
      c localc = w.k();
      long l1 = localc.b();
      long l2 = b;
      long l3 = a;
      l2 += l3;
      boolean bool = l2 < l1;
      if (bool)
      {
        bool = false;
        localc = null;
        return bool;
      }
      b = l1;
      bool = true;
    }
  }
}


/* Location:              com/google/android/gms/b/ue.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */