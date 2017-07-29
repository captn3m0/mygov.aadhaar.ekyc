package com.google.android.gms.b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

@qi
public final class hn
  extends hk
{
  private MessageDigest b;
  
  public final byte[] a(String paramString)
  {
    int i = 0;
    Object localObject2 = paramString.split(" ");
    if (localObject2.length == 1)
    {
      i = hm.a(localObject2[0]);
      paramString = ByteBuffer.allocate(4);
      paramString.order(ByteOrder.LITTLE_ENDIAN);
      paramString.putInt(i);
      paramString = paramString.array();
      b = a();
    }
    for (;;)
    {
      synchronized (a)
      {
        if (b == null)
        {
          return new byte[0];
          if (localObject2.length < 5)
          {
            paramString = new byte[localObject2.length * 2];
            i = 0;
            if (i < localObject2.length)
            {
              j = hm.a(localObject2[i]);
              j = (j & 0xFFFF0000) >> 16 ^ 0xFFFF & j;
              ??? = new byte[2];
              ???[0] = ((byte)j);
              ???[1] = ((byte)(j >> 8));
              paramString[(i * 2)] = ???[0];
              paramString[(i * 2 + 1)] = ???[1];
              i += 1;
              continue;
            }
            break;
          }
          ??? = new byte[localObject2.length];
          paramString = (String)???;
          if (i >= localObject2.length) {
            break;
          }
          int j = hm.a(localObject2[i]);
          ???[i] = ((byte)((j & 0xFF000000) >> 24 ^ j & 0xFF ^ (0xFF00 & j) >> 8 ^ (0xFF0000 & j) >> 16));
          i += 1;
          continue;
        }
        b.reset();
        b.update(paramString);
        paramString = b.digest();
        if (paramString.length > 4)
        {
          i = 4;
          localObject2 = new byte[i];
          System.arraycopy(paramString, 0, localObject2, 0, localObject2.length);
          return (byte[])localObject2;
        }
      }
      i = paramString.length;
    }
  }
}


/* Location:              com/google/android/gms/b/hn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */