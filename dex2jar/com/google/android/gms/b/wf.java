package com.google.android.gms.b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class wf
{
  private static long a(long paramLong1, long paramLong2)
  {
    paramLong2 = (paramLong2 ^ paramLong1) * -4132994306676758123L;
    paramLong1 = (paramLong2 ^ paramLong2 >>> 47 ^ paramLong1) * -4132994306676758123L;
    return (paramLong1 ^ paramLong1 >>> 47) * -4132994306676758123L;
  }
  
  public static long a(byte[] paramArrayOfByte)
  {
    int j;
    long l1;
    int i;
    long l2;
    if (paramArrayOfByte.length <= 32)
    {
      j = paramArrayOfByte.length & 0xFFFFFFF8;
      int k = paramArrayOfByte.length & 0x7;
      l1 = paramArrayOfByte.length * -4132994306676758123L ^ 0xEC9B9EE68CF8F8DD;
      i = 0;
      while (i < j)
      {
        l2 = a(paramArrayOfByte, i) * -4132994306676758123L;
        i += 8;
        l1 = -4132994306676758123L * (l1 ^ (l2 ^ l2 >>> 47) * -4132994306676758123L);
      }
      l2 = l1;
      if (k != 0)
      {
        l2 = 0L;
        k = Math.min(k, 8);
        i = 0;
        while (i < k)
        {
          l2 |= (paramArrayOfByte[(j + i)] & 0xFF) << i * 8;
          i += 1;
        }
        l2 = (l1 ^ l2) * -4132994306676758123L;
      }
      l1 = (l2 ^ l2 >>> 47) * -4132994306676758123L;
      l1 ^= l1 >>> 47;
    }
    label180:
    long l3;
    label198:
    long l4;
    long[] arrayOfLong1;
    long[] arrayOfLong2;
    while (paramArrayOfByte.length >= 8)
    {
      l2 = a(paramArrayOfByte, 0);
      if (paramArrayOfByte.length < 9) {
        break label855;
      }
      l3 = a(paramArrayOfByte, paramArrayOfByte.length - 8);
      l2 = a(l1 + l3, l2);
      if (l2 != 0L)
      {
        l1 = l2;
        if (l2 != 1L) {}
      }
      else
      {
        l1 = l2 - 2L;
      }
      return l1;
      if (paramArrayOfByte.length <= 64)
      {
        i = paramArrayOfByte.length;
        l1 = a(paramArrayOfByte, 24);
        l2 = a(paramArrayOfByte, 0) + (i + a(paramArrayOfByte, i - 16)) * -6505348102511208375L;
        l3 = Long.rotateRight(l2 + l1, 52);
        l4 = Long.rotateRight(l2, 37);
        l2 += a(paramArrayOfByte, 8);
        long l5 = Long.rotateRight(l2, 7);
        l2 += a(paramArrayOfByte, 16);
        l3 = Long.rotateRight(l2, 31) + l3 + (l4 + l5);
        long l7 = a(paramArrayOfByte, 16) + a(paramArrayOfByte, i - 32);
        l4 = a(paramArrayOfByte, i - 8);
        l5 = Long.rotateRight(l7 + l4, 52);
        long l6 = Long.rotateRight(l7, 37);
        long l8 = l7 + a(paramArrayOfByte, i - 24);
        l7 = Long.rotateRight(l8, 7);
        l8 = a(paramArrayOfByte, i - 16) + l8;
        l1 = (Long.rotateRight(l8, 31) + l5 + (l6 + l7) + (l1 + l2)) * -4288712594273399085L + (l8 + l4 + l3) * -6505348102511208375L;
        l1 = (l1 ^ l1 >>> 47) * -6505348102511208375L + l3;
        l1 = (l1 ^ l1 >>> 47) * -4288712594273399085L;
      }
      else
      {
        i = paramArrayOfByte.length;
        l3 = a(paramArrayOfByte, 0);
        l2 = a(paramArrayOfByte, i - 16) ^ 0x8D58AC26AFE12E47;
        l1 = a(paramArrayOfByte, i - 56);
        arrayOfLong1 = new long[2];
        arrayOfLong2 = new long[2];
        a(paramArrayOfByte, i - 64, i, l2, arrayOfLong1);
        a(paramArrayOfByte, i - 32, i * -8261664234251669945L, -6505348102511208375L, arrayOfLong2);
        l4 = arrayOfLong1[1];
        l1 = (l1 ^ 0xA5B85C5E198ED849) + (l4 ^ l4 >>> 47) * -8261664234251669945L;
        l3 = Long.rotateRight(l1 + l3, 39);
        l2 = Long.rotateRight(l2, 33) * -8261664234251669945L;
        j = 0;
        l3 = -8261664234251669945L * l3;
        i = i - 1 & 0xFFFFFFC0;
      }
    }
    for (;;)
    {
      l3 = Long.rotateRight(l3 + l2 + arrayOfLong1[0] + a(paramArrayOfByte, j + 16), 37);
      l2 = Long.rotateRight(arrayOfLong1[1] + l2 + a(paramArrayOfByte, j + 48), 42);
      l3 = l3 * -8261664234251669945L ^ arrayOfLong2[1];
      l2 = l2 * -8261664234251669945L ^ arrayOfLong1[0];
      l4 = Long.rotateRight(l1 ^ arrayOfLong2[0], 33);
      a(paramArrayOfByte, j, arrayOfLong1[1] * -8261664234251669945L, arrayOfLong2[0] + l3, arrayOfLong1);
      a(paramArrayOfByte, j + 32, l4 + arrayOfLong2[1], l2, arrayOfLong2);
      j += 64;
      i -= 64;
      if (i == 0)
      {
        l1 = a(a(arrayOfLong1[0], arrayOfLong2[0]) + (l2 >>> 47 ^ l2) * -8261664234251669945L + l3, a(arrayOfLong1[1], arrayOfLong2[1]) + l4);
        break;
        l2 = -6505348102511208375L;
        break label180;
        label855:
        l3 = -6505348102511208375L;
        break label198;
      }
      l1 = l3;
      l3 = l4;
    }
  }
  
  private static long a(byte[] paramArrayOfByte, int paramInt)
  {
    paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte, paramInt, 8);
    paramArrayOfByte.order(ByteOrder.LITTLE_ENDIAN);
    return paramArrayOfByte.getLong();
  }
  
  private static void a(byte[] paramArrayOfByte, int paramInt, long paramLong1, long paramLong2, long[] paramArrayOfLong)
  {
    long l4 = a(paramArrayOfByte, paramInt);
    long l2 = a(paramArrayOfByte, paramInt + 8);
    long l3 = a(paramArrayOfByte, paramInt + 16);
    long l1 = a(paramArrayOfByte, paramInt + 24);
    paramLong1 = l4 + paramLong1;
    paramLong2 = Long.rotateRight(paramLong2 + paramLong1 + l1, 51);
    l2 = l2 + paramLong1 + l3;
    l3 = Long.rotateRight(l2, 23);
    paramArrayOfLong[0] = (l2 + l1);
    paramArrayOfLong[1] = (paramLong1 + (l3 + paramLong2));
  }
}


/* Location:              com/google/android/gms/b/wf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */