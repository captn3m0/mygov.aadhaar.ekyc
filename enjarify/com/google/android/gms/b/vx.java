package com.google.android.gms.b;

import java.util.Date;
import java.util.Map;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;

public final class vx
{
  private static long a(String paramString)
  {
    try
    {
      Date localDate = DateUtils.parseDate(paramString);
      l = localDate.getTime();
    }
    catch (DateParseException localDateParseException)
    {
      for (;;)
      {
        long l = 0L;
      }
    }
    return l;
  }
  
  public static dz.a a(na paramna)
  {
    long l1 = System.currentTimeMillis();
    Object localObject1 = paramna;
    localObject1 = c;
    Object localObject2 = localObject1;
    long l2 = 0L;
    long l3 = 0L;
    double d1 = 0.0D;
    long l4 = 0L;
    long l5 = 0L;
    double d2 = 0.0D;
    long l6 = 0L;
    long l7 = 0L;
    double d3 = 0.0D;
    long l8 = 0L;
    int i = 0;
    Object localObject3 = (String)((Map)localObject1).get("Date");
    if (localObject3 != null)
    {
      long l9 = a((String)localObject3);
      l2 = l9;
    }
    localObject1 = localObject2;
    localObject3 = (String)((Map)localObject2).get("Cache-Control");
    int j;
    boolean bool1;
    dz.a locala;
    long l10;
    if (localObject3 != null)
    {
      j = 1;
      String[] arrayOfString = ((String)localObject3).split(",");
      int k = 0;
      localObject3 = null;
      bool1 = false;
      locala = null;
      l10 = l8;
      l8 = l7;
      int m = arrayOfString.length;
      if (k < m)
      {
        String str1 = arrayOfString[k].trim();
        String str2 = "no-cache";
        boolean bool3 = str1.equals(str2);
        if (!bool3)
        {
          str2 = "no-store";
          bool3 = str1.equals(str2);
          if (!bool3) {}
        }
        else
        {
          k = 0;
          localObject3 = null;
          return (dz.a)localObject3;
        }
        str2 = "max-age=";
        bool3 = str1.startsWith(str2);
        int n;
        if (bool3) {
          n = 8;
        }
        for (;;)
        {
          try
          {
            str1 = str1.substring(n);
            l8 = Long.parseLong(str1);
          }
          catch (Exception localException2)
          {
            label235:
            boolean bool4;
            int i1;
            boolean bool5;
            boolean bool2;
            continue;
            l10 = l6;
            l7 = l5;
            d3 = d2;
            continue;
            l4 = l3;
            continue;
            l11 = l4;
            continue;
          }
          k += 1;
          break;
          str2 = "stale-while-revalidate=";
          bool4 = str1.startsWith(str2);
          if (bool4) {
            i1 = 23;
          }
          try
          {
            str1 = str1.substring(i1);
            l10 = Long.parseLong(str1);
          }
          catch (Exception localException1) {}
          str2 = "must-revalidate";
          bool5 = str1.equals(str2);
          if (!bool5)
          {
            str2 = "proxy-revalidate";
            bool2 = str1.equals(str2);
            if (!bool2) {}
          }
          else
          {
            bool1 = true;
          }
        }
      }
      l7 = l8;
      l8 = l10;
    }
    for (i = j;; i = 0)
    {
      localObject1 = localObject2;
      localObject3 = (String)((Map)localObject2).get("Expires");
      long l11;
      if (localObject3 != null)
      {
        l11 = a((String)localObject3);
        localObject1 = localObject2;
        localObject3 = (String)((Map)localObject2).get("Last-Modified");
        if (localObject3 != null)
        {
          l4 = a((String)localObject3);
          localObject1 = localObject2;
          localObject3 = (String)((Map)localObject2).get("ETag");
          if (i != 0)
          {
            l10 = 1000L * l7;
            l7 = l1 + l10;
            if (bool1) {
              l10 = l7;
            }
          }
          for (;;)
          {
            locala = new com/google/android/gms/b/dz$a;
            locala.<init>();
            localObject1 = paramna;
            byte[] arrayOfByte = b;
            a = arrayOfByte;
            b = ((String)localObject3);
            f = l7;
            e = l10;
            c = l2;
            d = l4;
            localObject1 = localObject2;
            g = ((Map)localObject2);
            localObject3 = locala;
            break;
            l10 = 1000L * l8 + l7;
            continue;
            l10 = 0L;
            bool1 = l2 < l10;
            if (!bool1) {
              break label586;
            }
            bool1 = l11 < l2;
            if (bool1) {
              break label586;
            }
            l10 = l11 - l2 + l1;
            l7 = l10;
          }
          break label235;
        }
      }
      label586:
      bool1 = false;
      locala = null;
    }
  }
  
  public static String a(Map paramMap, String paramString)
  {
    int i = 1;
    String str1 = (String)paramMap.get("Content-Type");
    String[] arrayOfString;
    int j;
    if (str1 != null)
    {
      arrayOfString = str1.split(";");
      j = i;
    }
    for (;;)
    {
      int k = arrayOfString.length;
      if (j < k)
      {
        Object localObject = arrayOfString[j].trim();
        String str2 = "=";
        localObject = ((String)localObject).split(str2);
        int m = localObject.length;
        int n = 2;
        if (m == n)
        {
          str2 = localObject[0];
          String str3 = "charset";
          boolean bool = str2.equals(str3);
          if (bool) {
            paramString = localObject[i];
          }
        }
      }
      else
      {
        return paramString;
      }
      j += 1;
    }
  }
}


/* Location:              com/google/android/gms/b/vx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */