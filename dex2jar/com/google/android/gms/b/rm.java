package com.google.android.gms.b;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@qi
final class rm
{
  final List<String> a;
  final String b;
  final String c;
  final String d;
  final boolean e;
  final String f;
  final String g;
  String h;
  int i;
  private final List<String> j;
  private final String k;
  private final boolean l;
  
  public rm(int paramInt, Map<String, String> paramMap)
  {
    h = ((String)paramMap.get("url"));
    b = ((String)paramMap.get("base_uri"));
    c = ((String)paramMap.get("post_parameters"));
    e = a((String)paramMap.get("drt_include"));
    l = a((String)paramMap.get("pan_include"));
    k = ((String)paramMap.get("activation_overlay_url"));
    j = b((String)paramMap.get("check_packages"));
    f = ((String)paramMap.get("request_id"));
    d = ((String)paramMap.get("type"));
    a = b((String)paramMap.get("errors"));
    i = paramInt;
    g = ((String)paramMap.get("fetched_ad"));
  }
  
  private static boolean a(String paramString)
  {
    return (paramString != null) && ((paramString.equals("1")) || (paramString.equals("true")));
  }
  
  private static List<String> b(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return Arrays.asList(paramString.split(","));
  }
}


/* Location:              com/google/android/gms/b/rm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */