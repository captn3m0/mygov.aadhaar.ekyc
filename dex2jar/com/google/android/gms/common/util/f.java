package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;

public final class f
{
  public static Boolean a;
  private static Boolean b;
  private static Boolean c;
  
  @TargetApi(24)
  public static boolean a(Context paramContext)
  {
    if ((!i.f()) || (b(paramContext)))
    {
      if (b == null) {
        if ((!i.d()) || (!paramContext.getPackageManager().hasSystemFeature("android.hardware.type.watch"))) {
          break label57;
        }
      }
      label57:
      for (boolean bool = true;; bool = false)
      {
        b = Boolean.valueOf(bool);
        if (!b.booleanValue()) {
          break;
        }
        return true;
      }
    }
    return false;
  }
  
  @TargetApi(21)
  public static boolean b(Context paramContext)
  {
    if (c == null) {
      if ((!i.e()) || (!paramContext.getPackageManager().hasSystemFeature("cn.google"))) {
        break label40;
      }
    }
    label40:
    for (boolean bool = true;; bool = false)
    {
      c = Boolean.valueOf(bool);
      return c.booleanValue();
    }
  }
}


/* Location:              com/google/android/gms/common/util/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */