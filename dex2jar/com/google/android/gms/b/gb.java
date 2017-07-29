package com.google.android.gms.b;

import java.io.IOException;

public abstract class gb
{
  protected volatile int ah = -1;
  
  public static <T extends gb> T a(T paramT, byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      paramArrayOfByte = ft.a(paramArrayOfByte, paramInt);
      paramT.a(paramArrayOfByte);
      paramArrayOfByte.a(0);
      return paramT;
    }
    catch (ga paramT)
    {
      throw paramT;
    }
    catch (IOException paramT)
    {
      throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
    }
  }
  
  public static final byte[] a(gb paramgb)
  {
    byte[] arrayOfByte = new byte[paramgb.f()];
    int i = arrayOfByte.length;
    try
    {
      fu localfu = fu.a(arrayOfByte, i);
      paramgb.a(localfu);
      localfu.a();
      return arrayOfByte;
    }
    catch (IOException paramgb)
    {
      throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", paramgb);
    }
  }
  
  protected int a()
  {
    return 0;
  }
  
  public abstract gb a(ft paramft);
  
  public void a(fu paramfu) {}
  
  public gb d()
  {
    return (gb)super.clone();
  }
  
  public final int e()
  {
    if (ah < 0) {
      f();
    }
    return ah;
  }
  
  public final int f()
  {
    int i = a();
    ah = i;
    return i;
  }
  
  public String toString()
  {
    return gc.a(this);
  }
}


/* Location:              com/google/android/gms/b/gb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */