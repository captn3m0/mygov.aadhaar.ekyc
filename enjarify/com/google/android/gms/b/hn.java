package com.google.android.gms.b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

public final class hn
  extends hk
{
  private MessageDigest b;
  
  public final byte[] a(String paramString)
  {
    int i = 4;
    int j = 1;
    int k = 0;
    ??? = null;
    Object localObject2 = " ";
    String[] arrayOfString = paramString.split((String)localObject2);
    int m = arrayOfString.length;
    Object localObject4;
    if (m == j)
    {
      m = hm.a(arrayOfString[0]);
      ??? = ByteBuffer.allocate(i);
      localObject4 = ByteOrder.LITTLE_ENDIAN;
      ((ByteBuffer)???).order((ByteOrder)localObject4);
      ((ByteBuffer)???).putInt(m);
      localObject2 = ((ByteBuffer)???).array();
      ??? = a();
      b = ((MessageDigest)???);
    }
    for (;;)
    {
      synchronized (a)
      {
        localObject4 = b;
        int i1;
        if (localObject4 == null)
        {
          m = 0;
          localObject2 = null;
          localObject2 = new byte[0];
          return (byte[])localObject2;
          m = arrayOfString.length;
          int n = 5;
          if (m < n)
          {
            localObject4 = new byte[arrayOfString.length * 2];
            m = 0;
            localObject2 = null;
            i1 = arrayOfString.length;
            if (m < i1)
            {
              String str = arrayOfString[m];
              i1 = hm.a(str);
              i2 = (char)-1 & i1;
              i1 = (i1 & 0xFFFF0000) >> 16 ^ i2;
              byte[] arrayOfByte = new byte[2];
              int i3 = (byte)i1;
              arrayOfByte[0] = i3;
              i1 = (byte)(i1 >> 8);
              arrayOfByte[j] = i1;
              i1 = m * 2;
              i3 = arrayOfByte[0];
              localObject4[i1] = i3;
              i1 = m * 2 + 1;
              i2 = arrayOfByte[j];
              localObject4[i1] = i2;
              m += 1;
              continue;
            }
            localObject2 = localObject4;
            break;
          }
          m = arrayOfString.length;
          localObject2 = new byte[m];
          n = arrayOfString.length;
          if (k >= n) {
            break;
          }
          localObject4 = arrayOfString[k];
          n = hm.a((String)localObject4);
          i1 = n & 0xFF;
          int i2 = (0xFF00 & n) >> 8;
          i1 ^= i2;
          i2 = (0xFF0000 & n) >> 16;
          i1 ^= i2;
          i2 = -16777216;
          n = (byte)((n & i2) >> 24 ^ i1);
          localObject2[k] = n;
          k += 1;
          continue;
        }
        localObject4 = b;
        ((MessageDigest)localObject4).reset();
        localObject4 = b;
        ((MessageDigest)localObject4).update((byte[])localObject2);
        localObject2 = b;
        localObject4 = ((MessageDigest)localObject2).digest();
        m = localObject4.length;
        if (m > i)
        {
          m = i;
          localObject2 = new byte[m];
          i = 0;
          arrayOfString = null;
          i1 = localObject2.length;
          System.arraycopy(localObject4, 0, localObject2, 0, i1);
        }
      }
      m = localObject4.length;
    }
  }
}


/* Location:              com/google/android/gms/b/hn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */