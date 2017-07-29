package com.google.android.gms.b;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

final class rm
{
  final List a;
  final String b;
  final String c;
  final String d;
  final boolean e;
  final String f;
  final String g;
  String h;
  int i;
  private final List j;
  private final String k;
  private final boolean l;
  
  public rm(int paramInt, Map paramMap)
  {
    Object localObject = (String)paramMap.get("url");
    h = ((String)localObject);
    localObject = (String)paramMap.get("base_uri");
    b = ((String)localObject);
    localObject = (String)paramMap.get("post_parameters");
    c = ((String)localObject);
    boolean bool = a((String)paramMap.get("drt_include"));
    e = bool;
    bool = a((String)paramMap.get("pan_include"));
    l = bool;
    localObject = (String)paramMap.get("activation_overlay_url");
    k = ((String)localObject);
    localObject = b((String)paramMap.get("check_packages"));
    j = ((List)localObject);
    localObject = (String)paramMap.get("request_id");
    f = ((String)localObject);
    localObject = (String)paramMap.get("type");
    d = ((String)localObject);
    localObject = b((String)paramMap.get("errors"));
    a = ((List)localObject);
    i = paramInt;
    localObject = (String)paramMap.get("fetched_ad");
    g = ((String)localObject);
  }
  
  private static boolean a(String paramString)
  {
    String str;
    boolean bool;
    if (paramString != null)
    {
      str = "1";
      bool = paramString.equals(str);
      if (!bool)
      {
        str = "true";
        bool = paramString.equals(str);
        if (!bool) {}
      }
      else
      {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  private static List b(String paramString)
  {
    if (paramString == null) {}
    for (List localList = null;; localList = Arrays.asList(paramString.split(","))) {
      return localList;
    }
  }
}


/* Location:              com/google/android/gms/b/rm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */