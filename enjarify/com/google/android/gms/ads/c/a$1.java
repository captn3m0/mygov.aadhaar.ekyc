package com.google.android.gms.ads.c;

import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

final class a$1
  extends Thread
{
  a$1(String paramString) {}
  
  public final void run()
  {
    Object localObject1 = new com/google/android/gms/ads/c/b;
    ((b)localObject1).<init>();
    localObject2 = a;
    for (;;)
    {
      try
      {
        localObject1 = new java/net/URL;
        ((URL)localObject1).<init>((String)localObject2);
        localObject1 = ((URL)localObject1).openConnection();
        localObject1 = (HttpURLConnection)localObject1;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        int i;
        int j;
        str2 = "HttpUrlPinger";
        str1 = String.valueOf(localIndexOutOfBoundsException.getMessage());
        k = String.valueOf(localObject2).length() + 32;
        m = String.valueOf(str1).length();
        k += m;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(k);
        localObject2 = localStringBuilder.append("Error while parsing ping URL: ").append((String)localObject2);
        localObject3 = ". ";
        localObject2 = (String)localObject3 + str1;
        Log.w(str2, (String)localObject2, localIndexOutOfBoundsException);
        continue;
      }
      catch (RuntimeException localRuntimeException)
      {
        String str2 = "HttpUrlPinger";
        String str1 = String.valueOf(localRuntimeException.getMessage());
        int k = String.valueOf(localObject2).length() + 27;
        int m = String.valueOf(str1).length();
        k += m;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(k);
        localObject2 = localStringBuilder.append("Error while pinging URL: ").append((String)localObject2);
        Object localObject3 = ". ";
        localObject2 = (String)localObject3 + str1;
        Log.w(str2, (String)localObject2, localRuntimeException);
        continue;
      }
      catch (IOException localIOException)
      {
        continue;
      }
      try
      {
        i = ((HttpURLConnection)localObject1).getResponseCode();
        j = 200;
        if (i >= j)
        {
          j = 300;
          if (i < j) {}
        }
        else
        {
          str1 = "HttpUrlPinger";
          localObject3 = String.valueOf(localObject2);
          k = ((String)localObject3).length() + 65;
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>(k);
          localObject3 = "Received non-success response code ";
          localObject3 = localStringBuilder.append((String)localObject3);
          Object localObject4 = ((StringBuilder)localObject3).append(i);
          localObject3 = " from pinging URL: ";
          localObject4 = ((StringBuilder)localObject4).append((String)localObject3);
          localObject4 = ((StringBuilder)localObject4).append((String)localObject2);
          localObject4 = ((StringBuilder)localObject4).toString();
          Log.w(str1, (String)localObject4);
        }
        return;
      }
      finally
      {
        ((HttpURLConnection)localObject1).disconnect();
      }
    }
  }
}


/* Location:              com/google/android/gms/ads/c/a$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */