package com.a.a.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.http.AndroidHttpClient;
import android.os.Build.VERSION;
import com.a.a.m;
import java.io.File;

public final class l
{
  public static m a(Context paramContext)
  {
    File localFile = new File(paramContext.getCacheDir(), "volley");
    String str1 = "volley/0";
    try
    {
      String str2 = paramContext.getPackageName();
      paramContext = paramContext.getPackageManager().getPackageInfo(str2, 0);
      str2 = String.valueOf(String.valueOf(str2));
      int i = versionCode;
      paramContext = str2.length() + 12 + str2 + "/" + i;
      if (Build.VERSION.SDK_INT >= 9) {}
      for (paramContext = new g();; paramContext = new d(AndroidHttpClient.newInstance(paramContext)))
      {
        paramContext = new a(paramContext);
        paramContext = new m(new c(localFile, (byte)0), paramContext, (byte)0);
        paramContext.a();
        return paramContext;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        paramContext = str1;
      }
    }
  }
}


/* Location:              com/a/a/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */