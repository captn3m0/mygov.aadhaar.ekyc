package com.google.android.gms.b;

public final class dt$c
  extends fv
{
  private static volatile c[] c;
  public String a = null;
  public String b = null;
  
  public dt$c()
  {
    ag = null;
    ah = -1;
  }
  
  public static c[] b()
  {
    c[] arrayOfc = c;
    if (arrayOfc == null) {}
    synchronized (fz.c)
    {
      arrayOfc = c;
      if (arrayOfc == null)
      {
        arrayOfc = null;
        arrayOfc = new c[0];
        c = arrayOfc;
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    String str1 = a;
    String str2;
    int j;
    if (str1 != null)
    {
      str2 = a;
      j = fu.b(1, str2);
      i += j;
    }
    str1 = b;
    if (str1 != null)
    {
      str2 = b;
      j = fu.b(2, str2);
      i += j;
    }
    return i;
  }
  
  public final void a(fu paramfu)
  {
    String str1 = a;
    int i;
    String str2;
    if (str1 != null)
    {
      i = 1;
      str2 = a;
      paramfu.a(i, str2);
    }
    str1 = b;
    if (str1 != null)
    {
      i = 2;
      str2 = b;
      paramfu.a(i, str2);
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
        Object localObject = a;
        String str;
        if (localObject == null)
        {
          localObject = a;
          if (localObject != null)
          {
            bool1 = false;
            localfx2 = null;
          }
        }
        else
        {
          localObject = a;
          str = a;
          bool2 = ((String)localObject).equals(str);
          if (!bool2)
          {
            bool1 = false;
            localfx2 = null;
            continue;
          }
        }
        localObject = b;
        if (localObject == null)
        {
          localObject = b;
          if (localObject != null)
          {
            bool1 = false;
            localfx2 = null;
          }
        }
        else
        {
          localObject = b;
          str = b;
          bool2 = ((String)localObject).equals(str);
          if (!bool2)
          {
            bool1 = false;
            localfx2 = null;
            continue;
          }
        }
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
  
  public final int hashCode()
  {
    int i = 0;
    fx localfx1 = null;
    int j = getClass().getName().hashCode() + 527;
    int k = j * 31;
    String str = a;
    if (str == null)
    {
      j = 0;
      str = null;
      j += k;
      k = j * 31;
      str = b;
      if (str != null) {
        break label124;
      }
      j = 0;
      str = null;
      label68:
      j = (j + k) * 31;
      fx localfx2 = ag;
      if (localfx2 != null)
      {
        localfx2 = ag;
        boolean bool = localfx2.a();
        if (!bool) {
          break label139;
        }
      }
    }
    for (;;)
    {
      return j + i;
      str = a;
      j = str.hashCode();
      break;
      label124:
      str = b;
      j = str.hashCode();
      break label68;
      label139:
      localfx1 = ag;
      i = localfx1.hashCode();
    }
  }
}


/* Location:              com/google/android/gms/b/dt$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */