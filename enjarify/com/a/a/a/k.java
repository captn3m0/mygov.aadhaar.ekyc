package com.a.a.a;

import java.io.ByteArrayOutputStream;

public final class k
  extends ByteArrayOutputStream
{
  private final b a;
  
  public k(b paramb, int paramInt)
  {
    a = paramb;
    Object localObject = a;
    int i = Math.max(paramInt, 256);
    localObject = ((b)localObject).a(i);
    buf = ((byte[])localObject);
  }
  
  private void a(int paramInt)
  {
    int i = count + paramInt;
    Object localObject1 = buf;
    int j = localObject1.length;
    if (i <= j) {}
    for (;;)
    {
      return;
      Object localObject2 = a;
      j = (count + paramInt) * 2;
      localObject2 = ((b)localObject2).a(j);
      localObject1 = buf;
      int k = count;
      System.arraycopy(localObject1, 0, localObject2, 0, k);
      localObject1 = a;
      byte[] arrayOfByte = buf;
      ((b)localObject1).a(arrayOfByte);
      buf = ((byte[])localObject2);
    }
  }
  
  public final void close()
  {
    b localb = a;
    byte[] arrayOfByte = buf;
    localb.a(arrayOfByte);
    buf = null;
    super.close();
  }
  
  public final void finalize()
  {
    b localb = a;
    byte[] arrayOfByte = buf;
    localb.a(arrayOfByte);
  }
  
  public final void write(int paramInt)
  {
    int i = 1;
    try
    {
      a(i);
      super.write(paramInt);
      return;
    }
    finally {}
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      a(paramInt2);
      super.write(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    finally {}
  }
}


/* Location:              com/a/a/a/k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */