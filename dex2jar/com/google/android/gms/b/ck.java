package com.google.android.gms.b;

import com.google.android.gms.common.internal.c;

final class ck
{
  final String a;
  final String b;
  final long c;
  final long d;
  final long e;
  
  ck(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3)
  {
    c.a(paramString1);
    c.a(paramString2);
    if (paramLong1 >= 0L)
    {
      bool1 = true;
      c.b(bool1);
      if (paramLong2 < 0L) {
        break label81;
      }
    }
    label81:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      c.b(bool1);
      a = paramString1;
      b = paramString2;
      c = paramLong1;
      d = paramLong2;
      e = paramLong3;
      return;
      bool1 = false;
      break;
    }
  }
  
  final ck a()
  {
    return new ck(a, b, c + 1L, d + 1L, e);
  }
  
  final ck a(long paramLong)
  {
    return new ck(a, b, c, d, paramLong);
  }
}


/* Location:              com/google/android/gms/b/ck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */