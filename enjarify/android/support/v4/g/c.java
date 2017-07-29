package android.support.v4.g;

public final class c
{
  static final int[] a = new int[0];
  static final long[] b = new long[0];
  static final Object[] c = new Object[0];
  
  public static int a(int paramInt)
  {
    return c(paramInt * 4) / 4;
  }
  
  public static int a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = paramInt1 + -1;
    int k = 0;
    while (k <= j)
    {
      i = k + j >>> 1;
      int m = paramArrayOfInt[i];
      if (m < paramInt2)
      {
        i += 1;
        k = i;
      }
      else
      {
        if (m <= paramInt2) {
          return i;
        }
        i += -1;
        j = i;
      }
    }
    i = k ^ 0xFFFFFFFF;
    return i;
  }
  
  public static int a(long[] paramArrayOfLong, int paramInt, long paramLong)
  {
    int i = 0;
    int j = paramInt + -1;
    int k = 0;
    while (k <= j)
    {
      i = k + j >>> 1;
      long l = paramArrayOfLong[i];
      boolean bool2 = l < paramLong;
      if (bool2)
      {
        i += 1;
        k = i;
      }
      else
      {
        boolean bool1 = l < paramLong;
        if (!bool1) {
          break label87;
        }
        i += -1;
        bool1 = i;
      }
    }
    i = k ^ 0xFFFFFFFF;
    label87:
    return i;
  }
  
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != paramObject2)
    {
      if (paramObject1 == null) {
        break label23;
      }
      bool = paramObject1.equals(paramObject2);
      if (!bool) {
        break label23;
      }
    }
    label23:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static int b(int paramInt)
  {
    return c(paramInt * 8) / 8;
  }
  
  private static int c(int paramInt)
  {
    int i = 1;
    int j = 4;
    for (;;)
    {
      int k = 32;
      if (j < k)
      {
        k = (i << j) + -12;
        if (paramInt <= k)
        {
          j = i << j;
          paramInt = j + -12;
        }
      }
      else
      {
        return paramInt;
      }
      j += 1;
    }
  }
}


/* Location:              android/support/v4/g/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */