package com.google.android.gms.b;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@qi
public final class mi
  implements md
{
  final HashMap<String, up<JSONObject>> a = new HashMap();
  
  public final void a(vc paramvc, Map<String, String> paramMap)
  {
    paramvc = (String)paramMap.get("request_id");
    String str = (String)paramMap.get("fetched_ad");
    tp.b("Received ad from the cache.");
    paramMap = (up)a.get(paramvc);
    if (paramMap == null)
    {
      tp.c("Could not find the ad request for the corresponding ad response.");
      return;
    }
    try
    {
      paramMap.b(new JSONObject(str));
      return;
    }
    catch (JSONException localJSONException)
    {
      tp.b("Failed constructing JSON object from value passed from javascript", localJSONException);
      paramMap.b(null);
      return;
    }
    finally
    {
      a.remove(paramvc);
    }
  }
  
  public final void a(String paramString)
  {
    up localup = (up)a.get(paramString);
    if (localup == null)
    {
      tp.c("Could not find the ad request for the corresponding ad response.");
      return;
    }
    if (!localup.isDone()) {
      localup.cancel(true);
    }
    a.remove(paramString);
  }
}


/* Location:              com/google/android/gms/b/mi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */