package com.google.android.gms.b;

import android.os.Looper;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.UUID;

public final class ew
{
  private static final char[] a = "0123456789abcdef".toCharArray();
  
  public static Long a()
  {
    return Long.valueOf(Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles")).getTime().getTime());
  }
  
  public static String a(String paramString)
  {
    if (paramString != null)
    {
      Object localObject = "^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$";
      boolean bool = paramString.matches((String)localObject);
      if (bool)
      {
        localObject = UUID.fromString(paramString);
        int i = 16;
        byte[] arrayOfByte = new byte[i];
        ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
        long l = ((UUID)localObject).getMostSignificantBits();
        localByteBuffer.putLong(l);
        l = ((UUID)localObject).getLeastSignificantBits();
        localByteBuffer.putLong(l);
        bool = true;
        paramString = bh.a(arrayOfByte, bool);
      }
    }
    return paramString;
  }
  
  public static String a(Throwable paramThrowable)
  {
    StringWriter localStringWriter = new java/io/StringWriter;
    localStringWriter.<init>();
    PrintWriter localPrintWriter = new java/io/PrintWriter;
    localPrintWriter.<init>(localStringWriter);
    paramThrowable.printStackTrace(localPrintWriter);
    return localStringWriter.toString();
  }
  
  public static boolean b()
  {
    Looper localLooper1 = Looper.myLooper();
    Looper localLooper2 = Looper.getMainLooper();
    boolean bool;
    if (localLooper1 == localLooper2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localLooper1 = null;
    }
  }
  
  public static boolean b(String paramString)
  {
    if (paramString != null)
    {
      bool = paramString.isEmpty();
      if (!bool) {
        break label17;
      }
    }
    label17:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              com/google/android/gms/b/ew.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */