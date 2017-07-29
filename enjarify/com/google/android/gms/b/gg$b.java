package com.google.android.gms.b;

public final class gg$b
  extends fv
{
  public String a = "";
  public String b = "";
  public long c = 0L;
  public String d = "";
  public int e = 0;
  public int f = 0;
  public String g = "";
  public String h = "";
  public String i = "";
  public String j = "";
  public String k = "";
  public int l = 0;
  public gg.a[] m;
  
  public gg$b()
  {
    gg.a[] arrayOfa = gg.a.b();
    m = arrayOfa;
    ag = null;
    ah = -1;
  }
  
  protected final int a()
  {
    int n = super.a();
    Object localObject1 = a;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = a;
      localObject2 = "";
      boolean bool1 = ((String)localObject1).equals(localObject2);
      if (!bool1)
      {
        localObject2 = a;
        int i1 = fu.b(1, (String)localObject2);
        n += i1;
      }
    }
    localObject1 = b;
    if (localObject1 != null)
    {
      localObject1 = b;
      localObject2 = "";
      boolean bool2 = ((String)localObject1).equals(localObject2);
      if (!bool2)
      {
        localObject2 = b;
        int i2 = fu.b(2, (String)localObject2);
        n += i2;
      }
    }
    long l1 = c;
    long l2 = 0L;
    boolean bool3 = l1 < l2;
    if (bool3)
    {
      l1 = c;
      int i3 = fu.c(3, l1);
      n += i3;
    }
    localObject1 = d;
    if (localObject1 != null)
    {
      localObject1 = d;
      localObject2 = "";
      boolean bool4 = ((String)localObject1).equals(localObject2);
      if (!bool4)
      {
        localObject2 = d;
        i4 = fu.b(4, (String)localObject2);
        n += i4;
      }
    }
    int i4 = e;
    int i10;
    if (i4 != 0)
    {
      i10 = e;
      i4 = fu.b(5, i10);
      n += i4;
    }
    i4 = f;
    if (i4 != 0)
    {
      i10 = f;
      i4 = fu.b(6, i10);
      n += i4;
    }
    localObject1 = g;
    if (localObject1 != null)
    {
      localObject1 = g;
      localObject2 = "";
      boolean bool5 = ((String)localObject1).equals(localObject2);
      if (!bool5)
      {
        localObject2 = g;
        int i5 = fu.b(7, (String)localObject2);
        n += i5;
      }
    }
    localObject1 = h;
    if (localObject1 != null)
    {
      localObject1 = h;
      localObject2 = "";
      boolean bool6 = ((String)localObject1).equals(localObject2);
      if (!bool6)
      {
        localObject2 = h;
        int i6 = fu.b(8, (String)localObject2);
        n += i6;
      }
    }
    localObject1 = i;
    if (localObject1 != null)
    {
      localObject1 = i;
      localObject2 = "";
      boolean bool7 = ((String)localObject1).equals(localObject2);
      if (!bool7)
      {
        localObject2 = i;
        int i7 = fu.b(9, (String)localObject2);
        n += i7;
      }
    }
    localObject1 = j;
    if (localObject1 != null)
    {
      localObject1 = j;
      localObject2 = "";
      boolean bool8 = ((String)localObject1).equals(localObject2);
      if (!bool8)
      {
        localObject2 = j;
        int i8 = fu.b(10, (String)localObject2);
        n += i8;
      }
    }
    localObject1 = k;
    if (localObject1 != null)
    {
      localObject1 = k;
      localObject2 = "";
      boolean bool9 = ((String)localObject1).equals(localObject2);
      if (!bool9)
      {
        localObject2 = k;
        i9 = fu.b(11, (String)localObject2);
        n += i9;
      }
    }
    int i9 = l;
    if (i9 != 0)
    {
      i10 = l;
      i9 = fu.b(12, i10);
      n += i9;
    }
    localObject1 = m;
    if (localObject1 != null)
    {
      localObject1 = m;
      i9 = localObject1.length;
      if (i9 > 0)
      {
        localObject1 = null;
        i9 = n;
        n = 0;
        for (;;)
        {
          localObject2 = m;
          i10 = localObject2.length;
          if (n >= i10) {
            break;
          }
          localObject2 = m[n];
          if (localObject2 != null)
          {
            int i11 = 13;
            i10 = fu.b(i11, (gb)localObject2);
            i9 += i10;
          }
          n += 1;
        }
        n = i9;
      }
    }
    return n;
  }
  
  public final void a(fu paramfu)
  {
    Object localObject1 = a;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = a;
      localObject2 = "";
      int n = ((String)localObject1).equals(localObject2);
      if (n == 0)
      {
        n = 1;
        localObject2 = a;
        paramfu.a(n, (String)localObject2);
      }
    }
    localObject1 = b;
    if (localObject1 != null)
    {
      localObject1 = b;
      localObject2 = "";
      boolean bool1 = ((String)localObject1).equals(localObject2);
      if (!bool1)
      {
        int i1 = 2;
        localObject2 = b;
        paramfu.a(i1, (String)localObject2);
      }
    }
    long l1 = c;
    long l2 = 0L;
    boolean bool2 = l1 < l2;
    if (bool2)
    {
      int i2 = 3;
      l2 = c;
      paramfu.b(i2, l2);
    }
    localObject1 = d;
    if (localObject1 != null)
    {
      localObject1 = d;
      localObject2 = "";
      boolean bool3 = ((String)localObject1).equals(localObject2);
      if (!bool3)
      {
        i3 = 4;
        localObject2 = d;
        paramfu.a(i3, (String)localObject2);
      }
    }
    int i3 = e;
    int i9;
    if (i3 != 0)
    {
      i3 = 5;
      i9 = e;
      paramfu.a(i3, i9);
    }
    i3 = f;
    if (i3 != 0)
    {
      i3 = 6;
      i9 = f;
      paramfu.a(i3, i9);
    }
    localObject1 = g;
    if (localObject1 != null)
    {
      localObject1 = g;
      localObject2 = "";
      boolean bool4 = ((String)localObject1).equals(localObject2);
      if (!bool4)
      {
        int i4 = 7;
        localObject2 = g;
        paramfu.a(i4, (String)localObject2);
      }
    }
    localObject1 = h;
    if (localObject1 != null)
    {
      localObject1 = h;
      localObject2 = "";
      boolean bool5 = ((String)localObject1).equals(localObject2);
      if (!bool5)
      {
        int i5 = 8;
        localObject2 = h;
        paramfu.a(i5, (String)localObject2);
      }
    }
    localObject1 = i;
    if (localObject1 != null)
    {
      localObject1 = i;
      localObject2 = "";
      boolean bool6 = ((String)localObject1).equals(localObject2);
      if (!bool6)
      {
        int i6 = 9;
        localObject2 = i;
        paramfu.a(i6, (String)localObject2);
      }
    }
    localObject1 = j;
    if (localObject1 != null)
    {
      localObject1 = j;
      localObject2 = "";
      boolean bool7 = ((String)localObject1).equals(localObject2);
      if (!bool7)
      {
        int i7 = 10;
        localObject2 = j;
        paramfu.a(i7, (String)localObject2);
      }
    }
    localObject1 = k;
    if (localObject1 != null)
    {
      localObject1 = k;
      localObject2 = "";
      boolean bool8 = ((String)localObject1).equals(localObject2);
      if (!bool8)
      {
        i8 = 11;
        localObject2 = k;
        paramfu.a(i8, (String)localObject2);
      }
    }
    int i8 = l;
    if (i8 != 0)
    {
      i8 = 12;
      i9 = l;
      paramfu.a(i8, i9);
    }
    localObject1 = m;
    if (localObject1 != null)
    {
      localObject1 = m;
      i8 = localObject1.length;
      if (i8 > 0)
      {
        i8 = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = m;
          i9 = localObject2.length;
          if (i8 >= i9) {
            break;
          }
          localObject2 = m[i8];
          if (localObject2 != null)
          {
            int i10 = 13;
            paramfu.a(i10, (gb)localObject2);
          }
          i8 += 1;
        }
      }
    }
    super.a(paramfu);
  }
}


/* Location:              com/google/android/gms/b/gg$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */