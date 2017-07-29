package com.google.android.gms.b;

public final class du$d
  extends fv
{
  public du.e[] a;
  
  public du$d()
  {
    du.e[] arrayOfe = du.e.b();
    a = arrayOfe;
    ag = null;
    ah = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    du.e[] arrayOfe = a;
    if (arrayOfe != null)
    {
      arrayOfe = a;
      int j = arrayOfe.length;
      if (j > 0)
      {
        j = 0;
        arrayOfe = null;
        for (;;)
        {
          Object localObject = a;
          int k = localObject.length;
          if (j >= k) {
            break;
          }
          localObject = a[j];
          if (localObject != null)
          {
            int m = 1;
            k = fu.b(m, (gb)localObject);
            i += k;
          }
          j += 1;
        }
      }
    }
    return i;
  }
  
  public final void a(fu paramfu)
  {
    du.e[] arrayOfe = a;
    if (arrayOfe != null)
    {
      arrayOfe = a;
      int i = arrayOfe.length;
      if (i > 0)
      {
        i = 0;
        arrayOfe = null;
        for (;;)
        {
          Object localObject = a;
          int j = localObject.length;
          if (i >= j) {
            break;
          }
          localObject = a[i];
          if (localObject != null)
          {
            int k = 1;
            paramfu.a(k, (gb)localObject);
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
      boolean bool2 = paramObject instanceof d;
      fx localfx2;
      if (!bool2)
      {
        bool1 = false;
        localfx2 = null;
      }
      else
      {
        paramObject = (d)paramObject;
        Object localObject = a;
        du.e[] arrayOfe = a;
        bool2 = fz.a((Object[])localObject, arrayOfe);
        if (!bool2)
        {
          bool1 = false;
          localfx2 = null;
        }
        else
        {
          localObject = ag;
          if (localObject != null)
          {
            localObject = ag;
            bool2 = ((fx)localObject).a();
            if (!bool2) {}
          }
          else
          {
            localObject = ag;
            if (localObject == null) {
              continue;
            }
            localObject = ag;
            bool2 = ((fx)localObject).a();
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
    int i = (getClass().getName().hashCode() + 527) * 31;
    du.e[] arrayOfe = a;
    int m = fz.a(arrayOfe);
    i += m;
    m = i * 31;
    fx localfx = ag;
    int j;
    if (localfx != null)
    {
      localfx = ag;
      j = localfx.a();
      if (j == 0) {}
    }
    else
    {
      j = 0;
      localfx = null;
    }
    for (;;)
    {
      return j + m;
      localfx = ag;
      int k = localfx.hashCode();
    }
  }
}


/* Location:              com/google/android/gms/b/du$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */