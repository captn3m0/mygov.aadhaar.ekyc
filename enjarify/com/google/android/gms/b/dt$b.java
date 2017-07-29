package com.google.android.gms.b;

public final class dt$b
  extends fv
{
  public Long a = null;
  public String b = null;
  public Integer c = null;
  public dt.c[] d;
  public dt.a[] e;
  public ds.a[] f;
  
  public dt$b()
  {
    Object localObject = dt.c.b();
    d = ((dt.c[])localObject);
    localObject = dt.a.b();
    e = ((dt.a[])localObject);
    localObject = ds.a.b();
    f = ((ds.a[])localObject);
    ag = null;
    ah = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    Object localObject1 = a;
    Object localObject2;
    int k;
    if (localObject1 != null)
    {
      localObject2 = a;
      long l = ((Long)localObject2).longValue();
      k = fu.c(1, l);
      j += k;
    }
    localObject1 = b;
    if (localObject1 != null)
    {
      localObject2 = b;
      k = fu.b(2, (String)localObject2);
      j += k;
    }
    localObject1 = c;
    int m;
    if (localObject1 != null)
    {
      localObject2 = c;
      m = ((Integer)localObject2).intValue();
      k = fu.b(3, m);
      j += k;
    }
    localObject1 = d;
    int n;
    if (localObject1 != null)
    {
      localObject1 = d;
      k = localObject1.length;
      if (k > 0)
      {
        k = j;
        j = 0;
        for (;;)
        {
          localObject2 = d;
          m = localObject2.length;
          if (j >= m) {
            break;
          }
          localObject2 = d[j];
          if (localObject2 != null)
          {
            n = 4;
            m = fu.b(n, (gb)localObject2);
            k += m;
          }
          j += 1;
        }
        j = k;
      }
    }
    localObject1 = e;
    if (localObject1 != null)
    {
      localObject1 = e;
      k = localObject1.length;
      if (k > 0)
      {
        k = j;
        j = 0;
        for (;;)
        {
          localObject2 = e;
          m = localObject2.length;
          if (j >= m) {
            break;
          }
          localObject2 = e[j];
          if (localObject2 != null)
          {
            n = 5;
            m = fu.b(n, (gb)localObject2);
            k += m;
          }
          j += 1;
        }
        j = k;
      }
    }
    localObject1 = f;
    if (localObject1 != null)
    {
      localObject1 = f;
      k = localObject1.length;
      if (k > 0) {
        for (;;)
        {
          localObject1 = f;
          k = localObject1.length;
          if (i >= k) {
            break;
          }
          localObject1 = f[i];
          if (localObject1 != null)
          {
            m = 6;
            k = fu.b(m, (gb)localObject1);
            j += k;
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
    if (localObject1 != null)
    {
      j = 1;
      localObject2 = a;
      long l = ((Long)localObject2).longValue();
      paramfu.b(j, l);
    }
    localObject1 = b;
    if (localObject1 != null)
    {
      j = 2;
      localObject2 = b;
      paramfu.a(j, (String)localObject2);
    }
    localObject1 = c;
    int k;
    if (localObject1 != null)
    {
      j = 3;
      localObject2 = c;
      k = ((Integer)localObject2).intValue();
      paramfu.a(j, k);
    }
    localObject1 = d;
    int m;
    if (localObject1 != null)
    {
      localObject1 = d;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = d;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          localObject2 = d[j];
          if (localObject2 != null)
          {
            m = 4;
            paramfu.a(m, (gb)localObject2);
          }
          j += 1;
        }
      }
    }
    localObject1 = e;
    if (localObject1 != null)
    {
      localObject1 = e;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = e;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          localObject2 = e[j];
          if (localObject2 != null)
          {
            m = 5;
            paramfu.a(m, (gb)localObject2);
          }
          j += 1;
        }
      }
    }
    localObject1 = f;
    if (localObject1 != null)
    {
      localObject1 = f;
      j = localObject1.length;
      if (j > 0) {
        for (;;)
        {
          localObject1 = f;
          j = localObject1.length;
          if (i >= j) {
            break;
          }
          localObject1 = f[i];
          if (localObject1 != null)
          {
            k = 6;
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
      boolean bool2 = paramObject instanceof b;
      fx localfx2;
      if (!bool2)
      {
        bool1 = false;
        localfx2 = null;
      }
      else
      {
        paramObject = (b)paramObject;
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
          bool2 = ((Long)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            localfx2 = null;
            continue;
          }
        }
        localObject1 = b;
        if (localObject1 == null)
        {
          localObject1 = b;
          if (localObject1 != null)
          {
            bool1 = false;
            localfx2 = null;
          }
        }
        else
        {
          localObject1 = b;
          localObject2 = b;
          bool2 = ((String)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            localfx2 = null;
            continue;
          }
        }
        localObject1 = c;
        if (localObject1 == null)
        {
          localObject1 = c;
          if (localObject1 != null)
          {
            bool1 = false;
            localfx2 = null;
          }
        }
        else
        {
          localObject1 = c;
          localObject2 = c;
          bool2 = ((Integer)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            localfx2 = null;
            continue;
          }
        }
        localObject1 = d;
        Object localObject2 = d;
        bool2 = fz.a((Object[])localObject1, (Object[])localObject2);
        if (!bool2)
        {
          bool1 = false;
          localfx2 = null;
        }
        else
        {
          localObject1 = e;
          localObject2 = e;
          bool2 = fz.a((Object[])localObject1, (Object[])localObject2);
          if (!bool2)
          {
            bool1 = false;
            localfx2 = null;
          }
          else
          {
            localObject1 = f;
            localObject2 = f;
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
  }
  
  public final int hashCode()
  {
    int i = 0;
    fx localfx1 = null;
    int j = getClass().getName().hashCode() + 527;
    int k = j * 31;
    Object localObject = a;
    if (localObject == null)
    {
      j = 0;
      localObject = null;
      j += k;
      k = j * 31;
      localObject = b;
      if (localObject != null) {
        break label202;
      }
      j = 0;
      localObject = null;
      label68:
      j += k;
      k = j * 31;
      localObject = c;
      if (localObject != null) {
        break label217;
      }
      j = 0;
      localObject = null;
      label95:
      j = (j + k) * 31;
      k = fz.a(d);
      j = (j + k) * 31;
      k = fz.a(e);
      j = (j + k) * 31;
      k = fz.a(f);
      j = (j + k) * 31;
      fx localfx2 = ag;
      if (localfx2 != null)
      {
        localfx2 = ag;
        boolean bool = localfx2.a();
        if (!bool) {
          break label232;
        }
      }
    }
    for (;;)
    {
      return j + i;
      localObject = a;
      j = ((Long)localObject).hashCode();
      break;
      label202:
      localObject = b;
      j = ((String)localObject).hashCode();
      break label68;
      label217:
      localObject = c;
      j = ((Integer)localObject).hashCode();
      break label95;
      label232:
      localfx1 = ag;
      i = localfx1.hashCode();
    }
  }
}


/* Location:              com/google/android/gms/b/dt$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */