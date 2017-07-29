package com.google.android.gms.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.c;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public final class cv
  extends df
{
  public cv(dc paramdc)
  {
    super(paramdc);
  }
  
  static byte[] a(HttpURLConnection paramHttpURLConnection)
  {
    InputStream localInputStream = null;
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      localInputStream = paramHttpURLConnection.getInputStream();
      int i = 1024;
      byte[] arrayOfByte2 = new byte[i];
      for (;;)
      {
        int j = localInputStream.read(arrayOfByte2);
        if (j <= 0) {
          break;
        }
        localByteArrayOutputStream.write(arrayOfByte2, 0, j);
      }
      arrayOfByte1 = ((ByteArrayOutputStream)localObject).toByteArray();
    }
    finally
    {
      if (localInputStream != null) {
        localInputStream.close();
      }
    }
    byte[] arrayOfByte1;
    if (localInputStream != null) {
      localInputStream.close();
    }
    return arrayOfByte1;
  }
  
  protected final void a() {}
  
  public final void a(String paramString, URL paramURL, Map paramMap, cv.a parama)
  {
    super.e();
    J();
    c.a(paramURL);
    c.a(parama);
    db localdb = super.t();
    cv.c localc = new com/google/android/gms/b/cv$c;
    localc.<init>(this, paramString, paramURL, null, paramMap, parama);
    localdb.b(localc);
  }
  
  public final void a(String paramString, URL paramURL, byte[] paramArrayOfByte, cv.a parama)
  {
    super.e();
    J();
    c.a(paramURL);
    c.a(paramArrayOfByte);
    c.a(parama);
    db localdb = super.t();
    cv.c localc = new com/google/android/gms/b/cv$c;
    localc.<init>(this, paramString, paramURL, paramArrayOfByte, null, parama);
    localdb.b(localc);
  }
  
  public final boolean x()
  {
    J();
    Object localObject1 = (ConnectivityManager)super.n().getSystemService("connectivity");
    try
    {
      localObject1 = ((ConnectivityManager)localObject1).getActiveNetworkInfo();
    }
    catch (SecurityException localSecurityException)
    {
      for (;;)
      {
        boolean bool = false;
        Object localObject2 = null;
        continue;
        bool = false;
        localObject2 = null;
      }
    }
    if (localObject1 != null)
    {
      bool = ((NetworkInfo)localObject1).isConnected();
      if (bool)
      {
        bool = true;
        return bool;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/cv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */