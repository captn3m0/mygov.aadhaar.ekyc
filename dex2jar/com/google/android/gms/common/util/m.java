package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.b.bb;
import com.google.android.gms.b.bc;
import com.google.android.gms.common.o;
import com.google.android.gms.common.p;

public final class m
{
  public static boolean a(Context paramContext, int paramInt)
  {
    if (!a(paramContext, paramInt, "com.google.android.gms")) {}
    Object localObject;
    p localp;
    label70:
    do
    {
      do
      {
        for (;;)
        {
          return false;
          localObject = paramContext.getPackageManager();
          try
          {
            localObject = ((PackageManager)localObject).getPackageInfo("com.google.android.gms", 64);
            localp = p.a(paramContext);
            paramContext.getPackageManager();
            if (localObject != null)
            {
              if (!p.a((PackageInfo)localObject, false)) {
                break label70;
              }
              return true;
            }
          }
          catch (PackageManager.NameNotFoundException paramContext) {}
        }
      } while (!Log.isLoggable("UidVerifier", 3));
      Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
      return false;
    } while (!p.a((PackageInfo)localObject, true));
    if (o.c(a)) {
      return true;
    }
    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
    return false;
  }
  
  @TargetApi(19)
  public static boolean a(Context paramContext, int paramInt, String paramString)
  {
    return bc.a(paramContext).a(paramInt, paramString);
  }
}


/* Location:              com/google/android/gms/common/util/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */