package com.google.android.gms.b;

public final class du$b
  extends fv
{
  private static volatile b[] f;
  public du.c[] a;
  public String b;
  public Long c;
  public Long d;
  public Integer e;
  
  public du$b()
  {
    du.c[] arrayOfc = du.c.b();
    a = arrayOfc;
    b = null;
    c = null;
    d = null;
    e = null;
    ag = null;
    ah = -1;
  }
  
  public static b[] b()
  {
    b[] arrayOfb = f;
    if (arrayOfb == null) {}
    synchronized (fz.c)
    {
      arrayOfb = f;
      if (arrayOfb == null)
      {
        arrayOfb = null;
        arrayOfb = new b[0];
        f = arrayOfb;
      }
      return f;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    Object localObject1 = a;
    int j;
    Object localObject2;
    int k;
    if (localObject1 != null)
    {
      localObject1 = a;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = a;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          localObject2 = a[j];
          if (localObject2 != null)
          {
            int m = 1;
            k = fu.b(m, (gb)localObject2);
            i += k;
          }
          j += 1;
        }
      }
    }
    localObject1 = b;
    if (localObject1 != null)
    {
      localObject2 = b;
      j = fu.b(2, (String)localObject2);
      i += j;
    }
    localObject1 = c;
    long l;
    if (localObject1 != null)
    {
      localObject2 = c;
      l = ((Long)localObject2).longValue();
      j = fu.c(3, l);
      i += j;
    }
    localObject1 = d;
    if (localObject1 != null)
    {
      localObject2 = d;
      l = ((Long)localObject2).longValue();
      j = fu.c(4, l);
      i += j;
    }
    localObject1 = e;
    if (localObject1 != null)
    {
      localObject2 = e;
      k = ((Integer)localObject2).intValue();
      j = fu.b(5, k);
      i += j;
    }
    return i;
  }
  
  public final void a(fu paramfu)
  {
    Object localObject1 = a;
    int i;
    Object localObject2;
    int j;
    if (localObject1 != null)
    {
      localObject1 = a;
      i = localObject1.length;
      if (i > 0)
      {
        i = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = a;
          j = localObject2.length;
          if (i >= j) {
            break;
          }
          localObject2 = a[i];
          if (localObject2 != null)
          {
            int k = 1;
            paramfu.a(k, (gb)localObject2);
          }
          i += 1;
        }
      }
    }
    localObject1 = b;
    if (localObject1 != null)
    {
      i = 2;
      localObject2 = b;
      paramfu.a(i, (String)localObject2);
    }
    localObject1 = c;
    long l;
    if (localObject1 != null)
    {
      i = 3;
      localObject2 = c;
      l = ((Long)localObject2).longValue();
      paramfu.b(i, l);
    }
    localObject1 = d;
    if (localObject1 != null)
    {
      i = 4;
      localObject2 = d;
      l = ((Long)localObject2).longValue();
      paramfu.b(i, l);
    }
    localObject1 = e;
    if (localObject1 != null)
    {
      i = 5;
      localObject2 = e;
      j = ((Integer)localObject2).intValue();
      paramfu.a(i, j);
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
        Object localObject2 = a;
        bool2 = fz.a((Object[])localObject1, (Object[])localObject2);
        if (!bool2)
        {
          bool1 = false;
          localfx2 = null;
        }
        else
        {
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
            bool2 = ((Long)localObject1).equals(localObject2);
            if (!bool2)
            {
              bool1 = false;
              localfx2 = null;
              continue;
            }
          }
          localObject1 = d;
          if (localObject1 == null)
          {
            localObject1 = d;
            if (localObject1 != null)
            {
              bool1 = false;
              localfx2 = null;
            }
          }
          else
          {
            localObject1 = d;
            localObject2 = d;
            bool2 = ((Long)localObject1).equals(localObject2);
            if (!bool2)
            {
              bool1 = false;
              localfx2 = null;
              continue;
            }
          }
          localObject1 = e;
          if (localObject1 == null)
          {
            localObject1 = e;
            if (localObject1 != null)
            {
              bool1 = false;
              localfx2 = null;
            }
          }
          else
          {
            localObject1 = e;
            localObject2 = e;
            bool2 = ((Integer)localObject1).equals(localObject2);
            if (!bool2)
            {
              bool1 = false;
              localfx2 = null;
              continue;
            }
          }
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
  
  public final int hashCode()
  {
    int i = 0;
    fx localfx = null;
    int j = (getClass().getName().hashCode() + 527) * 31;
    Object localObject1 = a;
    int k = fz.a((Object[])localObject1);
    j += k;
    k = j * 31;
    Object localObject2 = b;
    if (localObject2 == null)
    {
      j = 0;
      localObject2 = null;
      j += k;
      k = j * 31;
      localObject2 = c;
      if (localObject2 != null) {
        break label199;
      }
      j = 0;
      localObject2 = null;
      label89:
      j += k;
      k = j * 31;
      localObject2 = d;
      if (localObject2 != null) {
        break label214;
      }
      j = 0;
      localObject2 = null;
      label116:
      j += k;
      k = j * 31;
      localObject2 = e;
      if (localObject2 != null) {
        break label229;
      }
      j = 0;
      localObject2 = null;
      label143:
      j = (j + k) * 31;
      localObject1 = ag;
      if (localObject1 != null)
      {
        localObject1 = ag;
        boolean bool = ((fx)localObject1).a();
        if (!bool) {
          break label244;
        }
      }
    }
    for (;;)
    {
      return j + i;
      localObject2 = b;
      j = ((String)localObject2).hashCode();
      break;
      label199:
      localObject2 = c;
      j = ((Long)localObject2).hashCode();
      break label89;
      label214:
      localObject2 = d;
      j = ((Long)localObject2).hashCode();
      break label116;
      label229:
      localObject2 = e;
      j = ((Integer)localObject2).hashCode();
      break label143;
      label244:
      localfx = ag;
      i = localfx.hashCode();
    }
  }
}


/* Location:              com/google/android/gms/b/du$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */