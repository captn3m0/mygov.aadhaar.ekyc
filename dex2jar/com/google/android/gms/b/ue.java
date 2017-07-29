package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.c;

@qi
public final class ue
{
  private long a;
  private long b = Long.MIN_VALUE;
  private Object c = new Object();
  
  public ue(long paramLong)
  {
    a = paramLong;
  }
  
  public final boolean a()
  {
    synchronized (c)
    {
      long l = w.k().b();
      if (b + a > l) {
        return false;
      }
      b = l;
      return true;
    }
  }
}


/* Location:              com/google/android/gms/b/ue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */