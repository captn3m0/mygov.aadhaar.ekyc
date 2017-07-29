package com.google.android.gms.b;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class hl$a
{
  ByteArrayOutputStream a;
  Base64OutputStream b;
  
  public hl$a()
  {
    Object localObject = new java/io/ByteArrayOutputStream;
    ((ByteArrayOutputStream)localObject).<init>(4096);
    a = ((ByteArrayOutputStream)localObject);
    localObject = new android/util/Base64OutputStream;
    ByteArrayOutputStream localByteArrayOutputStream = a;
    ((Base64OutputStream)localObject).<init>(localByteArrayOutputStream, 10);
    b = ((Base64OutputStream)localObject);
  }
  
  public final void a(byte[] paramArrayOfByte)
  {
    b.write(paramArrayOfByte);
  }
  
  public final String toString()
  {
    try
    {
      localObject1 = b;
      ((Base64OutputStream)localObject1).close();
    }
    catch (IOException localIOException1)
    {
      for (;;)
      {
        Object localObject1;
        label38:
        str2 = "HashManager: Unable to convert to Base64.";
        tp.b(str2, localIOException1);
      }
    }
    try
    {
      localObject1 = a;
      ((ByteArrayOutputStream)localObject1).close();
      localObject1 = a;
      localObject1 = ((ByteArrayOutputStream)localObject1).toString();
    }
    catch (IOException localIOException2)
    {
      str2 = "HashManager: Unable to convert to Base64.";
      tp.b(str2, localIOException2);
      String str1 = "";
      a = null;
      b = null;
      break label38;
    }
    finally
    {
      a = null;
      b = null;
    }
    return (String)localObject1;
  }
}


/* Location:              com/google/android/gms/b/hl$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */