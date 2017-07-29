package com.google.android.gms.b;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class nx
{
  public static List a(JSONObject paramJSONObject, String paramString)
  {
    JSONArray localJSONArray = paramJSONObject.optJSONArray(paramString);
    ArrayList localArrayList;
    int i;
    if (localJSONArray != null)
    {
      localArrayList = new java/util/ArrayList;
      i = localJSONArray.length();
      localArrayList.<init>(i);
      i = 0;
      localList = null;
      for (;;)
      {
        int j = localJSONArray.length();
        if (i >= j) {
          break;
        }
        String str = localJSONArray.getString(i);
        localArrayList.add(str);
        i += 1;
      }
    }
    for (List localList = Collections.unmodifiableList(localArrayList);; localList = null)
    {
      return localList;
      i = 0;
    }
  }
  
  public static void a(Context paramContext, String paramString1, tg paramtg, String paramString2, boolean paramBoolean, List paramList)
  {
    boolean bool1;
    if (paramList != null)
    {
      bool1 = paramList.isEmpty();
      if (!bool1) {}
    }
    else
    {
      return;
    }
    String str1;
    if (paramBoolean) {
      str1 = "1";
    }
    for (String str2 = str1;; str2 = str1)
    {
      Iterator localIterator = paramList.iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        str1 = ((String)localIterator.next()).replaceAll("@gw_adlocid@", paramString2).replaceAll("@gw_adnetrefresh@", str2);
        String str3 = r.h;
        str1 = str1.replaceAll("@gw_qdata@", str3).replaceAll("@gw_sdkver@", paramString1);
        str3 = ib;
        str1 = str1.replaceAll("@gw_sessid@", str3);
        str3 = i;
        str1 = str1.replaceAll("@gw_seqnum@", str3);
        Object localObject = u;
        boolean bool2 = TextUtils.isEmpty((CharSequence)localObject);
        if (!bool2)
        {
          localObject = "@gw_adnetstatus@";
          str3 = u;
          str1 = str1.replaceAll((String)localObject, str3);
        }
        localObject = o;
        if (localObject != null)
        {
          str3 = o.b;
          str1 = str1.replaceAll("@gw_adnetid@", str3);
          localObject = "@gw_allocid@";
          str3 = o.d;
          str1 = str1.replaceAll((String)localObject, str3);
        }
        w.e();
        tt.b(paramContext, paramString1, str1);
      }
      str1 = "0";
    }
  }
}


/* Location:              com/google/android/gms/b/nx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */