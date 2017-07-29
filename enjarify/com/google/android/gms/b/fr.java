package com.google.android.gms.b;

public final class fr
{
  final byte[] a;
  int b;
  int c;
  
  public fr(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte1 = new byte[i];
    a = arrayOfByte1;
    int j = 0;
    arrayOfByte1 = null;
    int k;
    while (j < i)
    {
      arrayOfByte2 = a;
      k = (byte)j;
      arrayOfByte2[j] = k;
      j += 1;
    }
    j = 0;
    arrayOfByte1 = null;
    int m = 0;
    byte[] arrayOfByte2 = null;
    while (m < i)
    {
      k = a[m];
      j += k;
      k = paramArrayOfByte.length;
      k = m % k;
      k = paramArrayOfByte[k];
      j = j + k & 0xFF;
      byte[] arrayOfByte3 = a;
      k = arrayOfByte3[m];
      byte[] arrayOfByte4 = a;
      byte[] arrayOfByte5 = a;
      int n = arrayOfByte5[j];
      arrayOfByte4[m] = n;
      arrayOfByte4 = a;
      arrayOfByte4[j] = k;
      m += 1;
    }
    b = 0;
    c = 0;
  }
  
  public final void a(byte[] paramArrayOfByte)
  {
    int i = b;
    int j = c;
    int k = 0;
    for (;;)
    {
      int m = 256;
      if (k >= m) {
        break;
      }
      i = i + 1 & 0xFF;
      m = a[i];
      j = j + m & 0xFF;
      byte[] arrayOfByte1 = a;
      m = arrayOfByte1[i];
      byte[] arrayOfByte2 = a;
      int n = a[j];
      arrayOfByte2[i] = n;
      a[j] = m;
      m = paramArrayOfByte[k];
      arrayOfByte2 = a;
      byte[] arrayOfByte3 = a;
      n = arrayOfByte3[i];
      byte[] arrayOfByte4 = a;
      int i1 = arrayOfByte4[j];
      n = n + i1 & 0xFF;
      int i2 = arrayOfByte2[n];
      m = (byte)(m ^ i2);
      paramArrayOfByte[k] = m;
      k += 1;
    }
    b = i;
    c = j;
  }
}


/* Location:              com/google/android/gms/b/fr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */