package com.google.android.gms.b;

import java.util.Map;

public final class ou
{
  final vc a;
  final boolean b;
  final String c;
  
  public ou(vc paramvc, Map paramMap)
  {
    a = paramvc;
    String str = (String)paramMap.get("forceOrientation");
    c = str;
    str = "allowOrientationChange";
    boolean bool = paramMap.containsKey(str);
    if (bool)
    {
      str = (String)paramMap.get("allowOrientationChange");
      bool = Boolean.parseBoolean(str);
    }
    for (b = bool;; b = bool)
    {
      return;
      bool = true;
    }
  }
}


/* Location:              com/google/android/gms/b/ou.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */