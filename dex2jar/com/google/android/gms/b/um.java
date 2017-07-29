package com.google.android.gms.b;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@qi
public final class um
  implements uk.a
{
  private final String a;
  
  public um()
  {
    this(null);
  }
  
  public um(String paramString)
  {
    a = paramString;
  }
  
  public final void a(String paramString)
  {
    for (;;)
    {
      try
      {
        localObject1 = String.valueOf(paramString);
        if (((String)localObject1).length() != 0)
        {
          localObject1 = "Pinging URL: ".concat((String)localObject1);
          ul.b((String)localObject1);
          localObject1 = (HttpURLConnection)new URL(paramString).openConnection();
        }
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        Object localObject1;
        int i;
        str1 = String.valueOf(localIndexOutOfBoundsException.getMessage());
        ul.e(String.valueOf(paramString).length() + 32 + String.valueOf(str1).length() + "Error while parsing ping URL: " + paramString + ". " + str1);
        return;
      }
      catch (IOException localIOException)
      {
        String str1;
        String str2 = String.valueOf(localIOException.getMessage());
        ul.e(String.valueOf(paramString).length() + 27 + String.valueOf(str2).length() + "Error while pinging URL: " + paramString + ". " + str2);
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        String str3 = String.valueOf(localRuntimeException.getMessage());
        ul.e(String.valueOf(paramString).length() + 27 + String.valueOf(str3).length() + "Error while pinging URL: " + paramString + ". " + str3);
      }
      try
      {
        ip.a();
        uk.a((HttpURLConnection)localObject1, a);
        i = ((HttpURLConnection)localObject1).getResponseCode();
        if ((i < 200) || (i >= 300)) {
          ul.e(String.valueOf(paramString).length() + 65 + "Received non-success response code " + i + " from pinging URL: " + paramString);
        }
        ((HttpURLConnection)localObject1).disconnect();
        return;
      }
      finally
      {
        str1.disconnect();
      }
      localObject1 = new String("Pinging URL: ");
    }
  }
}


/* Location:              com/google/android/gms/b/um.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */