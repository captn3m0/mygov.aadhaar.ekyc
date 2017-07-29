package com.google.android.gms.b;

import java.util.HashMap;
import java.util.Map;

final class ms$1
  implements Runnable
{
  ms$1(ms paramms, String paramString1, String paramString2, int paramInt1, int paramInt2) {}
  
  public final void run()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    localHashMap.put("event", "precacheProgress");
    String str1 = a;
    localHashMap.put("src", str1);
    str1 = b;
    localHashMap.put("cachedSrc", str1);
    str1 = Integer.toString(c);
    localHashMap.put("bytesLoaded", str1);
    String str2 = "totalBytes";
    int i = d;
    str1 = Integer.toString(i);
    localHashMap.put(str2, str1);
    str1 = "cacheReady";
    boolean bool = e;
    if (bool) {}
    for (str2 = "1";; str2 = "0")
    {
      localHashMap.put(str1, str2);
      ms.a(f, "onPrecacheEvent", localHashMap);
      return;
    }
  }
}


/* Location:              com/google/android/gms/b/ms$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */