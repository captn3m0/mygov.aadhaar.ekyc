package com.google.android.gms.b;

public final class ds$f
  extends fv
{
  public Integer a;
  public String b = null;
  public Boolean c = null;
  public String[] d;
  
  public ds$f()
  {
    String[] arrayOfString = ge.j;
    d = arrayOfString;
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
      localObject2 = b;
      m = fu.b(2, (String)localObject2);
      j += m;
    }
    localObject1 = c;
    if (localObject1 != null)
    {
      localObject2 = c;
      ((Boolean)localObject2).booleanValue();
      m = fu.b(3) + 1;
      j += m;
    }
    localObject1 = d;
    if (localObject1 != null)
    {
      localObject1 = d;
      m = localObject1.length;
      if (m > 0)
      {
        m = 0;
        localObject1 = null;
        k = 0;
        localObject2 = null;
        for (;;)
        {
          Object localObject3 = d;
          int n = localObject3.length;
          if (i >= n) {
            break;
          }
          localObject3 = d[i];
          if (localObject3 != null)
          {
            k += 1;
            n = fu.a((String)localObject3);
            m += n;
          }
          i += 1;
        }
        j += m;
        i = k * 1;
        j += i;
      }
    }
    return j;
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
      boolean bool = ((Boolean)localObject2).booleanValue();
      paramfu.a(i, bool);
    }
    localObject1 = d;
    if (localObject1 != null)
    {
      localObject1 = d;
      i = localObject1.length;
      if (i > 0)
      {
        i = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = d;
          int k = localObject2.length;
          if (i >= k) {
            break;
          }
          localObject2 = d[i];
          if (localObject2 != null)
          {
            int m = 4;
            paramfu.a(m, (String)localObject2);
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
        Object localObject2 = d;
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
        break label168;
      }
      j = 0;
      localObject = null;
      label68:
      j += k;
      k = j * 31;
      localObject = c;
      if (localObject != null) {
        break label183;
      }
      j = 0;
      localObject = null;
      label95:
      j = (j + k) * 31;
      k = fz.a(d);
      j = (j + k) * 31;
      fx localfx2 = ag;
      if (localfx2 != null)
      {
        localfx2 = ag;
        boolean bool = localfx2.a();
        if (!bool) {
          break label198;
        }
      }
    }
    for (;;)
    {
      return j + i;
      localObject = a;
      j = ((Integer)localObject).intValue();
      break;
      label168:
      localObject = b;
      j = ((String)localObject).hashCode();
      break label68;
      label183:
      localObject = c;
      j = ((Boolean)localObject).hashCode();
      break label95;
      label198:
      localfx1 = ag;
      i = localfx1.hashCode();
    }
  }
}


/* Location:              com/google/android/gms/b/ds$f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */