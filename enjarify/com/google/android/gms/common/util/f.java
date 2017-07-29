package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;

public final class f
{
  public static Boolean a;
  private static Boolean b;
  private static Boolean c;
  
  public static boolean a(Context paramContext)
  {
    boolean bool1 = true;
    boolean bool2 = i.f();
    Object localObject;
    if (bool2)
    {
      bool2 = b(paramContext);
      if (!bool2) {}
    }
    else
    {
      localObject = b;
      if (localObject == null)
      {
        bool2 = i.d();
        if (bool2)
        {
          localObject = paramContext.getPackageManager();
          String str = "android.hardware.type.watch";
          bool2 = ((PackageManager)localObject).hasSystemFeature(str);
          if (bool2)
          {
            bool2 = bool1;
            localObject = Boolean.valueOf(bool2);
            b = (Boolean)localObject;
          }
        }
      }
      else
      {
        localObject = b;
        bool2 = ((Boolean)localObject).booleanValue();
        if (!bool2) {
          break label88;
        }
      }
    }
    for (;;)
    {
      return bool1;
      bool2 = false;
      localObject = null;
      break;
      label88:
      bool1 = false;
    }
  }
  
  public static boolean b(Context paramContext)
  {
    Object localObject = c;
    boolean bool;
    if (localObject == null)
    {
      bool = i.e();
      if (!bool) {
        break label52;
      }
      localObject = paramContext.getPackageManager();
      String str = "cn.google";
      bool = ((PackageManager)localObject).hasSystemFeature(str);
      if (!bool) {
        break label52;
      }
      bool = true;
    }
    for (;;)
    {
      localObject = Boolean.valueOf(bool);
      c = (Boolean)localObject;
      return c.booleanValue();
      label52:
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              com/google/android/gms/common/util/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */