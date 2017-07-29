package com.google.android.gms.b;

public final class fx
  implements Cloneable
{
  static final fy a;
  int[] b;
  fy[] c;
  int d;
  private boolean e = false;
  
  static
  {
    fy localfy = new com/google/android/gms/b/fy;
    localfy.<init>();
    a = localfy;
  }
  
  fx()
  {
    this(10);
  }
  
  private fx(int paramInt)
  {
    int i = a(paramInt);
    int[] arrayOfInt = new int[i];
    b = arrayOfInt;
    fy[] arrayOffy = new fy[i];
    c = arrayOffy;
    d = 0;
  }
  
  static int a(int paramInt)
  {
    int i = 1;
    int j = paramInt * 4;
    int k = 4;
    for (;;)
    {
      int m = 32;
      if (k < m)
      {
        m = (i << k) + -12;
        if (j <= m) {
          j = (i << k) + -12;
        }
      }
      else
      {
        return j / 4;
      }
      k += 1;
    }
  }
  
  public final boolean a()
  {
    int i = d;
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  final int b(int paramInt)
  {
    int i = d + -1;
    int j = 0;
    int k = i;
    while (j <= k)
    {
      i = j + k >>> 1;
      int[] arrayOfInt = b;
      int m = arrayOfInt[i];
      if (m < paramInt)
      {
        i += 1;
        j = i;
      }
      else
      {
        if (m <= paramInt) {
          return i;
        }
        i += -1;
        k = i;
      }
    }
    i = j ^ 0xFFFFFFFF;
    return i;
  }
  
  public final boolean equals(Object paramObject)
  {
    int i = 1;
    if (paramObject == this) {}
    label70:
    label97:
    label121:
    label176:
    label183:
    label186:
    for (;;)
    {
      return i;
      boolean bool1 = paramObject instanceof fx;
      if (!bool1)
      {
        i = 0;
      }
      else
      {
        paramObject = (fx)paramObject;
        int j = d;
        int k = d;
        if (j != k)
        {
          i = 0;
        }
        else
        {
          Object localObject1 = b;
          Object localObject2 = b;
          int m = d;
          j = 0;
          if (j < m)
          {
            int n = localObject1[j];
            int i1 = localObject2[j];
            if (n != i1)
            {
              j = 0;
              if (j != 0)
              {
                localObject1 = c;
                localObject2 = c;
                m = d;
                j = 0;
                if (j >= m) {
                  break label183;
                }
                Object localObject3 = localObject1[j];
                Object localObject4 = localObject2[j];
                boolean bool2 = ((fy)localObject3).equals(localObject4);
                if (bool2) {
                  break label176;
                }
              }
            }
          }
          for (j = 0;; j = i)
          {
            if (j != 0) {
              break label186;
            }
            i = 0;
            break;
            j += 1;
            break label70;
            j = i;
            break label97;
            j += 1;
            break label121;
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    int i = 17;
    int j = 0;
    for (;;)
    {
      int k = d;
      if (j >= k) {
        break;
      }
      i *= 31;
      k = b[j];
      i = (i + k) * 31;
      fy localfy = c[j];
      k = localfy.hashCode();
      i += k;
      j += 1;
    }
    return i;
  }
}


/* Location:              com/google/android/gms/b/fx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */