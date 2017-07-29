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
    Object localObject;
    IllegalArgumentException localIllegalArgumentException;
    String str;
    if (paramBoolean)
    {
      i = 11;
      localObject = Base64.decode(paramString, i);
      int j = localObject.length;
      if (j != 0) {
        return localObject;
      }
      j = paramString.length();
      if (j <= 0) {
        return localObject;
      }
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      str = "Unable to decode ";
      localObject = String.valueOf(paramString);
      int k = ((String)localObject).length();
      if (k == 0) {
        break label79;
      }
      localObject = str.concat((String)localObject);
    }
    for (;;)
    {
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
      i = 2;
      break;
      label79:
      localObject = new java/lang/String;
      ((String)localObject).<init>(str);
    }
    return (byte[])localObject;
  }
}


/* Location:              com/google/android/gms/b/bh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */