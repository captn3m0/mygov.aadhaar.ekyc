package com.google.android.gms.b;

public final class gf$a
  extends fv
  implements Cloneable
{
  public String[] a;
  public String[] b;
  public int[] c;
  public long[] d;
  public long[] e;
  
  public gf$a()
  {
    Object localObject = ge.j;
    a = ((String[])localObject);
    localObject = ge.j;
    b = ((String[])localObject);
    localObject = ge.e;
    c = ((int[])localObject);
    localObject = ge.f;
    d = ((long[])localObject);
    localObject = ge.f;
    e = ((long[])localObject);
    ag = null;
    ah = -1;
  }
  
  private a b()
  {
    try
    {
      Object localObject1 = super.c();
      localObject1 = (a)localObject1;
      localObject2 = a;
      int i;
      if (localObject2 != null)
      {
        localObject2 = a;
        i = localObject2.length;
        if (i > 0)
        {
          localObject2 = (String[])a.clone();
          a = ((String[])localObject2);
        }
      }
      localObject2 = b;
      if (localObject2 != null)
      {
        localObject2 = b;
        i = localObject2.length;
        if (i > 0)
        {
          localObject2 = (String[])b.clone();
          b = ((String[])localObject2);
        }
      }
      localObject2 = c;
      if (localObject2 != null)
      {
        localObject2 = c;
        i = localObject2.length;
        if (i > 0)
        {
          localObject2 = (int[])c.clone();
          c = ((int[])localObject2);
        }
      }
      localObject2 = d;
      if (localObject2 != null)
      {
        localObject2 = d;
        i = localObject2.length;
        if (i > 0)
        {
          localObject2 = (long[])d.clone();
          d = ((long[])localObject2);
        }
      }
      localObject2 = e;
      if (localObject2 != null)
      {
        localObject2 = e;
        i = localObject2.length;
        if (i > 0)
        {
          localObject2 = (long[])e.clone();
          e = ((long[])localObject2);
        }
      }
      return (a)localObject1;
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
    long[] arrayOfLong1 = null;
    int j = super.a();
    String[] arrayOfString = a;
    int k;
    int m;
    Object localObject1;
    int n;
    long[] arrayOfLong2;
    Object localObject2;
    int i1;
    if (arrayOfString != null)
    {
      arrayOfString = a;
      k = arrayOfString.length;
      if (k > 0)
      {
        k = 0;
        arrayOfString = null;
        m = 0;
        localObject1 = null;
        n = 0;
        arrayOfLong2 = null;
        for (;;)
        {
          localObject2 = a;
          i1 = localObject2.length;
          if (k >= i1) {
            break;
          }
          localObject2 = a[k];
          if (localObject2 != null)
          {
            n += 1;
            i1 = fu.a((String)localObject2);
            m += i1;
          }
          k += 1;
        }
        k = j + m;
        m = n * 1;
        k += m;
      }
    }
    for (;;)
    {
      localObject1 = b;
      Object localObject3;
      if (localObject1 != null)
      {
        localObject1 = b;
        m = localObject1.length;
        if (m > 0)
        {
          m = 0;
          localObject1 = null;
          n = 0;
          arrayOfLong2 = null;
          j = 0;
          localObject3 = null;
          for (;;)
          {
            localObject2 = b;
            i1 = localObject2.length;
            if (m >= i1) {
              break;
            }
            localObject2 = b[m];
            if (localObject2 != null)
            {
              j += 1;
              i1 = fu.a((String)localObject2);
              n += i1;
            }
            m += 1;
          }
          k += n;
          m = j * 1;
          k += m;
        }
      }
      localObject1 = c;
      if (localObject1 != null)
      {
        localObject1 = c;
        m = localObject1.length;
        if (m > 0)
        {
          m = 0;
          localObject1 = null;
          n = 0;
          arrayOfLong2 = null;
          for (;;)
          {
            localObject3 = c;
            j = localObject3.length;
            if (m >= j) {
              break;
            }
            localObject3 = c;
            j = fu.a(localObject3[m]);
            n += j;
            m += 1;
          }
          k += n;
          localObject1 = c;
          m = localObject1.length * 1;
          k += m;
        }
      }
      localObject1 = d;
      long l;
      if (localObject1 != null)
      {
        localObject1 = d;
        m = localObject1.length;
        if (m > 0)
        {
          m = 0;
          localObject1 = null;
          n = 0;
          arrayOfLong2 = null;
          for (;;)
          {
            localObject3 = d;
            j = localObject3.length;
            if (m >= j) {
              break;
            }
            localObject3 = d;
            l = localObject3[m];
            j = fu.b(l);
            n += j;
            m += 1;
          }
          k += n;
          localObject1 = d;
          m = localObject1.length * 1;
          k += m;
        }
      }
      localObject1 = e;
      if (localObject1 != null)
      {
        localObject1 = e;
        m = localObject1.length;
        if (m > 0)
        {
          m = 0;
          localObject1 = null;
          for (;;)
          {
            arrayOfLong2 = e;
            n = arrayOfLong2.length;
            if (i >= n) {
              break;
            }
            arrayOfLong2 = e;
            l = arrayOfLong2[i];
            n = fu.b(l);
            m += n;
            i += 1;
          }
          k += m;
          arrayOfLong1 = e;
          i = arrayOfLong1.length * 1;
          k += i;
        }
      }
      return k;
      k = j;
    }
  }
  
  public final void a(fu paramfu)
  {
    int i = 0;
    Object localObject1 = a;
    int j;
    Object localObject2;
    int k;
    int m;
    if (localObject1 != null)
    {
      localObject1 = a;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = a;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          localObject2 = a[j];
          if (localObject2 != null)
          {
            m = 1;
            paramfu.a(m, (String)localObject2);
          }
          j += 1;
        }
      }
    }
    localObject1 = b;
    if (localObject1 != null)
    {
      localObject1 = b;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = b;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          localObject2 = b[j];
          if (localObject2 != null)
          {
            m = 2;
            paramfu.a(m, (String)localObject2);
          }
          j += 1;
        }
      }
    }
    localObject1 = c;
    Object localObject3;
    if (localObject1 != null)
    {
      localObject1 = c;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = c;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          k = 3;
          localObject3 = c;
          m = localObject3[j];
          paramfu.a(k, m);
          j += 1;
        }
      }
    }
    localObject1 = d;
    if (localObject1 != null)
    {
      localObject1 = d;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = d;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          k = 4;
          localObject3 = d;
          long l1 = localObject3[j];
          paramfu.b(k, l1);
          j += 1;
        }
      }
    }
    localObject1 = e;
    if (localObject1 != null)
    {
      localObject1 = e;
      j = localObject1.length;
      if (j > 0) {
        for (;;)
        {
          localObject1 = e;
          j = localObject1.length;
          if (i >= j) {
            break;
          }
          j = 5;
          localObject2 = e;
          long l2 = localObject2[i];
          paramfu.b(j, l2);
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
        Object localObject2 = a;
        bool2 = fz.a((Object[])localObject1, (Object[])localObject2);
        if (!bool2)
        {
          bool1 = false;
          localfx2 = null;
        }
        else
        {
          localObject1 = b;
          localObject2 = b;
          bool2 = fz.a((Object[])localObject1, (Object[])localObject2);
          if (!bool2)
          {
            bool1 = false;
            localfx2 = null;
          }
          else
          {
            localObject1 = c;
            localObject2 = c;
            bool2 = fz.a((int[])localObject1, (int[])localObject2);
            if (!bool2)
            {
              bool1 = false;
              localfx2 = null;
            }
            else
            {
              localObject1 = d;
              localObject2 = d;
              bool2 = fz.a((long[])localObject1, (long[])localObject2);
              if (!bool2)
              {
                bool1 = false;
                localfx2 = null;
              }
              else
              {
                localObject1 = e;
                localObject2 = e;
                bool2 = fz.a((long[])localObject1, (long[])localObject2);
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
        }
      }
    }
  }
  
  public final int hashCode()
  {
    int i = (getClass().getName().hashCode() + 527) * 31;
    int m = fz.a(a);
    i = (i + m) * 31;
    m = fz.a(b);
    i = (i + m) * 31;
    m = fz.a(c);
    i = (i + m) * 31;
    m = fz.a(d);
    i = (i + m) * 31;
    long[] arrayOfLong = e;
    m = fz.a(arrayOfLong);
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


/* Location:              com/google/android/gms/b/gf$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */