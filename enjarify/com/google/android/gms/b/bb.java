package com.google.android.gms.b;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.i;

public final class bb
{
  protected final Context a;
  
  public bb(Context paramContext)
  {
    a = paramContext;
  }
  
  public final int a(String paramString)
  {
    return a.checkCallingOrSelfPermission(paramString);
  }
  
  public final int a(String paramString1, String paramString2)
  {
    return a.getPackageManager().checkPermission(paramString1, paramString2);
  }
  
  public final ApplicationInfo a(String paramString, int paramInt)
  {
    return a.getPackageManager().getApplicationInfo(paramString, paramInt);
  }
  
  public final boolean a()
  {
    int i = Binder.getCallingUid();
    int j = Process.myUid();
    Context localContext;
    boolean bool;
    if (i == j)
    {
      localContext = a;
      bool = ba.a(localContext);
    }
    for (;;)
    {
      return bool;
      bool = false;
      localContext = null;
    }
  }
  
  public final boolean a(int paramInt, String paramString)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    int i = i.c();
    if (i != 0) {}
    do
    {
      try
      {
        localObject1 = a;
        localObject2 = "appops";
        localObject1 = ((Context)localObject1).getSystemService((String)localObject2);
        localObject1 = (AppOpsManager)localObject1;
        ((AppOpsManager)localObject1).checkPackage(paramInt, paramString);
        bool2 = bool1;
      }
      catch (SecurityException localSecurityException)
      {
        Object localObject1;
        Object localObject2;
        for (;;) {}
      }
      return bool2;
      localObject1 = a.getPackageManager();
      localObject2 = ((PackageManager)localObject1).getPackagesForUid(paramInt);
    } while ((paramString == null) || (localObject2 == null));
    i = 0;
    localObject1 = null;
    for (;;)
    {
      int k = localObject2.length;
      if (i >= k) {
        break;
      }
      Object localObject3 = localObject2[i];
      boolean bool3 = paramString.equals(localObject3);
      if (bool3)
      {
        bool2 = bool1;
        break;
      }
      int j;
      i += 1;
    }
  }
  
  public final String[] a(int paramInt)
  {
    return a.getPackageManager().getPackagesForUid(paramInt);
  }
  
  public final PackageInfo b(String paramString, int paramInt)
  {
    return a.getPackageManager().getPackageInfo(paramString, paramInt);
  }
  
  public final CharSequence b(String paramString)
  {
    PackageManager localPackageManager = a.getPackageManager();
    ApplicationInfo localApplicationInfo = a.getPackageManager().getApplicationInfo(paramString, 0);
    return localPackageManager.getApplicationLabel(localApplicationInfo);
  }
}


/* Location:              com/google/android/gms/b/bb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */