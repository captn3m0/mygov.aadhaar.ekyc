package com.google.android.gms.b;

public final class gf$e
  extends fv
  implements Cloneable
{
  private static volatile e[] c;
  public String a = "";
  public String b = "";
  
  public gf$e()
  {
    ag = null;
    ah = -1;
  }
  
  public static e[] b()
  {
    e[] arrayOfe = c;
    if (arrayOfe == null) {}
    synchronized (fz.c)
    {
      arrayOfe = c;
      if (arrayOfe == null)
      {
        arrayOfe = null;
        arrayOfe = new e[0];
        c = arrayOfe;
      }
      return c;
    }
  }
  
  private e g()
  {
    try
    {
      fv localfv = super.c();
      return (e)localfv;
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
    String str1 = a;
    String str2;
    if (str1 != null)
    {
      str1 = a;
      str2 = "";
      boolean bool1 = str1.equals(str2);
      if (!bool1)
      {
        str2 = a;
        int j = fu.b(1, str2);
        i += j;
      }
    }
    str1 = b;
    if (str1 != null)
    {
      str1 = b;
      str2 = "";
      boolean bool2 = str1.equals(str2);
      if (!bool2)
      {
        str2 = b;
        int k = fu.b(2, str2);
        i += k;
      }
    }
    return i;
  }
  
  public final void a(fu paramfu)
  {
    String str1 = a;
    String str2;
    if (str1 != null)
    {
      str1 = a;
      str2 = "";
      int i = str1.equals(str2);
      if (i == 0)
      {
        i = 1;
        str2 = a;
        paramfu.a(i, str2);
      }
    }
    str1 = b;
    if (str1 != null)
    {
      str1 = b;
      str2 = "";
      boolean bool = str1.equals(str2);
      if (!bool)
      {
        int j = 2;
        str2 = b;
        paramfu.a(j, str2);
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


/* Location:              com/google/android/gms/b/gf$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */