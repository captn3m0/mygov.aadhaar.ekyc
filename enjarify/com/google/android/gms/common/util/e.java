package com.google.android.gms.common.util;

import android.os.SystemClock;

public final class e
  implements c
{
  private static e a;
  
  static
  {
    e locale = new com/google/android/gms/common/util/e;
    locale.<init>();
    a = locale;
  }
  
  public static c d()
  {
    return a;
  }
  
  public final long a()
  {
    return System.currentTimeMillis();
  }
  
  public final long b()
  {
    return SystemClock.elapsedRealtime();
  }
  
  public final long c()
  {
    return System.nanoTime();
  }
}


/* Location:              com/google/android/gms/common/util/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */