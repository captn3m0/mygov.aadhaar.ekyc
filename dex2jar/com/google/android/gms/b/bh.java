package com.google.android.gms.b;

import android.util.Base64;

public final class bh
{
  public static String a(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 11;; i = 2) {
      return Base64.encodeToString(paramArrayOfByte, i);
    }
  }
  
  public static byte[] a(String paramString, boolean paramBoolean)
  {
    int i;
    byte[] arrayOfByte;
    if (paramBoolean)
    {
      i = 11;
      arrayOfByte = Base64.decode(paramString, i);
      if ((arrayOfByte.length != 0) || (paramString.length() <= 0)) {
        return arrayOfByte;
      }
      paramString = String.valueOf(paramString);
      if (paramString.length() == 0) {
        break label58;
      }
    }
    label58:
    for (paramString = "Unable to decode ".concat(paramString);; paramString = new String("Unable to decode "))
    {
      throw new IllegalArgumentException(paramString);
      i = 2;
      break;
    }
    return arrayOfByte;
  }
}


/* Location:              com/google/android/gms/b/bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */