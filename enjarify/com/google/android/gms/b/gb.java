package com.google.android.gms.b;

import java.io.IOException;

public abstract class gb
{
  protected volatile int ah = -1;
  
  public static gb a(gb paramgb, byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      ft localft = ft.a(paramArrayOfByte, paramInt);
      paramgb.a(localft);
      localft.a(0);
      return paramgb;
    }
    catch (ga localga)
    {
      throw localga;
    }
    catch (IOException localIOException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("Reading from a byte array threw an IOException (should never happen).");
      throw localRuntimeException;
    }
  }
  
  public static final byte[] a(gb paramgb)
  {
    int i = paramgb.f();
    byte[] arrayOfByte = new byte[i];
    int j = arrayOfByte.length;
    try
    {
      localObject = fu.a(arrayOfByte, j);
      paramgb.a((fu)localObject);
      ((fu)localObject).a();
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      Object localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>("Serializing to a byte array threw an IOException (should never happen).", localIOException);
      throw ((Throwable)localObject);
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
    int i = ah;
    if (i < 0) {
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
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */