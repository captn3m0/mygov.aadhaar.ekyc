package com.google.android.gms.b;

import java.io.ByteArrayOutputStream;

public final class aa
  extends ByteArrayOutputStream
{
  private final vu a;
  
  public aa(vu paramvu, int paramInt)
  {
    a = paramvu;
    Object localObject = a;
    int i = Math.max(paramInt, 256);
    localObject = ((vu)localObject).a(i);
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
      localObject2 = ((vu)localObject2).a(j);
      localObject1 = buf;
      int k = count;
      System.arraycopy(localObject1, 0, localObject2, 0, k);
      localObject1 = a;
      byte[] arrayOfByte = buf;
      ((vu)localObject1).a(arrayOfByte);
      buf = ((byte[])localObject2);
    }
  }
  
  public final void close()
  {
    vu localvu = a;
    byte[] arrayOfByte = buf;
    localvu.a(arrayOfByte);
    buf = null;
    super.close();
  }
  
  public final void finalize()
  {
    vu localvu = a;
    byte[] arrayOfByte = buf;
    localvu.a(arrayOfByte);
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


/* Location:              com/google/android/gms/b/aa.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */