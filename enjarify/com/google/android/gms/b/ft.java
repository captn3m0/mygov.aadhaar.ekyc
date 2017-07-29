package com.google.android.gms.b;

import java.nio.charset.Charset;

public final class ft
{
  final byte[] a;
  int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g = -1 >>> 1;
  private int h;
  private int i = 64;
  private int j = 67108864;
  
  private ft(byte[] paramArrayOfByte, int paramInt)
  {
    a = paramArrayOfByte;
    b = 0;
    int k = paramInt + 0;
    c = k;
    e = 0;
  }
  
  public static ft a(byte[] paramArrayOfByte, int paramInt)
  {
    ft localft = new com/google/android/gms/b/ft;
    localft.<init>(paramArrayOfByte, paramInt);
    return localft;
  }
  
  private void f(int paramInt)
  {
    if (paramInt < 0) {
      throw ga.b();
    }
    int k = e + paramInt;
    int m = g;
    if (k > m)
    {
      k = g;
      m = e;
      k -= m;
      f(k);
      throw ga.a();
    }
    k = c;
    m = e;
    k -= m;
    if (paramInt <= k)
    {
      k = e + paramInt;
      e = k;
      return;
    }
    throw ga.a();
  }
  
  private void k()
  {
    int k = c;
    int m = d;
    k += m;
    c = k;
    k = c;
    m = g;
    if (k > m)
    {
      m = g;
      k -= m;
      d = k;
      k = c;
      m = d;
      k -= m;
      c = k;
    }
    for (;;)
    {
      return;
      k = 0;
      d = 0;
    }
  }
  
  private byte l()
  {
    int k = e;
    int m = c;
    if (k == m) {
      throw ga.a();
    }
    byte[] arrayOfByte = a;
    m = e;
    int n = m + 1;
    e = n;
    return arrayOfByte[m];
  }
  
  public final int a()
  {
    int k = 0;
    int m = e;
    int n = c;
    if (m == n)
    {
      m = 1;
      if (m == 0) {
        break label35;
      }
      f = 0;
    }
    for (;;)
    {
      return k;
      m = 0;
      break;
      label35:
      k = e();
      f = k;
      k = f;
      if (k == 0) {
        throw ga.d();
      }
      k = f;
    }
  }
  
  public final void a(int paramInt)
  {
    int k = f;
    if (k != paramInt) {
      throw ga.e();
    }
  }
  
  public final void a(gb paramgb)
  {
    int k = e();
    int m = h;
    int n = i;
    if (m >= n) {
      throw ga.g();
    }
    k = c(k);
    m = h + 1;
    h = m;
    paramgb.a(this);
    a(0);
    m = h + -1;
    h = m;
    d(k);
  }
  
  public final boolean b()
  {
    int k = e();
    if (k != 0) {}
    int m;
    for (k = 1;; m = 0) {
      return k;
    }
  }
  
  public final boolean b(int paramInt)
  {
    boolean bool1 = true;
    int k = ge.a(paramInt);
    switch (k)
    {
    default: 
      throw ga.f();
    case 0: 
      e();
    }
    for (;;)
    {
      return bool1;
      h();
      continue;
      k = e();
      f(k);
      continue;
      boolean bool2;
      do
      {
        k = a();
        if (k == 0) {
          break;
        }
        bool2 = b(k);
      } while (bool2);
      int m = ge.b(paramInt);
      int n = 4;
      m = ge.a(m, n);
      a(m);
      continue;
      bool1 = false;
      continue;
      g();
    }
  }
  
  public final int c(int paramInt)
  {
    if (paramInt < 0) {
      throw ga.b();
    }
    int k = e + paramInt;
    int m = g;
    if (k > m) {
      throw ga.a();
    }
    g = k;
    k();
    return m;
  }
  
  public final String c()
  {
    int k = e();
    if (k < 0) {
      throw ga.b();
    }
    int m = c;
    int n = e;
    m -= n;
    if (k > m) {
      throw ga.a();
    }
    String str = new java/lang/String;
    byte[] arrayOfByte = a;
    int i1 = e;
    Charset localCharset = fz.a;
    str.<init>(arrayOfByte, i1, k, localCharset);
    n = e;
    k += n;
    e = k;
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
    byte[] arrayOfByte1;
    if (k == 0) {
      arrayOfByte1 = ge.l;
    }
    for (;;)
    {
      return arrayOfByte1;
      int m = c;
      int n = e;
      m -= n;
      if (k > m) {
        throw ga.a();
      }
      arrayOfByte1 = new byte[k];
      byte[] arrayOfByte2 = a;
      int i1 = e;
      System.arraycopy(arrayOfByte2, i1, arrayOfByte1, 0, k);
      n = e;
      k += n;
      e = k;
    }
  }
  
  public final int e()
  {
    int k = l();
    if (k >= 0) {}
    int n;
    do
    {
      for (;;)
      {
        return k;
        k &= 0x7F;
        m = l();
        if (m >= 0)
        {
          m <<= 7;
          k |= m;
        }
        else
        {
          m = (m & 0x7F) << 7;
          k |= m;
          m = l();
          if (m >= 0)
          {
            m <<= 14;
            k |= m;
          }
          else
          {
            m = (m & 0x7F) << 14;
            k |= m;
            m = l();
            if (m < 0) {
              break;
            }
            m <<= 21;
            k |= m;
          }
        }
      }
      m = (m & 0x7F) << 21;
      k |= m;
      m = l();
      n = m << 28;
      k |= n;
    } while (m >= 0);
    int m = 0;
    for (;;)
    {
      n = 5;
      if (m >= n) {
        break label158;
      }
      n = l();
      if (n >= 0) {
        break;
      }
      m += 1;
    }
    label158:
    throw ga.c();
  }
  
  public final void e(int paramInt)
  {
    int k = e;
    int m = b;
    k -= m;
    IllegalArgumentException localIllegalArgumentException;
    String str;
    if (paramInt > k)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      m = e;
      int n = b;
      m -= n;
      StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
      localStringBuilder1.<init>(50);
      str = "Position " + paramInt + " is beyond current " + m;
      localIllegalArgumentException.<init>(str);
      throw localIllegalArgumentException;
    }
    if (paramInt < 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
      localStringBuilder2.<init>(24);
      str = "Bad position " + paramInt;
      localIllegalArgumentException.<init>(str);
      throw localIllegalArgumentException;
    }
    k = b + paramInt;
    e = k;
  }
  
  public final long f()
  {
    int k = 0;
    long l1 = 0L;
    for (;;)
    {
      int m = 64;
      if (k >= m) {
        break;
      }
      m = l();
      int n = m & 0x7F;
      long l2 = n << k;
      l1 |= l2;
      m &= 0x80;
      if (m == 0) {
        return l1;
      }
      k += 7;
    }
    throw ga.c();
  }
  
  public final int g()
  {
    int k = l();
    int m = l();
    int n = l();
    int i1 = l();
    k &= 0xFF;
    m = (m & 0xFF) << 8;
    k |= m;
    m = (n & 0xFF) << 16;
    k |= m;
    m = (i1 & 0xFF) << 24;
    return k | m;
  }
  
  public final long h()
  {
    long l1 = 255L;
    int k = l();
    int m = l();
    int n = l();
    int i1 = l();
    int i2 = l();
    int i3 = l();
    int i4 = l();
    int i5 = l();
    long l2 = k & l1;
    long l3 = (m & l1) << 8 | l2;
    l2 = (n & l1) << 16;
    l3 |= l2;
    long l4 = (i1 & l1) << 24;
    l3 |= l4;
    l4 = (i2 & l1) << 32;
    l3 |= l4;
    l4 = (i3 & l1) << 40;
    l3 |= l4;
    l4 = (i4 & l1) << 48;
    l3 |= l4;
    l4 = (i5 & l1) << 56;
    return l3 | l4;
  }
  
  public final int i()
  {
    int k = g;
    int m = -1 >>> 1;
    if (k == m) {}
    for (k = -1;; k = m - k)
    {
      return k;
      k = e;
      m = g;
    }
  }
  
  public final int j()
  {
    int k = e;
    int m = b;
    return k - m;
  }
}


/* Location:              com/google/android/gms/b/ft.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */