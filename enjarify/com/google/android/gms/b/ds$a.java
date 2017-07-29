package com.google.android.gms.b;

public final class ds$a
  extends fv
{
  private static volatile a[] d;
  public Integer a = null;
  public ds.e[] b;
  public ds.b[] c;
  
  public ds$a()
  {
    Object localObject = ds.e.b();
    b = ((ds.e[])localObject);
    localObject = ds.b.b();
    c = ((ds.b[])localObject);
    ag = null;
    ah = -1;
  }
  
  public static a[] b()
  {
    a[] arrayOfa = d;
    if (arrayOfa == null) {}
    synchronized (fz.c)
    {
      arrayOfa = d;
      if (arrayOfa == null)
      {
        arrayOfa = null;
        arrayOfa = new a[0];
        d = arrayOfa;
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    Object localObject1 = a;
    Object localObject2;
    int k;
    int m;
    if (localObject1 != null)
    {
      localObject2 = a;
      k = ((Integer)localObject2).intValue();
      m = fu.b(1, k);
      j += m;
    }
    localObject1 = b;
    if (localObject1 != null)
    {
      localObject1 = b;
      m = localObject1.length;
      if (m > 0)
      {
        m = j;
        j = 0;
        for (;;)
        {
          localObject2 = b;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          localObject2 = b[j];
          if (localObject2 != null)
          {
            int n = 2;
            k = fu.b(n, (gb)localObject2);
            m += k;
          }
          j += 1;
        }
        j = m;
      }
    }
    localObject1 = c;
    if (localObject1 != null)
    {
      localObject1 = c;
      m = localObject1.length;
      if (m > 0) {
        for (;;)
        {
          localObject1 = c;
          m = localObject1.length;
          if (i >= m) {
            break;
          }
          localObject1 = c[i];
          if (localObject1 != null)
          {
            k = 3;
            m = fu.b(k, (gb)localObject1);
            j += m;
          }
          i += 1;
        }
      }
    }
    return j;
  }
  
  public final void a(fu paramfu)
  {
    int i = 0;
    Object localObject1 = a;
    int j;
    Object localObject2;
    int k;
    if (localObject1 != null)
    {
      j = 1;
      localObject2 = a;
      k = ((Integer)localObject2).intValue();
      paramfu.a(j, k);
    }
    localObject1 = b;
    if (localObject1 != null)
    {
      localObject1 = b;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = b;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          localObject2 = b[j];
          if (localObject2 != null)
          {
            int m = 2;
            paramfu.a(m, (gb)localObject2);
          }
          j += 1;
        }
      }
    }
    localObject1 = c;
    if (localObject1 != null)
    {
      localObject1 = c;
      j = localObject1.length;
      if (j > 0) {
        for (;;)
        {
          localObject1 = c;
          j = localObject1.length;
          if (i >= j) {
            break;
          }
          localObject1 = c[i];
          if (localObject1 != null)
          {
            k = 3;
            paramfu.a(k, (gb)localObject1);
          }
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
      boolean bool2 = paramObject instanceof a;
      fx localfx2;
      if (!bool2)
      {
        bool1 = false;
        localfx2 = null;
      }
      else
      {
        paramObject = (a)paramObject;
        Object localObject1 = a;
        if (localObject1 == null)
        {
          localObject1 = a;
          if (localObject1 != null)
          {
            bool1 = false;
            localfx2 = null;
          }
        }
        else
        {
          localObject1 = a;
          localObject2 = a;
          bool2 = ((Integer)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            localfx2 = null;
            continue;
          }
        }
        localObject1 = b;
        Object localObject2 = b;
        bool2 = fz.a((Object[])localObject1, (Object[])localObject2);
        if (!bool2)
        {
          bool1 = false;
          localfx2 = null;
        }
        else
        {
          localObject1 = c;
          localObject2 = c;
          bool2 = fz.a((Object[])localObject1, (Object[])localObject2);
          if (!bool2)
          {
            bool1 = false;
            localfx2 = null;
          }
          else
          {
            localObject1 = ag;
            if (localObject1 != null)
            {
              localObject1 = ag;
              bool2 = ((fx)localObject1).a();
              if (!bool2) {}
            }
            else
            {
              localObject1 = ag;
              if (localObject1 == null) {
                continue;
              }
              localObject1 = ag;
              bool2 = ((fx)localObject1).a();
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
    int i = 0;
    fx localfx1 = null;
    int j = getClass().getName().hashCode() + 527;
    int k = j * 31;
    Integer localInteger = a;
    if (localInteger == null)
    {
      j = 0;
      localInteger = null;
      j = (j + k) * 31;
      k = fz.a(b);
      j = (j + k) * 31;
      k = fz.a(c);
      j = (j + k) * 31;
      fx localfx2 = ag;
      if (localfx2 != null)
      {
        localfx2 = ag;
        boolean bool = localfx2.a();
        if (!bool) {
          break label131;
        }
      }
    }
    for (;;)
    {
      return j + i;
      localInteger = a;
      j = localInteger.hashCode();
      break;
      label131:
      localfx1 = ag;
      i = localfx1.hashCode();
    }
  }
}


/* Location:              com/google/android/gms/b/ds$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */