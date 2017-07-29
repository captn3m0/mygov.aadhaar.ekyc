package com.google.android.gms.b;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

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
    localObject1 = "Pinging URL: ";
    for (;;)
    {
      try
      {
        localObject3 = String.valueOf(paramString);
        i = ((String)localObject3).length();
        if (i != 0)
        {
          localObject3 = ((String)localObject1).concat((String)localObject3);
          ul.b((String)localObject3);
          localObject3 = new java/net/URL;
          ((URL)localObject3).<init>(paramString);
          localObject3 = ((URL)localObject3).openConnection();
          localObject3 = (HttpURLConnection)localObject3;
        }
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        localObject3 = String.valueOf(localIndexOutOfBoundsException.getMessage());
        j = String.valueOf(paramString).length() + 32;
        i = String.valueOf(localObject3).length();
        j += i;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>(j);
        localObject1 = ((StringBuilder)localObject4).append("Error while parsing ping URL: ").append(paramString);
        localObject4 = ". ";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
        localObject3 = (String)localObject3;
        ul.e((String)localObject3);
        continue;
      }
      catch (IOException localIOException)
      {
        localObject3 = String.valueOf(localIOException.getMessage());
        j = String.valueOf(paramString).length() + 27;
        i = String.valueOf(localObject3).length();
        j += i;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>(j);
        localStringBuilder1 = ((StringBuilder)localObject4).append("Error while pinging URL: ").append(paramString);
        localObject4 = ". ";
        localStringBuilder1 = localStringBuilder1.append((String)localObject4);
        localObject3 = (String)localObject3;
        ul.e((String)localObject3);
        continue;
      }
      catch (RuntimeException localRuntimeException)
      {
        Object localObject3 = String.valueOf(localRuntimeException.getMessage());
        int j = String.valueOf(paramString).length() + 27;
        int i = String.valueOf(localObject3).length();
        j += i;
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>(j);
        StringBuilder localStringBuilder1 = ((StringBuilder)localObject4).append("Error while pinging URL: ").append(paramString);
        localObject4 = ". ";
        localStringBuilder1 = localStringBuilder1.append((String)localObject4);
        localObject3 = (String)localObject3;
        ul.e((String)localObject3);
        continue;
      }
      try
      {
        ip.a();
        localObject1 = a;
        uk.a((HttpURLConnection)localObject3, (String)localObject1);
        j = ((HttpURLConnection)localObject3).getResponseCode();
        i = 200;
        if (j >= i)
        {
          i = 300;
          if (j < i) {}
        }
        else
        {
          localObject4 = String.valueOf(paramString);
          i = ((String)localObject4).length() + 65;
          StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
          localStringBuilder2.<init>(i);
          localObject4 = "Received non-success response code ";
          localObject4 = localStringBuilder2.append((String)localObject4);
          localObject1 = ((StringBuilder)localObject4).append(j);
          localObject4 = " from pinging URL: ";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
          localObject1 = ((StringBuilder)localObject1).append(paramString);
          localObject1 = ((StringBuilder)localObject1).toString();
          ul.e((String)localObject1);
        }
        return;
      }
      finally
      {
        ((HttpURLConnection)localObject3).disconnect();
      }
      localObject3 = new java/lang/String;
      ((String)localObject3).<init>((String)localObject1);
    }
  }
}


/* Location:              com/google/android/gms/b/um.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */