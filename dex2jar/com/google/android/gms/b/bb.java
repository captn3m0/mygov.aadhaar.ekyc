package com.google.android.gms.b;

import android.annotation.TargetApi;
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
    if (Binder.getCallingUid() == Process.myUid()) {
      return ba.a(a);
    }
    return false;
  }
  
  @TargetApi(19)
  public final boolean a(int paramInt, String paramString)
  {
    boolean bool2 = false;
    if (i.c()) {}
    for (;;)
    {
      try
      {
        ((AppOpsManager)a.getSystemService("appops")).checkPackage(paramInt, paramString);
        bool1 = true;
        return bool1;
      }
      catch (SecurityException paramString) {}
      String[] arrayOfString = a.getPackageManager().getPackagesForUid(paramInt);
      boolean bool1 = bool2;
      if (paramString != null)
      {
        bool1 = bool2;
        if (arrayOfString != null)
        {
          paramInt = 0;
          for (;;)
          {
            bool1 = bool2;
            if (paramInt >= arrayOfString.length) {
              break;
            }
            if (paramString.equals(arrayOfString[paramInt])) {
              return true;
            }
            paramInt += 1;
          }
        }
      }
    }
    return false;
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
    return a.getPackageManager().getApplicationLabel(a.getPackageManager().getApplicationInfo(paramString, 0));
  }
}


/* Location:              com/google/android/gms/b/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */