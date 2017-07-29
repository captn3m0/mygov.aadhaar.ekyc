package com.google.android.gms.b;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class mi
  implements md
{
  final HashMap a;
  
  public mi()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    a = localHashMap;
  }
  
  public final void a(vc paramvc, Map paramMap)
  {
    String str = (String)paramMap.get("request_id");
    Object localObject1 = (String)paramMap.get("fetched_ad");
    tp.b("Received ad from the cache.");
    up localup = (up)a.get(str);
    if (localup == null)
    {
      str = "Could not find the ad request for the corresponding ad response.";
      tp.c(str);
    }
    for (;;)
    {
      return;
      try
      {
        localObject3 = new org/json/JSONObject;
        ((JSONObject)localObject3).<init>((String)localObject1);
        localup.b(localObject3);
        localObject1 = a;
        ((HashMap)localObject1).remove(str);
      }
      catch (JSONException localJSONException)
      {
        Object localObject3 = "Failed constructing JSON object from value passed from javascript";
        tp.b((String)localObject3, localJSONException);
        HashMap localHashMap = null;
        localup.b(null);
        localHashMap = a;
        localHashMap.remove(str);
      }
      finally
      {
        a.remove(str);
      }
    }
  }
  
  public final void a(String paramString)
  {
    Object localObject = (up)a.get(paramString);
    if (localObject == null)
    {
      localObject = "Could not find the ad request for the corresponding ad response.";
      tp.c((String)localObject);
    }
    for (;;)
    {
      return;
      boolean bool = ((up)localObject).isDone();
      if (!bool)
      {
        bool = true;
        ((up)localObject).cancel(bool);
      }
      localObject = a;
      ((HashMap)localObject).remove(paramString);
    }
  }
}


/* Location:              com/google/android/gms/b/mi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */