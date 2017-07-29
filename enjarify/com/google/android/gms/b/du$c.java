package com.google.android.gms.b;

public final class du$c
  extends fv
{
  private static volatile c[] f;
  public String a = null;
  public String b = null;
  public Long c = null;
  public Float d = null;
  public Double e = null;
  
  public du$c()
  {
    ag = null;
    ah = -1;
  }
  
  public static c[] b()
  {
    c[] arrayOfc = f;
    if (arrayOfc == null) {}
    synchronized (fz.c)
    {
      arrayOfc = f;
      if (arrayOfc == null)
      {
        arrayOfc = null;
        arrayOfc = new c[0];
        f = arrayOfc;
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
      j = fu.b(2, (String)localObject2);
      i += j;
    }
    localObject1 = c;
    if (localObject1 != null)
    {
      localObject2 = c;
      long l = ((Long)localObject2).longValue();
      j = fu.c(3, l);
      i += j;
    }
    localObject1 = d;
    if (localObject1 != null)
    {
      localObject2 = d;
      ((Float)localObject2).floatValue();
      j = fu.b(4) + 4;
      i += j;
    }
    localObject1 = e;
    if (localObject1 != null)
    {
      localObject2 = e;
      ((Double)localObject2).doubleValue();
      j = fu.b(5) + 8;
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
      long l = ((Long)localObject2).longValue();
      paramfu.b(i, l);
    }
    localObject1 = d;
    if (localObject1 != null)
    {
      i = 4;
      localObject2 = d;
      float f1 = ((Float)localObject2).floatValue();
      paramfu.a(i, f1);
    }
    localObject1 = e;
    if (localObject1 != null)
    {
      i = 5;
      localObject2 = e;
      double d1 = ((Double)localObject2).doubleValue();
      paramfu.a(i, d1);
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
          bool2 = ((Float)localObject1).equals(localObject2);
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
          bool2 = ((Double)localObject1).equals(localObject2);
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
        break label205;
      }
      j = 0;
      localObject = null;
      label68:
      j += k;
      k = j * 31;
      localObject = c;
      if (localObject != null) {
        break label220;
      }
      j = 0;
      localObject = null;
      label95:
      j += k;
      k = j * 31;
      localObject = d;
      if (localObject != null) {
        break label235;
      }
      j = 0;
      localObject = null;
      label122:
      j += k;
      k = j * 31;
      localObject = e;
      if (localObject != null) {
        break label250;
      }
      j = 0;
      localObject = null;
      label149:
      j = (j + k) * 31;
      fx localfx2 = ag;
      if (localfx2 != null)
      {
        localfx2 = ag;
        boolean bool = localfx2.a();
        if (!bool) {
          break label265;
        }
      }
    }
    for (;;)
    {
      return j + i;
      localObject = a;
      j = ((String)localObject).hashCode();
      break;
      label205:
      localObject = b;
      j = ((String)localObject).hashCode();
      break label68;
      label220:
      localObject = c;
      j = ((Long)localObject).hashCode();
      break label95;
      label235:
      localObject = d;
      j = ((Float)localObject).hashCode();
      break label122;
      label250:
      localObject = e;
      j = ((Double)localObject).hashCode();
      break label149;
      label265:
      localfx1 = ag;
      i = localfx1.hashCode();
    }
  }
}


/* Location:              com/google/android/gms/b/du$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */