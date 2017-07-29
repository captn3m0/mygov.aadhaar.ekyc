package com.a.a.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.http.AndroidHttpClient;
import android.os.Build.VERSION;
import com.a.a.b;
import com.a.a.m;
import java.io.File;
import org.apache.http.client.HttpClient;

public final class l
{
  public static m a(Context paramContext)
  {
    File localFile = new java/io/File;
    Object localObject1 = paramContext.getCacheDir();
    Object localObject2 = "volley";
    localFile.<init>((File)localObject1, (String)localObject2);
    localObject1 = "volley/0";
    try
    {
      localObject2 = paramContext.getPackageName();
      localObject3 = paramContext.getPackageManager();
      Object localObject4 = null;
      localObject3 = ((PackageManager)localObject3).getPackageInfo((String)localObject2, 0);
      localObject2 = String.valueOf(localObject2);
      localObject2 = String.valueOf(localObject2);
      i = versionCode;
      localObject4 = new java/lang/StringBuilder;
      int j = ((String)localObject2).length() + 12;
      ((StringBuilder)localObject4).<init>(j);
      localObject2 = ((StringBuilder)localObject4).append((String)localObject2);
      localObject4 = "/";
      localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
      localObject2 = ((StringBuilder)localObject2).append(i);
      localObject1 = ((StringBuilder)localObject2).toString();
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Object localObject3;
      int i;
      int k;
      for (;;) {}
    }
    k = Build.VERSION.SDK_INT;
    i = 9;
    if (k >= i)
    {
      localObject1 = new com/a/a/a/g;
      ((g)localObject1).<init>();
    }
    for (;;)
    {
      localObject2 = new com/a/a/a/a;
      ((a)localObject2).<init>((f)localObject1);
      localObject1 = new com/a/a/m;
      localObject3 = new com/a/a/a/c;
      ((c)localObject3).<init>(localFile, (byte)0);
      ((m)localObject1).<init>((b)localObject3, (com.a.a.f)localObject2, (byte)0);
      ((m)localObject1).a();
      return (m)localObject1;
      localObject2 = new com/a/a/a/d;
      localObject1 = AndroidHttpClient.newInstance((String)localObject1);
      ((d)localObject2).<init>((HttpClient)localObject1);
      localObject1 = localObject2;
    }
  }
}


/* Location:              com/a/a/a/l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */