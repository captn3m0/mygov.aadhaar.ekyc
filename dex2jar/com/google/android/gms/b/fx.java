package com.google.android.gms.b;

public final class fx
  implements Cloneable
{
  static final fy a = new fy();
  int[] b;
  fy[] c;
  int d;
  private boolean e = false;
  
  fx()
  {
    this(10);
  }
  
  private fx(int paramInt)
  {
    paramInt = a(paramInt);
    b = new int[paramInt];
    c = new fy[paramInt];
    d = 0;
  }
  
  static int a(int paramInt)
  {
    int j = paramInt * 4;
    paramInt = 4;
    for (;;)
    {
      int i = j;
      if (paramInt < 32)
      {
        if (j <= (1 << paramInt) - 12) {
          i = (1 << paramInt) - 12;
        }
      }
      else {
        return i / 4;
      }
      paramInt += 1;
    }
  }
  
  public final boolean a()
  {
    return d == 0;
  }
  
  final int b(int paramInt)
  {
    int j = d;
    int i = 0;
    j -= 1;
    while (i <= j)
    {
      int k = i + j >>> 1;
      int m = b[k];
      if (m < paramInt)
      {
        i = k + 1;
      }
      else
      {
        j = k;
        if (m <= paramInt) {
          return j;
        }
        j = k - 1;
      }
    }
    j = i ^ 0xFFFFFFFF;
    return j;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    label71:
    label93:
    label131:
    label138:
    label141:
    for (;;)
    {
      return true;
      if (!(paramObject instanceof fx)) {
        return false;
      }
      paramObject = (fx)paramObject;
      if (d != d) {
        return false;
      }
      Object localObject = b;
      int[] arrayOfInt = b;
      int j = d;
      int i = 0;
      if (i < j) {
        if (localObject[i] != arrayOfInt[i])
        {
          i = 0;
          if (i != 0)
          {
            localObject = c;
            paramObject = c;
            j = d;
            i = 0;
            if (i >= j) {
              break label138;
            }
            if (localObject[i].equals(paramObject[i])) {
              break label131;
            }
          }
        }
      }
      for (i = 0;; i = 1)
      {
        if (i != 0) {
          break label141;
        }
        return false;
        i += 1;
        break;
        i = 1;
        break label71;
        i += 1;
        break label93;
      }
    }
  }
  
  public final int hashCode()
  {
    int j = 17;
    int i = 0;
    while (i < d)
    {
      j = (j * 31 + b[i]) * 31 + c[i].hashCode();
      i += 1;
    }
    return j;
  }
}


/* Location:              com/google/android/gms/b/fx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */