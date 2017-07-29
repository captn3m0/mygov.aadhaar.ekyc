package com.google.android.gms.b;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

@qi
public final class uu
{
  public static HttpURLConnection a(String paramString, int paramInt)
  {
    paramString = new URL(paramString);
    int i = 0;
    i += 1;
    HttpURLConnection localHttpURLConnection;
    if (i <= 20)
    {
      Object localObject = paramString.openConnection();
      ((URLConnection)localObject).setConnectTimeout(paramInt);
      ((URLConnection)localObject).setReadTimeout(paramInt);
      if (!(localObject instanceof HttpURLConnection)) {
        throw new IOException("Invalid protocol.");
      }
      localHttpURLConnection = (HttpURLConnection)localObject;
      localHttpURLConnection.setInstanceFollowRedirects(false);
      if (localHttpURLConnection.getResponseCode() / 100 == 3)
      {
        String str = localHttpURLConnection.getHeaderField("Location");
        if (str == null) {
          throw new IOException("Missing Location header in redirect");
        }
        localObject = new URL(paramString, str);
        paramString = ((URL)localObject).getProtocol();
        if (paramString == null) {
          throw new IOException("Protocol is null");
        }
        if ((!paramString.equals("http")) && (!paramString.equals("https")))
        {
          paramString = String.valueOf(paramString);
          if (paramString.length() != 0) {}
          for (paramString = "Unsupported scheme: ".concat(paramString);; paramString = new String("Unsupported scheme: ")) {
            throw new IOException(paramString);
          }
        }
        paramString = String.valueOf(str);
        if (paramString.length() != 0) {}
        for (paramString = "Redirecting to ".concat(paramString);; paramString = new String("Redirecting to "))
        {
          tp.b(paramString);
          localHttpURLConnection.disconnect();
          paramString = (String)localObject;
          break;
        }
      }
    }
    else
    {
      throw new IOException("Too many redirects (20)");
    }
    return localHttpURLConnection;
  }
}


/* Location:              com/google/android/gms/b/uu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */