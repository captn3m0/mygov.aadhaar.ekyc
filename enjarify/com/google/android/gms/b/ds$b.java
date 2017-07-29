package com.google.android.gms.b;

public final class ds$b
  extends fv
{
  private static volatile b[] f;
  public Integer a = null;
  public String b = null;
  public ds.c[] c;
  public Boolean d;
  public ds.d e;
  
  public ds$b()
  {
    ds.c[] arrayOfc = ds.c.b();
    c = arrayOfc;
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
    Object localObject2;
    int j;
    int k;
    if (localObject1 != null)
    {
      localObject2 = a;
      j = ((Integer)localObject2).intValue();
      k = fu.b(1, j);
      i += k;
    }
    localObject1 = b;
    if (localObject1 != null)
    {
      localObject2 = b;
      k = fu.b(2, (String)localObject2);
      i += k;
    }
    localObject1 = c;
    if (localObject1 != null)
    {
      localObject1 = c;
      k = localObject1.length;
      if (k > 0)
      {
        localObject1 = null;
        k = i;
        i = 0;
        for (;;)
        {
          localObject2 = c;
          j = localObject2.length;
          if (i >= j) {
            break;
          }
          localObject2 = c[i];
          if (localObject2 != null)
          {
            int m = 3;
            j = fu.b(m, (gb)localObject2);
            k += j;
          }
          i += 1;
        }
        i = k;
      }
    }
    localObject1 = d;
    if (localObject1 != null)
    {
      localObject2 = d;
      ((Boolean)localObject2).booleanValue();
      k = fu.b(4) + 1;
      i += k;
    }
    localObject1 = e;
    if (localObject1 != null)
    {
      localObject2 = e;
      k = fu.b(5, (gb)localObject2);
      i += k;
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
      i = 1;
      localObject2 = a;
      j = ((Integer)localObject2).intValue();
      paramfu.a(i, j);
    }
    localObject1 = b;
    if (localObject1 != null)
    {
      i = 2;
      localObject2 = b;
      paramfu.a(i, (String)localObject2);
    }
    localObject1 = c;
    if (localObject1 != null)
    {
      localObject1 = c;
      i = localObject1.length;
      if (i > 0)
      {
        i = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = c;
          j = localObject2.length;
          if (i >= j) {
            break;
          }
          localObject2 = c[i];
          if (localObject2 != null)
          {
            int k = 3;
            paramfu.a(k, (gb)localObject2);
          }
          i += 1;
        }
      }
    }
    localObject1 = d;
    if (localObject1 != null)
    {
      i = 4;
      localObject2 = d;
      boolean bool = ((Boolean)localObject2).booleanValue();
      paramfu.a(i, bool);
    }
    localObject1 = e;
    if (localObject1 != null)
    {
      i = 5;
      localObject2 = e;
      paramfu.a(i, (gb)localObject2);
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
          bool2 = ((Integer)localObject1).equals(localObject2);
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
        Object localObject2 = c;
        bool2 = fz.a((Object[])localObject1, (Object[])localObject2);
        if (!bool2)
        {
          bool1 = false;
          localfx2 = null;
        }
        else
        {
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
            bool2 = ((Boolean)localObject1).equals(localObject2);
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
            bool2 = ((ds.d)localObject1).equals(localObject2);
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
    int j = getClass().getName().hashCode() + 527;
    int k = j * 31;
    Object localObject1 = a;
    if (localObject1 == null)
    {
      j = 0;
      localObject1 = null;
      j += k;
      k = j * 31;
      localObject1 = b;
      if (localObject1 != null) {
        break label199;
      }
      j = 0;
      localObject1 = null;
      label68:
      j = (j + k) * 31;
      Object localObject2 = c;
      k = fz.a((Object[])localObject2);
      j += k;
      k = j * 31;
      localObject1 = d;
      if (localObject1 != null) {
        break label214;
      }
      j = 0;
      localObject1 = null;
      label116:
      j += k;
      k = j * 31;
      localObject1 = e;
      if (localObject1 != null) {
        break label229;
      }
      j = 0;
      localObject1 = null;
      label143:
      j = (j + k) * 31;
      localObject2 = ag;
      if (localObject2 != null)
      {
        localObject2 = ag;
        boolean bool = ((fx)localObject2).a();
        if (!bool) {
          break label244;
        }
      }
    }
    for (;;)
    {
      return j + i;
      localObject1 = a;
      j = ((Integer)localObject1).hashCode();
      break;
      label199:
      localObject1 = b;
      j = ((String)localObject1).hashCode();
      break label68;
      label214:
      localObject1 = d;
      j = ((Boolean)localObject1).hashCode();
      break label116;
      label229:
      localObject1 = e;
      j = ((ds.d)localObject1).hashCode();
      break label143;
      label244:
      localfx = ag;
      i = localfx.hashCode();
    }
  }
}


/* Location:              com/google/android/gms/b/ds$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */