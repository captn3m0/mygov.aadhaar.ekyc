package com.google.android.gms.b;

public final class ds$e
  extends fv
{
  private static volatile e[] d;
  public Integer a = null;
  public String b = null;
  public ds.c c = null;
  
  public ds$e()
  {
    ag = null;
    ah = -1;
  }
  
  public static e[] b()
  {
    e[] arrayOfe = d;
    if (arrayOfe == null) {}
    synchronized (fz.c)
    {
      arrayOfe = d;
      if (arrayOfe == null)
      {
        arrayOfe = null;
        arrayOfe = new e[0];
        d = arrayOfe;
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    Object localObject1 = a;
    Object localObject2;
    int k;
    if (localObject1 != null)
    {
      localObject2 = a;
      int j = ((Integer)localObject2).intValue();
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
      localObject2 = c;
      k = fu.b(3, (gb)localObject2);
      i += k;
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
      int j = ((Integer)localObject2).intValue();
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
      i = 3;
      localObject2 = c;
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
      boolean bool2 = paramObject instanceof e;
      fx localfx2;
      if (!bool2)
      {
        bool1 = false;
        localfx2 = null;
      }
      else
      {
        paramObject = (e)paramObject;
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
          bool2 = ((ds.c)localObject1).equals(localObject2);
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
        break label151;
      }
      j = 0;
      localObject = null;
      label68:
      j += k;
      k = j * 31;
      localObject = c;
      if (localObject != null) {
        break label166;
      }
      j = 0;
      localObject = null;
      label95:
      j = (j + k) * 31;
      fx localfx2 = ag;
      if (localfx2 != null)
      {
        localfx2 = ag;
        boolean bool = localfx2.a();
        if (!bool) {
          break label181;
        }
      }
    }
    for (;;)
    {
      return j + i;
      localObject = a;
      j = ((Integer)localObject).hashCode();
      break;
      label151:
      localObject = b;
      j = ((String)localObject).hashCode();
      break label68;
      label166:
      localObject = c;
      j = ((ds.c)localObject).hashCode();
      break label95;
      label181:
      localfx1 = ag;
      i = localfx1.hashCode();
    }
  }
}


/* Location:              com/google/android/gms/b/ds$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */