package com.google.android.gms.b;

public final class ft
{
  final byte[] a;
  int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g = Integer.MAX_VALUE;
  private int h;
  private int i = 64;
  private int j = 67108864;
  
  private ft(byte[] paramArrayOfByte, int paramInt)
  {
    a = paramArrayOfByte;
    b = 0;
    c = (paramInt + 0);
    e = 0;
  }
  
  public static ft a(byte[] paramArrayOfByte, int paramInt)
  {
    return new ft(paramArrayOfByte, paramInt);
  }
  
  private void f(int paramInt)
  {
    if (paramInt < 0) {
      throw ga.b();
    }
    if (e + paramInt > g)
    {
      f(g - e);
      throw ga.a();
    }
    if (paramInt <= c - e)
    {
      e += paramInt;
      return;
    }
    throw ga.a();
  }
  
  private void k()
  {
    c += d;
    int k = c;
    if (k > g)
    {
      d = (k - g);
      c -= d;
      return;
    }
    d = 0;
  }
  
  private byte l()
  {
    if (e == c) {
      throw ga.a();
    }
    byte[] arrayOfByte = a;
    int k = e;
    e = (k + 1);
    return arrayOfByte[k];
  }
  
  public final int a()
  {
    if (e == c) {}
    for (int k = 1; k != 0; k = 0)
    {
      f = 0;
      return 0;
    }
    f = e();
    if (f == 0) {
      throw ga.d();
    }
    return f;
  }
  
  public final void a(int paramInt)
  {
    if (f != paramInt) {
      throw ga.e();
    }
  }
  
  public final void a(gb paramgb)
  {
    int k = e();
    if (h >= i) {
      throw ga.g();
    }
    k = c(k);
    h += 1;
    paramgb.a(this);
    a(0);
    h -= 1;
    d(k);
  }
  
  public final boolean b()
  {
    return e() != 0;
  }
  
  public final boolean b(int paramInt)
  {
    switch (ge.a(paramInt))
    {
    default: 
      throw ga.f();
    case 0: 
      e();
      return true;
    case 1: 
      h();
      return true;
    case 2: 
      f(e());
      return true;
    case 3: 
      int k;
      do
      {
        k = a();
      } while ((k != 0) && (b(k)));
      a(ge.a(ge.b(paramInt), 4));
      return true;
    case 4: 
      return false;
    }
    g();
    return true;
  }
  
  public final int c(int paramInt)
  {
    if (paramInt < 0) {
      throw ga.b();
    }
    paramInt = e + paramInt;
    int k = g;
    if (paramInt > k) {
      throw ga.a();
    }
    g = paramInt;
    k();
    return k;
  }
  
  public final String c()
  {
    int k = e();
    if (k < 0) {
      throw ga.b();
    }
    if (k > c - e) {
      throw ga.a();
    }
    String str = new String(a, e, k, fz.a);
    e = (k + e);
    return str;
  }
  
  public final void d(int paramInt)
  {
    g = paramInt;
    k();
  }
  
  public final byte[] d()
  {
    int k = e();
    if (k < 0) {
      throw ga.b();
    }
    if (k == 0) {
      return ge.l;
    }
    if (k > c - e) {
      throw ga.a();
    }
    byte[] arrayOfByte = new byte[k];
    System.arraycopy(a, e, arrayOfByte, 0, k);
    e = (k + e);
    return arrayOfByte;
  }
  
  public final int e()
  {
    int k = l();
    if (k >= 0) {}
    int n;
    do
    {
      return k;
      k &= 0x7F;
      m = l();
      if (m >= 0) {
        return k | m << 7;
      }
      k |= (m & 0x7F) << 7;
      m = l();
      if (m >= 0) {
        return k | m << 14;
      }
      k |= (m & 0x7F) << 14;
      n = l();
      if (n >= 0) {
        return k | n << 21;
      }
      m = l();
      n = k | (n & 0x7F) << 21 | m << 28;
      k = n;
    } while (m >= 0);
    int m = 0;
    for (;;)
    {
      if (m >= 5) {
        break label133;
      }
      k = n;
      if (l() >= 0) {
        break;
      }
      m += 1;
    }
    label133:
    throw ga.c();
  }
  
  public final void e(int paramInt)
  {
    if (paramInt > e - b)
    {
      int k = e;
      int m = b;
      throw new IllegalArgumentException(50 + "Position " + paramInt + " is beyond current " + (k - m));
    }
    if (paramInt < 0) {
      throw new IllegalArgumentException(24 + "Bad position " + paramInt);
    }
    e = (b + paramInt);
  }
  
  public final long f()
  {
    int k = 0;
    long l = 0L;
    while (k < 64)
    {
      int m = l();
      l |= (m & 0x7F) << k;
      if ((m & 0x80) == 0) {
        return l;
      }
      k += 7;
    }
    throw ga.c();
  }
  
  public final int g()
  {
    return l() & 0xFF | (l() & 0xFF) << 8 | (l() & 0xFF) << 16 | (l() & 0xFF) << 24;
  }
  
  public final long h()
  {
    int k = l();
    int m = l();
    int n = l();
    int i1 = l();
    int i2 = l();
    int i3 = l();
    int i4 = l();
    int i5 = l();
    long l = k;
    return (m & 0xFF) << 8 | l & 0xFF | (n & 0xFF) << 16 | (i1 & 0xFF) << 24 | (i2 & 0xFF) << 32 | (i3 & 0xFF) << 40 | (i4 & 0xFF) << 48 | (i5 & 0xFF) << 56;
  }
  
  public final int i()
  {
    if (g == Integer.MAX_VALUE) {
      return -1;
    }
    int k = e;
    return g - k;
  }
  
  public final int j()
  {
    return e - b;
  }
}


/* Location:              com/google/android/gms/b/ft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */