package com.google.android.gms.common.util;

import android.os.Build.VERSION;

public final class i
{
  public static boolean a()
  {
    return Build.VERSION.SDK_INT >= 17;
  }
  
  public static boolean b()
  {
    return Build.VERSION.SDK_INT >= 18;
  }
  
  public static boolean c()
  {
    return Build.VERSION.SDK_INT >= 19;
  }
  
  public static boolean d()
  {
    return Build.VERSION.SDK_INT >= 20;
  }
  
  public static boolean e()
  {
    return Build.VERSION.SDK_INT >= 21;
  }
  
  public static boolean f()
  {
    return Build.VERSION.SDK_INT >= 24;
  }
  
  public static boolean g()
  {
    return (Build.VERSION.SDK_INT > 25) || ("O".equals(Build.VERSION.CODENAME)) || (Build.VERSION.CODENAME.startsWith("OMR"));
  }
}


/* Location:              com/google/android/gms/common/util/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */