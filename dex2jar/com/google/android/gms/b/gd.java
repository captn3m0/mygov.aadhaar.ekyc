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
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof gd)) {
        return false;
      }
      paramObject = (gd)paramObject;
    } while ((a == a) && (Arrays.equals(b, b)));
    return false;
  }
  
  public final int hashCode()
  {
    return (a + 527) * 31 + Arrays.hashCode(b);
  }
}


/* Location:              com/google/android/gms/b/gd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */