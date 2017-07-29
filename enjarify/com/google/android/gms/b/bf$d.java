package com.google.android.gms.b;

public final class bf$d
  extends fv
{
  public byte[] a = null;
  public byte[] b = null;
  public byte[] c = null;
  public byte[] d = null;
  
  public bf$d()
  {
    ah = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    byte[] arrayOfByte1 = a;
    byte[] arrayOfByte2;
    int j;
    if (arrayOfByte1 != null)
    {
      arrayOfByte2 = a;
      j = fu.b(1, arrayOfByte2);
      i += j;
    }
    arrayOfByte1 = b;
    if (arrayOfByte1 != null)
    {
      arrayOfByte2 = b;
      j = fu.b(2, arrayOfByte2);
      i += j;
    }
    arrayOfByte1 = c;
    if (arrayOfByte1 != null)
    {
      arrayOfByte2 = c;
      j = fu.b(3, arrayOfByte2);
      i += j;
    }
    arrayOfByte1 = d;
    if (arrayOfByte1 != null)
    {
      arrayOfByte2 = d;
      j = fu.b(4, arrayOfByte2);
      i += j;
    }
    return i;
  }
  
  public final void a(fu paramfu)
  {
    byte[] arrayOfByte1 = a;
    int i;
    byte[] arrayOfByte2;
    if (arrayOfByte1 != null)
    {
      i = 1;
      arrayOfByte2 = a;
      paramfu.a(i, arrayOfByte2);
    }
    arrayOfByte1 = b;
    if (arrayOfByte1 != null)
    {
      i = 2;
      arrayOfByte2 = b;
      paramfu.a(i, arrayOfByte2);
    }
    arrayOfByte1 = c;
    if (arrayOfByte1 != null)
    {
      i = 3;
      arrayOfByte2 = c;
      paramfu.a(i, arrayOfByte2);
    }
    arrayOfByte1 = d;
    if (arrayOfByte1 != null)
    {
      i = 4;
      arrayOfByte2 = d;
      paramfu.a(i, arrayOfByte2);
    }
    super.a(paramfu);
  }
}


/* Location:              com/google/android/gms/b/bf$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */