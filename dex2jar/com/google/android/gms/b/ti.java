package com.google.android.gms.b;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@qi
public final class ti
{
  public final long a;
  public final Map<String, ns> b = new HashMap();
  public String c;
  public String d;
  public boolean e = false;
  private final List<String> f = new ArrayList();
  
  public ti(String paramString, long paramLong)
  {
    d = paramString;
    a = paramLong;
    a(paramString);
  }
  
  private void a(String paramString)
  {
    int i = 0;
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return;
      try
      {
        paramString = new JSONObject(paramString);
        if (paramString.optInt("status", -1) != 1)
        {
          e = false;
          tp.e("App settings could not be fetched successfully.");
          return;
        }
      }
      catch (JSONException paramString)
      {
        tp.c("Exception occurred while processing app setting json", paramString);
        w.i().a(paramString, "AppSettings.parseAppSettingsJson");
        return;
      }
      e = true;
      c = paramString.optString("app_id");
      paramString = paramString.optJSONArray("ad_unit_id_settings");
      if (paramString != null) {
        while (i < paramString.length())
        {
          Object localObject = paramString.getJSONObject(i);
          String str2 = ((JSONObject)localObject).optString("format");
          String str1 = ((JSONObject)localObject).optString("ad_unit_id");
          if ((!TextUtils.isEmpty(str2)) && (!TextUtils.isEmpty(str1))) {
            if ("interstitial".equalsIgnoreCase(str2))
            {
              f.add(str1);
            }
            else if ("rewarded".equalsIgnoreCase(str2))
            {
              localObject = ((JSONObject)localObject).optJSONObject("mediation_config");
              if (localObject != null)
              {
                localObject = new ns((JSONObject)localObject);
                b.put(str1, localObject);
              }
            }
          }
          i += 1;
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/b/ti.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */