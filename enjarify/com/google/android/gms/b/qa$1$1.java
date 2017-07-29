package com.google.android.gms.b;

import android.text.TextUtils;
import com.google.android.gms.common.internal.c;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class qa$1$1
  implements md
{
  qa$1$1(qa.1 param1, nk paramnk) {}
  
  public final void a(vc paramvc, Map paramMap)
  {
    Object localObject1 = "success";
    for (;;)
    {
      try
      {
        localObject1 = paramMap.get(localObject1);
        localObject1 = (String)localObject1;
        localObject3 = "failure";
        localObject3 = paramMap.get(localObject3);
        localObject3 = (String)localObject3;
        bool1 = TextUtils.isEmpty((CharSequence)localObject3);
        if (!bool1)
        {
          localObject1 = new org/json/JSONObject;
          ((JSONObject)localObject1).<init>((String)localObject3);
          localObject3 = localObject1;
          bool2 = false;
          localObject1 = null;
          localObject4 = b;
          localObject4 = a;
          str = "ads_id";
          localObject5 = "";
          str = ((JSONObject)localObject3).optString(str, (String)localObject5);
          bool1 = ((String)localObject4).equals(str);
          if (bool1) {
            continue;
          }
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        boolean bool1;
        Object localObject4;
        String str;
        Object localObject5;
        Object localObject3 = "Malformed native JSON response.";
        tp.b((String)localObject3, localJSONException);
        b.d.a(0);
        boolean bool2 = b.d.a();
        localObject3 = "Unable to set the ad state error!";
        c.a(bool2, localObject3);
        Object localObject2 = b.c;
        ((up)localObject2).b(null);
        continue;
        localObject2 = b;
        localObject2 = d;
        int i = 3;
        ((qa)localObject2).a(i);
        localObject2 = b;
        localObject2 = c;
        i = 0;
        localObject3 = null;
        ((up)localObject2).b(null);
        continue;
      }
      localObject3 = new org/json/JSONObject;
      ((JSONObject)localObject3).<init>((String)localObject1);
      bool2 = true;
      continue;
      localObject4 = a;
      str = "/nativeAdPreProcess";
      localObject5 = b;
      localObject5 = b;
      localObject5 = a;
      ((nk)localObject4).b(str, (md)localObject5);
      if (!bool2) {
        continue;
      }
      localObject1 = "ads";
      localObject1 = ((JSONObject)localObject3).optJSONArray((String)localObject1);
      if (localObject1 == null) {
        continue;
      }
      i = ((JSONArray)localObject1).length();
      if (i <= 0) {
        continue;
      }
      localObject3 = b;
      localObject3 = c;
      bool1 = false;
      localObject4 = null;
      localObject1 = ((JSONArray)localObject1).getJSONObject(0);
      ((up)localObject3).b(localObject1);
    }
  }
}


/* Location:              com/google/android/gms/b/qa$1$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */