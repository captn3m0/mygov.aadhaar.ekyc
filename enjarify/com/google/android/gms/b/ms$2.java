package com.google.android.gms.b;

import java.util.HashMap;
import java.util.Map;

final class ms$2
  implements Runnable
{
  ms$2(ms paramms, String paramString1, String paramString2, int paramInt) {}
  
  public final void run()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    localHashMap.put("event", "precacheComplete");
    String str = a;
    localHashMap.put("src", str);
    str = b;
    localHashMap.put("cachedSrc", str);
    str = Integer.toString(c);
    localHashMap.put("totalBytes", str);
    ms.a(d, "onPrecacheEvent", localHashMap);
  }
}


/* Location:              com/google/android/gms/b/ms$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */