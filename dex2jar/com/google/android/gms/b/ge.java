package com.google.android.gms.b;

public final class ge
{
  static final int a = 11;
  static final int b = 12;
  static final int c = 16;
  static final int d = 26;
  public static final int[] e = new int[0];
  public static final long[] f = new long[0];
  public static final float[] g = new float[0];
  public static final double[] h = new double[0];
  public static final boolean[] i = new boolean[0];
  public static final String[] j = new String[0];
  public static final byte[][] k = new byte[0][];
  public static final byte[] l = new byte[0];
  
  static int a(int paramInt)
  {
    return paramInt & 0x7;
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    return paramInt1 << 3 | paramInt2;
  }
  
  public static final int a(ft paramft, int paramInt)
  {
    int m = 1;
    int n = paramft.j();
    paramft.b(paramInt);
    while (paramft.a() == paramInt)
    {
      paramft.b(paramInt);
      m += 1;
    }
    paramft.e(n);
    return m;
  }
  
  public static int b(int paramInt)
  {
    return paramInt >>> 3;
  }
}


/* Location:              com/google/android/gms/b/ge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */