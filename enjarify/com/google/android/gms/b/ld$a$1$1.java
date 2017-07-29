package com.google.android.gms.b;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class ld$a$1$1
  implements vd.a
{
  ld$a$1$1(ld.a.1 param1, Map paramMap) {}
  
  public final void a(vc paramvc, boolean paramBoolean)
  {
    Object localObject1 = b.b;
    Object localObject2 = (String)a.get("id");
    b = ((String)localObject2);
    localObject2 = new org/json/JSONObject;
    ((JSONObject)localObject2).<init>();
    localObject1 = "messageType";
    Object localObject3 = "htmlLoaded";
    try
    {
      ((JSONObject)localObject2).put((String)localObject1, localObject3);
      localObject1 = "id";
      localObject3 = b;
      localObject3 = b;
      localObject3 = b;
      ((JSONObject)localObject2).put((String)localObject1, localObject3);
      localObject1 = b;
      localObject1 = a;
      localObject3 = "sendMessageToNativeJs";
      ((nk)localObject1).b((String)localObject3, (JSONObject)localObject2);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        localObject1 = "Unable to dispatch sendMessageToNativeJs event";
        tp.b((String)localObject1, localJSONException);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/ld$a$1$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */