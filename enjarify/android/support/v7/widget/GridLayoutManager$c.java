package android.support.v7.widget;

import android.util.SparseIntArray;

public abstract class GridLayoutManager$c
{
  final SparseIntArray a;
  private boolean b;
  
  public GridLayoutManager$c()
  {
    SparseIntArray localSparseIntArray = new android/util/SparseIntArray;
    localSparseIntArray.<init>();
    a = localSparseIntArray;
    b = false;
  }
  
  public static int c(int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    if (i < paramInt1)
    {
      k += 1;
      if (k == paramInt2)
      {
        j += 1;
        k = 0;
      }
      for (;;)
      {
        i += 1;
        break;
        if (k > paramInt2)
        {
          k = 1;
          j += 1;
        }
      }
    }
    k += 1;
    if (k > paramInt2) {
      j += 1;
    }
    return j;
  }
  
  public int a(int paramInt1, int paramInt2)
  {
    int i = 1;
    int j = 0;
    if (i == paramInt2) {
      return j;
    }
    boolean bool = b;
    SparseIntArray localSparseIntArray1;
    int k;
    int m;
    SparseIntArray localSparseIntArray2;
    if (bool)
    {
      localSparseIntArray1 = a;
      k = localSparseIntArray1.size();
      if (k > 0)
      {
        localSparseIntArray1 = a;
        k = localSparseIntArray1.size() + -1;
        m = 0;
        localSparseIntArray2 = null;
        while (m <= k)
        {
          int n = m + k >>> 1;
          SparseIntArray localSparseIntArray3 = a;
          int i1 = localSparseIntArray3.keyAt(n);
          if (i1 < paramInt1) {
            m = n + 1;
          } else {
            k = n + -1;
          }
        }
        k = m + -1;
        if (k >= 0)
        {
          localSparseIntArray2 = a;
          m = localSparseIntArray2.size();
          if (k < m)
          {
            localSparseIntArray2 = a;
            k = localSparseIntArray2.keyAt(k);
            if (k < 0) {
              break label274;
            }
            localSparseIntArray2 = a;
            m = localSparseIntArray2.get(k) + 1;
            k += 1;
          }
        }
      }
    }
    for (;;)
    {
      int i2 = k;
      k = m;
      m = i2;
      label204:
      if (m < paramInt1)
      {
        k += 1;
        if (k == paramInt2)
        {
          k = 0;
          localSparseIntArray1 = null;
        }
        for (;;)
        {
          m += 1;
          break label204;
          k = -1;
          break;
          if (k > paramInt2) {
            k = i;
          }
        }
      }
      m = k + 1;
      if (m > paramInt2) {
        break;
      }
      j = k;
      break;
      label274:
      k = 0;
      localSparseIntArray1 = null;
      m = 0;
      localSparseIntArray2 = null;
    }
  }
  
  final int b(int paramInt1, int paramInt2)
  {
    int i = -1;
    boolean bool = b;
    int j;
    if (!bool) {
      j = a(paramInt1, paramInt2);
    }
    for (;;)
    {
      return j;
      SparseIntArray localSparseIntArray1 = a;
      j = localSparseIntArray1.get(paramInt1, i);
      if (j == i)
      {
        j = a(paramInt1, paramInt2);
        SparseIntArray localSparseIntArray2 = a;
        localSparseIntArray2.put(paramInt1, j);
      }
    }
  }
}


/* Location:              android/support/v7/widget/GridLayoutManager$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */