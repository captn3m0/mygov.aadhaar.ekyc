package com.google.android.gms.b;

public final class ds$c
  extends fv
{
  private static volatile c[] e;
  public ds.f a = null;
  public ds.d b = null;
  public Boolean c = null;
  public String d = null;
  
  public ds$c()
  {
    ag = null;
    ah = -1;
  }
  
  public static c[] b()
  {
    c[] arrayOfc = e;
    if (arrayOfc == null) {}
    synchronized (fz.c)
    {
      arrayOfc = e;
      if (arrayOfc == null)
      {
        arrayOfc = null;
        arrayOfc = new c[0];
        e = arrayOfc;
      }
      return e;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    Object localObject1 = a;
    Object localObject2;
    int j;
    if (localObject1 != null)
    {
      localObject2 = a;
      j = fu.b(1, (gb)localObject2);
      i += j;
    }
    localObject1 = b;
    if (localObject1 != null)
    {
      localObject2 = b;
      j = fu.b(2, (gb)localObject2);
      i += j;
    }
    localObject1 = c;
    if (localObject1 != null)
    {
      localObject2 = c;
      ((Boolean)localObject2).booleanValue();
      j = fu.b(3) + 1;
      i += j;
    }
    localObject1 = d;
    if (localObject1 != null)
    {
      localObject2 = d;
      j = fu.b(4, (String)localObject2);
      i += j;
    }
    return i;
  }
  
  public final void a(fu paramfu)
  {
    Object localObject1 = a;
    int i;
    Object localObject2;
    if (localObject1 != null)
    {
      i = 1;
      localObject2 = a;
      paramfu.a(i, (gb)localObject2);
    }
    localObject1 = b;
    if (localObject1 != null)
    {
      i = 2;
      localObject2 = b;
      paramfu.a(i, (gb)localObject2);
    }
    localObject1 = c;
    if (localObject1 != null)
    {
      i = 3;
      localObject2 = c;
      boolean bool = ((Boolean)localObject2).booleanValue();
      paramfu.a(i, bool);
    }
    localObject1 = d;
    if (localObject1 != null)
    {
      i = 4;
      localObject2 = d;
      paramfu.a(i, (String)localObject2);
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
      boolean bool2 = paramObject instanceof c;
      fx localfx2;
      if (!bool2)
      {
        bool1 = false;
        localfx2 = null;
      }
      else
      {
        paramObject = (c)paramObject;
        Object localObject1 = a;
        Object localObject2;
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
          bool2 = ((ds.f)localObject1).equals(localObject2);
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
          bool2 = ((ds.d)localObject1).equals(localObject2);
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
          bool2 = ((Boolean)localObject1).equals(localObject2);
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
          bool2 = ((String)localObject1).equals(localObject2);
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
        break label178;
      }
      j = 0;
      localObject = null;
      label68:
      j += k;
      k = j * 31;
      localObject = c;
      if (localObject != null) {
        break label193;
      }
      j = 0;
      localObject = null;
      label95:
      j += k;
      k = j * 31;
      localObject = d;
      if (localObject != null) {
        break label208;
      }
      j = 0;
      localObject = null;
      label122:
      j = (j + k) * 31;
      fx localfx2 = ag;
      if (localfx2 != null)
      {
        localfx2 = ag;
        boolean bool = localfx2.a();
        if (!bool) {
          break label223;
        }
      }
    }
    for (;;)
    {
      return j + i;
      localObject = a;
      j = ((ds.f)localObject).hashCode();
      break;
      label178:
      localObject = b;
      j = ((ds.d)localObject).hashCode();
      break label68;
      label193:
      localObject = c;
      j = ((Boolean)localObject).hashCode();
      break label95;
      label208:
      localObject = d;
      j = ((String)localObject).hashCode();
      break label122;
      label223:
      localfx1 = ag;
      i = localfx1.hashCode();
    }
  }
}


/* Location:              com/google/android/gms/b/ds$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */