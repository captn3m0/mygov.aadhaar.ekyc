package com.google.android.gms.b;

public final class dt$a
  extends fv
{
  private static volatile a[] d;
  public String a = null;
  public Boolean b = null;
  public Boolean c = null;
  
  public dt$a()
  {
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
    int i = super.a();
    Object localObject1 = a;
    Object localObject2;
    int j;
    if (localObject1 != null)
    {
      localObject2 = a;
      j = fu.b(1, (String)localObject2);
      i += j;
    }
    localObject1 = b;
    if (localObject1 != null)
    {
      localObject2 = b;
      ((Boolean)localObject2).booleanValue();
      j = fu.b(2) + 1;
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
      paramfu.a(i, (String)localObject2);
    }
    localObject1 = b;
    boolean bool;
    if (localObject1 != null)
    {
      i = 2;
      localObject2 = b;
      bool = ((Boolean)localObject2).booleanValue();
      paramfu.a(i, bool);
    }
    localObject1 = c;
    if (localObject1 != null)
    {
      i = 3;
      localObject2 = c;
      bool = ((Boolean)localObject2).booleanValue();
      paramfu.a(i, bool);
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
          bool2 = ((String)localObject1).equals(localObject2);
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
          bool2 = ((Boolean)localObject1).equals(localObject2);
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
      j = ((String)localObject).hashCode();
      break;
      label151:
      localObject = b;
      j = ((Boolean)localObject).hashCode();
      break label68;
      label166:
      localObject = c;
      j = ((Boolean)localObject).hashCode();
      break label95;
      label181:
      localfx1 = ag;
      i = localfx1.hashCode();
    }
  }
}


/* Location:              com/google/android/gms/b/dt$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */