package com.google.android.gms.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.http.AndroidHttpClient;
import android.os.Build.VERSION;
import java.io.File;
import org.apache.http.client.HttpClient;

public final class aw
{
  public static qd a(Context paramContext)
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
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject2 = ((StringBuilder)localObject4).append((String)localObject2);
      localObject4 = "/";
      localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
      i = versionCode;
      localObject2 = ((StringBuilder)localObject2).append(i);
      localObject1 = ((StringBuilder)localObject2).toString();
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Object localObject3;
      int i;
      int j;
      for (;;) {}
    }
    j = Build.VERSION.SDK_INT;
    i = 9;
    if (j >= i)
    {
      localObject1 = new com/google/android/gms/b/b;
      ((b)localObject1).<init>();
    }
    for (;;)
    {
      localObject2 = new com/google/android/gms/b/vt;
      ((vt)localObject2).<init>((vy)localObject1);
      localObject1 = new com/google/android/gms/b/qd;
      localObject3 = new com/google/android/gms/b/vv;
      ((vv)localObject3).<init>(localFile, (byte)0);
      ((qd)localObject1).<init>((dz)localObject3, (ka)localObject2, (byte)0);
      ((qd)localObject1).a();
      return (qd)localObject1;
      localObject2 = new com/google/android/gms/b/vw;
      localObject1 = AndroidHttpClient.newInstance((String)localObject1);
      ((vw)localObject2).<init>((HttpClient)localObject1);
      localObject1 = localObject2;
    }
  }
}


/* Location:              com/google/android/gms/b/aw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */