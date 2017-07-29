package com.google.android.gms.b;

import java.util.Arrays;

public final class gf$c
  extends fv
  implements Cloneable
{
  public byte[] a;
  public String b;
  public byte[][] c;
  public boolean d;
  
  public gf$c()
  {
    Object localObject = ge.l;
    a = ((byte[])localObject);
    b = "";
    localObject = ge.k;
    c = ((byte[][])localObject);
    d = false;
    ag = null;
    ah = -1;
  }
  
  private c b()
  {
    try
    {
      Object localObject1 = super.c();
      localObject1 = (c)localObject1;
      localObject2 = c;
      if (localObject2 != null)
      {
        localObject2 = c;
        int i = localObject2.length;
        if (i > 0)
        {
          localObject2 = (byte[][])c.clone();
          c = ((byte[][])localObject2);
        }
      }
      return (c)localObject1;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      Object localObject2 = new java/lang/AssertionError;
      ((AssertionError)localObject2).<init>(localCloneNotSupportedException);
      throw ((Throwable)localObject2);
    }
  }
  
  protected final int a()
  {
    int i = 0;
    String str = null;
    int m = super.a();
    Object localObject1 = a;
    byte[] arrayOfByte = ge.l;
    boolean bool3 = Arrays.equals((byte[])localObject1, arrayOfByte);
    int n;
    if (!bool3)
    {
      arrayOfByte = a;
      n = fu.b(1, arrayOfByte);
      m += n;
    }
    localObject1 = c;
    if (localObject1 != null)
    {
      localObject1 = c;
      n = localObject1.length;
      if (n > 0)
      {
        n = 0;
        localObject1 = null;
        int i1 = 0;
        arrayOfByte = null;
        for (;;)
        {
          Object localObject2 = c;
          int i2 = localObject2.length;
          if (i >= i2) {
            break;
          }
          localObject2 = c[i];
          if (localObject2 != null)
          {
            i1 += 1;
            i2 = fu.a((byte[])localObject2);
            n += i2;
          }
          i += 1;
        }
        m += n;
        i = i1 * 1;
        m += i;
      }
    }
    boolean bool1 = d;
    if (bool1)
    {
      int j = fu.b(3) + 1;
      m += j;
    }
    str = b;
    if (str != null)
    {
      str = b;
      localObject1 = "";
      boolean bool2 = str.equals(localObject1);
      if (!bool2)
      {
        localObject1 = b;
        int k = fu.b(4, (String)localObject1);
        m += k;
      }
    }
    return m;
  }
  
  public final void a(fu paramfu)
  {
    Object localObject1 = a;
    Object localObject2 = ge.l;
    int i = Arrays.equals((byte[])localObject1, (byte[])localObject2);
    if (i == 0)
    {
      i = 1;
      localObject2 = a;
      paramfu.a(i, (byte[])localObject2);
    }
    localObject1 = c;
    if (localObject1 != null)
    {
      localObject1 = c;
      int j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = c;
          int n = localObject2.length;
          if (j >= n) {
            break;
          }
          localObject2 = c[j];
          if (localObject2 != null)
          {
            int i1 = 2;
            paramfu.a(i1, (byte[])localObject2);
          }
          j += 1;
        }
      }
    }
    boolean bool1 = d;
    if (bool1)
    {
      int k = 3;
      boolean bool3 = d;
      paramfu.a(k, bool3);
    }
    localObject1 = b;
    if (localObject1 != null)
    {
      localObject1 = b;
      localObject2 = "";
      boolean bool2 = ((String)localObject1).equals(localObject2);
      if (!bool2)
      {
        int m = 4;
        localObject2 = b;
        paramfu.a(m, (String)localObject2);
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
        Object localObject2 = a;
        bool2 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
        if (!bool2)
        {
          bool1 = false;
          localfx2 = null;
        }
        else
        {
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
          localObject2 = c;
          bool2 = fz.a((byte[][])localObject1, (byte[][])localObject2);
          if (!bool2)
          {
            bool1 = false;
            localfx2 = null;
          }
          else
          {
            bool2 = d;
            boolean bool3 = d;
            if (bool2 != bool3)
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
    }
  }
  
  public final int hashCode()
  {
    int i = 0;
    fx localfx = null;
    int j = (getClass().getName().hashCode() + 527) * 31;
    Object localObject = a;
    int m = Arrays.hashCode((byte[])localObject);
    j += m;
    m = j * 31;
    String str = b;
    int k;
    if (str == null)
    {
      j = 0;
      str = null;
      j = (j + m) * 31;
      localObject = c;
      m = fz.a((byte[][])localObject);
      m = (j + m) * 31;
      boolean bool1 = d;
      if (!bool1) {
        break label161;
      }
      k = 1231;
      label105:
      k = (k + m) * 31;
      localObject = ag;
      if (localObject != null)
      {
        localObject = ag;
        boolean bool2 = ((fx)localObject).a();
        if (!bool2) {
          break label168;
        }
      }
    }
    for (;;)
    {
      return k + i;
      str = b;
      k = str.hashCode();
      break;
      label161:
      k = 1237;
      break label105;
      label168:
      localfx = ag;
      i = localfx.hashCode();
    }
  }
}


/* Location:              com/google/android/gms/b/gf$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */