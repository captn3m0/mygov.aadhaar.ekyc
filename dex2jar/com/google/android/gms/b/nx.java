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

@qi
public final class nx
{
  public static List<String> a(JSONObject paramJSONObject, String paramString)
  {
    paramJSONObject = paramJSONObject.optJSONArray(paramString);
    if (paramJSONObject != null)
    {
      paramString = new ArrayList(paramJSONObject.length());
      int i = 0;
      while (i < paramJSONObject.length())
      {
        paramString.add(paramJSONObject.getString(i));
        i += 1;
      }
      return Collections.unmodifiableList(paramString);
    }
    return null;
  }
  
  public static void a(Context paramContext, String paramString1, tg paramtg, String paramString2, boolean paramBoolean, List<String> paramList)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      return;
    }
    if (paramBoolean) {}
    for (String str = "1";; str = "0")
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = ((String)localIterator.next()).replaceAll("@gw_adlocid@", paramString2).replaceAll("@gw_adnetrefresh@", str).replaceAll("@gw_qdata@", r.h).replaceAll("@gw_sdkver@", paramString1).replaceAll("@gw_sessid@", ib).replaceAll("@gw_seqnum@", i);
        paramList = (List<String>)localObject;
        if (!TextUtils.isEmpty(u)) {
          paramList = ((String)localObject).replaceAll("@gw_adnetstatus@", u);
        }
        localObject = paramList;
        if (o != null) {
          localObject = paramList.replaceAll("@gw_adnetid@", o.b).replaceAll("@gw_allocid@", o.d);
        }
        w.e();
        tt.b(paramContext, paramString1, (String)localObject);
      }
      break;
    }
  }
}


/* Location:              com/google/android/gms/b/nx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */