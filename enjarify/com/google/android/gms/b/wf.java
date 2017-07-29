package com.google.android.gms.b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class wf
{
  private static long a(long paramLong1, long paramLong2)
  {
    int i = 47;
    long l1 = -4132994306676758123L;
    long l2 = (paramLong2 ^ paramLong1) * l1;
    long l3 = l2 >>> i;
    l2 = (l2 ^ l3 ^ paramLong1) * l1;
    l3 = l2 >>> i;
    return (l2 ^ l3) * l1;
  }
  
  public static long a(byte[] paramArrayOfByte)
  {
    Object localObject1 = paramArrayOfByte;
    int i = paramArrayOfByte.length;
    int j = 32;
    int n;
    int i2;
    int i3;
    int i4;
    if (i <= j)
    {
      int k = paramArrayOfByte.length & 0xFFFFFFF8;
      m = paramArrayOfByte.length & 0x7;
      l1 = paramArrayOfByte.length;
      l2 = -4132994306676758123L;
      l1 = l1 * l2 ^ 0xEC9B9EE68CF8F8DD;
      i = 0;
      l3 = l1;
      n = 0;
      while (n < k)
      {
        localObject1 = paramArrayOfByte;
        l2 = a(paramArrayOfByte, n) * -4132994306676758123L;
        i2 = 47;
        l4 = l2 >>> i2;
        l2 ^= l4;
        l4 = -4132994306676758123L;
        l2 *= l4;
        l3 ^= l2;
        l2 = -4132994306676758123L * l3;
        i = n + 8;
        n = i;
        l3 = l2;
      }
      if (m != 0)
      {
        l1 = 0L;
        i3 = Math.min(m, 8);
        i4 = 0;
        while (i4 < i3)
        {
          m = k + i4;
          l4 = paramArrayOfByte[m];
          l5 = 255L;
          l4 &= l5;
          m = i4 * 8;
          l4 <<= m;
          l1 |= l4;
          i4 += 1;
        }
        l3 ^= l1;
        l1 = -4132994306676758123L;
        l3 *= l1;
      }
      l1 = l3 >>> 47;
      l3 = (l3 ^ l1) * -4132994306676758123L;
      n = 47;
      l1 = l3 >>> n;
    }
    for (l3 ^= l1;; l3 *= l1)
    {
      localObject1 = paramArrayOfByte;
      n = paramArrayOfByte.length;
      i2 = 8;
      if (n < i2) {
        break label1272;
      }
      n = 0;
      l1 = a(paramArrayOfByte, 0);
      label304:
      localObject1 = paramArrayOfByte;
      i4 = paramArrayOfByte.length;
      i3 = 9;
      if (i4 < i3) {
        break label1280;
      }
      i4 = paramArrayOfByte.length + -8;
      l2 = a(paramArrayOfByte, i4);
      label336:
      l3 = a(l3 + l2, l1);
      l1 = 0L;
      boolean bool = l3 < l1;
      if (bool)
      {
        l1 = 1L;
        bool = l3 < l1;
        if (bool) {}
      }
      else
      {
        l1 = -2;
        l3 += l1;
      }
      return l3;
      i = paramArrayOfByte.length;
      j = 64;
      if (i > j) {
        break;
      }
      i = paramArrayOfByte.length;
      l1 = a(paramArrayOfByte, 24);
      l2 = a(paramArrayOfByte, 0);
      long l6 = i;
      j = i + -16;
      l4 = a(paramArrayOfByte, j);
      l6 = (l6 + l4) * -6505348102511208375L;
      l2 += l6;
      l6 = Long.rotateRight(l2 + l1, 52);
      l4 = Long.rotateRight(l2, 37);
      l5 = a(paramArrayOfByte, 8);
      l2 += l5;
      l5 = Long.rotateRight(l2, 7);
      l4 += l5;
      l5 = a(paramArrayOfByte, 16);
      l2 += l5;
      l1 += l2;
      l2 = Long.rotateRight(l2, 31) + l6 + l4;
      l6 = a(paramArrayOfByte, 16);
      j = i + -32;
      l4 = a(paramArrayOfByte, j);
      l6 += l4;
      j = i + -8;
      l4 = a(paramArrayOfByte, j);
      l5 = Long.rotateRight(l6 + l4, 52);
      l7 = Long.rotateRight(l6, 37);
      j = i + -24;
      long l8 = a(paramArrayOfByte, j);
      l6 += l8;
      j = 7;
      l8 = Long.rotateRight(l6, j);
      l7 += l8;
      i += -16;
      l3 = a(paramArrayOfByte, i) + l6;
      l6 = l3 + l4;
      i5 = 31;
      l3 = (Long.rotateRight(l3, i5) + l5 + l7 + l1) * -4288712594273399085L;
      l1 = l6 + l2;
      l6 = -6505348102511208375L;
      l1 *= l6;
      l3 += l1;
      l1 = l3 >>> 47;
      l3 = (l3 ^ l1) * -6505348102511208375L + l2;
      i1 = 47;
      l1 = l3 >>> i1;
      l3 ^= l1;
      l1 = -4288712594273399085L;
    }
    int m = paramArrayOfByte.length;
    long l9 = a(paramArrayOfByte, 0);
    i = m + -16;
    long l2 = a(paramArrayOfByte, i) ^ 0x8D58AC26AFE12E47;
    i = m + -56;
    long l10 = a(paramArrayOfByte, i) ^ 0xA5B85C5E198ED849;
    long[] arrayOfLong = new long[2];
    localObject1 = new long[2];
    Object localObject2 = localObject1;
    j = m + -64;
    long l1 = m;
    a(paramArrayOfByte, j, l1, l2, arrayOfLong);
    int i6 = m + -32;
    long l5 = m * -8261664234251669945L;
    a(paramArrayOfByte, i6, l5, -6505348102511208375L, (long[])localObject1);
    long l3 = arrayOfLong[1];
    int i1 = 47;
    l1 = l3 >>> i1;
    l3 = (l3 ^ l1) * -8261664234251669945L;
    l1 = l10 + l3;
    l3 = l1 + l9;
    int i5 = 39;
    l3 = Long.rotateRight(l3, i5);
    long l4 = -8261664234251669945L * l3;
    l3 = Long.rotateRight(l2, 33);
    long l7 = l3 * -8261664234251669945L;
    i = m + -1 & 0xFFFFFFC0;
    j = 0;
    l2 = l4;
    for (m = i;; m = i)
    {
      l2 += l7;
      l4 = arrayOfLong[0];
      l2 += l4;
      i = j + 16;
      localObject1 = paramArrayOfByte;
      l4 = a(paramArrayOfByte, i);
      l2 = Long.rotateRight(l2 + l4, 37) * -8261664234251669945L;
      l4 = arrayOfLong[1] + l7;
      i = j + 48;
      l5 = a(paramArrayOfByte, i);
      l4 = Long.rotateRight(l4 + l5, 42) * -8261664234251669945L;
      l5 = localObject2[1];
      l9 = l2 ^ l5;
      l2 = arrayOfLong[0];
      l7 = l4 ^ l2;
      l2 = localObject2[0];
      l10 = Long.rotateRight(l1 ^ l2, 33);
      l1 = arrayOfLong[1] * -8261664234251669945L;
      l2 = localObject2[0] + l9;
      a(paramArrayOfByte, j, l1, l2, arrayOfLong);
      i6 = j + 32;
      l1 = localObject2[1];
      l5 = l10 + l1;
      a(paramArrayOfByte, i6, l5, l7, (long[])localObject2);
      j += 64;
      i = m + -64;
      if (i == 0)
      {
        i = 0;
        l3 = arrayOfLong[0];
        l1 = localObject2[0];
        l3 = a(l3, l1);
        l1 = (l7 >>> 47 ^ l7) * -8261664234251669945L;
        l3 = l3 + l1 + l9;
        i1 = 1;
        l1 = arrayOfLong[i1];
        i4 = 1;
        l2 = localObject2[i4];
        l1 = a(l1, l2) + l10;
        l3 = a(l3, l1);
        break;
        label1272:
        l1 = -6505348102511208375L;
        break label304;
        label1280:
        l2 = -6505348102511208375L;
        break label336;
      }
      l1 = l9;
      l2 = l10;
    }
  }
  
  private static long a(byte[] paramArrayOfByte, int paramInt)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte, paramInt, 8);
    ByteOrder localByteOrder = ByteOrder.LITTLE_ENDIAN;
    localByteBuffer.order(localByteOrder);
    return localByteBuffer.getLong();
  }
  
  private static void a(byte[] paramArrayOfByte, int paramInt, long paramLong1, long paramLong2, long[] paramArrayOfLong)
  {
    long l1 = a(paramArrayOfByte, paramInt);
    int i = paramInt + 8;
    long l2 = a(paramArrayOfByte, i);
    int j = paramInt + 16;
    long l3 = a(paramArrayOfByte, j);
    int k = paramInt + 24;
    long l4 = a(paramArrayOfByte, k);
    l1 += paramLong1;
    long l5 = Long.rotateRight(paramLong2 + l1 + l4, 51);
    l2 = l2 + l1 + l3;
    l3 = Long.rotateRight(l2, 23) + l5;
    l2 += l4;
    paramArrayOfLong[0] = l2;
    l1 += l3;
    paramArrayOfLong[1] = l1;
  }
}


/* Location:              com/google/android/gms/b/wf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */