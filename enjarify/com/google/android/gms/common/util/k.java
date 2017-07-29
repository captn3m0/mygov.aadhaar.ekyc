package com.google.android.gms.common.util;

import java.util.regex.Pattern;

public final class k
{
  private static final Pattern a = Pattern.compile("\\$\\{(.*?)\\}");
  
  public static boolean a(String paramString)
  {
    String str;
    boolean bool;
    if (paramString != null)
    {
      str = paramString.trim();
      bool = str.isEmpty();
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
}


/* Location:              com/google/android/gms/common/util/k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */