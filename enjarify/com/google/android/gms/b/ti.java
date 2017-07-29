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

public final class ti
{
  public final long a;
  public final Map b;
  public String c;
  public String d;
  public boolean e;
  private final List f;
  
  public ti(String paramString, long paramLong)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    f = ((List)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    b = ((Map)localObject);
    e = false;
    d = paramString;
    a = paramLong;
    a(paramString);
  }
  
  private void a(String paramString)
  {
    int i = 1;
    int j = 0;
    String str1 = null;
    boolean bool1 = TextUtils.isEmpty(paramString);
    if (bool1) {}
    Object localObject1;
    int m;
    do
    {
      do
      {
        for (;;)
        {
          return;
          try
          {
            localObject1 = new org/json/JSONObject;
            ((JSONObject)localObject1).<init>(paramString);
            localObject2 = "status";
            int k = -1;
            m = ((JSONObject)localObject1).optInt((String)localObject2, k);
            if (m == i) {
              break;
            }
            j = 0;
            str1 = null;
            e = false;
            str1 = "App settings could not be fetched successfully.";
            tp.e(str1);
          }
          catch (JSONException localJSONException)
          {
            tp.c("Exception occurred while processing app setting json", localJSONException);
            localObject1 = w.i();
            localObject2 = "AppSettings.parseAppSettingsJson";
            ((tj)localObject1).a(localJSONException, (String)localObject2);
          }
        }
        m = 1;
        e = m;
        localObject2 = "app_id";
        localObject2 = ((JSONObject)localObject1).optString((String)localObject2);
        c = ((String)localObject2);
        localObject2 = "ad_unit_id_settings";
        localObject1 = ((JSONObject)localObject1).optJSONArray((String)localObject2);
      } while (localObject1 == null);
      m = ((JSONArray)localObject1).length();
    } while (j >= m);
    Object localObject2 = ((JSONArray)localObject1).getJSONObject(j);
    Object localObject3 = "format";
    localObject3 = ((JSONObject)localObject2).optString((String)localObject3);
    String str2 = "ad_unit_id";
    str2 = ((JSONObject)localObject2).optString(str2);
    boolean bool3 = TextUtils.isEmpty((CharSequence)localObject3);
    if (!bool3)
    {
      bool3 = TextUtils.isEmpty(str2);
      if (!bool3) {
        break label230;
      }
    }
    for (;;)
    {
      j += 1;
      break;
      label230:
      String str3 = "interstitial";
      bool3 = str3.equalsIgnoreCase((String)localObject3);
      if (bool3)
      {
        localObject2 = f;
        ((List)localObject2).add(str2);
      }
      else
      {
        str3 = "rewarded";
        boolean bool2 = str3.equalsIgnoreCase((String)localObject3);
        if (bool2)
        {
          localObject3 = "mediation_config";
          localObject2 = ((JSONObject)localObject2).optJSONObject((String)localObject3);
          if (localObject2 != null)
          {
            localObject3 = new com/google/android/gms/b/ns;
            ((ns)localObject3).<init>((JSONObject)localObject2);
            localObject2 = b;
            ((Map)localObject2).put(str2, localObject3);
          }
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/b/ti.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */