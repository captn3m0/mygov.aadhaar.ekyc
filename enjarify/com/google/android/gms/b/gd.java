package com.google.android.gms.b;

import java.util.Arrays;

final class gd
{
  final int a;
  final byte[] b;
  
  gd(int paramInt, byte[] paramArrayOfByte)
  {
    a = paramInt;
    b = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof gd;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (gd)paramObject;
        int i = a;
        int j = a;
        if (i == j)
        {
          byte[] arrayOfByte1 = b;
          byte[] arrayOfByte2 = b;
          boolean bool3 = Arrays.equals(arrayOfByte1, arrayOfByte2);
          if (bool3) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public final int hashCode()
  {
    int i = (a + 527) * 31;
    int j = Arrays.hashCode(b);
    return i + j;
  }
}


/* Location:              com/google/android/gms/b/gd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */