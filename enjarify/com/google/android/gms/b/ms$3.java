package com.google.android.gms.b;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

final class ms$3
  implements Runnable
{
  ms$3(ms paramms, String paramString1, String paramString2, String paramString3, String paramString4) {}
  
  public final void run()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    localHashMap.put("event", "precacheCanceled");
    String str1 = a;
    localHashMap.put("src", str1);
    String str2 = b;
    boolean bool1 = TextUtils.isEmpty(str2);
    if (!bool1)
    {
      str2 = "cachedSrc";
      str1 = b;
      localHashMap.put(str2, str1);
    }
    String str3 = "type";
    String str4 = c;
    str2 = "internal";
    int i = -1;
    int j = str4.hashCode();
    switch (j)
    {
    default: 
      switch (i)
      {
      }
      break;
    }
    for (;;)
    {
      localHashMap.put(str3, str2);
      str1 = c;
      localHashMap.put("reason", str1);
      str2 = d;
      bool1 = TextUtils.isEmpty(str2);
      if (!bool1)
      {
        str2 = "message";
        str1 = d;
        localHashMap.put(str2, str1);
      }
      ms.a(e, "onPrecacheEvent", localHashMap);
      return;
      String str5 = "error";
      boolean bool2 = str4.equals(str5);
      if (!bool2) {
        break;
      }
      i = 0;
      str1 = null;
      break;
      str5 = "playerFailed";
      bool2 = str4.equals(str5);
      if (!bool2) {
        break;
      }
      i = 1;
      break;
      str5 = "inProgress";
      bool2 = str4.equals(str5);
      if (!bool2) {
        break;
      }
      i = 2;
      break;
      str5 = "contentLengthMissing";
      bool2 = str4.equals(str5);
      if (!bool2) {
        break;
      }
      i = 3;
      break;
      str5 = "noCacheDir";
      bool2 = str4.equals(str5);
      if (!bool2) {
        break;
      }
      i = 4;
      break;
      str5 = "expireFailed";
      bool2 = str4.equals(str5);
      if (!bool2) {
        break;
      }
      i = 5;
      break;
      str5 = "badUrl";
      bool2 = str4.equals(str5);
      if (!bool2) {
        break;
      }
      i = 6;
      break;
      str5 = "downloadTimeout";
      bool2 = str4.equals(str5);
      if (!bool2) {
        break;
      }
      i = 7;
      break;
      str5 = "sizeExceeded";
      bool2 = str4.equals(str5);
      if (!bool2) {
        break;
      }
      i = 8;
      break;
      str5 = "externalAbort";
      bool2 = str4.equals(str5);
      if (!bool2) {
        break;
      }
      i = 9;
      break;
      str2 = "internal";
      continue;
      str2 = "io";
      continue;
      str2 = "network";
      continue;
      str2 = "policy";
    }
  }
}


/* Location:              com/google/android/gms/b/ms$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */