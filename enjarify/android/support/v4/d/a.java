package android.support.v4.d;

import android.graphics.Color;

public final class a
{
  private static final ThreadLocal a;
  
  static
  {
    ThreadLocal localThreadLocal = new java/lang/ThreadLocal;
    localThreadLocal.<init>();
    a = localThreadLocal;
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    int i = Color.alpha(paramInt2);
    int j = Color.alpha(paramInt1);
    int k = 255 - i;
    int m = 255 - j;
    k = k * m / 255;
    k = 255 - k;
    m = Color.red(paramInt1);
    int n = Color.red(paramInt2);
    m = a(m, j, n, i, k);
    n = Color.green(paramInt1);
    int i1 = Color.green(paramInt2);
    n = a(n, j, i1, i, k);
    i1 = Color.blue(paramInt1);
    int i2 = Color.blue(paramInt2);
    i = a(i1, j, i2, i, k);
    return Color.argb(k, m, n, i);
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i;
    if (paramInt5 == 0) {
      i = 0;
    }
    for (;;)
    {
      return i;
      i = paramInt1 * 255 * paramInt2;
      int j = paramInt3 * paramInt4;
      int k = 255 - paramInt2;
      j *= k;
      i += j;
      j = paramInt5 * 255;
      i /= j;
    }
  }
  
  public static int b(int paramInt1, int paramInt2)
  {
    if (paramInt2 >= 0)
    {
      i = 255;
      if (paramInt2 <= i) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("alpha must be between 0 and 255.");
      throw localIllegalArgumentException;
    }
    int i = 0xFFFFFF & paramInt1;
    int j = paramInt2 << 24;
    return i | j;
  }
}


/* Location:              android/support/v4/d/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */