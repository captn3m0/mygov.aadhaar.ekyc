package com.google.android.gms.b;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class fu
{
  private final ByteBuffer a;
  
  private fu(ByteBuffer paramByteBuffer)
  {
    a = paramByteBuffer;
    ByteBuffer localByteBuffer = a;
    ByteOrder localByteOrder = ByteOrder.LITTLE_ENDIAN;
    localByteBuffer.order(localByteOrder);
  }
  
  private fu(byte[] paramArrayOfByte, int paramInt)
  {
    this(localByteBuffer);
  }
  
  public static int a(int paramInt)
  {
    if (paramInt >= 0) {}
    for (int i = d(paramInt);; i = 10) {
      return i;
    }
  }
  
  private static int a(CharSequence paramCharSequence)
  {
    int i = 2048;
    int j = 0;
    Object localObject1 = null;
    int k = paramCharSequence.length();
    int m = 0;
    Object localObject2 = null;
    int n;
    int i1;
    while (m < k)
    {
      n = paramCharSequence.charAt(m);
      i1 = 128;
      if (n >= i1) {
        break;
      }
      m += 1;
    }
    for (;;)
    {
      if (m < k)
      {
        i1 = paramCharSequence.charAt(m);
        if (i1 < i)
        {
          i1 = 127 - i1 >>> 31;
          n += i1;
          m += 1;
        }
        else
        {
          i1 = paramCharSequence.length();
          if (m < i1)
          {
            int i2 = paramCharSequence.charAt(m);
            if (i2 < i)
            {
              i2 = 127 - i2 >>> 31;
              j += i2;
            }
            for (;;)
            {
              m += 1;
              break;
              j += 2;
              int i3 = 55296;
              if (i3 <= i2)
              {
                i3 = 57343;
                if (i2 <= i3)
                {
                  i2 = Character.codePointAt(paramCharSequence, m);
                  i3 = 65536;
                  if (i2 < i3)
                  {
                    localObject1 = new java/lang/IllegalArgumentException;
                    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
                    localStringBuilder1.<init>(39);
                    localObject2 = "Unpaired surrogate at index " + m;
                    ((IllegalArgumentException)localObject1).<init>((String)localObject2);
                    throw ((Throwable)localObject1);
                  }
                  m += 1;
                }
              }
            }
          }
          j += n;
        }
      }
      else
      {
        for (;;)
        {
          if (j < k)
          {
            localObject2 = new java/lang/IllegalArgumentException;
            long l = j + 4294967296L;
            StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
            localStringBuilder2.<init>(54);
            localObject1 = "UTF-8 length does not fit in int: " + l;
            ((IllegalArgumentException)localObject2).<init>((String)localObject1);
            throw ((Throwable)localObject2);
          }
          return j;
          j = n;
        }
        n = k;
      }
    }
  }
  
  private static int a(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 128;
    int j = paramCharSequence.length();
    int k = 0;
    Object localObject1 = null;
    int m = paramInt1 + paramInt2;
    int n;
    int i2;
    while (k < j)
    {
      n = k + paramInt1;
      if (n >= m) {
        break;
      }
      n = paramCharSequence.charAt(k);
      if (n >= i) {
        break;
      }
      i2 = paramInt1 + k;
      n = (byte)n;
      paramArrayOfByte[i2] = n;
      k += 1;
    }
    if (k == j) {}
    int i5;
    for (k = paramInt1 + j;; k = i5)
    {
      return k;
      i2 = paramInt1 + k;
      if (k < j)
      {
        int i6 = paramCharSequence.charAt(k);
        if ((i6 < i) && (i2 < m))
        {
          n = i2 + 1;
          i6 = (byte)i6;
          paramArrayOfByte[i2] = i6;
        }
        int i8;
        for (;;)
        {
          k += 1;
          i2 = n;
          break;
          n = 2048;
          int i3;
          if (i6 < n)
          {
            n = m + -2;
            if (i2 <= n)
            {
              i9 = i2 + 1;
              n = (byte)(i6 >>> 6 | 0x3C0);
              paramArrayOfByte[i2] = n;
              n = i9 + 1;
              i3 = (byte)(i6 & 0x3F | 0x80);
              paramArrayOfByte[i9] = i3;
              continue;
            }
          }
          n = 55296;
          int i4;
          int i7;
          if (i6 >= n)
          {
            n = 57343;
            if (n >= i6) {}
          }
          else
          {
            n = m + -3;
            if (i3 <= n)
            {
              n = i3 + 1;
              i9 = (byte)(i6 >>> 12 | 0x1E0);
              paramArrayOfByte[i3] = i9;
              i4 = n + 1;
              i9 = (byte)(i6 >>> 6 & 0x3F | 0x80);
              paramArrayOfByte[n] = i9;
              n = i4 + 1;
              i7 = (byte)(i6 & 0x3F | 0x80);
              paramArrayOfByte[i4] = i7;
              continue;
            }
          }
          n = m + -4;
          if (i4 > n) {
            break label590;
          }
          n = k + 1;
          int i9 = paramCharSequence.length();
          if (n != i9)
          {
            k += 1;
            n = paramCharSequence.charAt(k);
            boolean bool = Character.isSurrogatePair(i7, n);
            if (bool) {}
          }
          else
          {
            localObject2 = new java/lang/IllegalArgumentException;
            k += -1;
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>(39);
            localObject1 = "Unpaired surrogate at index " + k;
            ((IllegalArgumentException)localObject2).<init>((String)localObject1);
            throw ((Throwable)localObject2);
          }
          i8 = Character.toCodePoint(i7, n);
          int i1 = i4 + 1;
          int i10 = (byte)(i8 >>> 18 | 0xF0);
          paramArrayOfByte[i4] = i10;
          i5 = i1 + 1;
          i10 = (byte)(i8 >>> 12 & 0x3F | 0x80);
          paramArrayOfByte[i1] = i10;
          i10 = i5 + 1;
          i1 = (byte)(i8 >>> 6 & 0x3F | 0x80);
          paramArrayOfByte[i5] = i1;
          i1 = i10 + 1;
          i5 = (byte)(i8 & 0x3F | 0x80);
          paramArrayOfByte[i10] = i5;
        }
        label590:
        localObject1 = new java/lang/ArrayIndexOutOfBoundsException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(37);
        Object localObject2 = "Failed writing " + i8 + " at index " + i5;
        ((ArrayIndexOutOfBoundsException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
  }
  
  public static int a(String paramString)
  {
    int i = a(paramString);
    int j = d(i);
    return i + j;
  }
  
  public static int a(byte[] paramArrayOfByte)
  {
    int i = d(paramArrayOfByte.length);
    int j = paramArrayOfByte.length;
    return i + j;
  }
  
  public static fu a(byte[] paramArrayOfByte, int paramInt)
  {
    fu localfu = new com/google/android/gms/b/fu;
    localfu.<init>(paramArrayOfByte, paramInt);
    return localfu;
  }
  
  private static void a(CharSequence paramCharSequence, ByteBuffer paramByteBuffer)
  {
    boolean bool = paramByteBuffer.isReadOnly();
    Object localObject;
    if (bool)
    {
      localObject = new java/nio/ReadOnlyBufferException;
      ((ReadOnlyBufferException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    bool = paramByteBuffer.hasArray();
    if (bool) {}
    for (;;)
    {
      try
      {
        localObject = paramByteBuffer.array();
        int j = paramByteBuffer.arrayOffset();
        int k = paramByteBuffer.position();
        j += k;
        k = paramByteBuffer.remaining();
        int i = a(paramCharSequence, (byte[])localObject, j, k);
        j = paramByteBuffer.arrayOffset();
        i -= j;
        paramByteBuffer.position(i);
        return;
      }
      catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
      {
        BufferOverflowException localBufferOverflowException = new java/nio/BufferOverflowException;
        localBufferOverflowException.<init>();
        localBufferOverflowException.initCause(localArrayIndexOutOfBoundsException);
        throw localBufferOverflowException;
      }
      b(paramCharSequence, paramByteBuffer);
    }
  }
  
  public static int b(int paramInt)
  {
    return d(ge.a(paramInt, 0));
  }
  
  public static int b(int paramInt1, int paramInt2)
  {
    int i = b(paramInt1);
    int j = a(paramInt2);
    return i + j;
  }
  
  public static int b(int paramInt, gb paramgb)
  {
    int i = b(paramInt);
    int j = paramgb.f();
    int k = d(j);
    j += k;
    return i + j;
  }
  
  public static int b(int paramInt, String paramString)
  {
    int i = b(paramInt);
    int j = a(paramString);
    return i + j;
  }
  
  public static int b(int paramInt, byte[] paramArrayOfByte)
  {
    int i = b(paramInt);
    int j = a(paramArrayOfByte);
    return i + j;
  }
  
  public static int b(long paramLong)
  {
    long l1 = 0L;
    long l2 = Byte.MIN_VALUE & paramLong;
    int i = l2 < l1;
    if (i == 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      l2 = 0xFFFFFFFFFFFFC000 & paramLong;
      boolean bool1 = l2 < l1;
      if (!bool1)
      {
        int j = 2;
      }
      else
      {
        l2 = 0xFFE00000 & paramLong;
        boolean bool2 = l2 < l1;
        if (!bool2)
        {
          int k = 3;
        }
        else
        {
          l2 = 0xF0000000 & paramLong;
          boolean bool3 = l2 < l1;
          if (!bool3)
          {
            int m = 4;
          }
          else
          {
            l2 = 0xFFFFFFF800000000 & paramLong;
            boolean bool4 = l2 < l1;
            if (!bool4)
            {
              int n = 5;
            }
            else
            {
              l2 = 0xFFFFFC0000000000 & paramLong;
              boolean bool5 = l2 < l1;
              if (!bool5)
              {
                int i1 = 6;
              }
              else
              {
                l2 = 0xFFFE000000000000 & paramLong;
                boolean bool6 = l2 < l1;
                if (!bool6)
                {
                  int i2 = 7;
                }
                else
                {
                  l2 = 0xFF00000000000000 & paramLong;
                  boolean bool7 = l2 < l1;
                  if (!bool7)
                  {
                    int i3 = 8;
                  }
                  else
                  {
                    l2 = 0x8000000000000000 & paramLong;
                    boolean bool8 = l2 < l1;
                    int i4;
                    if (!bool8) {
                      i4 = 9;
                    } else {
                      i4 = 10;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  private static void b(CharSequence paramCharSequence, ByteBuffer paramByteBuffer)
  {
    int i = paramCharSequence.length();
    int j = 0;
    String str = null;
    if (j < i)
    {
      int k = paramCharSequence.charAt(j);
      int i1 = 128;
      if (k < i1)
      {
        k = (byte)k;
        paramByteBuffer.put(k);
      }
      for (;;)
      {
        j += 1;
        break;
        int i2 = 2048;
        int m;
        if (k < i2)
        {
          byte b1 = (byte)(k >>> 6 | 0x3C0);
          paramByteBuffer.put(b1);
          m = (byte)(k & 0x3F | 0x80);
          paramByteBuffer.put(m);
        }
        else
        {
          int i3 = 55296;
          if (m >= i3)
          {
            int i4 = 57343;
            if (i4 >= m) {}
          }
          else
          {
            byte b2 = (byte)(m >>> 12 | 0x1E0);
            paramByteBuffer.put(b2);
            b2 = (byte)(m >>> 6 & 0x3F | 0x80);
            paramByteBuffer.put(b2);
            m = (byte)(m & 0x3F | 0x80);
            paramByteBuffer.put(m);
            continue;
          }
          int i5 = j + 1;
          int i6 = paramCharSequence.length();
          if (i5 != i6)
          {
            j += 1;
            i5 = paramCharSequence.charAt(j);
            boolean bool = Character.isSurrogatePair(m, i5);
            if (bool) {}
          }
          else
          {
            IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
            j += -1;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>(39);
            str = "Unpaired surrogate at index " + j;
            localIllegalArgumentException.<init>(str);
            throw localIllegalArgumentException;
          }
          int n = Character.toCodePoint(m, i5);
          byte b3 = (byte)(n >>> 18 | 0xF0);
          paramByteBuffer.put(b3);
          b3 = (byte)(n >>> 12 & 0x3F | 0x80);
          paramByteBuffer.put(b3);
          b3 = (byte)(n >>> 6 & 0x3F | 0x80);
          paramByteBuffer.put(b3);
          n = (byte)(n & 0x3F | 0x80);
          paramByteBuffer.put(n);
        }
      }
    }
  }
  
  public static int c(int paramInt, long paramLong)
  {
    int i = b(paramInt);
    int j = b(paramLong);
    return i + j;
  }
  
  public static long c(long paramLong)
  {
    long l1 = paramLong << 1;
    long l2 = paramLong >> 63;
    return l1 ^ l2;
  }
  
  public static int d(int paramInt)
  {
    int i = paramInt & 0xFFFFFF80;
    if (i == 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      i = paramInt & 0xC000;
      if (i == 0)
      {
        i = 2;
      }
      else
      {
        i = 0xFFE00000 & paramInt;
        if (i == 0)
        {
          i = 3;
        }
        else
        {
          i = 0xF0000000 & paramInt;
          if (i == 0) {
            i = 4;
          } else {
            i = 5;
          }
        }
      }
    }
  }
  
  private void e(int paramInt)
  {
    byte b = (byte)paramInt;
    ByteBuffer localByteBuffer = a;
    boolean bool = localByteBuffer.hasRemaining();
    if (!bool)
    {
      fu.a locala = new com/google/android/gms/b/fu$a;
      int i = a.position();
      int j = a.limit();
      locala.<init>(i, j);
      throw locala;
    }
    a.put(b);
  }
  
  public final void a()
  {
    Object localObject = a;
    int i = ((ByteBuffer)localObject).remaining();
    if (i != 0)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Did not write as much data as expected.");
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(int paramInt, double paramDouble)
  {
    int i = 1;
    c(paramInt, i);
    long l = Double.doubleToLongBits(paramDouble);
    ByteBuffer localByteBuffer = a;
    int j = localByteBuffer.remaining();
    int k = 8;
    if (j < k)
    {
      fu.a locala = new com/google/android/gms/b/fu$a;
      int m = a.position();
      j = a.limit();
      locala.<init>(m, j);
      throw locala;
    }
    a.putLong(l);
  }
  
  public final void a(int paramInt, float paramFloat)
  {
    c(paramInt, 5);
    int i = Float.floatToIntBits(paramFloat);
    ByteBuffer localByteBuffer = a;
    int j = localByteBuffer.remaining();
    int k = 4;
    if (j < k)
    {
      fu.a locala = new com/google/android/gms/b/fu$a;
      j = a.position();
      k = a.limit();
      locala.<init>(j, k);
      throw locala;
    }
    a.putInt(i);
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    c(paramInt1, 0);
    if (paramInt2 >= 0) {
      c(paramInt2);
    }
    for (;;)
    {
      return;
      long l = paramInt2;
      a(l);
    }
  }
  
  public final void a(int paramInt, long paramLong)
  {
    c(paramInt, 0);
    a(paramLong);
  }
  
  public final void a(int paramInt, gb paramgb)
  {
    c(paramInt, 2);
    a(paramgb);
  }
  
  public final void a(int paramInt, String paramString)
  {
    int i = 2;
    c(paramInt, i);
    try
    {
      i = paramString.length();
      i = d(i);
      j = paramString.length() * 3;
      j = d(j);
      if (i != j) {
        break label241;
      }
      localObject1 = a;
      j = ((ByteBuffer)localObject1).position();
      localObject2 = a;
      k = ((ByteBuffer)localObject2).remaining();
      if (k < i)
      {
        localObject2 = new com/google/android/gms/b/fu$a;
        i += j;
        localObject1 = a;
        j = ((ByteBuffer)localObject1).limit();
        ((fu.a)localObject2).<init>(i, j);
        throw ((Throwable)localObject2);
      }
    }
    catch (BufferOverflowException localBufferOverflowException)
    {
      Object localObject1 = new com/google/android/gms/b/fu$a;
      k = a.position();
      m = a.limit();
      ((fu.a)localObject1).<init>(k, m);
      ((fu.a)localObject1).initCause(localBufferOverflowException);
      throw ((Throwable)localObject1);
    }
    Object localObject2 = a;
    int m = j + i;
    ((ByteBuffer)localObject2).position(m);
    localObject2 = a;
    a(paramString, (ByteBuffer)localObject2);
    localObject2 = a;
    int k = ((ByteBuffer)localObject2).position();
    ByteBuffer localByteBuffer2 = a;
    localByteBuffer2.position(j);
    int j = k - j;
    i = j - i;
    c(i);
    ByteBuffer localByteBuffer1 = a;
    localByteBuffer1.position(k);
    for (;;)
    {
      return;
      label241:
      i = a(paramString);
      c(i);
      localByteBuffer1 = a;
      a(paramString, localByteBuffer1);
    }
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    int i = 0;
    c(paramInt, 0);
    if (paramBoolean) {
      i = 1;
    }
    e(i);
  }
  
  public final void a(int paramInt, byte[] paramArrayOfByte)
  {
    c(paramInt, 2);
    int i = paramArrayOfByte.length;
    c(i);
    b(paramArrayOfByte);
  }
  
  public final void a(long paramLong)
  {
    for (;;)
    {
      long l1 = Byte.MIN_VALUE & paramLong;
      long l2 = 0L;
      boolean bool = l1 < l2;
      if (!bool)
      {
        i = (int)paramLong;
        e(i);
        return;
      }
      int i = (int)paramLong & 0x7F | 0x80;
      e(i);
      i = 7;
      paramLong >>>= i;
    }
  }
  
  public final void a(gb paramgb)
  {
    int i = paramgb.e();
    c(i);
    paramgb.a(this);
  }
  
  public final void b(int paramInt, long paramLong)
  {
    c(paramInt, 0);
    a(paramLong);
  }
  
  public final void b(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    ByteBuffer localByteBuffer = a;
    int j = localByteBuffer.remaining();
    if (j >= i)
    {
      a.put(paramArrayOfByte, 0, i);
      return;
    }
    fu.a locala = new com/google/android/gms/b/fu$a;
    j = a.position();
    int k = a.limit();
    locala.<init>(j, k);
    throw locala;
  }
  
  public final void c(int paramInt)
  {
    for (;;)
    {
      int i = paramInt & 0xFFFFFF80;
      if (i == 0)
      {
        e(paramInt);
        return;
      }
      i = paramInt & 0x7F | 0x80;
      e(i);
      paramInt >>>= 7;
    }
  }
  
  public final void c(int paramInt1, int paramInt2)
  {
    int i = ge.a(paramInt1, paramInt2);
    c(i);
  }
}


/* Location:              com/google/android/gms/b/fu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */