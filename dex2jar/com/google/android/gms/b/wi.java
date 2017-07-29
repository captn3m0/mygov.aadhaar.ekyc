package com.google.android.gms.b;

import android.content.ContentResolver;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.c;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class wi
  implements vz.b
{
  static Boolean a = null;
  private static final Charset c = Charset.forName("UTF-8");
  final a b;
  
  public wi()
  {
    this(new a(null));
  }
  
  public wi(Context paramContext)
  {
    this(new a(paramContext));
  }
  
  private wi(a parama)
  {
    b = ((a)c.a(parama));
  }
  
  private static long a(String paramString, long paramLong)
  {
    if ((paramString == null) || (paramString.isEmpty())) {
      return wf.a(ByteBuffer.allocate(8).putLong(paramLong).array());
    }
    paramString = paramString.getBytes(c);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramString.length + 8);
    localByteBuffer.put(paramString);
    localByteBuffer.putLong(paramLong);
    return wf.a(localByteBuffer.array());
  }
  
  private static b a(String paramString)
  {
    int i = 0;
    if (paramString == null) {
      return null;
    }
    String str = "";
    int j = paramString.indexOf(',');
    if (j >= 0)
    {
      str = paramString.substring(0, j);
      i = j + 1;
    }
    j = paramString.indexOf('/', i);
    if (j <= 0)
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {}
      for (paramString = "Failed to parse the rule: ".concat(paramString);; paramString = new String("Failed to parse the rule: "))
      {
        Log.e("LogSamplerImpl", paramString);
        return null;
      }
    }
    try
    {
      l1 = Long.parseLong(paramString.substring(i, j));
      l2 = Long.parseLong(paramString.substring(j + 1));
      if ((l1 < 0L) || (l2 < 0L))
      {
        Log.e("LogSamplerImpl", 72 + "negative values not supported: " + l1 + "/" + l2);
        return null;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      long l1;
      long l2;
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {}
      for (paramString = "parseLong() failed while parsing: ".concat(paramString);; paramString = new String("parseLong() failed while parsing: "))
      {
        Log.e("LogSamplerImpl", paramString, localNumberFormatException);
        return null;
      }
      return new b(localNumberFormatException, l1, l2);
    }
  }
  
  public final boolean a(String paramString, int paramInt)
  {
    if ((paramString != null) && (!paramString.isEmpty())) {}
    for (;;)
    {
      if (paramString == null)
      {
        return true;
        if (paramInt >= 0) {
          paramString = String.valueOf(paramInt);
        }
      }
      else
      {
        Object localObject = b;
        if (a == null) {}
        for (long l1 = 0L;; l1 = fd.b(a, "android_id"))
        {
          localObject = b;
          if (a != null) {
            break;
          }
          paramString = null;
          paramString = a(paramString);
          if (paramString != null) {
            break label142;
          }
          return true;
        }
        localObject = a;
        String str = String.valueOf("gms:playlog:service:sampling_");
        paramString = String.valueOf(paramString);
        if (paramString.length() != 0) {}
        for (paramString = str.concat(paramString);; paramString = new String(str))
        {
          paramString = fd.a((ContentResolver)localObject, paramString);
          break;
        }
        label142:
        l1 = a(a, l1);
        long l2 = b;
        long l3 = c;
        if ((l2 < 0L) || (l3 < 0L)) {
          throw new IllegalArgumentException(72 + "negative values not supported: " + l2 + "/" + l3);
        }
        if (l3 > 0L)
        {
          if (l1 >= 0L) {}
          for (l1 %= l3; l1 < l2; l1 = ((l1 & 0x7FFFFFFFFFFFFFFF) % l3 + (Long.MAX_VALUE % l3 + 1L)) % l3) {
            return true;
          }
        }
        return false;
      }
      paramString = null;
    }
  }
  
  static final class a
  {
    final ContentResolver a;
    
    a(Context paramContext)
    {
      if (paramContext != null) {
        if (wi.a == null) {
          if (bc.a(paramContext).a("com.google.android.providers.gsf.permission.READ_GSERVICES") != 0) {
            break label50;
          }
        }
      }
      label50:
      for (boolean bool = true;; bool = false)
      {
        wi.a = Boolean.valueOf(bool);
        if (wi.a.booleanValue()) {
          break;
        }
        a = null;
        return;
      }
      a = paramContext.getContentResolver();
      fd.a(a, new String[] { "gms:playlog:service:sampling_" });
    }
  }
  
  static final class b
  {
    public final String a;
    public final long b;
    public final long c;
    
    public b(String paramString, long paramLong1, long paramLong2)
    {
      a = paramString;
      b = paramLong1;
      c = paramLong2;
    }
  }
}


/* Location:              com/google/android/gms/b/wi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */