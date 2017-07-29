package com.google.android.gms.b;

import java.nio.charset.Charset;
import java.security.MessageDigest;

public final class hp
  extends hk
{
  private MessageDigest b;
  private final int c;
  private final int d;
  
  public hp(int paramInt)
  {
    int i = paramInt / 8;
    int j = paramInt % 8;
    if (j > 0) {
      i += 1;
    }
    c = i;
    d = paramInt;
  }
  
  public final byte[] a(String paramString)
  {
    int i = 8;
    int j = 0;
    label306:
    synchronized (a)
    {
      Object localObject2 = a();
      b = ((MessageDigest)localObject2);
      localObject2 = b;
      if (localObject2 == null)
      {
        k = 0;
        localObject2 = null;
        localObject2 = new byte[0];
        return (byte[])localObject2;
      }
      localObject2 = b;
      ((MessageDigest)localObject2).reset();
      localObject2 = b;
      Object localObject4 = "UTF-8";
      localObject4 = Charset.forName((String)localObject4);
      localObject4 = paramString.getBytes((Charset)localObject4);
      ((MessageDigest)localObject2).update((byte[])localObject4);
      localObject2 = b;
      localObject4 = ((MessageDigest)localObject2).digest();
      int k = localObject4.length;
      int m = c;
      if (k > m) {}
      int n;
      long l1;
      long l2;
      for (k = c;; k = localObject4.length)
      {
        localObject2 = new byte[k];
        m = 0;
        n = 0;
        int i1 = localObject2.length;
        System.arraycopy(localObject4, 0, localObject2, 0, i1);
        int i2 = d;
        i2 %= 8;
        if (i2 <= 0) {
          break label306;
        }
        l1 = 0L;
        for (;;)
        {
          n = localObject2.length;
          if (j >= n) {
            break;
          }
          if (j > 0) {
            l1 <<= i;
          }
          n = localObject2[j] & 0xFF;
          l2 = n;
          l1 += l2;
          j += 1;
        }
      }
      j = d;
      j %= 8;
      j = 8 - j;
      l1 >>>= j;
      j = c + -1;
      while (j >= 0)
      {
        l2 = 0xFF & l1;
        n = (byte)(int)l2;
        localObject2[j] = n;
        l1 >>>= i;
        j += -1;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/hp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */