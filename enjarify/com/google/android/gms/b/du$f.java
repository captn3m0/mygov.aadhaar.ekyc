package com.google.android.gms.b;

public final class du$f
  extends fv
{
  public long[] a;
  public long[] b;
  
  public du$f()
  {
    long[] arrayOfLong = ge.f;
    a = arrayOfLong;
    arrayOfLong = ge.f;
    b = arrayOfLong;
    ag = null;
    ah = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    long[] arrayOfLong1 = null;
    int j = super.a();
    long[] arrayOfLong2 = a;
    int k;
    int m;
    long[] arrayOfLong3;
    long l;
    if (arrayOfLong2 != null)
    {
      arrayOfLong2 = a;
      k = arrayOfLong2.length;
      if (k > 0)
      {
        k = 0;
        arrayOfLong2 = null;
        m = 0;
        arrayOfLong3 = null;
        for (;;)
        {
          long[] arrayOfLong4 = a;
          int n = arrayOfLong4.length;
          if (k >= n) {
            break;
          }
          arrayOfLong4 = a;
          l = arrayOfLong4[k];
          n = fu.b(l);
          m += n;
          k += 1;
        }
        k = j + m;
        arrayOfLong3 = a;
        m = arrayOfLong3.length * 1;
        k += m;
      }
    }
    for (;;)
    {
      arrayOfLong3 = b;
      if (arrayOfLong3 != null)
      {
        arrayOfLong3 = b;
        m = arrayOfLong3.length;
        if (m > 0)
        {
          m = 0;
          arrayOfLong3 = null;
          for (;;)
          {
            long[] arrayOfLong5 = b;
            j = arrayOfLong5.length;
            if (i >= j) {
              break;
            }
            arrayOfLong5 = b;
            l = arrayOfLong5[i];
            j = fu.b(l);
            m += j;
            i += 1;
          }
          k += m;
          arrayOfLong1 = b;
          i = arrayOfLong1.length * 1;
          k += i;
        }
      }
      return k;
      k = j;
    }
  }
  
  public final void a(fu paramfu)
  {
    int i = 0;
    long[] arrayOfLong1 = a;
    int j;
    long[] arrayOfLong2;
    if (arrayOfLong1 != null)
    {
      arrayOfLong1 = a;
      j = arrayOfLong1.length;
      if (j > 0)
      {
        j = 0;
        arrayOfLong1 = null;
        for (;;)
        {
          arrayOfLong2 = a;
          int k = arrayOfLong2.length;
          if (j >= k) {
            break;
          }
          k = 1;
          long[] arrayOfLong3 = a;
          long l1 = arrayOfLong3[j];
          paramfu.a(k, l1);
          j += 1;
        }
      }
    }
    arrayOfLong1 = b;
    if (arrayOfLong1 != null)
    {
      arrayOfLong1 = b;
      j = arrayOfLong1.length;
      if (j > 0) {
        for (;;)
        {
          arrayOfLong1 = b;
          j = arrayOfLong1.length;
          if (i >= j) {
            break;
          }
          j = 2;
          arrayOfLong2 = b;
          long l2 = arrayOfLong2[i];
          paramfu.a(j, l2);
          i += 1;
        }
      }
    }
    super.a(paramfu);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    fx localfx1 = null;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof f;
      fx localfx2;
      if (!bool2)
      {
        bool1 = false;
        localfx2 = null;
      }
      else
      {
        paramObject = (f)paramObject;
        Object localObject = a;
        long[] arrayOfLong = a;
        bool2 = fz.a((long[])localObject, arrayOfLong);
        if (!bool2)
        {
          bool1 = false;
          localfx2 = null;
        }
        else
        {
          localObject = b;
          arrayOfLong = b;
          bool2 = fz.a((long[])localObject, arrayOfLong);
          if (!bool2)
          {
            bool1 = false;
            localfx2 = null;
          }
          else
          {
            localObject = ag;
            if (localObject != null)
            {
              localObject = ag;
              bool2 = ((fx)localObject).a();
              if (!bool2) {}
            }
            else
            {
              localObject = ag;
              if (localObject == null) {
                continue;
              }
              localObject = ag;
              bool2 = ((fx)localObject).a();
              if (bool2) {
                continue;
              }
              bool1 = false;
              localfx2 = null;
              continue;
            }
            localfx2 = ag;
            localfx1 = ag;
            bool1 = localfx2.equals(localfx1);
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    int i = (getClass().getName().hashCode() + 527) * 31;
    int m = fz.a(a);
    i = (i + m) * 31;
    long[] arrayOfLong = b;
    m = fz.a(arrayOfLong);
    i += m;
    m = i * 31;
    fx localfx = ag;
    int j;
    if (localfx != null)
    {
      localfx = ag;
      j = localfx.a();
      if (j == 0) {}
    }
    else
    {
      j = 0;
      localfx = null;
    }
    for (;;)
    {
      return j + m;
      localfx = ag;
      int k = localfx.hashCode();
    }
  }
}


/* Location:              com/google/android/gms/b/du$f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */