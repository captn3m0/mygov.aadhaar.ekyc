package com.google.android.gms.b;

public final class gf$f
  extends fv
  implements Cloneable
{
  public int a;
  public int b;
  
  public gf$f()
  {
    a = i;
    b = 0;
    ag = null;
    ah = i;
  }
  
  private f b()
  {
    try
    {
      fv localfv = super.c();
      return (f)localfv;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      AssertionError localAssertionError = new java/lang/AssertionError;
      localAssertionError.<init>(localCloneNotSupportedException);
      throw localAssertionError;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    int j = a;
    int k = -1;
    if (j != k)
    {
      k = a;
      j = fu.b(1, k);
      i += j;
    }
    j = b;
    if (j != 0)
    {
      k = b;
      j = fu.b(2, k);
      i += j;
    }
    return i;
  }
  
  public final void a(fu paramfu)
  {
    int i = a;
    int j = -1;
    if (i != j)
    {
      i = 1;
      j = a;
      paramfu.a(i, j);
    }
    i = b;
    if (i != 0)
    {
      i = 2;
      j = b;
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
        int i = a;
        int j = a;
        if (i != j)
        {
          bool1 = false;
          localfx2 = null;
        }
        else
        {
          i = b;
          j = b;
          if (i != j)
          {
            bool1 = false;
            localfx2 = null;
          }
          else
          {
            fx localfx3 = ag;
            boolean bool3;
            if (localfx3 != null)
            {
              localfx3 = ag;
              bool3 = localfx3.a();
              if (!bool3) {}
            }
            else
            {
              localfx3 = ag;
              if (localfx3 == null) {
                continue;
              }
              localfx3 = ag;
              bool3 = localfx3.a();
              if (bool3) {
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
  
  public final int hashCode()
  {
    int i = (getClass().getName().hashCode() + 527) * 31;
    int m = a;
    i = (i + m) * 31;
    m = b;
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


/* Location:              com/google/android/gms/b/gf$f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */