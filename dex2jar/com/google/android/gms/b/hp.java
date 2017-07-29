package com.google.android.gms.b;

import java.nio.charset.Charset;
import java.security.MessageDigest;

@qi
public final class hp
  extends hk
{
  private MessageDigest b;
  private final int c;
  private final int d;
  
  public hp(int paramInt)
  {
    int j = paramInt / 8;
    int i = j;
    if (paramInt % 8 > 0) {
      i = j + 1;
    }
    c = i;
    d = paramInt;
  }
  
  public final byte[] a(String paramString)
  {
    int j = 0;
    for (;;)
    {
      int i;
      byte[] arrayOfByte;
      long l2;
      synchronized (a)
      {
        b = a();
        if (b == null) {
          return new byte[0];
        }
        b.reset();
        b.update(paramString.getBytes(Charset.forName("UTF-8")));
        paramString = b.digest();
        if (paramString.length > c)
        {
          i = c;
          arrayOfByte = new byte[i];
          System.arraycopy(paramString, 0, arrayOfByte, 0, arrayOfByte.length);
          if (d % 8 <= 0) {
            continue;
          }
          l1 = 0L;
          i = j;
          if (i < arrayOfByte.length)
          {
            l2 = l1;
            if (i <= 0) {
              break label177;
            }
            l2 = l1 << 8;
            break label177;
          }
        }
        else
        {
          i = paramString.length;
          continue;
        }
        l1 >>>= 8 - d % 8;
        i = c - 1;
        break label198;
        return arrayOfByte;
      }
      label177:
      long l1 = l2 + (arrayOfByte[i] & 0xFF);
      i += 1;
      continue;
      label198:
      while (i >= 0)
      {
        arrayOfByte[i] = ((byte)(int)(0xFF & l1));
        l1 >>>= 8;
        i -= 1;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/hp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */