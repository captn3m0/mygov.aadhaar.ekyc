package com.google.android.gms.common.util;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class h
{
  public static long a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    int i = 1024;
    byte[] arrayOfByte = new byte[i];
    long l1 = 0L;
    for (;;)
    {
      int j = 0;
      int k = 1024;
      try
      {
        j = paramInputStream.read(arrayOfByte, 0, k);
        k = -1;
        if (j != k)
        {
          long l2 = j;
          l1 += l2;
          k = 0;
          paramOutputStream.write(arrayOfByte, 0, j);
        }
      }
      finally
      {
        a(paramInputStream);
        a(paramOutputStream);
      }
    }
    a(paramInputStream);
    a(paramOutputStream);
    return l1;
  }
  
  public static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
}


/* Location:              com/google/android/gms/common/util/h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */