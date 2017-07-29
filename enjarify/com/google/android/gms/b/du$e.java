package com.google.android.gms.b;

public final class du$e
  extends fv
{
  private static volatile e[] I;
  public du.a[] A;
  public String B;
  public Integer C;
  public Integer D;
  public Integer E;
  public String F;
  public Long G;
  public Long H;
  public Integer a = null;
  public du.b[] b;
  public du.g[] c;
  public Long d;
  public Long e;
  public Long f;
  public Long g;
  public Long h;
  public String i;
  public String j;
  public String k;
  public String l;
  public Integer m;
  public String n;
  public String o;
  public String p;
  public Long q;
  public Long r;
  public String s;
  public Boolean t;
  public String u;
  public Long v;
  public Integer w;
  public String x;
  public String y;
  public Boolean z;
  
  public du$e()
  {
    Object localObject = du.b.b();
    b = ((du.b[])localObject);
    localObject = du.g.b();
    c = ((du.g[])localObject);
    d = null;
    e = null;
    f = null;
    g = null;
    h = null;
    i = null;
    j = null;
    k = null;
    l = null;
    m = null;
    n = null;
    o = null;
    p = null;
    q = null;
    r = null;
    s = null;
    t = null;
    u = null;
    v = null;
    w = null;
    x = null;
    y = null;
    z = null;
    localObject = du.a.b();
    A = ((du.a[])localObject);
    B = null;
    C = null;
    D = null;
    E = null;
    F = null;
    G = null;
    H = null;
    ag = null;
    ah = -1;
  }
  
  public static e[] b()
  {
    e[] arrayOfe = I;
    if (arrayOfe == null) {}
    synchronized (fz.c)
    {
      arrayOfe = I;
      if (arrayOfe == null)
      {
        arrayOfe = null;
        arrayOfe = new e[0];
        I = arrayOfe;
      }
      return I;
    }
  }
  
  protected final int a()
  {
    int i1 = 0;
    Object localObject1 = null;
    int i2 = super.a();
    Object localObject2 = a;
    Object localObject3;
    int i3;
    int i4;
    if (localObject2 != null)
    {
      localObject3 = a;
      i3 = ((Integer)localObject3).intValue();
      i4 = fu.b(1, i3);
      i2 += i4;
    }
    localObject2 = b;
    int i5;
    if (localObject2 != null)
    {
      localObject2 = b;
      i4 = localObject2.length;
      if (i4 > 0)
      {
        i4 = i2;
        i2 = 0;
        for (;;)
        {
          localObject3 = b;
          i3 = localObject3.length;
          if (i2 >= i3) {
            break;
          }
          localObject3 = b[i2];
          if (localObject3 != null)
          {
            i5 = 2;
            i3 = fu.b(i5, (gb)localObject3);
            i4 += i3;
          }
          i2 += 1;
        }
        i2 = i4;
      }
    }
    localObject2 = c;
    if (localObject2 != null)
    {
      localObject2 = c;
      i4 = localObject2.length;
      if (i4 > 0)
      {
        i4 = i2;
        i2 = 0;
        for (;;)
        {
          localObject3 = c;
          i3 = localObject3.length;
          if (i2 >= i3) {
            break;
          }
          localObject3 = c[i2];
          if (localObject3 != null)
          {
            i5 = 3;
            i3 = fu.b(i5, (gb)localObject3);
            i4 += i3;
          }
          i2 += 1;
        }
        i2 = i4;
      }
    }
    localObject2 = d;
    long l1;
    if (localObject2 != null)
    {
      localObject3 = d;
      l1 = ((Long)localObject3).longValue();
      i4 = fu.c(4, l1);
      i2 += i4;
    }
    localObject2 = e;
    if (localObject2 != null)
    {
      localObject3 = e;
      l1 = ((Long)localObject3).longValue();
      i4 = fu.c(5, l1);
      i2 += i4;
    }
    localObject2 = f;
    if (localObject2 != null)
    {
      localObject3 = f;
      l1 = ((Long)localObject3).longValue();
      i4 = fu.c(6, l1);
      i2 += i4;
    }
    localObject2 = h;
    if (localObject2 != null)
    {
      localObject3 = h;
      l1 = ((Long)localObject3).longValue();
      i4 = fu.c(7, l1);
      i2 += i4;
    }
    localObject2 = i;
    if (localObject2 != null)
    {
      localObject3 = i;
      i4 = fu.b(8, (String)localObject3);
      i2 += i4;
    }
    localObject2 = j;
    if (localObject2 != null)
    {
      localObject3 = j;
      i4 = fu.b(9, (String)localObject3);
      i2 += i4;
    }
    localObject2 = k;
    if (localObject2 != null)
    {
      localObject3 = k;
      i4 = fu.b(10, (String)localObject3);
      i2 += i4;
    }
    localObject2 = l;
    if (localObject2 != null)
    {
      localObject3 = l;
      i4 = fu.b(11, (String)localObject3);
      i2 += i4;
    }
    localObject2 = m;
    if (localObject2 != null)
    {
      localObject3 = m;
      i3 = ((Integer)localObject3).intValue();
      i4 = fu.b(12, i3);
      i2 += i4;
    }
    localObject2 = n;
    if (localObject2 != null)
    {
      localObject3 = n;
      i4 = fu.b(13, (String)localObject3);
      i2 += i4;
    }
    localObject2 = o;
    if (localObject2 != null)
    {
      localObject3 = o;
      i4 = fu.b(14, (String)localObject3);
      i2 += i4;
    }
    localObject2 = p;
    if (localObject2 != null)
    {
      localObject3 = p;
      i4 = fu.b(16, (String)localObject3);
      i2 += i4;
    }
    localObject2 = q;
    if (localObject2 != null)
    {
      localObject3 = q;
      l1 = ((Long)localObject3).longValue();
      i4 = fu.c(17, l1);
      i2 += i4;
    }
    localObject2 = r;
    if (localObject2 != null)
    {
      localObject3 = r;
      l1 = ((Long)localObject3).longValue();
      i4 = fu.c(18, l1);
      i2 += i4;
    }
    localObject2 = s;
    if (localObject2 != null)
    {
      localObject3 = s;
      i4 = fu.b(19, (String)localObject3);
      i2 += i4;
    }
    localObject2 = t;
    if (localObject2 != null)
    {
      localObject3 = t;
      ((Boolean)localObject3).booleanValue();
      i4 = fu.b(20) + 1;
      i2 += i4;
    }
    localObject2 = u;
    if (localObject2 != null)
    {
      localObject3 = u;
      i4 = fu.b(21, (String)localObject3);
      i2 += i4;
    }
    localObject2 = v;
    if (localObject2 != null)
    {
      localObject3 = v;
      l1 = ((Long)localObject3).longValue();
      i4 = fu.c(22, l1);
      i2 += i4;
    }
    localObject2 = w;
    if (localObject2 != null)
    {
      localObject3 = w;
      i3 = ((Integer)localObject3).intValue();
      i4 = fu.b(23, i3);
      i2 += i4;
    }
    localObject2 = x;
    if (localObject2 != null)
    {
      localObject3 = x;
      i4 = fu.b(24, (String)localObject3);
      i2 += i4;
    }
    localObject2 = y;
    if (localObject2 != null)
    {
      localObject3 = y;
      i4 = fu.b(25, (String)localObject3);
      i2 += i4;
    }
    localObject2 = g;
    if (localObject2 != null)
    {
      localObject3 = g;
      l1 = ((Long)localObject3).longValue();
      i4 = fu.c(26, l1);
      i2 += i4;
    }
    localObject2 = z;
    if (localObject2 != null)
    {
      localObject3 = z;
      ((Boolean)localObject3).booleanValue();
      i4 = fu.b(28) + 1;
      i2 += i4;
    }
    localObject2 = A;
    if (localObject2 != null)
    {
      localObject2 = A;
      i4 = localObject2.length;
      if (i4 > 0) {
        for (;;)
        {
          localObject2 = A;
          i4 = localObject2.length;
          if (i1 >= i4) {
            break;
          }
          localObject2 = A[i1];
          if (localObject2 != null)
          {
            i3 = 29;
            i4 = fu.b(i3, (gb)localObject2);
            i2 += i4;
          }
          i1 += 1;
        }
      }
    }
    localObject1 = B;
    if (localObject1 != null)
    {
      localObject2 = B;
      i1 = fu.b(30, (String)localObject2);
      i2 += i1;
    }
    localObject1 = C;
    if (localObject1 != null)
    {
      localObject2 = C;
      i4 = ((Integer)localObject2).intValue();
      i1 = fu.b(31, i4);
      i2 += i1;
    }
    localObject1 = D;
    if (localObject1 != null)
    {
      localObject2 = D;
      i4 = ((Integer)localObject2).intValue();
      i1 = fu.b(32, i4);
      i2 += i1;
    }
    localObject1 = E;
    if (localObject1 != null)
    {
      localObject2 = E;
      i4 = ((Integer)localObject2).intValue();
      i1 = fu.b(33, i4);
      i2 += i1;
    }
    localObject1 = F;
    if (localObject1 != null)
    {
      localObject2 = F;
      i1 = fu.b(34, (String)localObject2);
      i2 += i1;
    }
    localObject1 = G;
    long l2;
    if (localObject1 != null)
    {
      localObject2 = G;
      l2 = ((Long)localObject2).longValue();
      i1 = fu.c(35, l2);
      i2 += i1;
    }
    localObject1 = H;
    if (localObject1 != null)
    {
      localObject2 = H;
      l2 = ((Long)localObject2).longValue();
      i1 = fu.c(36, l2);
      i2 += i1;
    }
    return i2;
  }
  
  public final void a(fu paramfu)
  {
    int i1 = 0;
    Object localObject1 = null;
    Object localObject2 = a;
    int i2;
    Object localObject3;
    int i3;
    if (localObject2 != null)
    {
      i2 = 1;
      localObject3 = a;
      i3 = ((Integer)localObject3).intValue();
      paramfu.a(i2, i3);
    }
    localObject2 = b;
    int i6;
    if (localObject2 != null)
    {
      localObject2 = b;
      i2 = localObject2.length;
      if (i2 > 0)
      {
        i2 = 0;
        localObject2 = null;
        for (;;)
        {
          localObject3 = b;
          i3 = localObject3.length;
          if (i2 >= i3) {
            break;
          }
          localObject3 = b[i2];
          if (localObject3 != null)
          {
            i6 = 2;
            paramfu.a(i6, (gb)localObject3);
          }
          i2 += 1;
        }
      }
    }
    localObject2 = c;
    if (localObject2 != null)
    {
      localObject2 = c;
      i2 = localObject2.length;
      if (i2 > 0)
      {
        i2 = 0;
        localObject2 = null;
        for (;;)
        {
          localObject3 = c;
          i3 = localObject3.length;
          if (i2 >= i3) {
            break;
          }
          localObject3 = c[i2];
          if (localObject3 != null)
          {
            i6 = 3;
            paramfu.a(i6, (gb)localObject3);
          }
          i2 += 1;
        }
      }
    }
    localObject2 = d;
    long l1;
    if (localObject2 != null)
    {
      i2 = 4;
      localObject3 = d;
      l1 = ((Long)localObject3).longValue();
      paramfu.b(i2, l1);
    }
    localObject2 = e;
    if (localObject2 != null)
    {
      i2 = 5;
      localObject3 = e;
      l1 = ((Long)localObject3).longValue();
      paramfu.b(i2, l1);
    }
    localObject2 = f;
    if (localObject2 != null)
    {
      i2 = 6;
      localObject3 = f;
      l1 = ((Long)localObject3).longValue();
      paramfu.b(i2, l1);
    }
    localObject2 = h;
    if (localObject2 != null)
    {
      i2 = 7;
      localObject3 = h;
      l1 = ((Long)localObject3).longValue();
      paramfu.b(i2, l1);
    }
    localObject2 = i;
    if (localObject2 != null)
    {
      i2 = 8;
      localObject3 = i;
      paramfu.a(i2, (String)localObject3);
    }
    localObject2 = j;
    if (localObject2 != null)
    {
      i2 = 9;
      localObject3 = j;
      paramfu.a(i2, (String)localObject3);
    }
    localObject2 = k;
    if (localObject2 != null)
    {
      i2 = 10;
      localObject3 = k;
      paramfu.a(i2, (String)localObject3);
    }
    localObject2 = l;
    if (localObject2 != null)
    {
      i2 = 11;
      localObject3 = l;
      paramfu.a(i2, (String)localObject3);
    }
    localObject2 = m;
    if (localObject2 != null)
    {
      i2 = 12;
      localObject3 = m;
      i3 = ((Integer)localObject3).intValue();
      paramfu.a(i2, i3);
    }
    localObject2 = n;
    if (localObject2 != null)
    {
      i2 = 13;
      localObject3 = n;
      paramfu.a(i2, (String)localObject3);
    }
    localObject2 = o;
    if (localObject2 != null)
    {
      i2 = 14;
      localObject3 = o;
      paramfu.a(i2, (String)localObject3);
    }
    localObject2 = p;
    if (localObject2 != null)
    {
      i2 = 16;
      localObject3 = p;
      paramfu.a(i2, (String)localObject3);
    }
    localObject2 = q;
    if (localObject2 != null)
    {
      i2 = 17;
      localObject3 = q;
      l1 = ((Long)localObject3).longValue();
      paramfu.b(i2, l1);
    }
    localObject2 = r;
    if (localObject2 != null)
    {
      i2 = 18;
      localObject3 = r;
      l1 = ((Long)localObject3).longValue();
      paramfu.b(i2, l1);
    }
    localObject2 = s;
    if (localObject2 != null)
    {
      i2 = 19;
      localObject3 = s;
      paramfu.a(i2, (String)localObject3);
    }
    localObject2 = t;
    if (localObject2 != null)
    {
      i2 = 20;
      localObject3 = t;
      boolean bool1 = ((Boolean)localObject3).booleanValue();
      paramfu.a(i2, bool1);
    }
    localObject2 = u;
    if (localObject2 != null)
    {
      i2 = 21;
      localObject3 = u;
      paramfu.a(i2, (String)localObject3);
    }
    localObject2 = v;
    if (localObject2 != null)
    {
      i2 = 22;
      localObject3 = v;
      l1 = ((Long)localObject3).longValue();
      paramfu.b(i2, l1);
    }
    localObject2 = w;
    if (localObject2 != null)
    {
      i2 = 23;
      localObject3 = w;
      int i4 = ((Integer)localObject3).intValue();
      paramfu.a(i2, i4);
    }
    localObject2 = x;
    if (localObject2 != null)
    {
      i2 = 24;
      localObject3 = x;
      paramfu.a(i2, (String)localObject3);
    }
    localObject2 = y;
    if (localObject2 != null)
    {
      i2 = 25;
      localObject3 = y;
      paramfu.a(i2, (String)localObject3);
    }
    localObject2 = g;
    if (localObject2 != null)
    {
      i2 = 26;
      localObject3 = g;
      l1 = ((Long)localObject3).longValue();
      paramfu.b(i2, l1);
    }
    localObject2 = z;
    if (localObject2 != null)
    {
      i2 = 28;
      localObject3 = z;
      boolean bool2 = ((Boolean)localObject3).booleanValue();
      paramfu.a(i2, bool2);
    }
    localObject2 = A;
    if (localObject2 != null)
    {
      localObject2 = A;
      i2 = localObject2.length;
      if (i2 > 0) {
        for (;;)
        {
          localObject2 = A;
          i2 = localObject2.length;
          if (i1 >= i2) {
            break;
          }
          localObject2 = A[i1];
          if (localObject2 != null)
          {
            int i5 = 29;
            paramfu.a(i5, (gb)localObject2);
          }
          i1 += 1;
        }
      }
    }
    localObject2 = B;
    if (localObject2 != null)
    {
      i2 = 30;
      localObject1 = B;
      paramfu.a(i2, (String)localObject1);
    }
    localObject2 = C;
    if (localObject2 != null)
    {
      i2 = 31;
      localObject1 = C;
      i1 = ((Integer)localObject1).intValue();
      paramfu.a(i2, i1);
    }
    localObject2 = D;
    if (localObject2 != null)
    {
      i2 = 32;
      localObject1 = D;
      i1 = ((Integer)localObject1).intValue();
      paramfu.a(i2, i1);
    }
    localObject2 = E;
    if (localObject2 != null)
    {
      i2 = 33;
      localObject1 = E;
      i1 = ((Integer)localObject1).intValue();
      paramfu.a(i2, i1);
    }
    localObject2 = F;
    if (localObject2 != null)
    {
      i2 = 34;
      localObject1 = F;
      paramfu.a(i2, (String)localObject1);
    }
    localObject2 = G;
    if (localObject2 != null)
    {
      i2 = 35;
      localObject1 = G;
      l1 = ((Long)localObject1).longValue();
      paramfu.b(i2, l1);
    }
    localObject2 = H;
    if (localObject2 != null)
    {
      i2 = 36;
      localObject1 = H;
      l1 = ((Long)localObject1).longValue();
      paramfu.b(i2, l1);
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
        Object localObject2 = b;
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
          bool2 = fz.a((Object[])localObject1, (Object[])localObject2);
          if (!bool2)
          {
            bool1 = false;
            localfx2 = null;
          }
          else
          {
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
              bool2 = ((Long)localObject1).equals(localObject2);
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
              bool2 = ((Long)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                localfx2 = null;
                continue;
              }
            }
            localObject1 = g;
            if (localObject1 == null)
            {
              localObject1 = g;
              if (localObject1 != null)
              {
                bool1 = false;
                localfx2 = null;
              }
            }
            else
            {
              localObject1 = g;
              localObject2 = g;
              bool2 = ((Long)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                localfx2 = null;
                continue;
              }
            }
            localObject1 = h;
            if (localObject1 == null)
            {
              localObject1 = h;
              if (localObject1 != null)
              {
                bool1 = false;
                localfx2 = null;
              }
            }
            else
            {
              localObject1 = h;
              localObject2 = h;
              bool2 = ((Long)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                localfx2 = null;
                continue;
              }
            }
            localObject1 = i;
            if (localObject1 == null)
            {
              localObject1 = i;
              if (localObject1 != null)
              {
                bool1 = false;
                localfx2 = null;
              }
            }
            else
            {
              localObject1 = i;
              localObject2 = i;
              bool2 = ((String)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                localfx2 = null;
                continue;
              }
            }
            localObject1 = j;
            if (localObject1 == null)
            {
              localObject1 = j;
              if (localObject1 != null)
              {
                bool1 = false;
                localfx2 = null;
              }
            }
            else
            {
              localObject1 = j;
              localObject2 = j;
              bool2 = ((String)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                localfx2 = null;
                continue;
              }
            }
            localObject1 = k;
            if (localObject1 == null)
            {
              localObject1 = k;
              if (localObject1 != null)
              {
                bool1 = false;
                localfx2 = null;
              }
            }
            else
            {
              localObject1 = k;
              localObject2 = k;
              bool2 = ((String)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                localfx2 = null;
                continue;
              }
            }
            localObject1 = l;
            if (localObject1 == null)
            {
              localObject1 = l;
              if (localObject1 != null)
              {
                bool1 = false;
                localfx2 = null;
              }
            }
            else
            {
              localObject1 = l;
              localObject2 = l;
              bool2 = ((String)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                localfx2 = null;
                continue;
              }
            }
            localObject1 = m;
            if (localObject1 == null)
            {
              localObject1 = m;
              if (localObject1 != null)
              {
                bool1 = false;
                localfx2 = null;
              }
            }
            else
            {
              localObject1 = m;
              localObject2 = m;
              bool2 = ((Integer)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                localfx2 = null;
                continue;
              }
            }
            localObject1 = n;
            if (localObject1 == null)
            {
              localObject1 = n;
              if (localObject1 != null)
              {
                bool1 = false;
                localfx2 = null;
              }
            }
            else
            {
              localObject1 = n;
              localObject2 = n;
              bool2 = ((String)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                localfx2 = null;
                continue;
              }
            }
            localObject1 = o;
            if (localObject1 == null)
            {
              localObject1 = o;
              if (localObject1 != null)
              {
                bool1 = false;
                localfx2 = null;
              }
            }
            else
            {
              localObject1 = o;
              localObject2 = o;
              bool2 = ((String)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                localfx2 = null;
                continue;
              }
            }
            localObject1 = p;
            if (localObject1 == null)
            {
              localObject1 = p;
              if (localObject1 != null)
              {
                bool1 = false;
                localfx2 = null;
              }
            }
            else
            {
              localObject1 = p;
              localObject2 = p;
              bool2 = ((String)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                localfx2 = null;
                continue;
              }
            }
            localObject1 = q;
            if (localObject1 == null)
            {
              localObject1 = q;
              if (localObject1 != null)
              {
                bool1 = false;
                localfx2 = null;
              }
            }
            else
            {
              localObject1 = q;
              localObject2 = q;
              bool2 = ((Long)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                localfx2 = null;
                continue;
              }
            }
            localObject1 = r;
            if (localObject1 == null)
            {
              localObject1 = r;
              if (localObject1 != null)
              {
                bool1 = false;
                localfx2 = null;
              }
            }
            else
            {
              localObject1 = r;
              localObject2 = r;
              bool2 = ((Long)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                localfx2 = null;
                continue;
              }
            }
            localObject1 = s;
            if (localObject1 == null)
            {
              localObject1 = s;
              if (localObject1 != null)
              {
                bool1 = false;
                localfx2 = null;
              }
            }
            else
            {
              localObject1 = s;
              localObject2 = s;
              bool2 = ((String)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                localfx2 = null;
                continue;
              }
            }
            localObject1 = t;
            if (localObject1 == null)
            {
              localObject1 = t;
              if (localObject1 != null)
              {
                bool1 = false;
                localfx2 = null;
              }
            }
            else
            {
              localObject1 = t;
              localObject2 = t;
              bool2 = ((Boolean)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                localfx2 = null;
                continue;
              }
            }
            localObject1 = u;
            if (localObject1 == null)
            {
              localObject1 = u;
              if (localObject1 != null)
              {
                bool1 = false;
                localfx2 = null;
              }
            }
            else
            {
              localObject1 = u;
              localObject2 = u;
              bool2 = ((String)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                localfx2 = null;
                continue;
              }
            }
            localObject1 = v;
            if (localObject1 == null)
            {
              localObject1 = v;
              if (localObject1 != null)
              {
                bool1 = false;
                localfx2 = null;
              }
            }
            else
            {
              localObject1 = v;
              localObject2 = v;
              bool2 = ((Long)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                localfx2 = null;
                continue;
              }
            }
            localObject1 = w;
            if (localObject1 == null)
            {
              localObject1 = w;
              if (localObject1 != null)
              {
                bool1 = false;
                localfx2 = null;
              }
            }
            else
            {
              localObject1 = w;
              localObject2 = w;
              bool2 = ((Integer)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                localfx2 = null;
                continue;
              }
            }
            localObject1 = x;
            if (localObject1 == null)
            {
              localObject1 = x;
              if (localObject1 != null)
              {
                bool1 = false;
                localfx2 = null;
              }
            }
            else
            {
              localObject1 = x;
              localObject2 = x;
              bool2 = ((String)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                localfx2 = null;
                continue;
              }
            }
            localObject1 = y;
            if (localObject1 == null)
            {
              localObject1 = y;
              if (localObject1 != null)
              {
                bool1 = false;
                localfx2 = null;
              }
            }
            else
            {
              localObject1 = y;
              localObject2 = y;
              bool2 = ((String)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                localfx2 = null;
                continue;
              }
            }
            localObject1 = z;
            if (localObject1 == null)
            {
              localObject1 = z;
              if (localObject1 != null)
              {
                bool1 = false;
                localfx2 = null;
              }
            }
            else
            {
              localObject1 = z;
              localObject2 = z;
              bool2 = ((Boolean)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                localfx2 = null;
                continue;
              }
            }
            localObject1 = A;
            localObject2 = A;
            bool2 = fz.a((Object[])localObject1, (Object[])localObject2);
            if (!bool2)
            {
              bool1 = false;
              localfx2 = null;
            }
            else
            {
              localObject1 = B;
              if (localObject1 == null)
              {
                localObject1 = B;
                if (localObject1 != null)
                {
                  bool1 = false;
                  localfx2 = null;
                }
              }
              else
              {
                localObject1 = B;
                localObject2 = B;
                bool2 = ((String)localObject1).equals(localObject2);
                if (!bool2)
                {
                  bool1 = false;
                  localfx2 = null;
                  continue;
                }
              }
              localObject1 = C;
              if (localObject1 == null)
              {
                localObject1 = C;
                if (localObject1 != null)
                {
                  bool1 = false;
                  localfx2 = null;
                }
              }
              else
              {
                localObject1 = C;
                localObject2 = C;
                bool2 = ((Integer)localObject1).equals(localObject2);
                if (!bool2)
                {
                  bool1 = false;
                  localfx2 = null;
                  continue;
                }
              }
              localObject1 = D;
              if (localObject1 == null)
              {
                localObject1 = D;
                if (localObject1 != null)
                {
                  bool1 = false;
                  localfx2 = null;
                }
              }
              else
              {
                localObject1 = D;
                localObject2 = D;
                bool2 = ((Integer)localObject1).equals(localObject2);
                if (!bool2)
                {
                  bool1 = false;
                  localfx2 = null;
                  continue;
                }
              }
              localObject1 = E;
              if (localObject1 == null)
              {
                localObject1 = E;
                if (localObject1 != null)
                {
                  bool1 = false;
                  localfx2 = null;
                }
              }
              else
              {
                localObject1 = E;
                localObject2 = E;
                bool2 = ((Integer)localObject1).equals(localObject2);
                if (!bool2)
                {
                  bool1 = false;
                  localfx2 = null;
                  continue;
                }
              }
              localObject1 = F;
              if (localObject1 == null)
              {
                localObject1 = F;
                if (localObject1 != null)
                {
                  bool1 = false;
                  localfx2 = null;
                }
              }
              else
              {
                localObject1 = F;
                localObject2 = F;
                bool2 = ((String)localObject1).equals(localObject2);
                if (!bool2)
                {
                  bool1 = false;
                  localfx2 = null;
                  continue;
                }
              }
              localObject1 = G;
              if (localObject1 == null)
              {
                localObject1 = G;
                if (localObject1 != null)
                {
                  bool1 = false;
                  localfx2 = null;
                }
              }
              else
              {
                localObject1 = G;
                localObject2 = G;
                bool2 = ((Long)localObject1).equals(localObject2);
                if (!bool2)
                {
                  bool1 = false;
                  localfx2 = null;
                  continue;
                }
              }
              localObject1 = H;
              if (localObject1 == null)
              {
                localObject1 = H;
                if (localObject1 != null)
                {
                  bool1 = false;
                  localfx2 = null;
                }
              }
              else
              {
                localObject1 = H;
                localObject2 = H;
                bool2 = ((Long)localObject1).equals(localObject2);
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
      }
    }
  }
  
  public final int hashCode()
  {
    int i1 = 0;
    fx localfx = null;
    int i2 = getClass().getName().hashCode() + 527;
    int i3 = i2 * 31;
    Object localObject1 = a;
    if (localObject1 == null)
    {
      i2 = 0;
      localObject1 = null;
      i2 = (i2 + i3) * 31;
      i3 = fz.a(b);
      i2 = (i2 + i3) * 31;
      Object localObject2 = c;
      i3 = fz.a((Object[])localObject2);
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = d;
      if (localObject1 != null) {
        break label966;
      }
      i2 = 0;
      localObject1 = null;
      label106:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = e;
      if (localObject1 != null) {
        break label981;
      }
      i2 = 0;
      localObject1 = null;
      label133:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = f;
      if (localObject1 != null) {
        break label996;
      }
      i2 = 0;
      localObject1 = null;
      label160:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = g;
      if (localObject1 != null) {
        break label1011;
      }
      i2 = 0;
      localObject1 = null;
      label187:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = h;
      if (localObject1 != null) {
        break label1026;
      }
      i2 = 0;
      localObject1 = null;
      label214:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = i;
      if (localObject1 != null) {
        break label1041;
      }
      i2 = 0;
      localObject1 = null;
      label241:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = j;
      if (localObject1 != null) {
        break label1056;
      }
      i2 = 0;
      localObject1 = null;
      label268:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = k;
      if (localObject1 != null) {
        break label1071;
      }
      i2 = 0;
      localObject1 = null;
      label295:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = l;
      if (localObject1 != null) {
        break label1086;
      }
      i2 = 0;
      localObject1 = null;
      label322:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = m;
      if (localObject1 != null) {
        break label1101;
      }
      i2 = 0;
      localObject1 = null;
      label349:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = n;
      if (localObject1 != null) {
        break label1116;
      }
      i2 = 0;
      localObject1 = null;
      label376:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = o;
      if (localObject1 != null) {
        break label1131;
      }
      i2 = 0;
      localObject1 = null;
      label403:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = p;
      if (localObject1 != null) {
        break label1146;
      }
      i2 = 0;
      localObject1 = null;
      label430:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = q;
      if (localObject1 != null) {
        break label1161;
      }
      i2 = 0;
      localObject1 = null;
      label457:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = r;
      if (localObject1 != null) {
        break label1176;
      }
      i2 = 0;
      localObject1 = null;
      label484:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = s;
      if (localObject1 != null) {
        break label1191;
      }
      i2 = 0;
      localObject1 = null;
      label511:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = t;
      if (localObject1 != null) {
        break label1206;
      }
      i2 = 0;
      localObject1 = null;
      label538:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = u;
      if (localObject1 != null) {
        break label1221;
      }
      i2 = 0;
      localObject1 = null;
      label565:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = v;
      if (localObject1 != null) {
        break label1236;
      }
      i2 = 0;
      localObject1 = null;
      label592:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = w;
      if (localObject1 != null) {
        break label1251;
      }
      i2 = 0;
      localObject1 = null;
      label619:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = x;
      if (localObject1 != null) {
        break label1266;
      }
      i2 = 0;
      localObject1 = null;
      label646:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = y;
      if (localObject1 != null) {
        break label1281;
      }
      i2 = 0;
      localObject1 = null;
      label673:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = z;
      if (localObject1 != null) {
        break label1296;
      }
      i2 = 0;
      localObject1 = null;
      label700:
      i2 = (i2 + i3) * 31;
      localObject2 = A;
      i3 = fz.a((Object[])localObject2);
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = B;
      if (localObject1 != null) {
        break label1311;
      }
      i2 = 0;
      localObject1 = null;
      label748:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = C;
      if (localObject1 != null) {
        break label1326;
      }
      i2 = 0;
      localObject1 = null;
      label775:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = D;
      if (localObject1 != null) {
        break label1341;
      }
      i2 = 0;
      localObject1 = null;
      label802:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = E;
      if (localObject1 != null) {
        break label1356;
      }
      i2 = 0;
      localObject1 = null;
      label829:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = F;
      if (localObject1 != null) {
        break label1371;
      }
      i2 = 0;
      localObject1 = null;
      label856:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = G;
      if (localObject1 != null) {
        break label1386;
      }
      i2 = 0;
      localObject1 = null;
      label883:
      i2 += i3;
      i3 = i2 * 31;
      localObject1 = H;
      if (localObject1 != null) {
        break label1401;
      }
      i2 = 0;
      localObject1 = null;
      label910:
      i2 = (i2 + i3) * 31;
      localObject2 = ag;
      if (localObject2 != null)
      {
        localObject2 = ag;
        boolean bool = ((fx)localObject2).a();
        if (!bool) {
          break label1416;
        }
      }
    }
    for (;;)
    {
      return i2 + i1;
      localObject1 = a;
      i2 = ((Integer)localObject1).hashCode();
      break;
      label966:
      localObject1 = d;
      i2 = ((Long)localObject1).hashCode();
      break label106;
      label981:
      localObject1 = e;
      i2 = ((Long)localObject1).hashCode();
      break label133;
      label996:
      localObject1 = f;
      i2 = ((Long)localObject1).hashCode();
      break label160;
      label1011:
      localObject1 = g;
      i2 = ((Long)localObject1).hashCode();
      break label187;
      label1026:
      localObject1 = h;
      i2 = ((Long)localObject1).hashCode();
      break label214;
      label1041:
      localObject1 = i;
      i2 = ((String)localObject1).hashCode();
      break label241;
      label1056:
      localObject1 = j;
      i2 = ((String)localObject1).hashCode();
      break label268;
      label1071:
      localObject1 = k;
      i2 = ((String)localObject1).hashCode();
      break label295;
      label1086:
      localObject1 = l;
      i2 = ((String)localObject1).hashCode();
      break label322;
      label1101:
      localObject1 = m;
      i2 = ((Integer)localObject1).hashCode();
      break label349;
      label1116:
      localObject1 = n;
      i2 = ((String)localObject1).hashCode();
      break label376;
      label1131:
      localObject1 = o;
      i2 = ((String)localObject1).hashCode();
      break label403;
      label1146:
      localObject1 = p;
      i2 = ((String)localObject1).hashCode();
      break label430;
      label1161:
      localObject1 = q;
      i2 = ((Long)localObject1).hashCode();
      break label457;
      label1176:
      localObject1 = r;
      i2 = ((Long)localObject1).hashCode();
      break label484;
      label1191:
      localObject1 = s;
      i2 = ((String)localObject1).hashCode();
      break label511;
      label1206:
      localObject1 = t;
      i2 = ((Boolean)localObject1).hashCode();
      break label538;
      label1221:
      localObject1 = u;
      i2 = ((String)localObject1).hashCode();
      break label565;
      label1236:
      localObject1 = v;
      i2 = ((Long)localObject1).hashCode();
      break label592;
      label1251:
      localObject1 = w;
      i2 = ((Integer)localObject1).hashCode();
      break label619;
      label1266:
      localObject1 = x;
      i2 = ((String)localObject1).hashCode();
      break label646;
      label1281:
      localObject1 = y;
      i2 = ((String)localObject1).hashCode();
      break label673;
      label1296:
      localObject1 = z;
      i2 = ((Boolean)localObject1).hashCode();
      break label700;
      label1311:
      localObject1 = B;
      i2 = ((String)localObject1).hashCode();
      break label748;
      label1326:
      localObject1 = C;
      i2 = ((Integer)localObject1).hashCode();
      break label775;
      label1341:
      localObject1 = D;
      i2 = ((Integer)localObject1).hashCode();
      break label802;
      label1356:
      localObject1 = E;
      i2 = ((Integer)localObject1).hashCode();
      break label829;
      label1371:
      localObject1 = F;
      i2 = ((String)localObject1).hashCode();
      break label856;
      label1386:
      localObject1 = G;
      i2 = ((Long)localObject1).hashCode();
      break label883;
      label1401:
      localObject1 = H;
      i2 = ((Long)localObject1).hashCode();
      break label910;
      label1416:
      localfx = ag;
      i1 = localfx.hashCode();
    }
  }
}


/* Location:              com/google/android/gms/b/du$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */