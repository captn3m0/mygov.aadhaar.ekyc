package com.google.android.gms.b;

import org.json.JSONException;
import org.json.JSONObject;

final class qa$1
  extends pz.a
{
  qa$1(qa paramqa, String paramString, qa.b paramb, up paramup) {}
  
  public final void a()
  {
    c.b(null);
  }
  
  public final void a(nk paramnk)
  {
    Object localObject1 = new com/google/android/gms/b/qa$1$1;
    ((qa.1.1)localObject1).<init>(this, paramnk);
    b.a = ((md)localObject1);
    Object localObject2 = "/nativeAdPreProcess";
    paramnk.a((String)localObject2, (md)localObject1);
    try
    {
      localObject1 = new org/json/JSONObject;
      localObject2 = d;
      localObject2 = qa.a((qa)localObject2);
      localObject2 = b;
      localObject2 = c;
      ((JSONObject)localObject1).<init>((String)localObject2);
      localObject2 = "ads_id";
      String str = a;
      ((JSONObject)localObject1).put((String)localObject2, str);
      localObject2 = "google.afma.nativeAds.preProcessJsonGmsg";
      paramnk.a((String)localObject2, (JSONObject)localObject1);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        tp.c("Exception occurred while invoking javascript", localJSONException);
        up localup = c;
        localObject2 = null;
        localup.b(null);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/qa$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */