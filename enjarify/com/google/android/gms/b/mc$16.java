package com.google.android.gms.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

final class mc$16
  implements md
{
  public final void a(vc paramvc, Map paramMap)
  {
    int i = 1;
    Object localObject1 = (String)paramMap.get("urls");
    int j = TextUtils.isEmpty((CharSequence)localObject1);
    if (j != 0)
    {
      localObject1 = "URLs missing in canOpenURLs GMSG.";
      tp.e((String)localObject1);
    }
    for (;;)
    {
      return;
      String[] arrayOfString = ((String)localObject1).split(",");
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      localObject1 = paramvc.getContext();
      PackageManager localPackageManager = ((Context)localObject1).getPackageManager();
      int k = arrayOfString.length;
      j = 0;
      if (j < k)
      {
        String str = arrayOfString[j];
        int m = 2;
        localObject1 = str.split(";", m);
        Object localObject2 = localObject1[0].trim();
        int n = localObject1.length;
        label136:
        int i1;
        if (n > i)
        {
          localObject1 = localObject1[i].trim();
          localObject2 = Uri.parse((String)localObject2);
          Intent localIntent = new android/content/Intent;
          localIntent.<init>((String)localObject1, (Uri)localObject2);
          i1 = 65536;
          localObject1 = localPackageManager.resolveActivity(localIntent, i1);
          if (localObject1 == null) {
            break label217;
          }
          i1 = i;
        }
        for (;;)
        {
          localObject1 = Boolean.valueOf(i1);
          localHashMap.put(str, localObject1);
          int i2 = j + 1;
          j = i2;
          break;
          localObject1 = "android.intent.action.VIEW";
          break label136;
          label217:
          i2 = 0;
          localObject1 = null;
        }
      }
      localObject1 = "openableURLs";
      paramvc.a((String)localObject1, localHashMap);
    }
  }
}


/* Location:              com/google/android/gms/b/mc$16.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */