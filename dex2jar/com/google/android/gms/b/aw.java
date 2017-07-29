package com.google.android.gms.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.http.AndroidHttpClient;
import android.os.Build.VERSION;
import java.io.File;

public final class aw
{
  public static qd a(Context paramContext)
  {
    File localFile = new File(paramContext.getCacheDir(), "volley");
    String str1 = "volley/0";
    try
    {
      String str2 = paramContext.getPackageName();
      paramContext = paramContext.getPackageManager().getPackageInfo(str2, 0);
      paramContext = str2 + "/" + versionCode;
      if (Build.VERSION.SDK_INT >= 9) {}
      for (paramContext = new b();; paramContext = new vw(AndroidHttpClient.newInstance(paramContext)))
      {
        paramContext = new vt(paramContext);
        paramContext = new qd(new vv(localFile, (byte)0), paramContext, (byte)0);
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


/* Location:              com/google/android/gms/b/aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */