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
  final wi.a b;
  
  public wi()
  {
    this(locala);
  }
  
  public wi(Context paramContext)
  {
    this(locala);
  }
  
  private wi(wi.a parama)
  {
    wi.a locala = (wi.a)c.a(parama);
    b = locala;
  }
  
  private static long a(String paramString, long paramLong)
  {
    Object localObject;
    if (paramString != null)
    {
      boolean bool = paramString.isEmpty();
      if (!bool) {}
    }
    else
    {
      int i = 8;
      localObject = ByteBuffer.allocate(i).putLong(paramLong).array();
    }
    for (long l = wf.a((byte[])localObject);; l = wf.a((byte[])localObject))
    {
      return l;
      localObject = c;
      localObject = paramString.getBytes((Charset)localObject);
      int j = localObject.length + 8;
      ByteBuffer localByteBuffer = ByteBuffer.allocate(j);
      localByteBuffer.put((byte[])localObject);
      localByteBuffer.putLong(paramLong);
      localObject = localByteBuffer.array();
    }
  }
  
  private static wi.b a(String paramString)
  {
    long l1 = 0L;
    int i = 0;
    Object localObject1 = null;
    if (paramString == null)
    {
      i = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return (wi.b)localObject1;
      Object localObject2 = "";
      int j = paramString.indexOf(',');
      if (j >= 0)
      {
        localObject2 = paramString.substring(0, j);
        i = j + 1;
      }
      j = 47;
      int k = paramString.indexOf(j, i);
      String str1;
      if (k <= 0)
      {
        localObject2 = "LogSamplerImpl";
        str1 = "Failed to parse the rule: ";
        localObject1 = String.valueOf(paramString);
        int m = ((String)localObject1).length();
        if (m != 0) {
          localObject1 = str1.concat((String)localObject1);
        }
        for (;;)
        {
          Log.e((String)localObject2, (String)localObject1);
          i = 0;
          localObject1 = null;
          break;
          localObject1 = new java/lang/String;
          ((String)localObject1).<init>(str1);
        }
      }
      try
      {
        localObject1 = paramString.substring(i, k);
        l2 = Long.parseLong((String)localObject1);
        i = k + 1;
        localObject1 = paramString.substring(i);
        l3 = Long.parseLong((String)localObject1);
        bool = l2 < l1;
        if (!bool)
        {
          bool = l3 < l1;
          if (!bool) {}
        }
        else
        {
          int n = 72;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>(n);
          localObject2 = localStringBuilder.append("negative values not supported: ").append(l2);
          str1 = "/";
          localObject2 = str1 + l3;
          Log.e("LogSamplerImpl", (String)localObject2);
          bool = false;
          localObject1 = null;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        long l2;
        long l3;
        boolean bool;
        str1 = "LogSamplerImpl";
        String str2 = "parseLong() failed while parsing: ";
        localObject1 = String.valueOf(paramString);
        k = ((String)localObject1).length();
        if (k != 0) {
          localObject1 = str2.concat((String)localObject1);
        }
        for (;;)
        {
          Log.e(str1, (String)localObject1, localNumberFormatException);
          bool = false;
          localObject1 = null;
          break;
          localObject1 = new java/lang/String;
          ((String)localObject1).<init>(str2);
        }
        localObject1 = new com/google/android/gms/b/wi$b;
        ((wi.b)localObject1).<init>(localNumberFormatException, l2, l3);
      }
    }
  }
  
  public final boolean a(String paramString, int paramInt)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    if (paramString != null)
    {
      boolean bool2 = paramString.isEmpty();
      if (bool2) {}
    }
    for (;;)
    {
      if (paramString == null) {
        bool1 = true;
      }
      for (;;)
      {
        return bool1;
        if (paramInt < 0) {
          break label398;
        }
        paramString = String.valueOf(paramInt);
        break;
        localObject1 = b;
        Object localObject2 = a;
        if (localObject2 == null) {}
        for (long l1 = 0L;; l1 = fd.b((ContentResolver)localObject1, (String)localObject2))
        {
          localObject3 = b;
          localObject4 = a;
          if (localObject4 != null) {
            break label122;
          }
          localObject3 = null;
          localObject3 = a((String)localObject3);
          if (localObject3 != null) {
            break label190;
          }
          bool1 = true;
          break;
          localObject1 = a;
          localObject2 = "android_id";
        }
        label122:
        Object localObject4 = a;
        String str = String.valueOf("gms:playlog:service:sampling_");
        Object localObject3 = String.valueOf(paramString);
        int i = ((String)localObject3).length();
        if (i != 0) {
          localObject3 = str.concat((String)localObject3);
        }
        for (;;)
        {
          localObject3 = fd.a((ContentResolver)localObject4, (String)localObject3);
          break;
          localObject3 = new java/lang/String;
          ((String)localObject3).<init>(str);
        }
        label190:
        localObject4 = a;
        l1 = a((String)localObject4, l1);
        long l2 = b;
        long l3 = c;
        long l4 = 0L;
        boolean bool3 = l2 < l4;
        if (!bool3)
        {
          l4 = 0L;
          bool3 = l3 < l4;
          if (!bool3) {}
        }
        else
        {
          localObject1 = new java/lang/IllegalArgumentException;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>(72);
          localObject2 = "negative values not supported: " + l2 + "/" + l3;
          ((IllegalArgumentException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
        l4 = 0L;
        bool3 = l3 < l4;
        if (bool3)
        {
          l4 = 0L;
          bool3 = l1 < l4;
          if (!bool3) {}
          long l5;
          for (l1 %= l3;; l1 = ((l1 & l5) % l3 + l4) % l3)
          {
            bool1 = l1 < l2;
            if (!bool1) {
              break label390;
            }
            bool1 = true;
            break;
            l4 = Long.MAX_VALUE % l3 + 1L;
            l5 = Long.MAX_VALUE;
          }
        }
        label390:
        bool1 = false;
        localObject1 = null;
      }
      label398:
      paramString = null;
    }
  }
}


/* Location:              com/google/android/gms/b/wi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */