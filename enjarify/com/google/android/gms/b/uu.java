package com.google.android.gms.b;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public final class uu
{
  public static HttpURLConnection a(String paramString, int paramInt)
  {
    IOException localIOException = null;
    Object localObject1 = new java/net/URL;
    ((URL)localObject1).<init>(paramString);
    Object localObject2 = localObject1;
    int i = 0;
    localObject1 = null;
    int j = i + 1;
    i = 20;
    if (j <= i)
    {
      localObject1 = ((URL)localObject2).openConnection();
      ((URLConnection)localObject1).setConnectTimeout(paramInt);
      ((URLConnection)localObject1).setReadTimeout(paramInt);
      boolean bool1 = localObject1 instanceof HttpURLConnection;
      if (!bool1)
      {
        localObject1 = new java/io/IOException;
        ((IOException)localObject1).<init>("Invalid protocol.");
        throw ((Throwable)localObject1);
      }
      localObject1 = (HttpURLConnection)localObject1;
      ((HttpURLConnection)localObject1).setInstanceFollowRedirects(false);
      int k = ((HttpURLConnection)localObject1).getResponseCode() / 100;
      int m = 3;
      if (k == m)
      {
        Object localObject3 = "Location";
        String str1 = ((HttpURLConnection)localObject1).getHeaderField((String)localObject3);
        if (str1 == null)
        {
          localObject1 = new java/io/IOException;
          ((IOException)localObject1).<init>("Missing Location header in redirect");
          throw ((Throwable)localObject1);
        }
        localObject3 = new java/net/URL;
        ((URL)localObject3).<init>((URL)localObject2, str1);
        localObject2 = ((URL)localObject3).getProtocol();
        if (localObject2 == null)
        {
          localObject1 = new java/io/IOException;
          ((IOException)localObject1).<init>("Protocol is null");
          throw ((Throwable)localObject1);
        }
        String str2 = "http";
        boolean bool2 = ((String)localObject2).equals(str2);
        if (!bool2)
        {
          str2 = "https";
          bool2 = ((String)localObject2).equals(str2);
          if (!bool2)
          {
            localIOException = new java/io/IOException;
            String str3 = "Unsupported scheme: ";
            localObject1 = String.valueOf(localObject2);
            int n = ((String)localObject1).length();
            if (n != 0) {
              localObject1 = str3.concat((String)localObject1);
            }
            for (;;)
            {
              localIOException.<init>((String)localObject1);
              throw localIOException;
              localObject1 = new java/lang/String;
              ((String)localObject1).<init>(str3);
            }
          }
        }
        str2 = "Redirecting to ";
        localObject2 = String.valueOf(str1);
        m = ((String)localObject2).length();
        if (m != 0) {
          localObject2 = str2.concat((String)localObject2);
        }
        for (;;)
        {
          tp.b((String)localObject2);
          ((HttpURLConnection)localObject1).disconnect();
          i = j;
          localObject2 = localObject3;
          break;
          localObject2 = new java/lang/String;
          ((String)localObject2).<init>(str2);
        }
      }
    }
    else
    {
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>("Too many redirects (20)");
      throw ((Throwable)localObject1);
    }
    return (HttpURLConnection)localObject1;
  }
}


/* Location:              com/google/android/gms/b/uu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */