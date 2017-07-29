package com.google.android.gms.b;

import java.util.Map;

@qi
public final class ou
{
  final vc a;
  final boolean b;
  final String c;
  
  public ou(vc paramvc, Map<String, String> paramMap)
  {
    a = paramvc;
    c = ((String)paramMap.get("forceOrientation"));
    if (paramMap.containsKey("allowOrientationChange"))
    {
      b = Boolean.parseBoolean((String)paramMap.get("allowOrientationChange"));
      return;
    }
    b = true;
  }
}


/* Location:              com/google/android/gms/b/ou.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */