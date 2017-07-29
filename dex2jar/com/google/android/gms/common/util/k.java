package com.google.android.gms.common.util;

import java.util.regex.Pattern;

public final class k
{
  private static final Pattern a = Pattern.compile("\\$\\{(.*?)\\}");
  
  public static boolean a(String paramString)
  {
    return (paramString == null) || (paramString.trim().isEmpty());
  }
}


/* Location:              com/google/android/gms/common/util/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */