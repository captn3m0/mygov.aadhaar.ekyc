package com.google.android.gms.b;

public final class gf$b
  extends fv
  implements Cloneable
{
  public int a = 0;
  public String b = "";
  public String c = "";
  
  public gf$b()
  {
    ag = null;
    ah = -1;
  }
  
  private b b()
  {
    try
    {
      fv localfv = super.c();
      return (b)localfv;
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
    if (j != 0)
    {
      int n = a;
      j = fu.b(1, n);
      i += j;
    }
    String str1 = b;
    String str2;
    if (str1 != null)
    {
      str1 = b;
      str2 = "";
      boolean bool1 = str1.equals(str2);
      if (!bool1)
      {
        str2 = b;
        int k = fu.b(2, str2);
        i += k;
      }
    }
    str1 = c;
    if (str1 != null)
    {
      str1 = c;
      str2 = "";
      boolean bool2 = str1.equals(str2);
      if (!bool2)
      {
        str2 = c;
        int m = fu.b(3, str2);
        i += m;
      }
    }
    return i;
  }
  
  public final void a(fu paramfu)
  {
    int i = a;
    if (i != 0)
    {
      i = 1;
      int m = a;
      paramfu.a(i, m);
    }
    String str1 = b;
    String str2;
    if (str1 != null)
    {
      str1 = b;
      str2 = "";
      boolean bool1 = str1.equals(str2);
      if (!bool1)
      {
        int j = 2;
        str2 = b;
        paramfu.a(j, str2);
      }
    }
    str1 = c;
    if (str1 != null)
    {
      str1 = c;
      str2 = "";
      boolean bool2 = str1.equals(str2);
      if (!bool2)
      {
        int k = 3;
        str2 = c;
        paramfu.a(k, str2);
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
      boolean bool2 = paramObject instanceof b;
      fx localfx2;
      if (!bool2)
      {
        bool1 = false;
        localfx2 = null;
      }
      else
      {
        paramObject = (b)paramObject;
        int i = a;
        int j = a;
        if (i != j)
        {
          bool1 = false;
          localfx2 = null;
        }
        else
        {
          Object localObject = b;
          String str;
          boolean bool3;
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
            bool3 = ((String)localObject).equals(str);
            if (!bool3)
            {
              bool1 = false;
              localfx2 = null;
              continue;
            }
          }
          localObject = c;
          if (localObject == null)
          {
            localObject = c;
            if (localObject != null)
            {
              bool1 = false;
              localfx2 = null;
            }
          }
          else
          {
            localObject = c;
            str = c;
            bool3 = ((String)localObject).equals(str);
            if (!bool3)
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
            bool3 = ((fx)localObject).a();
            if (!bool3) {}
          }
          else
          {
            localObject = ag;
            if (localObject == null) {
              continue;
            }
            localObject = ag;
            bool3 = ((fx)localObject).a();
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
  
  public final int hashCode()
  {
    int i = 0;
    fx localfx1 = null;
    int j = (getClass().getName().hashCode() + 527) * 31;
    int k = a;
    j += k;
    k = j * 31;
    String str = b;
    if (str == null)
    {
      j = 0;
      str = null;
      j += k;
      k = j * 31;
      str = c;
      if (str != null) {
        break label138;
      }
      j = 0;
      str = null;
      label82:
      j = (j + k) * 31;
      fx localfx2 = ag;
      if (localfx2 != null)
      {
        localfx2 = ag;
        boolean bool = localfx2.a();
        if (!bool) {
          break label153;
        }
      }
    }
    for (;;)
    {
      return j + i;
      str = b;
      j = str.hashCode();
      break;
      label138:
      str = c;
      j = str.hashCode();
      break label82;
      label153:
      localfx1 = ag;
      i = localfx1.hashCode();
    }
  }
}


/* Location:              com/google/android/gms/b/gf$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */