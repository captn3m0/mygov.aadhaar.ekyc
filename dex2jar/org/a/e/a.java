package org.a.e;

public final class a
{
  private static final char[] a;
  private static final byte[] b;
  private static final char[] c;
  
  static
  {
    int k = 0;
    a = new char[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
    b = new byte[''];
    c = new char[] { 9, 10, 13, 32, 12 };
    int i = 0;
    while (i < b.length)
    {
      b[i] = -1;
      i += 1;
    }
    i = 0;
    int j;
    for (;;)
    {
      j = k;
      if (i >= c.length) {
        break;
      }
      b[c[i]] = -2;
      i += 1;
    }
    while (j < a.length)
    {
      b[a[j]] = ((byte)j);
      j += 1;
    }
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    int k = 0;
    int m = paramArrayOfByte.length / 3;
    int n = paramArrayOfByte.length % 3;
    int i = m * 4;
    switch (n)
    {
    }
    char[] arrayOfChar;
    int j;
    for (;;)
    {
      arrayOfChar = new char[i];
      j = 0;
      i = 0;
      while (j < m)
      {
        int i3 = k + 1;
        int i1 = paramArrayOfByte[k];
        int i2 = i3 + 1;
        i3 = paramArrayOfByte[i3];
        k = i2 + 1;
        i1 = (i3 & 0xFF) << 8 | (i1 & 0xFF) << 16 | paramArrayOfByte[i2] & 0xFF;
        i2 = i + 1;
        arrayOfChar[i] = a[(i1 >> 18 & 0x3F)];
        i = i2 + 1;
        arrayOfChar[i2] = a[(i1 >> 12 & 0x3F)];
        i2 = i + 1;
        arrayOfChar[i] = a[(i1 >> 6 & 0x3F)];
        i = i2 + 1;
        arrayOfChar[i2] = a[(i1 & 0x3F)];
        j += 1;
      }
      i += 2;
      continue;
      i += 3;
    }
    if (n > 0)
    {
      m = (paramArrayOfByte[k] & 0xFF) << 16;
      j = m;
      if (n == 2) {
        j = m | (paramArrayOfByte[(k + 1)] & 0xFF) << 8;
      }
      k = i + 1;
      arrayOfChar[i] = a[(j >> 18 & 0x3F)];
      arrayOfChar[k] = a[(j >> 12 & 0x3F)];
      if (n == 2) {
        arrayOfChar[(k + 1)] = a[(j >> 6 & 0x3F)];
      }
    }
    return new String(arrayOfChar);
  }
  
  private static boolean a(int paramInt)
  {
    return b[paramInt] == -2;
  }
  
  public static byte[] a(String paramString)
  {
    paramString = paramString.toCharArray();
    int j = paramString.length;
    int i = j;
    if (paramString[(j - 1)] == '=') {
      i = j - 1;
    }
    j = i;
    if (paramString[(i - 1)] == '=') {
      j = i - 1;
    }
    int m = paramString.length;
    i = 0;
    int k;
    for (int n = 0; i < m; n = k)
    {
      k = n;
      if (a(paramString[i])) {
        k = n + 1;
      }
      i += 1;
    }
    int i4 = j - n;
    i = i4 / 4 * 3;
    byte[] arrayOfByte;
    int i1;
    int i2;
    switch (i4 % 4)
    {
    default: 
      arrayOfByte = new byte[i];
      i1 = 0;
      i2 = 0;
      j = 0;
      k = 0;
    }
    for (;;)
    {
      if (i1 >= i4 + n) {
        break label338;
      }
      m = j;
      i = k;
      if (!a(paramString[i1]))
      {
        i = paramString[i1];
        if ((i < 0) || (i > 127) || (b[i] == -1))
        {
          throw new org.a.b.a(org.a.c.a.a("Base64Coder.IllegalCharacter", new Object[] { Integer.valueOf(i) }));
          throw new org.a.b.a(org.a.c.a.a("Base64Coder.IllegalLength", new Object[] { Integer.valueOf(i4) }));
          i += 1;
          break;
          i += 2;
          break;
        }
        i = k << 6 | b[i];
        m = j + 1;
      }
      int i3 = i2;
      j = m;
      k = i;
      if (m == 4)
      {
        j = i2 + 1;
        arrayOfByte[i2] = ((byte)(i >> 16));
        k = j + 1;
        arrayOfByte[j] = ((byte)(i >> 8));
        i3 = k + 1;
        arrayOfByte[k] = ((byte)i);
        j = 0;
        k = 0;
      }
      i1 += 1;
      i2 = i3;
    }
    switch (j)
    {
    default: 
      return arrayOfByte;
    case 2: 
      label338:
      arrayOfByte[i2] = ((byte)(k >> 4));
      return arrayOfByte;
    }
    arrayOfByte[i2] = ((byte)(k >> 10));
    arrayOfByte[(i2 + 1)] = ((byte)(k >> 2));
    return arrayOfByte;
  }
}


/* Location:              org/a/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */