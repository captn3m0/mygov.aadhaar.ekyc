package com.google.android.gms.b;

public final class du$g
  extends fv
{
  private static volatile g[] g;
  public Long a = null;
  public String b = null;
  public String c = null;
  public Long d = null;
  public Float e = null;
  public Double f = null;
  
  public du$g()
  {
    ag = null;
    ah = -1;
  }
  
  public static g[] b()
  {
    g[] arrayOfg = g;
    if (arrayOfg == null) {}
    synchronized (fz.c)
    {
      arrayOfg = g;
      if (arrayOfg == null)
      {
        arrayOfg = null;
        arrayOfg = new g[0];
        g = arrayOfg;
      }
      return g;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    Object localObject1 = a;
    Object localObject2;
    long l;
    int j;
    if (localObject1 != null)
    {
      localObject2 = a;
      l = ((Long)localObject2).longValue();
      j = fu.c(1, l);
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
      j = fu.b(3, (String)localObject2);
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
      ((Float)localObject2).floatValue();
      j = fu.b(5) + 4;
      i += j;
    }
    localObject1 = f;
    if (localObject1 != null)
    {
      localObject2 = f;
      ((Double)localObject2).doubleValue();
      j = fu.b(6) + 8;
      i += j;
    }
    return i;
  }
  
  public final void a(fu paramfu)
  {
    Object localObject1 = a;
    int i;
    Object localObject2;
    long l;
    if (localObject1 != null)
    {
      i = 1;
      localObject2 = a;
      l = ((Long)localObject2).longValue();
      paramfu.b(i, l);
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
      paramfu.a(i, (String)localObject2);
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
      float f1 = ((Float)localObject2).floatValue();
      paramfu.a(i, f1);
    }
    localObject1 = f;
    if (localObject1 != null)
    {
      i = 6;
      localObject2 = f;
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
      boolean bool2 = paramObject instanceof g;
      fx localfx2;
      if (!bool2)
      {
        bool1 = false;
        localfx2 = null;
      }
      else
      {
        paramObject = (g)paramObject;
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
          bool2 = ((String)localObject1).equals(localObject2);
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
          bool2 = ((Float)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            localfx2 = null;
            continue;
          }
        }
        localObject1 = f;
        if (localObject1 == null)
        {
          localObject1 = f;
          if (localObject1 != null)
          {
            bool1 = false;
            localfx2 = null;
          }
        }
        else
        {
          localObject1 = f;
          localObject2 = f;
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
        break label232;
      }
      j = 0;
      localObject = null;
      label68:
      j += k;
      k = j * 31;
      localObject = c;
      if (localObject != null) {
        break label247;
      }
      j = 0;
      localObject = null;
      label95:
      j += k;
      k = j * 31;
      localObject = d;
      if (localObject != null) {
        break label262;
      }
      j = 0;
      localObject = null;
      label122:
      j += k;
      k = j * 31;
      localObject = e;
      if (localObject != null) {
        break label277;
      }
      j = 0;
      localObject = null;
      label149:
      j += k;
      k = j * 31;
      localObject = f;
      if (localObject != null) {
        break label292;
      }
      j = 0;
      localObject = null;
      label176:
      j = (j + k) * 31;
      fx localfx2 = ag;
      if (localfx2 != null)
      {
        localfx2 = ag;
        boolean bool = localfx2.a();
        if (!bool) {
          break label307;
        }
      }
    }
    for (;;)
    {
      return j + i;
      localObject = a;
      j = ((Long)localObject).hashCode();
      break;
      label232:
      localObject = b;
      j = ((String)localObject).hashCode();
      break label68;
      label247:
      localObject = c;
      j = ((String)localObject).hashCode();
      break label95;
      label262:
      localObject = d;
      j = ((Long)localObject).hashCode();
      break label122;
      label277:
      localObject = e;
      j = ((Float)localObject).hashCode();
      break label149;
      label292:
      localObject = f;
      j = ((Double)localObject).hashCode();
      break label176;
      label307:
      localfx1 = ag;
      i = localfx1.hashCode();
    }
  }
}


/* Location:              com/google/android/gms/b/du$g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */