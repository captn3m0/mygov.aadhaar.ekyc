package com.google.android.gms.common.util;

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
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject1 = "com.google.android.gms";
    boolean bool3 = a(paramContext, paramInt, (String)localObject1);
    if (!bool3) {}
    for (;;)
    {
      return bool2;
      localObject1 = paramContext.getPackageManager();
      Object localObject2 = "com.google.android.gms";
      int j = 64;
      String str;
      try
      {
        localObject1 = ((PackageManager)localObject1).getPackageInfo((String)localObject2, j);
        localObject2 = p.a(paramContext);
        paramContext.getPackageManager();
        if (localObject1 == null) {
          continue;
        }
        boolean bool5 = p.a((PackageInfo)localObject1, false);
        if (!bool5) {
          break label123;
        }
        bool2 = bool1;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        str = "UidVerifier";
        int i = 3;
        bool1 = Log.isLoggable(str, i);
      }
      if (bool1)
      {
        str = "UidVerifier";
        localObject1 = "Package manager can't find google play services package, defaulting to false";
        Log.d(str, (String)localObject1);
        continue;
        label123:
        boolean bool4 = p.a((PackageInfo)localObject1, bool1);
        if (bool4)
        {
          localObject1 = a;
          bool4 = o.c((Context)localObject1);
          if (bool4)
          {
            bool2 = bool1;
          }
          else
          {
            str = "GoogleSignatureVerifier";
            localObject1 = "Test-keys aren't accepted on this build.";
            Log.w(str, (String)localObject1);
          }
        }
      }
    }
  }
  
  public static boolean a(Context paramContext, int paramInt, String paramString)
  {
    return bc.a(paramContext).a(paramInt, paramString);
  }
}


/* Location:              com/google/android/gms/common/util/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */