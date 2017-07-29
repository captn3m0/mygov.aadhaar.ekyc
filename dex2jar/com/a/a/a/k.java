package com.a.a.a;

import java.io.ByteArrayOutputStream;

public final class k
  extends ByteArrayOutputStream
{
  private final b a;
  
  public k(b paramb, int paramInt)
  {
    a = paramb;
    buf = a.a(Math.max(paramInt, 256));
  }
  
  private void a(int paramInt)
  {
    if (count + paramInt <= buf.length) {
      return;
    }
    byte[] arrayOfByte = a.a((count + paramInt) * 2);
    System.arraycopy(buf, 0, arrayOfByte, 0, count);
    a.a(buf);
    buf = arrayOfByte;
  }
  
  public final void close()
  {
    a.a(buf);
    buf = null;
    super.close();
  }
  
  public final void finalize()
  {
    a.a(buf);
  }
  
  public final void write(int paramInt)
  {
    try
    {
      a(1);
      super.write(paramInt);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      a(paramInt2);
      super.write(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
}


/* Location:              com/a/a/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */